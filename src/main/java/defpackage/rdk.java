package defpackage;

/* renamed from: rdk */
final class rdk extends rdn {
    private final int d;
    private final int e;

    rdk(byte[] bArr, int i, int i2) {
        super(bArr);
        rdg.a(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    public final byte a(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[this.d + i];
        }
        if (i >= 0) {
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Index > length: ");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(22);
        stringBuilder2.append("Index < 0: ");
        stringBuilder2.append(i);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    public final int a() {
        return this.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final int f() {
        return this.d;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(byte[] bArr, int i) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }
}
