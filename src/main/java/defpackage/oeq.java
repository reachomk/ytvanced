package defpackage;

import java.nio.ByteBuffer;

/* renamed from: oeq */
final class oeq extends bcks {
    private final byte[] a;
    private int b;

    public oeq(byte[] bArr) {
        this.a = bArr;
    }

    public final long a() {
        return (long) this.a.length;
    }

    public final void a(bcku bcku, ByteBuffer byteBuffer) {
        int min = Math.min(byteBuffer.remaining(), this.a.length - this.b);
        byteBuffer.put(this.a, this.b, min);
        this.b += min;
        bcku.a(false);
    }

    public final void a(bcku bcku) {
        this.b = 0;
        bcku.a();
    }
}
