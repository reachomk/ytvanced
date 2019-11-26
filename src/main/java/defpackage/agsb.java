package defpackage;

import java.util.Iterator;

/* renamed from: agsb */
public final class agsb extends afio {
    private final afzi a;
    private final afhh b;
    private final boolean c = true;
    private final afia d;

    public agsb(afzi afzi, afhh afhh, afia afia) {
        this.a = (afzi) amqw.a((Object) afzi);
        this.b = afhh;
        this.d = afia;
    }

    public final ovi a(ovi ovi) {
        if (this.a == null) {
            return ovi;
        }
        if (this.c) {
            ovi = new agsc(ovi);
        }
        Iterator it = this.a.a().iterator();
        while (true) {
            ovi ovi2 = ovi;
            if (!it.hasNext()) {
                return ovi2;
            }
            agpv agpv = (agpv) it.next();
            ovi oxc = new oxc(agpv, ovi2, this.b.a(agpv.b.a()), null, 4, this.d);
        }
    }
}
