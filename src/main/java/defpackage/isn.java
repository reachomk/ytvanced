package defpackage;

import android.app.Activity;
import android.os.Handler;

/* renamed from: isn */
public final class isn {
    public final Activity a;
    public final ism b = new ism(this.a);
    public final Handler c;
    public final zzl d;
    public final aizy e;

    public isn(Handler handler, Activity activity, zzl zzl, aizy aizy) {
        this.e = aizy;
        this.c = handler;
        this.a = activity;
        this.d = zzl;
    }

    public final void a() {
        if (foh.i(this.d)) {
            this.c.removeCallbacks(this.b);
            isp isp = (isp) this.a.getFragmentManager().findFragmentByTag("VOZ_DIALOG");
            if (isp != null) {
                isp.dismissAllowingStateLoss();
            }
        }
    }

    public final boolean b() {
        if (!foh.i(this.d) || ((isp) this.a.getFragmentManager().findFragmentByTag("VOZ_DIALOG")) == null) {
            return false;
        }
        return true;
    }
}
