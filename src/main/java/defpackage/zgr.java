package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Size;
import android.os.AsyncTask;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: zgr */
public final class zgr {
    public static final int[] a = new int[]{100, 250, 500, 1000, 3000};
    public Camera b;
    public int c;
    public int d;
    public SurfaceTexture e;
    public SurfaceHolder f;
    public int g = 0;
    public int h;
    public zgt i;
    public final Object j = new Object();
    private int k;
    private int l = aocf.UNSET_ENUM_VALUE;
    private AsyncTask m;
    private final Object n = new Object();

    public static int[] a() {
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < numberOfCameras && (i < 0 || i2 < 0); i3++) {
            CameraInfo cameraInfo = new CameraInfo();
            Camera.getCameraInfo(i3, cameraInfo);
            if (i < 0 && cameraInfo.facing == 1) {
                i = i3;
            } else if (i2 < 0 && cameraInfo.facing == 0) {
                i2 = i3;
            }
        }
        return new int[]{i2, i};
    }

    public final Camera b() {
        e();
        return this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A:{LOOP_START, SYNTHETIC, LOOP:0: B:2:0x0003->B:29:0x0003} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:10:?, code skipped:
            r1 = java.lang.Integer.toString(r1);
            r3 = true;
     */
    /* JADX WARNING: Missing block: B:11:0x0016, code skipped:
            if (r11.h != 0) goto L_0x001a;
     */
    /* JADX WARNING: Missing block: B:12:0x0018, code skipped:
            r2 = true;
     */
    /* JADX WARNING: Missing block: B:13:0x001a, code skipped:
            r2 = false;
     */
    /* JADX WARNING: Missing block: B:14:0x001b, code skipped:
            defpackage.amqw.b(r2, "Camera not stopped. State: %s", r1);
            b(1);
     */
    public final void a(int r12, int r13, int r14, int r15) {
        /*
        r11 = this;
        r0 = r11.n;
        monitor-enter(r0);
    L_0x0003:
        r1 = r11.h;	 Catch:{ all -> 0x0052 }
        r2 = 3;
        if (r1 != r2) goto L_0x000e;
    L_0x0008:
        r1 = r11.n;	 Catch:{ InterruptedException -> 0x0003 }
        r1.wait();	 Catch:{ InterruptedException -> 0x0003 }
        goto L_0x0003;
    L_0x000e:
        r1 = java.lang.Integer.toString(r1);	 Catch:{ all -> 0x0052 }
        r2 = r11.h;	 Catch:{ all -> 0x0052 }
        r3 = 1;
        r4 = 0;
        if (r2 != 0) goto L_0x001a;
    L_0x0018:
        r2 = 1;
        goto L_0x001b;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r5 = "Camera not stopped. State: %s";
        defpackage.amqw.b(r2, r5, r1);	 Catch:{ all -> 0x0052 }
        r11.b(r3);	 Catch:{ all -> 0x0052 }
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        r0 = r11.b;
        if (r0 != 0) goto L_0x002a;
    L_0x0028:
        r0 = 1;
        goto L_0x002b;
    L_0x002a:
        r0 = 0;
    L_0x002b:
        r1 = "Camera already exists.";
        defpackage.amqw.b(r0, r1);
        r0 = r11.m;
        if (r0 != 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0036;
    L_0x0035:
        r3 = 0;
    L_0x0036:
        r0 = "Camera task already exists.";
        defpackage.amqw.b(r3, r0);
        r11.g = r12;
        r0 = new zgq;
        r5 = r0;
        r6 = r11;
        r7 = r12;
        r8 = r13;
        r9 = r14;
        r10 = r15;
        r5.<init>(r6, r7, r8, r9, r10);
        r11.m = r0;
        r12 = r11.m;
        r13 = new java.lang.Void[r4];
        r12.execute(r13);
        return;
    L_0x0052:
        r12 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        goto L_0x0056;
    L_0x0055:
        throw r12;
    L_0x0056:
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgr.a(int, int, int, int):void");
    }

    /* JADX WARNING: Missing block: B:19:0x001c, code skipped:
            r0 = r3.m;
     */
    /* JADX WARNING: Missing block: B:20:0x001f, code skipped:
            if (r0 == null) goto L_0x0024;
     */
    /* JADX WARNING: Missing block: B:21:0x0021, code skipped:
            r0.cancel(false);
     */
    /* JADX WARNING: Missing block: B:22:0x0024, code skipped:
            e();
            r2 = r3.j;
     */
    /* JADX WARNING: Missing block: B:23:0x0029, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:25:?, code skipped:
            r0 = r3.b;
     */
    /* JADX WARNING: Missing block: B:26:0x002c, code skipped:
            if (r0 == null) goto L_0x0034;
     */
    /* JADX WARNING: Missing block: B:27:0x002e, code skipped:
            r0.release();
            r3.b = null;
     */
    /* JADX WARNING: Missing block: B:28:0x0034, code skipped:
            r3.l = defpackage.aocf.UNSET_ENUM_VALUE;
     */
    /* JADX WARNING: Missing block: B:29:0x0038, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:30:0x0039, code skipped:
            b(0);
            r0 = r3.i;
     */
    /* JADX WARNING: Missing block: B:31:0x003e, code skipped:
            if (r0 == null) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:32:0x0040, code skipped:
            r0.b();
     */
    /* JADX WARNING: Missing block: B:33:0x0043, code skipped:
            return;
     */
    public final void c() {
        /*
        r3 = this;
        r0 = r3.n;
        monitor-enter(r0);
        r1 = r3.h;	 Catch:{ all -> 0x0047 }
        r2 = 3;
        if (r1 != r2) goto L_0x0014;
    L_0x0008:
        r1 = r3.h;	 Catch:{ all -> 0x0047 }
        if (r1 != r2) goto L_0x0012;
    L_0x000c:
        r1 = r3.n;	 Catch:{ InterruptedException -> 0x0008 }
        r1.wait();	 Catch:{ InterruptedException -> 0x0008 }
        goto L_0x0008;
    L_0x0012:
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        return;
    L_0x0014:
        if (r1 != 0) goto L_0x0018;
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        return;
    L_0x0018:
        r3.b(r2);	 Catch:{ all -> 0x0047 }
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        r0 = r3.m;
        r1 = 0;
        if (r0 == 0) goto L_0x0024;
    L_0x0021:
        r0.cancel(r1);
    L_0x0024:
        r3.e();
        r2 = r3.j;
        monitor-enter(r2);
        r0 = r3.b;	 Catch:{ all -> 0x0044 }
        if (r0 == 0) goto L_0x0034;
    L_0x002e:
        r0.release();	 Catch:{ all -> 0x0044 }
        r0 = 0;
        r3.b = r0;	 Catch:{ all -> 0x0044 }
    L_0x0034:
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3.l = r0;	 Catch:{ all -> 0x0044 }
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        r3.b(r1);
        r0 = r3.i;
        if (r0 == 0) goto L_0x0043;
    L_0x0040:
        r0.b();
    L_0x0043:
        return;
    L_0x0044:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        throw r0;
    L_0x0047:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        goto L_0x004b;
    L_0x004a:
        throw r1;
    L_0x004b:
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgr.c():void");
    }

    public final void a(int i) {
        synchronized (this.j) {
            this.k = i;
            d();
        }
    }

    public final void a(SurfaceTexture surfaceTexture) {
        synchronized (this.j) {
            this.e = surfaceTexture;
            this.f = null;
            Camera camera = this.b;
            if (camera != null) {
                try {
                    camera.setPreviewTexture(surfaceTexture);
                } catch (IOException e) {
                    xtl.a("Error setting preview texture.", e);
                    b(4);
                    this.b.release();
                    this.b = null;
                }
            }
        }
    }

    public final void a(SurfaceHolder surfaceHolder) {
        synchronized (this.j) {
            this.f = surfaceHolder;
            this.e = null;
            Camera camera = this.b;
            if (camera != null) {
                try {
                    camera.setPreviewDisplay(surfaceHolder);
                } catch (IOException e) {
                    xtl.a("Error setting preview display.", e);
                    b(4);
                    this.b.release();
                    this.b = null;
                }
            }
        }
    }

    public final void d() {
        synchronized (this.j) {
            if (!(this.b == null || this.k == this.l)) {
                int i;
                CameraInfo cameraInfo = new CameraInfo();
                Camera.getCameraInfo(this.g, cameraInfo);
                this.c = cameraInfo.orientation;
                int i2 = cameraInfo.facing;
                i2 = this.k;
                if (cameraInfo.facing == 1) {
                    i = (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
                } else {
                    i = ((cameraInfo.orientation - i2) + 360) % 360;
                }
                this.d = i;
                this.b.setDisplayOrientation(i);
                this.l = this.k;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.n) {
            this.h = i;
            this.n.notifyAll();
        }
    }

    /* JADX WARNING: Missing block: B:12:?, code skipped:
            r4.m.get();
            r4.m = null;
     */
    /* JADX WARNING: Missing block: B:14:0x001a, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:16:0x0020, code skipped:
            throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Missing block: B:19:0x0023, code skipped:
            r4.m = null;
     */
    private final void e() {
        /*
        r4 = this;
    L_0x0000:
        r0 = r4.m;
        if (r0 == 0) goto L_0x0029;
    L_0x0004:
        r0 = r4.n;
        monitor-enter(r0);
        r1 = r4.h;	 Catch:{ all -> 0x0026 }
        r2 = 2;
        r3 = 0;
        if (r1 != r2) goto L_0x0011;
    L_0x000d:
        r4.m = r3;	 Catch:{ all -> 0x0026 }
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        return;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        r0 = r4.m;	 Catch:{ CancellationException -> 0x0023, InterruptedException -> 0x0021, ExecutionException -> 0x001a }
        r0.get();	 Catch:{ CancellationException -> 0x0023, InterruptedException -> 0x0021, ExecutionException -> 0x001a }
        r4.m = r3;	 Catch:{ CancellationException -> 0x0023, InterruptedException -> 0x0021, ExecutionException -> 0x001a }
        goto L_0x0000;
    L_0x001a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
        goto L_0x0000;
    L_0x0023:
        r4.m = r3;
        goto L_0x0000;
    L_0x0026:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        throw r1;
    L_0x0029:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgr.e():void");
    }

    static Size a(int i, int i2, List list) {
        Size size = null;
        int i3 = Integer.MAX_VALUE;
        for (Size size2 : list) {
            int i4 = size2.width - i;
            int i5 = size2.height - i2;
            if (i4 < 0) {
                i4 *= -4;
            }
            if (i5 < 0) {
                i5 *= -4;
            }
            i4 += i5;
            i5 = i4 < i3 ? i4 : i3;
            if (i4 < i3) {
                size = size2;
            }
            i3 = i5;
        }
        return size;
    }

    static int[] a(int i, List list) {
        int[] iArr = new int[]{i, i};
        int i2 = Integer.MAX_VALUE;
        for (int[] iArr2 : list) {
            int abs = Math.abs(iArr2[0]) + Math.abs(iArr2[1] - i);
            int i3 = abs < i2 ? abs : i2;
            if (abs < i2) {
                iArr = iArr2;
            }
            i2 = i3;
        }
        return iArr;
    }

    static String a(List list) {
        List asList = Arrays.asList(new String[]{"continuous-video", "continuous-picture", "edof"});
        int i = -1;
        for (String indexOf : list) {
            int indexOf2 = asList.indexOf(indexOf);
            if (indexOf2 >= 0) {
                if (i < 0 || indexOf2 < i) {
                    i = indexOf2;
                }
            }
        }
        return i >= 0 ? (String) asList.get(i) : null;
    }
}
