import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<SongV2> getSongsStrings() {
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("somersault","zero7",147));
        songs.add(new SongV2("cassidy","grateful",158));
        songs.add(new SongV2("cassidy","grateful",158));
        songs.add(new SongV2("$10","hitchhiker",140));
        songs.add(new SongV2("Cassidy","grateful",158));
        songs.add(new SongV2("50 ways","simon",102));
        return songs;
    }
}
