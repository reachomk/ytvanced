package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: emh */
public class emh {
    public final aigy a;
    public final ems b;
    public final aihe c;
    public aimt d;

    public emh(aigy aigy, ems ems) {
        Object aihe = new aihe(aigy);
        this.a = (aigy) amqw.a((Object) aigy);
        this.b = (ems) amqw.a((Object) ems);
        this.c = (aihe) amqw.a(aihe);
    }

    public final void a() {
        this.a.m();
        aimt aimt = this.d;
        if (aimt != null) {
            aimt.a(false);
        }
    }

    public void a(aicd aicd) {
        aihe aihe = this.c;
        aihe.o = aicd.q;
        aihe.d = aicd.s;
        aihe.q = aicd.r;
        aihe.s = aicd.t;
        aihe.r = aicd.x;
        aihe.t = aicd.y;
        aihe.a(aicd.z);
        this.a.a(this.c);
        this.b.a(aicd.a(aicd));
        this.b.b(aicd.t);
    }

    public final void b() {
        this.c.g();
        a();
        this.a.a(this.c);
    }

    public void a(long j, long j2, long j3, long j4) {
        aihe aihe = this.c;
        if (aihe.k != j || aihe.l != j2 || aihe.i != j3 || aihe.a() != j4) {
            this.c.a(j, j2, j3, j4);
            this.a.a(this.c);
            this.b.d(this.c.r);
            c();
            d();
        }
    }

    public final void a(boolean z) {
        aihe aihe = this.c;
        if (aihe.e) {
            aihe.e = false;
            boolean z2 = aihe.d;
            aihe.c.cancel();
        }
        this.a.a(this.c);
    }

    public void b(boolean z) {
        this.b.f(z);
    }

    public void c(boolean z) {
        this.b.g(z);
    }

    /* Access modifiers changed, original: protected */
    public void c() {
        ems ems = this.b;
        aihe aihe = this.c;
        ems.c(aicm.a(aihe.k, aihe.i));
    }

    /* Access modifiers changed, original: protected */
    public void d() {
        if (this.c.i > 0) {
            this.b.a(emh.a(this.a.j()), emh.a(this.c.i));
        }
    }

    public static final CharSequence a(long j) {
        return xvd.b(TimeUnit.MILLISECONDS.toSeconds(j + 500));
    }
}
