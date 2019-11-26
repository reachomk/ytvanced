package defpackage;

import java.nio.ByteBuffer;

@bamh(a = {6})
/* renamed from: bamm */
public final class bamm extends bama {
    public int d;

    public final void b() {
        this.d = 2;
    }

    public final void a(ByteBuffer byteBuffer) {
        this.d = cio.d(byteBuffer);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SLConfigDescriptor{predefined=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.d == ((bamm) obj).d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }
}
