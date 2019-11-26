package defpackage;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* renamed from: bamp */
public final class bamp extends bama {
    private ByteBuffer d;

    public final void a(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UnknownDescriptor{tag=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sizeOfInstance=");
        stringBuilder.append(this.b);
        stringBuilder.append(", data=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    static {
        Logger.getLogger(bamp.class.getName());
    }
}
