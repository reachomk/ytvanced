package defpackage;

import android.opengl.GLSurfaceView.EGLContextFactory;
import android.opengl.GLSurfaceView.EGLWindowSurfaceFactory;
import android.os.Build;
import android.util.Log;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: bafg */
public final class bafg implements EGLContextFactory, EGLWindowSurfaceFactory {
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public int e = 2;
    public EGLContext f = EGL10.EGL_NO_CONTEXT;

    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        IntBuffer allocate = IntBuffer.allocate(10);
        allocate.put(12440);
        allocate.put(this.e);
        if (this.c) {
            allocate.put(12540);
            allocate.put(1);
        }
        String str = "GvrEglFactory";
        if (this.a) {
            if (Build.FINGERPRINT.contains("generic_x86")) {
                Log.w(str, "EGL_CONTEXT_PRIORITY_LEVEL not supported on emulators.");
            } else {
                allocate.put(12544);
                allocate.put(12545);
            }
        }
        if (this.b && bafg.a(egl10, eGLDisplay)) {
            allocate.put(12992);
            allocate.put(1);
        }
        if (!this.d && egl10.eglQueryString(eGLDisplay, 12373).contains("EGL_KHR_create_context_no_error")) {
            allocate.put(12723);
            allocate.put(1);
        }
        while (allocate.hasRemaining()) {
            allocate.put(12344);
        }
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, this.f, allocate.array());
        if (eglCreateContext == null || eglCreateContext == EGL10.EGL_NO_CONTEXT) {
            int i = this.e;
            if (i > 2) {
                StringBuilder stringBuilder = new StringBuilder(65);
                stringBuilder.append("Failed to create EGL context with version ");
                stringBuilder.append(i);
                stringBuilder.append(", will try 2");
                Log.w(str, stringBuilder.toString());
                allocate.array()[1] = 2;
                return egl10.eglCreateContext(eGLDisplay, eGLConfig, this.f, allocate.array());
            }
        }
        return eglCreateContext;
    }

    public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }

    public final EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        EGLSurface eGLSurface = null;
        int[] iArr = (this.b && bafg.a(egl10, eGLDisplay)) ? new int[]{12992, 1, 12344} : null;
        try {
            eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, iArr);
            return eGLSurface;
        } catch (IllegalArgumentException e) {
            Log.e("GvrEglFactory", "eglCreateWindowSurface", e);
            return eGLSurface;
        }
    }

    public final void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }

    private static boolean a(EGL10 egl10, EGLDisplay eGLDisplay) {
        return egl10.eglQueryString(eGLDisplay, 12373).contains("EGL_EXT_protected_content");
    }
}
