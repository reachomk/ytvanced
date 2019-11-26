package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bamw */
public final class bamw extends bamr {
    private boolean a;

    public final String a() {
        return "tele";
    }

    public final void a(ByteBuffer byteBuffer) {
        this.a = (byteBuffer.get() & 128) == 128;
    }

    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (!this.a ? 0 : 128));
        allocate.rewind();
        return allocate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.a == ((bamw) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TemporalLevelEntry{levelIndependentlyDecodable=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
