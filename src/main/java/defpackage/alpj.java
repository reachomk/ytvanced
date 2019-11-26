package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: alpj */
public final class alpj {
    public final akpd a;
    public final List b;
    public final List c;
    public int d;
    private final akpk e;

    public alpj(Context context, aaas aaas, acvx acvx, nd ndVar, int i, xci xci) {
        amqw.a((Object) context);
        amqw.a((Object) aaas);
        amqw.a((Object) acvx);
        amqw.a((Object) ndVar);
        amqw.a(i > 0);
        alpi alpi = new alpi();
        aknw aknw = new aknw();
        aknw.a(alpe.class, new alpg(aaas, acvx, ndVar, xci));
        this.e = new akpk();
        aknw.a(akni.class, new aknn(context, alpi, aknw));
        aknw.a(alpm.class, new alpn(context));
        this.a = new akpd(aknw);
        this.a.a(this.e);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = i;
    }

    public final void a() {
        List list;
        akpk akpk;
        aknl a;
        this.e.clear();
        Iterator it = new alpl(this.b, this.d).iterator();
        while (it.hasNext()) {
            list = (List) it.next();
            akpk = this.e;
            a = akni.a();
            a.a = this.d;
            a.b = list;
            akpk.add(a.a());
        }
        if (!(this.b.isEmpty() || this.c.isEmpty())) {
            this.e.add(new alpm());
        }
        it = new alpl(this.c, this.d).iterator();
        while (it.hasNext()) {
            list = (List) it.next();
            akpk = this.e;
            a = akni.a();
            a.a = this.d;
            a.b = list;
            akpk.add(a.a());
        }
    }
}
