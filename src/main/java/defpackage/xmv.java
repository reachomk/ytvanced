package defpackage;

/* renamed from: xmv */
public abstract class xmv implements xqc {
    public final boolean a() {
        return e() == 2 || e() == 3;
    }

    public final boolean b() {
        if (e() == 2 || e() == 1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return e() == 0 || e() == 3;
    }

    public final void a(boolean z) {
        a(true, z);
    }

    public final void b(boolean z) {
        a(false, z);
    }
}
