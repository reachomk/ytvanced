package defpackage;

import android.opengl.GLES20;

/* renamed from: zij */
public final class zij {
    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String toHexString = Integer.toHexString(glGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 14) + String.valueOf(toHexString).length());
            stringBuilder.append(str);
            stringBuilder.append(": GL error: 0x");
            stringBuilder.append(toHexString);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String toHexString = Integer.toHexString(glGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 14) + String.valueOf(toHexString).length());
            stringBuilder.append(str);
            stringBuilder.append(": GL error: 0x");
            stringBuilder.append(toHexString);
            xtl.c(stringBuilder.toString());
        }
    }
}
