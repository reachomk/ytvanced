package defpackage;

/* renamed from: bbq */
final class bbq implements bcx {
    public final bct a;
    public boolean b;
    private final /* synthetic */ bbf c;

    public bbq(bbf bbf, Object obj) {
        this.c = bbf;
        this.a = new bcw(bbf.a, obj);
        a();
    }

    public final void a() {
        this.a.a(this.c.e);
    }

    public final void a(int i) {
        if (!this.b) {
            bbs bbs = this.c.k;
            if (bbs != null) {
                bbs.a(i);
            }
        }
    }

    public final void b(int i) {
        if (!this.b) {
            bbs bbs = this.c.k;
            if (bbs != null) {
                bbs.b(i);
            }
        }
    }
}
