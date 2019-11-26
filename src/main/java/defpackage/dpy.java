package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.android.youtube.R;

/* renamed from: dpy */
final class dpy implements Runnable {
    private final /* synthetic */ dos a;

    dpy(dos dos) {
        this.a = dos;
    }

    public final void run() {
        Context context = this.a.aD;
        if (VERSION.SDK_INT >= 26) {
            ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannel("GenericNotifications");
            xlr.a(context, "generic_notifications", context.getString(R.string.default_notifications_channel), 2, false, true);
        }
        aulu aulu = ((zyw) this.a.aj.get()).a().e;
        if (aulu == null) {
            aulu = aulu.bw;
        }
        if (aulu.V) {
            ((xlu) this.a.aw.get()).a();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        this.a.aD.registerReceiver(new ejj(), intentFilter);
    }
}
