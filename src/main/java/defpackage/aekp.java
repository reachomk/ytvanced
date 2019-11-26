package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aekp */
public final class aekp {
    public final aekq a;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 1;
    private final byte[] f = new byte[5];
    private int g = 0;

    public aekp(aekq aekq) {
        this.a = aekq;
    }

    public final Integer a(ByteBuffer byteBuffer) {
        if (this.g == 0 && byteBuffer.remaining() == 0) {
            return null;
        }
        int a;
        if (this.g == 0) {
            a = aekk.a(byteBuffer.get(byteBuffer.position()));
        } else {
            a = aekk.a(this.f[0]) - this.g;
        }
        if (a <= 0) {
            throw new aekl(6, "MultipartParser: data present but parser claims not needed");
        } else if (byteBuffer.remaining() >= a) {
            byteBuffer.get(this.f, this.g, a);
            this.g = 0;
            return aekk.a(ByteBuffer.wrap(this.f));
        } else {
            a = byteBuffer.remaining();
            byteBuffer.get(this.f, this.g, byteBuffer.remaining());
            this.g += a;
            return null;
        }
    }
}
