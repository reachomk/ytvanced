package defpackage;

import java.util.List;

/* renamed from: aarh */
public class aarh extends aanf implements aana {
    public final aamn b;
    public final aamf g;

    public aarh(aamn aamn, aamf aamf, aamd aamd, afpu afpu, xhf xhf) {
        super(aamd, afpu, xhf);
        this.b = aamn;
        this.g = aamf;
    }

    public final void a(apxu apxu, String str, String str2, String str3, afsw afsw) {
        aaml aath = new aath(this.c, this.d.c(), str, str3, str2);
        aath.a(aabc.a(apxu));
        a(asmg.e, this.g, aarg.a, aarj.a).a(aath, afsw);
    }

    public final void a(String str, List list, afsw afsw, boolean z) {
        aatw aatw = new aatw(this.c, this.d.c());
        aatw.a = str;
        aatw.b = list;
        aatw.i = z;
        new aasy(this).b(aatw, afsw);
    }

    public final void a(String str, Boolean bool, afsw afsw) {
        a(asgp.e, this.g, aari.a, aarl.a).a(new aate(this.c, this.d.c(), str, bool), afsw);
    }

    public final void a(String str, afsw afsw) {
        a(ajuf.class, this.b, aarq.a).a(new aatg(this.c, this.d.c(), str), afsw);
    }

    public final void a(asfa asfa, aseq aseq, ases ases, aseu aseu, Boolean bool, afsw afsw) {
        aaml aauc = new aauc(this.c, this.d.c());
        aauc.a = asfa;
        aauc.b = aseq;
        aauc.d = ases;
        aauc.c = aseu;
        aauc.e = bool;
        a(aseo.i, this.g, aart.a, aarv.a).a(aauc, afsw);
    }

    public aaml a(ajtf ajtf) {
        aatt aatt = new aatt(this.c, this.d.c());
        aatt.b = ajtf.a();
        return aatt;
    }

    public void a(aaml aaml, aand aand, afsw afsw) {
        new aasw(this).a((aatt) aaml, aand, afsw);
    }
}
