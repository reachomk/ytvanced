package defpackage;

/* renamed from: xiq */
final class xiq extends xio {
    private volatile transient boolean b;
    private volatile transient boolean c;
    private volatile transient xlg d;
    private volatile transient boolean e;

    xiq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, boolean z, xax xax, xgp xgp) {
        super(bcaa, bcaa2, bcaa3, z, xax, xgp);
    }

    public final boolean h() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    this.b = super.h();
                    this.c = true;
                }
            }
        }
        return this.b;
    }

    public final xlg i() {
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    this.d = this.a.c() ? new xlg() : null;
                    this.e = true;
                }
            }
        }
        return this.d;
    }
}
