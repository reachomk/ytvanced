package defpackage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: ahso */
public final class ahso {
    private final int a;
    private final int b;
    private final int c;
    private int d = 0;

    public ahso(float[] fArr, int i) {
        amqw.a((Object) fArr);
        amqw.a(fArr.length % i == 0);
        this.c = i;
        this.b = i << 2;
        this.a = 5126;
        FloatBuffer a = ahsl.a(fArr);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        ahsl.a(iArr[0]);
        i = iArr[0];
        this.d = i;
        GLES20.glBindBuffer(34962, i);
        GLES20.glBufferData(34962, a.capacity() << 2, a, 35044);
        GLES20.glBindBuffer(34962, 0);
        ahsl.b();
        a.clear();
    }

    public final void a(int i) {
        int i2 = this.d;
        if (i2 != 0) {
            GLES20.glBindBuffer(34962, i2);
            GLES20.glVertexAttribPointer(i, this.c, this.a, false, this.b, 0);
            GLES20.glBindBuffer(34962, 0);
            ahsl.b();
        }
    }

    public final void a() {
        if (this.d != 0) {
            GLES20.glDeleteBuffers(1, new int[]{this.d}, 0);
            this.d = 0;
            ahsl.b();
        }
    }
}
