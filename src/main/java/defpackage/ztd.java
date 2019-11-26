package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.deepauth.ActivityController;

/* renamed from: ztd */
final /* synthetic */ class ztd implements Runnable {
    private final zta a;
    private final String b;

    ztd(zta zta, String str) {
        this.a = zta;
        this.b = str;
    }

    public final void run() {
        int i;
        zta zta = this.a;
        String str = this.b;
        String d = zta.d();
        if (TextUtils.isEmpty(d)) {
            i = 2;
        } else {
            zta.a(2, str);
            sfg sfg = zta.e;
            sfq a = sfg.a(zta.c, str, d, sfg.a, true, zta.e());
            if (a.b()) {
                Activity activity = zta.b;
                PendingIntent activity2 = PendingIntent.getActivity(zta.c, 300, new Intent(activity, activity.getClass()).setFlags(603979776), 0);
                activity = zta.b;
                sfn sfn = new sfn(zta.c, a.a);
                sfn.d.a(activity2);
                sfn.d.a();
                sfn.c.k = sfn.d.b();
                Context context = sfn.a;
                activity.startActivityForResult(new Intent(context, ActivityController.class).putExtra("COMPLETION_STATE", sfn.b), 300);
                i = 3;
            } else if (a.a()) {
                zta.c(2, str);
                i = 6;
            } else {
                zta.b(2, str);
                i = 1;
            }
        }
        if (i != 3) {
            zta.a.a(i, zta.b);
        }
    }
}
