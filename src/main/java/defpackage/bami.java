package defpackage;

import java.nio.ByteBuffer;

@bamh(a = {19})
/* renamed from: bami */
public final class bami extends bama {
    private byte[] d;

    public final void a(ByteBuffer byteBuffer) {
        if (a() > 0) {
            this.d = new byte[a()];
            byteBuffer.get(this.d);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExtensionDescriptor{bytes=");
        byte[] bArr = this.d;
        stringBuilder.append(bArr != null ? cim.a(bArr) : "null");
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
