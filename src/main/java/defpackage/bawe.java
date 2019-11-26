package defpackage;

/* renamed from: bawe */
public final class bawe extends RuntimeException {
    public static final long serialVersionUID = 1950934672280720624L;
    public final bavx a;
    public final baum b;
    private final boolean c;

    public bawe(bavx bavx) {
        this(bavx, null);
    }

    public bawe(bavx bavx, baum baum) {
        super(bavx.a(bavx), bavx.o);
        this.a = bavx;
        this.b = baum;
        this.c = true;
        fillInStackTrace();
    }

    public final synchronized Throwable fillInStackTrace() {
        if (!this.c) {
            return this;
        }
        return super.fillInStackTrace();
    }
}
