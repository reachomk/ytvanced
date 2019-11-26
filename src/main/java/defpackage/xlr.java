package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: xlr */
public final class xlr {
    public static qg a(qg qgVar, String str) {
        if (VERSION.SDK_INT >= 26) {
            qgVar.x = str;
        }
        return qgVar;
    }

    public static qg a(qg qgVar) {
        if (VERSION.SDK_INT >= 26) {
            qgVar.x = "generic_notifications";
        }
        return qgVar;
    }

    public static qg a(qg qgVar, Context context) {
        if (VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            String num = Integer.toString(7);
            if (notificationManager.getNotificationChannel(num) == null) {
                return xlr.a(qgVar);
            }
            qgVar.x = num;
        }
        return qgVar;
    }

    public static void a(Context context, String str, String str2) {
        if (VERSION.SDK_INT >= 26) {
            xlr.a(context, str, str2, 2, false, true);
        }
    }

    public static void a(Context context, String str, String str2, int i, boolean z, boolean z2) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setShowBadge(z);
        if (!z2) {
            notificationChannel.setSound(null, null);
        }
        try {
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (IllegalArgumentException unused) {
        }
    }
}
