package defpackage;

/* renamed from: uoe */
public final class uoe extends Exception {
    public uoe(String str, Object... objArr) {
        super(String.format(str, objArr));
    }

    public uoe(Throwable th) {
        super(th);
    }
}
