package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: uoj */
public final class uoj implements OnFrameAvailableListener, uof {
    private static final float[] a = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    private static final uol b = new uoi();
    private final int c;
    private final int d;
    private final EGL10 e;
    private EGLDisplay f = EGL10.EGL_NO_DISPLAY;
    private EGLContext g = EGL10.EGL_NO_CONTEXT;
    private EGLSurface h = EGL10.EGL_NO_SURFACE;
    private final FloatBuffer i;
    private final float[] j = new float[16];
    private final float[] k = new float[16];
    private final float[] l = new float[16];
    private final float[] m = new float[16];
    private int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private SurfaceTexture t;
    private Surface u;
    private final AtomicBoolean v = new AtomicBoolean();
    private final ByteBuffer w;

    public uoj(int i, int i2, int i3) {
        int a;
        uoe e;
        Throwable th;
        int i4 = 0;
        uhy.a(i > 0);
        uhy.a(i2 > 0);
        uol uol = b;
        this.c = i;
        this.d = i2;
        this.e = (EGL10) EGLContext.getEGL();
        this.f = this.e.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.f != EGL10.EGL_NO_DISPLAY) {
            if (this.e.eglInitialize(this.f, new int[2])) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr = new int[1];
                if (!this.e.eglChooseConfig(this.f, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344}, eGLConfigArr, 1, iArr)) {
                    throw new uoe(String.format("Unable to retrieve list of ES2 frame buffer configurations (EGL error 0x%08x)", new Object[]{Integer.valueOf(this.e.eglGetError())}), new Object[0]);
                } else if (iArr[0] > 0) {
                    this.g = this.e.eglCreateContext(this.f, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    int eglGetError = this.e.eglGetError();
                    if (this.g == null || eglGetError != 12288) {
                        throw new uoe(String.format("Unable to create context (EGL error 0x%08x)", new Object[]{Integer.valueOf(eglGetError)}), new Object[0]);
                    }
                    this.h = this.e.eglCreatePbufferSurface(this.f, eGLConfigArr[0], new int[]{12375, this.c, 12374, this.d, 12344});
                    int eglGetError2 = this.e.eglGetError();
                    EGLContext eGLContext = this.g;
                    if (eGLContext == null || eglGetError2 != 12288) {
                        throw new uoe(String.format("Unable to create surface (EGL error 0x%08x)", new Object[]{Integer.valueOf(eglGetError2)}), new Object[0]);
                    }
                    EGL10 egl10 = this.e;
                    EGLDisplay eGLDisplay = this.f;
                    EGLSurface eGLSurface = this.h;
                    if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                        this.i = ByteBuffer.allocateDirect(a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.i.put(a).position(0);
                        String str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
                        try {
                            eglGetError2 = uoj.a(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            try {
                                a = uoj.a(35632, str);
                            } catch (uoe e2) {
                                e = e2;
                                a = 0;
                                try {
                                    GLES20.glDeleteProgram(i4);
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i4 = a;
                                    GLES20.glDeleteShader(eglGetError2);
                                    GLES20.glDeleteShader(i4);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                GLES20.glDeleteShader(eglGetError2);
                                GLES20.glDeleteShader(i4);
                                throw th;
                            }
                            try {
                                eglGetError = GLES20.glCreateProgram();
                                if (eglGetError != 0) {
                                    try {
                                        GLES20.glAttachShader(eglGetError, eglGetError2);
                                        uoj.a("glAttachShader - vertexShader");
                                        GLES20.glAttachShader(eglGetError, a);
                                        uoj.a("glAttachShader - pixelShader");
                                        GLES20.glLinkProgram(eglGetError);
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(eglGetError, 35714, iArr2, 0);
                                        if (iArr2[0] == 1) {
                                            GLES20.glDeleteShader(eglGetError2);
                                            GLES20.glDeleteShader(a);
                                            this.n = eglGetError;
                                            this.r = uoj.b(eglGetError, "aPosition");
                                            this.s = uoj.b(this.n, "aTextureCoord");
                                            this.p = uoj.c(this.n, "uMVPMatrix");
                                            this.q = uoj.c(this.n, "uSTMatrix");
                                            int[] iArr3 = new int[1];
                                            GLES20.glGenTextures(1, iArr3, 0);
                                            int i5 = iArr3[0];
                                            this.o = i5;
                                            GLES20.glBindTexture(36197, i5);
                                            uoj.a("glBindTexture");
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            uoj.a("glTexParameter");
                                            this.t = uol.a(this.o);
                                            this.t.setOnFrameAvailableListener(this);
                                            this.u = new Surface(this.t);
                                            this.w = ByteBuffer.allocateDirect((i * i2) << 2);
                                            this.w.order(ByteOrder.LITTLE_ENDIAN);
                                            Matrix.setIdentityM(this.k, 0);
                                            Matrix.translateM(this.k, 0, 0.5f, 0.5f, 0.0f);
                                            Matrix.rotateM(this.k, 0, (float) i3, 0.0f, 0.0f, 1.0f);
                                            Matrix.translateM(this.k, 0, -0.5f, -0.5f, 0.0f);
                                            return;
                                        }
                                        throw new uoe("Could not link program:\n%s", GLES20.glGetProgramInfoLog(eglGetError));
                                    } catch (uoe e3) {
                                        e = e3;
                                        i4 = eglGetError;
                                        GLES20.glDeleteProgram(i4);
                                        throw e;
                                    }
                                }
                                throw new uoe("Unable to create program", new Object[0]);
                            } catch (uoe e4) {
                                e = e4;
                                GLES20.glDeleteProgram(i4);
                                throw e;
                            }
                        } catch (uoe e5) {
                            e = e5;
                            eglGetError2 = 0;
                            a = 0;
                            GLES20.glDeleteProgram(i4);
                            throw e;
                        } catch (Throwable th4) {
                            th = th4;
                            eglGetError2 = 0;
                            GLES20.glDeleteShader(eglGetError2);
                            GLES20.glDeleteShader(i4);
                            throw th;
                        }
                    }
                    throw new uoe(String.format("eglMakeCurrent failed (EGL error 0x%08x)", new Object[]{Integer.valueOf(this.e.eglGetError())}), new Object[0]);
                } else {
                    throw new uoe("Unable to find RGB888+recordable ES2 EGL config", new Object[0]);
                }
            }
            throw new uoe("unable to initialize EGL", new Object[0]);
        }
        throw new uoe("unable to get EGL display", new Object[0]);
    }

