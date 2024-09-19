public class Song {
    private String songName;
    private String authorName;

    public Song(String songName, String authorName) {
        this.songName = songName;
        this.authorName = authorName;
    }

    public String getSongName() {
        return songName;
    }

    public String getAuthorName() {
        return authorName;
    }
}
