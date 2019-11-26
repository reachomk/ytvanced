package defpackage;

import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteGroup;
import android.media.MediaRouter.RouteInfo;

/* renamed from: bbt */
class bbt extends Callback {
    public final bbu a;

    public bbt(bbu bbu) {
        this.a = bbu;
    }

    public final void onRouteSelected(MediaRouter mediaRouter, int i, RouteInfo routeInfo) {
        this.a.a(routeInfo);
    }

    public final void onRouteUnselected(MediaRouter mediaRouter, int i, RouteInfo routeInfo) {
        this.a.a();
    }

    public final void onRouteAdded(MediaRouter mediaRouter, RouteInfo routeInfo) {
        this.a.b(routeInfo);
    }

    public final void onRouteRemoved(MediaRouter mediaRouter, RouteInfo routeInfo) {
        this.a.c(routeInfo);
    }

    public final void onRouteChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
        this.a.d(routeInfo);
    }

    public final void onRouteGrouped(MediaRouter mediaRouter, RouteInfo routeInfo, RouteGroup routeGroup, int i) {
        this.a.b();
    }

    public final void onRouteUngrouped(MediaRouter mediaRouter, RouteInfo routeInfo, RouteGroup routeGroup) {
        this.a.c();
    }

    public final void onRouteVolumeChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
        this.a.e(routeInfo);
    }
}
