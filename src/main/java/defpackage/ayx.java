package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* renamed from: ayx */
public final class ayx {
    public int a;
    public final int b;
    private final boolean c;

    public static ayx a(int i) {
        return new ayx(i, 3553, false);
    }

    public static ayx a() {
        return new ayx(ayv.a(), 3553, true);
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        int i4 = this.b;
        GLES20.glBindTexture(i4, i3);
        GLES20.glTexImage2D(i4, 0, 6408, i, i2, 0, 6408, 5121, null);
        ayv.a("glTexImage2D");
        ayv.b();
    }

    public final void a(Bitmap bitmap) {
        int i = this.a;
        int i2 = this.b;
        GLES20.glBindTexture(i2, i);
        GLUtils.texImage2D(i2, 0, bitmap, 0);
        ayv.a("glTexImage2D");
        ayv.b();
    }

    public final void b() {
        if (GLES20.glIsTexture(this.a) && this.c) {
            int[] iArr = new int[]{this.a};
            String str = "glDeleteTextures";
            ayv.b(str);
            GLES20.glDeleteTextures(1, iArr, 0);
            ayv.a(str);
        }
        this.a = 0;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("TextureSource(id=");
        stringBuilder.append(i);
        stringBuilder.append(", target=");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ayx(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }
}
