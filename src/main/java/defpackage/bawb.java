package defpackage;

/* renamed from: bawb */
public final class bawb extends Exception {
    public static final long serialVersionUID = -660954903976144640L;
    public final bavx a;
    private final boolean b = true;

    public bawb(bavx bavx) {
        super(bavx.a(bavx), bavx.o);
        this.a = bavx;
        fillInStackTrace();
    }

    public final synchronized Throwable fillInStackTrace() {
        if (!this.b) {
            return this;
        }
        return super.fillInStackTrace();
    }
}
