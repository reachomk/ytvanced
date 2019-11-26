package defpackage;

import android.opengl.EGL14;
import android.opengl.GLES20;

/* renamed from: abyx */
public final class abyx {
    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String toHexString = Integer.toHexString(glGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 12) + String.valueOf(toHexString).length());
            stringBuilder.append(str);
            stringBuilder.append(": glError 0x");
            stringBuilder.append(toHexString);
            str = stringBuilder.toString();
            xtl.c(str);
            throw new abyw(str);
        }
    }

    public static void b(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            String toHexString = Integer.toHexString(eglGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 14) + String.valueOf(toHexString).length());
            stringBuilder.append(str);
            stringBuilder.append(": EGL error 0x");
            stringBuilder.append(toHexString);
            str = stringBuilder.toString();
            xtl.c(str);
            throw new abyw(str);
        }
    }

    public static void a(int i, String str) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
            stringBuilder.append("Unable to locate '");
            stringBuilder.append(str);
            stringBuilder.append("' in program");
            throw new abyw(stringBuilder.toString());
        }
    }
}
