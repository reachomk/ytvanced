package defpackage;

/* renamed from: afmk */
public enum afmk {
    DESKTOP("desktop"),
    MOBILE("mobile"),
    TV("tv"),
    TABLET("tablet"),
    BLURAY("bluray"),
    STB("stb"),
    GAME_CONSOLE("game_console"),
    UNKNOWN("unknown_platform");
    
    public final String d;

    private afmk(String str) {
        this.d = str;
    }
}
