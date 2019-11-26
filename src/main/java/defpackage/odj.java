package defpackage;

import java.nio.ByteBuffer;

/* renamed from: odj */
public class odj extends odg {
    public final odf a = new odf();
    public ByteBuffer b;
    public long c;
    private final int d;

    public static odj a() {
        return new odj(0);
    }

    public odj(int i) {
        this.d = i;
    }

    public final void a(int i) {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer == null) {
            this.b = b(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.b.position();
        i += position;
        if (capacity < i) {
            ByteBuffer b = b(i);
            if (position > 0) {
                this.b.position(0);
                this.b.limit(position);
                b.put(this.b);
            }
            this.b = b;
        }
    }

    public final boolean b() {
        return this.b == null && this.d == 0;
    }

    public final boolean c() {
        return getFlag(1073741824);
    }

    public final void d() {
        this.b.flip();
    }

    public final void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    private final ByteBuffer b(int i) {
        int i2 = this.d;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.b;
        i2 = byteBuffer != null ? byteBuffer.capacity() : 0;
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("Buffer too small (");
        stringBuilder.append(i2);
        stringBuilder.append(" < ");
        stringBuilder.append(i);
        stringBuilder.append(")");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
