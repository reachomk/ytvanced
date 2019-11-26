package defpackage;

/* renamed from: jtq */
public final class jtq {
    public final fgc a;
    public final jvz b;
    public final fgt c = new jtt(this);
    public final eby d;
    public ffx e;
    public boolean f;
    public ffu g;

    public jtq(fgc fgc, jvz jvz, eby eby) {
        this.a = fgc;
        this.b = jvz;
        this.d = eby;
    }

    public final foq a() {
        if (!this.f) {
            jvz jvz = this.b;
            if (jvz.i) {
                for (jwd jwd : jvz.d) {
                    if (jwd.a.d()) {
                    }
                }
            }
            return null;
        }
        return b();
    }

    public final foq b() {
        ffu ffu = this.g;
        return (ffu == null || ffu.b() == null) ? null : (foq) this.g.b;
    }
}
