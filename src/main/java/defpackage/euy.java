package defpackage;

import android.os.Bundle;

/* renamed from: euy */
public final class euy extends egj {
    public euy(nn nnVar, exu exu) {
        super(nnVar, exu, "SubscriptionNotificationOptionsDialogFragmentController");
    }

    public final void a(axxl axxl) {
        f();
        if (e() == null) {
            euw euw = new euw();
            Bundle bundle = new Bundle();
            bundle.putByteArray("model", axxl.toByteArray());
            euw.f(bundle);
            a(euw);
        }
        c();
    }
}
