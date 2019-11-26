package defpackage;

import android.media.MediaFormat;
import android.media.audiofx.NoiseSuppressor;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: zgz */
public final class zgz implements Runnable, zgl, zil {
    private zii A;
    private zgm B;
    private final int C;
    private umc D;
    private final Object E;
    private boolean F;
    private int G;
    private int H;
    private MediaFormat I;
    private MediaFormat J;
    private final EGLContext K;
    private Looper L;
    private long M;
    public int a = 0;
    public zii b;
    public zik c;
    public ujl d;
    public ziu e;
    public boolean f = false;
    public final Object g;
    public final int h;
    public final int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;
    public int o;
    public Thread p;
    public Handler q;
    public boolean r = false;
    public long s;
    public long t;
    public int u;
    public int v;
    public zit w;
    public final boolean x;
    private final int y;
    private final ukf z;

    public zgz(EGLContext eGLContext, ukf ukf, int i, boolean z, int i2, int i3, int i4) {
        this.K = eGLContext;
        this.z = ukf;
        this.C = i;
        this.x = z;
        this.h = i2;
        this.i = i3;
        this.y = i4;
        this.E = new Object();
        this.g = new Object();
    }

    public final zit a() {
        this.r = false;
        synchronized (this) {
            b(1);
            this.L.quit();
            b(4);
        }
        return this.w;
    }

    public final long b() {
        if (this.s >= 0) {
            return TimeUnit.NANOSECONDS.toMillis(this.t - this.s);
        }
        return 0;
    }

    public final void run() {
        boolean z;
        Looper.prepare();
        synchronized (this) {
            this.q = new Handler();
            this.L = Looper.myLooper();
            z = true;
            a(1);
        }
        this.F = false;
        ukj a = this.z.a("video/avc", true);
        if (a != null) {
            int i = this.l;
            int i2 = this.m;
            float f = this.n;
            int i3 = this.y;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", i3);
            createVideoFormat.setFloat("frame-rate", f);
            createVideoFormat.setInteger("i-frame-interval", 2);
            this.G = -1;
            this.I = null;
            this.b = new zii(a, createVideoFormat);
            this.b.b = this;
            a = this.z.a("audio/mp4a-latm", true);
            if (a != null) {
                this.H = -1;
                this.J = null;
                createVideoFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, this.o);
                createVideoFormat.setInteger("bitrate", 128000);
                this.A = new zii(a, createVideoFormat);
                this.A.b = this;
                this.d = new ujl(this.K, this.b.a.h());
                this.d.a();
                this.e = new ziu();
                try {
                    this.D = this.c.a();
                    int i4 = (this.j + this.k) % 360;
                    if (i4 >= 180) {
                        this.D.a((i4 + 180) % 360);
                    } else {
                        this.D.a(i4);
                    }
                    this.b.a();
                    this.A.a();
                    this.s = -1;
                    this.t = -1;
                    this.M = 0;
                    this.B = new zgm(this.C, this.o);
                    zgm zgm = this.B;
                    zgm.c = this;
                    zgm.d = false;
                    zgm.a.startRecording();
                    zgm.b = new Thread(zgm, "editRecordAudio");
                    zgm.b.start();
                    a(2);
                    Looper.loop();
                    a(3);
                    synchronized (this.E) {
                        this.E.notifyAll();
                    }
                    this.q.removeCallbacksAndMessages(null);
                    c();
                    zgm = this.B;
                    amqw.a(zgm.b);
                    zgm.d = true;
                    while (true) {
                        Thread thread = zgm.b;
                        if (thread == null) {
                            break;
                        }
                        try {
                            thread.join();
                            zgm.b = null;
                        } catch (InterruptedException unused) {
                        }
                    }
                    long a2 = this.B.a(this.M);
                    zgm = this.B;
                    if (zgm.b != null) {
                        z = false;
                    }
                    amqw.a(z);
                    zgm.a.release();
                    zgm.a = null;
                    NoiseSuppressor noiseSuppressor = zgm.e;
                    if (noiseSuppressor != null) {
                        noiseSuppressor.release();
                        zgm.e = null;
                    }
                    this.B = null;
                    if (this.F) {
                        this.b.a.i();
                        zii zii = this.A;
                        zii.a.a(zii.a.a(-1), 0, a2, 4);
                        while (true) {
                            zii = this.b;
                            if (zii.d == 2 || this.A.d == 2) {
                                zii.a(10000);
                                this.A.a(10000);
                            } else {
                                try {
                                    break;
                                } catch (IOException | IllegalStateException e) {
                                    xtl.a("Failed to stop media muxer.", e);
                                }
                            }
                        }
                        this.D.b();
                    }
                    try {
                        this.D.c();
                    } catch (IllegalStateException e2) {
                        xtl.a("Failed to release media muxer.", e2);
                    }
                    this.D = null;
                    this.b.b();
                    this.A.b();
                    this.b.c();
                    this.b = null;
                    this.A.c();
                    this.A = null;
                    ujl ujl = this.d;
                    if (ujl != null) {
                        ujl.a();
                        this.e.a();
                        ujl = this.d;
                        if (ujl.b != EGL14.EGL_NO_DISPLAY) {
                            EGL14.eglMakeCurrent(ujl.b, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                            EGL14.eglDestroySurface(ujl.b, ujl.d);
                            EGL14.eglDestroyContext(ujl.b, ujl.c);
                            EGL14.eglReleaseThread();
                            EGL14.eglTerminate(ujl.b);
                        }
                        ujl.b = EGL14.EGL_NO_DISPLAY;
                        ujl.c = EGL14.EGL_NO_CONTEXT;
                        ujl.d = EGL14.EGL_NO_SURFACE;
                        ujl.a.release();
                        ujl.a = null;
                    }
                    this.e = null;
                    this.d = null;
                    if (this.F) {
                        this.w = new zit(this.l, this.m, b());
                    }
                    synchronized (this) {
                        this.q = null;
                        a(4);
                    }
                    return;
                } catch (IOException e3) {
                    xtl.c("Failed to create media muxer.");
                    throw new RuntimeException(e3);
                }
            }
            throw new RuntimeException("Failed to create audio encoder.");
        }
        throw new RuntimeException("Failed to create video encoder.");
    }

