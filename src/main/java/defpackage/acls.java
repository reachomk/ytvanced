package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;

/* renamed from: acls */
final /* synthetic */ class acls implements Runnable {
    private final aclq a;
    private final Activity b;

    acls(aclq aclq, Activity activity) {
        this.a = aclq;
        this.b = activity;
    }

    public final void run() {
        aclq aclq = this.a;
        Activity activity = this.b;
        Bitmap b = aclq.ad.b(aclq.am);
        if (b == null) {
            aclq.ap = false;
            return;
        }
        synchronized (aclq) {
            aclq.ao = b;
            aclq.an = b;
        }
        activity.runOnUiThread(new acma(aclq));
    }
}
