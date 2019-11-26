package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: anlk */
final class anlk extends BroadcastReceiver {
    public static AtomicReference a = new AtomicReference();
    private final Context b;

    public anlk(Context context) {
        this.b = context;
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (anlf.a) {
            for (anlf d : anlf.b.values()) {
                d.d();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
