package defpackage;

import android.view.View;

/* renamed from: krj */
public final class krj {
    private final kvo a;
    private final kpp b;
    private final View c;
    private acvx d;
    private aphg e;
    private aviq f;

    krj(kvo kvo, kpp kpp, View view) {
        this.a = (kvo) amqw.a((Object) kvo);
        this.b = (kpp) amqw.a((Object) kpp);
        this.c = (View) amqw.a((Object) view);
    }

    public final void a(acvx acvx, aphg aphg, aviq aviq) {
        this.d = (acvx) amqw.a((Object) acvx);
        this.e = aphg;
        this.f = aviq;
        if (this.a.f() && aviq != null) {
            c();
        } else {
            d();
        }
    }

    public final void a() {
        if (this.e != null && !this.a.f() && this.f != null) {
            aphg aphg = this.e;
            if ((aphg.a & 2048) != 0) {
                kvo kvo = this.a;
                apxu apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                kvo.a(apxu);
            }
            this.a.a(true);
            c();
            kvo kvo2 = this.a;
            long j = this.f.e;
            Object obj = kvo2.b;
            if (obj != null && j >= 0) {
                kvo2.m = new kvs(kvo2.l, obj);
                kvo2.k.postDelayed(kvo2.m, j);
            }
        }
    }

    public final void b() {
        this.a.a(false);
        d();
        kvo kvo = this.a;
        kvs kvs = kvo.m;
        if (kvs != null) {
            kvs.a = true;
            kvo.m = null;
        }
    }

    private final void c() {
        this.c.setVisibility(8);
        View view = this.b.c;
        if (view != null) {
            view.setVisibility(0);
        }
        aviq aviq = this.f;
        if (aviq != null) {
            this.b.a(this.d, aviq);
        }
    }

    private final void d() {
        this.c.setVisibility(0);
        View view = this.b.c;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
