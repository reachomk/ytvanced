package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.PowerMonitor;

/* renamed from: bcia */
public final class bcia extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        PowerMonitor.a(intent);
    }
}
