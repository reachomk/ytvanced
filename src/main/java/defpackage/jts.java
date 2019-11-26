package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;

/* renamed from: jts */
public final class jts extends flw implements eth {
    public aqkx a;
    public final akoh b;
    public aknh c;
    private final jvf q;
    private final ffx r;
    private final ans t;
    private final fzy u;
    private final ent v = new ent();
    private Parcelable w;
    private boolean x;
    private final jtv y;

    public jts(Context context, akwn akwn, xci xci, xoi xoi, epf epf, jvf jvf, fzy fzy, juy juy, eti eti, akpe akpe, zzl zzl, akei akei, sxd sxd, aket aket, foi foi, akyd akyd, acvx acvx, RecyclerView recyclerView, aana aana, akwb akwb, akxw akxw, akxj akxj, int i, akhs akhs, syb syb) {
        juy juy2 = juy;
        eti eti2 = eti;
        akyd akyd2 = akyd;
        akpe akpe2 = akpe;
        foi foi2 = foi;
        aana aana2 = aana;
        akwb akwb2 = akwb;
        super(akpe2, akwn, xci, xoi, zzl, akei, sxd, aket, akyd.a(akyd), foi2, recyclerView, aana2, akwb2, acvx, (akpb) epf.get(), akxw, akxj, i, akhs, syb);
        amqw.a((Object) context);
        this.q = (jvf) amqw.a((Object) jvf);
        this.t = new eyy(context);
        RecyclerView recyclerView2 = recyclerView;
        recyclerView2.a(this.t);
        ent ent = this.v;
        recyclerView2.o = ent;
        akyd akyd3 = akyd;
        if (akyd3 instanceof jtu) {
            this.w = ((jtu) akyd3).a;
        }
        recyclerView2 = this.o;
        akpd akpd = (akpd) this.e;
        juy juy3 = juy;
        this.r = new juv((zyw) juy.a((zyw) juy3.a.get(), 1), (fhk) juy.a((fhk) juy3.b.get(), 2), (jtw) juy.a((jtw) juy3.c.get(), 3), (fga) juy.a((fga) juy3.d.get(), 4), (jty) juy.a((jty) juy3.e.get(), 5), (xci) juy.a((xci) juy3.f.get(), 6), (fgc) juy.a((fgc) juy3.g.get(), 7), (xpt) juy.a((xpt) juy3.h.get(), 8), (RecyclerView) juy.a(recyclerView2, 9), (akpd) juy.a(akpd, 10), (aknh) juy.a(this.d, 11), (ent) juy.a(ent, 12));
        this.u = fzy;
        eti eti3 = eti;
        this.y = new jtv(eti3.b);
        eti3.a(this);
        this.b = new akoh();
        this.b.a(this.y);
        this.x = true;
        super.b((aknh) this.b);
    }

    public final void d() {
        super.d();
        if (this.x) {
            Parcelable parcelable = this.w;
            if (parcelable != null) {
                this.t.a(parcelable);
                this.w = null;
            }
            this.q.c(this.r);
            this.u.a(this.o, this.v);
            this.x = false;
        }
    }

    public final void e() {
        super.e();
        this.x = true;
    }

    public final void c() {
        super.c();
        this.q.b(this.r);
        this.u.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akab akab) {
        aqkx aqkx;
        super.a(akab);
        axev axev = akab.g;
        if (axev == null) {
            aqkx = null;
        } else {
            aqkx = axev.b;
            if (aqkx == null) {
                aqkx = aqkx.g;
            }
        }
        this.a = aqkx;
    }

    public final void f() {
        super.f();
        this.a = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void ao_() {
        if (!this.r.b()) {
            super.ao_();
        }
    }

    public final boolean h() {
        return this.r.b();
    }

    public final akyd E_() {
        return new jtu(super.E_(), this.t.j());
    }

    public final void a(int i) {
        this.y.b(i);
    }
}
