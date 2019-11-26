package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: rm */
public abstract class rm extends BroadcastReceiver {
    public static final SparseArray a = new SparseArray();
    public static int b = 1;

    public static boolean a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
            if (intExtra == 0) {
                return false;
            }
        }
        synchronized (a) {
            WakeLock wakeLock = (WakeLock) a.get(intExtra);
            if (wakeLock == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No active wake lock id #");
                stringBuilder.append(intExtra);
                Log.w("WakefulBroadcastReceiv.", stringBuilder.toString());
                return true;
            }
            wakeLock.release();
            a.remove(intExtra);
            return true;
        }
    }
}
