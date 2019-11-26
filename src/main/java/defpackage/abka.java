package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: abka */
public final class abka extends aanf implements aana {
    private final String a;
    private final abkc b;
    private final Set g;
    private final boolean h;

    public abka(amqp amqp, aamd aamd, afpu afpu, amqp amqp2, bcaa bcaa, zzf zzf, Set set, abkc abkc) {
        bcaa.getClass();
        super(aamd, afpu, (xhf) amqp2.a(new abkd(bcaa)));
        this.a = amqp.a() ? (String) amqp.b() : "next";
        this.h = zzf.p();
        this.g = set;
        this.b = abkc;
    }

    public final void a(abkg abkg, afsw afsw) {
        this.b.b(abkg, afsw);
    }

    public final aafv a(abkg abkg) {
        abkc abkc = this.b;
        aoca b = abkc.b(abkg);
        abkc.b(b);
        return (aafv) abkc.a(b);
    }

    /* renamed from: b */
    public final abkg a(ajtf ajtf) {
        abkg a = a();
        a.e = aali.b(ajtf.a());
        a.a(ajtf.b());
        return a;
    }

    public final void a(aaml aaml, aand aand, afsw afsw) {
        this.b.a((abkg) aaml, aand, afsw);
    }

    public final abkg a() {
        String str = this.a;
        aamd aamd = this.c;
        afpt c = this.d.c();
        abkg abkg = new abkg((String) abkj.a(str, 1), (aamd) abkj.a(aamd, 2), (afpt) abkj.a(c, 3), this.h);
        for (abkh abkh : this.g) {
            if (abkh != null) {
                abkh.a(abkg);
            }
        }
        return abkg;
    }

    static {
        Collections.emptySet();
    }
}
