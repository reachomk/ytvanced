package defpackage;

import android.os.Bundle;

/* renamed from: lxk */
public final /* synthetic */ class lxk implements dxz {
    public static final dxz a = new lxk();

    private lxk() {
    }

    public final nd a(apxu apxu) {
        ybz ybz = new ybz();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        ybz.f(bundle);
        return ybz;
    }
}
