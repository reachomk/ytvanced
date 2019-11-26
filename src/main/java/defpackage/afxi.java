package defpackage;

/* renamed from: afxi */
public final class afxi implements afxf, akxu {
    private final aktq a;
    private final afxe b;
    private boolean c;
    private boolean d;

    public afxi(aktq aktq, afxb afxb) {
        this.a = (aktq) amqw.a((Object) aktq);
        this.b = new afxe(aktq, afxb, this);
    }

    public final void b() {
    }

    public final void a() {
        this.c = true;
        c();
    }

    public final void e() {
        this.c = false;
        d();
    }

    public final void f() {
        this.d = true;
        this.c = false;
        d();
    }

    public final void a(aafn aafn, boolean z) {
        c();
    }

    private final void c() {
        if (this.c) {
            ajtf c = this.a.c(ajti.INVALIDATION);
            if (c != null) {
                this.b.b(c);
            }
        }
    }

    private final void d() {
        this.b.a();
    }

    public final void a(ajtf ajtf, atur atur) {
        if (!this.d) {
            this.a.H_();
        }
    }
}
