package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: afxs */
public class afxs {
    public final String a;
    public final SharedPreferences b;
    public final abev c;
    public final xsv d;
    public final afve e;
    public final Context f;
    private final ScheduledExecutorService g;
    private final bcaa h;
    private final zzl i;

    public afxs(bcaa bcaa, String str, SharedPreferences sharedPreferences, abev abev, ScheduledExecutorService scheduledExecutorService, xsv xsv, afve afve, Context context, zzl zzl) {
        this.h = bcaa;
        this.a = xvd.a(str);
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.c = (abev) amqw.a((Object) abev);
        this.g = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.d = (xsv) amqw.a((Object) xsv);
        this.e = (afve) amqw.a((Object) afve);
        this.f = context;
        this.i = zzl;
    }

    public final void b() {
        this.g.execute(new afxr(this));
    }

    public final void a(boolean z, xsc xsc) {
        this.g.schedule(new afxu(this, z, xsc), 3, TimeUnit.SECONDS);
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:6:0x0017, code skipped:
            if (r0.i == false) goto L_0x0019;
     */
    public boolean a(defpackage.xsc r13) {
        /*
        r12 = this;
        r0 = r12.i;
        r0 = r0.b();
        r1 = 1;
        if (r0 == 0) goto L_0x0019;
    L_0x0009:
        r0 = r12.i;
        r0 = r0.b();
        r0 = r0.q;
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        r0 = defpackage.avmc.m;
    L_0x0015:
        r0 = r0.i;
        if (r0 != 0) goto L_0x0182;
    L_0x0019:
        r0 = r12.e;
        r2 = r12.b;
        r3 = r12.f;
        r4 = r12.i;
        r5 = r0.a(r3);
        r6 = "com.google.android.libraries.youtube.notification.pref.last_os_notifications_enabled";
        r7 = 0;
        r8 = r2.getBoolean(r6, r7);
        r9 = r2.contains(r6);
        r10 = "com.google.android.libraries.youtube.notification.pref.LAST_OS_NOTIFICATIONS_CHANGED_TIME_MS";
        r11 = r2.contains(r10);
        if (r11 != 0) goto L_0x0039;
    L_0x0038:
        goto L_0x003d;
    L_0x0039:
        if (r9 == 0) goto L_0x003d;
    L_0x003b:
        if (r8 == r5) goto L_0x004c;
    L_0x003d:
        r5 = r2.edit();
        r8 = r13.a();
        r5 = r5.putLong(r10, r8);
        r5.apply();
    L_0x004c:
        r5 = r0.a();
        r8 = "com.google.android.libraries.youtube.notification.pref.last_notifications_settings_enabled";
        r9 = r2.getBoolean(r8, r7);
        r10 = r2.contains(r8);
        r11 = r2.edit();
        r8 = r11.putBoolean(r8, r5);
        r8.apply();
        if (r10 != 0) goto L_0x0069;
    L_0x0067:
        r5 = 1;
        goto L_0x006c;
    L_0x0069:
        if (r9 != r5) goto L_0x0067;
    L_0x006b:
        r5 = 0;
    L_0x006c:
        r0 = r0.a(r3);
        r8 = r2.getBoolean(r6, r7);
        r9 = r2.contains(r6);
        r10 = r2.edit();
        r6 = r10.putBoolean(r6, r0);
        r6.apply();
        if (r9 != 0) goto L_0x0087;
    L_0x0085:
        r0 = 1;
        goto L_0x008b;
    L_0x0087:
        if (r8 == r0) goto L_0x008a;
    L_0x0089:
        goto L_0x0085;
    L_0x008a:
        r0 = 0;
    L_0x008b:
        r0 = r0 | r5;
        r5 = 0;
        r8 = "com.google.android.libraries.youtube.notification.pref.last_notification_registration_time";
        r5 = r2.getLong(r8, r5);
        r5 = java.lang.Long.valueOf(r5);
        r5 = r5.longValue();
        r8 = r13.a();
        r8 = r8 - r5;
        r5 = 604800000; // 0x240c8400 float:3.046947E-17 double:2.988109026E-315;
        if (r4 == 0) goto L_0x00ce;
    L_0x00a6:
        r13 = r4.b();
        if (r13 == 0) goto L_0x00ce;
    L_0x00ac:
        r13 = r4.b();
        r13 = r13.q;
        if (r13 != 0) goto L_0x00b6;
    L_0x00b4:
        r13 = defpackage.avmc.m;
    L_0x00b6:
        r13 = r13.j;
        if (r13 != 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x00ce;
    L_0x00bb:
        r13 = java.util.concurrent.TimeUnit.DAYS;
        r4 = r4.b();
        r4 = r4.q;
        if (r4 != 0) goto L_0x00c7;
    L_0x00c5:
        r4 = defpackage.avmc.m;
    L_0x00c7:
        r4 = r4.j;
        r4 = (long) r4;
        r5 = r13.toMillis(r4);
    L_0x00ce:
        r13 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r13 < 0) goto L_0x00d4;
    L_0x00d2:
        r13 = 1;
        goto L_0x00d5;
    L_0x00d4:
        r13 = 0;
    L_0x00d5:
        r13 = r13 | r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r4 = 26;
        if (r0 < r4) goto L_0x0170;
    L_0x00dc:
        r0 = "notification";
        r0 = r3.getSystemService(r0);
        r0 = (android.app.NotificationManager) r0;
        r0 = r0.getNotificationChannels();
        r0 = r0.iterator();
        r3 = 0;
    L_0x00ed:
        r4 = r0.hasNext();
        if (r4 == 0) goto L_0x0171;
    L_0x00f3:
        r4 = r0.next();
        r4 = (android.app.NotificationChannel) r4;
        r5 = r4.getImportance();
        r6 = r4.getSound();
        if (r6 != 0) goto L_0x0105;
    L_0x0103:
        r6 = 1;
        goto L_0x0106;
    L_0x0105:
        r6 = 0;
    L_0x0106:
        r8 = "com.google.android.libraries.youtube.notification.pref.notification_channel_importance";
        r9 = r4.getId();
        r9 = java.lang.String.valueOf(r9);
        r10 = r9.length();
        if (r10 != 0) goto L_0x011c;
    L_0x0116:
        r9 = new java.lang.String;
        r9.<init>(r8);
        goto L_0x0120;
    L_0x011c:
        r9 = r8.concat(r9);
    L_0x0120:
        r8 = "com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled";
        r4 = r4.getId();
        r4 = java.lang.String.valueOf(r4);
        r10 = r4.length();
        if (r10 != 0) goto L_0x0136;
    L_0x0130:
        r4 = new java.lang.String;
        r4.<init>(r8);
        goto L_0x013a;
    L_0x0136:
        r4 = r8.concat(r4);
    L_0x013a:
        r8 = r2.getInt(r9, r7);
        r10 = r2.contains(r9);
        r11 = r2.edit();
        r9 = r11.putInt(r9, r5);
        r9.apply();
        if (r10 != 0) goto L_0x0151;
    L_0x014f:
        r4 = 1;
        goto L_0x016d;
    L_0x0151:
        if (r8 == r5) goto L_0x0154;
    L_0x0153:
        goto L_0x014f;
    L_0x0154:
        r5 = r2.getBoolean(r4, r7);
        r8 = r2.contains(r4);
        r9 = r2.edit();
        r4 = r9.putBoolean(r4, r6);
        r4.apply();
        if (r8 == 0) goto L_0x014f;
    L_0x0169:
        if (r5 == r6) goto L_0x016c;
    L_0x016b:
        goto L_0x014f;
    L_0x016c:
        r4 = 0;
    L_0x016d:
        r3 = r3 | r4;
        goto L_0x00ed;
    L_0x0170:
        r3 = 0;
    L_0x0171:
        r13 = r13 | r3;
        if (r13 != 0) goto L_0x017f;
    L_0x0174:
        r13 = r12.b;
        r0 = "pending_notification_registration";
        r13 = r13.getBoolean(r0, r7);
        if (r13 != 0) goto L_0x0182;
    L_0x017e:
        return r7;
    L_0x017f:
        defpackage.afxw.a(r2);
    L_0x0182:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxs.a(xsc):boolean");
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a() {
        return c();
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        String str = "Could not register with GCM (unexpected Error): ";
        xsw a = this.d.a();
        do {
            try {
                a(((tkd) this.h.get()).a(this.a, "GCM"));
                return true;
            } catch (IOException e) {
                xtl.b("Could not register with GCM: ", e);
                if (!a.a()) {
                    return false;
                }
            } catch (IllegalAccessError e2) {
                xtl.b(str, e2);
                return false;
            } catch (UnsupportedOperationException e3) {
                str = String.valueOf(e3);
                StringBuilder stringBuilder = new StringBuilder(str.length() + 65);
                stringBuilder.append("NotificationRegistrar.registerWithGcmBlocking: Exception thrown: ");
                stringBuilder.append(str);
                xtl.d(stringBuilder.toString());
                return false;
            } catch (IncompatibleClassChangeError e22) {
                xtl.b(str, e22);
                return false;
            }
        } while (a.a());
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.equals(d());
            this.b.edit().putString("gcm_registration_id", str).apply();
        }
    }

    public final String d() {
        String string = this.b.getString("gcm_registration_id", "");
        return TextUtils.isEmpty(string) ? null : string;
    }
}
