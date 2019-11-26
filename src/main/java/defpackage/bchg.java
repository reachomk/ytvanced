package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: bchg */
public final class bchg implements bchd {
    private final MediaExtractor a;
    private final int b;
    private final MediaFormat c;
    private final bcgz d;
    private final BufferInfo e = new BufferInfo();
    private MediaCodec f;
    private MediaCodec g;
    private ByteBuffer[] h;
    private ByteBuffer[] i;
    private MediaFormat j;
    private bcgy k;
    private bcgu l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private long r;

    public bchg(MediaExtractor mediaExtractor, int i, MediaFormat mediaFormat, bcgz bcgz) {
        this.a = (MediaExtractor) amqw.a((Object) mediaExtractor);
        this.b = i;
        this.c = (MediaFormat) amqw.a((Object) mediaFormat);
        this.d = (bcgz) amqw.a((Object) bcgz);
    }

    public final void a() {
        String str = "mime";
        this.a.selectTrack(this.b);
        try {
            this.g = MediaCodec.createEncoderByType(this.c.getString(str));
            this.g.configure(this.c, null, null, 1);
            this.l = new bcgu(this.g.createInputSurface());
            bcgu bcgu = this.l;
            EGLDisplay eGLDisplay = bcgu.a;
            EGLSurface eGLSurface = bcgu.c;
            amrw.a(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bcgu.b), "eglMakeCurrent failed", new Object[0]);
            this.g.start();
            this.q = true;
            this.i = this.g.getOutputBuffers();
            MediaFormat trackFormat = this.a.getTrackFormat(this.b);
            String str2 = "rotation-degrees";
            if (trackFormat.containsKey(str2)) {
                trackFormat.setInteger(str2, 0);
            }
            this.k = new bcgy();
            try {
                this.f = MediaCodec.createDecoderByType(trackFormat.getString(str));
                this.f.configure(trackFormat, this.k.e, null, 0);
                this.f.start();
                this.p = true;
                this.h = this.f.getInputBuffers();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01aa A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01aa A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a9  */
    public final boolean b() {
        /*
        r20 = this;
        r1 = r20;
        r0 = 1;
        r2 = 0;
        r3 = 0;
    L_0x0005:
        r4 = r1.o;
        r5 = -1;
        r6 = -2;
        r7 = -3;
        r8 = 2;
        r9 = 4;
        r10 = 0;
        if (r4 != 0) goto L_0x008d;
    L_0x0010:
        r4 = r1.g;
        r12 = r1.e;
        r4 = r4.dequeueOutputBuffer(r12, r10);
        if (r4 == r7) goto L_0x0082;
    L_0x001a:
        if (r4 == r6) goto L_0x0064;
    L_0x001c:
        if (r4 == r5) goto L_0x008d;
    L_0x001e:
        r3 = r1.j;
        if (r3 == 0) goto L_0x005c;
    L_0x0022:
        r3 = r1.e;
        r3 = r3.flags;
        r3 = r3 & r9;
        if (r3 == 0) goto L_0x0036;
    L_0x0029:
        r1.o = r0;
        r9 = r1.e;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r14 = r9.flags;
        r9.set(r10, r11, r12, r14);
    L_0x0036:
        r3 = r1.e;
        r3 = r3.flags;
        r3 = r3 & r8;
        if (r3 == 0) goto L_0x0043;
    L_0x003d:
        r3 = r1.g;
        r3.releaseOutputBuffer(r4, r2);
        goto L_0x008a;
    L_0x0043:
        r3 = r1.d;
        r5 = defpackage.bchb.VIDEO;
        r6 = r1.i;
        r6 = r6[r4];
        r7 = r1.e;
        r3.a(r5, r6, r7);
        r3 = r1.e;
        r5 = r3.presentationTimeUs;
        r1.r = r5;
        r3 = r1.g;
        r3.releaseOutputBuffer(r4, r2);
        goto L_0x008a;
    L_0x005c:
        r0 = new java.lang.RuntimeException;
        r2 = "Could not determine actual output format.";
        r0.<init>(r2);
        throw r0;
    L_0x0064:
        r3 = r1.j;
        if (r3 != 0) goto L_0x007a;
    L_0x0068:
        r3 = r1.g;
        r3 = r3.getOutputFormat();
        r1.j = r3;
        r3 = r1.d;
        r4 = defpackage.bchb.VIDEO;
        r5 = r1.j;
        r3.a(r4, r5);
        goto L_0x008a;
    L_0x007a:
        r0 = new java.lang.RuntimeException;
        r2 = "Video output format changed twice.";
        r0.<init>(r2);
        throw r0;
    L_0x0082:
        r3 = r1.g;
        r3 = r3.getOutputBuffers();
        r1.i = r3;
    L_0x008a:
        r3 = 1;
        goto L_0x0005;
    L_0x008d:
        r4 = r1.n;
        if (r4 != 0) goto L_0x01a5;
    L_0x0091:
        r4 = r1.f;
        r12 = r1.e;
        r4 = r4.dequeueOutputBuffer(r12, r10);
        if (r4 == r7) goto L_0x01a3;
    L_0x009b:
        if (r4 == r6) goto L_0x01a3;
    L_0x009d:
        if (r4 == r5) goto L_0x01a5;
    L_0x009f:
        r12 = r1.e;
        r12 = r12.flags;
        r12 = r12 & r9;
        if (r12 == 0) goto L_0x00b1;
    L_0x00a6:
        r12 = r1.g;
        r12.signalEndOfInputStream();
        r1.n = r0;
        r12 = r1.e;
        r12.size = r2;
    L_0x00b1:
        r12 = r1.e;
        r12 = r12.size;
        if (r12 <= 0) goto L_0x00b9;
    L_0x00b7:
        r12 = 1;
        goto L_0x00ba;
    L_0x00b9:
        r12 = 0;
    L_0x00ba:
        r13 = r1.f;
        r13.releaseOutputBuffer(r4, r12);
        if (r12 == 0) goto L_0x01a1;
    L_0x00c1:
        r4 = r1.k;
        r12 = r4.f;
        monitor-enter(r12);
    L_0x00c6:
        r13 = r4.g;	 Catch:{ all -> 0x019e }
        if (r13 != 0) goto L_0x00db;
    L_0x00ca:
        r13 = r4.f;	 Catch:{ all -> 0x019e }
        r14 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r13.wait(r14);	 Catch:{ all -> 0x019e }
        r13 = r4.g;	 Catch:{ all -> 0x019e }
        r14 = "Surface frame wait timed out";
        r15 = new java.lang.Object[r2];	 Catch:{ all -> 0x019e }
        defpackage.amrw.a(r13, r14, r15);	 Catch:{ all -> 0x019e }
        goto L_0x00c6;
    L_0x00db:
        r4.g = r2;	 Catch:{ all -> 0x019e }
        monitor-exit(r12);	 Catch:{ all -> 0x019e }
        r12 = "before updateTexImage";
        defpackage.bcgr.a(r12);
        r4 = r4.d;
        r4.updateTexImage();
        r4 = r1.k;
        r12 = r4.h;
        r4 = r4.d;
        r13 = "drawFrame start";
        defpackage.bcgr.a(r13);
        r13 = r12.c;
        r4.getTransformMatrix(r13);
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r13 = 0;
        android.opengl.GLES20.glClearColor(r13, r4, r13, r4);
        r4 = 16640; // 0x4100 float:2.3318E-41 double:8.2213E-320;
        android.opengl.GLES20.glClear(r4);
        r4 = r12.d;
        android.opengl.GLES20.glUseProgram(r4);
        r4 = "glUseProgram";
        defpackage.bcgr.a(r4);
        r4 = 33984; // 0x84c0 float:4.7622E-41 double:1.67903E-319;
        android.opengl.GLES20.glActiveTexture(r4);
        r4 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        r13 = r12.e;
        android.opengl.GLES20.glBindTexture(r4, r13);
        r4 = r12.a;
        r4.position(r2);
        r13 = r12.h;
        r14 = 3;
        r15 = 5126; // 0x1406 float:7.183E-42 double:2.5326E-320;
        r16 = 0;
        r17 = 20;
        r4 = r12.a;
        r18 = r4;
        android.opengl.GLES20.glVertexAttribPointer(r13, r14, r15, r16, r17, r18);
        r4 = "glVertexAttribPointer maPosition";
        defpackage.bcgr.a(r4);
        r4 = r12.h;
        android.opengl.GLES20.glEnableVertexAttribArray(r4);
        r4 = "glEnableVertexAttribArray aPositionHandle";
        defpackage.bcgr.a(r4);
        r4 = r12.a;
        r13 = 3;
        r4.position(r13);
        r14 = r12.i;
        r15 = 2;
        r16 = 5126; // 0x1406 float:7.183E-42 double:2.5326E-320;
        r17 = 0;
        r18 = 20;
        r4 = r12.a;
        r19 = r4;
        android.opengl.GLES20.glVertexAttribPointer(r14, r15, r16, r17, r18, r19);
        r4 = "glVertexAttribPointer textureHandle";
        defpackage.bcgr.a(r4);
        r4 = r12.i;
        android.opengl.GLES20.glEnableVertexAttribArray(r4);
        r4 = "glEnableVertexAttribArray textureHandle";
        defpackage.bcgr.a(r4);
        r4 = r12.b;
        android.opengl.Matrix.setIdentityM(r4, r2);
        r4 = r12.f;
        r13 = r12.b;
        android.opengl.GLES20.glUniformMatrix4fv(r4, r0, r2, r13, r2);
        r4 = r12.g;
        r12 = r12.c;
        android.opengl.GLES20.glUniformMatrix4fv(r4, r0, r2, r12, r2);
        r4 = 5;
        android.opengl.GLES20.glDrawArrays(r4, r2, r9);
        r4 = "glDrawArrays";
        defpackage.bcgr.a(r4);
        android.opengl.GLES20.glFinish();
        r4 = r1.l;
        r12 = r1.e;
        r12 = r12.presentationTimeUs;
        r14 = r4.a;
        r4 = r4.c;
        r15 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12 = r12 * r15;
        android.opengl.EGLExt.eglPresentationTimeANDROID(r14, r4, r12);
        r4 = r1.l;
        r12 = r4.a;
        r4 = r4.c;
        android.opengl.EGL14.eglSwapBuffers(r12, r4);
        goto L_0x01a1;
    L_0x019e:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x019e }
        throw r0;
    L_0x01a1:
        r4 = 2;
        goto L_0x01a6;
    L_0x01a3:
        r4 = 1;
        goto L_0x01a6;
    L_0x01a5:
        r4 = 0;
    L_0x01a6:
        if (r4 != 0) goto L_0x01a9;
    L_0x01a8:
        goto L_0x01aa;
    L_0x01a9:
        r3 = 1;
    L_0x01aa:
        if (r4 == r0) goto L_0x008d;
    L_0x01ac:
        r4 = r1.m;
        if (r4 != 0) goto L_0x01f9;
    L_0x01b0:
        r4 = r1.a;
        r4 = r4.getSampleTrackIndex();
        if (r4 < 0) goto L_0x01bc;
    L_0x01b8:
        r5 = r1.b;
        if (r4 != r5) goto L_0x01f9;
    L_0x01bc:
        r5 = r1.f;
        r13 = r5.dequeueInputBuffer(r10);
        if (r13 < 0) goto L_0x01f9;
    L_0x01c4:
        if (r4 >= 0) goto L_0x01d4;
    L_0x01c6:
        r1.m = r0;
        r12 = r1.f;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r18 = 4;
        r12.queueInputBuffer(r13, r14, r15, r16, r18);
        goto L_0x01f9;
    L_0x01d4:
        r3 = r1.a;
        r4 = r1.h;
        r4 = r4[r13];
        r15 = r3.readSampleData(r4, r2);
        r3 = r1.a;
        r3 = r3.getSampleFlags();
        r12 = r1.f;
        r14 = 0;
        r4 = r1.a;
        r16 = r4.getSampleTime();
        r18 = r3 & 1;
        r12.queueInputBuffer(r13, r14, r15, r16, r18);
        r3 = r1.a;
        r3.advance();
        r3 = 1;
        goto L_0x01ac;
    L_0x01f9:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bchg.b():boolean");
    }

    public final long c() {
        return this.r;
    }

    public final boolean d() {
        return this.o;
    }

    public final void e() {
        bcgy bcgy = this.k;
        if (bcgy != null) {
            if (!bcgy.a.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(bcgy.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(bcgy.a, bcgy.c);
                EGL14.eglDestroyContext(bcgy.a, bcgy.b);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(bcgy.a);
            }
            bcgy.e.release();
            bcgy.a = EGL14.EGL_NO_DISPLAY;
            bcgy.b = EGL14.EGL_NO_CONTEXT;
            bcgy.c = EGL14.EGL_NO_SURFACE;
            bcgy.h = null;
            bcgy.e = null;
            bcgy.d = null;
            this.k = null;
        }
        bcgu bcgu = this.l;
        if (bcgu != null) {
            if (!bcgu.a.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(bcgu.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(bcgu.a, bcgu.c);
                EGL14.eglDestroyContext(bcgu.a, bcgu.b);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(bcgu.a);
            }
            bcgu.d.release();
            bcgu.a = EGL14.EGL_NO_DISPLAY;
            bcgu.b = EGL14.EGL_NO_CONTEXT;
            bcgu.c = EGL14.EGL_NO_SURFACE;
            bcgu.d = null;
            this.l = null;
        }
        MediaCodec mediaCodec = this.f;
        if (mediaCodec != null) {
            if (this.p) {
                mediaCodec.stop();
            }
            this.f.release();
            this.f = null;
        }
        mediaCodec = this.g;
        if (mediaCodec != null) {
            if (this.q) {
                mediaCodec.stop();
            }
            this.g.release();
            this.g = null;
        }
    }
}
