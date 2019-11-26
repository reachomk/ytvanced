package defpackage;

import android.opengl.GLES20;

/* renamed from: zkh */
public final class zkh {
    public static float a(long j) {
        return ((float) j) / 1.0E9f;
    }

    public static long a(float f) {
        return (long) (f * 1.0E9f);
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String toHexString = Integer.toHexString(glGetError);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 30) + String.valueOf(toHexString).length());
            stringBuilder.append("GL Operation '");
            stringBuilder.append(str);
            stringBuilder.append("' caused error ");
            stringBuilder.append(toHexString);
            stringBuilder.append("!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }
}
