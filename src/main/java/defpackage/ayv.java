package defpackage;

import android.opengl.GLES20;
import android.os.Looper;

/* renamed from: ayv */
public final class ayv {
    public static int a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        ayv.a("glGenTextures");
        return iArr[0];
    }

    public static void b() {
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        ayv.a("glTexParameteri");
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

    public static void b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
            stringBuilder.append("Attempting to perform GL operation '");
            stringBuilder.append(str);
            stringBuilder.append("' on UI thread!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }
}
