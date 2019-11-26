package defpackage;

import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anqv */
public final class anqv {
    private static anqv d;
    public final Context a;
    public Method b;
    public final AtomicInteger c = new AtomicInteger((int) SystemClock.elapsedRealtime());
    private Bundle e;
    private Method f;

    public static synchronized anqv a(Context context) {
        anqv anqv;
        synchronized (anqv.class) {
            if (d == null) {
                d = new anqv(context);
            }
            anqv = d;
        }
        return anqv;
    }

    public static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    private anqv(Context context) {
        this.a = context.getApplicationContext();
    }

    public static Method a(String str) {
        try {
            return Builder.class.getMethod(str, new Class[]{String.class});
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0114 A:{SYNTHETIC, Splitter:B:36:0x0114} */
    public final java.lang.String b(android.os.Bundle r14, java.lang.String r15) {
        /*
        r13 = this;
        r0 = defpackage.anqv.a(r14, r15);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x0155;
    L_0x000a:
        r0 = java.lang.String.valueOf(r15);
        r1 = "_loc_key";
        r2 = r1.length();
        if (r2 != 0) goto L_0x001c;
    L_0x0016:
        r2 = new java.lang.String;
        r2.<init>(r0);
        goto L_0x0020;
    L_0x001c:
        r2 = r0.concat(r1);
    L_0x0020:
        r0 = defpackage.anqv.a(r14, r2);
        r2 = android.text.TextUtils.isEmpty(r0);
        r3 = 0;
        if (r2 != 0) goto L_0x0154;
    L_0x002b:
        r2 = r13.a;
        r2 = r2.getResources();
        r4 = r13.a;
        r4 = r4.getPackageName();
        r5 = "string";
        r4 = r2.getIdentifier(r0, r5, r4);
        r5 = " Default value will be used.";
        r6 = 6;
        r7 = "FirebaseMessaging";
        if (r4 != 0) goto L_0x008a;
    L_0x0044:
        r14 = java.lang.String.valueOf(r15);
        r15 = r1.length();
        if (r15 != 0) goto L_0x0054;
    L_0x004e:
        r15 = new java.lang.String;
        r15.<init>(r14);
        goto L_0x0058;
    L_0x0054:
        r15 = r14.concat(r1);
    L_0x0058:
        r14 = r15.substring(r6);
        r15 = java.lang.String.valueOf(r14);
        r15 = r15.length();
        r1 = java.lang.String.valueOf(r0);
        r1 = r1.length();
        r2 = new java.lang.StringBuilder;
        r15 = r15 + 49;
        r15 = r15 + r1;
        r2.<init>(r15);
        r2.append(r14);
        r14 = " resource not found: ";
        r2.append(r14);
        r2.append(r0);
        r2.append(r5);
        r14 = r2.toString();
        android.util.Log.w(r7, r14);
        return r3;
    L_0x008a:
        r1 = java.lang.String.valueOf(r15);
        r8 = "_loc_args";
        r9 = r8.length();
        if (r9 != 0) goto L_0x009c;
    L_0x0096:
        r9 = new java.lang.String;
        r9.<init>(r1);
        goto L_0x00a0;
    L_0x009c:
        r9 = r1.concat(r8);
    L_0x00a0:
        r14 = defpackage.anqv.a(r14, r9);
        r1 = android.text.TextUtils.isEmpty(r14);
        r9 = ": ";
        if (r1 != 0) goto L_0x0111;
    L_0x00ac:
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x00c6 }
        r1.<init>(r14);	 Catch:{ JSONException -> 0x00c6 }
        r10 = r1.length();	 Catch:{ JSONException -> 0x00c6 }
        r10 = new java.lang.String[r10];	 Catch:{ JSONException -> 0x00c6 }
        r11 = 0;
    L_0x00b8:
        r12 = r10.length;	 Catch:{ JSONException -> 0x00c6 }
        if (r11 >= r12) goto L_0x0112;
    L_0x00bb:
        r12 = r1.opt(r11);	 Catch:{ JSONException -> 0x00c6 }
        r12 = (java.lang.String) r12;	 Catch:{ JSONException -> 0x00c6 }
        r10[r11] = r12;	 Catch:{ JSONException -> 0x00c6 }
        r11 = r11 + 1;
        goto L_0x00b8;
        r15 = java.lang.String.valueOf(r15);
        r1 = r8.length();
        if (r1 != 0) goto L_0x00d7;
    L_0x00d1:
        r1 = new java.lang.String;
        r1.<init>(r15);
        goto L_0x00db;
    L_0x00d7:
        r1 = r15.concat(r8);
    L_0x00db:
        r15 = r1.substring(r6);
        r1 = java.lang.String.valueOf(r15);
        r1 = r1.length();
        r6 = java.lang.String.valueOf(r14);
        r6 = r6.length();
        r8 = new java.lang.StringBuilder;
        r1 = r1 + 41;
        r1 = r1 + r6;
        r8.<init>(r1);
        r1 = "Malformed ";
        r8.append(r1);
        r8.append(r15);
        r8.append(r9);
        r8.append(r14);
        r14 = "  Default value will be used.";
        r8.append(r14);
        r14 = r8.toString();
        android.util.Log.w(r7, r14);
    L_0x0111:
        r10 = r3;
    L_0x0112:
        if (r10 == 0) goto L_0x014f;
    L_0x0114:
        r14 = r2.getString(r4, r10);	 Catch:{ MissingFormatArgumentException -> 0x0119 }
        return r14;
    L_0x0119:
        r14 = move-exception;
        r15 = java.util.Arrays.toString(r10);
        r1 = java.lang.String.valueOf(r0);
        r1 = r1.length();
        r2 = java.lang.String.valueOf(r15);
        r2 = r2.length();
        r4 = new java.lang.StringBuilder;
        r1 = r1 + 58;
        r1 = r1 + r2;
        r4.<init>(r1);
        r1 = "Missing format argument for ";
        r4.append(r1);
        r4.append(r0);
        r4.append(r9);
        r4.append(r15);
        r4.append(r5);
        r15 = r4.toString();
        android.util.Log.w(r7, r15, r14);
        return r3;
    L_0x014f:
        r14 = r2.getString(r4);
        return r14;
    L_0x0154:
        return r3;
    L_0x0155:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anqv.b(android.os.Bundle, java.lang.String):java.lang.String");
    }

    public final boolean a(int i) {
        if (VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.a.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder(77);
            stringBuilder.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            stringBuilder.append(i);
            Log.e("FirebaseMessaging", stringBuilder.toString());
            return false;
        } catch (NotFoundException unused) {
            return false;
        }
    }

    public final Integer b(String str) {
        if (VERSION.SDK_INT >= 21) {
            String str2 = "FirebaseMessaging";
            if (!TextUtils.isEmpty(str)) {
                Object str3;
                try {
                    str3 = Integer.valueOf(Color.parseColor(str3));
                    return str3;
                } catch (IllegalArgumentException unused) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 54);
                    stringBuilder.append("Color ");
                    stringBuilder.append(str3);
                    stringBuilder.append(" not valid. Notification will use default color.");
                    Log.w(str2, stringBuilder.toString());
                }
            }
            int i = a().getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                try {
                    return Integer.valueOf(ra.c(this.a, i));
                } catch (NotFoundException unused2) {
                    Log.w(str2, "Cannot find the color resource referenced in AndroidManifest.");
                }
            }
        }
        return null;
    }

    public final String c(String str) {
        String str2 = "fcm_fallback_notification_channel";
        String str3 = "Error while setting the notification channel";
        String str4 = "FirebaseMessaging";
        if (qbf.c()) {
            NotificationManager notificationManager = (NotificationManager) this.a.getSystemService(NotificationManager.class);
            try {
                if (this.f == null) {
                    this.f = notificationManager.getClass().getMethod("getNotificationChannel", new Class[]{String.class});
                }
                if (!TextUtils.isEmpty(str)) {
                    if (this.f.invoke(notificationManager, new Object[]{str}) != null) {
                        return str;
                    }
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + afy.av);
                    stringBuilder.append("Notification Channel requested (");
                    stringBuilder.append(str);
                    stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w(str4, stringBuilder.toString());
                }
                str = a().getString("com.google.firebase.messaging.default_notification_channel_id");
                if (TextUtils.isEmpty(str)) {
                    Log.w(str4, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                } else {
                    if (this.f.invoke(notificationManager, new Object[]{str}) != null) {
                        return str;
                    }
                    Log.w(str4, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                }
                if (this.f.invoke(notificationManager, new Object[]{str2}) == null) {
                    Object newInstance = Class.forName("android.app.NotificationChannel").getConstructor(new Class[]{String.class, CharSequence.class, Integer.TYPE}).newInstance(new Object[]{str2, this.a.getString(R.string.fcm_fallback_notification_channel_label), Integer.valueOf(3)});
                    notificationManager.getClass().getMethod("createNotificationChannel", new Class[]{r14}).invoke(notificationManager, new Object[]{newInstance});
                }
                return str2;
            } catch (InstantiationException e) {
                Log.e(str4, str3, e);
            } catch (InvocationTargetException e2) {
                Log.e(str4, str3, e2);
            } catch (NoSuchMethodException e3) {
                Log.e(str4, str3, e3);
            } catch (IllegalAccessException e4) {
                Log.e(str4, str3, e4);
            } catch (ClassNotFoundException e5) {
                Log.e(str4, str3, e5);
            } catch (SecurityException e6) {
                Log.e(str4, str3, e6);
            } catch (IllegalArgumentException e7) {
                Log.e(str4, str3, e7);
            } catch (LinkageError e8) {
                Log.e(str4, str3, e8);
            }
        }
        return null;
    }

    public static void a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    public final Bundle a() {
        Bundle bundle = this.e;
        if (bundle == null) {
            ApplicationInfo applicationInfo;
            try {
                applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
            } catch (NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo == null || applicationInfo.metaData == null) {
                bundle = Bundle.EMPTY;
            } else {
                this.e = applicationInfo.metaData;
                return this.e;
            }
        }
        return bundle;
    }
}
