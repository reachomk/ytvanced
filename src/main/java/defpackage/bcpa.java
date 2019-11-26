package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bcpa */
final class bcpa extends bcpi {
    public final bcpj a;
    public final ByteBuffer b;
    public boolean c;
    private final bcks f = new bcoz(this);

    bcpa(int i, bcpj bcpj) {
        if (i > 0) {
            this.b = ByteBuffer.allocate(i);
            this.a = bcpj;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }

    /* Access modifiers changed, original: final */
    public final void a() {
    }

    /* Access modifiers changed, original: final */
    public final void b() {
    }

    public final void write(int i) {
        f();
        this.b.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.b.remaining());
            this.b.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            f();
        }
    }

    public final void close() {
        super.close();
        if (!this.c) {
            this.c = true;
            this.b.flip();
        }
    }

    /* Access modifiers changed, original: final */
    public final bcks c() {
        return this.f;
    }

    private final void f() {
        if (!this.b.hasRemaining()) {
            d();
            this.b.flip();
            this.a.a();
            e();
        }
    }
}
