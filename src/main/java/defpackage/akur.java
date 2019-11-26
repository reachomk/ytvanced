package defpackage;

/* renamed from: akur */
final class akur implements afsw {
    private final /* synthetic */ ajtf a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ akun c;

    akur(akun akun, ajtf ajtf, boolean z) {
        this.c = akun;
        this.a = ajtf;
        this.b = z;
    }

    public final void a(bqn bqn) {
        ajtf ajtf = this.a;
        akun akun = this.c;
        if (ajtf == akun.H) {
            akun.H = null;
            this.c.a(bqn, this.a);
        }
    }
}
