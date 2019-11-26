package defpackage;

import android.media.MediaRouter.RouteInfo;

/* renamed from: bbv */
public final class bbv {
    public static int a(Object obj) {
        return ((RouteInfo) obj).getVolume();
    }

    public static void a(Object obj, Object obj2) {
        ((RouteInfo) obj).setTag(obj2);
    }
}
