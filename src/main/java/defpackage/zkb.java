package defpackage;

import android.opengl.GLES20;

/* renamed from: zkb */
final class zkb {
    public final String a;

    public zkb(int i, int i2) {
        int i3 = i;
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i3, 35719, iArr, 0);
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int i4 = iArr[0];
        byte[] bArr = new byte[i4];
        GLES20.glGetActiveUniform(i, i2, i4, new int[1], 0, iArr3, 0, iArr2, 0, bArr, 0);
        int i5 = 0;
        while (true) {
            i4 = bArr.length;
            if (i5 < i4) {
                if (bArr[i5] == (byte) 0) {
                    break;
                }
                i5++;
            } else {
                i5 = i4;
                break;
            }
        }
        this.a = new String(bArr, 0, i5);
        GLES20.glGetUniformLocation(i3, this.a);
        zkh.a("Initializing uniform");
    }
}
