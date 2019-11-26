package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import defpackage.aac;
import defpackage.ddo;
import defpackage.ddp;
import defpackage.ddq;
import defpackage.ddw;
import defpackage.ddx;
import defpackage.dea;
import defpackage.deb;
import defpackage.dem;
import defpackage.den;
import defpackage.dex;
import defpackage.dfg;
import java.util.ArrayList;

public class GooglePlayReceiver extends Service implements ddw {
    public static final dem a = new dem("com.firebase.jobdispatcher.");
    public static final aac b = new aac(1);
    private Messenger c;
    private ddq d;
    private dfg e;
    private ddp f;
    private int g;
    private boolean h = false;

    public GooglePlayReceiver() {
        ddx ddx = new ddx();
    }

    private static void a(den den, int i) {
        try {
            den.a(i);
        } catch (Throwable th) {
            String valueOf = String.valueOf(th.getMessage());
            String str = "Encountered error running callback: ";
            Log.e("FJD.GooglePlayReceiver", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
    }

    public final synchronized void onDestroy() {
        ArrayList arrayList;
        ddp a = a();
        synchronized (ddp.a) {
            arrayList = new ArrayList(ddp.a.values());
            ddp.a.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dex) arrayList.get(i)).b();
        }
        a.g.shutdownNow();
        this.h = true;
        super.onDestroy();
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x017e A:{Catch:{ all -> 0x01a4, all -> 0x01a9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x017d A:{Catch:{ all -> 0x01a4, all -> 0x01a9 }} */
    public final int onStartCommand(android.content.Intent r10, int r11, int r12) {
        /*
        r9 = this;
        super.onStartCommand(r10, r11, r12);	 Catch:{ all -> 0x01a9 }
        r11 = 2;
        if (r10 != 0) goto L_0x0024;
    L_0x0006:
        r10 = "FJD.GooglePlayReceiver";
        r0 = "Null Intent passed, terminating";
        android.util.Log.w(r10, r0);	 Catch:{ all -> 0x01a9 }
        r10 = b;
        monitor-enter(r10);
        r9.g = r12;	 Catch:{ all -> 0x0021 }
        r12 = b;	 Catch:{ all -> 0x0021 }
        r12 = r12.isEmpty();	 Catch:{ all -> 0x0021 }
        if (r12 == 0) goto L_0x001f;
    L_0x001a:
        r12 = r9.g;	 Catch:{ all -> 0x0021 }
        r9.stopSelf(r12);	 Catch:{ all -> 0x0021 }
    L_0x001f:
        monitor-exit(r10);	 Catch:{ all -> 0x0021 }
        return r11;
    L_0x0021:
        r11 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x0021 }
        throw r11;
    L_0x0024:
        r0 = r10.getAction();	 Catch:{ all -> 0x01a9 }
        r1 = "com.google.android.gms.gcm.ACTION_TASK_READY";
        r1 = r1.equals(r0);	 Catch:{ all -> 0x01a9 }
        if (r1 != 0) goto L_0x006d;
    L_0x0030:
        r10 = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
        r10 = r10.equals(r0);	 Catch:{ all -> 0x01a9 }
        if (r10 != 0) goto L_0x0056;
    L_0x0038:
        r10 = "FJD.GooglePlayReceiver";
        r0 = "Unknown action received, terminating";
        android.util.Log.e(r10, r0);	 Catch:{ all -> 0x01a9 }
        r10 = b;
        monitor-enter(r10);
        r9.g = r12;	 Catch:{ all -> 0x0053 }
        r12 = b;	 Catch:{ all -> 0x0053 }
        r12 = r12.isEmpty();	 Catch:{ all -> 0x0053 }
        if (r12 == 0) goto L_0x0051;
    L_0x004c:
        r12 = r9.g;	 Catch:{ all -> 0x0053 }
        r9.stopSelf(r12);	 Catch:{ all -> 0x0053 }
    L_0x0051:
        monitor-exit(r10);	 Catch:{ all -> 0x0053 }
        return r11;
    L_0x0053:
        r11 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x0053 }
        throw r11;
    L_0x0056:
        r10 = b;
        monitor-enter(r10);
        r9.g = r12;	 Catch:{ all -> 0x006a }
        r12 = b;	 Catch:{ all -> 0x006a }
        r12 = r12.isEmpty();	 Catch:{ all -> 0x006a }
        if (r12 == 0) goto L_0x0068;
    L_0x0063:
        r12 = r9.g;	 Catch:{ all -> 0x006a }
        r9.stopSelf(r12);	 Catch:{ all -> 0x006a }
    L_0x0068:
        monitor-exit(r10);	 Catch:{ all -> 0x006a }
        return r11;
    L_0x006a:
        r11 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x006a }
        throw r11;
    L_0x006d:
        r0 = r9.a();	 Catch:{ all -> 0x01a9 }
        r10 = r10.getExtras();	 Catch:{ all -> 0x01a9 }
        r1 = 0;
        if (r10 != 0) goto L_0x0081;
    L_0x0078:
        r10 = "FJD.GooglePlayReceiver";
        r2 = "No data provided, terminating";
        android.util.Log.e(r10, r2);	 Catch:{ all -> 0x01a9 }
        goto L_0x018a;
    L_0x0081:
        r2 = new android.os.Bundle;	 Catch:{ all -> 0x01a9 }
        r2.<init>();	 Catch:{ all -> 0x01a9 }
        r10 = defpackage.ddx.a(r10);	 Catch:{ all -> 0x01a9 }
        r3 = r10.readInt();	 Catch:{ all -> 0x01a4 }
        if (r3 > 0) goto L_0x009d;
    L_0x0090:
        r2 = "FJD.GooglePlayReceiver";
        r3 = "No callback received, terminating";
        android.util.Log.w(r2, r3);	 Catch:{ all -> 0x01a4 }
        r10.recycle();	 Catch:{ all -> 0x01a9 }
    L_0x009a:
        r2 = r1;
        goto L_0x017b;
    L_0x009d:
        r3 = r10.readInt();	 Catch:{ all -> 0x01a4 }
        r4 = 1279544898; // 0x4c444e42 float:5.146036E7 double:6.321791764E-315;
        if (r3 == r4) goto L_0x00b1;
    L_0x00a6:
        r2 = "FJD.GooglePlayReceiver";
        r3 = "No callback received, terminating";
        android.util.Log.w(r2, r3);	 Catch:{ all -> 0x01a4 }
        r10.recycle();	 Catch:{ all -> 0x01a9 }
        goto L_0x009a;
    L_0x00b1:
        r3 = r10.readInt();	 Catch:{ all -> 0x01a4 }
        r4 = 0;
        r5 = r1;
    L_0x00b7:
        if (r4 >= r3) goto L_0x0165;
    L_0x00b9:
        r6 = defpackage.ddx.a();	 Catch:{ all -> 0x01a4 }
        if (r6 == 0) goto L_0x00c4;
    L_0x00bf:
        r6 = r10.readString();	 Catch:{ all -> 0x01a4 }
        goto L_0x00d7;
    L_0x00c4:
        r6 = r10.readValue(r1);	 Catch:{ all -> 0x01a4 }
        r7 = r6 instanceof java.lang.String;	 Catch:{ all -> 0x01a4 }
        if (r7 != 0) goto L_0x00d5;
    L_0x00cc:
        r6 = "FJD.GooglePlayReceiver";
        r7 = "Bad callback received, terminating";
        android.util.Log.w(r6, r7);	 Catch:{ all -> 0x01a4 }
        r6 = r1;
        goto L_0x00d7;
    L_0x00d5:
        r6 = (java.lang.String) r6;	 Catch:{ all -> 0x01a4 }
    L_0x00d7:
        if (r6 != 0) goto L_0x00db;
    L_0x00d9:
        goto L_0x0161;
    L_0x00db:
        if (r5 == 0) goto L_0x00de;
    L_0x00dd:
        goto L_0x011a;
    L_0x00de:
        r7 = "callback";
        r7 = r7.equals(r6);	 Catch:{ all -> 0x01a4 }
        if (r7 == 0) goto L_0x011a;
    L_0x00e6:
        r5 = r10.readInt();	 Catch:{ all -> 0x01a4 }
        r6 = 4;
        if (r5 == r6) goto L_0x00f8;
    L_0x00ed:
        r2 = "FJD.GooglePlayReceiver";
        r3 = "Bad callback received, terminating";
        android.util.Log.w(r2, r3);	 Catch:{ all -> 0x01a4 }
        r10.recycle();	 Catch:{ all -> 0x01a9 }
        goto L_0x009a;
    L_0x00f8:
        r5 = r10.readString();	 Catch:{ all -> 0x01a4 }
        r6 = "com.google.android.gms.gcm.PendingCallback";
        r5 = r6.equals(r5);	 Catch:{ all -> 0x01a4 }
        if (r5 != 0) goto L_0x010f;
    L_0x0104:
        r2 = "FJD.GooglePlayReceiver";
        r3 = "Bad callback received, terminating";
        android.util.Log.w(r2, r3);	 Catch:{ all -> 0x01a4 }
        r10.recycle();	 Catch:{ all -> 0x01a9 }
        goto L_0x009a;
    L_0x010f:
        r5 = r10.readStrongBinder();	 Catch:{ all -> 0x01a4 }
        r6 = new ddz;	 Catch:{ all -> 0x01a4 }
        r6.<init>(r5);	 Catch:{ all -> 0x01a4 }
        r5 = r6;
        goto L_0x0161;
    L_0x011a:
        r7 = r10.readValue(r1);	 Catch:{ all -> 0x01a4 }
        r8 = r7 instanceof java.lang.String;	 Catch:{ all -> 0x01a4 }
        if (r8 == 0) goto L_0x0128;
    L_0x0122:
        r7 = (java.lang.String) r7;	 Catch:{ all -> 0x01a4 }
        r2.putString(r6, r7);	 Catch:{ all -> 0x01a4 }
        goto L_0x0161;
    L_0x0128:
        r8 = r7 instanceof java.lang.Boolean;	 Catch:{ all -> 0x01a4 }
        if (r8 == 0) goto L_0x0136;
    L_0x012c:
        r7 = (java.lang.Boolean) r7;	 Catch:{ all -> 0x01a4 }
        r7 = r7.booleanValue();	 Catch:{ all -> 0x01a4 }
        r2.putBoolean(r6, r7);	 Catch:{ all -> 0x01a4 }
        goto L_0x0161;
    L_0x0136:
        r8 = r7 instanceof java.lang.Integer;	 Catch:{ all -> 0x01a4 }
        if (r8 == 0) goto L_0x0144;
    L_0x013a:
        r7 = (java.lang.Integer) r7;	 Catch:{ all -> 0x01a4 }
        r7 = r7.intValue();	 Catch:{ all -> 0x01a4 }
        r2.putInt(r6, r7);	 Catch:{ all -> 0x01a4 }
        goto L_0x0161;
    L_0x0144:
        r8 = r7 instanceof java.util.ArrayList;	 Catch:{ all -> 0x01a4 }
        if (r8 == 0) goto L_0x014e;
    L_0x0148:
        r7 = (java.util.ArrayList) r7;	 Catch:{ all -> 0x01a4 }
        r2.putParcelableArrayList(r6, r7);	 Catch:{ all -> 0x01a4 }
        goto L_0x0161;
    L_0x014e:
        r8 = r7 instanceof android.os.Bundle;	 Catch:{ all -> 0x01a4 }
        if (r8 == 0) goto L_0x0158;
    L_0x0152:
        r7 = (android.os.Bundle) r7;	 Catch:{ all -> 0x01a4 }
        r2.putBundle(r6, r7);	 Catch:{ all -> 0x01a4 }
        goto L_0x0161;
    L_0x0158:
        r8 = r7 instanceof android.os.Parcelable;	 Catch:{ all -> 0x01a4 }
        if (r8 == 0) goto L_0x0161;
    L_0x015c:
        r7 = (android.os.Parcelable) r7;	 Catch:{ all -> 0x01a4 }
        r2.putParcelable(r6, r7);	 Catch:{ all -> 0x01a4 }
    L_0x0161:
        r4 = r4 + 1;
        goto L_0x00b7;
    L_0x0165:
        if (r5 == 0) goto L_0x016f;
    L_0x0167:
        r2 = android.util.Pair.create(r5, r2);	 Catch:{ all -> 0x01a4 }
        r10.recycle();	 Catch:{ all -> 0x01a9 }
        goto L_0x017b;
    L_0x016f:
        r2 = "FJD.GooglePlayReceiver";
        r3 = "No callback received, terminating";
        android.util.Log.w(r2, r3);	 Catch:{ all -> 0x01a4 }
        r10.recycle();	 Catch:{ all -> 0x01a9 }
        goto L_0x009a;
    L_0x017b:
        if (r2 != 0) goto L_0x017e;
    L_0x017d:
        goto L_0x018a;
    L_0x017e:
        r10 = r2.first;	 Catch:{ all -> 0x01a9 }
        r10 = (defpackage.den) r10;	 Catch:{ all -> 0x01a9 }
        r1 = r2.second;	 Catch:{ all -> 0x01a9 }
        r1 = (android.os.Bundle) r1;	 Catch:{ all -> 0x01a9 }
        r1 = a(r10, r1);	 Catch:{ all -> 0x01a9 }
    L_0x018a:
        r0.a(r1);	 Catch:{ all -> 0x01a9 }
        r10 = b;
        monitor-enter(r10);
        r9.g = r12;	 Catch:{ all -> 0x01a1 }
        r12 = b;	 Catch:{ all -> 0x01a1 }
        r12 = r12.isEmpty();	 Catch:{ all -> 0x01a1 }
        if (r12 == 0) goto L_0x019f;
    L_0x019a:
        r12 = r9.g;	 Catch:{ all -> 0x01a1 }
        r9.stopSelf(r12);	 Catch:{ all -> 0x01a1 }
    L_0x019f:
        monitor-exit(r10);	 Catch:{ all -> 0x01a1 }
        return r11;
    L_0x01a1:
        r11 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x01a1 }
        throw r11;
    L_0x01a4:
        r11 = move-exception;
        r10.recycle();	 Catch:{ all -> 0x01a9 }
        throw r11;	 Catch:{ all -> 0x01a9 }
    L_0x01a9:
        r10 = move-exception;
        r11 = b;
        monitor-enter(r11);
        r9.g = r12;	 Catch:{ all -> 0x01be }
        r12 = b;	 Catch:{ all -> 0x01be }
        r12 = r12.isEmpty();	 Catch:{ all -> 0x01be }
        if (r12 == 0) goto L_0x01bc;
    L_0x01b7:
        r12 = r9.g;	 Catch:{ all -> 0x01be }
        r9.stopSelf(r12);	 Catch:{ all -> 0x01be }
    L_0x01bc:
        monitor-exit(r11);	 Catch:{ all -> 0x01be }
        throw r10;
    L_0x01be:
        r10 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x01be }
        goto L_0x01c2;
    L_0x01c1:
        throw r10;
    L_0x01c2:
        goto L_0x01c1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.GooglePlayReceiver.onStartCommand(android.content.Intent, int, int):int");
    }

    public final IBinder onBind(Intent intent) {
        if (intent != null && VERSION.SDK_INT >= 21) {
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
                return c().getBinder();
            }
        }
        return null;
    }

    private final synchronized Messenger c() {
        if (this.c == null) {
            this.c = new Messenger(new deb(Looper.getMainLooper(), this));
        }
        return this.c;
    }

    public final synchronized ddp a() {
        if (this.f == null) {
            this.f = new ddp(new ddo(getApplicationContext()), this, d(), this);
        }
        return this.f;
    }

    private final synchronized ddq d() {
        if (this.d == null) {
            this.d = new dea(getApplicationContext());
        }
        return this.d;
    }

    private final synchronized dfg e() {
        if (this.e == null) {
            this.e = new dfg(d().a());
        }
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    public static defpackage.dep a(defpackage.den r4, android.os.Bundle r5) {
        /*
        r0 = a;
        r1 = 0;
        if (r5 == 0) goto L_0x0025;
    L_0x0005:
        r2 = "extras";
        r2 = r5.getBundle(r2);
        if (r2 == 0) goto L_0x002c;
    L_0x000d:
        r0 = r0.a(r2);
        r2 = "triggered_uris";
        r5 = r5.getParcelableArrayList(r2);
        if (r5 == 0) goto L_0x0020;
    L_0x0019:
        r5 = new dfh;
        r5.<init>();
        r0.j = r5;
    L_0x0020:
        r5 = r0.a();
        goto L_0x002d;
    L_0x0025:
        r5 = "FJD.ExecutionDelegator";
        r0 = "Unexpected null Bundle provided";
        android.util.Log.e(r5, r0);
    L_0x002c:
        r5 = r1;
    L_0x002d:
        if (r5 != 0) goto L_0x003b;
    L_0x002f:
        r5 = "FJD.GooglePlayReceiver";
        r0 = "unable to decode job";
        android.util.Log.e(r5, r0);
        r5 = 2;
        a(r4, r5);
        return r1;
    L_0x003b:
        r0 = b;
        monitor-enter(r0);
        r1 = b;	 Catch:{ all -> 0x005e }
        r2 = r5.b;	 Catch:{ all -> 0x005e }
        r1 = r1.get(r2);	 Catch:{ all -> 0x005e }
        r1 = (defpackage.aac) r1;	 Catch:{ all -> 0x005e }
        if (r1 != 0) goto L_0x0057;
    L_0x004a:
        r1 = new aac;	 Catch:{ all -> 0x005e }
        r2 = 1;
        r1.<init>(r2);	 Catch:{ all -> 0x005e }
        r2 = b;	 Catch:{ all -> 0x005e }
        r3 = r5.b;	 Catch:{ all -> 0x005e }
        r2.put(r3, r1);	 Catch:{ all -> 0x005e }
    L_0x0057:
        r2 = r5.a;	 Catch:{ all -> 0x005e }
        r1.put(r2, r4);	 Catch:{ all -> 0x005e }
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return r5;
    L_0x005e:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.GooglePlayReceiver.a(den, android.os.Bundle):dep");
    }

    /* JADX WARNING: Missing block: B:7:0x0010, code skipped:
            r5 = b;
     */
    /* JADX WARNING: Missing block: B:8:0x0012, code skipped:
            monitor-enter(r5);
     */
    /* JADX WARNING: Missing block: B:11:0x0019, code skipped:
            if (b.isEmpty() == false) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:12:0x001b, code skipped:
            stopSelf(r4.g);
     */
    /* JADX WARNING: Missing block: B:13:0x0020, code skipped:
            monitor-exit(r5);
     */
    /* JADX WARNING: Missing block: B:14:0x0021, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:22:0x0030, code skipped:
            r5 = b;
     */
    /* JADX WARNING: Missing block: B:23:0x0032, code skipped:
            monitor-enter(r5);
     */
    /* JADX WARNING: Missing block: B:26:0x0039, code skipped:
            if (b.isEmpty() == false) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:27:0x003b, code skipped:
            stopSelf(r4.g);
     */
    /* JADX WARNING: Missing block: B:28:0x0040, code skipped:
            monitor-exit(r5);
     */
    /* JADX WARNING: Missing block: B:29:0x0041, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:40:0x0055, code skipped:
            if (r5.d == false) goto L_0x0077;
     */
    /* JADX WARNING: Missing block: B:42:0x005b, code skipped:
            if ((r5.c instanceof defpackage.dez) == false) goto L_0x0077;
     */
    /* JADX WARNING: Missing block: B:44:0x005e, code skipped:
            if (r6 == 1) goto L_0x0077;
     */
    /* JADX WARNING: Missing block: B:45:0x0060, code skipped:
            r6 = new defpackage.dek(e(), r5);
            r6.h = true;
            d().a(r6.a());
     */
    /* JADX WARNING: Missing block: B:46:0x0077, code skipped:
            a(r2, r6);
     */
    /* JADX WARNING: Missing block: B:47:0x007a, code skipped:
            r5 = b;
     */
    /* JADX WARNING: Missing block: B:48:0x007c, code skipped:
            monitor-enter(r5);
     */
    /* JADX WARNING: Missing block: B:51:0x0083, code skipped:
            if (b.isEmpty() == false) goto L_0x008a;
     */
    /* JADX WARNING: Missing block: B:52:0x0085, code skipped:
            stopSelf(r4.g);
     */
    /* JADX WARNING: Missing block: B:53:0x008a, code skipped:
            monitor-exit(r5);
     */
    /* JADX WARNING: Missing block: B:54:0x008b, code skipped:
            return;
     */
    public final void a(defpackage.dep r5, int r6) {
        /*
        r4 = this;
        r0 = b;	 Catch:{ all -> 0x0092 }
        monitor-enter(r0);	 Catch:{ all -> 0x0092 }
        r1 = b;	 Catch:{ all -> 0x008f }
        r2 = r5.b;	 Catch:{ all -> 0x008f }
        r1 = r1.get(r2);	 Catch:{ all -> 0x008f }
        r1 = (defpackage.aac) r1;	 Catch:{ all -> 0x008f }
        if (r1 != 0) goto L_0x0025;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x008f }
        r5 = b;
        monitor-enter(r5);
        r6 = b;	 Catch:{ all -> 0x0022 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x0022 }
        if (r6 == 0) goto L_0x0020;
    L_0x001b:
        r6 = r4.g;	 Catch:{ all -> 0x0022 }
        r4.stopSelf(r6);	 Catch:{ all -> 0x0022 }
    L_0x0020:
        monitor-exit(r5);	 Catch:{ all -> 0x0022 }
        return;
    L_0x0022:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0022 }
        throw r6;
    L_0x0025:
        r2 = r5.a;	 Catch:{ all -> 0x008f }
        r2 = r1.remove(r2);	 Catch:{ all -> 0x008f }
        r2 = (defpackage.den) r2;	 Catch:{ all -> 0x008f }
        if (r2 != 0) goto L_0x0045;
    L_0x002f:
        monitor-exit(r0);	 Catch:{ all -> 0x008f }
        r5 = b;
        monitor-enter(r5);
        r6 = b;	 Catch:{ all -> 0x0042 }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x0042 }
        if (r6 == 0) goto L_0x0040;
    L_0x003b:
        r6 = r4.g;	 Catch:{ all -> 0x0042 }
        r4.stopSelf(r6);	 Catch:{ all -> 0x0042 }
    L_0x0040:
        monitor-exit(r5);	 Catch:{ all -> 0x0042 }
        return;
    L_0x0042:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0042 }
        throw r6;
    L_0x0045:
        r1 = r1.isEmpty();	 Catch:{ all -> 0x008f }
        if (r1 == 0) goto L_0x0052;
    L_0x004b:
        r1 = b;	 Catch:{ all -> 0x008f }
        r3 = r5.b;	 Catch:{ all -> 0x008f }
        r1.remove(r3);	 Catch:{ all -> 0x008f }
    L_0x0052:
        monitor-exit(r0);	 Catch:{ all -> 0x008f }
        r0 = r5.d;	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x0077;
    L_0x0057:
        r0 = r5.c;	 Catch:{ all -> 0x0092 }
        r0 = r0 instanceof defpackage.dez;	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x0077;
    L_0x005d:
        r0 = 1;
        if (r6 == r0) goto L_0x0077;
    L_0x0060:
        r6 = new dek;	 Catch:{ all -> 0x0092 }
        r1 = r4.e();	 Catch:{ all -> 0x0092 }
        r6.<init>(r1, r5);	 Catch:{ all -> 0x0092 }
        r6.h = r0;	 Catch:{ all -> 0x0092 }
        r5 = r6.a();	 Catch:{ all -> 0x0092 }
        r6 = r4.d();	 Catch:{ all -> 0x0092 }
        r6.a(r5);	 Catch:{ all -> 0x0092 }
        goto L_0x007a;
    L_0x0077:
        a(r2, r6);	 Catch:{ all -> 0x0092 }
    L_0x007a:
        r5 = b;
        monitor-enter(r5);
        r6 = b;	 Catch:{ all -> 0x008c }
        r6 = r6.isEmpty();	 Catch:{ all -> 0x008c }
        if (r6 == 0) goto L_0x008a;
    L_0x0085:
        r6 = r4.g;	 Catch:{ all -> 0x008c }
        r4.stopSelf(r6);	 Catch:{ all -> 0x008c }
    L_0x008a:
        monitor-exit(r5);	 Catch:{ all -> 0x008c }
        return;
    L_0x008c:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x008c }
        throw r6;
    L_0x008f:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x008f }
        throw r5;	 Catch:{ all -> 0x0092 }
    L_0x0092:
        r5 = move-exception;
        r6 = b;
        monitor-enter(r6);
        r0 = b;	 Catch:{ all -> 0x00a5 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00a5 }
        if (r0 == 0) goto L_0x00a3;
    L_0x009e:
        r0 = r4.g;	 Catch:{ all -> 0x00a5 }
        r4.stopSelf(r0);	 Catch:{ all -> 0x00a5 }
    L_0x00a3:
        monitor-exit(r6);	 Catch:{ all -> 0x00a5 }
        throw r5;
    L_0x00a5:
        r5 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00a5 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.GooglePlayReceiver.a(dep, int):void");
    }

    public final synchronized boolean b() {
        return this.h;
    }
}
