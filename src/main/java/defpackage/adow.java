package defpackage;

/* renamed from: adow */
public enum adow {
    CAST_TOOLTIP("cast-tooltip", false, acwc.CAST_TOOLTIP),
    CAST_TOOLTIP_REPRESSED("cast-tooltip-repressed", true, acwc.CAST_TOOLTIP_REPRESSED),
    CAST_SNACKBAR("cast-snackbar", false, acwc.CAST_SNACKBAR),
    CAST_SNACKBAR_REPRESSED("cast-snackbar-repressed", true, acwc.CAST_SNACKBAR_REPRESSED),
    CAST_CLING("cast-cling", false, acwc.CAST_CLING),
    CAST_CLING_REPRESSED("cast-cling-repressed", true, acwc.CAST_CLING_REPRESSED);
    
    public final boolean g;
    public final acwc h;
    private final String i;

    private adow(String str, boolean z, acwc acwc) {
        this.i = str;
        this.g = z;
        this.h = acwc;
    }

    public final String toString() {
        return this.i;
    }
}
