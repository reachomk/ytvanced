package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: ajai */
final class ajai extends BroadcastReceiver {
    public boolean a;
    public final /* synthetic */ aizy b;
    private Handler c;

    public final void a() {
        if (this.c == null) {
            this.c = new Handler();
        }
        if (!this.a) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            this.b.a.registerReceiver(this, intentFilter);
            this.a = true;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if (!this.b.b.f() && this.b.b.h().a() > 0) {
                this.c.postDelayed(new ajal(this.b), 180000);
            }
            return;
        }
        this.c.removeCallbacksAndMessages(null);
    }

    /* synthetic */ ajai(aizy aizy) {
        this.b = aizy;
    }
}
