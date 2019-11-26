package defpackage;

import java.nio.ByteBuffer;

@bamh(a = {20})
/* renamed from: bamn */
public final class bamn extends bama {
    private int d;

    public final void a(ByteBuffer byteBuffer) {
        this.d = cio.d(byteBuffer);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=");
        stringBuilder.append(Integer.toHexString(this.d));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.d == ((bamn) obj).d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }
}
