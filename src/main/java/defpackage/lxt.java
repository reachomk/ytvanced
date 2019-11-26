package defpackage;

import android.os.Bundle;

/* renamed from: lxt */
public final /* synthetic */ class lxt implements dxz {
    public static final dxz a = new lxt();

    private lxt() {
    }

    public final nd a(apxu apxu) {
        ycd ycd = new ycd();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        ycd.f(bundle);
        return ycd;
    }
}
