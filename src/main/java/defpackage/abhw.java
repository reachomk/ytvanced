package defpackage;

import java.util.Set;

/* renamed from: abhw */
public final class abhw extends aanf implements aana {
    public final abhz a;
    private final String b;
    private final boolean g;
    private final Set h;
    private final xci i;

    public abhw(amqp amqp, aamd aamd, afpu afpu, xhf xhf, zzf zzf, Set set, abhz abhz, xci xci) {
        super(aamd, afpu, xhf);
        this.b = (String) amqp.a((Object) "search");
        this.h = (Set) amqw.a((Object) set);
        this.a = (abhz) amqw.a((Object) abhz);
        this.g = zzf.p();
        this.i = (xci) amqw.a((Object) xci);
    }

    public final void a(aaml aaml, aand aand, afsw afsw) {
        this.a.a((abib) aaml, aand, afsw);
    }

    public final abib a() {
        abib abib = new abib(this.b, this.c, this.d.c(), this.g);
        abib.n = new xfp(this.i, new aaad(), new aaaa(), null, null);
        for (abia a : this.h) {
            a.a();
        }
        return abib;
    }

    public final /* synthetic */ aaml a(ajtf ajtf) {
        abib a = a();
        a.a = aali.b(ajtf.a());
        a.a(ajtf.b());
        return a;
    }
}