    private final void a(int i) {
        synchronized (this) {
            this.a = i;
            notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A:{LOOP_START, SYNTHETIC, LOOP:0: B:1:0x0001->B:13:0x0001} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    private final void b(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
    L_0x0001:
        r0 = r1.a;	 Catch:{ all -> 0x000b }
        if (r0 >= r2) goto L_0x0009;
    L_0x0005:
        r1.wait();	 Catch:{ InterruptedException -> 0x0001 }
        goto L_0x0001;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x000b }
        return;
    L_0x000b:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000b }
        goto L_0x000f;
    L_0x000e:
        throw r2;
    L_0x000f:
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgz.b(int):void");
    }

    public final void c() {
        synchronized (this.g) {
            this.f = false;
            this.g.notify();
        }
    }

    public final void a(zii zii, MediaFormat mediaFormat) {
        synchronized (this.E) {
            if (zii == this.b) {
                if (this.I == null) {
                    this.I = mediaFormat;
                } else {
                    throw new RuntimeException("Multiple video tracks specified.");
                }
            } else if (this.J == null) {
                this.J = mediaFormat;
            } else {
                throw new RuntimeException("Multiple audio tracks specified.");
            }
            MediaFormat mediaFormat2 = this.I;
            if (!(mediaFormat2 == null || this.J == null || this.a == 3)) {
                this.G = this.D.a(mediaFormat2);
                this.H = this.D.a(this.J);
                try {
                    this.D.a();
                    this.F = true;
                    this.E.notifyAll();
                } catch (IOException e) {
                    xtl.c("Failed to start media muxer.");
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A:{LOOP_START, SYNTHETIC, LOOP:0: B:6:0x0010->B:39:0x0010} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void a(defpackage.zii r5, java.nio.ByteBuffer r6, android.media.MediaCodec.BufferInfo r7) {
        /*
        r4 = this;
        defpackage.amqw.a(r6);
        r0 = r7.flags;
        r0 = r0 & 2;
        if (r0 != 0) goto L_0x0050;
    L_0x0009:
        r0 = r7.size;
        if (r0 == 0) goto L_0x0050;
    L_0x000d:
        r0 = r4.E;
        monitor-enter(r0);
    L_0x0010:
        r1 = r4.F;	 Catch:{ all -> 0x004d }
        if (r1 != 0) goto L_0x001f;
    L_0x0014:
        r1 = r4.a;	 Catch:{ all -> 0x004d }
        r2 = 3;
        if (r1 >= r2) goto L_0x003f;
    L_0x0019:
        r1 = r4.E;	 Catch:{ InterruptedException -> 0x0010 }
        r1.wait();	 Catch:{ InterruptedException -> 0x0010 }
        goto L_0x0010;
    L_0x001f:
        r1 = r4.b;	 Catch:{ all -> 0x004d }
        if (r5 == r1) goto L_0x0026;
    L_0x0023:
        r1 = r4.H;	 Catch:{ all -> 0x004d }
        goto L_0x0028;
    L_0x0026:
        r1 = r4.G;	 Catch:{ all -> 0x004d }
    L_0x0028:
        r2 = 1;
        if (r1 < 0) goto L_0x002d;
    L_0x002b:
        r3 = 1;
        goto L_0x002e;
    L_0x002d:
        r3 = 0;
    L_0x002e:
        defpackage.amqw.a(r3);	 Catch:{ all -> 0x004d }
        r3 = r4.D;	 Catch:{ IOException -> 0x0041 }
        r3.a(r1, r6, r7);	 Catch:{ IOException -> 0x0041 }
        r6 = r4.b;	 Catch:{ all -> 0x004d }
        if (r5 != r6) goto L_0x003f;
    L_0x003a:
        r5 = r4.v;	 Catch:{ all -> 0x004d }
        r5 = r5 + r2;
        r4.v = r5;	 Catch:{ all -> 0x004d }
    L_0x003f:
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        goto L_0x0050;
    L_0x0041:
        r5 = move-exception;
        r6 = "Failed to write sample data.";
        defpackage.xtl.c(r6);	 Catch:{ all -> 0x004d }
        r6 = new java.lang.RuntimeException;	 Catch:{ all -> 0x004d }
        r6.<init>(r5);	 Catch:{ all -> 0x004d }
        throw r6;	 Catch:{ all -> 0x004d }
    L_0x004d:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        throw r5;
    L_0x0050:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgz.a(zii, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo):void");
    }

    /* JADX WARNING: Missing block: B:7:0x0009, code skipped:
            r9.A.a(0);
            r6 = r9.B.a(r9.M);
            r0 = r10.limit();
            r1 = r9.A;
            r4 = r1.a.a(-1);
     */
    /* JADX WARNING: Missing block: B:8:0x0026, code skipped:
            if (r4 < 0) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:9:0x0028, code skipped:
            r2 = r1.c[r4];
            r2.put(r10);
            r2.rewind();
            r1.a.a(r4, r0, r6, 0);
            r9.M += (long) r0;
     */
    /* JADX WARNING: Missing block: B:10:0x003f, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:12:0x0047, code skipped:
            throw new java.lang.RuntimeException("No input buffer available.");
     */
    public final void a(java.nio.ByteBuffer r10) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.a;	 Catch:{ all -> 0x0048 }
        r1 = 2;
        if (r0 == r1) goto L_0x0008;
    L_0x0006:
        monitor-exit(r9);	 Catch:{ all -> 0x0048 }
        return;
    L_0x0008:
        monitor-exit(r9);	 Catch:{ all -> 0x0048 }
        r0 = r9.A;
        r1 = 0;
        r0.a(r1);
        r0 = r9.B;
        r1 = r9.M;
        r6 = r0.a(r1);
        r0 = r10.limit();
        r1 = r9.A;
        r2 = r1.a;
        r3 = -1;
        r4 = r2.a(r3);
        if (r4 < 0) goto L_0x0040;
    L_0x0028:
        r2 = r1.c;
        r2 = r2[r4];
        r2.put(r10);
        r2.rewind();
        r3 = r1.a;
        r8 = 0;
        r5 = r0;
        r3.a(r4, r5, r6, r8);
        r1 = r9.M;
        r3 = (long) r0;
        r1 = r1 + r3;
        r9.M = r1;
        return;
    L_0x0040:
        r10 = new java.lang.RuntimeException;
        r0 = "No input buffer available.";
        r10.<init>(r0);
        throw r10;
    L_0x0048:
        r10 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0048 }
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgz.a(java.nio.ByteBuffer):void");
    }
}
