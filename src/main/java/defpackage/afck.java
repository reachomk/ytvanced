package defpackage;

import java.io.IOException;

/* renamed from: afck */
final class afck implements nwq {
    private final /* synthetic */ aaiz a;
    private final /* synthetic */ afbo b;

    afck(afbo afbo, aaiz aaiz) {
        this.b = afbo;
        this.a = aaiz;
    }

    public final void a() {
        afbo afbo = this.b;
        npf npf = (npf) this.a.l;
        if (npf != null) {
            int b = npf.b();
            for (int i = 0; i < b; i++) {
                npk a = npf.a(i);
                if (a instanceof aeki) {
                    for (aett a2 : ((aeki) a).d) {
                        afbo.i.a(a2);
                    }
                }
            }
        }
    }

    public final void a(IOException iOException) {
        afbo afbo = this.b;
        afbo.i.a(aevl.a(iOException, afbo.o(), this.b.c, 8));
    }
}
