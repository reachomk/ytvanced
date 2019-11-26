package defpackage;

import android.media.MediaRouter.UserRouteInfo;
import android.media.MediaRouter.VolumeCallback;

/* renamed from: bbx */
public final class bbx {
    public static void a(Object obj, int i) {
        ((UserRouteInfo) obj).setPlaybackType(i);
    }

    public static void b(Object obj, int i) {
        ((UserRouteInfo) obj).setPlaybackStream(i);
    }

    public static void c(Object obj, int i) {
        ((UserRouteInfo) obj).setVolume(i);
    }

    public static void d(Object obj, int i) {
        ((UserRouteInfo) obj).setVolumeMax(i);
    }

    public static void e(Object obj, int i) {
        ((UserRouteInfo) obj).setVolumeHandling(i);
    }

    public static void a(Object obj, Object obj2) {
        ((UserRouteInfo) obj).setVolumeCallback((VolumeCallback) obj2);
    }
}
