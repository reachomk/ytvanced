package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: agyi */
final class agyi extends BroadcastReceiver {
    public volatile boolean a;
    public volatile float b;
    public final xry c;
    private final agyt d;

    agyi(agyt agyt, xry xry) {
        this.d = agyt;
        this.c = (xry) amqw.a((Object) xry);
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            String str = "android.intent.action.ACTION_POWER_CONNECTED";
            if (str.equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                this.a = str.equals(action);
                this.d.e();
            }
            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                float intExtra = (float) intent.getIntExtra("level", -1);
                float intExtra2 = (float) intent.getIntExtra("scale", -1);
                if (intExtra >= 0.0f && intExtra2 > 0.0f) {
                    this.b = intExtra / intExtra2;
                    return;
                }
                this.b = -1.0f;
            }
        }
    }
}
