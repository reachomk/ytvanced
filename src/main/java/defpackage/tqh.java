package defpackage;

/* renamed from: tqh */
public enum tqh {
    START(true, false, 0),
    FIRST_QUARTILE(true, false, 1),
    MIDPOINT(true, false, 2),
    THIRD_QUARTILE(true, false, 3),
    COMPLETE(false, false, 4),
    RESUME(true),
    PAUSE(false),
    SUSPEND(false),
    ABANDON(false, true, -1),
    SKIP(false),
    MUTE,
    UNMUTE,
    VIEWABLE_IMPRESSION(false),
    MEASURABLE_IMPRESSION,
    GROUPM_VIEWABLE_IMPRESSION,
    FULLSCREEN(false),
    EXIT_FULLSCREEN(false);
    
    public final boolean p;
    public final boolean q;
    public final int r;

    private tqh(boolean z) {
        this(r7, r8, z, false, -1);
    }

    private tqh(boolean z, boolean z2, int i) {
        this.p = z;
        this.q = z2;
        this.r = i;
    }

    public final boolean a() {
        return this.r != -1;
    }
}
