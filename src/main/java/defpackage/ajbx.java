package defpackage;

/* renamed from: ajbx */
public final class ajbx implements ahjf {
    private final bcud a;
    private final aize b;
    private final aixn c;
    private final aiws d;
    private ahjc e;

    public ajbx(bcud bcud, aize aize, aixn aixn, aiws aiws) {
        this.a = bcud;
        this.b = aize;
        this.c = aixn;
        this.d = aiws;
    }

    public final void b(ahjc ahjc) {
        if (this.b.a(ahjc) != 2) {
            this.e = ahjc;
            this.c.b(3);
            b();
        }
    }

    public final void a() {
        this.e = null;
    }

    public final void b() {
        ahjc ahjc = this.e;
        if (ahjc != null) {
            a(ahjc);
            ajlj ajlj = this.d.a;
            if (ajlj != null) {
                ahjc ahjc2 = this.e;
                if (ahjc2.h == 4) {
                    ajlj.a(ahjc2);
                }
            }
        }
    }

    public final void a(ahjc ahjc) {
        this.a.e_(ahjc);
    }
}
