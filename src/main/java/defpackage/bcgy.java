package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: bcgy */
final class bcgy {
    public EGLDisplay a = EGL14.EGL_NO_DISPLAY;
    public EGLContext b = EGL14.EGL_NO_CONTEXT;
    public EGLSurface c = EGL14.EGL_NO_SURFACE;
    public SurfaceTexture d;
    public Surface e;
    public final Object f = new Object();
    public boolean g;
    public bche h = new bche();

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f0  */
    public bcgy() {
        /*
        r8 = this;
        r8.<init>();
        r0 = android.opengl.EGL14.EGL_NO_DISPLAY;
        r8.a = r0;
        r0 = android.opengl.EGL14.EGL_NO_CONTEXT;
        r8.b = r0;
        r0 = android.opengl.EGL14.EGL_NO_SURFACE;
        r8.c = r0;
        r0 = new java.lang.Object;
        r0.<init>();
        r8.f = r0;
        r0 = new bche;
        r0.<init>();
        r8.h = r0;
        r0 = r8.h;
        r1 = 35633; // 0x8b31 float:4.9932E-41 double:1.7605E-319;
        r2 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        r1 = defpackage.bche.a(r1, r2);
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0076;
    L_0x002c:
        r4 = 35632; // 0x8b30 float:4.9931E-41 double:1.76045E-319;
        r5 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        r4 = defpackage.bche.a(r4, r5);
        if (r4 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0076;
    L_0x0038:
        r5 = android.opengl.GLES20.glCreateProgram();
        r6 = "glCreateProgram";
        defpackage.bcgr.a(r6);
        r6 = "TextureRender";
        if (r5 != 0) goto L_0x004a;
    L_0x0045:
        r7 = "Could not create program";
        android.util.Log.e(r6, r7);
    L_0x004a:
        android.opengl.GLES20.glAttachShader(r5, r1);
        r1 = "glAttachShader";
        defpackage.bcgr.a(r1);
        android.opengl.GLES20.glAttachShader(r5, r4);
        defpackage.bcgr.a(r1);
        android.opengl.GLES20.glLinkProgram(r5);
        r1 = new int[r2];
        r4 = 35714; // 0x8b82 float:5.0046E-41 double:1.7645E-319;
        android.opengl.GLES20.glGetProgramiv(r5, r4, r1, r3);
        r1 = r1[r3];
        if (r1 == r2) goto L_0x0077;
    L_0x0067:
        r1 = "Could not link program: ";
        android.util.Log.e(r6, r1);
        r1 = android.opengl.GLES20.glGetProgramInfoLog(r5);
        android.util.Log.e(r6, r1);
        android.opengl.GLES20.glDeleteProgram(r5);
    L_0x0076:
        r5 = 0;
    L_0x0077:
        r0.d = r5;
        if (r5 == 0) goto L_0x007d;
    L_0x007b:
        r1 = 1;
        goto L_0x007e;
    L_0x007d:
        r1 = 0;
    L_0x007e:
        r4 = new java.lang.Object[r3];
        r5 = "createProgram failed";
        defpackage.amrw.a(r1, r5, r4);
        r1 = r0.d;
        r4 = "aPosition";
        r1 = android.opengl.GLES20.glGetAttribLocation(r1, r4);
        r0.h = r1;
        r1 = "glGetAttribLocation aPosition";
        defpackage.bcgr.a(r1);
        r1 = r0.h;
        r4 = -1;
        if (r1 == r4) goto L_0x009b;
    L_0x0099:
        r1 = 1;
        goto L_0x009c;
    L_0x009b:
        r1 = 0;
    L_0x009c:
        r5 = new java.lang.Object[r3];
        r6 = "Could not get attrib location for aPosition";
        defpackage.amrw.a(r1, r6, r5);
        r1 = r0.d;
        r5 = "aTextureCoord";
        r1 = android.opengl.GLES20.glGetAttribLocation(r1, r5);
        r0.i = r1;
        r1 = "glGetAttribLocation aTextureCoord";
        defpackage.bcgr.a(r1);
        r1 = r0.i;
        if (r1 == r4) goto L_0x00b8;
    L_0x00b6:
        r1 = 1;
        goto L_0x00b9;
    L_0x00b8:
        r1 = 0;
    L_0x00b9:
        r5 = new java.lang.Object[r3];
        r6 = "Could not get attrib location for aTextureCoord";
        defpackage.amrw.a(r1, r6, r5);
        r1 = r0.d;
        r5 = "uMVPMatrix";
        r1 = android.opengl.GLES20.glGetUniformLocation(r1, r5);
        r0.f = r1;
        r1 = "glGetUniformLocation uMVPMatrix";
        defpackage.bcgr.a(r1);
        r1 = r0.f;
        if (r1 == r4) goto L_0x00d5;
    L_0x00d3:
        r1 = 1;
        goto L_0x00d6;
    L_0x00d5:
        r1 = 0;
    L_0x00d6:
        r5 = new java.lang.Object[r3];
        r6 = "Could not get attrib location for uMVPMatrix";
        defpackage.amrw.a(r1, r6, r5);
        r1 = r0.d;
        r5 = "uSTMatrix";
        r1 = android.opengl.GLES20.glGetUniformLocation(r1, r5);
        r0.g = r1;
        r1 = "glGetUniformLocation uSTMatrix";
        defpackage.bcgr.a(r1);
        r1 = r0.g;
        if (r1 == r4) goto L_0x00f2;
    L_0x00f0:
        r1 = 1;
        goto L_0x00f3;
    L_0x00f2:
        r1 = 0;
    L_0x00f3:
        r4 = new java.lang.Object[r3];
        r5 = "Could not get attrib location for uSTMatrix";
        defpackage.amrw.a(r1, r5, r4);
        r1 = new int[r2];
        android.opengl.GLES20.glGenTextures(r2, r1, r3);
        r1 = r1[r3];
        r0.e = r1;
        r0 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        android.opengl.GLES20.glBindTexture(r0, r1);
        r1 = "glBindTexture textureID";
        defpackage.bcgr.a(r1);
        r1 = 10241; // 0x2801 float:1.435E-41 double:5.0597E-320;
        r2 = 1175979008; // 0x46180400 float:9729.0 double:5.81010828E-315;
        android.opengl.GLES20.glTexParameterf(r0, r1, r2);
        r1 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;
        android.opengl.GLES20.glTexParameterf(r0, r1, r2);
        r1 = 10242; // 0x2802 float:1.4352E-41 double:5.06E-320;
        r2 = 33071; // 0x812f float:4.6342E-41 double:1.6339E-319;
        android.opengl.GLES20.glTexParameteri(r0, r1, r2);
        r1 = 10243; // 0x2803 float:1.4354E-41 double:5.0607E-320;
        android.opengl.GLES20.glTexParameteri(r0, r1, r2);
        r0 = "glTexParameter";
        defpackage.bcgr.a(r0);
        r0 = new android.graphics.SurfaceTexture;
        r1 = r8.h;
        r1 = r1.e;
        r0.<init>(r1);
        r8.d = r0;
        r0 = r8.d;
        r1 = new bcgx;
        r1.<init>(r8);
        r0.setOnFrameAvailableListener(r1);
        r0 = new android.view.Surface;
        r1 = r8.d;
        r0.<init>(r1);
        r8.e = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcgy.<init>():void");
    }
}