    public final void c() {
        uhy.b(this.f != EGL10.EGL_NO_DISPLAY);
        GLES20.glDeleteProgram(this.n);
        this.n = 0;
        this.e.eglDestroySurface(this.f, this.h);
        this.e.eglDestroyContext(this.f, this.g);
        this.e.eglMakeCurrent(this.f, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        this.e.eglTerminate(this.f);
        this.f = EGL10.EGL_NO_DISPLAY;
        this.g = EGL10.EGL_NO_CONTEXT;
        this.h = EGL10.EGL_NO_SURFACE;
        this.u.release();
        this.u = null;
        this.t.release();
        this.t = null;
    }

    public final Surface a() {
        return this.u;
    }

    public final Bitmap b() {
        synchronized (this.v) {
            long currentTimeMillis = System.currentTimeMillis() + 2500;
            while (!this.v.get()) {
                this.v.wait(Math.max(1, 2500 - System.currentTimeMillis()));
                if (System.currentTimeMillis() > currentTimeMillis) {
                    if (!this.v.get()) {
                        throw new uoe("frame wait timed out", new Object[0]);
                    }
                }
            }
            if (this.v.getAndSet(false)) {
            } else {
                throw new AssertionError("Frame was not available");
            }
        }
        uoj.a("before updateTexImage");
        this.t.updateTexImage();
        uoj.a("after updateTexImage");
        this.t.getTransformMatrix(this.l);
        Matrix.multiplyMM(this.m, 0, this.k, 0, this.l, 0);
        GLES20.glUseProgram(this.n);
        uoj.a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.o);
        this.i.position(0);
        GLES20.glVertexAttribPointer(this.r, 3, 5126, false, 20, this.i);
        uoj.a("glVertexAttribPointer - handleAPosition");
        GLES20.glEnableVertexAttribArray(this.r);
        uoj.a("glEnableVertexAttribArray - handleAPosition");
        this.i.position(3);
        GLES20.glVertexAttribPointer(this.s, 2, 5126, false, 20, this.i);
        uoj.a("glVertexAttribPointer - handleATextureCoord");
        GLES20.glEnableVertexAttribArray(this.s);
        uoj.a("glEnableVertexAttribArray - handleATextureCoord");
        Matrix.setIdentityM(this.j, 0);
        GLES20.glUniformMatrix4fv(this.p, 1, false, this.j, 0);
        GLES20.glUniformMatrix4fv(this.q, 1, false, this.m, 0);
        GLES20.glDrawArrays(5, 0, 4);
        uoj.a("glDrawArrays");
        GLES20.glBindTexture(36197, 0);
        this.w.rewind();
        GLES20.glReadPixels(0, 0, this.c, this.d, 6408, 5121, this.w);
        Bitmap createBitmap = Bitmap.createBitmap(this.c, this.d, Config.ARGB_8888);
        this.w.rewind();
        createBitmap.copyPixelsFromBuffer(this.w);
        return createBitmap;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.v) {
            this.v.set(true);
            this.v.notifyAll();
        }
    }

    private static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateShader;
            }
            str = GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            throw new uoe("Could not compile shader (Type: %d):\n%s", Integer.valueOf(i), str);
        }
        throw new uoe("Unable to create shader. Type: %d", Integer.valueOf(i));
    }

    private static void a(String str) {
        if (GLES20.glGetError() != 0) {
            throw new uoe("Failed: %s, glError: %d", str, Integer.valueOf(GLES20.glGetError()));
        }
    }

    private static int b(int i, String str) {
        i = GLES20.glGetAttribLocation(i, str);
        if (i >= 0) {
            return i;
        }
        throw new uoe("Unable to find attribute %s", str);
    }

    private static int c(int i, String str) {
        i = GLES20.glGetUniformLocation(i, str);
        if (i >= 0) {
            return i;
        }
        throw new uoe("Unable to find uniform variable %s", str);
    }
}
