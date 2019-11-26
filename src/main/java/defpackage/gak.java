package defpackage;

import android.app.Activity;
import android.os.Handler;

/* renamed from: gak */
public final class gak implements exv {
    public final gao a = new gao(this.c);
    public final Handler b;
    private final Activity c;

    public gak(Handler handler, Activity activity, exu exu) {
        this.b = handler;
        this.c = activity;
        exu.a((exv) this);
    }

    public final void a() {
    }

    public final void c() {
        this.b.removeCallbacks(this.a);
        gan gan = (gan) this.c.getFragmentManager().findFragmentByTag("MTDIALOG");
        if (gan != null) {
            gan.dismiss();
        }
    }

    public final boolean d() {
        return ((gan) this.c.getFragmentManager().findFragmentByTag("MTDIALOG")) != null;
    }

    public final void b() {
        c();
    }
}
