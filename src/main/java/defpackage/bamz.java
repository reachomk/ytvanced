package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bamz */
public final class bamz extends bamr {
    private ByteBuffer a;
    private final String b;

    public bamz(String str) {
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final void a(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public final ByteBuffer b() {
        return this.a.duplicate();
    }

    public final String toString() {
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        String a = cim.a(bArr);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 22);
        stringBuilder.append("UnknownEntry{content=");
        stringBuilder.append(a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bamz bamz = (bamz) obj;
        ByteBuffer byteBuffer = this.a;
        ByteBuffer byteBuffer2 = bamz.a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        return byteBuffer != null ? byteBuffer.hashCode() : 0;
    }
}
