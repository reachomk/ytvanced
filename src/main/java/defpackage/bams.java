package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bams */
public final class bams extends bamr {
    private short a;

    public final String a() {
        return "roll";
    }

    public final void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
    }

    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.a);
        allocate.rewind();
        return allocate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.a == ((bams) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
