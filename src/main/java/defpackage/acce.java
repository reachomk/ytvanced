package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: acce */
final class acce extends BroadcastReceiver {
    private final /* synthetic */ acby a;

    acce(acby acby) {
        this.a = acby;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z = this.a.e;
        String action = intent.getAction();
        acby acby;
        if ("android.intent.action.DEVICE_STORAGE_LOW".equals(action) || "android.intent.action.DEVICE_STORAGE_OK".equals(action)) {
            acby = this.a;
            acby.c.post(acby.i);
        } else if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
            acby = this.a;
            long nanoTime = System.nanoTime();
            if (nanoTime - acby.f > acby.a) {
                acby.f = nanoTime;
                int intExtra = intent.getIntExtra("level", -1);
                int intExtra2 = intent.getIntExtra("scale", -1);
                if (intExtra >= 0 && intExtra2 >= 0) {
                    intExtra = (intExtra * 100) / intExtra2;
                    if (intExtra <= 10) {
                        acby.c.post(acby.k);
                    } else {
                        acby.c.post(acby.l);
                    }
                    acby.g = intExtra;
                } else {
                    acby.g = -1;
                }
                acby.h = intent.getIntExtra("status", -1);
            }
        }
    }
}
