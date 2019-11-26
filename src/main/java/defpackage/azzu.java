package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: azzu */
final class azzu implements azzh {
    public final azzs a;
    public final azzy b;
    public bckx c;
    private final String d;
    private final String e;
    private final azyn f;
    private final bciz g;
    private final ExecutorService h;

    azzu(String str, String str2, azyn azyn, bciz bciz, ExecutorService executorService, azzs azzs, azzy azzy) {
        this.d = str;
        this.e = str2;
        this.f = azyn;
        this.g = bciz;
        this.h = executorService;
        this.a = azzs;
        this.b = azzy;
    }

    public final boolean h() {
        return false;
    }

    public final anjv i() {
        return azzg.a();
    }

    public final anjv a() {
        bckw a = this.g.a(this.d, this.a, this.h);
        a.b(this.e);
        azyn azyn = this.f;
        if (azyn != null) {
            for (String str : azyn.a()) {
                for (String b : this.f.a(str)) {
                    a.b(str, b);
                }
            }
        }
        a.b("Content-Type", "application/x-www-form-urlencoded");
        azzy azzy = this.b;
        a.b("Content-Length", String.valueOf(azzy != null ? azzy.c : 0));
        bcks bcks = this.b;
        if (bcks != null) {
            a.b(bcks, this.h);
        }
        this.c = a.d();
        this.h.execute(new azzx(this));
        return this.a.a;
    }

    public final void a(azzk azzk, int i, int i2) {
        amqw.a((Object) azzk);
        this.h.execute(new azzw(this, azzk, i, i2));
    }

    public final azyl g() {
        return this.b.b;
    }

    public final String e() {
        return this.d;
    }

    public final void f() {
        if (this.c != null) {
            this.h.execute(new azzz(this));
        }
    }
}
