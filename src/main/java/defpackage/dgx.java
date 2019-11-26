package defpackage;

import com.google.ads.mediation.AbstractAdViewAdapter;

/* renamed from: dgx */
public final class dgx extends pbc implements pcm, pco, pcp, pcq, pcu {
    private final AbstractAdViewAdapter a;
    private final pdl b;

    public dgx(AbstractAdViewAdapter abstractAdViewAdapter, pdl pdl) {
        this.a = abstractAdViewAdapter;
        this.b = pdl;
    }

    public final void a() {
    }

    public final void a(int i) {
        this.b.c(i);
    }

    public final void b() {
        this.b.k();
    }

    public final void c() {
        this.b.l();
    }

    public final void d() {
        this.b.m();
    }

    public final void e() {
        this.b.n();
    }

    public final void f() {
        this.b.o();
    }

    public final void a(pcj pcj) {
        this.b.a(this.a, new dgu(pcj));
    }

    public final void a(pcr pcr) {
        this.b.a(this.a, new dgw(pcr));
    }

    public final void a(pcl pcl) {
        this.b.a(this.a, new dgt(pcl));
    }

    public final void a(pcn pcn) {
        this.b.a(pcn);
    }

    public final void a(pcn pcn, String str) {
        this.b.a(pcn, str);
    }
}
