package defpackage;

/* renamed from: sxd */
public abstract class sxd {
    public abstract void a(int i, String str, Throwable th);

    public abstract void b(int i, String str, Throwable th);

    public final void a(int i, String str) {
        a(i, str, null);
    }

    public final void b(int i, String str) {
        b(i, str, null);
    }
}
