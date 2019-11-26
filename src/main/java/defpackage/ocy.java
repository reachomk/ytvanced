package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ocy */
public final class ocy extends ock {
    public boolean b;
    public long g;
    private int h;
    private byte[] i = ozp.f;
    private byte[] j = ozp.f;
    private int k;
    private int l;
    private int m;
    private boolean n;

    public final boolean a(int i, int i2, int i3) {
        if (i3 == 2) {
            this.h = i2 + i2;
            return b(i, i2, 2);
        }
        throw new obp(i, i2, i3);
    }

    public final boolean a() {
        return this.c != -1 && this.b;
    }

    public final void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.f.hasRemaining()) {
            int i = this.k;
            int b;
            if (i == 0) {
                int limit;
                i = byteBuffer.limit();
                byteBuffer.limit(Math.min(i, byteBuffer.position() + this.i.length));
                for (limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
                    if (Math.abs(byteBuffer.get(limit)) > 4) {
                        int i2 = this.h;
                        limit = ((limit / i2) * i2) + i2;
                        break;
                    }
                }
                limit = byteBuffer.position();
                if (limit == byteBuffer.position()) {
                    this.k = 1;
                } else {
                    byteBuffer.limit(limit);
                    limit = byteBuffer.remaining();
                    a(limit).put(byteBuffer).flip();
                    if (limit > 0) {
                        this.n = true;
                    }
                }
                byteBuffer.limit(i);
            } else if (i == 1) {
                i = byteBuffer.limit();
                b = b(byteBuffer);
                int position = b - byteBuffer.position();
                byte[] bArr = this.i;
                int length = bArr.length;
                int i3 = this.l;
                length -= i3;
                if (b < i && position < length) {
                    a(bArr, i3);
                    this.l = 0;
                    this.k = 0;
                } else {
                    b = Math.min(position, length);
                    byteBuffer.limit(byteBuffer.position() + b);
                    byteBuffer.get(this.i, this.l, b);
                    position = this.l + b;
                    this.l = position;
                    byte[] bArr2 = this.i;
                    if (position == bArr2.length) {
                        if (this.n) {
                            a(bArr2, this.m);
                            long j = this.g;
                            b = this.l;
                            length = this.m;
                            this.g = j + ((long) ((b - (length + length)) / this.h));
                        } else {
                            this.g += (long) ((position - this.m) / this.h);
                            b = position;
                        }
                        a(byteBuffer, this.i, b);
                        this.l = 0;
                        this.k = 2;
                    }
                    byteBuffer.limit(i);
                }
            } else if (i == 2) {
                i = byteBuffer.limit();
                b = b(byteBuffer);
                byteBuffer.limit(b);
                this.g += (long) (byteBuffer.remaining() / this.h);
                a(byteBuffer, this.j, this.m);
                if (b < i) {
                    a(this.j, this.m);
                    this.k = 0;
                    byteBuffer.limit(i);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void k() {
        int i = this.l;
        if (i > 0) {
            a(this.i, i);
        }
        if (!this.n) {
            this.g += (long) (this.m / this.h);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        if (a()) {
            int a = a(150000) * this.h;
            if (this.i.length != a) {
                this.i = new byte[a];
            }
            a = a(20000) * this.h;
            this.m = a;
            if (this.j.length != a) {
                this.j = new byte[a];
            }
        }
        this.k = 0;
        this.g = 0;
        this.l = 0;
        this.n = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        this.b = false;
        this.m = 0;
        this.i = ozp.f;
        this.j = ozp.f;
    }

    private final void a(byte[] bArr, int i) {
        a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.n = true;
        }
    }

    private final void a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.m);
        int i2 = this.m - min;
        System.arraycopy(bArr, i - i2, this.j, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.j, i2, min);
    }

    private final int a(long j) {
        return (int) ((j * ((long) this.c)) / 1000000);
    }

    private final int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position() + 1;
        while (position < byteBuffer.limit()) {
            if (Math.abs(byteBuffer.get(position)) <= 4) {
                position += 2;
            } else {
                int i = this.h;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }
}
