package defpackage;

import android.os.Bundle;

/* renamed from: gar */
public final class gar implements wxx {
    private final xhv a;
    private final acum b;
    private final bcaa c;

    public gar(xhv xhv, acum acum, bcaa bcaa) {
        this.a = xhv;
        this.b = acum;
        this.c = bcaa;
    }

    public final int a(Bundle bundle) {
        aqve aqve = (aqve) aqvb.c.createBuilder();
        int m = this.a.m();
        aqve.copyOnWrite();
        aqvb aqvb = (aqvb) aqve.instance;
        if (m != 0) {
            aqvb.a |= 1;
            aqvb.b = m - 1;
            aqvb aqvb2 = (aqvb) ((anxl) aqve.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (aqvb2 != null) {
                asmw.c = aqvb2;
                asmw.b = 52;
                this.b.a((asmw) ((anxl) asmz.build()));
                ((gaq) this.c.get()).a();
                return 0;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
