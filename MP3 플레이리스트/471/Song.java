public class Song {
    public final String title;
    public final Artist artist;
    public final Album album;
    
    public Song(String title, Artist artist, Album album){
        this.title=title;
        this.artist=artist;
        this.album=album;
    }
    public String toString(){
        return title + " - " + artist.name + "\n" +album.title+"("+album.year+")";
    }
}