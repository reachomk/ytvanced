package defpackage;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri.Builder;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: dgh */
public final class dgh {
    public static final Object a = new Object();
    public static dgb b = null;

    public static long a(Context context) {
        return context.getSharedPreferences("google_conversion", 0).getLong("last_retry_time", 0);
    }

    private static String a(dgi dgi) {
        if (dgi == null) {
            return null;
        }
        return !dgi.b ? "0" : "1";
    }

    public static void a(Context context, String str, String str2) {
        Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, true);
        edit.commit();
    }

    public static void b(Context context) {
        Editor edit = context.getSharedPreferences("google_conversion", 0).edit();
        edit.putLong("last_retry_time", System.currentTimeMillis());
        edit.commit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00bf */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ac */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A:{SYNTHETIC, Splitter:B:1:0x000c, ExcHandler: dgk | dgl | IOException | IllegalStateException (unused java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:57:0x00db, code skipped:
            r8 = null;
     */
    public static java.lang.String a(android.content.Context r20, defpackage.dgg r21) {
        /*
        r1 = r21;
        r2 = "";
        r0 = new dfs;
        r3 = r20;
        r0.<init>(r3);
        r4 = 0;
        r6 = r0.a;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r0 = "Calling this from your main thread can lead to deadlock";
        r7 = android.os.Looper.myLooper();	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r8 = android.os.Looper.getMainLooper();	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        if (r7 == r8) goto L_0x00d5;
    L_0x001a:
        r0 = r6.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00cf }
        r7 = "com.android.vending";
        r0.getPackageInfo(r7, r4);	 Catch:{ NameNotFoundException -> 0x00cf }
        r0 = defpackage.dgn.a(r6);	 Catch:{ dgl -> 0x00c8 }
        if (r0 == 0) goto L_0x0053;
    L_0x0029:
        r6 = defpackage.dgn.a(r0);	 Catch:{ dgl -> 0x00c8 }
        r7 = "GooglePlayServicesUtil";
        r8 = new java.lang.StringBuilder;	 Catch:{ dgl -> 0x00c8 }
        r8.<init>();	 Catch:{ dgl -> 0x00c8 }
        r9 = "GooglePlayServices not available due to error ";
        r8.append(r9);	 Catch:{ dgl -> 0x00c8 }
        r8.append(r0);	 Catch:{ dgl -> 0x00c8 }
        r0 = r8.toString();	 Catch:{ dgl -> 0x00c8 }
        android.util.Log.e(r7, r0);	 Catch:{ dgl -> 0x00c8 }
        if (r6 == 0) goto L_0x004d;
    L_0x0045:
        r0 = new dgk;	 Catch:{ dgl -> 0x00c8 }
        r6 = "Google Play Services not available";
        r0.<init>(r6);	 Catch:{ dgl -> 0x00c8 }
        throw r0;	 Catch:{ dgl -> 0x00c8 }
    L_0x004d:
        r0 = new dgl;	 Catch:{ dgl -> 0x00c8 }
        r0.<init>();	 Catch:{ dgl -> 0x00c8 }
        throw r0;	 Catch:{ dgl -> 0x00c8 }
    L_0x0053:
        r7 = new dgp;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r7.<init>();	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r0 = new android.content.Intent;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r8 = "com.google.android.gms.ads.identifier.service.START";
        r0.<init>(r8);	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r8 = "com.google.android.gms";
        r0.setPackage(r8);	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r8 = 1;
        r0 = r6.bindService(r0, r7, r8);	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        if (r0 == 0) goto L_0x00c0;
    L_0x006b:
        r0 = r7.a;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        if (r0 != 0) goto L_0x00a4;
    L_0x006f:
        r7.a = r8;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r0 = r7.b;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r0 = r0.take();	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r0 = (android.os.IBinder) r0;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        if (r0 == 0) goto L_0x0092;
    L_0x007b:
        r8 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        r8 = r0.queryLocalInterface(r8);	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        if (r8 == 0) goto L_0x008b;
    L_0x0083:
        r9 = r8 instanceof defpackage.dgr;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        if (r9 == 0) goto L_0x008b;
    L_0x0087:
        r0 = r8;
        r0 = (defpackage.dgr) r0;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        goto L_0x0093;
    L_0x008b:
        r8 = new dgq;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r8.<init>(r0);	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r0 = r8;
        goto L_0x0093;
    L_0x0092:
        r0 = 0;
    L_0x0093:
        r8 = new dgi;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r9 = r0.a();	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r0 = r0.b();	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r8.<init>(r9, r0);	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r6.unbindService(r7);	 Catch:{ IllegalArgumentException -> 0x00dc }
        goto L_0x00dc;
    L_0x00a4:
        r0 = new java.lang.IllegalStateException;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        r0.<init>();	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
        throw r0;	 Catch:{ RemoteException -> 0x00b4, InterruptedException -> 0x00ac }
    L_0x00aa:
        r0 = move-exception;
        goto L_0x00bc;
    L_0x00ac:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x00aa }
        r8 = "Interrupted exception";
        r0.<init>(r8);	 Catch:{ all -> 0x00aa }
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x00b4:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x00aa }
        r8 = "Remote exception";
        r0.<init>(r8);	 Catch:{ all -> 0x00aa }
        throw r0;	 Catch:{ all -> 0x00aa }
    L_0x00bc:
        r6.unbindService(r7);	 Catch:{ IllegalArgumentException -> 0x00bf }
    L_0x00bf:
        throw r0;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
    L_0x00c0:
        r0 = new java.io.IOException;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r6 = "Connection failure";
        r0.<init>(r6);	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        throw r0;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
    L_0x00c8:
        r0 = move-exception;
        r6 = new java.io.IOException;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r6.<init>(r0);	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        throw r6;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
    L_0x00cf:
        r0 = new dgl;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r0.<init>();	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        throw r0;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
    L_0x00d5:
        r6 = new java.lang.IllegalStateException;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        r6.<init>(r0);	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
        throw r6;	 Catch:{ dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db, dgk | dgl | IOException | IllegalStateException -> 0x00db }
    L_0x00db:
        r8 = 0;
    L_0x00dc:
        r6 = r20.getPackageName();
        r0 = r20.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00eb }
        r0 = r0.getPackageInfo(r6, r4);	 Catch:{ NameNotFoundException -> 0x00eb }
        r0 = r0.versionName;	 Catch:{ NameNotFoundException -> 0x00eb }
        goto L_0x00f4;
    L_0x00eb:
        r0 = move-exception;
        r7 = "GoogleConversionReporter";
        r9 = "Error to retrieve app version";
        android.util.Log.w(r7, r9, r0);
        r0 = r2;
    L_0x00f4:
        r7 = "null";
        if (r8 != 0) goto L_0x011b;
    L_0x00f8:
        r3 = r20.getContentResolver();
        r9 = "android_id";
        r3 = android.provider.Settings.Secure.getString(r3, r9);
        if (r3 != 0) goto L_0x0105;
    L_0x0104:
        r3 = r7;
    L_0x0105:
        r9 = "MD5";
        r9 = java.security.MessageDigest.getInstance(r9);
        r3 = r3.getBytes();
        r9.update(r3);
        r3 = r9.digest();
        r3 = defpackage.dgs.a(r3);
        goto L_0x011c;
    L_0x011b:
        r3 = 0;
    L_0x011c:
        r9 = r1.c;
        r10 = "ct-sdk-a-v2.2.4";
        r11 = "sdkversion";
        r12 = "osversion";
        r13 = "appversion";
        r14 = "bundleid";
        r15 = "timestamp";
        r4 = "=";
        r5 = ";";
        if (r9 != 0) goto L_0x0219;
    L_0x0130:
        r9 = defpackage.dgj.b;
        if (r9 == 0) goto L_0x0136;
    L_0x0134:
        goto L_0x0219;
    L_0x0136:
        r2 = new java.lang.StringBuilder;
        r7 = "https://pubads.g.doubleclick.net/activity;xsp=";
        r1 = r1.a;
        r9 = "ait";
        r16 = android.os.Build.VERSION.RELEASE;
        r20 = r3;
        r3 = java.lang.String.valueOf(r16);
        r16 = java.lang.System.currentTimeMillis();
        r18 = r8;
        r8 = defpackage.dgh.a(r16);
        r16 = r2;
        r2 = new java.lang.StringBuilder;
        r17 = r7.length();
        r17 = r17 + 13;
        r19 = java.lang.String.valueOf(r1);
        r19 = r19.length();
        r17 = r17 + r19;
        r19 = r9.length();
        r17 = r17 + r19;
        r19 = r14.length();
        r17 = r17 + r19;
        r19 = java.lang.String.valueOf(r6);
        r19 = r19.length();
        r17 = r17 + r19;
        r19 = r13.length();
        r17 = r17 + r19;
        r19 = java.lang.String.valueOf(r0);
        r19 = r19.length();
        r17 = r17 + r19;
        r19 = r12.length();
        r17 = r17 + r19;
        r19 = r3.length();
        r17 = r17 + r19;
        r19 = r11.length();
        r17 = r17 + r19;
        r19 = r10.length();
        r17 = r17 + r19;
        r19 = r15.length();
        r17 = r17 + r19;
        r19 = java.lang.String.valueOf(r8);
        r19 = r19.length();
        r21 = r8;
        r8 = r17 + r19;
        r2.<init>(r8);
        r2.append(r7);
        r2.append(r1);
        r2.append(r5);
        r2.append(r9);
        r1 = "=1;";
        r2.append(r1);
        r2.append(r14);
        r2.append(r4);
        r2.append(r6);
        r2.append(r5);
        r2.append(r13);
        r2.append(r4);
        r2.append(r0);
        r2.append(r5);
        r2.append(r12);
        r2.append(r4);
        r2.append(r3);
        r2.append(r5);
        r2.append(r11);
        r2.append(r4);
        r2.append(r10);
        r2.append(r5);
        r2.append(r15);
        r2.append(r4);
        r0 = r21;
        r2.append(r0);
        r0 = r2.toString();
        r1 = r16;
        r1.<init>(r0);
        r3 = r20;
        r8 = r18;
        defpackage.dgh.a(r1, r8, r3);
        r5 = r1.toString();
        goto L_0x0401;
    L_0x0219:
        r9 = defpackage.dgj.a;
        if (r9 == 0) goto L_0x0382;
    L_0x021d:
        r4 = defpackage.dgj.c;
        r5 = "https://www.googleadservices.com/pagead/conversion/";
        if (r4 == 0) goto L_0x0342;
    L_0x0223:
        r4 = android.net.Uri.parse(r5);
        r4 = r4.buildUpon();
        r5 = r1.a;
        r5 = java.lang.String.valueOf(r5);
        r7 = "/";
        r5 = r5.concat(r7);
        r4 = r4.appendEncodedPath(r5);
        r4 = r4.appendQueryParameter(r14, r6);
        r0 = r4.appendQueryParameter(r13, r0);
        r4 = android.os.Build.VERSION.RELEASE;
        r0 = r0.appendQueryParameter(r12, r4);
        r0 = r0.appendQueryParameter(r11, r10);
        r4 = "1";
        if (r8 != 0) goto L_0x0254;
    L_0x0251:
        r5 = "0";
        goto L_0x0255;
    L_0x0254:
        r5 = r4;
    L_0x0255:
        r6 = "gms";
        r0 = r0.appendQueryParameter(r6, r5);
        defpackage.dgh.a(r0, r8, r3);
        r5 = r1.e;
        r7 = 0;
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x0272;
    L_0x0266:
        r5 = java.lang.System.currentTimeMillis();
        r3 = defpackage.dgh.a(r5);
        r0.appendQueryParameter(r15, r3);
        goto L_0x0279;
    L_0x0272:
        r3 = defpackage.dgh.a(r5);
        r0.appendQueryParameter(r15, r3);
    L_0x0279:
        r3 = r1.c;
        if (r3 != 0) goto L_0x027e;
    L_0x027d:
        goto L_0x0283;
    L_0x027e:
        r3 = "remarketing_only";
        r0.appendQueryParameter(r3, r4);
    L_0x0283:
        r3 = r1.f;
        if (r3 != 0) goto L_0x0288;
    L_0x0287:
        goto L_0x028d;
    L_0x0288:
        r3 = "auto";
        r0.appendQueryParameter(r3, r4);
    L_0x028d:
        r3 = r1.b;
        if (r3 != 0) goto L_0x0299;
    L_0x0291:
        r3 = "usage_tracking_enabled";
        r4 = "0";
        r0.appendQueryParameter(r3, r4);
        goto L_0x029e;
    L_0x0299:
        r3 = "usage_tracking_enabled";
        r0.appendQueryParameter(r3, r4);
    L_0x029e:
        r3 = r1.c;
        r1 = r1.d;
        if (r3 != 0) goto L_0x02a6;
    L_0x02a4:
        goto L_0x0320;
    L_0x02a6:
        if (r1 == 0) goto L_0x0320;
    L_0x02a8:
        r1 = r1.entrySet();
        r1 = r1.iterator();
    L_0x02b0:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0320;
    L_0x02b6:
        r3 = r1.next();
        r3 = (java.util.Map.Entry) r3;
        r4 = r3.getValue();
        r4 = r4 instanceof java.lang.String;
        if (r4 == 0) goto L_0x02ea;
    L_0x02c4:
        r4 = "data.";
        r5 = r3.getKey();
        r5 = (java.lang.String) r5;
        r5 = java.lang.String.valueOf(r5);
        r6 = r5.length();
        if (r6 != 0) goto L_0x02dc;
    L_0x02d6:
        r5 = new java.lang.String;
        r5.<init>(r4);
        goto L_0x02e0;
    L_0x02dc:
        r5 = r4.concat(r5);
    L_0x02e0:
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r0.appendQueryParameter(r5, r3);
        goto L_0x02b0;
    L_0x02ea:
        r4 = r3.getValue();
        r4 = r4 instanceof java.lang.String[];
        if (r4 == 0) goto L_0x02b0;
    L_0x02f2:
        r4 = r3.getValue();
        r4 = (java.lang.String[]) r4;
        r5 = r4.length;
        r6 = 0;
    L_0x02fa:
        if (r6 >= r5) goto L_0x02b0;
    L_0x02fc:
        r7 = r4[r6];
        r8 = "data.";
        r9 = r3.getKey();
        r9 = (java.lang.String) r9;
        r9 = java.lang.String.valueOf(r9);
        r10 = r9.length();
        if (r10 != 0) goto L_0x0316;
    L_0x0310:
        r9 = new java.lang.String;
        r9.<init>(r8);
        goto L_0x031a;
    L_0x0316:
        r9 = r8.concat(r9);
    L_0x031a:
        r0.appendQueryParameter(r9, r7);
        r6 = r6 + 1;
        goto L_0x02fa;
    L_0x0320:
        r0 = r0.build();
        r0 = java.lang.String.valueOf(r0);
        r1 = new java.lang.StringBuilder;
        r3 = r0.length();
        r4 = r2.length();
        r3 = r3 + r4;
        r1.<init>(r3);
        r1.append(r0);
        r1.append(r2);
        r5 = r1.toString();
        goto L_0x0401;
    L_0x0342:
        r1 = android.net.Uri.parse(r5);
        r1 = r1.buildUpon();
        r2 = "sku";
        r4 = 0;
        r1 = r1.appendQueryParameter(r2, r4);
        r2 = "value";
        r1 = r1.appendQueryParameter(r2, r4);
        r1 = r1.appendQueryParameter(r14, r6);
        r0 = r1.appendQueryParameter(r13, r0);
        r1 = android.os.Build.VERSION.RELEASE;
        r0 = r0.appendQueryParameter(r12, r1);
        r0 = r0.appendQueryParameter(r11, r10);
        r1 = java.lang.System.currentTimeMillis();
        r1 = defpackage.dgh.a(r1);
        r0 = r0.appendQueryParameter(r15, r1);
        defpackage.dgh.a(r0, r8, r3);
        r0 = r0.build();
        r5 = r0.toString();
        goto L_0x0401;
    L_0x0382:
        if (r8 != 0) goto L_0x0387;
    L_0x0384:
        r5 = 0;
        goto L_0x0401;
    L_0x0387:
        r0 = new java.lang.StringBuilder;
        r2 = "https://pubads.g.doubleclick.net/activity;dc_iu=";
        r3 = r7.length();
        if (r3 != 0) goto L_0x0397;
    L_0x0391:
        r3 = new java.lang.String;
        r3.<init>(r2);
        goto L_0x039b;
    L_0x0397:
        r3 = r2.concat(r7);
    L_0x039b:
        r0.<init>(r3);
        r2 = 0;
        defpackage.dgh.a(r0, r8, r2);
        r1 = r1.d;
        if (r1 != 0) goto L_0x03a7;
    L_0x03a6:
        goto L_0x03fd;
    L_0x03a7:
        r1 = r1.entrySet();
        r1 = r1.iterator();
    L_0x03af:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x03fd;
    L_0x03b5:
        r2 = r1.next();
        r2 = (java.util.Map.Entry) r2;
        r3 = r2.getKey();
        r3 = (java.lang.String) r3;
        r3 = android.net.Uri.encode(r3);
        r2 = r2.getValue();
        r2 = r2.toString();
        r2 = android.net.Uri.encode(r2);
        r6 = new java.lang.StringBuilder;
        r7 = java.lang.String.valueOf(r3);
        r7 = r7.length();
        r7 = r7 + 2;
        r8 = java.lang.String.valueOf(r2);
        r8 = r8.length();
        r7 = r7 + r8;
        r6.<init>(r7);
        r6.append(r5);
        r6.append(r3);
        r6.append(r4);
        r6.append(r2);
        r2 = r6.toString();
        r0.append(r2);
        goto L_0x03af;
    L_0x03fd:
        r5 = r0.toString();
    L_0x0401:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgh.a(android.content.Context, dgg):java.lang.String");
    }

    private static String a(long j) {
        return String.format(Locale.US, "%d.%03d", new Object[]{Long.valueOf(j / 1000), Long.valueOf(j % 1000)});
    }

    private static void a(StringBuilder stringBuilder, dgi dgi, String str) {
        String a = dgh.a(dgi);
        if (a != null) {
            String str2 = ";dc_lat=";
            if (a.length() == 0) {
                a = new String(str2);
            } else {
                a = str2.concat(a);
            }
            stringBuilder.append(a);
        }
        String valueOf;
        if (dgi != null) {
            str = ";dc_rdid=";
            valueOf = String.valueOf(dgi.a);
            stringBuilder.append(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            return;
        }
        valueOf = ";isu=";
        str = String.valueOf(str);
        stringBuilder.append(str.length() == 0 ? new String(valueOf) : valueOf.concat(str));
    }

    private static void a(Builder builder, dgi dgi, String str) {
        if (dgh.a(dgi) != null) {
            builder.appendQueryParameter("lat", dgh.a(dgi));
        }
        if (dgi != null) {
            builder.appendQueryParameter("rdid", dgi.a);
            return;
        }
        builder.appendQueryParameter("muid", str);
    }

    static long a() {
        return System.currentTimeMillis();
    }

    public static boolean c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
        }
        return true;
    }

    static {
        HashMap hashMap = new HashMap();
    }
}
