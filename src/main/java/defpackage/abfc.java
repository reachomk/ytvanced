package defpackage;

import java.util.Set;

/* renamed from: abfc */
public class abfc extends aanf {
    public final aajx a;
    public final aala b;
    private final abfi g;
    private final xsc h;
    private final String i;
    private final abfd j;
    private final boolean k;
    private final xci l;
    private final aamn m;

    public abfc(aamn aamn, aamd aamd, abfi abfi, afpu afpu, xhf xhf, xsc xsc, String str, aajx aajx, abfd abfd, aala aala, zyw zyw, xci xci) {
        apxn a = zyw.a();
        boolean z = true;
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            if ((auya.b & 256) != 0) {
                auya auya2 = a.i;
                if (auya2 == null) {
                    auya2 = auya.J;
                }
                aovf aovf = auya2.z;
                if (aovf == null) {
                    aovf = aovf.g;
                }
                z = aovf.c;
            }
        }
        super(aamd, afpu, xhf);
        this.g = abfi;
        this.h = (xsc) amqw.a((Object) xsc);
        this.i = xvd.a(str);
        this.a = (aajx) amqw.a((Object) aajx);
        this.j = abfd;
        this.b = aala;
        this.k = z;
        this.l = xci;
        this.m = (aamn) amqw.a((Object) aamn);
    }

    public void a(abfj abfj, afsw afsw, String str, aaje aaje, boolean z) {
        b(abfj, new abfe(this, this.h.b(), str, afsw), str, aaje, z);
    }

    /* Access modifiers changed, original: protected */
    public void b(abfj abfj, afsw afsw, String str, aaje aaje, boolean z) {
        aamk a = this.m.a(abfj, ajxu.class, afsw, abff.a);
        if (z) {
            xak.b();
            a.a();
            try {
                a.c();
            } catch (bpx unused) {
            }
            a.f();
            a.g();
        }
        if (aaje != null) {
            abfd abfd = this.j;
            if (abfd != null) {
                abfd.a(a, aaje, this.e);
                return;
            }
        }
        this.e.b(a);
    }

    public final abfj a() {
        return a(new xfp(this.l, new zzz(), new zzw(), new zzx(), new zzu()));
    }

    public final abfj a(xhs xhs) {
        abfi abfi = this.g;
        abfj abfj = new abfj((aamd) abfi.a(this.c, 1), (afpt) abfi.a(this.d.c(), 2), (xuu) abfi.a((xuu) abfi.a.get(), 3), (Set) abfi.a((Set) abfi.b.get(), 4));
        abfj.j = this.i;
        abfj.h = this.k;
        abfj.n = xhs;
        return abfj;
    }
}
