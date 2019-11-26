package defpackage;

/* renamed from: bbfk */
final class bbfk extends baxf {
    private int a;
    private final int b;
    private final byte[] c;

    bbfk(byte[] bArr) {
        this(bArr, 0, 0);
    }

    bbfk(byte[] bArr, int i, int i2) {
        boolean z = true;
        amqw.a(i >= 0, (Object) "offset must be >= 0");
        amqw.a(i2 >= 0, (Object) "length must be >= 0");
        i2 += i;
        if (i2 > bArr.length) {
            z = false;
        }
        amqw.a(z, (Object) "offset + length exceeds array boundary");
        this.c = (byte[]) amqw.a((Object) bArr, (Object) "bytes");
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final int b() {
        a(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    public final /* synthetic */ bbff c(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new bbfk(this.c, i2, i);
    }
}
