package defpackage;

import java.nio.ByteBuffer;

/* renamed from: nnb */
public final class nnb {
    public final nll a = new nll();
    public ByteBuffer b;
    public int c;
    public int d;
    public long e;
    private final int f;

    public nnb(int i) {
        this.f = i;
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

    public final boolean a() {
        return (this.d & 2) != 0;
    }

    public final boolean b() {
        return (this.d & 134217728) != 0;
    }

    public final boolean c() {
        return (this.d & 1) != 0;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    private final ByteBuffer b(int i) {
        int i2 = this.f;
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
