package defpackage;

import android.os.Bundle;

/* renamed from: acxj */
public final class acxj extends acvj {
    public final acxm h;

    public acxj(xuu xuu, xci xci, acwe acwe, acwh acwh, acxm acxm, acxa acxa) {
        super(xuu, xci, acwe, acwh, acxa);
        this.h = acxm;
    }

    public final void a(acwl acwl, apxu apxu, atst atst) {
        if (apxu == null) {
            apxu = acxm.a(this.h.a);
        }
        super.a(acwl, apxu, atst);
        this.h.a = acxm.a((acvx) this);
    }

    public final Bundle e() {
        return this.h.a;
    }

    private final void a(Bundle bundle) {
        this.h.a = bundle;
    }

    public final void a(Bundle bundle, apxu apxu) {
        if (bundle == null) {
            bundle = acxm.a(apxu);
            if (bundle != null) {
                a(bundle);
            }
        } else if (this.h.a == null) {
            a(bundle);
        }
    }
}
