package defpackage;

import java.nio.ByteBuffer;

/* renamed from: odb */
final class odb extends ock {
    public int b;
    public int g;
    public long h;
    private boolean i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = ozp.f;
    private int n;

    public final boolean a(int i, int i2, int i3) {
        if (i3 == 2) {
            i3 = this.n;
            if (i3 > 0) {
                this.h += (long) (i3 / this.j);
            }
            i3 = ozp.b(2, i2);
            this.j = i3;
            int i4 = this.g;
            this.m = new byte[(i4 * i3)];
            this.n = 0;
            int i5 = this.b;
            this.l = i3 * i5;
            boolean z = this.i;
            boolean z2 = (i5 == 0 && i4 == 0) ? false : true;
            this.i = z2;
            this.k = false;
            b(i, i2, 2);
            if (z != this.i) {
                return true;
            }
            return false;
        }
        throw new obp(i, i2, i3);
    }

    public final boolean a() {
        return this.i;
    }

    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            this.k = true;
            int min = Math.min(i, this.l);
            this.h += (long) (min / this.j);
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l <= 0) {
                i -= min;
                position = (this.n + i) - this.m.length;
                ByteBuffer a = a(position);
                int a2 = ozp.a(position, 0, this.n);
                a.put(this.m, 0, a2);
                position = ozp.a(position - a2, 0, i);
                byteBuffer.limit(byteBuffer.position() + position);
                a.put(byteBuffer);
                byteBuffer.limit(limit);
                i -= position;
                position = this.n - a2;
                this.n = position;
                byte[] bArr = this.m;
                System.arraycopy(bArr, a2, bArr, 0, position);
                byteBuffer.get(this.m, this.n, i);
                this.n += i;
                a.flip();
            }
        }
    }

    public final ByteBuffer f() {
        if (super.g()) {
            int i = this.n;
            if (i > 0) {
                a(i).put(this.m, 0, this.n).flip();
                this.n = 0;
            }
        }
        return super.f();
    }

    public final boolean g() {
        return super.g() && this.n == 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        if (this.k) {
            this.l = 0;
        }
        this.n = 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final void j() {
        this.m = ozp.f;
    }
}
