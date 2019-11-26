package defpackage;

import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;

/* renamed from: bce */
final class bce extends bbt {
    public bce(bcb bcb) {
        super(bcb);
    }

    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
        ((bcb) this.a).f(routeInfo);
    }
}
