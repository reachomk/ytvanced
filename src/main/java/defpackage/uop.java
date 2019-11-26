package defpackage;

import android.content.Context;
import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: uop */
public final class uop extends Thread {
    public final CountDownLatch a = new CountDownLatch(1);
    public volatile Exception b;
    private final Context c;
    private final ukz d;
    private final int e;
    private final int f;
    private final ukq g;
    private final ukf h;
    private final uoh i;
    private final PriorityBlockingQueue j;
    private final ukm k;
    private final uld l;
    private volatile boolean m;
    private uof n;
    private uks o;
    private ukj p;
    private final BufferInfo q = new BufferInfo();
    private ByteBuffer[] r;
    private boolean s;

    public uop(Context context, ukz ukz, int i, int i2, PriorityBlockingQueue priorityBlockingQueue, ukq ukq, ukf ukf, uoh uoh, ukm ukm) {
        this.c = context;
        this.d = ukz;
        this.e = i;
        this.f = i2;
        this.j = priorityBlockingQueue;
        this.g = ukq;
        this.h = ukf;
        this.i = uoh;
        this.k = ukm;
        this.l = new uld(ukm);
        setName("Extractor Thread");
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x0242 A:{Catch:{ all -> 0x0264, all -> 0x029c, all -> 0x01d9, Exception -> 0x022a, all -> 0x0227 }} */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0241 A:{Catch:{ all -> 0x0264, all -> 0x029c, all -> 0x01d9, Exception -> 0x022a, all -> 0x0227 }} */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x0039, B:110:0x01dc, B:127:0x0201, B:170:0x0267] */
    /* JADX WARNING: Missing block: B:128:?, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:148:0x0227, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:149:0x0228, code skipped:
            r6 = 0;
     */
    /* JADX WARNING: Missing block: B:150:0x022a, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:151:0x022b, code skipped:
            r6 = 0;
     */
    /* JADX WARNING: Missing block: B:184:?, code skipped:
            r1.a.countDown();
     */
    /* JADX WARNING: Missing block: B:187:0x029d, code skipped:
            c();
            r1.k.d(r1.l);
     */
    public final void run() {
        /*
        r17 = this;
        r1 = r17;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r2 = 21;
        r3 = 0;
        if (r0 >= r2) goto L_0x0010;
    L_0x0009:
        r0 = r1.d;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0 = r0.f;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0 = 360 - r0;
        goto L_0x0011;
    L_0x0010:
        r0 = 0;
    L_0x0011:
        r2 = r1.i;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r4 = r1.e;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r5 = r1.f;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0 = r2.a(r4, r5, r0);	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r1.n = r0;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0 = r1.g;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0 = r0.a();	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r1.o = r0;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0 = r1.o;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r2 = r1.c;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r4 = r1.d;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r4 = r4.a;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0.a(r2, r4);	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0 = r1.o;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r2 = r1.d;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r2 = r2.c;	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0.b(r2);	 Catch:{ IOException -> 0x027e, uoe -> 0x0266 }
        r0 = r1.a;	 Catch:{ all -> 0x029c }
        r0.countDown();	 Catch:{ all -> 0x029c }
    L_0x003e:
        r0 = r1.m;	 Catch:{ all -> 0x029c }
        if (r0 != 0) goto L_0x0259;
    L_0x0042:
        r0 = r1.j;	 Catch:{ InterruptedException -> 0x003e }
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x003e }
        r4 = 1;
        r0 = r0.poll(r4, r2);	 Catch:{ InterruptedException -> 0x003e }
        r0 = (defpackage.uok) r0;	 Catch:{ InterruptedException -> 0x003e }
        if (r0 != 0) goto L_0x005f;
    L_0x0050:
        r0 = r1.k;	 Catch:{ InterruptedException -> 0x003e }
        r2 = r1.l;	 Catch:{ InterruptedException -> 0x003e }
        r0.d(r2);	 Catch:{ InterruptedException -> 0x003e }
        r0 = r1.j;	 Catch:{ InterruptedException -> 0x003e }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x003e }
        r0 = (defpackage.uok) r0;	 Catch:{ InterruptedException -> 0x003e }
    L_0x005f:
        r2 = r0;
        r0 = r2.b;	 Catch:{ all -> 0x029c }
        if (r0 != 0) goto L_0x003e;
    L_0x0064:
        r0 = r1.k;	 Catch:{ all -> 0x029c }
        r4 = r1.l;	 Catch:{ all -> 0x029c }
        r5 = r2.a;	 Catch:{ all -> 0x029c }
        r0.a(r4, r5);	 Catch:{ all -> 0x029c }
        r0 = r1.l;	 Catch:{ InterruptedException -> 0x024d }
        r4 = r0.a;	 Catch:{ InterruptedException -> 0x024d }
        monitor-enter(r4);	 Catch:{ InterruptedException -> 0x024d }
        r5 = r0.a;	 Catch:{ all -> 0x0224 }
        r5 = r5.b(r0);	 Catch:{ all -> 0x0224 }
        r6 = 1;
        if (r5 != 0) goto L_0x0089;
    L_0x007b:
        r5 = new java.util.concurrent.CountDownLatch;	 Catch:{ all -> 0x0224 }
        r5.<init>(r6);	 Catch:{ all -> 0x0224 }
        r0.b = r5;	 Catch:{ all -> 0x0224 }
        monitor-exit(r4);	 Catch:{ all -> 0x0224 }
        r0 = r0.b;	 Catch:{ InterruptedException -> 0x024d }
        r0.await();	 Catch:{ InterruptedException -> 0x024d }
        goto L_0x008a;
    L_0x0089:
        monitor-exit(r4);	 Catch:{ all -> 0x0224 }
    L_0x008a:
        r0 = r1.o;	 Catch:{ uoo -> 0x020c }
        r4 = r1.d;	 Catch:{ uoo -> 0x020c }
        r4 = r4.c;	 Catch:{ uoo -> 0x020c }
        r0 = r0.a(r4);	 Catch:{ uoo -> 0x020c }
        r4 = r1.h;	 Catch:{ uoo -> 0x020c }
        r5 = "mime";
        r5 = r0.getString(r5);	 Catch:{ uoo -> 0x020c }
        r4 = r4.a(r5, r3);	 Catch:{ uoo -> 0x020c }
        r1.p = r4;	 Catch:{ uoo -> 0x020c }
        r4 = r1.p;	 Catch:{ uoo -> 0x020c }
        if (r4 == 0) goto L_0x00a8;
    L_0x00a6:
        r4 = 1;
        goto L_0x00a9;
    L_0x00a8:
        r4 = 0;
    L_0x00a9:
        r5 = "No decoder found for ";
        r7 = "mime";
        r7 = r0.getString(r7);	 Catch:{ uoo -> 0x020c }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ uoo -> 0x020c }
        r8 = r7.length();	 Catch:{ uoo -> 0x020c }
        if (r8 != 0) goto L_0x00c1;
    L_0x00bb:
        r7 = new java.lang.String;	 Catch:{ uoo -> 0x020c }
        r7.<init>(r5);	 Catch:{ uoo -> 0x020c }
        goto L_0x00c5;
    L_0x00c1:
        r7 = r5.concat(r7);	 Catch:{ uoo -> 0x020c }
    L_0x00c5:
        defpackage.uhy.b(r4, r7);	 Catch:{ uoo -> 0x020c }
        r4 = r1.p;	 Catch:{ IllegalStateException -> 0x0205 }
        r5 = r1.n;	 Catch:{ IllegalStateException -> 0x0205 }
        r5 = r5.a();	 Catch:{ IllegalStateException -> 0x0205 }
        r4.a(r0, r5, r3);	 Catch:{ IllegalStateException -> 0x0205 }
        r0 = r1.p;	 Catch:{ IllegalStateException -> 0x0205 }
        r0.b();	 Catch:{ IllegalStateException -> 0x0205 }
        r1.s = r6;	 Catch:{ uoo -> 0x020c }
        r0 = r1.p;	 Catch:{ uoo -> 0x020c }
        r0 = r0.f();	 Catch:{ uoo -> 0x020c }
        r1.r = r0;	 Catch:{ uoo -> 0x020c }
        r4 = -1;
        r0 = r2.a();	 Catch:{ Exception -> 0x01db }
        if (r0 == r4) goto L_0x01ec;
    L_0x00e9:
        r5 = r1.d;	 Catch:{ Exception -> 0x01db }
        r0 = r5.c(r0);	 Catch:{ Exception -> 0x01db }
        r5 = r1.o;	 Catch:{ Exception -> 0x01db }
        r7 = r1.d;	 Catch:{ Exception -> 0x01db }
        r7 = r7.b(r0);	 Catch:{ Exception -> 0x01db }
        r5.a(r7);	 Catch:{ Exception -> 0x01db }
        r5 = r0;
        r0 = 0;
        r7 = 0;
    L_0x00fd:
        r8 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        if (r0 != 0) goto L_0x013a;
    L_0x0101:
        r10 = r1.p;	 Catch:{ Exception -> 0x01db }
        r12 = r10.a(r8);	 Catch:{ Exception -> 0x01db }
        if (r12 < 0) goto L_0x013a;
    L_0x0109:
        r10 = r1.a(r2);	 Catch:{ Exception -> 0x01db }
        if (r10 != 0) goto L_0x011a;
    L_0x010f:
        r10 = r1.o;	 Catch:{ Exception -> 0x01db }
        r11 = r1.r;	 Catch:{ Exception -> 0x01db }
        r11 = r11[r12];	 Catch:{ Exception -> 0x01db }
        r10 = r10.a(r11);	 Catch:{ Exception -> 0x01db }
        goto L_0x011b;
    L_0x011a:
        r10 = -1;
    L_0x011b:
        if (r10 >= 0) goto L_0x0126;
    L_0x011d:
        r10 = 0;
        r0 = 4;
        r14 = r10;
        r0 = 1;
        r13 = 0;
        r16 = 4;
        goto L_0x0135;
    L_0x0126:
        r11 = r1.o;	 Catch:{ Exception -> 0x01db }
        r13 = r11.d();	 Catch:{ Exception -> 0x01db }
        r11 = r1.o;	 Catch:{ Exception -> 0x01db }
        r11.c();	 Catch:{ Exception -> 0x01db }
        r14 = r13;
        r16 = 0;
        r13 = r10;
    L_0x0135:
        r11 = r1.p;	 Catch:{ Exception -> 0x01db }
        r11.a(r12, r13, r14, r16);	 Catch:{ Exception -> 0x01db }
    L_0x013a:
        r10 = r1.p;	 Catch:{ Exception -> 0x01db }
        r11 = r1.q;	 Catch:{ Exception -> 0x01db }
        r8 = r10.a(r11, r8);	 Catch:{ Exception -> 0x01db }
        if (r8 < 0) goto L_0x01ac;
    L_0x0144:
        r9 = r1.q;	 Catch:{ Exception -> 0x01db }
        r9 = r9.flags;	 Catch:{ Exception -> 0x01db }
        r9 = r1.q;	 Catch:{ Exception -> 0x01db }
        r9 = r9.presentationTimeUs;	 Catch:{ Exception -> 0x01db }
        r9 = r2.a(r5);	 Catch:{ Exception -> 0x01db }
        r10 = r1.p;	 Catch:{ Exception -> 0x01db }
        r10.a(r8, r9);	 Catch:{ Exception -> 0x01db }
        if (r9 == 0) goto L_0x0172;
    L_0x0157:
        r8 = r1.n;	 Catch:{ InterruptedException -> 0x0169 }
        r8 = r8.b();	 Catch:{ InterruptedException -> 0x0169 }
        if (r8 != 0) goto L_0x0165;
    L_0x015f:
        r8 = "Failed to render thumbnail";
        defpackage.ujo.a(r8);	 Catch:{ Exception -> 0x01db }
        goto L_0x0172;
    L_0x0165:
        r2.a(r5, r8);	 Catch:{ Exception -> 0x01db }
        goto L_0x0172;
    L_0x0169:
        r0 = java.lang.Thread.currentThread();	 Catch:{ Exception -> 0x01db }
        r0.interrupt();	 Catch:{ Exception -> 0x01db }
        goto L_0x01df;
    L_0x0172:
        r8 = r2.b();	 Catch:{ Exception -> 0x01db }
        if (r8 == r4) goto L_0x01df;
    L_0x0178:
        r9 = r1.m;	 Catch:{ Exception -> 0x01db }
        if (r9 != 0) goto L_0x01df;
    L_0x017c:
        r9 = r1.l;	 Catch:{ Exception -> 0x01db }
        r9 = r9.c;	 Catch:{ Exception -> 0x01db }
        if (r9 != 0) goto L_0x01df;
    L_0x0182:
        r5 = r5 + 1;
        if (r8 == r5) goto L_0x00fd;
    L_0x0186:
        r9 = r1.d;	 Catch:{ Exception -> 0x01db }
        r9 = r9.c(r8);	 Catch:{ Exception -> 0x01db }
        if (r8 >= r5) goto L_0x0190;
    L_0x018e:
        r8 = 1;
        goto L_0x0191;
    L_0x0190:
        r8 = 0;
    L_0x0191:
        if (r9 <= r5) goto L_0x0195;
    L_0x0193:
        r10 = 1;
        goto L_0x0196;
    L_0x0195:
        r10 = 0;
    L_0x0196:
        r8 = r8 | r10;
        if (r8 == 0) goto L_0x00fd;
    L_0x0199:
        r5 = r1.o;	 Catch:{ Exception -> 0x01db }
        r8 = r1.d;	 Catch:{ Exception -> 0x01db }
        r10 = r8.b(r9);	 Catch:{ Exception -> 0x01db }
        r5.a(r10);	 Catch:{ Exception -> 0x01db }
        r5 = r1.p;	 Catch:{ Exception -> 0x01db }
        r5.d();	 Catch:{ Exception -> 0x01db }
        r5 = r9;
        goto L_0x00fd;
    L_0x01ac:
        if (r8 == r4) goto L_0x01ca;
    L_0x01ae:
        r9 = -2;
        if (r8 == r9) goto L_0x00fd;
    L_0x01b1:
        r9 = -3;
        if (r8 != r9) goto L_0x01b6;
    L_0x01b4:
        goto L_0x00fd;
    L_0x01b6:
        r0 = new java.lang.Exception;	 Catch:{ Exception -> 0x01db }
        r5 = "Decoder failed with status %d";
        r7 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x01db }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ Exception -> 0x01db }
        r7[r3] = r8;	 Catch:{ Exception -> 0x01db }
        r5 = java.lang.String.format(r5, r7);	 Catch:{ Exception -> 0x01db }
        r0.<init>(r5);	 Catch:{ Exception -> 0x01db }
        throw r0;	 Catch:{ Exception -> 0x01db }
    L_0x01ca:
        r8 = r1.a(r2);	 Catch:{ Exception -> 0x01db }
        if (r8 != 0) goto L_0x01df;
    L_0x01d0:
        if (r0 == 0) goto L_0x00fd;
    L_0x01d2:
        r8 = 5;
        if (r7 >= r8) goto L_0x01df;
    L_0x01d5:
        r7 = r7 + 1;
        goto L_0x00fd;
    L_0x01d9:
        r0 = move-exception;
        goto L_0x0201;
    L_0x01db:
        r0 = move-exception;
        r2.a(r0);	 Catch:{ all -> 0x01d9 }
    L_0x01df:
        r0 = r2.a();	 Catch:{ all -> 0x01d9 }
        if (r0 != r4) goto L_0x01e6;
    L_0x01e5:
        goto L_0x01e7;
    L_0x01e6:
        r6 = 0;
    L_0x01e7:
        if (r6 == 0) goto L_0x01ec;
    L_0x01e9:
        r2.c();	 Catch:{ all -> 0x01d9 }
    L_0x01ec:
        r17.b();	 Catch:{ Exception -> 0x01ff }
        if (r6 != 0) goto L_0x01f6;
    L_0x01f1:
        r0 = r1.j;	 Catch:{ all -> 0x029c }
        r0.add(r2);	 Catch:{ all -> 0x029c }
    L_0x01f6:
        r0 = r1.l;	 Catch:{ all -> 0x029c }
        r0.c();	 Catch:{ all -> 0x029c }
        goto L_0x003e;
    L_0x01fd:
        r0 = move-exception;
        goto L_0x023f;
    L_0x01ff:
        r0 = move-exception;
        goto L_0x022c;
    L_0x0201:
        r17.b();	 Catch:{ Exception -> 0x022a, all -> 0x0227 }
        throw r0;	 Catch:{ Exception -> 0x022a, all -> 0x0227 }
    L_0x0205:
        r0 = move-exception;
        r4 = new uoo;	 Catch:{ uoo -> 0x020c }
        r4.<init>(r0);	 Catch:{ uoo -> 0x020c }
        throw r4;	 Catch:{ uoo -> 0x020c }
    L_0x020c:
        r0 = move-exception;
        r4 = r1.k;	 Catch:{ Exception -> 0x022a, all -> 0x0227 }
        r5 = r1.l;	 Catch:{ Exception -> 0x022a, all -> 0x0227 }
        r4 = r4.a(r5);	 Catch:{ Exception -> 0x022a, all -> 0x0227 }
        if (r4 == 0) goto L_0x0223;
    L_0x0217:
        r0 = r1.j;	 Catch:{ all -> 0x029c }
        r0.add(r2);	 Catch:{ all -> 0x029c }
        r0 = r1.l;	 Catch:{ all -> 0x029c }
        r0.c();	 Catch:{ all -> 0x029c }
        goto L_0x003e;
    L_0x0223:
        throw r0;	 Catch:{ Exception -> 0x022a, all -> 0x0227 }
    L_0x0224:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0224 }
        throw r0;	 Catch:{ InterruptedException -> 0x024d }
    L_0x0227:
        r0 = move-exception;
        r6 = 0;
        goto L_0x023f;
    L_0x022a:
        r0 = move-exception;
        r6 = 0;
    L_0x022c:
        r4 = "Failed to execute ExtractorTask";
        defpackage.ujo.a(r4, r0);	 Catch:{ all -> 0x01fd }
        if (r6 != 0) goto L_0x0238;
    L_0x0233:
        r0 = r1.j;	 Catch:{ all -> 0x029c }
        r0.add(r2);	 Catch:{ all -> 0x029c }
    L_0x0238:
        r0 = r1.l;	 Catch:{ all -> 0x029c }
        r0.c();	 Catch:{ all -> 0x029c }
        goto L_0x003e;
    L_0x023f:
        if (r6 == 0) goto L_0x0242;
    L_0x0241:
        goto L_0x0247;
    L_0x0242:
        r3 = r1.j;	 Catch:{ all -> 0x029c }
        r3.add(r2);	 Catch:{ all -> 0x029c }
    L_0x0247:
        r2 = r1.l;	 Catch:{ all -> 0x029c }
        r2.c();	 Catch:{ all -> 0x029c }
        throw r0;	 Catch:{ all -> 0x029c }
    L_0x024d:
        r0 = r1.j;	 Catch:{ all -> 0x029c }
        r0.add(r2);	 Catch:{ all -> 0x029c }
        r0 = r1.l;	 Catch:{ all -> 0x029c }
        r0.c();	 Catch:{ all -> 0x029c }
        goto L_0x003e;
    L_0x0259:
        r17.c();
        r0 = r1.k;
        r2 = r1.l;
        r0.d(r2);
        return;
    L_0x0264:
        r0 = move-exception;
        goto L_0x0296;
    L_0x0266:
        r0 = move-exception;
        r1.b = r0;	 Catch:{ all -> 0x0264 }
        r2 = "Unable to initialize ExtractorSurface - terminating ExtractorThread";
        defpackage.ujo.a(r2, r0);	 Catch:{ all -> 0x0264 }
        r0 = r1.a;	 Catch:{ all -> 0x029c }
        r0.countDown();	 Catch:{ all -> 0x029c }
        r17.c();
        r0 = r1.k;
        r2 = r1.l;
        r0.d(r2);
        return;
    L_0x027e:
        r0 = move-exception;
        r1.b = r0;	 Catch:{ all -> 0x0264 }
        r2 = "Unable to read video file - terminating ExtractorThread";
        defpackage.ujo.a(r2, r0);	 Catch:{ all -> 0x0264 }
        r0 = r1.a;	 Catch:{ all -> 0x029c }
        r0.countDown();	 Catch:{ all -> 0x029c }
        r17.c();
        r0 = r1.k;
        r2 = r1.l;
        r0.d(r2);
        return;
    L_0x0296:
        r2 = r1.a;	 Catch:{ all -> 0x029c }
        r2.countDown();	 Catch:{ all -> 0x029c }
        throw r0;	 Catch:{ all -> 0x029c }
    L_0x029c:
        r0 = move-exception;
        r17.c();
        r2 = r1.k;
        r3 = r1.l;
        r2.d(r3);
        goto L_0x02a9;
    L_0x02a8:
        throw r0;
    L_0x02a9:
        goto L_0x02a8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uop.run():void");
    }

    public final synchronized void a() {
        if (!this.m) {
            this.m = true;
            interrupt();
        }
    }

    private final void b() {
        ukj ukj = this.p;
        if (ukj != null) {
            if (this.s) {
                try {
                    ukj.c();
                } catch (IllegalStateException e) {
                    ujo.a("IllegalStateException while stopping decoder", e);
                }
                this.s = false;
            }
            this.p.a();
            this.p = null;
        }
    }

    private final void c() {
        uof uof = this.n;
        if (uof != null) {
            uof.c();
            this.n = null;
        }
        uks uks = this.o;
        if (uks != null) {
            uks.a();
            this.o = null;
        }
    }

    private final boolean a(uok uok) {
        uok uok2 = (uok) this.j.peek();
        return uok2 != null && uok2.a > uok.a;
    }
}
