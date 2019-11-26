package defpackage;

/* renamed from: wbp */
public final class wbp extends wao {
    private final vuh a;
    private final vqy b;
    private boolean c;

    public wbp(vrk vrk, vuh vuh, vqy vqy) {
        amqw.a((Object) vrk);
        this.a = (vuh) amqw.a((Object) vuh);
        this.b = (vqy) amqw.a((Object) vqy);
    }

    public final void a() {
        if (!this.c) {
            this.a.a(this.b.k());
            this.c = true;
        }
    }

    public final void b() {
        this.a.a(this.b.l());
    }
}
