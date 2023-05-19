package ai.quarta;

public class Film {
    private String tconst;
    private String titleType;
    private String primaryTitle;
    private String originalTitle;
    private boolean isAdult;
    private String startYear;
    private String endYear;
    private int runtimeMinutes = 0;
    private String genres;

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getStartYear() {
        return startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public String getGenres() {
        return genres;
    }
}
