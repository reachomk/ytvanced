package defpackage;

import android.text.TextUtils;

/* renamed from: aiwu */
public final class aiwu implements aixk {
    public final aizm a;
    private final bctz b;
    private final bctz c;
    private final aiyx d;
    private final airt e;
    private final aizp f;
    private final bdfu g;
    private final aixn h;
    private final aiwy i;

    public aiwu(bctz bctz, bctz bctz2, aiyx aiyx, airt airt, aixn aixn, aizm aizm, aiwy aiwy) {
        this.b = bctz;
        this.c = bctz2;
        this.d = aiyx;
        this.e = (airt) amqw.a((Object) airt);
        this.h = aixn;
        this.a = (aizm) amqw.a((Object) aizm);
        if (aiwy == null) {
            aiwy = aiwy.c().a();
        }
        this.i = aiwy;
        this.g = new bdfu();
        this.f = new aiwx(this);
    }

    public final void a() {
        this.g.a(this.b.a(new aiww(this)));
        this.g.a(this.c.a(new aiwz(this)));
        this.e.a();
        g();
        bcud d = this.d.d();
        aiqq aiqq = this.h.k;
        d.e_(new ainy(aiqq != null ? aiqq.c() : null));
        this.a.a(this.f);
    }

    public final void b() {
        a(1);
    }

    public final void c() {
        this.d.a().e_(new ahkd());
        this.d.g().e_(ahkf.a);
        this.e.b();
        this.g.b();
        this.a.b(this.f);
        this.a.bE_();
    }

    public final void d() {
        a(6);
    }

    public final boolean a(aizl aizl) {
        return d(aizl) == 2;
    }

    public final aiwy e() {
        return this.i;
    }

    public final boolean a(aiqq aiqq) {
        return this.a.b(aiqq);
    }

    public final aizl b(aiqq aiqq) {
        return this.a.a(aiqq);
    }

    public final void b(aizl aizl) {
        a(aizl.e.g);
        aiqq aiqq = aizl.f;
        if (aiqq != null) {
            String c = aiqq.c();
            String h = this.e.h();
            if ((!TextUtils.isEmpty(c) || !TextUtils.isEmpty(h)) && !TextUtils.equals(c, h)) {
                this.d.d().e_(new ainy(c));
            }
        }
    }

    public final aiqq c(aizl aizl) {
        if (a(aizl)) {
            aiqq a = this.a.a(aizl);
            this.a.a(aizl, a);
            a.a(aizl.f);
            return a;
        }
        String valueOf = String.valueOf(aizl.e);
        String a2 = airg.a(j());
        valueOf.length();
        String.valueOf(a2).length();
        return null;
    }

    public final void a(boolean z) {
        aizm aizm = this.a;
        if (aizm instanceof aizi) {
            ((aizi) aizm).o_(z);
        }
    }

    public final void b(boolean z) {
        aizm aizm = this.a;
        if (aizm instanceof aizo) {
            ((aizo) aizm).b(z);
        }
    }

    public final void c(boolean z) {
        this.a.a(z);
    }

    public final aiqq f() {
        return this.h.k;
    }

    /* Access modifiers changed, original: protected|final */
    public final void g() {
        bcud c = this.d.c();
        boolean a = a(aizl.b);
        boolean a2 = a(aizl.a);
        aizm aizm = this.a;
        if (aizm instanceof aizi) {
            ((aizi) aizm).a();
        }
        aizm = this.a;
        if (aizm instanceof aizo) {
            ((aizo) aizm).d();
        }
        aizm = this.a;
        boolean z = false;
        boolean z2 = (aizm instanceof aizi) && ((aizi) aizm).b();
        aizm aizm2 = this.a;
        if ((aizm2 instanceof aizo) && ((aizo) aizm2).e()) {
            z = true;
        }
        c.e_(new ahkc(a, a2, z2, z));
    }

    public final void h() {
        g();
    }

    public final /* synthetic */ aizx i() {
        aakj aakj = this.h.l;
        aafv aafv = this.h.m;
        aixn aixn = this.h;
        return new aizs(aakj, aafv, aixn.j, aixn.k, aixn.n, this.a.c());
    }

    public final int d(aizl aizl) {
        return this.a.b(aizl);
    }

    public final int j() {
        return this.h.o;
    }

    private final void a(int i) {
        int[] iArr = new int[]{2, 3, 4, 5};
        if (i != 0) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == iArr[i2]) {
                    this.d.i().e_(new ahju());
                    break;
                }
            }
            this.d.e().e_(new aiob(i));
            return;
        }
        throw null;
    }
}
