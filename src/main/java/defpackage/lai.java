package defpackage;

import com.google.protos.youtube.api.innertube.CreationEntryEndpointOuterClass$CreationEntryEndpoint;

/* renamed from: lai */
public abstract class lai extends kzo {
    public final jpp e;
    public final acvx f;
    private final aaff g;
    private final jpy h;
    private final jpf i;

    public lai(aaas aaas, jpp jpp, acvx acvx, aaff aaff, Object obj) {
        jpf jpf;
        super(obj);
        this.e = (jpp) amqw.a((Object) jpp);
        this.f = (acvx) amqw.a((Object) acvx);
        this.g = (aaff) amqw.a((Object) aaff);
        aysr h = h();
        jpy jpy = null;
        if (h != null) {
            anxp anxp = h.c;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(CreationEntryEndpointOuterClass$CreationEntryEndpoint.creationEntryEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                arwf arwf = h.d;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                if (a == arwh.CREATION_ENTRY) {
                    jpf = new jpf(h, aaas);
                    this.i = jpf;
                    if (h != null && this.i == null) {
                        jpy = new jpy(h, aaas);
                    }
                    this.h = jpy;
                }
            }
        }
        jpf = null;
        this.i = jpf;
        jpy = new jpy(h, aaas);
        this.h = jpy;
    }

    public abstract aysr h();

    public final amuw a(amuw amuw) {
        Iterable amuw2;
        Object c = bbmi.a(this.g.a.m).a(lak.a).c(laj.a);
        Object bbuu = new bbuu(bbmc.a(new fpq(), new fpp()));
        bbnr lam = new lam(this);
        bbow.a(bbuu, "other is null");
        bbow.a(c, "source1 is null");
        bbow.a(bbuu, "source2 is null");
        Object a = bbod.a(lam);
        int i = bbmc.a;
        bbmm[] bbmmArr = new bbmm[]{c, bbuu};
        bbow.a(a, "zipper is null");
        bbow.a(i, "bufferSize");
        amuw a2 = amuw.a(new bbwl(bbmmArr, a, i).c());
        boolean isEmpty = a2.isEmpty();
        if (!isEmpty) {
            amuw2 = amuw.a(bbmi.a((Iterable) amuw2).a(lah.a).c());
        }
        amuv i2 = amuw.i();
        i2.b(amuw2);
        if (isEmpty) {
            Object obj = this.h;
            if (!(obj == null && this.i == null)) {
                jpf jpf = this.i;
                if (jpf != null) {
                    obj = jpf;
                }
                i2.c(obj);
            }
        }
        i2.b(a2);
        return i2.a();
    }
}
