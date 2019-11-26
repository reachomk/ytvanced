package defpackage;

import java.io.InputStream;

/* renamed from: bazi */
final class bazi extends bbaa {
    private final /* synthetic */ bbhp a;
    private final /* synthetic */ bazg b;

    bazi(bazg bazg, bbhp bbhp) {
        this.b = bazg;
        this.a = bbhp;
        super(bazg.c.e);
    }

    public final void a() {
        bazg bazg = this.b;
        if (bazg.b) {
            bbby.a(this.a);
            return;
        }
        bbia bbia = bazg.c.b;
        bbhx.a();
        while (true) {
            InputStream a;
            try {
                a = this.a.a();
                if (a != null) {
                    bazg bazg2 = this.b;
                    bazg2.a.a(bazg2.c.a.d.a(a));
                    a.close();
                } else {
                    bbia = this.b.c.b;
                    bbhx.b();
                    return;
                }
            } catch (Throwable th) {
                try {
                    bbby.a(this.a);
                    bavx a2 = bavx.c.b(th).a("Failed to read message.");
                    this.b.c.f.b(a2);
                    this.b.a(a2, new baum());
                    return;
                } finally {
                    bbia bbia2 = this.b.c.b;
                    bbhx.b();
                }
            }
        }
    }
}
