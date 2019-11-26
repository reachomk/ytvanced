package defpackage;

import java.io.IOException;

/* renamed from: nvj */
public final class nvj implements nvo {
    private final byte[] a;
    private int b;
    private int c;

    public nvj(byte[] bArr) {
        nwf.a((Object) bArr);
        nwf.a(bArr.length > 0);
        this.a = bArr;
    }

    public final void b() {
    }

    public final long a(nvq nvq) {
        long j = nvq.d;
        int i = (int) j;
        this.b = i;
        long j2 = nvq.e;
        int length = (int) (j2 == -1 ? ((long) this.a.length) - j : j2);
        this.c = length;
        if (length > 0 && i + length <= this.a.length) {
            return (long) length;
        }
        int length2 = this.a.length;
        StringBuilder stringBuilder = new StringBuilder(77);
        stringBuilder.append("Unsatisfiable range: [");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(j2);
        stringBuilder.append("], length: ");
        stringBuilder.append(length2);
        throw new IOException(stringBuilder.toString());
    }

    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.c;
        if (i3 == 0) {
            return -1;
        }
        i2 = Math.min(i2, i3);
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
        this.c -= i2;
        return i2;
    }
}
