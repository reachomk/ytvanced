package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteCategory;

/* renamed from: bbr */
final class bbr {
    public static Object a(Context context) {
        return context.getSystemService("media_router");
    }

    public static Object a(Object obj) {
        return ((MediaRouter) obj).getSelectedRoute(8388611);
    }

    public static void a(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((Callback) obj2);
    }

    public static Object a(Object obj, String str) {
        return ((MediaRouter) obj).createRouteCategory(str, false);
    }

    public static Object b(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((RouteCategory) obj2);
    }

    public static Object a(bca bca) {
        return new bbz(bca);
    }
}
