package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: odc */
public final class odc implements obq {
    public int b = -1;
    public int c = -1;
    public float d = 1.0f;
    public float e = 1.0f;
    public int f = -1;
    public boolean g;
    public long h;
    public long i;
    private int j = -1;
    private ocz k;
    private ByteBuffer l = a;
    private ShortBuffer m = this.l.asShortBuffer();
    private ByteBuffer n = a;
    private boolean o;

    public final int c() {
        return 2;
    }

    public final float a(float f) {
        f = ozp.a(f, 0.1f, 8.0f);
        if (this.d != f) {
            this.d = f;
            this.g = true;
        }
        h();
        return f;
    }

    public final boolean a(int i, int i2, int i3) {
        if (i3 == 2) {
            i3 = this.j;
            if (i3 == -1) {
                i3 = i;
            }
            if (this.c == i && this.b == i2 && this.f == i3) {
                return false;
            }
            this.c = i;
            this.b = i2;
            this.f = i3;
            this.g = true;
            return true;
        }
        throw new obp(i, i2, i3);
    }

    public final boolean a() {
        boolean z = false;
        if (this.c != -1) {
            if (Math.abs(this.d - 4.0f) >= 0.01f || Math.abs(this.e - 4.0f) >= 0.01f) {
                z = true;
            } else if (this.f == this.c) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final int b() {
        return this.b;
    }

    public final int d() {
        return this.f;
    }

    public final void a(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer;
        int remaining;
        ocz ocz = (ocz) oxz.a(this.k);
        if (byteBuffer.hasRemaining()) {
            asShortBuffer = byteBuffer.asShortBuffer();
            remaining = byteBuffer.remaining();
            this.h += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = ocz.a;
            remaining2 /= i;
            i *= remaining2;
            ocz.f = ocz.a(ocz.f, ocz.g, remaining2);
            asShortBuffer.get(ocz.f, ocz.g * ocz.a, (i + i) / 2);
            ocz.g += remaining2;
            ocz.a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i2 = ocz.i * this.b;
        i2 += i2;
        if (i2 > 0) {
            if (this.l.capacity() < i2) {
                this.l = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                this.m = this.l.asShortBuffer();
            } else {
                this.l.clear();
                this.m.clear();
            }
            asShortBuffer = this.m;
            remaining = Math.min(asShortBuffer.remaining() / ocz.a, ocz.i);
            asShortBuffer.put(ocz.h, 0, ocz.a * remaining);
            int i3 = ocz.i - remaining;
            ocz.i = i3;
            short[] sArr = ocz.h;
            int i4 = ocz.a;
            System.arraycopy(sArr, remaining * i4, sArr, 0, i3 * i4);
            this.i += (long) i2;
            this.l.limit(i2);
            this.n = this.l;
        }
    }

    public final void e() {
        ocz ocz = this.k;
        if (ocz != null) {
            int i;
            int i2 = ocz.g;
            float f = ocz.b;
            float f2 = ocz.c;
            int i3 = ocz.i + ((int) ((((((float) i2) / (f / f2)) + ((float) ocz.j)) / (ocz.d * f2)) + 0.5f));
            short[] sArr = ocz.f;
            int i4 = ocz.e;
            ocz.f = ocz.a(sArr, i2, (i4 + i4) + i2);
            i4 = 0;
            while (true) {
                i = ocz.e;
                i += i;
                int i5 = ocz.a;
                if (i4 >= i * i5) {
                    break;
                }
                ocz.f[(i5 * i2) + i4] = (short) 0;
                i4++;
            }
            ocz.g += i;
            ocz.a();
            if (ocz.i > i3) {
                ocz.i = i3;
            }
            ocz.g = 0;
            ocz.m = 0;
            ocz.j = 0;
        }
        this.o = true;
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.n;
        this.n = a;
        return byteBuffer;
    }

    public final boolean g() {
        boolean z = false;
        if (this.o) {
            ocz ocz = this.k;
            if (ocz == null) {
                z = true;
            } else if (ocz.i != 0) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final void h() {
        if (a()) {
            if (this.g) {
                this.k = new ocz(this.c, this.b, this.d, this.e, this.f);
            } else {
                ocz ocz = this.k;
                if (ocz != null) {
                    ocz.g = 0;
                    ocz.i = 0;
                    ocz.j = 0;
                    ocz.k = 0;
                    ocz.l = 0;
                    ocz.m = 0;
                    ocz.n = 0;
                    ocz.o = 0;
                    ocz.p = 0;
                    ocz.q = 0;
                }
            }
        }
        this.n = a;
        this.h = 0;
        this.i = 0;
        this.o = false;
    }

    public final void i() {
        this.d = 1.0f;
        this.e = 1.0f;
        this.b = -1;
        this.c = -1;
        this.f = -1;
        this.l = a;
        this.m = this.l.asShortBuffer();
        this.n = a;
        this.j = -1;
        this.g = false;
        this.k = null;
        this.h = 0;
        this.i = 0;
        this.o = false;
    }
}
