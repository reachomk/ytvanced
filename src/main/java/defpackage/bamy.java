package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bamy */
public final class bamy extends bamr {
    private boolean a;
    private short b;

    public final String a() {
        return "rap ";
    }

    public final void a(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        this.a = (b & 128) == 128;
        this.b = (short) (b & 127);
    }

    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((!this.a ? 0 : 128) | (this.b & 127)));
        allocate.rewind();
        return allocate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bamy bamy = (bamy) obj;
            return this.b == bamy.b && this.a == bamy.a;
        }
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VisualRandomAccessEntry{numLeadingSamplesKnown=");
        stringBuilder.append(this.a);
        stringBuilder.append(", numLeadingSamples=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
