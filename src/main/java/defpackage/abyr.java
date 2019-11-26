package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: abyr */
public final class abyr {
    private static final FloatBuffer k = abyr.a(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer l = abyr.a(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final acaf a;
    private int b;
    private final float[] c = new float[16];
    private final float[] d = new float[16];
    private final float[] e = new float[16];
    private final float[] f = new float[16];
    private int g;
    private acac h;
    private final float i = 1.0f;
    private final float j = 1.0f;

    public abyr(acaf acaf) {
        this.a = acaf;
        Matrix.setIdentityM(this.e, 0);
        a(this.b);
    }

    public final synchronized void a() {
        this.g = 0;
        acac acac = this.h;
        if (acac != null) {
            acac.b();
            this.h = null;
        }
    }

    private final synchronized void a(int i) {
        this.b = i;
    }

    public final synchronized void a(int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        synchronized (this) {
            if (i6 != 0) {
                if (this.g != i6) {
                    GLES20.glBindTexture(3553, i6);
                    GLES20.glTexParameterf(3553, 10241, 9729.0f);
                    GLES20.glTexParameterf(3553, 10240, 9729.0f);
                    GLES20.glTexParameteri(3553, 10242, 33071);
                    GLES20.glTexParameteri(3553, 10243, 33071);
                    abyx.a("glTexParameter");
                    this.g = i6;
                    amqw.b(i6 != 0);
                    this.h = new acac(this.a);
                }
                float f = i4 >= 0 ? 1.0f : -1.0f;
                int abs = Math.abs(i4);
                int i9 = this.b;
                float f2 = ((i9 % 180 == 0 ? ((float) i7) / ((float) i8) : ((float) i8) / ((float) i7)) / (((float) abs) / ((float) i5))) * (this.j / this.i);
                Matrix.setIdentityM(this.f, 0);
                Matrix.translateM(this.f, 0, 0.5f, 0.5f, 0.0f);
                Matrix.rotateM(this.f, 0, (float) i9, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(this.f, 0, -0.5f, -0.5f, 0.0f);
                Matrix.setIdentityM(this.e, 0);
                Matrix.translateM(this.e, 0, 0.0f, 0.0f, 0.0f);
                Matrix.scaleM(this.e, 0, this.i, this.j, 1.0f);
                Matrix.setIdentityM(this.c, 0);
                Matrix.multiplyMM(this.d, 0, this.c, 0, this.f, 0);
                Matrix.translateM(this.d, 0, 0.5f, 0.5f, 0.0f);
                Matrix.scaleM(this.d, 0, f * Math.min(1.0f, 1.0f / f2), Math.min(1.0f, f2), 1.0f);
                Matrix.translateM(this.d, 0, -0.5f, -0.5f, 0.0f);
                this.h.b(3553, i6);
                acac.a(3553, i6);
                this.h.a("u_MVPMatrix", this.e);
                this.h.a("u_TextureMatrix", this.d);
                this.h.a("a_Position", k);
                this.h.a("a_TextureCoord", l);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glGetError();
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glEnable(3089);
                GLES20.glScissor(0, 0, abs, 1);
                GLES20.glClear(16384);
                GLES20.glDisable(3089);
                this.h.a("a_Position");
                this.h.a("a_TextureCoord");
                acac.a();
                return;
            }
        }
    }

    private static FloatBuffer a(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).rewind();
        return asFloatBuffer;
    }
}
