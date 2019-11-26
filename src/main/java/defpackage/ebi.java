package defpackage;

import android.os.Bundle;

/* renamed from: ebi */
public final class ebi implements wxx {
    private final String a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public ebi(String str, bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = str;
        this.b = bcaa;
        this.c = bcaa2;
        this.d = bcaa3;
    }

    public final int a(Bundle bundle) {
        try {
            aapn aapn = (aapn) this.b.get();
            aaps a = aapn.a();
            a.c(this.a);
            a.n();
            a.g();
            ((eav) this.d.get()).a(aapn.a(a), this.a);
            ((afpp) this.c.get()).b();
            return 0;
        } catch (aanq e) {
            xtl.a("Failed to fetch offline library browse", e);
            return 1;
        }
    }
}
