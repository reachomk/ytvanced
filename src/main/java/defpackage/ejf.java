package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ejf */
public final class ejf extends BroadcastReceiver {
    public final bbzt a = bbzt.b();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final bbng c = new bbng();
    public final bcaa d;
    public final bcaa e;
    public final xsc f;

    public ejf(bcaa bcaa, bcaa bcaa2, xsc xsc) {
        this.d = bcaa;
        this.e = bcaa2;
        this.f = xsc;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(intent.getAction())) {
                this.a.b_(Boolean.valueOf(powerManager.isDeviceIdleMode()));
            }
        }
    }
}
