package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.youtube.R;

/* renamed from: acck */
public final class acck {
    private static final SparseIntArray n = new SparseIntArray(9);
    private static final SparseIntArray o = new SparseIntArray(6);
    private aopj A;
    public final Handler a;
    public final xsc b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Runnable d = new accn(this);
    public final Runnable e = new accm(this);
    public volatile boolean f;
    public volatile boolean g;
    public volatile int h;
    public volatile boolean i;
    public accz j;
    public int k;
    public long l;
    public long m;
    private final Context p;
    private final String q;
    private final abap r;
    private volatile int s = -1;
    private volatile String t;
    private volatile arml u;
    private volatile String v;
    private volatile String w;
    private volatile String x;
    private volatile String y;
    private volatile int z = 23;

    public acck(Context context, String str, abap abap) {
        this.p = (Context) amqw.a((Object) context);
        this.q = str;
        this.r = (abap) amqw.a((Object) abap);
        this.b = new xvf();
        HandlerThread handlerThread = new HandlerThread("MonitorThread", 10);
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
        handlerThread.setUncaughtExceptionHandler(new acco(this));
        a();
    }

    public final void a() {
        this.s = 3;
        this.t = this.p.getResources().getString(R.string.lc_default_stream_status_nodata_text);
        this.v = null;
        this.w = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x04eb  */
    /* JADX WARNING: Missing block: B:75:0x0124, code skipped:
            if (r13 == 101) goto L_0x0126;
     */
    /* JADX WARNING: Missing block: B:120:0x01c0, code skipped:
            if (r13 == 12) goto L_0x01c2;
     */
    /* JADX WARNING: Missing block: B:176:0x0283, code skipped:
            if (r2 == null) goto L_0x0285;
     */
    /* JADX WARNING: Missing block: B:180:0x028a, code skipped:
            if (r2 != null) goto L_0x028c;
     */
    /* JADX WARNING: Missing block: B:185:0x02a0, code skipped:
            if (r1.u.toString().equals(r2.toString()) == false) goto L_0x02a2;
     */
    public final void b() {
        /*
        r20 = this;
        r1 = r20;
        defpackage.xak.b();
        monitor-enter(r20);
        r2 = r1.h;	 Catch:{ all -> 0x055a }
        monitor-exit(r20);	 Catch:{ all -> 0x055a }
        r0 = r1.r;
        r0 = r0.a();
        r3 = r1.q;
        r3 = android.text.TextUtils.isEmpty(r3);
        r4 = 1;
        if (r3 != 0) goto L_0x0021;
    L_0x0018:
        r0.o();
        r3 = r1.q;
        r0.c(r3);
        goto L_0x0023;
    L_0x0021:
        r0.a = r4;
    L_0x0023:
        r0.n();
        r0.b = r4;
        r0.c = r4;
        r3 = 0;
        r5 = r1.r;	 Catch:{ aanq -> 0x0040 }
        r6 = defpackage.asqb.e;	 Catch:{ aanq -> 0x0040 }
        r7 = r5.b;	 Catch:{ aanq -> 0x0040 }
        r8 = defpackage.abaq.a;	 Catch:{ aanq -> 0x0040 }
        r9 = defpackage.abat.a;	 Catch:{ aanq -> 0x0040 }
        r5 = r5.a(r6, r7, r8, r9);	 Catch:{ aanq -> 0x0040 }
        r0 = r5.b(r0);	 Catch:{ aanq -> 0x0040 }
        r0 = (defpackage.asqb) r0;	 Catch:{ aanq -> 0x0040 }
        goto L_0x004f;
    L_0x0040:
        r0 = move-exception;
        monitor-enter(r20);
        r5 = r1.h;	 Catch:{ all -> 0x0557 }
        if (r2 != r5) goto L_0x0555;
    L_0x0046:
        r5 = "StreamHealthMonitor";
        r6 = "Could not fetch stream liveStreamHealthStatus";
        android.util.Log.e(r5, r6, r0);	 Catch:{ all -> 0x0557 }
        monitor-exit(r20);	 Catch:{ all -> 0x0557 }
        r0 = r3;
    L_0x004f:
        monitor-enter(r20);
        r5 = r1.h;	 Catch:{ all -> 0x0552 }
        if (r2 == r5) goto L_0x0056;
    L_0x0054:
        monitor-exit(r20);	 Catch:{ all -> 0x0552 }
        return;
    L_0x0056:
        r2 = r1.a(r0);	 Catch:{ all -> 0x0552 }
        r5 = 0;
        if (r2 == 0) goto L_0x006e;
    L_0x005d:
        r6 = r2.f;	 Catch:{ all -> 0x0552 }
        r6 = r6.size();	 Catch:{ all -> 0x0552 }
        if (r6 <= 0) goto L_0x006e;
    L_0x0065:
        r2 = r2.f;	 Catch:{ all -> 0x0552 }
        r2 = r2.get(r5);	 Catch:{ all -> 0x0552 }
        r2 = (defpackage.asqh) r2;	 Catch:{ all -> 0x0552 }
        goto L_0x006f;
    L_0x006e:
        r2 = r3;
    L_0x006f:
        r6 = r1.a(r0);	 Catch:{ all -> 0x0552 }
        if (r0 != 0) goto L_0x0077;
    L_0x0075:
        r7 = r3;
        goto L_0x00bf;
    L_0x0077:
        r7 = r0.d;	 Catch:{ all -> 0x0552 }
        r7 = r7.size();	 Catch:{ all -> 0x0552 }
        if (r7 == 0) goto L_0x0075;
    L_0x007f:
        r7 = r0.d;	 Catch:{ all -> 0x0552 }
        r7 = r7.get(r5);	 Catch:{ all -> 0x0552 }
        r7 = (defpackage.axak) r7;	 Catch:{ all -> 0x0552 }
        r8 = com.google.protos.youtube.api.innertube.BroadcastStatusRendererOuterClass.broadcastStatusRenderer;	 Catch:{ all -> 0x0552 }
        r8 = defpackage.anxl.checkIsLite(r8);	 Catch:{ all -> 0x0552 }
        r7.a(r8);	 Catch:{ all -> 0x0552 }
        r7 = r7.h;	 Catch:{ all -> 0x0552 }
        r8 = r8.d;	 Catch:{ all -> 0x0552 }
        r7 = r7.a(r8);	 Catch:{ all -> 0x0552 }
        if (r7 != 0) goto L_0x009b;
    L_0x009a:
        goto L_0x0075;
    L_0x009b:
        r7 = r0.d;	 Catch:{ all -> 0x0552 }
        r7 = r7.get(r5);	 Catch:{ all -> 0x0552 }
        r7 = (defpackage.axak) r7;	 Catch:{ all -> 0x0552 }
        r8 = com.google.protos.youtube.api.innertube.BroadcastStatusRendererOuterClass.broadcastStatusRenderer;	 Catch:{ all -> 0x0552 }
        r8 = defpackage.anxl.checkIsLite(r8);	 Catch:{ all -> 0x0552 }
        r7.a(r8);	 Catch:{ all -> 0x0552 }
        r7 = r7.h;	 Catch:{ all -> 0x0552 }
        r9 = r8.d;	 Catch:{ all -> 0x0552 }
        r7 = r7.b(r9);	 Catch:{ all -> 0x0552 }
        if (r7 != 0) goto L_0x00b9;
    L_0x00b6:
        r7 = r8.b;	 Catch:{ all -> 0x0552 }
        goto L_0x00bd;
    L_0x00b9:
        r7 = r8.a(r7);	 Catch:{ all -> 0x0552 }
    L_0x00bd:
        r7 = (defpackage.apfz) r7;	 Catch:{ all -> 0x0552 }
    L_0x00bf:
        if (r7 != 0) goto L_0x00c3;
    L_0x00c1:
        r8 = r3;
        goto L_0x0101;
    L_0x00c3:
        r8 = r7.f;	 Catch:{ all -> 0x0552 }
        if (r8 == 0) goto L_0x00c8;
    L_0x00c7:
        goto L_0x00ca;
    L_0x00c8:
        r8 = defpackage.axak.a;	 Catch:{ all -> 0x0552 }
    L_0x00ca:
        r9 = com.google.protos.youtube.api.innertube.AlertRendererOuterClass.alertRenderer;	 Catch:{ all -> 0x0552 }
        r9 = defpackage.anxl.checkIsLite(r9);	 Catch:{ all -> 0x0552 }
        r8.a(r9);	 Catch:{ all -> 0x0552 }
        r8 = r8.h;	 Catch:{ all -> 0x0552 }
        r9 = r9.d;	 Catch:{ all -> 0x0552 }
        r8 = r8.a(r9);	 Catch:{ all -> 0x0552 }
        if (r8 != 0) goto L_0x00de;
    L_0x00dd:
        goto L_0x00c1;
    L_0x00de:
        r8 = r7.f;	 Catch:{ all -> 0x0552 }
        if (r8 == 0) goto L_0x00e3;
    L_0x00e2:
        goto L_0x00e5;
    L_0x00e3:
        r8 = defpackage.axak.a;	 Catch:{ all -> 0x0552 }
    L_0x00e5:
        r9 = com.google.protos.youtube.api.innertube.AlertRendererOuterClass.alertRenderer;	 Catch:{ all -> 0x0552 }
        r9 = defpackage.anxl.checkIsLite(r9);	 Catch:{ all -> 0x0552 }
        r8.a(r9);	 Catch:{ all -> 0x0552 }
        r8 = r8.h;	 Catch:{ all -> 0x0552 }
        r10 = r9.d;	 Catch:{ all -> 0x0552 }
        r8 = r8.b(r10);	 Catch:{ all -> 0x0552 }
        if (r8 != 0) goto L_0x00fb;
    L_0x00f8:
        r8 = r9.b;	 Catch:{ all -> 0x0552 }
        goto L_0x00ff;
    L_0x00fb:
        r8 = r9.a(r8);	 Catch:{ all -> 0x0552 }
    L_0x00ff:
        r8 = (defpackage.aopj) r8;	 Catch:{ all -> 0x0552 }
    L_0x0101:
        r9 = r1.p;	 Catch:{ all -> 0x0552 }
        r9 = r9.getResources();	 Catch:{ all -> 0x0552 }
        r10 = 4000; // 0xfa0 float:5.605E-42 double:1.9763E-320;
        if (r2 != 0) goto L_0x010d;
    L_0x010b:
        goto L_0x0209;
    L_0x010d:
        if (r6 == 0) goto L_0x0209;
    L_0x010f:
        r12 = r6.d;	 Catch:{ all -> 0x0552 }
        r12 = defpackage.aspt.a(r12);	 Catch:{ all -> 0x0552 }
        if (r12 == 0) goto L_0x0118;
    L_0x0117:
        goto L_0x0119;
    L_0x0118:
        r12 = 1;
    L_0x0119:
        r13 = r2.b;	 Catch:{ all -> 0x0552 }
        r13 = defpackage.asqj.a(r13);	 Catch:{ all -> 0x0552 }
        if (r13 != 0) goto L_0x0122;
    L_0x0121:
        goto L_0x0128;
    L_0x0122:
        r14 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r13 != r14) goto L_0x0128;
    L_0x0126:
        r13 = 1;
        goto L_0x0144;
    L_0x0128:
        r13 = r2.b;	 Catch:{ all -> 0x0552 }
        r13 = defpackage.asqj.a(r13);	 Catch:{ all -> 0x0552 }
        if (r13 != 0) goto L_0x0131;
    L_0x0130:
        goto L_0x0136;
    L_0x0131:
        r14 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        if (r13 != r14) goto L_0x0136;
    L_0x0135:
        goto L_0x0126;
    L_0x0136:
        r13 = r2.b;	 Catch:{ all -> 0x0552 }
        r13 = defpackage.asqj.a(r13);	 Catch:{ all -> 0x0552 }
        if (r13 == 0) goto L_0x0143;
    L_0x013e:
        r14 = 301; // 0x12d float:4.22E-43 double:1.487E-321;
        if (r13 != r14) goto L_0x0143;
    L_0x0142:
        goto L_0x0126;
    L_0x0143:
        r13 = 0;
    L_0x0144:
        r14 = r6.d;	 Catch:{ all -> 0x0552 }
        r14 = defpackage.aspt.a(r14);	 Catch:{ all -> 0x0552 }
        r15 = 5;
        if (r14 == 0) goto L_0x0164;
    L_0x014d:
        r11 = 3;
        if (r14 != r11) goto L_0x0164;
    L_0x0150:
        if (r13 != 0) goto L_0x0153;
    L_0x0152:
        goto L_0x0164;
    L_0x0153:
        r11 = r1.g;	 Catch:{ all -> 0x0552 }
        if (r11 != 0) goto L_0x0164;
    L_0x0157:
        r1.g = r4;	 Catch:{ all -> 0x0552 }
        r11 = r1.j;	 Catch:{ all -> 0x0552 }
        r13 = new accw;	 Catch:{ all -> 0x0552 }
        r13.<init>(r11, r5, r4, r5);	 Catch:{ all -> 0x0552 }
        r1.a(r13);	 Catch:{ all -> 0x0552 }
        goto L_0x0185;
    L_0x0164:
        if (r12 != r15) goto L_0x0185;
    L_0x0166:
        if (r13 != 0) goto L_0x0169;
    L_0x0168:
        goto L_0x0185;
    L_0x0169:
        r11 = r1.f;	 Catch:{ all -> 0x0552 }
        if (r11 != 0) goto L_0x0185;
    L_0x016d:
        r11 = 2131952544; // 0x7f1303a0 float:1.9541534E38 double:1.0533245106E-314;
        r11 = r9.getString(r11);	 Catch:{ all -> 0x0552 }
        r1.a(r5, r11, r3);	 Catch:{ all -> 0x0552 }
        r1.k = r10;	 Catch:{ all -> 0x0552 }
        r1.f = r4;	 Catch:{ all -> 0x0552 }
        r11 = r1.j;	 Catch:{ all -> 0x0552 }
        r13 = new accw;	 Catch:{ all -> 0x0552 }
        r13.<init>(r11, r5, r5, r4);	 Catch:{ all -> 0x0552 }
        r1.a(r13);	 Catch:{ all -> 0x0552 }
    L_0x0185:
        r11 = n;	 Catch:{ all -> 0x0552 }
        if (r12 != r15) goto L_0x0194;
    L_0x0189:
        r13 = r2.b;	 Catch:{ all -> 0x0552 }
        r13 = defpackage.asqj.a(r13);	 Catch:{ all -> 0x0552 }
        if (r13 == 0) goto L_0x0192;
    L_0x0191:
        goto L_0x019c;
    L_0x0192:
        r13 = 1;
        goto L_0x0191;
    L_0x0194:
        r13 = r6.d;	 Catch:{ all -> 0x0552 }
        r13 = defpackage.aspt.a(r13);	 Catch:{ all -> 0x0552 }
        if (r13 == 0) goto L_0x019e;
    L_0x019c:
        r14 = -1;
        goto L_0x01a0;
    L_0x019e:
        r13 = 1;
        goto L_0x019c;
    L_0x01a0:
        r13 = r13 + r14;
        r11 = r11.get(r13, r14);	 Catch:{ all -> 0x0552 }
        r13 = r2.c;	 Catch:{ all -> 0x0552 }
        r13 = r13.size();	 Catch:{ all -> 0x0552 }
        if (r13 <= 0) goto L_0x01ef;
    L_0x01ad:
        r2 = r2.c;	 Catch:{ all -> 0x0552 }
        r2 = r2.get(r5);	 Catch:{ all -> 0x0552 }
        r2 = (defpackage.asqd) r2;	 Catch:{ all -> 0x0552 }
        r13 = r2.b;	 Catch:{ all -> 0x0552 }
        r13 = defpackage.asqf.a(r13);	 Catch:{ all -> 0x0552 }
        if (r13 != 0) goto L_0x01be;
    L_0x01bd:
        goto L_0x01c4;
    L_0x01be:
        r14 = 12;
        if (r13 != r14) goto L_0x01c4;
    L_0x01c2:
        r13 = 0;
        goto L_0x01d2;
    L_0x01c4:
        r13 = r2.b;	 Catch:{ all -> 0x0552 }
        r13 = defpackage.asqf.a(r13);	 Catch:{ all -> 0x0552 }
        if (r13 == 0) goto L_0x01d1;
    L_0x01cc:
        r14 = 33;
        if (r13 != r14) goto L_0x01d1;
    L_0x01d0:
        goto L_0x01c2;
    L_0x01d1:
        r13 = 1;
    L_0x01d2:
        r14 = r2.c;	 Catch:{ all -> 0x0552 }
        if (r14 != 0) goto L_0x01d8;
    L_0x01d6:
        r14 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x01d8:
        r14 = defpackage.ajqy.a(r14);	 Catch:{ all -> 0x0552 }
        r14 = r14.toString();	 Catch:{ all -> 0x0552 }
        r2 = r2.d;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x01e6;
    L_0x01e4:
        r2 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x01e6:
        r2 = defpackage.ajqy.a(r2);	 Catch:{ all -> 0x0552 }
        r2 = r2.toString();	 Catch:{ all -> 0x0552 }
        goto L_0x01f2;
    L_0x01ef:
        r2 = r3;
        r14 = r2;
        r13 = 1;
    L_0x01f2:
        r16 = android.text.TextUtils.isEmpty(r14);	 Catch:{ all -> 0x0552 }
        if (r16 == 0) goto L_0x021a;
    L_0x01f8:
        if (r12 != r15) goto L_0x0201;
    L_0x01fa:
        r12 = o;	 Catch:{ all -> 0x0552 }
        r12 = r12.get(r11);	 Catch:{ all -> 0x0552 }
        goto L_0x0204;
    L_0x0201:
        r12 = 2131952548; // 0x7f1303a4 float:1.9541542E38 double:1.0533245125E-314;
    L_0x0204:
        r14 = r9.getString(r12);	 Catch:{ all -> 0x0552 }
        goto L_0x021a;
    L_0x0209:
        r2 = "StreamHealthMonitor";
        r11 = "Could not obtain health of stream";
        android.util.Log.e(r2, r11);	 Catch:{ all -> 0x0552 }
        r2 = 2131952549; // 0x7f1303a5 float:1.9541544E38 double:1.053324513E-314;
        r14 = r9.getString(r2);	 Catch:{ all -> 0x0552 }
        r2 = r3;
        r11 = -1;
        r13 = 1;
    L_0x021a:
        r12 = r1.k;	 Catch:{ all -> 0x0552 }
        r15 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r12 != r15) goto L_0x025a;
    L_0x0220:
        r12 = r1.b;	 Catch:{ all -> 0x0552 }
        r17 = r12.c();	 Catch:{ all -> 0x0552 }
        r3 = r1.l;	 Catch:{ all -> 0x0552 }
        r19 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1));
        if (r19 < 0) goto L_0x023b;
    L_0x022c:
        r3 = r1.m;	 Catch:{ all -> 0x0552 }
        r19 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1));
        if (r19 >= 0) goto L_0x023b;
    L_0x0232:
        r3 = 2131952633; // 0x7f1303f9 float:1.9541714E38 double:1.0533245545E-314;
        r14 = r9.getString(r3);	 Catch:{ all -> 0x0552 }
        r11 = 2;
        goto L_0x025a;
    L_0x023b:
        r3 = r1.m;	 Catch:{ all -> 0x0552 }
        r9 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1));
        if (r9 >= 0) goto L_0x0242;
    L_0x0241:
        goto L_0x025a;
    L_0x0242:
        r1.k = r10;	 Catch:{ all -> 0x0552 }
        r3 = r1.f;	 Catch:{ all -> 0x0552 }
        if (r3 != 0) goto L_0x025a;
    L_0x0248:
        r3 = "StreamHealthMonitor";
        r4 = "Unable to activate stream, timing out: 60";
        android.util.Log.e(r3, r4);	 Catch:{ all -> 0x0552 }
        r3 = r1.j;	 Catch:{ all -> 0x0552 }
        r4 = new accw;	 Catch:{ all -> 0x0552 }
        r9 = 1;
        r4.<init>(r3, r9, r5, r5);	 Catch:{ all -> 0x0552 }
        r1.a(r4);	 Catch:{ all -> 0x0552 }
    L_0x025a:
        r3 = 4;
        if (r13 == 0) goto L_0x02bb;
    L_0x025d:
        if (r8 != 0) goto L_0x0263;
    L_0x025f:
        r1.a(r11, r14, r2);	 Catch:{ all -> 0x0552 }
        goto L_0x02bb;
    L_0x0263:
        if (r6 == 0) goto L_0x0273;
    L_0x0265:
        r2 = r6.d;	 Catch:{ all -> 0x0552 }
        r2 = defpackage.aspt.a(r2);	 Catch:{ all -> 0x0552 }
        if (r2 == 0) goto L_0x0273;
    L_0x026d:
        r4 = 8;
        if (r2 == r4) goto L_0x0272;
    L_0x0271:
        goto L_0x0273;
    L_0x0272:
        r11 = 4;
    L_0x0273:
        r2 = r8.c;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x0279;
    L_0x0277:
        r2 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x0279:
        r4 = r1.s;	 Catch:{ all -> 0x0552 }
        if (r11 == r4) goto L_0x027e;
    L_0x027d:
        goto L_0x02a2;
    L_0x027e:
        r4 = r1.u;	 Catch:{ all -> 0x0552 }
        if (r4 == 0) goto L_0x0283;
    L_0x0282:
        goto L_0x0285;
    L_0x0283:
        if (r2 != 0) goto L_0x02a2;
    L_0x0285:
        r4 = r1.u;	 Catch:{ all -> 0x0552 }
        if (r4 != 0) goto L_0x028a;
    L_0x0289:
        goto L_0x028c;
    L_0x028a:
        if (r2 == 0) goto L_0x02a2;
    L_0x028c:
        r4 = r1.u;	 Catch:{ all -> 0x0552 }
        if (r4 == 0) goto L_0x02bb;
    L_0x0290:
        if (r2 == 0) goto L_0x02bb;
    L_0x0292:
        r4 = r1.u;	 Catch:{ all -> 0x0552 }
        r4 = r4.toString();	 Catch:{ all -> 0x0552 }
        r5 = r2.toString();	 Catch:{ all -> 0x0552 }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x0552 }
        if (r4 != 0) goto L_0x02bb;
    L_0x02a2:
        r1.s = r11;	 Catch:{ all -> 0x0552 }
        r4 = 0;
        r1.t = r4;	 Catch:{ all -> 0x0552 }
        r1.u = r2;	 Catch:{ all -> 0x0552 }
        r1.v = r4;	 Catch:{ all -> 0x0552 }
        r5 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0552 }
        r5.length();	 Catch:{ all -> 0x0552 }
        r5 = new acct;	 Catch:{ all -> 0x0552 }
        r5.<init>(r1, r11, r2);	 Catch:{ all -> 0x0552 }
        r1.a(r5);	 Catch:{ all -> 0x0552 }
        goto L_0x02bc;
    L_0x02bb:
        r4 = 0;
    L_0x02bc:
        if (r7 == 0) goto L_0x02fb;
    L_0x02be:
        r2 = r7.c;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x02c4;
    L_0x02c2:
        r2 = defpackage.axak.a;	 Catch:{ all -> 0x0552 }
    L_0x02c4:
        r5 = com.google.protos.youtube.api.innertube.StreamStatisticRendererOuterClass.streamStatisticRenderer;	 Catch:{ all -> 0x0552 }
        r5 = defpackage.anxl.checkIsLite(r5);	 Catch:{ all -> 0x0552 }
        r2.a(r5);	 Catch:{ all -> 0x0552 }
        r2 = r2.h;	 Catch:{ all -> 0x0552 }
        r5 = r5.d;	 Catch:{ all -> 0x0552 }
        r2 = r2.a(r5);	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x02d8;
    L_0x02d7:
        goto L_0x02fb;
    L_0x02d8:
        r2 = r7.c;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x02de;
    L_0x02dc:
        r2 = defpackage.axak.a;	 Catch:{ all -> 0x0552 }
    L_0x02de:
        r5 = com.google.protos.youtube.api.innertube.StreamStatisticRendererOuterClass.streamStatisticRenderer;	 Catch:{ all -> 0x0552 }
        r5 = defpackage.anxl.checkIsLite(r5);	 Catch:{ all -> 0x0552 }
        r2.a(r5);	 Catch:{ all -> 0x0552 }
        r2 = r2.h;	 Catch:{ all -> 0x0552 }
        r6 = r5.d;	 Catch:{ all -> 0x0552 }
        r2 = r2.b(r6);	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x02f4;
    L_0x02f1:
        r2 = r5.b;	 Catch:{ all -> 0x0552 }
        goto L_0x02f8;
    L_0x02f4:
        r2 = r5.a(r2);	 Catch:{ all -> 0x0552 }
    L_0x02f8:
        r2 = (defpackage.axvg) r2;	 Catch:{ all -> 0x0552 }
        goto L_0x02fc;
    L_0x02fb:
        r2 = r4;
    L_0x02fc:
        if (r2 != 0) goto L_0x02ff;
    L_0x02fe:
        goto L_0x0313;
    L_0x02ff:
        r5 = r2.a;	 Catch:{ all -> 0x0552 }
        r5 = r5 & r3;
        if (r5 == 0) goto L_0x0313;
    L_0x0304:
        r2 = r2.c;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x030a;
    L_0x0308:
        r2 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x030a:
        r2 = defpackage.ajqy.a(r2);	 Catch:{ all -> 0x0552 }
        r2 = r2.toString();	 Catch:{ all -> 0x0552 }
        goto L_0x034d;
    L_0x0313:
        r2 = r1.a(r0);	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x031b;
    L_0x0319:
        r2 = r4;
        goto L_0x0321;
    L_0x031b:
        r2 = r2.g;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x0321;
    L_0x031f:
        r2 = defpackage.asql.e;	 Catch:{ all -> 0x0552 }
    L_0x0321:
        if (r2 == 0) goto L_0x034c;
    L_0x0323:
        r5 = r2.a;	 Catch:{ all -> 0x0552 }
        r6 = r5 & 2;
        if (r6 == 0) goto L_0x0338;
    L_0x0329:
        r2 = r2.c;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x032f;
    L_0x032d:
        r2 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x032f:
        r2 = defpackage.ajqy.a(r2);	 Catch:{ all -> 0x0552 }
        r2 = r2.toString();	 Catch:{ all -> 0x0552 }
        goto L_0x034d;
    L_0x0338:
        r6 = 1;
        r5 = r5 & r6;
        if (r5 != 0) goto L_0x033d;
    L_0x033c:
        goto L_0x034c;
    L_0x033d:
        r2 = r2.b;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x0343;
    L_0x0341:
        r2 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x0343:
        r2 = defpackage.ajqy.a(r2);	 Catch:{ all -> 0x0552 }
        r2 = r2.toString();	 Catch:{ all -> 0x0552 }
        goto L_0x034d;
    L_0x034c:
        r2 = r4;
    L_0x034d:
        r5 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x0552 }
        if (r5 == 0) goto L_0x035b;
    L_0x0353:
        r2 = "StreamHealthMonitor";
        r5 = "Could not obtain viewer count of stream";
        android.util.Log.e(r2, r5);	 Catch:{ all -> 0x0552 }
        r2 = r4;
    L_0x035b:
        if (r7 == 0) goto L_0x039a;
    L_0x035d:
        r5 = r7.d;	 Catch:{ all -> 0x0552 }
        if (r5 != 0) goto L_0x0363;
    L_0x0361:
        r5 = defpackage.axak.a;	 Catch:{ all -> 0x0552 }
    L_0x0363:
        r6 = com.google.protos.youtube.api.innertube.StreamStatisticRendererOuterClass.streamStatisticRenderer;	 Catch:{ all -> 0x0552 }
        r6 = defpackage.anxl.checkIsLite(r6);	 Catch:{ all -> 0x0552 }
        r5.a(r6);	 Catch:{ all -> 0x0552 }
        r5 = r5.h;	 Catch:{ all -> 0x0552 }
        r6 = r6.d;	 Catch:{ all -> 0x0552 }
        r5 = r5.a(r6);	 Catch:{ all -> 0x0552 }
        if (r5 != 0) goto L_0x0377;
    L_0x0376:
        goto L_0x039a;
    L_0x0377:
        r5 = r7.d;	 Catch:{ all -> 0x0552 }
        if (r5 != 0) goto L_0x037d;
    L_0x037b:
        r5 = defpackage.axak.a;	 Catch:{ all -> 0x0552 }
    L_0x037d:
        r6 = com.google.protos.youtube.api.innertube.StreamStatisticRendererOuterClass.streamStatisticRenderer;	 Catch:{ all -> 0x0552 }
        r6 = defpackage.anxl.checkIsLite(r6);	 Catch:{ all -> 0x0552 }
        r5.a(r6);	 Catch:{ all -> 0x0552 }
        r5 = r5.h;	 Catch:{ all -> 0x0552 }
        r9 = r6.d;	 Catch:{ all -> 0x0552 }
        r5 = r5.b(r9);	 Catch:{ all -> 0x0552 }
        if (r5 != 0) goto L_0x0393;
    L_0x0390:
        r5 = r6.b;	 Catch:{ all -> 0x0552 }
        goto L_0x0397;
    L_0x0393:
        r5 = r6.a(r5);	 Catch:{ all -> 0x0552 }
    L_0x0397:
        r5 = (defpackage.axvg) r5;	 Catch:{ all -> 0x0552 }
        goto L_0x039b;
    L_0x039a:
        r5 = r4;
    L_0x039b:
        if (r5 == 0) goto L_0x03b5;
    L_0x039d:
        r6 = r5.a;	 Catch:{ all -> 0x0552 }
        r6 = r6 & r3;
        if (r6 == 0) goto L_0x03b5;
    L_0x03a2:
        r5 = r5.c;	 Catch:{ all -> 0x0552 }
        if (r5 != 0) goto L_0x03a8;
    L_0x03a6:
        r5 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x03a8:
        r5 = defpackage.ajqy.a(r5);	 Catch:{ all -> 0x0552 }
        r5 = r5.toString();	 Catch:{ all -> 0x0552 }
        r11 = java.lang.Integer.parseInt(r5);	 Catch:{ all -> 0x0552 }
        goto L_0x03e0;
    L_0x03b5:
        r5 = r1.a(r0);	 Catch:{ all -> 0x0552 }
        if (r5 != 0) goto L_0x03bd;
    L_0x03bb:
        r5 = r4;
        goto L_0x03c3;
    L_0x03bd:
        r5 = r5.h;	 Catch:{ all -> 0x0552 }
        if (r5 != 0) goto L_0x03c3;
    L_0x03c1:
        r5 = defpackage.asqn.d;	 Catch:{ all -> 0x0552 }
    L_0x03c3:
        if (r5 != 0) goto L_0x03c8;
    L_0x03c5:
        r5 = r4;
        r11 = -1;
        goto L_0x03e0;
    L_0x03c8:
        r6 = r5.a;	 Catch:{ all -> 0x0552 }
        r9 = 1;
        r6 = r6 & r9;
        if (r6 == 0) goto L_0x03c5;
    L_0x03ce:
        r6 = r5.b;	 Catch:{ all -> 0x0552 }
        if (r6 != 0) goto L_0x03d4;
    L_0x03d2:
        r6 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x03d4:
        r6 = defpackage.ajqy.a(r6);	 Catch:{ all -> 0x0552 }
        r6 = r6.toString();	 Catch:{ all -> 0x0552 }
        r9 = r5.c;	 Catch:{ all -> 0x0552 }
        r11 = (int) r9;	 Catch:{ all -> 0x0552 }
        r5 = r6;
    L_0x03e0:
        r6 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x0552 }
        if (r6 == 0) goto L_0x03ef;
    L_0x03e6:
        r5 = "StreamHealthMonitor";
        r6 = "Could not obtain vote count of stream";
        android.util.Log.e(r5, r6);	 Catch:{ all -> 0x0552 }
        r5 = r4;
        r11 = -1;
    L_0x03ef:
        r6 = r1.w;	 Catch:{ all -> 0x0552 }
        r6 = android.text.TextUtils.equals(r6, r2);	 Catch:{ all -> 0x0552 }
        if (r6 == 0) goto L_0x03ff;
    L_0x03f7:
        r6 = r1.x;	 Catch:{ all -> 0x0552 }
        r6 = android.text.TextUtils.equals(r6, r5);	 Catch:{ all -> 0x0552 }
        if (r6 != 0) goto L_0x040b;
    L_0x03ff:
        r1.w = r2;	 Catch:{ all -> 0x0552 }
        r1.x = r5;	 Catch:{ all -> 0x0552 }
        r6 = new accs;	 Catch:{ all -> 0x0552 }
        r6.<init>(r1, r2, r5, r11);	 Catch:{ all -> 0x0552 }
        r1.a(r6);	 Catch:{ all -> 0x0552 }
    L_0x040b:
        if (r7 != 0) goto L_0x040f;
    L_0x040d:
        r2 = r4;
        goto L_0x044b;
    L_0x040f:
        r2 = r7.e;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x0415;
    L_0x0413:
        r2 = defpackage.axak.a;	 Catch:{ all -> 0x0552 }
    L_0x0415:
        r5 = com.google.protos.youtube.api.innertube.StreamStatisticRendererOuterClass.streamStatisticRenderer;	 Catch:{ all -> 0x0552 }
        r5 = defpackage.anxl.checkIsLite(r5);	 Catch:{ all -> 0x0552 }
        r2.a(r5);	 Catch:{ all -> 0x0552 }
        r2 = r2.h;	 Catch:{ all -> 0x0552 }
        r5 = r5.d;	 Catch:{ all -> 0x0552 }
        r2 = r2.a(r5);	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x0429;
    L_0x0428:
        goto L_0x040d;
    L_0x0429:
        r2 = r7.e;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x042f;
    L_0x042d:
        r2 = defpackage.axak.a;	 Catch:{ all -> 0x0552 }
    L_0x042f:
        r5 = com.google.protos.youtube.api.innertube.StreamStatisticRendererOuterClass.streamStatisticRenderer;	 Catch:{ all -> 0x0552 }
        r5 = defpackage.anxl.checkIsLite(r5);	 Catch:{ all -> 0x0552 }
        r2.a(r5);	 Catch:{ all -> 0x0552 }
        r2 = r2.h;	 Catch:{ all -> 0x0552 }
        r6 = r5.d;	 Catch:{ all -> 0x0552 }
        r2 = r2.b(r6);	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x0445;
    L_0x0442:
        r2 = r5.b;	 Catch:{ all -> 0x0552 }
        goto L_0x0449;
    L_0x0445:
        r2 = r5.a(r2);	 Catch:{ all -> 0x0552 }
    L_0x0449:
        r2 = (defpackage.axvg) r2;	 Catch:{ all -> 0x0552 }
    L_0x044b:
        if (r2 == 0) goto L_0x046a;
    L_0x044d:
        r5 = r2.a;	 Catch:{ all -> 0x0552 }
        r3 = r3 & r5;
        if (r3 == 0) goto L_0x046a;
    L_0x0452:
        r2 = r2.c;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x0458;
    L_0x0456:
        r2 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x0458:
        r2 = defpackage.ajqy.a(r2);	 Catch:{ all -> 0x0552 }
        r2 = r2.toString();	 Catch:{ all -> 0x0552 }
        r1.y = r2;	 Catch:{ all -> 0x0552 }
        r3 = new accv;	 Catch:{ all -> 0x0552 }
        r3.<init>(r1, r2);	 Catch:{ all -> 0x0552 }
        r1.a(r3);	 Catch:{ all -> 0x0552 }
    L_0x046a:
        r0 = r1.a(r0);	 Catch:{ all -> 0x0552 }
        if (r0 != 0) goto L_0x0472;
    L_0x0470:
        r3 = r4;
        goto L_0x049d;
    L_0x0472:
        r2 = r0.i;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x0478;
    L_0x0476:
        r2 = defpackage.aspx.c;	 Catch:{ all -> 0x0552 }
    L_0x0478:
        r2 = r2.b;	 Catch:{ all -> 0x0552 }
        if (r2 != 0) goto L_0x047e;
    L_0x047c:
        r2 = defpackage.aspv.c;	 Catch:{ all -> 0x0552 }
    L_0x047e:
        r2 = r2.a;	 Catch:{ all -> 0x0552 }
        r3 = 58057493; // 0x375e315 float:7.2259706E-37 double:2.8684213E-316;
        if (r2 != r3) goto L_0x0470;
    L_0x0485:
        r0 = r0.i;	 Catch:{ all -> 0x0552 }
        if (r0 != 0) goto L_0x048b;
    L_0x0489:
        r0 = defpackage.aspx.c;	 Catch:{ all -> 0x0552 }
    L_0x048b:
        r0 = r0.b;	 Catch:{ all -> 0x0552 }
        if (r0 != 0) goto L_0x0491;
    L_0x048f:
        r0 = defpackage.aspv.c;	 Catch:{ all -> 0x0552 }
    L_0x0491:
        r2 = r0.a;	 Catch:{ all -> 0x0552 }
        if (r2 != r3) goto L_0x049b;
    L_0x0495:
        r0 = r0.b;	 Catch:{ all -> 0x0552 }
        r3 = r0;
        r3 = (defpackage.aopj) r3;	 Catch:{ all -> 0x0552 }
        goto L_0x049d;
    L_0x049b:
        r3 = defpackage.aopj.e;	 Catch:{ all -> 0x0552 }
    L_0x049d:
        if (r3 != 0) goto L_0x04a0;
    L_0x049f:
        goto L_0x04e9;
    L_0x04a0:
        r0 = r3.b;	 Catch:{ all -> 0x0552 }
        r0 = defpackage.aopl.a(r0);	 Catch:{ all -> 0x0552 }
        if (r0 == 0) goto L_0x04a9;
    L_0x04a8:
        goto L_0x04aa;
    L_0x04a9:
        r0 = 1;
    L_0x04aa:
        r2 = r3.a;	 Catch:{ all -> 0x0552 }
        r5 = 2;
        r2 = r2 & r5;
        if (r2 == 0) goto L_0x04b7;
    L_0x04b0:
        r3 = r3.c;	 Catch:{ all -> 0x0552 }
        if (r3 != 0) goto L_0x04b8;
    L_0x04b4:
        r3 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
        goto L_0x04b8;
    L_0x04b7:
        r3 = r4;
    L_0x04b8:
        r2 = defpackage.ajqy.a(r3);	 Catch:{ all -> 0x0552 }
        r3 = -1;
        r0 = r0 + r3;
        r3 = 1;
        if (r0 == r3) goto L_0x04ca;
    L_0x04c1:
        r3 = 2;
        if (r0 == r3) goto L_0x04c7;
    L_0x04c4:
        r0 = 23;
        goto L_0x04cc;
    L_0x04c7:
        r0 = 25;
        goto L_0x04cc;
    L_0x04ca:
        r0 = 24;
    L_0x04cc:
        r3 = r1.z;	 Catch:{ all -> 0x0552 }
        if (r3 == r0) goto L_0x04e9;
    L_0x04d0:
        r1.z = r0;	 Catch:{ all -> 0x0552 }
        if (r2 == 0) goto L_0x04d9;
    L_0x04d4:
        r3 = r2.toString();	 Catch:{ all -> 0x0552 }
        goto L_0x04da;
    L_0x04d9:
        r3 = r4;
    L_0x04da:
        r2 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0552 }
        r2.length();	 Catch:{ all -> 0x0552 }
        r2 = new accu;	 Catch:{ all -> 0x0552 }
        r2.<init>(r1, r0, r3);	 Catch:{ all -> 0x0552 }
        r1.a(r2);	 Catch:{ all -> 0x0552 }
    L_0x04e9:
        if (r8 != 0) goto L_0x04ec;
    L_0x04eb:
        goto L_0x0546;
    L_0x04ec:
        r0 = r8.b;	 Catch:{ all -> 0x0552 }
        r4 = defpackage.aopl.a(r0);	 Catch:{ all -> 0x0552 }
        if (r4 == 0) goto L_0x04f5;
    L_0x04f4:
        goto L_0x04f6;
    L_0x04f5:
        r4 = 1;
    L_0x04f6:
        r0 = r8.c;	 Catch:{ all -> 0x0552 }
        if (r0 != 0) goto L_0x04fc;
    L_0x04fa:
        r0 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x04fc:
        r2 = -1;
        r4 = r4 + r2;
        r9 = 1;
        if (r4 == r9) goto L_0x050a;
    L_0x0501:
        r2 = 2;
        if (r4 == r2) goto L_0x0507;
    L_0x0504:
        r2 = 34;
        goto L_0x050c;
    L_0x0507:
        r2 = 36;
        goto L_0x050c;
    L_0x050a:
        r2 = 35;
    L_0x050c:
        r3 = r1.A;	 Catch:{ all -> 0x0552 }
        if (r3 != 0) goto L_0x0511;
    L_0x0510:
        goto L_0x053c;
    L_0x0511:
        r3 = r3.c;	 Catch:{ all -> 0x0552 }
        if (r3 != 0) goto L_0x0517;
    L_0x0515:
        r3 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x0517:
        r4 = r8.c;	 Catch:{ all -> 0x0552 }
        if (r4 != 0) goto L_0x051d;
    L_0x051b:
        r4 = defpackage.arml.f;	 Catch:{ all -> 0x0552 }
    L_0x051d:
        r3 = r3.equals(r4);	 Catch:{ all -> 0x0552 }
        if (r3 == 0) goto L_0x053c;
    L_0x0523:
        r3 = r1.A;	 Catch:{ all -> 0x0552 }
        r3 = r3.b;	 Catch:{ all -> 0x0552 }
        r4 = defpackage.aopl.a(r3);	 Catch:{ all -> 0x0552 }
        if (r4 == 0) goto L_0x052e;
    L_0x052d:
        goto L_0x052f;
    L_0x052e:
        r4 = 1;
    L_0x052f:
        r3 = r8.b;	 Catch:{ all -> 0x0552 }
        r3 = defpackage.aopl.a(r3);	 Catch:{ all -> 0x0552 }
        if (r3 == 0) goto L_0x0538;
    L_0x0537:
        goto L_0x0539;
    L_0x0538:
        r3 = 1;
    L_0x0539:
        if (r4 != r3) goto L_0x053c;
    L_0x053b:
        goto L_0x0546;
    L_0x053c:
        r1.A = r8;	 Catch:{ all -> 0x0552 }
        r3 = new accx;	 Catch:{ all -> 0x0552 }
        r3.<init>(r1, r2, r0);	 Catch:{ all -> 0x0552 }
        r1.a(r3);	 Catch:{ all -> 0x0552 }
    L_0x0546:
        r0 = r1.a;	 Catch:{ all -> 0x0552 }
        r2 = r1.d;	 Catch:{ all -> 0x0552 }
        r3 = r1.k;	 Catch:{ all -> 0x0552 }
        r3 = (long) r3;	 Catch:{ all -> 0x0552 }
        r0.postDelayed(r2, r3);	 Catch:{ all -> 0x0552 }
        monitor-exit(r20);	 Catch:{ all -> 0x0552 }
        return;
    L_0x0552:
        r0 = move-exception;
        monitor-exit(r20);	 Catch:{ all -> 0x0552 }
        throw r0;
    L_0x0555:
        monitor-exit(r20);	 Catch:{ all -> 0x0557 }
        return;
    L_0x0557:
        r0 = move-exception;
        monitor-exit(r20);	 Catch:{ all -> 0x0557 }
        throw r0;
    L_0x055a:
        r0 = move-exception;
        monitor-exit(r20);	 Catch:{ all -> 0x055a }
        goto L_0x055e;
    L_0x055d:
        throw r0;
    L_0x055e:
        goto L_0x055d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acck.b():void");
    }

    public final void a(Runnable runnable) {
        this.c.postAtTime(runnable, this, 0);
    }

    private final void a(int i, String str, String str2) {
        Object obj = 1;
        if (i == this.s && TextUtils.equals(this.t, str)) {
            obj = null;
        }
        this.s = i;
        this.t = str;
        this.u = null;
        this.v = str2;
        if (obj != null) {
            str2 = String.valueOf(str);
            String str3 = "Stream health changed: ";
            if (str2.length() == 0) {
                str2 = new String(str3);
            } else {
                str3.concat(str2);
            }
            a(new accq(this, i, str));
        }
    }

    private final aspr a(asqb asqb) {
        if (asqb != null) {
            int isEmpty = TextUtils.isEmpty(this.q) ^ 1;
            for (aspr aspr : asqb.c) {
                if (isEmpty != 0) {
                    if (aspr.b.equals(this.q)) {
                        return aspr;
                    }
                } else if (aspr.c) {
                    return aspr;
                }
            }
        }
        return null;
    }

    static {
        n.put(1, 0);
        n.put(2, 0);
        n.put(10, 0);
        n.put(0, -1);
        n.put(100, 0);
        n.put(200, 1);
        n.put(300, 2);
        n.put(400, 3);
        n.put(500, 4);
        o.put(-1, R.string.lc_default_stream_status_unknown_text);
        o.put(0, R.string.lc_default_stream_status_good_text);
        o.put(1, R.string.lc_default_stream_status_okay_text);
        o.put(2, R.string.lc_default_stream_status_bad_text);
        o.put(3, R.string.lc_default_stream_status_nodata_text);
        o.put(4, R.string.lc_default_stream_status_revoked_text);
    }
}
