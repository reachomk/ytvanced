package defpackage;

import android.content.Context;
import android.media.MediaRouter.RouteInfo;

/* renamed from: bcz */
final class bcz extends bdf {
    public bcz(Context context, bdi bdi) {
        super(context, bdi);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bde bde, bal bal) {
        super.a(bde, bal);
        bal.c(((RouteInfo) bde.a).getDeviceType());
    }
}
