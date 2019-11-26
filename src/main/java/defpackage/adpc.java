package defpackage;

/* renamed from: adpc */
public final class adpc implements xcp {
    public final adpg a = new adpg(this);
    public final adpl b = new adpl(this);
    public final aizy c;
    public final adfq d;
    public final bbb e;
    public final baz f;
    public final adgw g;
    public final adpd h;
    public final xsc i;
    public aebd j;
    public adiu k;
    public final bdfg l = bdfg.h();
    public boolean m;

    public adpc(aizy aizy, adfq adfq, bbb bbb, baz baz, adgw adgw, aebd aebd, xsc xsc) {
        this.c = aizy;
        this.d = adfq;
        this.e = bbb;
        this.f = baz;
        this.g = adgw;
        this.j = aebd;
        this.h = new adpd(this);
        this.i = xsc;
        adit t = adiu.t();
        this.j.a(t);
        this.l.e_(t.a());
        this.l.a(new adpb(this));
        aebd.d.a(new adpe(this));
    }

    public final void a() {
        adit s = this.k.s();
        s.h(0);
        s.a(this.i.a());
        this.l.e_(s.a());
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{adht.class, ahkk.class};
        } else if (i == 0) {
            adht adht = (adht) obj;
            if (adht.a() && adht.a) {
                aebd aebd = this.j;
                aebd.c.a();
                int[] iArr = aebd.a;
                iArr[0] = iArr[0] + 1;
                aebd.c.a(iArr, aebd.b, 2);
                aebd.b();
                return null;
            }
        } else if (i == 1) {
            ahkk ahkk = (ahkk) obj;
            adit s = this.k.s();
            s.e(ahkk.a);
            s.a(this.i.a());
            this.l.e_(s.a());
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
