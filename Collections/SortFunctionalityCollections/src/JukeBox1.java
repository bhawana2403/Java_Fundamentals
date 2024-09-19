
import java.util.*;

public class JukeBox1 {
    public static void main(String[] args){
        new JukeBox1().go();
    }
    public void go(){
        List<SongV2> songList = MockSongs.getSongsStrings();
        System.out.println(songList);
        System.out.println("Sort By Ascending");
        ascendingSort(songList);
        System.out.println(songList);
        System.out.println("Sort By Title Descending");
        descendingSort(songList);
        System.out.println(songList);
        System.out.println("Sort By Artist");
        sortUsingComparatorByArtist(songList);
        System.out.println(songList);
        sortUsingComparatorByTitle(songList);
        System.out.println("Sort By Title Using Comparator");
        System.out.println(songList);
        System.out.println("Sort By Bpm Using Comparator");
        sortUsingComparatorByBpm(songList);
        System.out.println(songList);
        System.out.println("Sort title descending");
        sortUsingComparatorByTitleDescending(songList);
        System.out.println(songList);
        System.out.println("Removed duplicates");
        Set<SongV2> set = removeDuplicates(songList);
        System.out.println(set);
    }

    public Set<SongV2> removeDuplicates(List<SongV2> songV2List){
        return new HashSet<>(songV2List);

    }
    public void ascendingSort(List<SongV2> songList){
        Collections.sort(songList);
    }
    public void descendingSort(List<SongV2> songV2List){
        /* List and Comparator Params are provided */
        songV2List.sort(Collections.reverseOrder());
    }
    public void sortUsingComparatorByArtist(List<SongV2> songV2List){
        ArtistCompare artistCompare = new ArtistCompare();
        songV2List.sort(artistCompare);
    }
    public void sortUsingComparatorByTitle(List<SongV2> songV2List){
        songV2List.sort(
                new Comparator<SongV2>() {
                    @Override
                    public int compare(SongV2 o1, SongV2 o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }
                }
        );
    }

    public void sortUsingComparatorByBpm(List<SongV2> songV2List){
        songV2List.sort((o1,o2) -> Integer.compare(o1.getBpm(),o2.getBpm()));
    }
    public void sortUsingComparatorByTitleDescending(List<SongV2> songV2List){
        songV2List.sort((o1,o2) -> o2.getTitle().compareTo(o1.getTitle()));
    }
}
