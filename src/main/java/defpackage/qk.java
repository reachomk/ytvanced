package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: qk */
public final class qk {
    private static final Object a = new Object();
    private static String b;
    private static Set c = new HashSet();
    private static final Object f = new Object();
    private static qo g;
    private final Context d;
    private final NotificationManager e = ((NotificationManager) this.d.getSystemService("notification"));

    public static qk a(Context context) {
        return new qk(context);
    }

    private qk(Context context) {
        this.d = context;
    }

    public final void a(int i) {
        a(null, i);
    }

    public final void a(String str, int i) {
        this.e.cancel(str, i);
        if (VERSION.SDK_INT <= 19) {
            a(new qn(this.d.getPackageName(), i, str));
        }
    }

    public final void a(int i, Notification notification) {
        a(null, i, notification);
    }

    public final void a(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.e.notify(str, i, notification);
            return;
        }
        a(new qm(this.d.getPackageName(), i, str, notification));
        this.e.cancel(str, i);
    }

    public final boolean a() {
        if (VERSION.SDK_INT >= 24) {
            return this.e.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.d.getSystemService("appops");
        ApplicationInfo applicationInfo = this.d.getApplicationInfo();
        String packageName = this.d.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            if (((Integer) Class.forName(AppOpsManager.class.getName()).getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) r4.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public static Set b(Context context) {
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a) {
            if (string != null) {
                if (!string.equals(b)) {
                    HashSet hashSet = new HashSet(r3);
                    for (String unflattenFromString : string.split(":", -1)) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    c = hashSet;
                    b = string;
                }
            }
        }
        return c;
    }

    private final void a(qq qqVar) {
        synchronized (f) {
            if (g == null) {
                g = new qo(this.d.getApplicationContext());
            }
            g.a.obtainMessage(0, qqVar).sendToTarget();
        }
    }
}
