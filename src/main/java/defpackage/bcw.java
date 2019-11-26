package defpackage;

import android.content.Context;
import android.media.MediaRouter.UserRouteInfo;
import android.media.RemoteControlClient;

/* renamed from: bcw */
final class bcw extends bct {
    private final Object c;
    private final Object d = bbr.a(this.c, "");
    private final Object e = bbr.b(this.c, this.d);
    private boolean f;

    public bcw(Context context, Object obj) {
        super(obj);
        this.c = bbr.a(context);
    }

    public final void a(bcy bcy) {
        bbx.c(this.e, bcy.a);
        bbx.d(this.e, bcy.b);
        bbx.e(this.e, bcy.c);
        bbx.b(this.e, bcy.d);
        bbx.a(this.e, bcy.e);
        if (!this.f) {
            this.f = true;
            bbx.a(this.e, bbr.a(new bcv(this)));
            ((UserRouteInfo) this.e).setRemoteControlClient((RemoteControlClient) this.a);
        }
    }
}
