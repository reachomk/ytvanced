package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

@bamh(a = {5})
/* renamed from: bame */
public final class bame extends bama {
    private byte[] d;

    public final void a(ByteBuffer byteBuffer) {
        int i = this.b;
        if (i > 0) {
            this.d = new byte[i];
            byteBuffer.get(this.d);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DecoderSpecificInfo{bytes=");
        byte[] bArr = this.d;
        stringBuilder.append(bArr != null ? cim.a(bArr) : "null");
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (Arrays.equals(this.d, ((bame) obj).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = this.d;
        return bArr != null ? Arrays.hashCode(bArr) : 0;
    }
}
