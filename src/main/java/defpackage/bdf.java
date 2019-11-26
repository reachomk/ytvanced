package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;

/* renamed from: bdf */
class bdf extends bdg {
    public bdf(Context context, bdi bdi) {
        super(context, bdi);
    }

    /* Access modifiers changed, original: protected */
    public void a(bde bde, bal bal) {
        super.a(bde, bal);
        CharSequence description = ((RouteInfo) bde.a).getDescription();
        if (description != null) {
            bal.a.putString("status", description.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void h(Object obj) {
        ((MediaRouter) this.i).selectRoute(8388611, (RouteInfo) obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object g() {
        return ((MediaRouter) this.i).getDefaultRoute();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bdd bdd) {
        super.a(bdd);
        ((UserRouteInfo) bdd.b).setDescription(bdd.a.e);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        if (this.m) {
            bbr.a(this.i, this.j);
        }
        this.m = true;
        Object obj = this.i;
        ((MediaRouter) obj).addCallback(this.k, (Callback) this.j, this.l | 2);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(bde bde) {
        return ((RouteInfo) bde.a).isConnecting();
    }
}
