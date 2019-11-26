package defpackage;

/* renamed from: bcvf */
public final class bcvf extends RuntimeException {
    public static final long serialVersionUID = -419289748403337611L;

    public bcvf(String str, Throwable th) {
        super(str, th);
    }

    public bcvf(Throwable th) {
        super(th.getMessage(), th);
    }
}
