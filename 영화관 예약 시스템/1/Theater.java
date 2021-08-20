public class Theater {
    private Seat[][] seats;
    private int rowCount, colCount;

    public Theater(int rowCount, int colCount){
        // 알파벳은 26개만 존재
        if (rowCount > 26) {
            rowCount = 26; // number of alphabets
        }

        //좌석 배열 생성
        seats = new Seat[rowCount][colCount];
        // 각 Seat 인스턴스 생성
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                seats[i][j] = new Seat();
            }
        }
        this.rowCount = rowCount;
        this.colCount = colCount;
    }
    public void printSeatMatrix() { //좌석 정보를 출력
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
}