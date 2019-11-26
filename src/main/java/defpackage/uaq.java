package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: uaq */
final class uaq extends BroadcastReceiver {
    public final tzs a;
    public final tzu b;
    private final tzu c;

    uaq(tzs tzs, tzu tzu, tzu tzu2) {
        this.a = tzs;
        this.b = tzu;
        this.c = tzu2;
    }

    public final void onReceive(Context context, Intent intent) {
        tyv.b("PrimesShutdown", "BroadcastReceiver: action = %s", intent.getAction());
        if (this.a.a) {
            context.unregisterReceiver(this);
            return;
        }
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            tzu tzu = this.c;
            if (tzu != null) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) tzu.a();
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.submit(new uap(this));
                }
            }
        }
    }
}
