import java.io.File;
import java.util.ArrayList;

public class TrackReader {
    public ArrayList<Track> readTracks(String folderPath) {
        ArrayList<Track> tracks = new ArrayList<>();
        File folder = new File(folderPath);
        
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                if (file.isFile() && file.getName().endsWith(".mp3")) {
                    String title = file.getName();
                    String filePath = file.getAbsolutePath();
                    tracks.add(new Track(title, filePath));
                }
            }
        } else {
            System.out.println("Folder not found.");
        }
        
        return tracks;
    }
}
