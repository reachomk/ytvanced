package defpackage;

import android.opengl.GLES20;

/* renamed from: abyv */
public final class abyv implements abzk {
    public int a = 1;
    public int b = 1;
    private final abyu c;
    private int d;
    private int e;

    public abyv(abyu abyu) {
        this.c = abyu;
    }

    public final boolean a(boolean z, abzm abzm, abyq abyq) {
        int[] iArr;
        if (this.d == 0) {
            iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.d = iArr[0];
            GLES20.glGenTextures(1, iArr, 0);
            this.e = iArr[0];
            GLES20.glBindFramebuffer(36160, this.d);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.e);
            GLES20.glTexImage2D(3553, 0, 6408, this.a, this.b, 0, 6408, 5121, null);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.e, 0);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus == 36053) {
                this.c.a(this.e);
            } else {
                String valueOf = String.valueOf(this);
                int glGetError = GLES20.glGetError();
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 78);
                stringBuilder.append(valueOf);
                stringBuilder.append(": Failed to set up render buffer with status ");
                stringBuilder.append(glCheckFramebufferStatus);
                stringBuilder.append(" and error ");
                stringBuilder.append(glGetError);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        iArr = new int[4];
        GLES20.glGetIntegerv(2978, iArr, 0);
        GLES20.glBindFramebuffer(36160, this.d);
        GLES20.glViewport(0, 0, this.a, this.b);
        abzm abzm2 = abzm;
        abzm2.a(z, this.a, this.b, abzm.a);
        this.c.a();
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        return true;
    }

    public final void a(abyq abyq) {
        a();
    }

    public final void a() {
        if (this.d != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.d}, 0);
            this.d = 0;
        }
        if (this.e != 0) {
            GLES20.glDeleteTextures(1, new int[]{this.e}, 0);
            this.e = 0;
        }
    }

    public final void a(int i, int i2) {
        if (this.a != i || this.b != i2) {
            this.a = i;
            this.b = i2;
            a();
        }
    }
}
