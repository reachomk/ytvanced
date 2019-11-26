package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ckh */
public final class ckh extends bakn {
    private byte[] a;

    public ckh(byte[] bArr) {
        super("uuid", bArr);
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) this.a.length;
    }

    public final String toString() {
        String str = this.h;
        String str2 = new String(this.i);
        int length = this.a.length;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 50) + str2.length());
        stringBuilder.append("UserBox[type=");
        stringBuilder.append(str);
        stringBuilder.append(";userType=");
        stringBuilder.append(str2);
        stringBuilder.append(";contentLength=");
        stringBuilder.append(length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void a(ByteBuffer byteBuffer) {
        this.a = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
    }
}
