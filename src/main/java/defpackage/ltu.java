package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;

/* renamed from: ltu */
public final class ltu implements lrm {
    public final zwj a;
    private final zwq b;

    public ltu(Activity activity, zwj zwj, zwh zwh, Context context, ViewStub viewStub, lrh lrh) {
        zvi zvi = new zvi(context, new ltt(activity), viewStub, zwh);
        this.a = zwj;
        this.b = zvi;
        lrh.a((lrm) this);
    }

    public final void a(int i, int i2) {
        if (i2 == 3) {
            this.a.a(this.b);
        }
    }
}
