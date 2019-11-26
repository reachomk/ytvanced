package defpackage;

import java.util.Map;

/* renamed from: yry */
final /* synthetic */ class yry implements Runnable {
    private final yrv a;
    private final Map b;

    yry(yrv yrv, Map map) {
        this.a = yrv;
        this.b = map;
    }

    public final void run() {
        yrv yrv = this.a;
        Map map = this.b;
        ahc a = ahb.a(yrv);
        if (yrv.e) {
            yrv.a.execute(new yrx(yrv, a, map));
        }
    }
}
