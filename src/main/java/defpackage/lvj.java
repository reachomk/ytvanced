package defpackage;

import android.os.Build.VERSION;

/* renamed from: lvj */
public final class lvj implements ejc, t {
    private final bcaa a;
    private boolean b;

    public lvj(bcaa bcaa) {
        this.a = bcaa;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final boolean f() {
        return lvj.g() && this.b;
    }

    public final void B_() {
        if (lvj.g()) {
            ((eif) this.a.get()).a(this);
        }
    }

    public final void C_() {
        if (lvj.g()) {
            ((eif) this.a.get()).b(this);
        }
    }

    private static boolean g() {
        return VERSION.SDK_INT == 28;
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd2.n()) {
            this.b = true;
        }
    }
}
