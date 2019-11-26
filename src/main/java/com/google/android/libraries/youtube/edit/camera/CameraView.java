package com.google.android.libraries.youtube.edit.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.CamcorderProfile;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.youtube.R;
import defpackage.amqw;
import defpackage.aoqz;
import defpackage.xtl;
import defpackage.zgn;
import defpackage.zgr;
import defpackage.zgs;
import defpackage.zgt;
import defpackage.zgz;
import defpackage.zhd;
import defpackage.zhe;
import defpackage.zhg;
import defpackage.zhk;
import defpackage.zhl;
import defpackage.zhm;
import defpackage.zho;
import defpackage.zik;
import defpackage.zit;
import defpackage.ziu;
import defpackage.zld;
import defpackage.zmg;
import defpackage.zmm;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import javax.microedition.khronos.opengles.GL10;

public class CameraView extends FrameLayout implements OnFrameAvailableListener, Renderer, zgt, zmg {
    private int A = 6;
    public ziu a;
    public SurfaceTexture b;
    public int c;
    public boolean d = false;
    public boolean e;
    public zgr f;
    public zgz g;
    public final Object h = new Object();
    public zmm i;
    public zld j;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = 5000000;
    public volatile boolean o;
    public final Object p = new Object();
    public aoqz q;
    public zgs r;
    public final Set s = Collections.newSetFromMap(new WeakHashMap());
    public boolean t = false;
    private final View u;
    private final GLSurfaceView v;
    private int w;
    private int x;
    private int y = 30;
    private zhk z;

