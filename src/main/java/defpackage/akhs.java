package defpackage;

/* renamed from: akhs */
public enum akhs {
    HOME("home_"),
    SEARCH("search_"),
    WATCH("watch_"),
    ENGAGEMENT("engagement_"),
    SUGGESTED_PLAYLIST("suggested_playlist_"),
    OTHERS("others_");
    
    public final String g;

    private akhs(String str) {
        this.g = str;
    }

    public final String toString() {
        return this.g;
    }
}
