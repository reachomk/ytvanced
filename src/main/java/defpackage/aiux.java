package defpackage;

/* renamed from: aiux */
public final class aiux implements aiva {
    private final atdv a;
    private final wxg b;
    private final /* synthetic */ aiuu c;

    aiux(aiuu aiuu, atdv atdv, wxg wxg) {
        this.c = aiuu;
        this.a = atdv;
        this.b = wxg;
    }

    public final void a() {
        int a = awah.a(this.a.b);
        if (a == 0 || a != 4) {
            a = awah.a(this.a.b);
            if (a != 0 && a == 6) {
                this.c.a = true;
            }
            a = awah.a(this.a.b);
            if (a != 0 && a == 5) {
                this.c.b = true;
            }
            this.c.a(this.a);
            aiuz.a(this.b);
            return;
        }
        this.c.a(this.a, this.b);
    }

    public final void b() {
        aiuz.a(this.b, aiuu.b(this.a));
    }

    public final void c() {
        aiuz.a(this.b, this.c.a(null));
    }
}
