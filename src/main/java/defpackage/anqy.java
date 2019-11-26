package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: anqy */
public final class anqy {
    public ByteBuffer a;
    public int b;
    private int c;
    private int[] d;
    private int e;
    private boolean f;
    private boolean g;
    private int h;
    private int[] i;
    private int j;
    private int k;
    private anrb l;
    private final anre m;

    public anqy(int i) {
        anra anra = anra.a;
        anre a = anre.a();
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        if (i <= 0) {
            i = 1;
        }
        this.b = i;
        this.l = anra;
        this.a = anra.a(i);
        this.m = a;
    }

    public anqy() {
        this(1024);
    }

    private final int d() {
        return this.a.capacity() - this.b;
    }

    private final void c(int i, int i2) {
        if (i > this.c) {
            this.c = i;
        }
        int capacity = ((((this.a.capacity() - this.b) + i2) ^ -1) + 1) & (i - 1);
        while (this.b < (capacity + i) + i2) {
            int capacity2 = this.a.capacity();
            ByteBuffer byteBuffer = this.a;
            anrb anrb = this.l;
            int capacity3 = byteBuffer.capacity();
            if ((-1073741824 & capacity3) == 0) {
                int i3 = capacity3 != 0 ? capacity3 + capacity3 : 1;
                byteBuffer.position(0);
                ByteBuffer a = anrb.a(i3);
                a.position(i3 - capacity3);
                a.put(byteBuffer);
                this.a = a;
                this.b += this.a.capacity() - capacity2;
            } else {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
        }
        for (i = 0; i < capacity; i++) {
            ByteBuffer byteBuffer2 = this.a;
            int i4 = this.b - 1;
            this.b = i4;
            byteBuffer2.put(i4, (byte) 0);
        }
    }

    private final void d(int i) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    public final void a(byte b) {
        c(1, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, b);
    }

    private final void a(short s) {
        c(2, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    private final void e(int i) {
        c(4, 0);
        d(i);
    }

    public final void a(int i) {
        c(4, 0);
        d((d() - i) + 4);
    }

    public final void a(int i, int i2, int i3) {
        e();
        this.k = i2;
        i *= i2;
        c(4, i);
        c(i3, i);
        this.f = true;
    }

    public final int a() {
        if (this.f) {
            this.f = false;
            d(this.k);
            return d();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public final int a(CharSequence charSequence) {
        int a = this.m.a(charSequence);
        a((byte) 0);
        a(1, a, 1);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - a;
        this.b = i;
        byteBuffer.position(i);
        this.m.a(charSequence, this.a);
        return a();
    }

    private final void e() {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public final void b(int i) {
        e();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            this.d = new int[i];
        }
        this.e = i;
        Arrays.fill(this.d, 0, i, 0);
        this.f = true;
        this.h = d();
    }

    public final void a(int i, boolean z) {
        if (z) {
            c(1, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 1;
            this.b = i2;
            byteBuffer.put(i2, (byte) 1);
            f(i);
        }
    }

    public final void a(int i, int i2) {
        if (i2 != 0) {
            e(i2);
            f(i);
        }
    }

    public final void a(int i, float f) {
        if (((double) f) != 0.0d) {
            c(4, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 4;
            this.b = i2;
            byteBuffer.putFloat(i2, f);
            f(i);
        }
    }

    public final void b(int i, int i2) {
        if (i2 != 0) {
            a(i2);
            f(i);
        }
    }

    private final void f(int i) {
        this.d[i] = d();
    }

    public final int b() {
        if (this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endObject called without startObject");
        }
        int i;
        int i2;
        e(0);
        int d = d();
        int i3 = this.e;
        while (true) {
            i3--;
            if (i3 < 0 || this.d[i3] != 0) {
            }
        }
        for (i = i3; i >= 0; i--) {
            i2 = this.d[i];
            a((short) (i2 != 0 ? d - i2 : 0));
        }
        a((short) (d - this.h));
        i3 += 3;
        a((short) (i3 + i3));
        loop2:
        for (i3 = 0; i3 < this.j; i3++) {
            i = this.a.capacity() - this.i[i3];
            i2 = this.b;
            short s = this.a.getShort(i);
            if (s == this.a.getShort(i2)) {
                short s2 = (short) 2;
                while (s2 < s) {
                    if (this.a.getShort(i + s2) == this.a.getShort(i2 + s2)) {
                        s2 += 2;
                    }
                }
                i3 = this.i[i3];
                break loop2;
            }
        }
        i3 = 0;
        if (i3 != 0) {
            i = this.a.capacity() - d;
            this.b = i;
            this.a.putInt(i, i3 - d);
        } else {
            i3 = this.j;
            int[] iArr = this.i;
            if (i3 == iArr.length) {
                this.i = Arrays.copyOf(iArr, i3 + i3);
            }
            int[] iArr2 = this.i;
            i = this.j;
            this.j = i + 1;
            iArr2[i] = d();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.putInt(byteBuffer.capacity() - d, d() - d);
        }
        this.f = false;
        return d;
    }

    public final void c(int i) {
        c(this.c, 4);
        a(i);
        this.a.position(this.b);
        this.g = true;
    }

    public final ByteBuffer c() {
        if (this.g) {
            return this.a;
        }
        throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }
}
