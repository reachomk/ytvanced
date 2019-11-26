package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;

/* renamed from: qau */
public final class qau {
    private static Boolean a;

    public static void a(Context context, String str, int i, String str2, String str3, int i2, List list, long j) {
        List list2 = list;
        if (a == null) {
            a = Boolean.valueOf(false);
        }
        if (a.booleanValue()) {
            String str4 = "WakeLockTracker";
            String valueOf;
            if (TextUtils.isEmpty(str)) {
                valueOf = String.valueOf(str);
                String str5 = "missing wakeLock key. ";
                Log.e(str4, valueOf.length() == 0 ? new String(str5) : str5.concat(valueOf));
                return;
            }
            int i3 = i;
            int i4 = i3 != 7 ? 8 : i3;
            long currentTimeMillis = System.currentTimeMillis();
            String str6 = "com.google.android.gms";
            List list3 = (list2 != null && list.size() == 1 && str6.equals(list2.get(0))) ? null : list2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int a = qbb.a(context);
            valueOf = context.getPackageName();
            try {
                context.startService(new Intent().setComponent(qat.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", new WakeLockEvent(currentTimeMillis, i4, str2, i2, list3, str, elapsedRealtime, a, null, !str6.equals(valueOf) ? valueOf : null, qbb.b(context), j)));
            } catch (Exception e) {
                Log.wtf(str4, e);
            }
        }
    }

    static {
        qau qau = new qau();
    }
}