    public CameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.camera_view, this, true);
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("youtube", 0);
        if (sharedPreferences != null) {
            this.r = new zgs(sharedPreferences);
        }
        int[] a = zgr.a();
        boolean z = a[0] >= 0 || a[1] >= 0;
        amqw.b(z);
        int i = a[0];
        this.l = i;
        this.m = a[1];
        if (i >= 0 && this.r.a.getInt("camera_facing", 0) == 0) {
            this.k = this.l;
        } else {
            this.k = this.m;
        }
        this.f = new zgr();
        this.f.i = this;
        this.v = (GLSurfaceView) findViewById(R.id.camera_preview);
        this.v.setEGLContextClientVersion(2);
        this.v.setRenderer(this);
        this.v.setRenderMode(0);
        this.u = findViewById(R.id.camera_front_flash_torch_scrim);
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        zho zho = new zho(super.onSaveInstanceState());
        zho.a = this.d;
        zho.b = this.y;
        zho.c = this.n;
        return zho;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof zho) {
            zho zho = (zho) parcelable;
            super.onRestoreInstanceState(zho.getSuperState());
            this.d = zho.a;
            this.y = zho.b;
            this.n = zho.c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final void a(zhk zhk) {
        if (this.z == null) {
            this.z = (zhk) amqw.a((Object) zhk);
        }
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.v.setOnTouchListener(onTouchListener);
    }

    public final void a(zhm zhm) {
        this.s.add(zhm);
    }

    public final void a(int i) {
        amqw.b(this.f.b() == null);
        this.A = i;
    }

    public final void b(int i) {
        this.f.a(i);
    }

    public final boolean a() {
        zgz zgz = this.g;
        return zgz != null && zgz.r;
    }

    public final boolean c() {
        zgz zgz = this.g;
        return (zgz == null || zgz.r) ? false : true;
    }

    public final boolean d() {
        if (this.f.b() == null) {
            return false;
        }
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(this.k, cameraInfo);
        return cameraInfo.canDisableShutterSound ^ 1;
    }

    public final boolean e() {
        Camera b = this.f.b();
        if (b == null) {
            return false;
        }
        if (b(b, "torch") || this.k == this.m) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z = true;
        if (this.l < 0 || this.m < 0) {
            z = false;
        } else {
            zgz zgz = this.g;
            if (zgz == null || !zgz.r) {
                return z;
            }
            return false;
        }
        return z;
    }

    public final int g() {
        return this.k == this.m ? 1 : 0;
    }

    public final zhl h() {
        Camera b = this.f.b();
        if (b == null) {
            return null;
        }
        Size previewSize = b.getParameters().getPreviewSize();
        zhl zhl = new zhl();
        zhl.b = previewSize.height;
        zhl.a = previewSize.width;
        return zhl;
    }

    public final boolean a(boolean z) {
        if (z == this.d) {
            return true;
        }
        if (z && a(this.f.b(), "torch")) {
            this.d = true;
            return true;
        } else if (z || !a(this.f.b(), "off")) {
            return false;
        } else {
            this.d = false;
            return true;
        }
    }

    public final void i() {
        CamcorderProfile a = zgn.a(this.k, 20, this.A);
        if (a == null) {
            xtl.c("Failed to determine camera profile.");
        } else {
            this.f.a(this.k, a.videoFrameWidth, a.videoFrameHeight, Math.min(a.videoFrameRate, this.y));
        }
    }

    public final void a(zik zik, int i) {
        this.w = 0;
        this.x = 0;
        if (!c()) {
            xtl.c("Camera is not ready for recording.");
        } else if (this.f.b() == null) {
            xtl.c("Camera not active.");
        } else {
            CamcorderProfile c = c(false);
            if (c == null) {
                xtl.c("Couldn't find camcorder profile.");
                return;
            }
            zld zld = this.j;
            if (zld != null) {
                zld.a(false);
            }
            zgz zgz = this.g;
            int i2 = this.f.c;
            int i3 = c.videoFrameWidth;
            int i4 = c.videoFrameHeight;
            int min = Math.min(c.videoFrameRate, this.y);
            int i5 = c.audioChannels;
            zgz.j = i2;
            zgz.k = i;
            zgz.l = i3;
            zgz.m = i4;
            zgz.n = (float) min;
            zgz.o = Math.min(2, Math.max(1, i5));
            zgz.c = (zik) amqw.a((Object) zik);
            zgz.w = null;
            zgz.r = true;
            zgz.u = 0;
            zgz.v = 0;
            zgz.p = new Thread(zgz, "editRecordVideo");
            zgz.p.start();
            k();
            for (zhm Z : this.s) {
                Z.Z();
            }
        }
    }

    public final zit j() {
        if (!a()) {
            return null;
        }
        zit a = this.g.a();
        b(false);
        return a;
    }

    public final void b(boolean z) {
        this.u.setVisibility(8);
        for (zhm zhm : this.s) {
            zhm.ah();
            zhm.aj();
        }
        zld zld = this.j;
    }

    public final void k() {
        Camera b = this.f.b();
        if (b != null && this.d && this.k == this.m && !b(b, "torch")) {
            this.u.setVisibility(0);
            for (zhm ai : this.s) {
                ai.ai();
            }
        }
    }

    public final void a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.v.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.v.setLayoutParams(layoutParams);
        layoutParams = (LayoutParams) this.u.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.u.setLayoutParams(layoutParams);
    }

    public final void a(Camera camera) {
        if (this.j != null) {
            o();
        }
        post(new zhe(this, camera));
    }

    public final void b() {
        post(new zhd(this));
    }

    public final void l() {
        zld zld = this.j;
        if (zld != null) {
            zld.i();
            this.j.j();
            this.j = null;
        }
    }

    private final CamcorderProfile c(boolean z) {
        if (z) {
            int i = this.l;
            if (i >= 0 && this.m >= 0) {
                CamcorderProfile a = zgn.a(i, 20, this.A);
                CamcorderProfile a2 = zgn.a(this.m, 20, this.A);
                int i2 = a.videoFrameWidth * a.videoFrameHeight;
                int i3 = a2.videoFrameWidth * a2.videoFrameHeight;
                if ((a.videoFrameRate < 20 || a2.videoFrameRate >= 20) && ((a2.videoFrameRate >= 20 && a.videoFrameRate < 20) || i2 < i3)) {
                    a = a2;
                }
                return a;
            }
        }
        return zgn.a(this.k, 20, this.A);
    }

    public final void m() {
        zgz zgz = this.g;
        if (zgz != null) {
            if (zgz.r) {
                j();
            }
            this.g = null;
        }
        synchronized (this.p) {
            this.o = true;
        }
        this.f.b();
        this.v.queueEvent(new zhg(this));
        this.v.onPause();
    }

    public final void n() {
        c(g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0012 A:{LOOP_START, SYNTHETIC, LOOP:0: B:7:0x0012->B:27:0x0012} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void c(int r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = 1;
        if (r5 != r1) goto L_0x0006;
    L_0x0004:
        r2 = 1;
        goto L_0x000a;
    L_0x0006:
        if (r5 != 0) goto L_0x0009;
    L_0x0008:
        goto L_0x0004;
    L_0x0009:
        r2 = 0;
    L_0x000a:
        r3 = "cameraDirection must be one of @CameraDirection values; was %s.";
        defpackage.amqw.a(r2, r3, r5);
        r2 = r4.p;
        monitor-enter(r2);
    L_0x0012:
        r3 = r4.o;	 Catch:{ all -> 0x003a }
        if (r3 == 0) goto L_0x001c;
    L_0x0016:
        r3 = r4.p;	 Catch:{ InterruptedException -> 0x0012 }
        r3.wait();	 Catch:{ InterruptedException -> 0x0012 }
        goto L_0x0012;
    L_0x001c:
        monitor-exit(r2);	 Catch:{ all -> 0x003a }
        if (r5 == r1) goto L_0x0022;
    L_0x001f:
        r5 = r4.l;
        goto L_0x0024;
    L_0x0022:
        r5 = r4.m;
    L_0x0024:
        r4.k = r5;
        r2 = r4.r;
        r3 = r4.l;
        if (r5 != r3) goto L_0x002d;
    L_0x002c:
        goto L_0x002e;
    L_0x002d:
        r0 = 1;
    L_0x002e:
        r2.a(r0);
        r4.i();
        r5 = r4.v;
        r5.onResume();
        return;
    L_0x003a:
        r5 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003a }
        goto L_0x003e;
    L_0x003d:
        throw r5;
    L_0x003e:
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.camera.CameraView.c(int):void");
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x000e A:{LOOP_START, SYNTHETIC, LOOP:0: B:6:0x000e->B:64:0x000e} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void onDrawFrame(javax.microedition.khronos.opengles.GL10 r28) {
        /*
        r27 = this;
        r1 = r27;
        r0 = r1.g;
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        goto L_0x001d;
    L_0x0007:
        r2 = r0.r;
        if (r2 == 0) goto L_0x001d;
    L_0x000b:
        r2 = r0.g;
        monitor-enter(r2);
    L_0x000e:
        r3 = r0.f;	 Catch:{ all -> 0x001a }
        if (r3 == 0) goto L_0x0018;
    L_0x0012:
        r3 = r0.g;	 Catch:{ InterruptedException -> 0x000e }
        r3.wait();	 Catch:{ InterruptedException -> 0x000e }
        goto L_0x000e;
    L_0x0018:
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        goto L_0x001d;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        throw r0;
    L_0x001d:
        r0 = r1.b;
        r0.updateTexImage();
        r2 = r1.g;
        r3 = 2;
        r4 = 1;
        if (r2 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x0053;
    L_0x0029:
        r0 = r2.r;
        if (r0 == 0) goto L_0x0053;
    L_0x002d:
        r0 = r1.b;
        r5 = r1.c;
        monitor-enter(r2);
        r6 = r2.a;	 Catch:{ all -> 0x0050 }
        if (r6 == r3) goto L_0x0038;
    L_0x0036:
        monitor-exit(r2);	 Catch:{ all -> 0x0050 }
        goto L_0x004a;
    L_0x0038:
        r2.f = r4;	 Catch:{ all -> 0x0050 }
        r6 = r2.u;	 Catch:{ all -> 0x0050 }
        r6 = r6 + r4;
        r2.u = r6;	 Catch:{ all -> 0x0050 }
        r6 = r2.q;	 Catch:{ all -> 0x0050 }
        r7 = new zhb;	 Catch:{ all -> 0x0050 }
        r7.<init>(r2, r0, r5);	 Catch:{ all -> 0x0050 }
        r6.post(r7);	 Catch:{ all -> 0x0050 }
        monitor-exit(r2);	 Catch:{ all -> 0x0050 }
    L_0x004a:
        r0 = r1.w;
        r0 = r0 + r4;
        r1.w = r0;
        goto L_0x0053;
    L_0x0050:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0050 }
        throw r0;
    L_0x0053:
        r0 = 16;
        r2 = new float[r0];
        r5 = r1.b;
        r5.getTransformMatrix(r2);
        r0 = new float[r0];
        r5 = 0;
        android.opengl.Matrix.setIdentityM(r0, r5);
        r6 = r1.a;
        r7 = r1.c;
        r6.a(r7, r0, r2);
        r6 = r1.z;
        if (r6 == 0) goto L_0x0211;
    L_0x006d:
        r6 = r1.c;
        r7 = 4;
        r7 = new int[r7];
        r8 = 2978; // 0xba2 float:4.173E-42 double:1.4713E-320;
        android.opengl.GLES20.glGetIntegerv(r8, r7, r5);
        r8 = r1.f;
        r8 = r8.b();
        r8 = r8.getParameters();
        r8 = r8.getPreviewSize();
        r15 = r8.height;
        r8 = r8.width;
        r9 = r15 * r8;
        r9 = r9 << r3;
        r14 = java.nio.ByteBuffer.allocateDirect(r9);
        r9 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r14.order(r9);
        r13 = new int[r4];
        r12 = new int[r4];
        r18 = 3;
        r11 = 3553; // 0xde1 float:4.979E-42 double:1.7554E-320;
        r10 = 36160; // 0x8d40 float:5.0671E-41 double:1.78654E-319;
        r9 = "glGenFramebuffers";
        defpackage.zij.a(r9);	 Catch:{ all -> 0x01db }
        android.opengl.GLES20.glGenTextures(r4, r12, r5);	 Catch:{ all -> 0x01db }
        r9 = r12[r5];	 Catch:{ all -> 0x01db }
        r16 = 33984; // 0x84c0 float:4.7622E-41 double:1.67903E-319;
        android.opengl.GLES20.glActiveTexture(r16);	 Catch:{ all -> 0x01db }
        r16 = "glActiveTexture";
        defpackage.zij.a(r16);	 Catch:{ all -> 0x01db }
        android.opengl.GLES20.glBindTexture(r11, r9);	 Catch:{ all -> 0x01db }
        r16 = "glBindTexture";
        defpackage.zij.a(r16);	 Catch:{ all -> 0x01db }
        r16 = 3553; // 0xde1 float:4.979E-42 double:1.7554E-320;
        r17 = 0;
        r19 = 6408; // 0x1908 float:8.98E-42 double:3.166E-320;
        r20 = 0;
        r21 = 6408; // 0x1908 float:8.98E-42 double:3.166E-320;
        r22 = 5121; // 0x1401 float:7.176E-42 double:2.53E-320;
        r23 = 0;
        r3 = r9;
        r9 = r16;
        r10 = r17;
        r11 = r19;
        r24 = r12;
        r12 = r15;
        r4 = r13;
        r13 = r8;
        r25 = r14;
        r14 = r20;
        r26 = r15;
        r15 = r21;
        r16 = r22;
        r17 = r23;
        android.opengl.GLES20.glTexImage2D(r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x01d7 }
        r9 = "glTexImage2D";
        defpackage.zij.a(r9);	 Catch:{ all -> 0x01d7 }
        r9 = 1;
        android.opengl.GLES20.glGenFramebuffers(r9, r4, r5);	 Catch:{ all -> 0x01d7 }
        r9 = r4[r5];	 Catch:{ all -> 0x01d7 }
        r15 = 36160; // 0x8d40 float:5.0671E-41 double:1.78654E-319;
        android.opengl.GLES20.glBindFramebuffer(r15, r9);	 Catch:{ all -> 0x01d7 }
        r9 = "glBindFramebuffer";
        defpackage.zij.a(r9);	 Catch:{ all -> 0x01d7 }
        r9 = 36064; // 0x8ce0 float:5.0536E-41 double:1.7818E-319;
        r14 = 3553; // 0xde1 float:4.979E-42 double:1.7554E-320;
        android.opengl.GLES20.glFramebufferTexture2D(r15, r9, r14, r3, r5);	 Catch:{ all -> 0x01d7 }
        r3 = "glFramebufferTexture2D";
        defpackage.zij.a(r3);	 Catch:{ all -> 0x01d7 }
        r3 = android.opengl.GLES20.glCheckFramebufferStatus(r15);	 Catch:{ all -> 0x01d7 }
        r9 = 36053; // 0x8cd5 float:5.0521E-41 double:1.78125E-319;
        if (r3 != r9) goto L_0x019e;
    L_0x0112:
        r13 = r26;
        android.opengl.GLES20.glViewport(r5, r5, r13, r8);	 Catch:{ all -> 0x01d7 }
        r3 = r1.a;	 Catch:{ all -> 0x01d7 }
        r3.a(r6, r0, r2);	 Catch:{ all -> 0x01d7 }
        r9 = 0;
        r10 = 0;
        r0 = 6408; // 0x1908 float:8.98E-42 double:3.166E-320;
        r2 = 5121; // 0x1401 float:7.176E-42 double:2.53E-320;
        r11 = r13;
        r12 = r8;
        r3 = r13;
        r13 = r0;
        r6 = 3553; // 0xde1 float:4.979E-42 double:1.7554E-320;
        r14 = r2;
        r2 = 36160; // 0x8d40 float:5.0671E-41 double:1.78654E-319;
        r15 = r25;
        android.opengl.GLES20.glReadPixels(r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x019a }
        r0 = "glReadPixels";
        defpackage.zij.a(r0);	 Catch:{ all -> 0x019a }
        android.opengl.GLES20.glBindFramebuffer(r2, r5);
        r0 = "glBindFramebuffer";
        defpackage.zij.b(r0);
        r2 = 1;
        android.opengl.GLES20.glDeleteFramebuffers(r2, r4, r5);
        r0 = "glDeleteFramebuffers";
        defpackage.zij.b(r0);
        android.opengl.GLES20.glBindTexture(r6, r5);
        r0 = "glBindTexture";
        defpackage.zij.b(r0);
        r9 = r24;
        android.opengl.GLES20.glDeleteTextures(r2, r9, r5);
        r0 = "glDeleteTextures";
        defpackage.zij.b(r0);
        r0 = r7[r5];
        r2 = r7[r2];
        r4 = 2;
        r4 = r7[r4];
        r5 = r7[r18];
        android.opengl.GLES20.glViewport(r0, r2, r4, r5);
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
        r9 = android.graphics.Bitmap.createBitmap(r3, r8, r0);
        r0 = r25;
        r9.copyPixelsFromBuffer(r0);
        r14 = new android.graphics.Matrix;
        r14.<init>();
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r14.postScale(r0, r2);
        r12 = r9.getWidth();
        r13 = r9.getHeight();
        r10 = 0;
        r11 = 0;
        r15 = 1;
        r0 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15);
        r2 = r1.z;
        r3 = 0;
        r1.z = r3;
        r3 = new zhf;
        r3.<init>(r1, r2, r0);
        r1.post(r3);
        goto L_0x0211;
    L_0x019a:
        r0 = move-exception;
        r9 = r24;
        goto L_0x01e3;
    L_0x019e:
        r9 = r24;
        r2 = 36160; // 0x8d40 float:5.0671E-41 double:1.78654E-319;
        r6 = 3553; // 0xde1 float:4.979E-42 double:1.7554E-320;
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x01d5 }
        r8 = java.lang.String.valueOf(r27);	 Catch:{ all -> 0x01d5 }
        r10 = android.opengl.GLES20.glGetError();	 Catch:{ all -> 0x01d5 }
        r11 = r8.length();	 Catch:{ all -> 0x01d5 }
        r11 = r11 + 78;
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01d5 }
        r12.<init>(r11);	 Catch:{ all -> 0x01d5 }
        r12.append(r8);	 Catch:{ all -> 0x01d5 }
        r8 = ": Failed to set up render buffer with status ";
        r12.append(r8);	 Catch:{ all -> 0x01d5 }
        r12.append(r3);	 Catch:{ all -> 0x01d5 }
        r3 = " and error ";
        r12.append(r3);	 Catch:{ all -> 0x01d5 }
        r12.append(r10);	 Catch:{ all -> 0x01d5 }
        r3 = r12.toString();	 Catch:{ all -> 0x01d5 }
        r0.<init>(r3);	 Catch:{ all -> 0x01d5 }
        throw r0;	 Catch:{ all -> 0x01d5 }
    L_0x01d5:
        r0 = move-exception;
        goto L_0x01e3;
    L_0x01d7:
        r0 = move-exception;
        r9 = r24;
        goto L_0x01de;
    L_0x01db:
        r0 = move-exception;
        r9 = r12;
        r4 = r13;
    L_0x01de:
        r2 = 36160; // 0x8d40 float:5.0671E-41 double:1.78654E-319;
        r6 = 3553; // 0xde1 float:4.979E-42 double:1.7554E-320;
    L_0x01e3:
        android.opengl.GLES20.glBindFramebuffer(r2, r5);
        r2 = "glBindFramebuffer";
        defpackage.zij.b(r2);
        r2 = 1;
        android.opengl.GLES20.glDeleteFramebuffers(r2, r4, r5);
        r3 = "glDeleteFramebuffers";
        defpackage.zij.b(r3);
        android.opengl.GLES20.glBindTexture(r6, r5);
        r3 = "glBindTexture";
        defpackage.zij.b(r3);
        android.opengl.GLES20.glDeleteTextures(r2, r9, r5);
        r3 = "glDeleteTextures";
        defpackage.zij.b(r3);
        r3 = r7[r5];
        r2 = r7[r2];
        r4 = 2;
        r4 = r7[r4];
        r5 = r7[r18];
        android.opengl.GLES20.glViewport(r3, r2, r4, r5);
        throw r0;
    L_0x0211:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.camera.CameraView.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    public final void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 r12, javax.microedition.khronos.egl.EGLConfig r13) {
        /*
        r11 = this;
        r12 = 1;
        r13 = new int[r12];
        r0 = 0;
        android.opengl.GLES20.glGenTextures(r12, r13, r0);
        r1 = "Couldn't generate textures.";
        defpackage.zij.a(r1);
        r1 = r13[r0];
        r2 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        android.opengl.GLES20.glBindTexture(r2, r1);
        r1 = "Couldn't bind texture.";
        defpackage.zij.a(r1);
        r1 = 10241; // 0x2801 float:1.435E-41 double:5.0597E-320;
        r3 = 1175977984; // 0x46180000 float:9728.0 double:5.81010322E-315;
        android.opengl.GLES20.glTexParameterf(r2, r1, r3);
        r1 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;
        r3 = 1175979008; // 0x46180400 float:9729.0 double:5.81010828E-315;
        android.opengl.GLES20.glTexParameterf(r2, r1, r3);
        r1 = 33071; // 0x812f float:4.6342E-41 double:1.6339E-319;
        r3 = 10242; // 0x2802 float:1.4352E-41 double:5.06E-320;
        android.opengl.GLES20.glTexParameteri(r2, r3, r1);
        r3 = 10243; // 0x2803 float:1.4354E-41 double:5.0607E-320;
        android.opengl.GLES20.glTexParameteri(r2, r3, r1);
        r1 = "Couldn't set texture parameters.";
        defpackage.zij.a(r1);
        r13 = r13[r0];
        r11.c = r13;
        r1 = new android.graphics.SurfaceTexture;
        r1.<init>(r13);
        r11.b = r1;
        r13 = r11.b;
        r13.setOnFrameAvailableListener(r11);
        r13 = new ziu;
        r13.<init>();
        r11.a = r13;
        r13 = r11.r;
        if (r13 == 0) goto L_0x0058;
    L_0x0055:
        r11.getContext();
    L_0x0058:
        r13 = r11.q;
        r1 = 5;
        r2 = -1;
        if (r13 != 0) goto L_0x0060;
    L_0x005e:
        r6 = 5;
        goto L_0x0081;
    L_0x0060:
        r13 = r13.b;
        r13 = defpackage.aorc.a(r13);
        if (r13 == 0) goto L_0x0069;
    L_0x0068:
        goto L_0x006a;
    L_0x0069:
        r13 = 1;
    L_0x006a:
        r13 = r13 + r2;
        if (r13 == 0) goto L_0x005e;
    L_0x006d:
        if (r13 == r12) goto L_0x0080;
    L_0x006f:
        r0 = 2;
        if (r13 == r0) goto L_0x005e;
    L_0x0072:
        r0 = 3;
        if (r13 == r0) goto L_0x007e;
    L_0x0075:
        r12 = 4;
        if (r13 == r12) goto L_0x007b;
    L_0x0078:
        r12 = 6;
        r6 = 6;
        goto L_0x0081;
    L_0x007b:
        r12 = 7;
        r6 = 7;
        goto L_0x0081;
    L_0x007e:
        r6 = 1;
        goto L_0x0081;
    L_0x0080:
        r6 = 0;
    L_0x0081:
        r12 = r11.l;
        if (r12 < 0) goto L_0x0093;
    L_0x0085:
        r12 = new android.hardware.Camera$CameraInfo;
        r12.<init>();
        r13 = r11.l;
        android.hardware.Camera.getCameraInfo(r13, r12);
        r12 = r12.orientation;
        r8 = r12;
        goto L_0x0094;
    L_0x0093:
        r8 = -1;
    L_0x0094:
        r12 = r11.m;
        if (r12 < 0) goto L_0x00a6;
    L_0x0098:
        r12 = new android.hardware.Camera$CameraInfo;
        r12.<init>();
        r13 = r11.m;
        android.hardware.Camera.getCameraInfo(r13, r12);
        r2 = r12.orientation;
        r9 = r2;
        goto L_0x00a7;
    L_0x00a6:
        r9 = -1;
    L_0x00a7:
        r12 = new zgz;
        r4 = android.opengl.EGL14.eglGetCurrentContext();
        r5 = defpackage.ukf.a;
        r7 = r11.t;
        r10 = r11.n;
        r3 = r12;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10);
        r11.g = r12;
        r12 = r11.e;
        if (r12 == 0) goto L_0x00f5;
    L_0x00bd:
        r11.l();
        r12 = r11.h;
        monitor-enter(r12);
        r13 = r11.getContext();	 Catch:{ all -> 0x00f2 }
        r0 = android.opengl.EGL14.eglGetCurrentContext();	 Catch:{ all -> 0x00f2 }
        r1 = new zld;	 Catch:{ all -> 0x00f2 }
        r1.<init>(r13, r11, r0);	 Catch:{ all -> 0x00f2 }
        r11.j = r1;	 Catch:{ all -> 0x00f2 }
        r13 = r11.j;	 Catch:{ all -> 0x00f2 }
        r13.d();	 Catch:{ all -> 0x00f2 }
        r13 = r11.i;	 Catch:{ all -> 0x00f2 }
        if (r13 == 0) goto L_0x00e0;
    L_0x00db:
        r0 = r11.j;	 Catch:{ all -> 0x00f2 }
        r0.a(r13);	 Catch:{ all -> 0x00f2 }
    L_0x00e0:
        r13 = r11.j;	 Catch:{ all -> 0x00f2 }
        r13.k();	 Catch:{ all -> 0x00f2 }
        monitor-exit(r12);	 Catch:{ all -> 0x00f2 }
        r12 = r11.f;
        r12 = r12.b();
        if (r12 == 0) goto L_0x00f1;
    L_0x00ee:
        r11.o();
    L_0x00f1:
        return;
    L_0x00f2:
        r13 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x00f2 }
        throw r13;
    L_0x00f5:
        r12 = r11.f;
        r13 = r11.b;
        r12.a(r13);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.camera.CameraView.onSurfaceCreated(javax.microedition.khronos.opengles.GL10, javax.microedition.khronos.egl.EGLConfig):void");
    }

    private final void o() {
        amqw.a(this.j);
        CamcorderProfile c = c(true);
        int i = c.videoFrameWidth;
        int i2 = c.videoFrameHeight;
        int i3 = (this.f.d + 90) % 180;
        int i4 = i3 != 0 ? i2 : i;
        if (i3 != 0) {
            i2 = i;
        }
        this.j.a(this.b, i2, i4);
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.v.requestRender();
        zgz zgz = this.g;
        if (zgz != null && zgz.r) {
            this.x++;
        }
    }

    public final void a(SurfaceTexture surfaceTexture, int i) {
        this.f.a(surfaceTexture);
    }

    public final boolean a(Camera camera, String str) {
        if (camera != null && (b(camera, str) || this.k != this.l)) {
            if (b(camera, str) || this.k != this.m) {
                try {
                    Parameters parameters = camera.getParameters();
                    parameters.setFlashMode(str);
                    camera.setParameters(parameters);
                    return true;
                } catch (Exception e) {
                    xtl.b("Error while setting camera flash light mode", e);
                }
            } else if ("torch".equals(str) || "off".equals(str)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private static boolean b(Camera camera, String str) {
        try {
            Parameters parameters = camera.getParameters();
            List supportedFlashModes = parameters.getSupportedFlashModes();
            if (parameters.getFlashMode() == null || supportedFlashModes == null || !supportedFlashModes.contains(str)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            xtl.b("Error while getting camera parameters.", e);
            return false;
        }
    }

    public final void a(float f) {
        Camera b = this.f.b();
        if (b != null) {
            Parameters b2 = b(b);
            if (b2 != null && b2.isZoomSupported()) {
                f -= 4.0f;
                if (Math.abs(f) >= 0.001f) {
                    int zoom = b2.getZoom();
                    int maxZoom = b2.getMaxZoom();
                    f *= (float) maxZoom;
                    if (Math.abs(f) < 1.0f) {
                        f = f > 0.0f ? 1.0f : -1.0f;
                    }
                    b2.setZoom(Math.max(0, Math.min(maxZoom, Math.round(((float) zoom) + f))));
                    try {
                        b.setParameters(b2);
                    } catch (Exception e) {
                        xtl.b("Could not set camera parameters.", e);
                    }
                }
            }
        }
    }

    private static Parameters b(Camera camera) {
        try {
            return camera.getParameters();
        } catch (Exception e) {
            xtl.b("Error while getting camera parameters.", e);
            return null;
        }
    }

    public final void b(float f) {
        Camera b = this.f.b();
        if (b != null) {
            Parameters b2 = b(b);
            if (b2 != null && b2.isZoomSupported()) {
                int maxZoom = b2.getMaxZoom();
                b2.setZoom(Math.min(maxZoom, Math.max(0, (int) (((float) maxZoom) * f))));
                try {
                    b.setParameters(b2);
                } catch (Exception e) {
                    xtl.b("Error while setting camera parameters.", e);
                }
            }
        }
    }

    private static Rect a(RectF rectF) {
        Rect rect = new Rect();
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
        return rect;
    }

    private static RectF a(Rect rect) {
        return new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    /* JADX WARNING: Missing block: B:29:0x00bd, code skipped:
            if (r1.getMaxNumMeteringAreas() > 0) goto L_0x00bf;
     */
    public final void a(float r10, float r11, defpackage.zhj r12) {
        /*
        r9 = this;
        r0 = r9.f;
        r0 = r0.b();
        if (r0 == 0) goto L_0x00d4;
    L_0x0008:
        r1 = r0.getParameters();
        r2 = r1.getFocusMode();
        r3 = r9.f;
        r3 = r3.d;
        r4 = new android.graphics.Matrix;
        r4.<init>();
        r5 = r9.k;
        r6 = r9.m;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r5 != r6) goto L_0x0024;
    L_0x0021:
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        goto L_0x0026;
    L_0x0024:
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0026:
        r4.setScale(r7, r5);
        r3 = 360 - r3;
        r3 = (float) r3;
        r4.postRotate(r3);
        r0.cancelAutoFocus();	 Catch:{ RuntimeException -> 0x00cf }
        r3 = r1.getMaxNumFocusAreas();	 Catch:{ RuntimeException -> 0x00cf }
        r5 = 800; // 0x320 float:1.121E-42 double:3.953E-321;
        if (r3 <= 0) goto L_0x0065;
    L_0x003a:
        r3 = new java.util.ArrayList;	 Catch:{ RuntimeException -> 0x00cf }
        r3.<init>();	 Catch:{ RuntimeException -> 0x00cf }
        r6 = r9.v;	 Catch:{ RuntimeException -> 0x00cf }
        r6 = r6.getWidth();	 Catch:{ RuntimeException -> 0x00cf }
        r8 = r9.v;	 Catch:{ RuntimeException -> 0x00cf }
        r8 = r8.getHeight();	 Catch:{ RuntimeException -> 0x00cf }
        r6 = a(r10, r11, r7, r6, r8);	 Catch:{ RuntimeException -> 0x00cf }
        r6 = a(r6);	 Catch:{ RuntimeException -> 0x00cf }
        r4.mapRect(r6);	 Catch:{ RuntimeException -> 0x00cf }
        r7 = new android.hardware.Camera$Area;	 Catch:{ RuntimeException -> 0x00cf }
        r6 = a(r6);	 Catch:{ RuntimeException -> 0x00cf }
        r7.<init>(r6, r5);	 Catch:{ RuntimeException -> 0x00cf }
        r3.add(r7);	 Catch:{ RuntimeException -> 0x00cf }
        r1.setFocusAreas(r3);	 Catch:{ RuntimeException -> 0x00cf }
    L_0x0065:
        r3 = r1.getMaxNumMeteringAreas();	 Catch:{ RuntimeException -> 0x00cf }
        if (r3 <= 0) goto L_0x0098;
    L_0x006b:
        r3 = new java.util.ArrayList;	 Catch:{ RuntimeException -> 0x00cf }
        r3.<init>();	 Catch:{ RuntimeException -> 0x00cf }
        r6 = r9.v;	 Catch:{ RuntimeException -> 0x00cf }
        r6 = r6.getWidth();	 Catch:{ RuntimeException -> 0x00cf }
        r7 = r9.v;	 Catch:{ RuntimeException -> 0x00cf }
        r7 = r7.getHeight();	 Catch:{ RuntimeException -> 0x00cf }
        r8 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r6 = a(r10, r11, r8, r6, r7);	 Catch:{ RuntimeException -> 0x00cf }
        r6 = a(r6);	 Catch:{ RuntimeException -> 0x00cf }
        r4.mapRect(r6);	 Catch:{ RuntimeException -> 0x00cf }
        r4 = new android.hardware.Camera$Area;	 Catch:{ RuntimeException -> 0x00cf }
        r6 = a(r6);	 Catch:{ RuntimeException -> 0x00cf }
        r4.<init>(r6, r5);	 Catch:{ RuntimeException -> 0x00cf }
        r3.add(r4);	 Catch:{ RuntimeException -> 0x00cf }
        r1.setMeteringAreas(r3);	 Catch:{ RuntimeException -> 0x00cf }
    L_0x0098:
        r3 = r1.getSupportedFocusModes();	 Catch:{ RuntimeException -> 0x00cf }
        r4 = 0;
        r5 = "auto";
        if (r3 == 0) goto L_0x00a9;
    L_0x00a1:
        r3 = r3.contains(r5);	 Catch:{ RuntimeException -> 0x00cf }
        if (r3 != 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00a9;
    L_0x00a8:
        r4 = 1;
    L_0x00a9:
        if (r4 != 0) goto L_0x00ac;
    L_0x00ab:
        goto L_0x00af;
    L_0x00ac:
        r1.setFocusMode(r5);	 Catch:{ RuntimeException -> 0x00cf }
    L_0x00af:
        r0.setParameters(r1);	 Catch:{ RuntimeException -> 0x00cf }
        r3 = r1.getMaxNumFocusAreas();	 Catch:{ RuntimeException -> 0x00cf }
        if (r3 <= 0) goto L_0x00b9;
    L_0x00b8:
        goto L_0x00bf;
    L_0x00b9:
        r1 = r1.getMaxNumMeteringAreas();	 Catch:{ RuntimeException -> 0x00cf }
        if (r1 <= 0) goto L_0x00c4;
    L_0x00bf:
        r10 = (int) r10;	 Catch:{ RuntimeException -> 0x00cf }
        r11 = (int) r11;	 Catch:{ RuntimeException -> 0x00cf }
        r12.a(r10, r11);	 Catch:{ RuntimeException -> 0x00cf }
    L_0x00c4:
        if (r4 == 0) goto L_0x00ce;
    L_0x00c6:
        r10 = new zhh;	 Catch:{ RuntimeException -> 0x00cf }
        r10.<init>(r2);	 Catch:{ RuntimeException -> 0x00cf }
        r0.autoFocus(r10);	 Catch:{ RuntimeException -> 0x00cf }
    L_0x00ce:
        return;
    L_0x00cf:
        r10 = "error setting camera parameters";
        defpackage.xtl.c(r10);
    L_0x00d4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.camera.CameraView.a(float, float, zhj):void");
    }

    private static Rect a(float f, float f2, float f3, int i, int i2) {
        double d = (double) ((f / ((float) i)) * 2000.0f);
        Double.isNaN(d);
        int i3 = (int) (d - 0.00408935546875d);
        double d2 = (double) ((f2 / ((float) i2)) * 2000.0f);
        Double.isNaN(d2);
        int i4 = (int) (d2 - 0.00408935546875d);
        int round = Math.round(f3 * 200.0f) / 2;
        return new Rect(Math.min(Math.max(-1000, i3 - round), 1000), Math.min(Math.max(-1000, i4 - round), 1000), Math.min(Math.max(-1000, i3 + round), 1000), Math.min(Math.max(-1000, i4 + round), 1000));
    }
}
