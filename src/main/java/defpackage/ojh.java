package defpackage;

import java.util.Arrays;

/* renamed from: ojh */
final class ojh {
    public static final byte[] a = new byte[]{(byte) 0, (byte) 0, (byte) 1};
    public boolean b;
    public int c;
    public int d;
    public byte[] e = new byte[128];

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            i2 -= i;
            byte[] bArr2 = this.e;
            int i3 = this.c + i2;
            if (bArr2.length < i3) {
                this.e = Arrays.copyOf(bArr2, i3 + i3);
            }
            System.arraycopy(bArr, i, this.e, this.c, i2);
            this.c += i2;
        }
    }
}
