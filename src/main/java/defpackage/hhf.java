package defpackage;

import android.os.Bundle;

/* renamed from: hhf */
public final class hhf implements wxx {
    private final afym a;
    private final zyw b;
    private final afpu c;
    private final bcaa d;
    private final bcaa e;

    public hhf(afym afym, zyw zyw, afpu afpu, bcaa bcaa, bcaa bcaa2) {
        this.a = afym;
        this.b = zyw;
        this.c = afpu;
        this.d = bcaa;
        this.e = bcaa2;
    }

    public final int a(Bundle bundle) {
        if (this.c.a() && foh.j(this.b) && (!foh.m(this.b) || ((ekh) this.e.get()).g())) {
            agwc agwc = (agwc) this.d.get();
            if (!this.a.d(agwc.c())) {
                this.a.a(agwc.c());
                return 0;
            }
        }
        return 1;
    }
}
