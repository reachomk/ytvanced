package defpackage;

import android.os.Bundle;

/* renamed from: lya */
public final /* synthetic */ class lya implements dxz {
    public static final dxz a = new lya();

    private lya() {
    }

    public final nd a(apxu apxu) {
        aljg aljg = new aljg();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        aljg.f(bundle);
        return aljg;
    }
}
