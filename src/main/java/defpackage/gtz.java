package defpackage;

import android.content.Context;

/* renamed from: gtz */
public final class gtz implements aana {
    public final gvc a;
    private final Context b;
    private final aapn c;
    private final afve d;
    private final zyw e;
    private final bcaa f;
    private final zzl g;
    private final bcaa h;

    public gtz(Context context, aapn aapn, gvc gvc, afve afve, zyw zyw, bcaa bcaa, zzl zzl, bcaa bcaa2) {
        this.b = context;
        this.c = (aapn) amqw.a((Object) aapn);
        this.a = (gvc) amqw.a((Object) gvc);
        this.d = afve;
        this.e = zyw;
        this.f = (bcaa) amqw.a((Object) bcaa);
        this.g = zzl;
        this.h = bcaa2;
    }

    public final aaml a(ajtf ajtf) {
        aaps aaps = (aaps) this.c.a(ajtf);
        haf.a(aaps, this.d, this.b, this.e);
        haf.a(this.f, aaps, this.e);
        haf.a(aaps, this.h, this.g);
        return aaps;
    }

    public final void a(aaml aaml, aand aand, afsw afsw) {
        this.c.a(aaml, aand, new gty(this, afsw));
    }
}
