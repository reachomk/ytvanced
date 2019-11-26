package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: ism */
final class ism implements Runnable {
    private final Activity a;

    public ism(Activity activity) {
        this.a = activity;
    }

    public final void run() {
        String str = "VOZ_DIALOG";
        if (this.a.getFragmentManager().findFragmentByTag(str) == null) {
            isp isp = new isp();
            isp.setArguments(new Bundle());
            isp.show(this.a.getFragmentManager(), str);
        }
    }
}
