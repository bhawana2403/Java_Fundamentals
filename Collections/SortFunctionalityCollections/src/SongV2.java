import java.util.Objects;

public class SongV2 implements Comparable<SongV2>{
    private String title;
    private String artist;
    private int bpm;

    public SongV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public String toString(){
        return title+" "+artist+" "+bpm;
    }

    @Override
    public int compareTo(SongV2 o) {
        return title.compareTo(o.title);
    }

    /*Return reverse Order*/
//    @Override
//    public int compareTo(SongV2 o) {
//        return o.title.compareTo(title);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongV2 songV2 = (SongV2) o;
        return bpm == songV2.bpm && Objects.equals(title, songV2.title) && Objects.equals(artist, songV2.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, bpm);
    }
}
