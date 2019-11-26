package defpackage;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.os.Build;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: bagb */
public final class bagb implements EGLConfigChooser {
    private static final boolean b = Build.FINGERPRINT.contains("generic_x86");
    private final boolean a = true;

    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12352, 64, 12339, 4100, 12344};
        int[] iArr2 = new int[1];
        String str = "eglChooseConfig failed";
        if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2) || !this.a || b) {
            iArr[15] = 4;
            if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2)) {
                int i = 0;
                int i2 = iArr2[0];
                if (i2 > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                    if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i2, iArr2)) {
                        EGLConfig eGLConfig;
                        boolean z = this.a;
                        if (b) {
                            eGLConfig = eGLConfigArr[0];
                        } else {
                            while (i < i2) {
                                EGLConfig eGLConfig2 = eGLConfigArr[i];
                                int a = bagb.a(egl10, eGLDisplay, eGLConfig2, 12325);
                                int a2 = bagb.a(egl10, eGLDisplay, eGLConfig2, 12326);
                                int a3 = bagb.a(egl10, eGLDisplay, eGLConfig2, 12324);
                                int a4 = bagb.a(egl10, eGLDisplay, eGLConfig2, 12323);
                                int a5 = bagb.a(egl10, eGLDisplay, eGLConfig2, 12322);
                                int a6 = bagb.a(egl10, eGLDisplay, eGLConfig2, 12339);
                                if (a3 == 8 && a4 == 8 && a5 == 8 && a == 0 && a2 == 0 && !(z && (a6 & 4096) == 0)) {
                                    eGLConfig = eGLConfig2;
                                    break;
                                }
                                i++;
                            }
                            eGLConfig = null;
                        }
                        if (eGLConfig != null) {
                            return eGLConfig;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    private static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }
}
