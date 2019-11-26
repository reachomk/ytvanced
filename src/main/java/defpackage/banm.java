package defpackage;

import java.nio.ByteBuffer;

/* renamed from: banm */
public final class banm extends bamr {
    private int a;
    private int b;

    public final String a() {
        return "sync";
    }

    public final void a(ByteBuffer byteBuffer) {
        int d = cio.d(byteBuffer);
        this.a = (d & 192) >> 6;
        this.b = d & 63;
    }

    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        cin.c(allocate, this.b + (this.a << 6));
        return (ByteBuffer) allocate.rewind();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            banm banm = (banm) obj;
            return this.b == banm.b && this.a == banm.a;
        }
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("SyncSampleEntry{reserved=");
        stringBuilder.append(i);
        stringBuilder.append(", nalUnitType=");
        stringBuilder.append(i2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
