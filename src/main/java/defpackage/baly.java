package defpackage;

import java.nio.ByteBuffer;

/* renamed from: baly */
public final class baly extends balz {
    public baly() {
        super("esds");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        baly baly = (baly) obj;
        ByteBuffer byteBuffer = this.a;
        ByteBuffer byteBuffer2 = baly.a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        return byteBuffer != null ? byteBuffer.hashCode() : 0;
    }
}
