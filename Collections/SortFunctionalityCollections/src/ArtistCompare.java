import java.util.Comparator;

public class ArtistCompare implements Comparator<SongV2> {
    public int compare(SongV2 o1,SongV2 o2){
        return o1.getArtist().compareTo(o2.getArtist());
    }
    /*
    * Reverse Order
    * */
//    public int compare(SongV2 o1,SongV2 o2){
//        return o2.getArtist().compareTo(o1.getArtist());
//    }
}
