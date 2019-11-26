package defpackage;

import java.util.Map;

/* renamed from: fmq */
public final class fmq implements syk {
    public final aadw a;
    public final Map b = new zj();
    public final zyw c;
    private bbnc d;

    public fmq(aadw aadw, zyw zyw) {
        this.a = aadw;
        this.c = zyw;
    }

    public final void a() {
        if (this.d == null) {
            bbrf bbrf = new bbrf(new bbqx(this.a.a("Egl0aGVtZS1zZXQgSygB", true).a(bbmt.a())));
            Object fmt = new fmt(this);
            Object obj = bbod.e;
            Object obj2 = bbod.c;
            Object obj3 = bbrb.a;
            bbow.a(fmt, "onNext is null");
            bbow.a(obj, "onError is null");
            bbow.a(obj2, "onComplete is null");
            bbow.a(obj3, "onSubscribe is null");
            bbmb bbym = new bbym(fmt, obj, obj2, obj3);
            bbrf.a(bbym);
            this.d = bbym;
        }
    }

    public final void b() {
        bbnc bbnc = this.d;
        if (bbnc != null) {
            bbnc.bK_();
            this.d = null;
        }
    }
}
