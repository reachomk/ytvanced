package defpackage;

import android.os.Bundle;

/* renamed from: aavg */
public final class aavg implements wxx {
    private final bcaa a;

    public aavg(bcaa bcaa) {
        this.a = bcaa;
    }

    public final int a(Bundle bundle) {
        try {
            ((aavm) this.a.get()).a();
            return 0;
        } catch (aanq e) {
            xtl.a("Scheduled config refresh failed.", e);
            return 2;
        }
    }
}
