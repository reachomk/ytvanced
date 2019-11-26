package defpackage;

/* renamed from: nyy */
public final class nyy extends Exception {
    public final int a;

    public static nyy a(Exception exception) {
        return new nyy(1, exception);
    }

    public static nyy a(RuntimeException runtimeException) {
        return new nyy(2, runtimeException);
    }

    public nyy(int i, Throwable th) {
        super(th);
        this.a = i;
    }
}
