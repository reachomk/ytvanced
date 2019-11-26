package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLSurfaceView.EGLWindowSurfaceFactory;
import android.os.Build.VERSION;
import android.view.Display.HdrCapabilities;
import android.view.WindowManager;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: ahop */
final class ahop implements EGLWindowSurfaceFactory {
    public final int a;
    private boolean b;
    private ahoo c;
    private ahoo d;
    private boolean e;
    private String f;
    private int g = 3;
    private int h = 3;

    ahop(Context context) {
        boolean z = VERSION.SDK_INT >= 26 && context.getResources().getConfiguration().isScreenWideColorGamut();
        this.b = z;
        this.d = new ahoo(0);
        this.d.a(12344, 12344);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        int i = 500;
        if (windowManager != null && VERSION.SDK_INT >= 24) {
            HdrCapabilities hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities();
            if (hdrCapabilities != null) {
                i = Math.max((int) hdrCapabilities.getDesiredMaxLuminance(), 500);
            }
        }
        this.a = i;
    }

    public final EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        int[] iArr;
        if (this.e && this.b) {
            iArr = this.c.a;
        } else {
            iArr = this.d.a;
        }
        return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, iArr);
    }

    public final void a(boolean z) {
        this.e = z;
        if (z && this.f == null) {
            String a;
            StringBuilder stringBuilder;
            this.f = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            String valueOf = String.valueOf(this.f);
            String str = "Extensions:";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            str = "GlWindowFactory";
            String str2 = " ";
            if (this.b) {
                int i;
                if (this.f.contains("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    this.h = 1;
                    this.g = 1;
                    i = 13120;
                } else if (!this.f.contains("EGL_EXT_gl_colorspace_display_p3") || VERSION.SDK_INT > 28) {
                    this.b = false;
                    this.e = false;
                    this.g = 3;
                    this.h = 3;
                    a = ahsk.a(3);
                    valueOf = ahsn.a(this.g);
                    stringBuilder = new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(valueOf).length());
                    stringBuilder.append(a);
                    stringBuilder.append(str2);
                    stringBuilder.append(valueOf);
                    xtl.a(str, stringBuilder.toString());
                    return;
                } else {
                    this.h = 2;
                    this.g = 3;
                    i = 13155;
                }
                this.c = new ahoo(1);
                this.c.a(12445, i);
                this.c.a(12344, 12344);
                this.d = new ahoo(1);
                this.d.a(12445, 12426);
                this.d.a(12344, 12344);
            } else {
                this.g = 3;
                this.h = 2;
            }
            a = ahsk.a(this.h);
            valueOf = ahsn.a(this.g);
            stringBuilder = new StringBuilder((String.valueOf(a).length() + 1) + String.valueOf(valueOf).length());
            stringBuilder.append(a);
            stringBuilder.append(str2);
            stringBuilder.append(valueOf);
            xtl.a(str, stringBuilder.toString());
        }
    }

    public final void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }

    public final int a() {
        return this.e ? this.g : 3;
    }

    public final int b() {
        return this.e ? this.h : 3;
    }
}
