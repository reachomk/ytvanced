package defpackage;

/* renamed from: xnx */
enum xnx {
    LEAN_BACK(2, 1, false),
    IMMERSIVE(2, 0, true),
    IMMERSIVE_FLEX(2, 2, true),
    VR(2, 0, true),
    LAYOUT_FULLSCREEN(1, 1, true),
    DEFAULT(0, 1, false);
    
    public final int f;
    public final boolean g;
    public final int h;

    private xnx(int i, int i2, boolean z) {
        this.f = i;
        this.g = z;
        this.h = i2;
    }
}
