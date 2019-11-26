package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nlv */
final class nlv implements Callback {
    public final Handler a;
    public final HandlerThread b;
    public final AtomicInteger c;
    public int d = 0;
    public long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    private final Handler i;
    private final nnf j;
    private final List k;
    private final nmx[][] l;
    private final int[] m;
    private final long n;
    private final long o;
    private nnj[] p;
    private nnj q;
    private nma r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w = 0;
    private long x;

    public nlv(Handler handler, boolean z, int[] iArr, int i, int i2) {
        this.i = handler;
        this.t = z;
        this.n = ((long) i) * 1000;
        this.o = ((long) i2) * 1000;
        int length = iArr.length;
        this.m = Arrays.copyOf(iArr, length);
        this.v = 1;
        this.f = -1;
        this.h = -1;
        this.j = new nnf();
        this.c = new AtomicInteger();
        this.k = new ArrayList(length);
        this.l = new nmx[length][];
        this.b = new nxb("ExoPlayerImplInternal:Handler");
        this.b.start();
        this.a = new Handler(this.b.getLooper(), this);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:14|15|16|25) */
    /* JADX WARNING: Missing block: B:15:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
    public final synchronized void a(defpackage.nls r5, int r6, java.lang.Object r7) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.s;	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0024;
    L_0x0005:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004c }
        r7 = 57;
        r5.<init>(r7);	 Catch:{ all -> 0x004c }
        r7 = "Sent message(";
        r5.append(r7);	 Catch:{ all -> 0x004c }
        r5.append(r6);	 Catch:{ all -> 0x004c }
        r6 = ") after release. Message ignored.";
        r5.append(r6);	 Catch:{ all -> 0x004c }
        r6 = "ExoPlayerImplInternal";
        r5 = r5.toString();	 Catch:{ all -> 0x004c }
        android.util.Log.w(r6, r5);	 Catch:{ all -> 0x004c }
        monitor-exit(r4);
        return;
    L_0x0024:
        r0 = r4.d;	 Catch:{ all -> 0x004c }
        r1 = r0 + 1;
        r4.d = r1;	 Catch:{ all -> 0x004c }
        r1 = r4.a;	 Catch:{ all -> 0x004c }
        r2 = 9;
        r3 = 0;
        r5 = android.util.Pair.create(r5, r7);	 Catch:{ all -> 0x004c }
        r5 = r1.obtainMessage(r2, r6, r3, r5);	 Catch:{ all -> 0x004c }
        r5.sendToTarget();	 Catch:{ all -> 0x004c }
    L_0x003a:
        r5 = r4.w;	 Catch:{ all -> 0x004c }
        if (r5 > r0) goto L_0x004a;
    L_0x003e:
        r4.wait();	 Catch:{ InterruptedException -> 0x0042 }
        goto L_0x003a;
    L_0x0042:
        r5 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x004c }
        r5.interrupt();	 Catch:{ all -> 0x004c }
        goto L_0x003a;
    L_0x004a:
        monitor-exit(r4);
        return;
    L_0x004c:
        r5 = move-exception;
        monitor-exit(r4);
        goto L_0x0050;
    L_0x004f:
        throw r5;
    L_0x0050:
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlv.a(nls, int, java.lang.Object):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0013 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|23) */
    /* JADX WARNING: Missing block: B:11:?, code skipped:
            java.lang.Thread.currentThread().interrupt();
     */
    public final synchronized void a() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.s;	 Catch:{ all -> 0x0024 }
        if (r0 != 0) goto L_0x0022;
    L_0x0005:
        r0 = r2.a;	 Catch:{ all -> 0x0024 }
        r1 = 5;
        r0.sendEmptyMessage(r1);	 Catch:{ all -> 0x0024 }
    L_0x000b:
        r0 = r2.s;	 Catch:{ all -> 0x0024 }
        if (r0 != 0) goto L_0x001b;
    L_0x000f:
        r2.wait();	 Catch:{ InterruptedException -> 0x0013 }
        goto L_0x000b;
    L_0x0013:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0024 }
        r0.interrupt();	 Catch:{ all -> 0x0024 }
        goto L_0x000b;
    L_0x001b:
        r0 = r2.b;	 Catch:{ all -> 0x0024 }
        r0.quit();	 Catch:{ all -> 0x0024 }
        monitor-exit(r2);
        return;
    L_0x0022:
        monitor-exit(r2);
        return;
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r2);
        goto L_0x0028;
    L_0x0027:
        throw r0;
    L_0x0028:
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlv.a():void");
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.base/java.util.BitSet.and(BitSet.java:917)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:434)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:925)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1507)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x002b=Splitter:B:13:0x002b, B:201:0x025d=Splitter:B:201:0x025d} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x002b=Splitter:B:13:0x002b, B:201:0x025d=Splitter:B:201:0x025d} */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0138 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0112 A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0103 A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x010a A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0112 A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0138 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b6 A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ad A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b6 A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0082 A:{SKIP, Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x009d A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0075 A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0082 A:{SKIP, Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x009d A:{Catch:{ all -> 0x0269, all -> 0x0210, all -> 0x0039, nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }} */
    public final boolean handleMessage(android.os.Message r19) {
        /*
        r18 = this;
        r7 = r18;
        r0 = r19;
        r8 = 4;
        r10 = 1;
        r1 = r0.what;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r2 = 2;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r3 = 7;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r4 = 3;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        switch(r1) {
            case 1: goto L_0x027a;
            case 2: goto L_0x0275;
            case 3: goto L_0x0231;
            case 4: goto L_0x022c;
            case 5: goto L_0x0217;
            case 6: goto L_0x01ae;
            case 7: goto L_0x00bf;
            case 8: goto L_0x0048;
            case 9: goto L_0x0010;
            default: goto L_0x000e;
        };	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x000e:
        r1 = 0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        return r1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0010:
        r1 = r0.arg1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r0.obj;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = (android.util.Pair) r0;	 Catch:{ all -> 0x0039 }
        r4 = r0.first;	 Catch:{ all -> 0x0039 }
        r4 = (defpackage.nls) r4;	 Catch:{ all -> 0x0039 }
        r0 = r0.second;	 Catch:{ all -> 0x0039 }
        r4.a(r1, r0);	 Catch:{ all -> 0x0039 }
        r0 = r7.v;	 Catch:{ all -> 0x0039 }
        if (r0 != r10) goto L_0x0024;	 Catch:{ all -> 0x0039 }
    L_0x0023:
        goto L_0x002b;	 Catch:{ all -> 0x0039 }
    L_0x0024:
        if (r0 == r2) goto L_0x002b;	 Catch:{ all -> 0x0039 }
    L_0x0026:
        r0 = r7.a;	 Catch:{ all -> 0x0039 }
        r0.sendEmptyMessage(r3);	 Catch:{ all -> 0x0039 }
    L_0x002b:
        monitor-enter(r18);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r7.w;	 Catch:{ all -> 0x0036 }
        r0 = r0 + r10;	 Catch:{ all -> 0x0036 }
        r7.w = r0;	 Catch:{ all -> 0x0036 }
        r18.notifyAll();	 Catch:{ all -> 0x0036 }
        monitor-exit(r18);	 Catch:{ all -> 0x0036 }
        return r10;	 Catch:{ all -> 0x0036 }
    L_0x0036:
        r0 = move-exception;	 Catch:{ all -> 0x0036 }
        monitor-exit(r18);	 Catch:{ all -> 0x0036 }
        throw r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0039:
        r0 = move-exception;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        monitor-enter(r18);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = r7.w;	 Catch:{ all -> 0x0045 }
        r1 = r1 + r10;	 Catch:{ all -> 0x0045 }
        r7.w = r1;	 Catch:{ all -> 0x0045 }
        r18.notifyAll();	 Catch:{ all -> 0x0045 }
        monitor-exit(r18);	 Catch:{ all -> 0x0045 }
        throw r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0045:
        r0 = move-exception;
        monitor-exit(r18);	 Catch:{ all -> 0x0045 }
        throw r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0048:
        r1 = r0.arg1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r0.arg2;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r5 = r7.m;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r6 = r5[r1];	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r6 == r0) goto L_0x00be;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0052:
        r5[r1] = r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r5 = r7.v;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r5 == r10) goto L_0x00be;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0058:
        if (r5 == r2) goto L_0x00be;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x005a:
        r5 = r7.p;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r5 = r5[r1];	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r6 = r5.i;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r6 == 0) goto L_0x00be;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0062:
        r11 = -1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r6 == r11) goto L_0x00be;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0065:
        r11 = r5.b();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r11 == 0) goto L_0x00be;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x006b:
        if (r6 != r2) goto L_0x006f;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x006d:
        r2 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x0073;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x006f:
        if (r6 != r4) goto L_0x0072;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0071:
        goto L_0x006d;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0072:
        r2 = 0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0073:
        if (r0 < 0) goto L_0x007f;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0075:
        r4 = r7.l;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = r4[r1];	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = r1.length;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r0 < r1) goto L_0x007d;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x007c:
        goto L_0x007f;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x007d:
        r1 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x0080;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x007f:
        r1 = 0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0080:
        if (r2 == 0) goto L_0x009b;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0082:
        if (r1 != 0) goto L_0x0093;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0084:
        r4 = r7.q;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r5 != r4) goto L_0x0093;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0088:
        r4 = r7.j;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r6 = r7.r;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r11 = r6.k();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r4.a(r11);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0093:
        r7.c(r5);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r4 = r7.k;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r4.remove(r5);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x009b:
        if (r1 == 0) goto L_0x00be;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x009d:
        r1 = r7.t;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r1 == 0) goto L_0x00a8;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00a1:
        r1 = r7.v;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r1 == r8) goto L_0x00a6;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00a5:
        goto L_0x00a8;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00a6:
        r1 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x00a9;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00a8:
        r1 = 0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00a9:
        if (r2 == 0) goto L_0x00ad;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00ab:
        r2 = 0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x00b1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00ad:
        if (r1 != 0) goto L_0x00b0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00af:
        goto L_0x00ab;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00b0:
        r2 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00b1:
        r7.a(r5, r0, r2);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r1 == 0) goto L_0x00b9;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00b6:
        r5.t();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00b9:
        r0 = r7.a;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0.sendEmptyMessage(r3);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00be:
        return r10;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00bf:
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r7.f;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r11 = -1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1));	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r2 == 0) goto L_0x00ce;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00cb:
        r0 = r7.f;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x00d3;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00ce:
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00d3:
        r18.e();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = 0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r13 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r14 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00da:
        r15 = r7.k;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r15 = r15.size();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r0 >= r15) goto L_0x013e;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00e2:
        r15 = r7.k;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r15 = r15.get(r0);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r15 = (defpackage.nnj) r15;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r9 = r7.g;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r3 = r7.x;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r15.a(r9, r3);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r13 == 0) goto L_0x00fc;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00f3:
        r3 = r15.c();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r3 != 0) goto L_0x00fa;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00f9:
        goto L_0x00fc;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00fa:
        r13 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x00fd;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00fc:
        r13 = 0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x00fd:
        r3 = r7.a(r15);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r3 != 0) goto L_0x0106;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0103:
        r15.e();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0106:
        if (r14 != 0) goto L_0x010a;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0108:
        r14 = 0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x010e;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x010a:
        if (r3 != 0) goto L_0x010d;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x010c:
        goto L_0x0108;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x010d:
        r14 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x010e:
        r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1));	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r3 == 0) goto L_0x0138;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0112:
        r3 = r15.f();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r9 = r15.g();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r15 == 0) goto L_0x0137;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x011e:
        r16 = -3;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r15 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1));	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r15 == 0) goto L_0x0138;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0124:
        r15 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r15 == 0) goto L_0x0132;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0128:
        r16 = -2;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r15 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1));	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r15 == 0) goto L_0x0132;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x012e:
        r15 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r15 >= 0) goto L_0x0138;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0132:
        r1 = java.lang.Math.min(r1, r9);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x0138;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0137:
        r1 = r11;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0138:
        r0 = r0 + 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r3 = 7;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r4 = 3;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r10 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x00da;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x013e:
        r7.h = r1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r13 == 0) goto L_0x0158;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0142:
        r0 = r7.f;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1));	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r2 == 0) goto L_0x0150;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0148:
        r0 = r7.f;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r2 = r7.g;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r4 > 0) goto L_0x0158;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0150:
        r0 = 5;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r7.a(r0);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r18.d();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x0179;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0158:
        r0 = r7.v;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 3;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r0 != r1) goto L_0x016a;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x015d:
        if (r14 == 0) goto L_0x016a;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x015f:
        r7.a(r8);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r7.t;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r0 == 0) goto L_0x0179;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0166:
        r18.c();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x0179;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x016a:
        if (r0 != r8) goto L_0x0179;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x016c:
        if (r14 != 0) goto L_0x0179;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x016e:
        r0 = r7.t;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r7.u = r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 3;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r7.a(r1);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r18.d();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0179:
        r0 = r7.a;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 7;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0.removeMessages(r1);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r7.t;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r0 == 0) goto L_0x0187;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0183:
        r0 = r7.v;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r0 == r8) goto L_0x018c;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0187:
        r0 = r7.v;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 3;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r0 != r1) goto L_0x0197;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x018c:
        r2 = 7;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r9 = 10;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = r18;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r3 = r5;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r5 = r9;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1.a(r2, r3, r5);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x01a9;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0197:
        r0 = r7.k;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r0.isEmpty();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r0 != 0) goto L_0x01a9;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x019f:
        r2 = 7;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = r18;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r3 = r5;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r5 = r9;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1.a(r2, r3, r5);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x01a9:
        defpackage.nxd.a();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        return r1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x01ae:
        r1 = r0.arg1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r0.arg2;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = defpackage.nxf.b(r1, r0);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r3 = r7.g;	 Catch:{ all -> 0x0210 }
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x0210 }
        r3 = r3 / r5;	 Catch:{ all -> 0x0210 }
        r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));	 Catch:{ all -> 0x0210 }
        if (r9 == 0) goto L_0x0209;	 Catch:{ all -> 0x0210 }
    L_0x01bf:
        r3 = 0;	 Catch:{ all -> 0x0210 }
        r7.u = r3;	 Catch:{ all -> 0x0210 }
        r0 = r0 * r5;	 Catch:{ all -> 0x0210 }
        r7.g = r0;	 Catch:{ all -> 0x0210 }
        r0 = r7.j;	 Catch:{ all -> 0x0210 }
        r0.a();	 Catch:{ all -> 0x0210 }
        r0 = r7.j;	 Catch:{ all -> 0x0210 }
        r3 = r7.g;	 Catch:{ all -> 0x0210 }
        r0.a(r3);	 Catch:{ all -> 0x0210 }
        r0 = r7.v;	 Catch:{ all -> 0x0210 }
        r1 = 1;	 Catch:{ all -> 0x0210 }
        if (r0 != r1) goto L_0x01d8;	 Catch:{ all -> 0x0210 }
    L_0x01d7:
        goto L_0x0203;	 Catch:{ all -> 0x0210 }
    L_0x01d8:
        if (r0 == r2) goto L_0x0203;	 Catch:{ all -> 0x0210 }
    L_0x01da:
        r0 = 0;	 Catch:{ all -> 0x0210 }
    L_0x01db:
        r1 = r7.k;	 Catch:{ all -> 0x0210 }
        r1 = r1.size();	 Catch:{ all -> 0x0210 }
        if (r0 >= r1) goto L_0x01f6;	 Catch:{ all -> 0x0210 }
    L_0x01e3:
        r1 = r7.k;	 Catch:{ all -> 0x0210 }
        r1 = r1.get(r0);	 Catch:{ all -> 0x0210 }
        r1 = (defpackage.nnj) r1;	 Catch:{ all -> 0x0210 }
        defpackage.nlv.b(r1);	 Catch:{ all -> 0x0210 }
        r2 = r7.g;	 Catch:{ all -> 0x0210 }
        r1.a(r2);	 Catch:{ all -> 0x0210 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0210 }
        goto L_0x01db;	 Catch:{ all -> 0x0210 }
    L_0x01f6:
        r1 = 3;	 Catch:{ all -> 0x0210 }
        r7.a(r1);	 Catch:{ all -> 0x0210 }
        r0 = r7.a;	 Catch:{ all -> 0x0210 }
        r1 = 7;	 Catch:{ all -> 0x0210 }
        r0.sendEmptyMessage(r1);	 Catch:{ all -> 0x0210 }
        r0 = r7.c;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x020b;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0203:
        r0 = r7.c;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0.decrementAndGet();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x020e;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0209:
        r0 = r7.c;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x020b:
        r0.decrementAndGet();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x020e:
        r1 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        return r1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0210:
        r0 = move-exception;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = r7.c;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1.decrementAndGet();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        throw r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0217:
        r18.g();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 1;
        r7.a(r1);	 Catch:{ nlq -> 0x0229, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        monitor-enter(r18);	 Catch:{ nlq -> 0x0229, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r7.s = r1;	 Catch:{ all -> 0x0226 }
        r18.notifyAll();	 Catch:{ all -> 0x0226 }
        monitor-exit(r18);	 Catch:{ all -> 0x0226 }
        return r1;	 Catch:{ all -> 0x0226 }
    L_0x0226:
        r0 = move-exception;	 Catch:{ all -> 0x0226 }
        monitor-exit(r18);	 Catch:{ all -> 0x0226 }
        throw r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0229:
        r0 = move-exception;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        goto L_0x02b1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x022c:
        r18.f();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        return r1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0231:
        r0 = r0.arg1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        if (r0 == 0) goto L_0x0237;
    L_0x0235:
        r0 = 1;
        goto L_0x0238;
    L_0x0237:
        r0 = 0;
    L_0x0238:
        r1 = 0;
        r7.u = r1;	 Catch:{ all -> 0x0269 }
        r7.t = r0;	 Catch:{ all -> 0x0269 }
        if (r0 != 0) goto L_0x0246;	 Catch:{ all -> 0x0269 }
    L_0x023f:
        r18.d();	 Catch:{ all -> 0x0269 }
        r18.e();	 Catch:{ all -> 0x0269 }
        goto L_0x025d;	 Catch:{ all -> 0x0269 }
    L_0x0246:
        r0 = r7.v;	 Catch:{ all -> 0x0269 }
        if (r0 != r8) goto L_0x0254;	 Catch:{ all -> 0x0269 }
    L_0x024a:
        r18.c();	 Catch:{ all -> 0x0269 }
        r0 = r7.a;	 Catch:{ all -> 0x0269 }
        r1 = 7;	 Catch:{ all -> 0x0269 }
        r0.sendEmptyMessage(r1);	 Catch:{ all -> 0x0269 }
        goto L_0x025d;	 Catch:{ all -> 0x0269 }
    L_0x0254:
        r1 = 3;	 Catch:{ all -> 0x0269 }
        if (r0 != r1) goto L_0x025d;	 Catch:{ all -> 0x0269 }
    L_0x0257:
        r0 = r7.a;	 Catch:{ all -> 0x0269 }
        r1 = 7;	 Catch:{ all -> 0x0269 }
        r0.sendEmptyMessage(r1);	 Catch:{ all -> 0x0269 }
    L_0x025d:
        r0 = r7.i;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 3;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r0.obtainMessage(r1);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0.sendToTarget();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        return r1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0269:
        r0 = move-exception;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = r7.i;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r2 = 3;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = r1.obtainMessage(r2);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1.sendToTarget();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        throw r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x0275:
        r18.b();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        return r1;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
    L_0x027a:
        r0 = r0.obj;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = (defpackage.nnj[]) r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r18.g();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r7.p = r0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r0 = r7.l;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 0;	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        java.util.Arrays.fill(r0, r1);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r7.a(r2);	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r18.b();	 Catch:{ nlq -> 0x02af, RuntimeException -> 0x0293, OutOfMemoryError | RuntimeException -> 0x0291 }
        r1 = 1;
        return r1;
    L_0x0291:
        r0 = move-exception;
        goto L_0x0294;
    L_0x0293:
        r0 = move-exception;
    L_0x0294:
        r1 = 0;
        r2 = "ExoPlayerImplInternal";
        r3 = "Internal runtime error.";
        android.util.Log.e(r2, r3, r0);
        r2 = r7.i;
        r3 = new nlq;
        r3.<init>(r0, r1);
        r0 = r2.obtainMessage(r8, r3);
        r0.sendToTarget();
        r18.f();
        r1 = 1;
        return r1;
    L_0x02af:
        r0 = move-exception;
        r1 = 1;
    L_0x02b1:
        r2 = "ExoPlayerImplInternal";
        r3 = "Internal track renderer error.";
        android.util.Log.e(r2, r3, r0);
        r2 = r7.i;
        r0 = r2.obtainMessage(r8, r0);
        r0.sendToTarget();
        r18.f();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlv.handleMessage(android.os.Message):boolean");
    }

    private final void a(int i) {
        if (this.v != i) {
            this.v = i;
            this.i.obtainMessage(2, i, 0).sendToTarget();
        }
    }

    private final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        Object obj = 1;
        while (true) {
            nnj[] nnjArr = this.p;
            if (i >= nnjArr.length) {
                break;
            }
            nnj nnj = nnjArr[i];
            if (nnj.i == 0) {
                long j = this.g;
                nwf.b(nnj.i == 0);
                boolean a = nnj.a();
                nnj.i = a;
                if (!a) {
                    nnj.e();
                    obj = null;
                }
            }
            i++;
        }
        if (obj != null) {
            long j2 = 0;
            int i2 = 0;
            obj = 1;
            Object obj2 = 1;
            while (true) {
                nnj[] nnjArr2 = this.p;
                if (i2 >= nnjArr2.length) {
                    break;
                }
                nnj nnj2 = nnjArr2[i2];
                int b = nnj2.b();
                nmx[] nmxArr = new nmx[b];
                for (int i3 = 0; i3 < b; i3++) {
                    nmxArr[i3] = nnj2.a(i3);
                }
                this.l[i2] = nmxArr;
                if (b > 0) {
                    if (j2 != -1) {
                        long f = nnj2.f();
                        if (f == -1) {
                            j2 = -1;
                        } else if (f != -2) {
                            j2 = Math.max(j2, f);
                        }
                    }
                    b = this.m[i2];
                    if (b >= 0 && b < nmxArr.length) {
                        a(nnj2, b, false);
                        obj = (obj == null || !nnj2.c()) ? null : 1;
                        obj2 = (obj2 == null || !a(nnj2)) ? null : 1;
                    }
                }
                i2++;
            }
            this.f = j2;
            i2 = 5;
            if (obj == null || (j2 != -1 && j2 > this.g)) {
                i2 = obj2 == null ? 3 : 4;
                this.v = i2;
            } else {
                this.v = 5;
            }
            this.i.obtainMessage(1, i2, 0, this.l).sendToTarget();
            if (this.t && this.v == 4) {
                c();
            }
            this.a.sendEmptyMessage(7);
            return;
        }
        a(2, elapsedRealtime, 10);
    }

    private final void a(nnj nnj, int i, boolean z) {
        long j = this.g;
        boolean z2 = false;
        nwf.b(nnj.i == 1);
        nnj.i = 2;
        nnj.a(i, j, z);
        this.k.add(nnj);
        nma h = nnj.h();
        if (h != null) {
            if (this.r == null) {
                z2 = true;
            }
            nwf.b(z2);
            this.r = h;
            this.q = nnj;
        }
    }

    private final boolean a(nnj nnj) {
        boolean z = true;
        if (nnj.c()) {
            return true;
        }
        if (!nnj.d()) {
            return false;
        }
        if (this.v != 4) {
            long j;
            long f = nnj.f();
            long g = nnj.g();
            if (this.u) {
                j = this.o;
            } else {
                j = this.n;
            }
            if (j > 0 && g != -1 && g != -3 && g < this.g + j) {
                if (f == -1 || f == -2) {
                    z = false;
                } else if (g >= f) {
                    return z;
                } else {
                    return false;
                }
            }
        }
        return z;
    }

    private final void c() {
        int i = 0;
        this.u = false;
        nnf nnf = this.j;
        if (!nnf.a) {
            nnf.a = true;
            nnf.c = nnf.b(nnf.b);
        }
        while (i < this.k.size()) {
            ((nnj) this.k.get(i)).t();
            i++;
        }
    }

    private final void d() {
        this.j.a();
        for (int i = 0; i < this.k.size(); i++) {
            nlv.b((nnj) this.k.get(i));
        }
    }

    private final void e() {
        if (this.r == null || !this.k.contains(this.q) || this.q.c()) {
            this.g = this.j.k();
        } else {
            this.g = this.r.k();
            this.j.a(this.g);
        }
        this.x = SystemClock.elapsedRealtime() * 1000;
    }

    private final void a(int i, long j, long j2) {
        j = (j + j2) - SystemClock.elapsedRealtime();
        if (j <= 0) {
            this.a.sendEmptyMessage(i);
        } else {
            this.a.sendEmptyMessageDelayed(i, j);
        }
    }

    private final void f() {
        g();
        a(1);
    }

    private final void g() {
        String str = "Release failed.";
        String str2 = "Stop failed.";
        String str3 = "ExoPlayerImplInternal";
        this.a.removeMessages(7);
        this.a.removeMessages(2);
        this.u = false;
        this.j.a();
        if (this.p != null) {
            int i = 0;
            while (true) {
                nnj[] nnjArr = this.p;
                if (i < nnjArr.length) {
                    nnj nnj = nnjArr[i];
                    try {
                        c(nnj);
                    } catch (nlq e) {
                        Log.e(str3, str2, e);
                    } catch (RuntimeException e2) {
                        Log.e(str3, str2, e2);
                    }
                    try {
                        boolean z;
                        int i2 = nnj.i;
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != -1) {
                                    z = true;
                                    nwf.b(z);
                                    nnj.i = -1;
                                    nnj.s();
                                    i++;
                                }
                            }
                        }
                        z = false;
                        nwf.b(z);
                        nnj.i = -1;
                        nnj.s();
                    } catch (nlq e3) {
                        Log.e(str3, str, e3);
                    } catch (RuntimeException e4) {
                        Log.e(str3, str, e4);
                    }
                    i++;
                } else {
                    this.p = null;
                    this.r = null;
                    this.q = null;
                    this.k.clear();
                    return;
                }
            }
        }
    }

    private static void b(nnj nnj) {
        if (nnj.i == 3) {
            nwf.b(true);
            nnj.i = 2;
            nnj.j();
        }
    }

    private final void c(nnj nnj) {
        nlv.b(nnj);
        if (nnj.i == 2) {
            nwf.b(true);
            nnj.i = 1;
            nnj.l();
            if (nnj == this.q) {
                this.r = null;
                this.q = null;
            }
        }
    }
}
