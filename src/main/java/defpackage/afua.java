package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: afua */
public final class afua implements afwz {
    public final ContentResolver a = ((ContentResolver) amqw.a(this.c.getContentResolver()));
    private final zzl b;
    private final Context c;
    private final ScheduledExecutorService d;
    private final SharedPreferences e;

    public afua(Context context, zzl zzl, ScheduledExecutorService scheduledExecutorService, SharedPreferences sharedPreferences) {
        this.c = ((Context) amqw.a((Object) context)).getApplicationContext();
        this.b = (zzl) amqw.a((Object) zzl);
        this.d = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.e = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final void a(String str, boolean z, int i, long j, boolean z2) {
        if (afua.b(str)) {
            a(str, i);
        }
    }

    public final void a(String str) {
        if (afua.b(str)) {
            a(str, 0);
        }
    }

    private static boolean b(String str) {
        return str.equals("FEshared") || str.equals("FEnotifications_inbox");
    }

    private final void a(String str, int i) {
        if (a().b) {
            Editor edit = this.e.edit();
            String str2 = "com.google.android.libraries.youtube.notification.badgecount.badgecount";
            str = String.valueOf(str);
            edit.putInt(str.length() == 0 ? new String(str2) : str2.concat(str), i).apply();
            int i2 = this.e.getInt("com.google.android.libraries.youtube.notification.badgecount.badgecountFEshared", 0) + this.e.getInt("com.google.android.libraries.youtube.notification.badgecount.badgecountFEnotifications_inbox", 0);
            avmc a = a();
            avma avma = a.c;
            if (avma == null) {
                avma = avma.j;
            }
            str2 = "android.intent.action.BADGE_COUNT_UPDATE";
            String str3 = "badge_count";
            String str4 = "badge_count_package_name";
            String str5 = "badge_count_class_name";
            if ((a.a & 8) != 0) {
                if (!avma.f.isEmpty()) {
                    str2 = avma.f;
                }
                if (!avma.g.isEmpty()) {
                    str3 = avma.g;
                }
                if (!avma.h.isEmpty()) {
                    str4 = avma.h;
                }
                if (!avma.i.isEmpty()) {
                    str5 = avma.i;
                }
            }
            Intent intent = new Intent(str2);
            intent.putExtra(str3, i2);
            intent.putExtra(str4, this.c.getPackageName());
            if (b() != null) {
                intent.putExtra(str5, b());
                List queryBroadcastReceivers = this.c.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (!(queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty())) {
                    this.c.sendBroadcast(intent);
                    return;
                }
            }
            a = a();
            int checkCallingOrSelfPermission = this.c.checkCallingOrSelfPermission("com.sec.android.provider.badge.permission.READ");
            if (this.c.checkCallingOrSelfPermission("com.sec.android.provider.badge.permission.WRITE") == 0 || checkCallingOrSelfPermission == 0) {
                boolean z;
                avma = a.c;
                if (avma == null) {
                    avma = avma.j;
                }
                str2 = "class";
                str3 = "badgecount";
                Object obj = 1;
                if ((a.a & 8) == 0) {
                    z = true;
                } else {
                    z = avma.b.isEmpty();
                    if (!avma.c.isEmpty()) {
                        str2 = avma.c;
                    }
                    if (!avma.d.isEmpty()) {
                        str3 = avma.d;
                    }
                    if (!avma.e.isEmpty()) {
                        obj = null;
                    }
                }
                str4 = obj != null ? "content://com.sec.badge/apps" : avma.e;
                String str6 = !z ? avma.b : "package";
                String packageName = this.c.getPackageName();
                ContentValues contentValues = new ContentValues();
                contentValues.put(str3, Integer.valueOf(i2));
                if (i2 > 0) {
                    contentValues.put(str6, packageName);
                    str = b();
                    if (str != null) {
                        contentValues.put(str2, str);
                    }
                    return;
                }
                this.d.execute(new afuc(this, i2, str4, contentValues, str6, packageName));
            }
        }
    }

    private final avmc a() {
        avmc avmc;
        arvt b = this.b.b();
        if (b == null) {
            avmc = avmc.m;
        } else {
            avmc = b.q;
            if (avmc == null) {
                return avmc.m;
            }
        }
        return avmc;
    }

    private final String b() {
        Intent launchIntentForPackage = this.c.getPackageManager().getLaunchIntentForPackage(this.c.getPackageName());
        if (launchIntentForPackage != null) {
            ComponentName component = launchIntentForPackage.getComponent();
            if (component != null) {
                return component.getClassName();
            }
        }
        return null;
    }
}
