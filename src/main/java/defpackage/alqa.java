package defpackage;

import android.net.Uri;

/* renamed from: alqa */
final class alqa extends alqd implements alsy {
    private final int b;
    private final long k;
    private final /* synthetic */ alqb l;

    alqa(alqb alqb, Uri uri, afsw afsw, int i) {
        this.l = alqb;
        super(uri, alqb.c, afsw);
        this.b = i;
        this.k = alqb.e.b();
    }

    public final int p() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final bqm n() {
        return new bqc(this.b, 0, 1.0f);
    }

    public final void b(bqn bqn) {
        acum acum = this.l.d;
        altf altf = new altf();
        altb a = altb.a((alsy) this);
        a.a(!(bqn instanceof bqo) ? 3 : 4);
        a.a(bqn);
        altf.a(a);
        acum.a(altf.a());
        super.b(bqn);
    }

    public final int o() {
        return (int) ((this.l.e.b() - this.k) % 2147483647L);
    }

    public final int q() {
        return this.f.b();
    }
}
