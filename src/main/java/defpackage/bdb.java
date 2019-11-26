package defpackage;

import android.media.MediaRouter.RouteInfo;

/* renamed from: bdb */
public final class bdb extends bay {
    private final Object a;

    public bdb(Object obj) {
        this.a = obj;
    }

    public final void b(int i) {
        ((RouteInfo) this.a).requestSetVolume(i);
    }

    public final void c(int i) {
        ((RouteInfo) this.a).requestUpdateVolume(i);
    }
}
