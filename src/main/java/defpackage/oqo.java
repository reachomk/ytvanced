package defpackage;

/* renamed from: oqo */
public final class oqo extends oqh {
    private static final ofv a = new ofv();
    private final oqg b;
    private long c;
    private volatile boolean d;

    public oqo(ovi ovi, ovm ovm, nzw nzw, int i, Object obj, oqg oqg) {
        super(ovi, ovm, 2, nzw, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.b = oqg;
    }

    public final void a() {
        this.d = true;
    }

    public final void b() {
        ovm a = this.e.a(this.c);
        ofp ofl;
        try {
            owr owr = this.l;
            ofl = new ofl(owr, a.d, owr.a(a));
            if (this.c == 0) {
                this.b.a(null, -9223372036854775807L, -9223372036854775807L);
            }
            ofm ofm = this.b.a;
            int i = 0;
            while (i == 0) {
                if (this.d) {
                    break;
                }
                i = ofm.a(ofl, a);
            }
            boolean z = true;
            if (i == 1) {
                z = false;
            }
            oxz.b(z);
            this.c = ofl.c - this.e.d;
            ozp.a(this.l);
        } catch (Throwable th) {
            ozp.a(this.l);
        }
    }
}
