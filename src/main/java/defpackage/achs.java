package defpackage;

import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import android.os.Handler;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: achs */
public final class achs implements acgy {
    private final LinkedList A = new LinkedList();
    public volatile Thread a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    private final Handler e;
    private final AutomaticGainControl f;
    private final double g;
    private final Runnable h = new achu(this);
    private final Runnable i = new achx(this);
    private final Runnable j = new achw(this);
    private AudioRecord k;
    private acib l;
    private long m;
    private boolean n;
    private acha o;
    private byte[] p;
    private achb q;
    private volatile boolean r;
    private volatile boolean s;
    private int t;
    private int u;
    private final Runnable v = new achz(this);
    private final ConcurrentLinkedQueue w = new ConcurrentLinkedQueue();
    private final ConcurrentLinkedQueue x = new ConcurrentLinkedQueue();
    private final LinkedList y = new LinkedList();
    private final LinkedList z = new LinkedList();

    public achs(AudioRecord audioRecord, int i, int i2, int i3, Handler handler) {
        this.e = (Handler) amqw.a((Object) handler);
        this.k = (AudioRecord) amqw.a((Object) audioRecord);
        i = i == 12 ? 2 : 1;
        double d = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d);
        d += d;
        double d2 = (double) i;
        Double.isNaN(d2);
        this.g = 1000000.0d / (d * d2);
        if (AutomaticGainControl.isAvailable()) {
            this.f = AutomaticGainControl.create(audioRecord.getAudioSessionId());
            this.f.setEnabled(true);
        } else {
            this.f = null;
        }
        for (int i4 = 0; i4 < 30; i4++) {
            achy achy = new achy();
            achy.b = -1;
            achy.a = ByteBuffer.allocateDirect(i3);
            this.z.add(achy);
        }
        this.m = Long.MIN_VALUE;
    }

    public final void a(achb achb) {
        this.q = achb;
    }

    public final void a(int i, ByteBuffer byteBuffer) {
        achy achy;
        if (this.y.isEmpty()) {
            achy = new achy();
        } else {
            achy = (achy) this.y.removeFirst();
        }
        achy.a = byteBuffer;
        achy.b = i;
        achy.d = 0;
        achy.e = 0;
        String str = "MicInput";
        StringBuilder stringBuilder;
        if (this.d) {
            stringBuilder = new StringBuilder(69);
            stringBuilder.append("Received buffer fill request with pending error: bufferId=");
            stringBuilder.append(i);
            Log.w(str, stringBuilder.toString());
            achy.d = -1;
            a(achy);
        } else if (this.c) {
            achy.e = 4;
            a(achy);
        } else if (this.r) {
            this.w.add(achy);
        } else {
            stringBuilder = new StringBuilder(74);
            stringBuilder.append("Received buffer fill request before recorder started: bufferId=");
            stringBuilder.append(i);
            Log.w(str, stringBuilder.toString());
            a(achy);
        }
    }

    private final synchronized void a(achy achy) {
        this.x.add(achy);
        this.e.post(this.v);
    }

    public final void f() {
        xak.b();
        this.e.removeCallbacks(this.v);
        while (!this.x.isEmpty()) {
            try {
                achy achy = (achy) this.x.remove();
                acha acha = this.o;
                if (acha != null) {
                    acha.a(achy.b, achy.e, achy.d, achy.c);
                }
                achy.a = null;
                achy.d = 0;
                achy.c = 0;
                achy.b = -1;
                this.y.addLast(achy);
            } catch (NoSuchElementException unused) {
                Log.e("MicInput", "Audio response queue unexpectedly empty");
                return;
            }
        }
    }

    public final void a(acha acha) {
        this.o = acha;
    }

    public final void a(boolean z) {
        this.s = z;
    }

    public final boolean a() {
        String str = "MicInput";
        if (this.n) {
            Log.e(str, "Cannot start once released");
            return false;
        } else if (this.c) {
            Log.e(str, "Cannot restart once stopped");
            return false;
        } else if (this.r) {
            return true;
        } else {
            if (this.a != null) {
                Log.e(str, "Mic capture thread already exists");
                return false;
            }
            try {
                this.k.startRecording();
                this.d = false;
                this.b = false;
                this.r = true;
                this.a = new Thread(new achv(this), "MicInputThread");
                this.a.start();
                return this.r;
            } catch (IllegalStateException e) {
                Log.e(str, "Could not start audio recorder", e);
                return false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033 A:{LOOP_START, SYNTHETIC, Splitter:B:22:0x0033, LOOP:1: B:22:0x0033->B:23:?} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0033 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|32) */
    public final boolean b() {
        /*
        r5 = this;
        r0 = r5.n;
        r1 = 0;
        r2 = "MicInput";
        if (r0 == 0) goto L_0x000d;
    L_0x0007:
        r0 = "Cannot stop once released";
        android.util.Log.e(r2, r0);
        return r1;
    L_0x000d:
        r0 = r5.r;
        if (r0 != 0) goto L_0x0017;
    L_0x0011:
        r0 = "Encoder not started";
        android.util.Log.e(r2, r0);
        return r1;
    L_0x0017:
        r0 = r5.c;
        r1 = 1;
        if (r0 != 0) goto L_0x0044;
    L_0x001c:
        r0 = r5.a;
        if (r0 != 0) goto L_0x0023;
    L_0x0020:
        r5.c = r1;
        return r1;
    L_0x0023:
        r5.b = r1;
    L_0x0025:
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r0.join(r2);	 Catch:{ InterruptedException -> 0x0025 }
        r4 = r0.isAlive();
        if (r4 == 0) goto L_0x0036;
    L_0x0030:
        r0.interrupt();
    L_0x0033:
        r0.join(r2);	 Catch:{ InterruptedException -> 0x0033 }
    L_0x0036:
        r0 = r0.isAlive();
        if (r0 != 0) goto L_0x0041;
    L_0x003c:
        r5.c = r1;
        r0 = 0;
        r5.a = r0;
    L_0x0041:
        r0 = r5.c;
        return r0;
    L_0x0044:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achs.b():boolean");
    }

    public final boolean c() {
        if (this.n) {
            return true;
        }
        b();
        try {
            AutomaticGainControl automaticGainControl = this.f;
            if (automaticGainControl != null) {
                automaticGainControl.release();
            }
            this.k.release();
            this.n = true;
        } catch (Exception unused) {
        }
        return this.n;
    }

    public final void a(int i) {
        achb achb = this.q;
        if (achb != null) {
            achb.b(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:97:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01aa  */
    public final void g() {
        /*
        r20 = this;
        r1 = r20;
        defpackage.xak.b();
        r0 = r1.r;
        defpackage.amqw.b(r0);
        r0 = new acib;
        r2 = 50;
        r0.<init>(r2);
        r1.l = r0;
        r2 = 0;
        r1.t = r2;
        r1.u = r2;
        r5 = 0;
        r6 = 0;
        r8 = 0;
    L_0x001d:
        r0 = r1.b;
        r10 = 1;
        if (r0 != 0) goto L_0x0212;
    L_0x0022:
        r0 = r1.d;
        r11 = -1;
        r12 = "MicInput";
        if (r0 == 0) goto L_0x0063;
    L_0x0029:
        r0 = r1.w;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0046;
    L_0x0031:
        r0 = r1.w;	 Catch:{ NoSuchElementException -> 0x003f }
        r0 = r0.remove();	 Catch:{ NoSuchElementException -> 0x003f }
        r0 = (defpackage.achy) r0;	 Catch:{ NoSuchElementException -> 0x003f }
        r0.d = r11;	 Catch:{ NoSuchElementException -> 0x003f }
        r1.a(r0);	 Catch:{ NoSuchElementException -> 0x003f }
        goto L_0x0029;
    L_0x003f:
        r0 = move-exception;
        r2 = "Audio request queue unexpectedly empty while draining on error";
        android.util.Log.e(r12, r2, r0);
        return;
    L_0x0046:
        r0 = 30;
        if (r5 < r0) goto L_0x0050;
    L_0x004a:
        r0 = "Waited too long for cleanup after error";
        android.util.Log.e(r12, r0);
        return;
    L_0x0050:
        if (r5 > 0) goto L_0x0053;
    L_0x0052:
        goto L_0x0060;
    L_0x0053:
        r10 = 100;
        java.lang.Thread.sleep(r10, r2);	 Catch:{ InterruptedException -> 0x0059 }
        goto L_0x0060;
    L_0x0059:
        r0 = move-exception;
        r10 = r0;
        r0 = "Interrupted while draining buffer queue on error.";
        android.util.Log.w(r12, r0, r10);
    L_0x0060:
        r5 = r5 + 1;
        goto L_0x001d;
    L_0x0063:
        r0 = r1.w;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00c8;
    L_0x006b:
        r0 = r1.A;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00c8;
    L_0x0073:
        r0 = r1.d;
        if (r0 != 0) goto L_0x00c8;
    L_0x0077:
        r0 = r1.w;	 Catch:{ NoSuchElementException -> 0x00bf }
        r0 = r0.remove();	 Catch:{ NoSuchElementException -> 0x00bf }
        r13 = r0;
        r13 = (defpackage.achy) r13;	 Catch:{ NoSuchElementException -> 0x00bf }
        r0 = r1.A;	 Catch:{ NoSuchElementException -> 0x00b1 }
        r0 = r0.removeFirst();	 Catch:{ NoSuchElementException -> 0x00b1 }
        r14 = r0;
        r14 = (defpackage.achy) r14;	 Catch:{ NoSuchElementException -> 0x00b1 }
        r3 = r14.c;
        r13.c = r3;
        r0 = r14.d;
        r13.d = r0;
        r0 = r13.a;	 Catch:{ Exception -> 0x0099 }
        r3 = r14.a;	 Catch:{ Exception -> 0x0099 }
        r0.put(r3);	 Catch:{ Exception -> 0x0099 }
        goto L_0x00a3;
    L_0x0099:
        r0 = move-exception;
        r3 = "Error copying mic data to client buffer";
        android.util.Log.e(r12, r3, r0);
        r1.d = r10;
        r13.d = r11;
    L_0x00a3:
        r0 = r14.a;
        r0.position(r2);
        r0 = r1.z;
        r0.add(r14);
        r1.a(r13);
        goto L_0x0063;
    L_0x00b1:
        r0 = move-exception;
        r3 = "Mic queue unexpectedly empty while copying results";
        android.util.Log.e(r12, r3, r0);
        r1.d = r10;
        r13.d = r11;
        r1.a(r13);
        goto L_0x0063;
    L_0x00bf:
        r0 = move-exception;
        r3 = "Audio request queue unexpectedly empty while copying results";
        android.util.Log.e(r12, r3, r0);
        r1.d = r10;
        goto L_0x0063;
    L_0x00c8:
        r0 = r1.d;
        if (r0 != 0) goto L_0x020d;
    L_0x00cc:
        r0 = r1.k;
        if (r0 != 0) goto L_0x00d9;
    L_0x00d0:
        r0 = "Skipping audio input request due to missing recorder";
        android.util.Log.e(r12, r0);
        r1.d = r10;
        goto L_0x020d;
    L_0x00d9:
        r0 = r1.w;
        r0 = r0.isEmpty();
        r3 = r0 ^ 1;
        r13 = java.lang.System.nanoTime();
        r17 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r13 = r13 / r17;
        if (r3 == 0) goto L_0x0101;
    L_0x00eb:
        r0 = r1.w;	 Catch:{ NoSuchElementException -> 0x00f8 }
        r0 = r0.remove();	 Catch:{ NoSuchElementException -> 0x00f8 }
        r0 = (defpackage.achy) r0;	 Catch:{ NoSuchElementException -> 0x00f8 }
        r20.h();
    L_0x00f6:
        r4 = r0;
        goto L_0x015b;
    L_0x00f8:
        r0 = "Audio request queue unexpectedly empty";
        android.util.Log.e(r12, r0);
        r1.d = r10;
        goto L_0x020d;
    L_0x0101:
        r0 = r1.z;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x014f;
    L_0x0109:
        r0 = r1.A;	 Catch:{ NoSuchElementException -> 0x0145 }
        r0 = r0.removeFirst();	 Catch:{ NoSuchElementException -> 0x0145 }
        r0 = (defpackage.achy) r0;	 Catch:{ NoSuchElementException -> 0x0145 }
        r4 = r1.t;
        r4 = r4 + r10;
        r1.t = r4;
        r15 = 8;
        if (r4 != r15) goto L_0x012d;
    L_0x011a:
        r4 = r1.u;
        if (r4 == r10) goto L_0x00f6;
    L_0x011e:
        r4 = "Audio buffer overflow.  Entering warning state";
        android.util.Log.w(r12, r4);
        r1.u = r10;
        r4 = r1.e;
        r15 = r1.i;
        r4.post(r15);
        goto L_0x00f6;
    L_0x012d:
        r15 = 40;
        if (r4 != r15) goto L_0x00f6;
    L_0x0131:
        r4 = r1.u;
        r15 = 2;
        if (r4 == r15) goto L_0x00f6;
    L_0x0136:
        r4 = "Audio buffer overflow.  Entering error state";
        android.util.Log.e(r12, r4);
        r1.u = r15;
        r4 = r1.e;
        r15 = r1.j;
        r4.post(r15);
        goto L_0x00f6;
    L_0x0145:
        r0 = move-exception;
        r3 = "Mic queue unexpectedly empty in overflow";
        android.util.Log.e(r12, r3, r0);
        r1.d = r10;
        goto L_0x020d;
    L_0x014f:
        r0 = r1.z;	 Catch:{ NoSuchElementException -> 0x0201 }
        r0 = r0.removeFirst();	 Catch:{ NoSuchElementException -> 0x0201 }
        r0 = (defpackage.achy) r0;	 Catch:{ NoSuchElementException -> 0x0201 }
        r20.h();
        goto L_0x00f6;
    L_0x015b:
        r4.d = r2;
        r15 = r4.a;
        r16 = 0;
        r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        r18 = r15;
        if (r0 > 0) goto L_0x0170;
    L_0x0167:
        r0 = r1.l;
        r0.a();
        r19 = r3;
        r8 = r13;
        goto L_0x0172;
    L_0x0170:
        r19 = r3;
    L_0x0172:
        r2 = (double) r6;
        r10 = r1.g;
        java.lang.Double.isNaN(r2);
        r2 = r2 * r10;
        r2 = (long) r2;
        r2 = r2 + r8;
        r4.c = r2;
        r10 = 0;
        r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x018b;
    L_0x0184:
        r0 = r1.l;
        r2 = r2 - r13;
        r2 = (double) r2;
        r0.a(r2);
    L_0x018b:
        r0 = r1.k;	 Catch:{ Exception -> 0x019c }
        r2 = r18.capacity();	 Catch:{ Exception -> 0x019c }
        r3 = r18;
        r0 = r0.read(r3, r2);	 Catch:{ Exception -> 0x019a }
        r4.d = r0;	 Catch:{ Exception -> 0x019a }
        goto L_0x01a8;
    L_0x019a:
        r0 = move-exception;
        goto L_0x019f;
    L_0x019c:
        r0 = move-exception;
        r3 = r18;
    L_0x019f:
        r2 = "Error reading audio data";
        android.util.Log.e(r12, r2, r0);
        r2 = -1;
        r4.d = r2;
        r0 = -1;
    L_0x01a8:
        if (r0 >= 0) goto L_0x01cf;
    L_0x01aa:
        r2 = new java.lang.StringBuilder;
        r3 = 44;
        r2.<init>(r3);
        r3 = "Error reading audio sample data: ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.e(r12, r0);
        r2 = 1;
        r1.d = r2;
        if (r19 == 0) goto L_0x01c9;
    L_0x01c5:
        r1.a(r4);
        goto L_0x020f;
    L_0x01c9:
        r0 = r1.z;
        r0.add(r4);
        goto L_0x020f;
    L_0x01cf:
        r0 = r1.s;
        if (r0 != 0) goto L_0x01f1;
    L_0x01d3:
        r0 = r1.p;
        if (r0 == 0) goto L_0x01de;
    L_0x01d7:
        r0 = r0.length;
        r2 = r3.capacity();
        if (r0 >= r2) goto L_0x01e6;
    L_0x01de:
        r0 = r3.capacity();
        r0 = new byte[r0];
        r1.p = r0;
    L_0x01e6:
        r2 = 0;
        r3.position(r2);
        r0 = r1.p;
        r12 = r4.d;
        r3.put(r0, r2, r12);
    L_0x01f1:
        r0 = r4.d;
        r2 = (long) r0;
        r6 = r6 + r2;
        if (r19 == 0) goto L_0x01fb;
    L_0x01f7:
        r1.a(r4);
        goto L_0x020f;
    L_0x01fb:
        r0 = r1.A;
        r0.addLast(r4);
        goto L_0x020f;
    L_0x0201:
        r0 = move-exception;
        r10 = 0;
        r2 = "Mic free list unexpectedly empty";
        android.util.Log.e(r12, r2, r0);
        r2 = 1;
        r1.d = r2;
        goto L_0x020f;
    L_0x020d:
        r10 = 0;
    L_0x020f:
        r2 = 0;
        goto L_0x001d;
    L_0x0212:
        r0 = r1.f;	 Catch:{ Exception -> 0x0224 }
        if (r0 == 0) goto L_0x0222;
    L_0x0216:
        r0 = r0.getEnabled();	 Catch:{ Exception -> 0x0224 }
        if (r0 == 0) goto L_0x0222;
    L_0x021c:
        r0 = r1.f;	 Catch:{ Exception -> 0x0224 }
        r2 = 0;
        r0.setEnabled(r2);	 Catch:{ Exception -> 0x0224 }
    L_0x0222:
        r2 = 1;
        goto L_0x0227;
    L_0x0224:
        r2 = 1;
        r1.d = r2;
    L_0x0227:
        r0 = r1.k;	 Catch:{ Exception -> 0x0238 }
        r0 = r0.getRecordingState();	 Catch:{ Exception -> 0x0238 }
        if (r0 == r2) goto L_0x0237;
    L_0x022f:
        r0 = r1.k;	 Catch:{ Exception -> 0x0235 }
        r0.stop();	 Catch:{ Exception -> 0x0235 }
        goto L_0x0237;
    L_0x0235:
        r2 = 1;
        goto L_0x0238;
    L_0x0237:
        return;
    L_0x0238:
        r1.d = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achs.g():void");
    }

    public final long d() {
        long nanoTime = System.nanoTime();
        acib acib = this.l;
        long j = 0;
        if (acib != null && (acib.c - acib.b) / 1000 >= 5000000) {
            j = (long) (acib.a * 1000.0d);
        }
        nanoTime = Math.max(nanoTime + j, this.m);
        this.m = nanoTime;
        return nanoTime;
    }

    public final long e() {
        return TimeUnit.NANOSECONDS.toMillis(d());
    }

    private final void h() {
        int i = this.t;
        if (i > 0) {
            i--;
            this.t = i;
            if (i == 0) {
                if (this.u != 0) {
                    this.u = 0;
                    this.e.post(this.h);
                }
            } else if (i == 30 && this.u != 1) {
                Log.w("MicInput", "Audio buffer overflow improved.  Re-entering warning state");
                this.u = 1;
                this.e.post(this.i);
            }
        }
    }
}
