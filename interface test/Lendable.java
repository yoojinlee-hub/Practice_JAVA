import java.util.*;
public interface Lendable {
	Date d = new Date();
	void checkOut(String borrower,Date d);
	void checkIn();
}
