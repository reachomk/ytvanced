package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import defpackage.anpw;
import defpackage.rm;

public final class FirebaseInstanceIdReceiver extends rm {
    private static anpw c;
    private static anpw d;

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                a(context, intent2, intent.getAction());
                return;
            }
            a(context, intent, intent.getAction());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x018a A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a8 A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a3 A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01fc A:{SYNTHETIC, Splitter:B:101:0x01fc} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018a A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a3 A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a8 A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01fc A:{SYNTHETIC, Splitter:B:101:0x01fc} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00db A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018a A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a8 A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a3 A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01fc A:{SYNTHETIC, Splitter:B:101:0x01fc} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00db A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018a A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a3 A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a8 A:{Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }} */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01fc A:{SYNTHETIC, Splitter:B:101:0x01fc} */
    private final void a(android.content.Context r10, android.content.Intent r11, java.lang.String r12) {
        /*
        r9 = this;
        r0 = 0;
        r11.setComponent(r0);
        r1 = r10.getPackageName();
        r11.setPackage(r1);
        r1 = "gcm.rawData64";
        r1 = r11.getStringExtra(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x0022;
    L_0x0014:
        r1 = android.util.Base64.decode(r1, r2);
        r3 = "rawData";
        r11.putExtra(r3, r1);
        r1 = "gcm.rawData64";
        r11.removeExtra(r1);
    L_0x0022:
        r1 = "from";
        r1 = r11.getStringExtra(r1);
        r3 = "google.com/iid";
        r1 = r3.equals(r1);
        if (r1 != 0) goto L_0x004e;
    L_0x0030:
        r1 = "com.google.firebase.INSTANCE_ID_EVENT";
        r1 = r1.equals(r12);
        if (r1 != 0) goto L_0x004e;
    L_0x0038:
        r1 = "com.google.android.c2dm.intent.RECEIVE";
        r1 = r1.equals(r12);
        if (r1 != 0) goto L_0x004b;
    L_0x0040:
        r1 = "com.google.firebase.MESSAGING_EVENT";
        r12 = r1.equals(r12);
        if (r12 == 0) goto L_0x0049;
    L_0x0048:
        goto L_0x004b;
    L_0x0049:
        r12 = r0;
        goto L_0x0050;
    L_0x004b:
        r12 = "com.google.firebase.MESSAGING_EVENT";
        goto L_0x0050;
    L_0x004e:
        r12 = "com.google.firebase.INSTANCE_ID_EVENT";
    L_0x0050:
        r1 = -1;
        if (r12 == 0) goto L_0x023b;
    L_0x0053:
        r3 = defpackage.qbf.c();
        if (r3 == 0) goto L_0x0079;
    L_0x0059:
        r3 = r10.getApplicationInfo();
        r3 = r3.targetSdkVersion;
        r4 = 26;
        if (r3 < r4) goto L_0x0079;
    L_0x0063:
        r0 = r9.isOrderedBroadcast();
        if (r0 == 0) goto L_0x006c;
    L_0x0069:
        r9.setResultCode(r1);
    L_0x006c:
        r10 = a(r10, r12);
        r12 = r9.goAsync();
        r10.a(r11, r12);
        goto L_0x023b;
    L_0x0079:
        r3 = defpackage.anpk.a();
        r4 = r12.hashCode();
        r5 = -842411455; // 0xffffffffcdc9d241 float:-4.23249952E8 double:NaN;
        r6 = 1;
        if (r4 == r5) goto L_0x0097;
    L_0x0087:
        r5 = 41532704; // 0x279bd20 float:1.8347907E-37 double:2.0519882E-316;
        if (r4 == r5) goto L_0x008d;
    L_0x008c:
        goto L_0x00a1;
    L_0x008d:
        r4 = "com.google.firebase.MESSAGING_EVENT";
        r4 = r12.equals(r4);
        if (r4 == 0) goto L_0x00a1;
    L_0x0095:
        r4 = 1;
        goto L_0x00a2;
    L_0x0097:
        r4 = "com.google.firebase.INSTANCE_ID_EVENT";
        r4 = r12.equals(r4);
        if (r4 == 0) goto L_0x00a1;
    L_0x009f:
        r4 = 0;
        goto L_0x00a2;
    L_0x00a1:
        r4 = -1;
    L_0x00a2:
        if (r4 == 0) goto L_0x00c7;
    L_0x00a4:
        if (r4 == r6) goto L_0x00c1;
    L_0x00a6:
        r10 = "Unknown service action: ";
        r11 = r12.length();
        if (r11 != 0) goto L_0x00b4;
    L_0x00ae:
        r11 = new java.lang.String;
        r11.<init>(r10);
        goto L_0x00b8;
    L_0x00b4:
        r11 = r10.concat(r12);
    L_0x00b8:
        r10 = "FirebaseInstanceId";
        android.util.Log.w(r10, r11);
        r1 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        goto L_0x023b;
    L_0x00c1:
        r4 = r3.d;
        r4.offer(r11);
        goto L_0x00cc;
    L_0x00c7:
        r4 = r3.c;
        r4.offer(r11);
    L_0x00cc:
        r11 = new android.content.Intent;
        r11.<init>(r12);
        r12 = r10.getPackageName();
        r11.setPackage(r12);
        r12 = r3.a;
        monitor-enter(r12);
        r4 = r3.a;	 Catch:{ all -> 0x0238 }
        r5 = r11.getAction();	 Catch:{ all -> 0x0238 }
        r4 = r4.get(r5);	 Catch:{ all -> 0x0238 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0238 }
        monitor-exit(r12);	 Catch:{ all -> 0x0238 }
        if (r4 != 0) goto L_0x017f;
    L_0x00ea:
        r12 = r10.getPackageManager();
        r12 = r12.resolveService(r11, r2);
        if (r12 != 0) goto L_0x00f6;
    L_0x00f4:
        goto L_0x0177;
    L_0x00f6:
        r4 = r12.serviceInfo;
        if (r4 == 0) goto L_0x0177;
    L_0x00fa:
        r12 = r12.serviceInfo;
        r4 = r10.getPackageName();
        r5 = r12.packageName;
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0141;
    L_0x0108:
        r4 = r12.name;
        if (r4 != 0) goto L_0x010d;
    L_0x010c:
        goto L_0x0141;
    L_0x010d:
        r12 = r12.name;
        r4 = ".";
        r4 = r12.startsWith(r4);
        if (r4 == 0) goto L_0x012f;
    L_0x0117:
        r4 = r10.getPackageName();
        r4 = java.lang.String.valueOf(r4);
        r5 = r12.length();
        if (r5 != 0) goto L_0x012b;
    L_0x0125:
        r12 = new java.lang.String;
        r12.<init>(r4);
        goto L_0x012f;
    L_0x012b:
        r12 = r4.concat(r12);
    L_0x012f:
        r4 = r12;
        r5 = r3.a;
        monitor-enter(r5);
        r12 = r3.a;	 Catch:{ all -> 0x013e }
        r7 = r11.getAction();	 Catch:{ all -> 0x013e }
        r12.put(r7, r4);	 Catch:{ all -> 0x013e }
        monitor-exit(r5);	 Catch:{ all -> 0x013e }
        goto L_0x017f;
    L_0x013e:
        r10 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x013e }
        throw r10;
    L_0x0141:
        r4 = r12.packageName;
        r12 = r12.name;
        r5 = java.lang.String.valueOf(r4);
        r5 = r5.length();
        r7 = java.lang.String.valueOf(r12);
        r7 = r7.length();
        r8 = new java.lang.StringBuilder;
        r5 = r5 + 94;
        r5 = r5 + r7;
        r8.<init>(r5);
        r5 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: ";
        r8.append(r5);
        r8.append(r4);
        r4 = "/";
        r8.append(r4);
        r8.append(r12);
        r12 = r8.toString();
        r4 = "FirebaseInstanceId";
        android.util.Log.e(r4, r12);
        goto L_0x0186;
    L_0x0177:
        r12 = "FirebaseInstanceId";
        r4 = "Failed to resolve target intent service, skipping classname enforcement";
        android.util.Log.e(r12, r4);
        goto L_0x0186;
    L_0x017f:
        r12 = r10.getPackageName();
        r11.setClassName(r12, r4);
    L_0x0186:
        r12 = r3.b;	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
        if (r12 != 0) goto L_0x019b;
    L_0x018a:
        r12 = "android.permission.WAKE_LOCK";
        r12 = r10.checkCallingOrSelfPermission(r12);	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
        if (r12 != 0) goto L_0x0194;
    L_0x0192:
        r12 = 1;
        goto L_0x0195;
    L_0x0194:
        r12 = 0;
    L_0x0195:
        r12 = java.lang.Boolean.valueOf(r12);	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
        r3.b = r12;	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
    L_0x019b:
        r12 = r3.b;	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
        r12 = r12.booleanValue();	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
        if (r12 != 0) goto L_0x01a8;
    L_0x01a3:
        r0 = r10.startService(r11);	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
        goto L_0x01fa;
    L_0x01a8:
        r12 = defpackage.rm.a;	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
        monitor-enter(r12);	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
        r3 = defpackage.rm.b;	 Catch:{ all -> 0x0206 }
        r4 = defpackage.rm.b;	 Catch:{ all -> 0x0206 }
        r4 = r4 + r6;
        defpackage.rm.b = r4;	 Catch:{ all -> 0x0206 }
        if (r4 <= 0) goto L_0x01b5;
    L_0x01b4:
        goto L_0x01b7;
    L_0x01b5:
        defpackage.rm.b = r6;	 Catch:{ all -> 0x0206 }
    L_0x01b7:
        r4 = "androidx.contentpager.content.wakelockid";
        r11.putExtra(r4, r3);	 Catch:{ all -> 0x0206 }
        r4 = "android.support.content.wakelockid";
        r11.putExtra(r4, r3);	 Catch:{ all -> 0x0206 }
        r11 = r10.startService(r11);	 Catch:{ all -> 0x0206 }
        if (r11 == 0) goto L_0x01f9;
    L_0x01c7:
        r0 = "power";
        r10 = r10.getSystemService(r0);	 Catch:{ all -> 0x0206 }
        r10 = (android.os.PowerManager) r10;	 Catch:{ all -> 0x0206 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0206 }
        r0.<init>();	 Catch:{ all -> 0x0206 }
        r4 = "androidx.core:wake:";
        r0.append(r4);	 Catch:{ all -> 0x0206 }
        r4 = r11.flattenToShortString();	 Catch:{ all -> 0x0206 }
        r0.append(r4);	 Catch:{ all -> 0x0206 }
        r0 = r0.toString();	 Catch:{ all -> 0x0206 }
        r10 = r10.newWakeLock(r6, r0);	 Catch:{ all -> 0x0206 }
        r10.setReferenceCounted(r2);	 Catch:{ all -> 0x0206 }
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r10.acquire(r4);	 Catch:{ all -> 0x0206 }
        r0 = defpackage.rm.a;	 Catch:{ all -> 0x0206 }
        r0.put(r3, r10);	 Catch:{ all -> 0x0206 }
        monitor-exit(r12);	 Catch:{ all -> 0x0206 }
        r0 = r11;
        goto L_0x01fa;
    L_0x01f9:
        monitor-exit(r12);	 Catch:{ all -> 0x0206 }
    L_0x01fa:
        if (r0 != 0) goto L_0x023b;
    L_0x01fc:
        r10 = "FirebaseInstanceId";
        r11 = "Error while delivering the message: ServiceIntent not found.";
        android.util.Log.e(r10, r11);	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
        r1 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        goto L_0x023b;
    L_0x0206:
        r10 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x0206 }
        throw r10;	 Catch:{ SecurityException -> 0x022d, IllegalStateException -> 0x0209 }
    L_0x0209:
        r10 = move-exception;
        r10 = java.lang.String.valueOf(r10);
        r11 = r10.length();
        r12 = new java.lang.StringBuilder;
        r11 = r11 + 45;
        r12.<init>(r11);
        r11 = "Failed to start service while in background: ";
        r12.append(r11);
        r12.append(r10);
        r10 = r12.toString();
        r11 = "FirebaseInstanceId";
        android.util.Log.e(r11, r10);
        r1 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        goto L_0x023b;
    L_0x022d:
        r10 = move-exception;
        r11 = "FirebaseInstanceId";
        r12 = "Error while delivering the message to the serviceIntent";
        android.util.Log.e(r11, r12, r10);
        r1 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        goto L_0x023b;
    L_0x0238:
        r10 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x0238 }
        throw r10;
    L_0x023b:
        r10 = r9.isOrderedBroadcast();
        if (r10 == 0) goto L_0x0244;
    L_0x0241:
        r9.setResultCode(r1);
    L_0x0244:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.a(android.content.Context, android.content.Intent, java.lang.String):void");
    }

    private static synchronized anpw a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            anpw anpw;
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (d == null) {
                    d = new anpw(context, str);
                }
                anpw = d;
                return anpw;
            }
            if (c == null) {
                c = new anpw(context, str);
            }
            anpw = c;
            return anpw;
        }
    }
}
