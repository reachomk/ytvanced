package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: xrq */
public final class xrq {
    public volatile boolean a;
    private final tub b = new tub();

    public xrq(Context context) {
        this.a = ucv.b(context);
        this.b.a(new xrp(this));
        this.b.a(new xrs(this));
        this.b.a((Application) context.getApplicationContext());
    }

    public final void a(ttp ttp) {
        this.b.a(ttp);
    }

    public final void b(ttp ttp) {
        this.b.b(ttp);
    }
}
