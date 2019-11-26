package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: agyk */
public final class agyk implements agyd, agyt {
    private static final long M = TimeUnit.MILLISECONDS.toSeconds(b);
    private static final long N = TimeUnit.MINUTES.toSeconds(1);
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    public static final long b = TimeUnit.SECONDS.toMillis(30);
    public static final long c = TimeUnit.MINUTES.toMillis(1);
    public volatile int A;
    public volatile boolean B;
    public final Map C;
    public final WakeLock D;
    public final WifiLock E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public volatile String J;
    public final Runnable K;
    public final boolean L = true;
    private final Context O;
    public xhv d;
    public xuu e;
    public wya f;
    public agwd g;
    public agwa h;
    public agej i;
    public agps j;
    public agyb k;
    public zyw l;
    public agyi m;
    public agyr n;
    public agyw o;
    public agyy p;
    public agzc q;
    public agzb r;
    public agza s;
    public final agyf t;
    public final agyg u;
    public final String v;
    public final HandlerThread w;
    public final Handler x;
    public final Object y;
    public volatile int z;

    public agyk(Context context, agyg agyg, String str, agyf agyf) {
        this.O = context;
        this.u = agyg;
        this.v = xvd.a(str);
        this.t = agyf;
        this.B = false;
        ((agyp) xse.a(context)).oP().a(this).a().a(this);
        this.y = new Object();
        this.C = new HashMap();
        agyw agyw = this.o;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        context.registerReceiver(agyw, intentFilter);
        agyy agyy = this.p;
        context.registerReceiver(agyy, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        agyy.a();
        agyi agyi = this.m;
        agyi.a = agyi.c.b();
        agyi.b = agyi.c.a();
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        context.registerReceiver(agyi, intentFilter);
        this.D = ((PowerManager) context.getSystemService("power")).newWakeLock(1, getClass().getName());
        this.E = ((WifiManager) context.getSystemService("wifi")).createWifiLock(getClass().getName());
        this.w = new HandlerThread(getClass().getName(), 10);
        this.w.start();
        this.x = new agym(this, this.w.getLooper());
        this.f.b("transfer_dm2");
        this.K = new agyj(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    public final void a(android.content.Intent r9) {
        /*
        r8 = this;
        if (r9 == 0) goto L_0x0114;
    L_0x0002:
        r0 = r9.getAction();
        if (r0 == 0) goto L_0x0114;
    L_0x0008:
        r0 = r9.getAction();
        r1 = r0.hashCode();
        r2 = -2138036982; // 0xffffffff8090250a float:-1.3237599E-38 double:NaN;
        r3 = 2;
        r4 = 1;
        r5 = 0;
        if (r1 == r2) goto L_0x0037;
    L_0x0018:
        r2 = 1134224607; // 0x439ae4df float:309.78806 double:5.60381413E-315;
        if (r1 == r2) goto L_0x002d;
    L_0x001d:
        r2 = 1897312741; // 0x7116b1e5 float:7.46205E29 double:9.373970447E-315;
        if (r1 == r2) goto L_0x0023;
    L_0x0022:
        goto L_0x0041;
    L_0x0023:
        r1 = "com.google.android.libraries.youtube.offline.transfer.service.ActionDelayedMessage";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0041;
    L_0x002b:
        r0 = 0;
        goto L_0x0042;
    L_0x002d:
        r1 = "com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0041;
    L_0x0035:
        r0 = 2;
        goto L_0x0042;
    L_0x0037:
        r1 = "com.google.android.libraries.youtube.offline.transfer.timewindow.ActionOfflineTimeWindow";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0041;
    L_0x003f:
        r0 = 1;
        goto L_0x0042;
    L_0x0041:
        r0 = -1;
    L_0x0042:
        if (r0 == 0) goto L_0x0101;
    L_0x0044:
        r1 = 7;
        if (r0 == r4) goto L_0x004f;
    L_0x0047:
        if (r0 == r3) goto L_0x004b;
    L_0x0049:
        goto L_0x0100;
    L_0x004b:
        r8.a(r1);
        return;
    L_0x004f:
        r0 = defpackage.avqk.g;
        r0 = r0.createBuilder();
        r0 = (defpackage.avqj) r0;
        r2 = "canOfflineNow";
        r2 = r9.getBooleanExtra(r2, r5);
        r0.a(r2);
        r2 = "timeCapSecs";
        r2 = r9.getIntExtra(r2, r5);
        r0.a(r2);
        r6 = 0;
        r2 = "sizeCapBytes";
        r6 = r9.getLongExtra(r2, r6);
        r0.a(r6);
        r2 = "hasDataRestriction";
        r2 = r9.getBooleanExtra(r2, r5);
        r0.b(r2);
        r2 = "startTimeWindow";
        r2 = r9.getStringExtra(r2);
        r5 = "endTimeWindow";
        r9 = r9.getStringExtra(r5);
        if (r2 != 0) goto L_0x008c;
    L_0x008b:
        goto L_0x00f0;
    L_0x008c:
        if (r9 == 0) goto L_0x00f0;
    L_0x008e:
        r5 = defpackage.avqi.d;
        r5 = r5.createBuilder();
        r5 = (defpackage.avqh) r5;
        r5.copyOnWrite();
        r6 = r5.instance;
        r6 = (defpackage.avqi) r6;
        r7 = r6.a;
        r4 = r4 | r7;
        r6.a = r4;
        r6.b = r2;
        r5.copyOnWrite();
        r2 = r5.instance;
        r2 = (defpackage.avqi) r2;
        r4 = r2.a;
        r3 = r3 | r4;
        r2.a = r3;
        r2.c = r9;
        r9 = r5.build();
        r9 = (defpackage.anxl) r9;
        r9 = (defpackage.avqi) r9;
        r2 = defpackage.avqo.c;
        r2 = r2.createBuilder();
        r2 = (defpackage.avqn) r2;
        r2.copyOnWrite();
        r3 = r2.instance;
        r3 = (defpackage.avqo) r3;
        if (r9 == 0) goto L_0x00ea;
    L_0x00cb:
        r3.b = r9;
        r9 = 135988795; // 0x81b063b float:4.665094E-34 double:6.7187392E-316;
        r3.a = r9;
        r0.copyOnWrite();
        r9 = r0.instance;
        r9 = (defpackage.avqk) r9;
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.avqo) r2;
        r9.e = r2;
        r2 = r9.a;
        r2 = r2 | 8;
        r9.a = r2;
        goto L_0x00f0;
    L_0x00ea:
        r9 = new java.lang.NullPointerException;
        r9.<init>();
        throw r9;
    L_0x00f0:
        r9 = r0.build();
        r9 = (defpackage.anxl) r9;
        r9 = (defpackage.avqk) r9;
        r0 = r8.q;
        r0.a(r9);
        r8.a(r1);
    L_0x0100:
        return;
    L_0x0101:
        r9 = r9.getExtras();
        r0 = "messageId";
        r0 = r9.getInt(r0);
        r1 = "messageData";
        r9 = r9.getString(r1);
        r8.a(r0, r9);
    L_0x0114:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyk.a(android.content.Intent):void");
    }

    public final int a(String str) {
        return a(1, (Object) str);
    }

    public final int b() {
        return a(14);
    }

    public final int a(String str, String str2, int i, agpw agpw) {
        return a(2, (Object) new agxh(str, str2, i, agpw, 0));
    }

    public final int a(String str, int i) {
        return a(3, i, 0, (Object) str);
    }

    public final int a(boolean z) {
        return a(4, (int) z, 0, null);
    }

    public final void c() {
        this.B = true;
        a(18);
        this.O.unregisterReceiver(this.o);
        this.O.unregisterReceiver(this.p);
        this.O.unregisterReceiver(this.m);
    }

    private final int a(int i) {
        synchronized (this.y) {
            this.x.removeCallbacks(this.K);
            this.A++;
            this.x.obtainMessage(i).sendToTarget();
            i = this.A;
        }
        return i;
    }

    private final int a(int i, Object obj) {
        synchronized (this.y) {
            this.x.removeCallbacks(this.K);
            this.A++;
            this.x.obtainMessage(i, obj).sendToTarget();
            i = this.A;
        }
        return i;
    }

    private final int a(int i, int i2, int i3, Object obj) {
        synchronized (this.y) {
            this.x.removeCallbacks(this.K);
            this.A++;
            this.x.obtainMessage(i, i2, i3, obj).sendToTarget();
            i = this.A;
        }
        return i;
    }

    private final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("servicePath", this.v);
        bundle.putString("intentAction", "com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup");
        return bundle;
    }

    public final void e() {
        a(7);
    }

    public final void f() {
        this.q.a();
        e();
    }

    public final void g() {
        synchronized (this.y) {
            agyg agyg = this.u;
            int i = this.z;
            boolean z = false;
            if (!this.H) {
                if (!this.I) {
                    z = true;
                }
            }
            agyg.a(i, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x016b  */
    public final void h() {
        /*
        r32 = this;
        r0 = r32;
        r1 = r0.C;
        r1 = r1.keySet();
        r1 = r1.iterator();
    L_0x000c:
        r2 = r1.hasNext();
        r3 = 2;
        if (r2 == 0) goto L_0x0029;
    L_0x0013:
        r2 = r1.next();
        r2 = (java.lang.String) r2;
        r6 = r0.r;
        r2 = r6.c(r2);
        r2 = r2.f;
        r2 = defpackage.agxj.q(r2);
        if (r2 != r3) goto L_0x000c;
    L_0x0027:
        r1 = 1;
        goto L_0x002a;
    L_0x0029:
        r1 = 0;
    L_0x002a:
        r2 = r0.F;
        if (r2 == 0) goto L_0x0039;
    L_0x002e:
        r2 = r0.d;
        r2 = defpackage.ahap.a(r2);
        if (r2 == 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0039;
    L_0x0037:
        r2 = 1;
        goto L_0x003a;
    L_0x0039:
        r2 = 0;
    L_0x003a:
        r6 = r0.d;
        r6 = r6.c();
        if (r6 != 0) goto L_0x0044;
    L_0x0042:
        r6 = 2;
        goto L_0x0045;
    L_0x0044:
        r6 = 0;
    L_0x0045:
        if (r2 != 0) goto L_0x0049;
    L_0x0047:
        r2 = 0;
        goto L_0x004b;
    L_0x0049:
        r2 = 8;
    L_0x004b:
        r2 = r2 | r6;
        r6 = r0.h;
        r6 = r6.c();
        r8 = r0.r;
        r8 = r8.c();
        r8 = r8.iterator();
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
    L_0x0063:
        r16 = r8.hasNext();
        if (r16 == 0) goto L_0x020d;
    L_0x0069:
        r16 = r8.next();
        r5 = r16;
        r5 = (defpackage.agxh) r5;
        r16 = r5.b();
        if (r16 != 0) goto L_0x0078;
    L_0x0077:
        goto L_0x0063;
    L_0x0078:
        r3 = r5.e;
        r17 = 0;
        r19 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1));
        if (r19 <= 0) goto L_0x008e;
    L_0x0080:
        r17 = r14;
        r18 = r15;
        r14 = r5.d;
        r3 = r3 - r14;
        r14 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r14 < 0) goto L_0x008c;
    L_0x008b:
        goto L_0x0092;
    L_0x008c:
        r3 = 1;
        goto L_0x0093;
    L_0x008e:
        r17 = r14;
        r18 = r15;
    L_0x0092:
        r3 = 0;
    L_0x0093:
        r4 = r5.f;
        r4 = defpackage.agxj.i(r4);
        if (r4 == 0) goto L_0x00c8;
    L_0x009b:
        r4 = r2 & -9;
        r14 = r0.q;
        r14 = r14.a;
        r14 = r14.b;
        r15 = r0.d;
        r15 = defpackage.ahap.b(r15);
        if (r15 == 0) goto L_0x00ad;
    L_0x00ab:
        r15 = 1;
        goto L_0x00b6;
    L_0x00ad:
        if (r14 != 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x00ab;
    L_0x00b0:
        r15 = r14.f;
        if (r15 == 0) goto L_0x00b5;
    L_0x00b4:
        goto L_0x00ab;
    L_0x00b5:
        r15 = 0;
    L_0x00b6:
        if (r14 == 0) goto L_0x00bf;
    L_0x00b8:
        r14 = r14.b;
        if (r14 != 0) goto L_0x00bd;
    L_0x00bc:
        goto L_0x00bf;
    L_0x00bd:
        r14 = 1;
        goto L_0x00c0;
    L_0x00bf:
        r14 = 0;
    L_0x00c0:
        if (r15 != 0) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00c9;
    L_0x00c3:
        if (r14 == 0) goto L_0x00c6;
    L_0x00c5:
        goto L_0x00c2;
    L_0x00c6:
        r14 = 1;
        goto L_0x00ca;
    L_0x00c8:
        r4 = r2;
    L_0x00c9:
        r14 = 0;
    L_0x00ca:
        r15 = r5.f;
        r15 = defpackage.agxj.a(r15);
        r19 = r2;
        r2 = 5;
        if (r15 != r2) goto L_0x00df;
    L_0x00d5:
        r2 = r5.f;
        r2 = defpackage.agxj.E(r2);
        if (r2 == 0) goto L_0x00df;
    L_0x00dd:
        r4 = r4 & -11;
    L_0x00df:
        r2 = r5.f;
        r2 = defpackage.agxj.h(r2);
        if (r2 == 0) goto L_0x00f0;
    L_0x00e7:
        r2 = r0.m;
        r2 = r2.a;
        if (r2 == 0) goto L_0x00ee;
    L_0x00ed:
        goto L_0x00f0;
    L_0x00ee:
        r2 = 1;
        goto L_0x00f1;
    L_0x00f0:
        r2 = 0;
    L_0x00f1:
        r15 = r5.f;
        r15 = defpackage.agxj.k(r15);
        r20 = r6;
        r6 = r0.m;
        r6 = r6.a;
        if (r6 != 0) goto L_0x010f;
    L_0x00ff:
        r6 = (float) r15;
        r7 = r0.m;
        r7 = r7.b;
        r15 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r7 = r7 * r15;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 > 0) goto L_0x010d;
    L_0x010c:
        goto L_0x010f;
    L_0x010d:
        r6 = 1;
        goto L_0x0110;
    L_0x010f:
        r6 = 0;
    L_0x0110:
        if (r3 != 0) goto L_0x0114;
    L_0x0112:
        r3 = 0;
        goto L_0x0116;
    L_0x0114:
        r3 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
    L_0x0116:
        r3 = r3 | r4;
        if (r14 != 0) goto L_0x011b;
    L_0x0119:
        r4 = 0;
        goto L_0x011d;
    L_0x011b:
        r4 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
    L_0x011d:
        r3 = r3 | r4;
        if (r2 != 0) goto L_0x0122;
    L_0x0120:
        r2 = 0;
        goto L_0x0124;
    L_0x0122:
        r2 = 16;
    L_0x0124:
        r2 = r2 | r3;
        if (r6 != 0) goto L_0x0129;
    L_0x0127:
        r3 = 0;
        goto L_0x012b;
    L_0x0129:
        r3 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
    L_0x012b:
        r2 = r2 | r3;
        r3 = r2 & 4096;
        if (r3 == 0) goto L_0x013e;
    L_0x0130:
        r3 = r0.g;
        r4 = r0.v;
        r6 = r5.e;
        r14 = r5.d;
        r6 = r6 - r14;
        r14 = "com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup";
        r3.a(r4, r14, r6);
    L_0x013e:
        r3 = r2 & 256;
        if (r3 != 0) goto L_0x0143;
    L_0x0142:
        goto L_0x0144;
    L_0x0143:
        r11 = 1;
    L_0x0144:
        r3 = r2 & 2;
        if (r3 != 0) goto L_0x0149;
    L_0x0148:
        goto L_0x014a;
    L_0x0149:
        r13 = 1;
    L_0x014a:
        r3 = r2 & 8;
        if (r3 != 0) goto L_0x0151;
    L_0x014e:
        r14 = r17;
        goto L_0x0152;
    L_0x0151:
        r14 = 1;
    L_0x0152:
        r3 = r2 & 16;
        if (r3 != 0) goto L_0x015d;
    L_0x0156:
        r3 = r2 & 2048;
        if (r3 != 0) goto L_0x015d;
    L_0x015a:
        r15 = r18;
        goto L_0x015e;
    L_0x015d:
        r15 = 1;
    L_0x015e:
        if (r2 == 0) goto L_0x016b;
    L_0x0160:
        r0.a(r5, r2);
        r2 = r19;
        r6 = r20;
        r3 = 2;
        r10 = 1;
        goto L_0x0063;
    L_0x016b:
        r2 = r0.s;
        r3 = r5.a;
        r2 = r2.a(r3);
        if (r2 != 0) goto L_0x0205;
    L_0x0175:
        r2 = r0.C;
        r3 = r5.a;
        r2 = r2.containsKey(r3);
        if (r2 == 0) goto L_0x0191;
    L_0x017f:
        r2 = r0.C;
        r3 = r5.a;
        r2 = r2.get(r3);
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x0205;
    L_0x018f:
        r3 = 2;
        goto L_0x019c;
    L_0x0191:
        r2 = r5.f;
        r2 = defpackage.agxj.q(r2);
        r3 = 2;
        if (r2 != r3) goto L_0x01a2;
    L_0x019a:
        if (r1 == 0) goto L_0x01a2;
    L_0x019c:
        r2 = r19;
        r6 = r20;
        goto L_0x0063;
    L_0x01a2:
        r2 = r5.a;
        r4 = r0.s;
        r4 = r4.a(r2);
        r6 = 1;
        r4 = r4 ^ r6;
        defpackage.amqw.b(r4);
        r4 = r5.f;
        r4 = defpackage.agxj.a(r4);
        r6 = r0.s;
        r6 = r6.a(r4);
        if (r6 == 0) goto L_0x019c;
    L_0x01bd:
        r6 = r0.t;
        r7 = r5.a();
        r6 = r6.a(r7, r0);
        if (r6 == 0) goto L_0x019c;
    L_0x01c9:
        r7 = r0.s;
        r2 = r7.a(r2, r6, r4);
        if (r2 == 0) goto L_0x019c;
    L_0x01d1:
        r2 = defpackage.agrc.RUNNING;
        r5.b = r2;
        r2 = 0;
        r5.c = r2;
        r2 = r0.k;
        r2.b(r5);
        r2 = r0.n;
        r4 = new agyu;
        r7 = "offlineTransfer";
        r4.<init>(r2, r6, r7);
        r4.start();
        r2 = r0.u;
        r4 = r5.a();
        r6 = r5.f;
        r6 = defpackage.agxj.w(r6);
        r7 = 1;
        r2.a(r4, r7, r6);
        r2 = r5.f;
        r2 = defpackage.agxj.i(r2);
        if (r2 == 0) goto L_0x0203;
    L_0x0201:
        r12 = r12 + 1;
    L_0x0203:
        r9 = 1;
        goto L_0x019c;
    L_0x0205:
        r2 = r19;
        r6 = r20;
        r3 = 2;
        r9 = 1;
        goto L_0x0063;
    L_0x020d:
        r17 = r14;
        r18 = r15;
        r0.H = r9;
        r0.I = r10;
        if (r9 == 0) goto L_0x0225;
    L_0x0217:
        r1 = r0.E;
        r1 = r1.isHeld();
        if (r1 != 0) goto L_0x0232;
    L_0x021f:
        r1 = r0.E;
        r1.acquire();
        goto L_0x0232;
    L_0x0225:
        r1 = r0.E;
        r1 = r1.isHeld();
        if (r1 == 0) goto L_0x0232;
    L_0x022d:
        r1 = r0.E;
        r1.release();
    L_0x0232:
        if (r11 == 0) goto L_0x0239;
    L_0x0234:
        r1 = 17;
        r0.a(r1);
    L_0x0239:
        if (r12 <= 0) goto L_0x024e;
    L_0x023b:
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = java.lang.Integer.valueOf(r12);
        r3 = 0;
        r1[r3] = r2;
        r2 = "Started %d transfers that required time window.";
        r1 = java.lang.String.format(r2, r1);
        defpackage.xtl.e(r1);
    L_0x024e:
        if (r13 != 0) goto L_0x0258;
    L_0x0250:
        r1 = r0.f;
        r2 = "transfer_connectivity_wakeup";
        r1.a(r2);
        goto L_0x026d;
    L_0x0258:
        r3 = r0.f;
        r5 = M;
        r7 = N;
        r9 = 1;
        r10 = 1;
        r11 = 0;
        r12 = r32.i();
        r13 = 0;
        r14 = 1;
        r15 = 0;
        r4 = "transfer_connectivity_wakeup";
        r3.a(r4, r5, r7, r9, r10, r11, r12, r13, r14, r15);
    L_0x026d:
        if (r17 == 0) goto L_0x028d;
    L_0x026f:
        r1 = r0.f;
        r21 = M;
        r23 = N;
        r25 = 1;
        r26 = 2;
        r27 = 0;
        r28 = r32.i();
        r29 = 0;
        r30 = 1;
        r31 = 0;
        r20 = "transfer_wifi_wakeup";
        r19 = r1;
        r19.a(r20, r21, r23, r25, r26, r27, r28, r29, r30, r31);
        goto L_0x0294;
    L_0x028d:
        r1 = r0.f;
        r2 = "transfer_wifi_wakeup";
        r1.a(r2);
    L_0x0294:
        if (r18 == 0) goto L_0x02ac;
    L_0x0296:
        r3 = r0.f;
        r5 = M;
        r7 = N;
        r9 = 1;
        r10 = 1;
        r11 = 1;
        r12 = r32.i();
        r13 = 0;
        r14 = 1;
        r15 = 0;
        r4 = "transfer_charger_wakeup";
        r3.a(r4, r5, r7, r9, r10, r11, r12, r13, r14, r15);
        return;
    L_0x02ac:
        r1 = r0.f;
        r2 = "transfer_charger_wakeup";
        r1.a(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyk.h():void");
    }

    public final void a(agxh agxh, int i) {
        Object obj;
        if (agxh.b != agrc.PENDING) {
            agxh.b = agrc.PENDING;
            obj = 1;
        } else {
            obj = null;
        }
        String str = agxh.a;
        agya b = this.s.b(str);
        if (b != null) {
            b.a(i);
        }
        agxh.j = 0;
        this.C.remove(str);
        if (agxh.c != i) {
            agxh.c = i;
            obj = 1;
        }
        this.k.b(agxh);
        if (obj != null) {
            agqf agqf;
            agyg agyg = this.u;
            agqz a = agxh.a();
            if ((agxh.c & 128) != 0) {
                agqf = agqf.PAUSED;
            } else {
                agqf = agxj.w(agxh.f);
            }
            agyg.a(a, 1, agqf);
        }
    }

    public final String d() {
        return this.J;
    }

    public final void a(String str, long j) {
        a(8, (int) (j >> 31), (int) (j & 2147483647L), (Object) str);
    }

    public final void a() {
        a(19);
    }

    public final void a(String str, long j, double d, boolean z) {
        a(9, (Object) new agyo(str, j, d, z));
    }

    public final void a(String str, agpw agpw) {
        a(10, Pair.create(str, agpw));
    }

    public final int a(String str, agyc agyc, agpw agpw) {
        agxh c = this.r.c(str);
        if (c == null) {
            return 1;
        }
        agpw agpw2 = c.f;
        int i = c.j + 1;
        int i2 = agyc.c;
        boolean z = agyc.a;
        if (i2 == 29) {
            agpw.a("stream_verification_attempts", agxj.A(agpw) + 1);
        }
        if (i2 == 32 && agpp.a(agpw2)) {
            afpf afpf = afpf.offline;
            avnm avnm = this.l.a().l;
            if (avnm == null) {
                avnm = avnm.q;
            }
            afpc.a(afpf, "ytb transfer error", (Exception) agyc, avnm.j);
        }
        if (!z) {
            if (agpp.a(this.i, agpw2)) {
                avqv avqv = (avqv) ((anxo) agpp.a(c.a()).toBuilder());
                avqv.c(14);
                avqv.d(i2);
                this.j.a((avqw) ((anxl) avqv.build()));
            }
            if (agxj.q(agpw2) == 0) {
                i2 = 30;
            } else if (i > agxj.s(agpw2)) {
                i2 = 8;
            } else if (((long) agxj.A(agpw)) > 2) {
                i2 = 28;
            }
            z = true;
        }
        a(21, new Pair(str, agpw));
        if (agyc.getCause() != null && (agyc.getCause() instanceof ahan)) {
            a(16, 256, 0, (Object) str);
            a(17);
            return 2;
        } else if (agyc.getCause() != null && (agyc.getCause() instanceof agxm)) {
            agxm agxm = (agxm) agyc.getCause();
            a(16, 4096, 0, (Object) str);
            e();
            this.g.a(this.v, "com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup", agxm.a);
            return 2;
        } else if (z) {
            a(12, new agyl(str, agyc.b, i2));
            return 1;
        } else {
            a(11, (Object) str);
            return 0;
        }
    }
}
