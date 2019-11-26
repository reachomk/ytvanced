package defpackage;

/* renamed from: vsm */
public enum vsm {
    PRE_ROLL(1, "Preroll"),
    MID_ROLL(2, "Midroll"),
    POST_ROLL(3, "Postroll");
    
    public final int d;
    private final String e;

    private vsm(int i, String str) {
        this.d = i;
        this.e = str;
    }

    public final String toString() {
        return this.e;
    }
}
