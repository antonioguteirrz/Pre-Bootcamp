package DojoAssignments.JavaFun.HashMap;
import java.util.HashMap;
import java.util.Set;


public class HashMaps {

public void createHashTable(){
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("song title", "This is the lyrics");
        tracklist.put("second song title", "This is the lyrics second song");
        tracklist.put("third song title", "This is the lyrics third song");
        tracklist.put("fourth song title", "This is the lyrics of the fourth song");
    
        Set<String> keys = tracklist.keySet();
        for(String key : keys) {
            System.out.printf("Title: %s\n", key);
            String lyric = tracklist.get(key);
            System.out.printf("Lyrics:%s\n", lyric);  
    }
    String name = tracklist.get("song title");
    System.out.printf("Title:%s",name);}
    
}
