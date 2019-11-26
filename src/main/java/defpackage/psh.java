package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

/* renamed from: psh */
public class psh {
    public static final int c = psl.a;
    public static final psh d = new psh();

    psh() {
    }

    public final int c(Context context) {
        return psh.b(context, c);
    }

    public static int b(Context context, int i) {
        i = psl.a(context, i);
        return psl.c(context, i) ? 18 : i;
    }

    public static void c(Context context, int i) {
        psl.b(context, i);
    }

    public static Intent a(Context context, int i, String str) {
        String str2 = "com.google.android.gms";
        if (i != 1 && i != 2) {
            return i != 3 ? null : qan.a(str2);
        } else {
            if (context != null && qbc.b(context)) {
                return qan.a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("gcore_");
            stringBuilder.append(c);
            String str3 = "-";
            stringBuilder.append(str3);
            if (!TextUtils.isEmpty(str)) {
                stringBuilder.append(str);
            }
            stringBuilder.append(str3);
            if (context != null) {
                stringBuilder.append(context.getPackageName());
            }
            stringBuilder.append(str3);
            if (context != null) {
                try {
                    stringBuilder.append(qph.a(context).b(context.getPackageName(), 0).versionCode);
                } catch (NameNotFoundException unused) {
                }
            }
            return qan.a(str2, stringBuilder.toString());
        }
    }

    public final PendingIntent b(Context context, int i, String str) {
        Intent a = psh.a(context, i, str);
        return a != null ? PendingIntent.getActivity(context, 0, a, 134217728) : null;
    }

    public static void d(Context context) {
        if (!psl.b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public int a(Context context) {
        return psl.d(context);
    }
}
