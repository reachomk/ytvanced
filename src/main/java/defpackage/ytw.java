package defpackage;

/* renamed from: ytw */
final class ytw implements zau {
    private final /* synthetic */ ywk a;
    private final /* synthetic */ String b;
    private final /* synthetic */ ymx c;
    private final /* synthetic */ yts d;

    ytw(yts yts, ywk ywk, String str, ymx ymx) {
        this.d = yts;
        this.a = ywk;
        this.b = str;
        this.c = ymx;
    }

    public final void a() {
        yts yts = this.d;
        ylf ylf = yts.s;
        if (ylf != null && ylf.c) {
            yuh yuh = this.a.h;
            String str = this.b;
            yuh.a.b(yts.h).a(ylf.class).a(new yuy(yuh, str)).c();
        }
    }

    public final void b() {
        if (!yoh.a(this.d.s).isEmpty()) {
            this.c.b(this.d.h);
        }
    }
}
