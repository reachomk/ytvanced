package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abyh */
public final class abyh implements abzy, Runnable {
    public final int a = Camera.getNumberOfCameras();
    public boolean b;
    public int c = 1;
    public abyk d;
    private final ExecutorService e;
    private final double f;
    private int g = 1;
    private int h = -1;
    private int i = -1;
    private Camera j;
    private SurfaceTexture k;
    private SurfaceTexture l;
    private int m;
    private boolean n;

    public abyh(double d) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new abym("Camera thread"));
        this.e = newSingleThreadExecutor;
        this.f = d;
    }

    public final int a() {
        try {
            CameraInfo cameraInfo = new CameraInfo();
            Camera.getCameraInfo(g(), cameraInfo);
            return cameraInfo.facing;
        } catch (Exception e) {
            xtl.a("Error obtaining camera info: ", e);
            return -1;
        }
    }

    public final synchronized void b() {
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = numberOfCameras - 1;
        CameraInfo cameraInfo = new CameraInfo();
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == 1) {
                i = i2;
                break;
            }
        }
        b(i);
    }

    public final synchronized void a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null) {
            this.k = null;
            this.l = null;
        } else if (this.k == null) {
            this.k = surfaceTexture;
            notifyAll();
        } else {
            this.l = surfaceTexture;
            this.e.submit(this);
        }
    }

    public final void c() {
        Future b;
        synchronized (this) {
            b = b(-1);
        }
        if (b != null) {
            try {
                b.get(30, TimeUnit.SECONDS);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                xtl.a("CameraVideoSource: ", e);
            }
        }
    }

    public final int d() {
        return this.g;
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return this.m;
    }

    /* JADX WARNING: Missing block: B:28:0x0064, code skipped:
            return -1.0f;
     */
    public final synchronized float a(float r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.j;	 Catch:{ all -> 0x006f }
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r0 == 0) goto L_0x006d;
    L_0x0007:
        r0 = r0.getParameters();	 Catch:{ Exception -> 0x0065 }
        r2 = r0.isZoomSupported();	 Catch:{ all -> 0x006f }
        if (r2 == 0) goto L_0x0063;
    L_0x0011:
        r8 = r8 + r1;
        r2 = java.lang.Math.abs(r8);	 Catch:{ all -> 0x006f }
        r3 = 981668463; // 0x3a83126f float:0.001 double:4.85008663E-315;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 < 0) goto L_0x0063;
    L_0x001d:
        r2 = r0.getZoom();	 Catch:{ all -> 0x006f }
        r3 = r0.getMaxZoom();	 Catch:{ all -> 0x006f }
        r4 = 1;
        r3 = java.lang.Math.max(r3, r4);	 Catch:{ all -> 0x006f }
        r4 = (float) r3;	 Catch:{ all -> 0x006f }
        r8 = r8 * r4;
        r5 = java.lang.Math.abs(r8);	 Catch:{ all -> 0x006f }
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x0041;
    L_0x0037:
        r5 = 0;
        r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r8 <= 0) goto L_0x003f;
    L_0x003c:
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0041;
    L_0x003f:
        r8 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x0041:
        r1 = 0;
        r2 = (float) r2;	 Catch:{ all -> 0x006f }
        r2 = r2 + r8;
        r8 = java.lang.Math.round(r2);	 Catch:{ all -> 0x006f }
        r8 = java.lang.Math.min(r3, r8);	 Catch:{ all -> 0x006f }
        r8 = java.lang.Math.max(r1, r8);	 Catch:{ all -> 0x006f }
        r0.setZoom(r8);	 Catch:{ all -> 0x006f }
        r1 = r7.j;	 Catch:{ Exception -> 0x0059 }
        r1.setParameters(r0);	 Catch:{ Exception -> 0x0059 }
        goto L_0x005f;
    L_0x0059:
        r0 = move-exception;
        r1 = "Error while setting camera parameters.";
        defpackage.xtl.b(r1, r0);	 Catch:{ all -> 0x006f }
    L_0x005f:
        r8 = (float) r8;
        r8 = r8 / r4;
        monitor-exit(r7);
        return r8;
    L_0x0063:
        monitor-exit(r7);
        return r1;
    L_0x0065:
        r8 = move-exception;
        r0 = "Error while getting camera parameters.";
        defpackage.xtl.b(r0, r8);	 Catch:{ all -> 0x006f }
        monitor-exit(r7);
        return r1;
    L_0x006d:
        monitor-exit(r7);
        return r1;
    L_0x006f:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyh.a(float):float");
    }

    /* JADX WARNING: Missing block: B:27:0x00e4, code skipped:
            return;
     */
    public final synchronized void a(float r5, float r6, int r7, defpackage.abyo r8) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.j;	 Catch:{ all -> 0x010f }
        if (r0 == 0) goto L_0x010d;
    L_0x0005:
        r0 = r0.getParameters();	 Catch:{ Exception -> 0x0105 }
        r1 = r4.j;	 Catch:{ RuntimeException -> 0x00e5 }
        r1.cancelAutoFocus();	 Catch:{ RuntimeException -> 0x00e5 }
        r1 = r0.getMaxNumFocusAreas();	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = 800; // 0x320 float:1.121E-42 double:3.953E-321;
        if (r1 <= 0) goto L_0x0028;
    L_0x0016:
        r1 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r1 = r4.a(r5, r6, r7, r1);	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = new android.hardware.Camera$Area;	 Catch:{ RuntimeException -> 0x00e5 }
        r3.<init>(r1, r2);	 Catch:{ RuntimeException -> 0x00e5 }
        r1 = defpackage.amul.a(r3);	 Catch:{ RuntimeException -> 0x00e5 }
        r0.setFocusAreas(r1);	 Catch:{ RuntimeException -> 0x00e5 }
    L_0x0028:
        r1 = r0.getMaxNumMeteringAreas();	 Catch:{ RuntimeException -> 0x00e5 }
        if (r1 <= 0) goto L_0x0040;
    L_0x002e:
        r1 = 1133903872; // 0x43960000 float:300.0 double:5.60222949E-315;
        r7 = r4.a(r5, r6, r7, r1);	 Catch:{ RuntimeException -> 0x00e5 }
        r1 = new android.hardware.Camera$Area;	 Catch:{ RuntimeException -> 0x00e5 }
        r1.<init>(r7, r2);	 Catch:{ RuntimeException -> 0x00e5 }
        r7 = defpackage.amul.a(r1);	 Catch:{ RuntimeException -> 0x00e5 }
        r0.setMeteringAreas(r7);	 Catch:{ RuntimeException -> 0x00e5 }
    L_0x0040:
        r7 = r0.getMaxNumFocusAreas();	 Catch:{ RuntimeException -> 0x00e5 }
        if (r7 <= 0) goto L_0x0047;
    L_0x0046:
        goto L_0x004f;
    L_0x0047:
        r7 = r0.getMaxNumMeteringAreas();	 Catch:{ RuntimeException -> 0x00e5 }
        if (r7 > 0) goto L_0x004f;
    L_0x004d:
        monitor-exit(r4);
        return;
    L_0x004f:
        r5 = (int) r5;
        r6 = (int) r6;
        r8 = (defpackage.acni) r8;	 Catch:{ RuntimeException -> 0x00e5 }
        r7 = r8.a;	 Catch:{ RuntimeException -> 0x00e5 }
        r8 = r7.M_();	 Catch:{ RuntimeException -> 0x00e5 }
        r1 = 2131099707; // 0x7f06003b float:1.7811775E38 double:1.052903153E-314;
        r8 = android.view.animation.AnimationUtils.loadAnimation(r8, r1);	 Catch:{ RuntimeException -> 0x00e5 }
        r1 = r7.M_();	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = 2131099708; // 0x7f06003c float:1.7811777E38 double:1.0529031536E-314;
        r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r2);	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = r7.aD;	 Catch:{ RuntimeException -> 0x00e5 }
        r2.setAnimation(r8);	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = r7.aE;	 Catch:{ RuntimeException -> 0x00e5 }
        r2.setAnimation(r1);	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = r7.aE;	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = r2.getLayoutParams();	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = (defpackage.auy) r2;	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r7.aE;	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r3.getWidth();	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r3 / 2;
        r3 = r5 - r3;
        r2.setMarginStart(r3);	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r7.aE;	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r3.getHeight();	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r3 / 2;
        r3 = r6 - r3;
        r2.topMargin = r3;	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r7.aE;	 Catch:{ RuntimeException -> 0x00e5 }
        r3.setLayoutParams(r2);	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = r7.aD;	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = r2.getLayoutParams();	 Catch:{ RuntimeException -> 0x00e5 }
        r2 = (defpackage.auy) r2;	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r7.aD;	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r3.getWidth();	 Catch:{ RuntimeException -> 0x00e5 }
        r3 = r3 / 2;
        r5 = r5 - r3;
        r2.setMarginStart(r5);	 Catch:{ RuntimeException -> 0x00e5 }
        r5 = r7.aD;	 Catch:{ RuntimeException -> 0x00e5 }
        r5 = r5.getHeight();	 Catch:{ RuntimeException -> 0x00e5 }
        r5 = r5 / 2;
        r6 = r6 - r5;
        r2.topMargin = r6;	 Catch:{ RuntimeException -> 0x00e5 }
        r5 = r7.aD;	 Catch:{ RuntimeException -> 0x00e5 }
        r5.setLayoutParams(r2);	 Catch:{ RuntimeException -> 0x00e5 }
        r8.start();	 Catch:{ RuntimeException -> 0x00e5 }
        r1.start();	 Catch:{ RuntimeException -> 0x00e5 }
        r5 = r0.getSupportedFocusModes();	 Catch:{ RuntimeException -> 0x00e5 }
        r6 = "auto";
        r5 = r5.contains(r6);	 Catch:{ RuntimeException -> 0x00e5 }
        if (r5 != 0) goto L_0x00d2;
    L_0x00d1:
        goto L_0x00e3;
    L_0x00d2:
        r5 = "auto";
        r0.setFocusMode(r5);	 Catch:{ RuntimeException -> 0x00e5 }
        r5 = r4.j;	 Catch:{ RuntimeException -> 0x00e5 }
        r5.setParameters(r0);	 Catch:{ RuntimeException -> 0x00e5 }
        r5 = r4.j;	 Catch:{ RuntimeException -> 0x00e5 }
        r6 = defpackage.abyg.a;	 Catch:{ RuntimeException -> 0x00e5 }
        r5.autoFocus(r6);	 Catch:{ RuntimeException -> 0x00e5 }
    L_0x00e3:
        monitor-exit(r4);
        return;
    L_0x00e5:
        r5 = move-exception;
        r5 = r5.getMessage();	 Catch:{ all -> 0x010f }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x010f }
        r6 = "Error setting camera parameters ";
        r7 = r5.length();	 Catch:{ all -> 0x010f }
        if (r7 != 0) goto L_0x00fc;
    L_0x00f6:
        r5 = new java.lang.String;	 Catch:{ all -> 0x010f }
        r5.<init>(r6);	 Catch:{ all -> 0x010f }
        goto L_0x0100;
    L_0x00fc:
        r5 = r6.concat(r5);	 Catch:{ all -> 0x010f }
    L_0x0100:
        defpackage.xtl.c(r5);	 Catch:{ all -> 0x010f }
        monitor-exit(r4);
        return;
    L_0x0105:
        r5 = move-exception;
        r6 = "Error while getting camera parameters.";
        defpackage.xtl.a(r6, r5);	 Catch:{ all -> 0x010f }
        monitor-exit(r4);
        return;
    L_0x010d:
        monitor-exit(r4);
        return;
    L_0x010f:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyh.a(float, float, int, abyo):void");
    }

    private final Rect a(float f, float f2, int i, float f3) {
        double d;
        int i2;
        double d2;
        int i3;
        i = (i - this.m) % 360;
        if (i < 0) {
            i += 360;
        }
        if (i != 90) {
            if (i == 180) {
                f = ((float) this.g) - f;
                f2 = ((float) this.c) - f2;
            } else if (i == 270) {
                f = ((float) this.c) - f;
            }
            d = (double) ((f / ((float) this.g)) * 2000.0f);
            Double.isNaN(d);
            i2 = (int) (d - 0.00408935546875d);
            d2 = (double) ((f2 / ((float) this.c)) * 2000.0f);
            Double.isNaN(d2);
            i3 = (int) (d2 - 0.00408935546875d);
            i = (int) (f3 / 2.0f);
            return new Rect(Math.min(Math.max(-1000, i2 - i), 1000), Math.min(Math.max(-1000, i3 - i), 1000), Math.min(Math.max(-1000, i2 + i), 1000), Math.min(Math.max(-1000, i3 + i), 1000));
        }
        f2 = ((float) this.g) - f2;
        float f4 = f2;
        f2 = f;
        f = f4;
        d = (double) ((f / ((float) this.g)) * 2000.0f);
        Double.isNaN(d);
        i2 = (int) (d - 0.00408935546875d);
        d2 = (double) ((f2 / ((float) this.c)) * 2000.0f);
        Double.isNaN(d2);
        i3 = (int) (d2 - 0.00408935546875d);
        i = (int) (f3 / 2.0f);
        return new Rect(Math.min(Math.max(-1000, i2 - i), 1000), Math.min(Math.max(-1000, i3 - i), 1000), Math.min(Math.max(-1000, i2 + i), 1000), Math.min(Math.max(-1000, i3 + i), 1000));
    }

    /* JADX WARNING: Missing block: B:17:0x0026, code skipped:
            return false;
     */
    public final synchronized boolean a(java.lang.String r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.j;	 Catch:{ all -> 0x0027 }
        r1 = 0;
        if (r0 == 0) goto L_0x0025;
    L_0x0006:
        r0 = r2.b(r3);	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x0025;
    L_0x000c:
        r0 = r2.j;	 Catch:{ Exception -> 0x001d }
        r0 = r0.getParameters();	 Catch:{ Exception -> 0x001d }
        r0.setFlashMode(r3);	 Catch:{ Exception -> 0x001d }
        r3 = r2.j;	 Catch:{ Exception -> 0x001d }
        r3.setParameters(r0);	 Catch:{ Exception -> 0x001d }
        r3 = 1;
        monitor-exit(r2);
        return r3;
    L_0x001d:
        r3 = move-exception;
        r0 = "Error while setting camera flash light mode";
        defpackage.xtl.b(r0, r3);	 Catch:{ all -> 0x0027 }
        monitor-exit(r2);
        return r1;
    L_0x0025:
        monitor-exit(r2);
        return r1;
    L_0x0027:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyh.a(java.lang.String):boolean");
    }

    public final boolean b(String str) {
        Camera camera = this.j;
        if (camera != null) {
            try {
                Parameters parameters = camera.getParameters();
                List supportedFlashModes = parameters.getSupportedFlashModes();
                if (parameters.getFlashMode() == null || supportedFlashModes == null || !supportedFlashModes.contains(str)) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                xtl.b("Error while getting camera parameters.", e);
            }
        }
        return false;
    }

    private final Future b(int i) {
        boolean z = true;
        amqw.a(i >= -1);
        if (i >= this.a) {
            z = false;
        }
        amqw.a(z);
        this.i = i;
        notifyAll();
        return this.e.submit(this);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0168 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:65|66) */
    /* JADX WARNING: Missing block: B:66:?, code skipped:
            defpackage.xtl.d("CameraVideoSource: Interrupted while waiting for SurfaceTexture");
     */
    public final void run() {
        /*
        r17 = this;
        r1 = r17;
        r0 = r1.l;
        if (r0 == 0) goto L_0x0028;
    L_0x0006:
        r2 = r1.k;
        if (r0 == r2) goto L_0x0028;
    L_0x000a:
        r0 = r1.j;
        if (r0 == 0) goto L_0x0021;
    L_0x000e:
        r2 = r1.n;
        if (r2 == 0) goto L_0x0021;
    L_0x0012:
        r0.stopPreview();	 Catch:{ IOException -> 0x0021 }
        r0 = r1.j;	 Catch:{ IOException -> 0x0021 }
        r2 = r1.l;	 Catch:{ IOException -> 0x0021 }
        r0.setPreviewTexture(r2);	 Catch:{ IOException -> 0x0021 }
        r0 = r1.j;	 Catch:{ IOException -> 0x0021 }
        r0.startPreview();	 Catch:{ IOException -> 0x0021 }
    L_0x0021:
        r0 = r1.l;
        r1.k = r0;
        r0 = 0;
        r1.l = r0;
    L_0x0028:
        r0 = r1.i;
        r2 = r1.h;
        if (r0 == r2) goto L_0x01a8;
    L_0x002e:
        r17.i();
        r0 = r1.i;
        r2 = -1;
        if (r0 == r2) goto L_0x01a8;
    L_0x0036:
        monitor-enter(r17);	 Catch:{ Exception -> 0x019f }
        r2 = r1.c(r0);	 Catch:{ all -> 0x019c }
        r1.j = r2;	 Catch:{ all -> 0x019c }
        r2 = new android.hardware.Camera$CameraInfo;	 Catch:{ all -> 0x019c }
        r2.<init>();	 Catch:{ all -> 0x019c }
        android.hardware.Camera.getCameraInfo(r0, r2);	 Catch:{ all -> 0x019c }
        r3 = r2.canDisableShutterSound;	 Catch:{ all -> 0x019c }
        r1.b = r3;	 Catch:{ all -> 0x019c }
        r3 = r1.j;	 Catch:{ all -> 0x019c }
        r4 = r2.orientation;	 Catch:{ all -> 0x019c }
        r1.m = r4;	 Catch:{ all -> 0x019c }
        r4 = r2.facing;	 Catch:{ all -> 0x019c }
        r5 = 1;
        if (r4 != r5) goto L_0x005e;
    L_0x0054:
        r4 = r2.orientation;	 Catch:{ all -> 0x019c }
        r4 = 360 - r4;
        r4 = r4 % 360;
        r3.setDisplayOrientation(r4);	 Catch:{ all -> 0x019c }
        goto L_0x0063;
    L_0x005e:
        r4 = r2.orientation;	 Catch:{ all -> 0x019c }
        r3.setDisplayOrientation(r4);	 Catch:{ all -> 0x019c }
    L_0x0063:
        r2 = r2.facing;	 Catch:{ all -> 0x019c }
        r3 = 0;
        if (r2 != r5) goto L_0x006a;
    L_0x0068:
        r2 = 1;
        goto L_0x006b;
    L_0x006a:
        r2 = 0;
    L_0x006b:
        r4 = r1.j;	 Catch:{ all -> 0x019c }
        r4 = r4.getParameters();	 Catch:{ all -> 0x019c }
        r6 = r1.f;	 Catch:{ all -> 0x019c }
        r8 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r6 = r6 * r8;
        r6 = (int) r6;	 Catch:{ all -> 0x019c }
        r7 = r4.getSupportedPreviewSizes();	 Catch:{ all -> 0x019c }
        r10 = r4.getPreferredPreviewSizeForVideo();	 Catch:{ all -> 0x019c }
        if (r10 == 0) goto L_0x0096;
    L_0x0085:
        r10 = r4.getPreferredPreviewSizeForVideo();	 Catch:{ all -> 0x019c }
        r10 = r10.width;	 Catch:{ all -> 0x019c }
        r10 = (long) r10;	 Catch:{ all -> 0x019c }
        r12 = r4.getPreferredPreviewSizeForVideo();	 Catch:{ all -> 0x019c }
        r12 = r12.height;	 Catch:{ all -> 0x019c }
        r12 = (long) r12;	 Catch:{ all -> 0x019c }
        r10 = r10 * r12;
        goto L_0x0098;
    L_0x0096:
        r10 = -1;
    L_0x0098:
        r12 = r7.iterator();	 Catch:{ all -> 0x019c }
    L_0x009c:
        r13 = r12.hasNext();	 Catch:{ all -> 0x019c }
        if (r13 == 0) goto L_0x00bd;
    L_0x00a2:
        r13 = r12.next();	 Catch:{ all -> 0x019c }
        r13 = (android.hardware.Camera.Size) r13;	 Catch:{ all -> 0x019c }
        r14 = 0;
        r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r16 <= 0) goto L_0x009c;
    L_0x00ae:
        r14 = r13.width;	 Catch:{ all -> 0x019c }
        r13 = r13.height;	 Catch:{ all -> 0x019c }
        r14 = r14 * r13;
        r13 = (long) r14;	 Catch:{ all -> 0x019c }
        r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1));
        if (r15 <= 0) goto L_0x009c;
    L_0x00b9:
        r12.remove();	 Catch:{ all -> 0x019c }
        goto L_0x009c;
    L_0x00bd:
        r10 = new abyj;	 Catch:{ all -> 0x019c }
        r10.<init>(r6);	 Catch:{ all -> 0x019c }
        r6 = java.util.Collections.min(r7, r10);	 Catch:{ all -> 0x019c }
        r6 = (android.hardware.Camera.Size) r6;	 Catch:{ all -> 0x019c }
        r7 = r6.width;	 Catch:{ all -> 0x019c }
        r7 = r6.height;	 Catch:{ all -> 0x019c }
        r7 = r6.width;	 Catch:{ all -> 0x019c }
        r10 = r6.height;	 Catch:{ all -> 0x019c }
        r4.setPreviewSize(r7, r10);	 Catch:{ all -> 0x019c }
        r7 = r6.width;	 Catch:{ all -> 0x019c }
        r10 = (double) r7;	 Catch:{ all -> 0x019c }
        r7 = r6.height;	 Catch:{ all -> 0x019c }
        r12 = (double) r7;
        java.lang.Double.isNaN(r10);
        java.lang.Double.isNaN(r12);
        r10 = r10 / r12;
        r10 = r10 * r8;
        r7 = (int) r10;
        r8 = r4.getSupportedPictureSizes();	 Catch:{ all -> 0x019c }
        r9 = new abyi;	 Catch:{ all -> 0x019c }
        r9.<init>(r7);	 Catch:{ all -> 0x019c }
        r7 = java.util.Collections.min(r8, r9);	 Catch:{ all -> 0x019c }
        r7 = (android.hardware.Camera.Size) r7;	 Catch:{ all -> 0x019c }
        r8 = r4.getPictureSize();	 Catch:{ all -> 0x019c }
        if (r8 == 0) goto L_0x0109;
    L_0x00f8:
        r8 = r8.equals(r7);	 Catch:{ all -> 0x019c }
        if (r8 != 0) goto L_0x0109;
    L_0x00fe:
        r8 = r7.width;	 Catch:{ all -> 0x019c }
        r9 = r7.height;	 Catch:{ all -> 0x019c }
        r4.setPictureSize(r8, r9);	 Catch:{ all -> 0x019c }
        r8 = r7.width;	 Catch:{ all -> 0x019c }
        r7 = r7.height;	 Catch:{ all -> 0x019c }
    L_0x0109:
        r7 = r6.width;	 Catch:{ all -> 0x019c }
        r1.g = r7;	 Catch:{ all -> 0x019c }
        r6 = r6.height;	 Catch:{ all -> 0x019c }
        r1.c = r6;	 Catch:{ all -> 0x019c }
        r6 = r4.getSupportedPreviewFpsRange();	 Catch:{ all -> 0x019c }
        r7 = 2;
        r7 = new int[r7];	 Catch:{ all -> 0x019c }
        r8 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r7[r3] = r8;	 Catch:{ all -> 0x019c }
        r7[r5] = r8;	 Catch:{ all -> 0x019c }
        r6 = r6.iterator();	 Catch:{ all -> 0x019c }
        r8 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x0125:
        r9 = r6.hasNext();	 Catch:{ all -> 0x019c }
        if (r9 == 0) goto L_0x014a;
    L_0x012b:
        r9 = r6.next();	 Catch:{ all -> 0x019c }
        r9 = (int[]) r9;	 Catch:{ all -> 0x019c }
        r10 = r9[r3];	 Catch:{ all -> 0x019c }
        r10 = java.lang.Math.abs(r10);	 Catch:{ all -> 0x019c }
        r11 = r9[r5];	 Catch:{ all -> 0x019c }
        r11 = r11 + -30000;
        r11 = java.lang.Math.abs(r11);	 Catch:{ all -> 0x019c }
        r10 = r10 + r11;
        if (r10 >= r8) goto L_0x0144;
    L_0x0142:
        r11 = r10;
        goto L_0x0145;
    L_0x0144:
        r11 = r8;
    L_0x0145:
        if (r10 >= r8) goto L_0x0148;
    L_0x0147:
        r7 = r9;
    L_0x0148:
        r8 = r11;
        goto L_0x0125;
    L_0x014a:
        r3 = r7[r3];	 Catch:{ all -> 0x019c }
        r6 = r7[r5];	 Catch:{ all -> 0x019c }
        r4.setPreviewFpsRange(r3, r6);	 Catch:{ all -> 0x019c }
        defpackage.abyh.a(r4);	 Catch:{ all -> 0x019c }
        r4.setRecordingHint(r5);	 Catch:{ all -> 0x019c }
        r3 = r1.j;	 Catch:{ all -> 0x019c }
        r3.setParameters(r4);	 Catch:{ all -> 0x019c }
    L_0x015c:
        r3 = r1.k;	 Catch:{ all -> 0x019c }
        if (r3 != 0) goto L_0x016d;
    L_0x0160:
        r3 = r1.i;	 Catch:{ all -> 0x019c }
        if (r0 != r3) goto L_0x016d;
    L_0x0164:
        r17.wait();	 Catch:{ InterruptedException -> 0x0168 }
        goto L_0x015c;
    L_0x0168:
        r3 = "CameraVideoSource: Interrupted while waiting for SurfaceTexture";
        defpackage.xtl.d(r3);	 Catch:{ all -> 0x019c }
    L_0x016d:
        r3 = r1.i;	 Catch:{ all -> 0x019c }
        if (r0 != r3) goto L_0x0194;
    L_0x0171:
        r3 = r1.k;	 Catch:{ all -> 0x019c }
        if (r3 == 0) goto L_0x018c;
    L_0x0175:
        r4 = r1.j;	 Catch:{ all -> 0x019c }
        r4.setPreviewTexture(r3);	 Catch:{ all -> 0x019c }
        monitor-exit(r17);	 Catch:{ all -> 0x019c }
        r3 = r1.j;	 Catch:{ Exception -> 0x019f }
        r3.startPreview();	 Catch:{ Exception -> 0x019f }
        r1.n = r5;	 Catch:{ Exception -> 0x019f }
        r1.h = r0;	 Catch:{ Exception -> 0x019f }
        r0 = r1.d;	 Catch:{ Exception -> 0x019f }
        if (r0 == 0) goto L_0x01a8;
    L_0x0188:
        r0.a(r2);	 Catch:{ Exception -> 0x019f }
        goto L_0x01a8;
    L_0x018c:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x019c }
        r2 = "Camera currentSurfaceTexture is null";
        r0.<init>(r2);	 Catch:{ all -> 0x019c }
        throw r0;	 Catch:{ all -> 0x019c }
    L_0x0194:
        r0 = new abyl;	 Catch:{ all -> 0x019c }
        r2 = "Camera changed while opening";
        r0.<init>(r2);	 Catch:{ all -> 0x019c }
        throw r0;	 Catch:{ all -> 0x019c }
    L_0x019c:
        r0 = move-exception;
        monitor-exit(r17);	 Catch:{ all -> 0x019c }
        throw r0;	 Catch:{ Exception -> 0x019f }
    L_0x019f:
        r0 = move-exception;
        r2 = "Error initializing camera preview";
        defpackage.xtl.a(r2, r0);
        r17.i();
    L_0x01a8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abyh.run():void");
    }

    public final synchronized void a(int i) {
        b(i);
    }

    public final synchronized int g() {
        return this.i;
    }

    public final synchronized void h() {
        b((this.i + 1) % this.a);
    }

    private final synchronized Camera c(int i) {
        Camera camera;
        if (Camera.getNumberOfCameras() != 0) {
            camera = null;
            int i2 = 2;
            while (camera == null && this.i == i && i2 >= 0) {
                try {
                    camera = Camera.open(i);
                } catch (InterruptedException e) {
                    throw new abyn(e);
                } catch (RuntimeException e2) {
                    if (i2 > 0) {
                        wait(500);
                    } else {
                        throw new abyn(e2);
                    }
                }
                i2--;
            }
            if (camera == null) {
                throw new abyn(new Throwable("Interrupted with a camera change"));
            }
        } else {
            throw new abyp();
        }
        return camera;
    }

    private final void i() {
        Camera camera;
        synchronized (this) {
            camera = this.j;
            this.j = null;
        }
        if (camera != null) {
            if (this.n) {
                camera.stopPreview();
            }
            camera.release();
        }
        this.n = false;
        this.h = -1;
    }

    public static void a(Parameters parameters) {
        List supportedFocusModes = parameters.getSupportedFocusModes();
        String str = "continuous-video";
        if (supportedFocusModes.contains(str)) {
            parameters.setFocusMode(str);
        } else {
            str = "continuous-picture";
            if (supportedFocusModes.contains(str)) {
                parameters.setFocusMode(str);
            } else {
                str = "edof";
                if (supportedFocusModes.contains(str)) {
                    parameters.setFocusMode(str);
                } else {
                    str = "infinity";
                    if (supportedFocusModes.contains(str)) {
                        parameters.setFocusMode(str);
                    }
                }
            }
        }
        String valueOf = String.valueOf(parameters.getFocusMode());
        String str2 = "Focus mode: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            str2.concat(valueOf);
        }
    }
}
