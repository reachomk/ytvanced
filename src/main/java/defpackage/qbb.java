package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: qbb */
public final class qbb {
    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static long b;
    private static float c = Float.NaN;

    public static int a(Context context) {
        if (!(context == null || context.getApplicationContext() == null)) {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, a);
            int i = 0;
            int intExtra = (registerReceiver != null ? registerReceiver.getIntExtra("plugged", 0) : 0) & 7;
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                int isInteractive;
                if (qbf.a()) {
                    isInteractive = powerManager.isInteractive();
                } else {
                    isInteractive = powerManager.isScreenOn();
                }
                isInteractive += isInteractive;
                if (intExtra != 0) {
                    i = 1;
                }
                return isInteractive | i;
            }
        }
        return -1;
    }

    public static synchronized float b(Context context) {
        synchronized (qbb.class) {
            float f;
            if (SystemClock.elapsedRealtime() - b < 60000) {
                if (!Float.isNaN(c)) {
                    f = c;
                    return f;
                }
            }
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, a);
            if (registerReceiver != null) {
                c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
            }
            b = SystemClock.elapsedRealtime();
            f = c;
            return f;
        }
    }
}
