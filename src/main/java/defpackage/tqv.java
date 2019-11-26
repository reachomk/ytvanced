package defpackage;

/* renamed from: tqv */
enum tqv {
    VISIBLE_50_PERCENT(1, 0, 0),
    VIEWABLE(0, 1, 1),
    AUDIBLE_MEASURABLE(2, 2, 2),
    AUDIBLE(4, 4, 4),
    FULLSCREEN(8, 8, 8),
    BACKGROUNDED_MEASURABLE(16, 16, 16),
    BACKGROUNDED(32, 32, 32),
    AUDIBLE_AND_VISIBLE_50_PERCENT(64, 0, 0),
    AUDIBLE_AND_VIEWABLE(0, 64, 64),
    COVERAGE_MEASURABLE(128, 128, 128),
    PARTIALLY_VIEWABLE(256, 256, 256),
    GROUPM_DURATION_REACHED(0, 512, 512),
    PMX_VIEWABLE(0, 16777216, 16777216);
    
    public final int m;
    public final int n;
    public final int o;

    private tqv(int i, int i2, int i3) {
        this.m = i;
        this.n = i2;
        this.o = i3;
    }
}
