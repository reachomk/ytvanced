package defpackage;

import android.os.Bundle;

/* renamed from: jos */
public final class jos extends egj implements gza {
    public jos(nn nnVar, exu exu) {
        super(nnVar, exu, "YpcOffersListDialogFragment");
    }

    public final void a(gyl gyl) {
        if (gyl == e()) {
            g();
        }
    }

    public final void a(apxu apxu) {
        if (e() != null) {
            super.f();
        }
        amqw.a((Object) apxu);
        amqw.a((Object) apxu);
        gyl gyl = new gyl();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        gyl.f(bundle);
        amqw.b(true);
        a(gyl);
    }
}
