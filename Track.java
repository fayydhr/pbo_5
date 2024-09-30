public class Track {
    private String title;
    private String filePath;

    public Track(String title, String filePath) {
        this.title = title;
        this.filePath = filePath;
    }

    public String getTitle() {
        return title;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return "Track: " + title + " (file: " + filePath + ")";
    }
}
