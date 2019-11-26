package defpackage;

import android.content.Context;
import android.media.MediaRouter.RouteInfo;
import android.util.Log;
import android.view.Display;

/* renamed from: bdg */
class bdg extends bdc implements bcb {
    private bcc o;
    private bcd p;

    public bdg(Context context, bdi bdi) {
        super(context, bdi);
    }

    public final void f(Object obj) {
        int g = g(obj);
        if (g >= 0) {
            bde bde = (bde) this.n.get(g);
            Display a = bcg.a(obj);
            int displayId = a != null ? a.getDisplayId() : -1;
            if (displayId != bde.c.q()) {
                bal bal = new bal(bde.c);
                bal.g(displayId);
                bde.c = bal.a();
                d();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(bde bde, bal bal) {
        super.a(bde, bal);
        if (!((RouteInfo) bde.a).isEnabled()) {
            bal.a(false);
        }
        if (a(bde)) {
            bal.a.putBoolean("connecting", true);
        }
        Display a = bcg.a(bde.a);
        if (a != null) {
            bal.g(a.getDisplayId());
        }
    }

    /* Access modifiers changed, original: protected */
    public void e() {
        super.e();
        if (this.o == null) {
            this.o = new bcc();
        }
        bcc bcc = this.o;
        if (((this.l ? this.k : 0) & 2) != 0) {
            Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object f() {
        return new bce(this);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(bde bde) {
        if (this.p == null) {
            this.p = new bcd();
        }
        return false;
    }
}
