package defpackage;

import android.media.MediaRouter.RouteInfo;
import android.util.Log;
import android.view.Display;

/* renamed from: bcg */
public final class bcg {
    public static Display a(Object obj) {
        try {
            return ((RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError e) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
            return null;
        }
    }
}
