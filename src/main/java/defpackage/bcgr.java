package defpackage;

import android.opengl.GLES20;

/* renamed from: bcgr */
final class bcgr {
    static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder.append(str);
            stringBuilder.append(": glError ");
            stringBuilder.append(glGetError);
            throw new RuntimeException(stringBuilder.toString());
        }
    }
}
