package defpackage;

import java.io.IOException;

/* renamed from: aobv */
public final class aobv {
    public final byte[] a;
    public int b;
    public int c;
    public int d;
    public final int e = 64;
    private final int f;
    private int g;
    private int h;
    private int i = Integer.MAX_VALUE;
    private anwf j;

    public static aobv a(byte[] bArr) {
        return aobv.a(bArr, bArr.length);
    }

    public static aobv a(byte[] bArr, int i) {
        return new aobv(bArr, i);
    }

    public final int a() {
        if (l()) {
            this.c = 0;
            return 0;
        }
        int f = f();
        this.c = f;
        if (f != 0) {
            return f;
        }
        throw new aocg("Protocol message contained an invalid tag (zero).");
    }

    public final void a(int i) {
        if (this.c != i) {
            throw new aocg("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean b(int i) {
        int a = aock.a(i);
        if (a == 0) {
            f();
            return true;
        } else if (a == 1) {
            i();
            return true;
        } else if (a == 2) {
            f(f());
            return true;
        } else if (a == 3) {
            do {
                a = a();
                if (a == 0) {
                    break;
                }
            } while (b(a));
            a(aock.a(aock.b(i), 4));
            return true;
        } else if (a == 4) {
            return false;
        } else {
            if (a == 5) {
                h();
                return true;
            }
            throw new aocg("Protocol message tag had invalid wire type.");
        }
    }

    public final float b() {
        return Float.intBitsToFloat(h());
    }

    public final boolean c() {
        return f() != 0;
    }

    public final String d() {
        int f = f();
        if (f >= 0) {
            int i = this.g;
            int i2 = this.b;
            if (f <= i - i2) {
                String str = new String(this.a, i2, f, aocd.a);
                this.b += f;
                return str;
            }
            throw aocg.a();
        }
        throw aocg.b();
    }

    public final void a(aocf aocf) {
        int f = f();
        if (this.d < this.e) {
            f = c(f);
            this.d++;
            aocf.mergeFrom(this);
            a(0);
            this.d--;
            d(f);
            return;
        }
        throw aocg.d();
    }

    public final byte[] e() {
        int f = f();
        if (f < 0) {
            throw aocg.b();
        } else if (f == 0) {
            return aock.c;
        } else {
            int i = this.g;
            int i2 = this.b;
            if (f <= i - i2) {
                byte[] bArr = new byte[f];
                System.arraycopy(this.a, i2, bArr, 0, f);
                this.b += f;
                return bArr;
            }
            throw aocg.a();
        }
    }

    public final int f() {
        int n = n();
        if (n < 0) {
            int i;
            n &= 127;
            byte n2 = n();
            if (n2 < (byte) 0) {
                n |= (n2 & 127) << 7;
                n2 = n();
                if (n2 < (byte) 0) {
                    n |= (n2 & 127) << 14;
                    n2 = n();
                    if (n2 < (byte) 0) {
                        byte n3 = n();
                        n = (n | ((n2 & 127) << 21)) | (n3 << 28);
                        if (n3 < (byte) 0) {
                            for (i = 0; i < 5; i++) {
                                if (n() >= (byte) 0) {
                                    return n;
                                }
                            }
                            throw aocg.c();
                        }
                    }
                    i = n2 << 21;
                } else {
                    i = n2 << 14;
                }
            } else {
                i = n2 << 7;
            }
            n |= i;
        }
        return n;
    }

    public final long g() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte n = n();
            j |= ((long) (n & 127)) << i;
            if ((n & 128) == 0) {
                return j;
            }
        }
        throw aocg.c();
    }

    public final int h() {
        return (((n() & 255) | ((n() & 255) << 8)) | ((n() & 255) << 16)) | ((n() & 255) << 24);
    }

    public final long i() {
        return (((((((((long) n()) & 255) | ((((long) n()) & 255) << 8)) | ((((long) n()) & 255) << 16)) | ((((long) n()) & 255) << 24)) | ((((long) n()) & 255) << 32)) | ((((long) n()) & 255) << 40)) | ((((long) n()) & 255) << 48)) | ((255 & ((long) n())) << 56);
    }

    private aobv(byte[] bArr, int i) {
        this.a = bArr;
        this.g = i;
        this.f = i;
        this.b = 0;
    }

    public final anwf j() {
        if (this.j == null) {
            this.j = anwf.a(this.a, this.f);
        }
        int v = this.j.v();
        int i = this.b;
        if (v <= i) {
            this.j.e(i - v);
            anwf anwf = this.j;
            i = this.e - this.d;
            if (i >= 0) {
                anwf.b = i;
                return anwf;
            }
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append("Recursion limit cannot be negative: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(v), Integer.valueOf(i)}));
    }

    public final anxl a(anzq anzq) {
        try {
            anxl anxl = (anxl) j().a(anzq, anxa.c());
            b(this.c);
            return anxl;
        } catch (anyg e) {
            throw new aocg("", e);
        }
    }

    public final int c(int i) {
        if (i >= 0) {
            i += this.b;
            int i2 = this.i;
            if (i <= i2) {
                this.i = i;
                m();
                return i2;
            }
            throw aocg.a();
        }
        throw aocg.b();
    }

    private final void m() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = this.i;
        if (i > i2) {
            i2 = i - i2;
            this.h = i2;
            this.g = i - i2;
            return;
        }
        this.h = 0;
    }

    public final void d(int i) {
        this.i = i;
        m();
    }

    public final int k() {
        int i = this.i;
        return i != Integer.MAX_VALUE ? i - this.b : -1;
    }

    public final boolean l() {
        return this.b == this.g;
    }

    public final void e(int i) {
        a(i, this.c);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2) {
        int i3 = this.b;
        if (i > i3) {
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i >= 0) {
            this.b = i;
            this.c = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    private final byte n() {
        int i = this.b;
        if (i != this.g) {
            byte[] bArr = this.a;
            this.b = i + 1;
            return bArr[i];
        }
        throw aocg.a();
    }

    private final void f(int i) {
        if (i >= 0) {
            int i2 = this.b;
            int i3 = i2 + i;
            int i4 = this.i;
            if (i3 > i4) {
                f(i4 - i2);
                throw aocg.a();
            } else if (i <= this.g - i2) {
                this.b = i3;
                return;
            } else {
                throw aocg.a();
            }
        }
        throw aocg.b();
    }
}
