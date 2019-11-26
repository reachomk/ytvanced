package defpackage;

import android.app.ActionBar;
import android.content.Context;
import android.view.Window;

/* renamed from: mtw */
public final class mtw implements xpe {
    public final msh a;
    public final mtz b;
    public final xot c;
    public final ActionBar d;
    public final Window e;
    public ngt f = ngt.a;
    public boolean g;
    public boolean h;

    public mtw(Context context, msh msh, mtz mtz, aiuf aiuf, xot xot) {
        amqw.a((Object) context, (Object) "context cannot be null");
        this.a = (msh) amqw.a((Object) msh, (Object) "activityProxy cannot be null");
        this.b = (mtz) amqw.a((Object) mtz, (Object) "listener cannot be null");
        this.d = msh.a();
        this.e = msh.c();
        this.c = xot;
        this.g = true;
        amqw.a((Object) aiuf, (Object) "playerOverlaysLayout cannot be null");
        xot.a((xpe) this);
        aiuf.a((xol) xot);
    }

    public final void k() {
        if (this.g && this.h) {
            this.b.b();
        }
    }
}
