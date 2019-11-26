package defpackage;

/* renamed from: tqw */
public enum tqw {
    FULL(1.0d),
    THREE_QUARTER(0.75d),
    HALF(0.5d),
    QUARTER(0.25d),
    NONE(0.0d);
    
    public final double f;

    private tqw(double d) {
        this.f = d;
    }
}
