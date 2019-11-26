package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: eju */
public final class eju implements afve {
    private final SharedPreferences a;
    private final xsc b;
    private final zzl c;

    public eju(SharedPreferences sharedPreferences, xsc xsc, zzl zzl) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = (xsc) amqw.a((Object) xsc);
        this.c = zzl;
    }

    public final afvg c(Context context) {
        return afvd.a(this, context);
    }

    public final boolean a() {
        return ejr.a(this.a);
    }

    public final boolean a(Context context) {
        return afxw.a(context);
    }

    public final long b() {
        SharedPreferences sharedPreferences = this.a;
        xsc xsc = this.b;
        long j = sharedPreferences.getLong("com.google.android.libraries.youtube.notification.pref.LAST_OS_NOTIFICATIONS_CHANGED_TIME_MS", 0);
        if (j == 0) {
            return -1;
        }
        return TimeUnit.MILLISECONDS.toSeconds(xsc.a() - j);
    }

    public final boolean b(Context context) {
        aume aume = this.c.b().e;
        if (aume == null) {
            aume = aume.af;
        }
        String str = aume.h;
        boolean z = true;
        if (!TextUtils.isEmpty(str) && VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str);
            if (notificationChannel == null) {
                afpf afpf = afpf.notification;
                str = String.valueOf(str);
                String str2 = "Android O+ Notification Channel does not exist: ";
                afpc.a(1, afpf, str.length() == 0 ? new String(str2) : str2.concat(str));
            } else if (notificationChannel.getImportance() == 0) {
                z = false;
            } else if (notificationChannel.getImportance() != -1000) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }
}
