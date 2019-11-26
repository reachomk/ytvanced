package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: acch */
final class acch extends BroadcastReceiver {
    private final /* synthetic */ acby a;

    acch(acby acby) {
        this.a = acby;
    }

    public final void onReceive(Context context, Intent intent) {
        acby acby = this.a;
        boolean z = acby.e;
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            acby.c.postDelayed(acby.m, 5000);
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            acby.c.removeCallbacks(acby.m);
        }
    }
}
