package defpackage;

import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.VolumeCallback;

/* renamed from: bbz */
final class bbz extends VolumeCallback {
    private final bca a;

    public bbz(bca bca) {
        this.a = bca;
    }

    public final void onVolumeSetRequest(RouteInfo routeInfo, int i) {
        this.a.a(routeInfo, i);
    }

    public final void onVolumeUpdateRequest(RouteInfo routeInfo, int i) {
        this.a.b(routeInfo, i);
    }
}
