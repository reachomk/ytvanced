package defpackage;

import java.nio.ByteBuffer;

/* renamed from: qvo */
public final class qvo implements quq {
    private static final byte[] a = new byte[0];
    private final qyz b;
    private final quq c;

    public qvo(qyz qyz, quq quq) {
        this.b = qyz;
        this.c = quq;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] e = qvb.b(this.b).e();
        byte[] a = this.c.a(e, a);
        bArr = ((quq) qvb.a(this.b.zzryv, e)).a(bArr, bArr2);
        int length = a.length;
        return ByteBuffer.allocate((length + 4) + bArr.length).putInt(length).put(a).put(bArr).array();
    }
}
