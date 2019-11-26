package defpackage;

import android.os.Bundle;

/* renamed from: afze */
public final class afze implements wxx {
    private final bcaa a;
    private final bcaa b;

    public afze(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final int a(Bundle bundle) {
        String string = bundle.getString("identityId");
        agvz a = afyy.a((agwc) this.a.get(), string);
        if (a == null) {
            return 1;
        }
        int a2 = ((agxg) this.b.get()).a(string, a, bundle.getBoolean("forceSync", false));
        if (a2 == 0) {
            return 0;
        }
        if (a2 != 1) {
            return 1;
        }
        return 2;
    }
}
