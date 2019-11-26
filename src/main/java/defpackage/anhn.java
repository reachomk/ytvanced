package defpackage;

/* renamed from: anhn */
final class anhn {
    public static final anhn a;
    public static final anhn b;
    public final boolean c;
    public final Throwable d;

    anhn(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }

    static {
        if (anhl.b) {
            b = null;
            a = null;
            return;
        }
        b = new anhn(false, null);
        a = new anhn(true, null);
    }
}
