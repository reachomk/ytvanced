package defpackage;

import java.util.Map.Entry;
import java.util.concurrent.Callable;

/* renamed from: aend */
final /* synthetic */ class aend implements Callable {
    private final aene a;
    private final ovx b;
    private final ovm c;

    aend(aene aene, ovx ovx, ovm ovm) {
        this.a = aene;
        this.b = ovx;
        this.c = ovm;
    }

    public final Object call() {
        aene aene = this.a;
        ovi ovi = this.b;
        ovm ovm = this.c;
        try {
            if (aene.a == ovi) {
                aene.b.a.a(new aehl());
            } else {
                aene.b.a.a(new aeia());
            }
            ovi.d();
            for (Entry entry : aene.c.b().entrySet()) {
                ovi.a((String) entry.getKey(), (String) entry.getValue());
            }
            long a = ovi.a(ovm);
            aene.a((ovx) ovi);
            Long valueOf = Long.valueOf(a);
            if (aene.d != ovi) {
                ozp.a(ovi);
            }
            return valueOf;
        } catch (Throwable th) {
            if (aene.d != ovi) {
                ozp.a(ovi);
            }
        }
    }
}
