package defpackage;

/* renamed from: ajah */
final /* synthetic */ class ajah implements Runnable {
    private final aizy a;
    private final ajmf b;
    private final aiqf c;
    private final aixn d;
    private final ajgn e;

    ajah(aizy aizy, ajmf ajmf, aiqf aiqf, aixn aixn, ajgn ajgn) {
        this.a = aizy;
        this.b = ajmf;
        this.c = aiqf;
        this.d = aixn;
        this.e = ajgn;
    }

    public final void run() {
        aizy aizy = this.a;
        ajmf ajmf = this.b;
        aiqf aiqf = this.c;
        aixn aixn = this.d;
        ajgn ajgn = this.e;
        if (aizy.D() != null) {
            aizy.D().e();
        } else {
            ajmf.a.a(ajmf.b, null);
            ajmf.a.a(ajmf.c, null);
        }
        aiqf.g();
        aiqf.e();
        if (aizy.C()) {
            aizy.f.h();
            aixn.d();
            aizy.h.b();
        }
        ajgn.a.c(new ahke(ajgn.g));
        ajgn.a.d(new ahkh(ajgn.f));
    }
}
