package defpackage;

import java.util.Arrays;

/* renamed from: ntx */
final class ntx {
    public boolean a;
    public int b;
    public int c;
    public byte[] d = new byte[128];

    public final void a(byte[] bArr, int i, int i2) {
        if (this.a) {
            i2 -= i;
            byte[] bArr2 = this.d;
            int i3 = this.b + i2;
            if (bArr2.length < i3) {
                this.d = Arrays.copyOf(bArr2, i3 + i3);
            }
            System.arraycopy(bArr, i, this.d, this.b, i2);
            this.b += i2;
        }
    }
}
