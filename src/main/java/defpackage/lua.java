package defpackage;

/* renamed from: lua */
final class lua implements xqf {
    private final /* synthetic */ xqc a;
    private final /* synthetic */ len b;
    private final /* synthetic */ ltx c;

    lua(ltx ltx, xqc xqc, len len) {
        this.c = ltx;
        this.a = xqc;
        this.b = len;
    }

    public final void a(int i, xqc xqc) {
        if (i == 2 || i == 0) {
            xqc.b((xqf) this);
            ltx ltx = this.c;
            ltx.a(ltx.a, false, null);
        }
        if (i == 2 && xqc == this.a) {
            lev a = this.b.b.a();
            if (a != null) {
                a.b.d();
            }
        }
    }
}
