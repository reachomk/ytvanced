package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: anpl */
public final class anpl implements Runnable {
    private final long a;
    private final WakeLock b = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    private final FirebaseInstanceId c;
    private final anpc d;
    private final anpn e;

    public anpl(FirebaseInstanceId firebaseInstanceId, anpc anpc, anpn anpn, long j) {
        this.c = firebaseInstanceId;
        this.d = anpc;
        this.e = anpn;
        this.a = j;
        this.b.setReferenceCounted(false);
    }

    /* JADX WARNING: Missing block: B:36:?, code skipped:
            r13.c.a(false);
     */
    /* JADX WARNING: Missing block: B:40:?, code skipped:
            r5 = r4.split("!");
     */
    /* JADX WARNING: Missing block: B:41:0x00f8, code skipped:
            if (r5.length != 2) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:42:0x00fa, code skipped:
            r6 = r5[0];
            r5 = r5[1];
     */
    /* JADX WARNING: Missing block: B:44:?, code skipped:
            r7 = r6.hashCode();
            r9 = -1;
     */
    /* JADX WARNING: Missing block: B:45:0x0105, code skipped:
            if (r7 == 83) goto L_0x0117;
     */
    /* JADX WARNING: Missing block: B:47:0x0109, code skipped:
            if (r7 == 85) goto L_0x010c;
     */
    /* JADX WARNING: Missing block: B:50:0x0112, code skipped:
            if (r6.equals("U") != false) goto L_0x0115;
     */
    /* JADX WARNING: Missing block: B:52:0x0115, code skipped:
            r9 = 1;
     */
    /* JADX WARNING: Missing block: B:54:0x011d, code skipped:
            if (r6.equals("S") != false) goto L_0x0120;
     */
    /* JADX WARNING: Missing block: B:56:0x0120, code skipped:
            r9 = null;
     */
    /* JADX WARNING: Missing block: B:57:0x0121, code skipped:
            if (r9 == null) goto L_0x0154;
     */
    /* JADX WARNING: Missing block: B:58:0x0123, code skipped:
            if (r9 == 1) goto L_0x0127;
     */
    /* JADX WARNING: Missing block: B:60:0x0127, code skipped:
            r6 = r3.d();
     */
    /* JADX WARNING: Missing block: B:61:0x012b, code skipped:
            if (r6 == null) goto L_0x014c;
     */
    /* JADX WARNING: Missing block: B:63:0x0137, code skipped:
            if (r6.b(r3.d.b()) != false) goto L_0x014c;
     */
    /* JADX WARNING: Missing block: B:64:0x0139, code skipped:
            r3.a(r3.e.c(com.google.firebase.iid.FirebaseInstanceId.c(), r6.a, r5));
            com.google.firebase.iid.FirebaseInstanceId.e();
     */
    /* JADX WARNING: Missing block: B:66:0x0153, code skipped:
            throw new java.io.IOException("token not available");
     */
    /* JADX WARNING: Missing block: B:67:0x0154, code skipped:
            r6 = r3.d();
     */
    /* JADX WARNING: Missing block: B:68:0x0158, code skipped:
            if (r6 == null) goto L_0x0179;
     */
    /* JADX WARNING: Missing block: B:70:0x0164, code skipped:
            if (r6.b(r3.d.b()) != false) goto L_0x0179;
     */
    /* JADX WARNING: Missing block: B:71:0x0166, code skipped:
            r3.a(r3.e.b(com.google.firebase.iid.FirebaseInstanceId.c(), r6.a, r5));
            com.google.firebase.iid.FirebaseInstanceId.e();
     */
    /* JADX WARNING: Missing block: B:73:0x0180, code skipped:
            throw new java.io.IOException("token not available");
     */
    /* JADX WARNING: Missing block: B:81:0x01a3, code skipped:
            monitor-enter(r0);
     */
    /* JADX WARNING: Missing block: B:83:?, code skipped:
            r5 = (defpackage.ryl) r0.b.remove(java.lang.Integer.valueOf(r0.a));
            r0.b(r4);
            r0.a++;
     */
    /* JADX WARNING: Missing block: B:84:0x01ba, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:85:0x01bb, code skipped:
            if (r5 == null) goto L_0x00e0;
     */
    /* JADX WARNING: Missing block: B:88:?, code skipped:
            r5.a(null);
     */
    public final void run() {
        /*
        r13 = this;
        r0 = r13.b;
        r0.acquire();
        r0 = r13.c;	 Catch:{ all -> 0x022c }
        r1 = 1;
        r0.a(r1);	 Catch:{ all -> 0x022c }
        r0 = r13.c;	 Catch:{ all -> 0x022c }
        r0 = r0.e;	 Catch:{ all -> 0x022c }
        r0 = r0.b();	 Catch:{ all -> 0x022c }
        r2 = 0;
        if (r0 == 0) goto L_0x0221;
    L_0x0016:
        r0 = r13.b();	 Catch:{ all -> 0x022c }
        if (r0 != 0) goto L_0x003a;
    L_0x001c:
        r0 = new anpo;	 Catch:{ all -> 0x022c }
        r0.<init>(r13);	 Catch:{ all -> 0x022c }
        com.google.firebase.iid.FirebaseInstanceId.e();	 Catch:{ all -> 0x022c }
        r1 = new android.content.IntentFilter;	 Catch:{ all -> 0x022c }
        r2 = "android.net.conn.CONNECTIVITY_CHANGE";
        r1.<init>(r2);	 Catch:{ all -> 0x022c }
        r2 = r0.a;	 Catch:{ all -> 0x022c }
        r2 = r2.a();	 Catch:{ all -> 0x022c }
        r2.registerReceiver(r0, r1);	 Catch:{ all -> 0x022c }
        r0 = r13.b;
        r0.release();
        return;
    L_0x003a:
        r0 = r13.c;	 Catch:{ IOException -> 0x01f4 }
        r0 = r0.g();	 Catch:{ IOException -> 0x01f4 }
        if (r0 != 0) goto L_0x0057;
    L_0x0042:
        r0 = r13.c;	 Catch:{ IOException -> 0x01f4 }
        com.google.firebase.iid.FirebaseInstanceId.c();	 Catch:{ IOException -> 0x01f4 }
        r3 = r0.d();	 Catch:{ IOException -> 0x01f4 }
        defpackage.anpm.a(r3);	 Catch:{ IOException -> 0x01f4 }
        r3 = r0.e;	 Catch:{ IOException -> 0x01f4 }
        r3 = r3.c();	 Catch:{ IOException -> 0x01f4 }
        r0.a(r3);	 Catch:{ IOException -> 0x01f4 }
    L_0x0057:
        r0 = r13.c;	 Catch:{ all -> 0x022c }
        r0 = r0.d();	 Catch:{ all -> 0x022c }
        if (r0 == 0) goto L_0x006b;
    L_0x005f:
        r3 = r13.d;	 Catch:{ all -> 0x022c }
        r3 = r3.b();	 Catch:{ all -> 0x022c }
        r3 = r0.b(r3);	 Catch:{ all -> 0x022c }
        if (r3 == 0) goto L_0x00dc;
    L_0x006b:
        r9 = r13.c;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r3 = r9.c;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r5 = defpackage.anpc.a(r3);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r8 = "*";
        r3 = android.os.Looper.getMainLooper();	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r4 = android.os.Looper.myLooper();	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        if (r3 == r4) goto L_0x01c9;
    L_0x007f:
        r10 = new ryl;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r10.<init>();	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r11 = r9.b;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r12 = new anqc;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r3 = r12;
        r4 = r9;
        r6 = r8;
        r7 = r10;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r11.execute(r12);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r3 = r10.a;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r3 = r9.a(r3);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r3 = (defpackage.anon) r3;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r3 = r3.a();	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        if (r3 != 0) goto L_0x00a9;
    L_0x00a0:
        r0 = "FirebaseInstanceId";
        r1 = "Token retrieval failed: null";
        android.util.Log.e(r0, r1);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        goto L_0x0214;
    L_0x00a9:
        if (r0 == 0) goto L_0x00b3;
    L_0x00ab:
        r0 = r0.a;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r0 = r3.equals(r0);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        if (r0 != 0) goto L_0x00dc;
    L_0x00b3:
        r0 = r13.a();	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r4 = new android.content.Intent;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r5 = "com.google.firebase.messaging.NEW_TOKEN";
        r4.<init>(r5);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r5 = "token";
        r4.putExtra(r5, r3);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r3 = "com.google.firebase.MESSAGING_EVENT";
        r3 = defpackage.anpk.a(r0, r3, r4);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r0.sendBroadcast(r3);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r3 = new android.content.Intent;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r4 = "com.google.firebase.iid.TOKEN_REFRESH";
        r3.<init>(r4);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r4 = "com.google.firebase.INSTANCE_ID_EVENT";
        r3 = defpackage.anpk.a(r0, r4, r3);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r0.sendBroadcast(r3);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
    L_0x00dc:
        r0 = r13.e;	 Catch:{ all -> 0x022c }
        r3 = r13.c;	 Catch:{ all -> 0x022c }
    L_0x00e0:
        monitor-enter(r0);	 Catch:{ all -> 0x022c }
        r4 = r0.b();	 Catch:{ all -> 0x01c6 }
        if (r4 != 0) goto L_0x00ef;
    L_0x00e7:
        monitor-exit(r0);	 Catch:{ all -> 0x01c6 }
        r0 = r13.c;	 Catch:{ all -> 0x022c }
        r0.a(r2);	 Catch:{ all -> 0x022c }
        goto L_0x021b;
    L_0x00ef:
        monitor-exit(r0);	 Catch:{ all -> 0x01c6 }
        r5 = "!";
        r5 = r4.split(r5);	 Catch:{ all -> 0x022c }
        r6 = r5.length;	 Catch:{ all -> 0x022c }
        r7 = 2;
        if (r6 != r7) goto L_0x01a3;
    L_0x00fa:
        r6 = r5[r2];	 Catch:{ all -> 0x022c }
        r5 = r5[r1];	 Catch:{ all -> 0x022c }
        r7 = r6.hashCode();	 Catch:{ IOException -> 0x0181 }
        r8 = 83;
        r9 = -1;
        if (r7 == r8) goto L_0x0117;
    L_0x0107:
        r8 = 85;
        if (r7 == r8) goto L_0x010c;
    L_0x010b:
        goto L_0x0121;
    L_0x010c:
        r7 = "U";
        r6 = r6.equals(r7);	 Catch:{ IOException -> 0x0181 }
        if (r6 != 0) goto L_0x0115;
    L_0x0114:
        goto L_0x0121;
    L_0x0115:
        r9 = 1;
        goto L_0x0121;
    L_0x0117:
        r7 = "S";
        r6 = r6.equals(r7);	 Catch:{ IOException -> 0x0181 }
        if (r6 != 0) goto L_0x0120;
    L_0x011f:
        goto L_0x0121;
    L_0x0120:
        r9 = 0;
    L_0x0121:
        if (r9 == 0) goto L_0x0154;
    L_0x0123:
        if (r9 == r1) goto L_0x0127;
    L_0x0125:
        goto L_0x01a3;
    L_0x0127:
        r6 = r3.d();	 Catch:{ IOException -> 0x0181 }
        if (r6 == 0) goto L_0x014c;
    L_0x012d:
        r7 = r3.d;	 Catch:{ IOException -> 0x0181 }
        r7 = r7.b();	 Catch:{ IOException -> 0x0181 }
        r7 = r6.b(r7);	 Catch:{ IOException -> 0x0181 }
        if (r7 != 0) goto L_0x014c;
    L_0x0139:
        r7 = com.google.firebase.iid.FirebaseInstanceId.c();	 Catch:{ IOException -> 0x0181 }
        r8 = r3.e;	 Catch:{ IOException -> 0x0181 }
        r6 = r6.a;	 Catch:{ IOException -> 0x0181 }
        r5 = r8.c(r7, r6, r5);	 Catch:{ IOException -> 0x0181 }
        r3.a(r5);	 Catch:{ IOException -> 0x0181 }
        com.google.firebase.iid.FirebaseInstanceId.e();	 Catch:{ IOException -> 0x0181 }
        goto L_0x01a3;
    L_0x014c:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0181 }
        r1 = "token not available";
        r0.<init>(r1);	 Catch:{ IOException -> 0x0181 }
        throw r0;	 Catch:{ IOException -> 0x0181 }
    L_0x0154:
        r6 = r3.d();	 Catch:{ IOException -> 0x0181 }
        if (r6 == 0) goto L_0x0179;
    L_0x015a:
        r7 = r3.d;	 Catch:{ IOException -> 0x0181 }
        r7 = r7.b();	 Catch:{ IOException -> 0x0181 }
        r7 = r6.b(r7);	 Catch:{ IOException -> 0x0181 }
        if (r7 != 0) goto L_0x0179;
    L_0x0166:
        r7 = com.google.firebase.iid.FirebaseInstanceId.c();	 Catch:{ IOException -> 0x0181 }
        r6 = r6.a;	 Catch:{ IOException -> 0x0181 }
        r8 = r3.e;	 Catch:{ IOException -> 0x0181 }
        r5 = r8.b(r7, r6, r5);	 Catch:{ IOException -> 0x0181 }
        r3.a(r5);	 Catch:{ IOException -> 0x0181 }
        com.google.firebase.iid.FirebaseInstanceId.e();	 Catch:{ IOException -> 0x0181 }
        goto L_0x01a3;
    L_0x0179:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0181 }
        r1 = "token not available";
        r0.<init>(r1);	 Catch:{ IOException -> 0x0181 }
        throw r0;	 Catch:{ IOException -> 0x0181 }
    L_0x0181:
        r0 = move-exception;
        r1 = "FirebaseInstanceId";
        r2 = "Topic sync failed: ";
        r0 = r0.getMessage();	 Catch:{ all -> 0x022c }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x022c }
        r3 = r0.length();	 Catch:{ all -> 0x022c }
        if (r3 != 0) goto L_0x019a;
    L_0x0194:
        r0 = new java.lang.String;	 Catch:{ all -> 0x022c }
        r0.<init>(r2);	 Catch:{ all -> 0x022c }
        goto L_0x019e;
    L_0x019a:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x022c }
    L_0x019e:
        android.util.Log.e(r1, r0);	 Catch:{ all -> 0x022c }
        goto L_0x0214;
    L_0x01a3:
        monitor-enter(r0);	 Catch:{ all -> 0x022c }
        r5 = r0.b;	 Catch:{ all -> 0x01c3 }
        r6 = r0.a;	 Catch:{ all -> 0x01c3 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x01c3 }
        r5 = r5.remove(r6);	 Catch:{ all -> 0x01c3 }
        r5 = (defpackage.ryl) r5;	 Catch:{ all -> 0x01c3 }
        r0.b(r4);	 Catch:{ all -> 0x01c3 }
        r4 = r0.a;	 Catch:{ all -> 0x01c3 }
        r4 = r4 + r1;
        r0.a = r4;	 Catch:{ all -> 0x01c3 }
        monitor-exit(r0);	 Catch:{ all -> 0x01c3 }
        if (r5 == 0) goto L_0x00e0;
    L_0x01bd:
        r4 = 0;
        r5.a(r4);	 Catch:{ all -> 0x022c }
        goto L_0x00e0;
    L_0x01c3:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x01c3 }
        throw r1;	 Catch:{ all -> 0x022c }
    L_0x01c6:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x01c6 }
        throw r1;	 Catch:{ all -> 0x022c }
    L_0x01c9:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        r1 = "MAIN_THREAD";
        r0.<init>(r1);	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
        throw r0;	 Catch:{ IOException -> 0x01d3, IOException | SecurityException -> 0x01d1 }
    L_0x01d1:
        r0 = move-exception;
        goto L_0x01d4;
    L_0x01d3:
        r0 = move-exception;
    L_0x01d4:
        r1 = "FirebaseInstanceId";
        r2 = "Token retrieval failed: ";
        r0 = r0.getMessage();	 Catch:{ all -> 0x022c }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x022c }
        r3 = r0.length();	 Catch:{ all -> 0x022c }
        if (r3 != 0) goto L_0x01ec;
    L_0x01e6:
        r0 = new java.lang.String;	 Catch:{ all -> 0x022c }
        r0.<init>(r2);	 Catch:{ all -> 0x022c }
        goto L_0x01f0;
    L_0x01ec:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x022c }
    L_0x01f0:
        android.util.Log.e(r1, r0);	 Catch:{ all -> 0x022c }
        goto L_0x0214;
    L_0x01f4:
        r0 = move-exception;
        r1 = "FirebaseInstanceId";
        r2 = "Build channel failed: ";
        r0 = r0.getMessage();	 Catch:{ all -> 0x022c }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x022c }
        r3 = r0.length();	 Catch:{ all -> 0x022c }
        if (r3 != 0) goto L_0x020d;
    L_0x0207:
        r0 = new java.lang.String;	 Catch:{ all -> 0x022c }
        r0.<init>(r2);	 Catch:{ all -> 0x022c }
        goto L_0x0211;
    L_0x020d:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x022c }
    L_0x0211:
        android.util.Log.e(r1, r0);	 Catch:{ all -> 0x022c }
    L_0x0214:
        r0 = r13.c;	 Catch:{ all -> 0x022c }
        r1 = r13.a;	 Catch:{ all -> 0x022c }
        r0.a(r1);	 Catch:{ all -> 0x022c }
    L_0x021b:
        r0 = r13.b;
        r0.release();
        return;
    L_0x0221:
        r0 = r13.c;	 Catch:{ all -> 0x022c }
        r0.a(r2);	 Catch:{ all -> 0x022c }
        r0 = r13.b;
        r0.release();
        return;
    L_0x022c:
        r0 = move-exception;
        r1 = r13.b;
        r1.release();
        goto L_0x0234;
    L_0x0233:
        throw r0;
    L_0x0234:
        goto L_0x0233;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anpl.run():void");
    }

    /* Access modifiers changed, original: final */
    public final Context a() {
        return this.c.c.a();
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
