package defpackage;

/* renamed from: ajeq */
public enum ajeq {
    BUFFERING("B"),
    ERROR("ER"),
    ENDED("EN"),
    NOT_STARTED("N"),
    PAUSED("PA"),
    PLAYING("PL"),
    SEEKING("S"),
    NOT_VALID("X"),
    PAUSED_BUFFERING("PB"),
    SUSPENDED("SU");
    
    private final String k;

    private ajeq(String str) {
        this.k = str;
    }

    public final String toString() {
        return this.k;
    }
}
