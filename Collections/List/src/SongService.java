import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SongService {
        /* Return list of songs object by parsing form the text file.*/
        public List<Song> parseSongs(String path) {
            List<String> songs = new ArrayList<>();
            try {
                Scanner s = new Scanner(new File(path));
                while (s.hasNextLine()){
                    songs.add(s.nextLine());
                }
                s.close();
                return getSongs(songs);
            }catch (FileNotFoundException f) {
                System.out.println("File not found");
            }
            return null;
    }

    public List<Song> getSongs(List<String> songs){
            return songs.stream().map(i -> i.split("/"))
                    .map(arr -> new Song(arr[0],arr[1]))
                    .collect(Collectors.toList());
    }


    public void printSongs(List<Song> songs){
            songs.forEach(song -> System.out.println(song.getSongName()+" "+song.getAuthorName()));
            System.out.println();
    }

    public List<Song> sortSongsByField(SongEnum attr,List<Song> songs){
        switch (attr){
            case NAME: return songs.stream().sorted(Comparator.comparing(Song :: getSongName))
                    .collect(Collectors.toList());
            case AUTHOR: songs.stream().sorted(Comparator.comparing(
                    Song::getAuthorName)).collect(Collectors.toList());
            default : return songs;
        }
    }

}
