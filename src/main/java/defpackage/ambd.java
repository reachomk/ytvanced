package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: ambd */
final /* synthetic */ class ambd implements Runnable {
    private final ambe a;
    private final List b;

    ambd(ambe ambe, List list) {
        this.a = ambe;
        this.b = list;
    }

    public final void run() {
        ambe ambe = this.a;
        Object<ambi> obj = this.b;
        amav amav = ambe.a;
        amqw.a((Object) obj);
        for (ambi ambi : obj) {
            ambi ambi2 = new ambi(ambi.a, ambi.b, 5000 + amav.a.a(), ambi.d, ambi.e + 1);
            if (ambi2.e > 3) {
                Iterator it = amav.d.iterator();
                while (it.hasNext()) {
                    ((ambf) it.next()).a(ambi2.b);
                }
            } else {
                amav.c.add(ambi2);
            }
        }
        amav.c();
    }
}
