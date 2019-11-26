package defpackage;

/* renamed from: adpy */
public enum adpy {
    UNSTARTED(-1),
    ENDED(0),
    PLAYING(1),
    PAUSED(2),
    BUFFERING(3),
    VIDEO_CUED(5),
    AD_UNSTARTED(1080),
    AD_PLAYING(1081),
    AD_SKIPPED(1082),
    AD_ENDED(1083),
    AD_PAUSED(1084),
    AD_BUFFERING(1085),
    ERROR(-1000);
    
    public static final String m = null;
    public final int n;

    private adpy(int i) {
        this.n = i;
    }

    public final boolean a() {
        return this == AD_UNSTARTED || this == AD_PLAYING || this == AD_PAUSED || this == AD_BUFFERING || this == AD_SKIPPED || this == AD_ENDED;
    }

    public final boolean b() {
        return this == PLAYING || this == AD_PLAYING;
    }

    static {
        m = xtl.b("MDX.remote");
    }
}
