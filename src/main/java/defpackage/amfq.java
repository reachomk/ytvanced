package defpackage;

/* renamed from: amfq */
public final class amfq {
    public final int a;
    public final Exception b;

    private amfq(int i, Exception exception) {
        this.a = i;
        this.b = exception;
    }

    public static amfq a(int i) {
        return new amfq(i, null);
    }

    public static amfq a(Exception exception) {
        return new amfq(4, exception);
    }
}
