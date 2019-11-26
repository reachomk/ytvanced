package defpackage;

import java.io.IOException;

/* renamed from: rij */
public final class rij {
    public final byte[] a;
    public int b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g = Integer.MAX_VALUE;
    private int h;
    private final int i = 64;
    private rdp j;

    public static rij a(byte[] bArr, int i) {
        return new rij(bArr, i);
    }

    public final int a() {
        if (this.b != this.d) {
            int e = e();
            this.f = e;
            if (e != 0) {
                return e;
            }
            throw new rir("Protocol message contained an invalid tag (zero).");
        }
        this.f = 0;
        return 0;
    }

    public final void a(int i) {
        if (this.f != i) {
            throw new rir("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean b(int i) {
        int i2 = i & 7;
        if (i2 == 0) {
            e();
            return true;
        } else if (i2 == 1) {
            i();
            i();
            i();
            i();
            i();
            i();
            i();
            i();
            return true;
        } else if (i2 == 2) {
            f(e());
            return true;
        } else if (i2 == 3) {
            do {
                i2 = a();
                if (i2 == 0) {
                    break;
                }
            } while (b(i2));
            a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                i();
                i();
                i();
                i();
                return true;
            }
            throw new rir("Protocol message tag had invalid wire type.");
        }
    }

    public final boolean b() {
        return e() != 0;
    }

    public final String c() {
        int e = e();
        if (e >= 0) {
            int i = this.d;
            int i2 = this.b;
            if (e <= i - i2) {
                String str = new String(this.a, i2, e, ris.a);
                this.b += e;
                return str;
            }
            throw rir.a();
        }
        throw rir.b();
    }

    public final void a(riu riu) {
        int e = e();
        if (this.h < this.i) {
            e = c(e);
            this.h++;
            riu.a(this);
            a(0);
            this.h--;
            d(e);
            return;
        }
        throw new rir("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final byte[] d() {
        int e = e();
        if (e < 0) {
            throw rir.b();
        } else if (e == 0) {
            return riv.e;
        } else {
            int i = this.d;
            int i2 = this.b;
            if (e <= i - i2) {
                byte[] bArr = new byte[e];
                System.arraycopy(this.a, i2, bArr, 0, e);
                this.b += e;
                return bArr;
            }
            throw rir.a();
        }
    }

    public final int e() {
        int i = i();
        if (i < 0) {
            int i2;
            i &= 127;
            byte i3 = i();
            if (i3 < (byte) 0) {
                i |= (i3 & 127) << 7;
                i3 = i();
                if (i3 < (byte) 0) {
                    i |= (i3 & 127) << 14;
                    i3 = i();
                    if (i3 < (byte) 0) {
                        byte i4 = i();
                        i = (i | ((i3 & 127) << 21)) | (i4 << 28);
                        if (i4 < (byte) 0) {
                            for (i2 = 0; i2 < 5; i2++) {
                                if (i() >= (byte) 0) {
                                    return i;
                                }
                            }
                            throw rir.c();
                        }
                    }
                    i2 = i3 << 21;
                } else {
                    i2 = i3 << 14;
                }
            } else {
                i2 = i3 << 7;
            }
            i |= i2;
        }
        return i;
    }

    public final long f() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte i2 = i();
            j |= ((long) (i2 & 127)) << i;
            if ((i2 & 128) == 0) {
                return j;
            }
        }
        throw rir.c();
    }

    private rij(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
        this.c = i;
        this.b = 0;
    }

    public final reu a(rgu rgu) {
        try {
            if (this.j == null) {
                this.j = rdp.a(this.a, 0, this.c);
            }
            int u = this.j.u();
            int i = this.b;
            if (u <= i) {
                this.j.e(i - u);
                rdp rdp = this.j;
                int i2 = this.i - this.h;
                if (i2 >= 0) {
                    rdp.b = i2;
                    reg reg = reg.a;
                    if (reg == null) {
                        reg reg2;
                        synchronized (reg.class) {
                            reg2 = reg.a;
                            if (reg2 == null) {
                                reg reg3 = null;
                                if (red.a != null) {
                                    try {
                                        reg3 = red.a("loadGeneratedRegistry");
                                    } catch (Exception unused) {
                                    }
                                }
                                if (reg3 == null) {
                                    reg3 = res.a(reg.class);
                                }
                                if (reg3 == null) {
                                    reg3 = red.a();
                                }
                                reg.a = reg3;
                                reg2 = reg3;
                            }
                        }
                        reg = reg2;
                    }
                    reu reu = (reu) rdp.a(rgu, reg);
                    b(this.f);
                    return reu;
                }
                StringBuilder stringBuilder = new StringBuilder(47);
                stringBuilder.append("Recursion limit cannot be negative: ");
                stringBuilder.append(i2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i)}));
        } catch (rfk e) {
            throw new rir("", e);
        }
    }

    public final int c(int i) {
        if (i >= 0) {
            i += this.b;
            int i2 = this.g;
            if (i <= i2) {
                this.g = i;
                h();
                return i2;
            }
            throw rir.a();
        }
        throw rir.b();
    }

    private final void h() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = this.g;
        if (i > i2) {
            i2 = i - i2;
            this.e = i2;
            this.d = i - i2;
            return;
        }
        this.e = 0;
    }

    public final void d(int i) {
        this.g = i;
        h();
    }

    public final int g() {
        int i = this.g;
        return i != Integer.MAX_VALUE ? i - this.b : -1;
    }

    public final void e(int i) {
        a(i, this.f);
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
            this.f = i2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    private final byte i() {
        int i = this.b;
        if (i != this.d) {
            byte[] bArr = this.a;
            this.b = i + 1;
            return bArr[i];
        }
        throw rir.a();
    }

    private final void f(int i) {
        if (i >= 0) {
            int i2 = this.b;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 > i4) {
                f(i4 - i2);
                throw rir.a();
            } else if (i <= this.d - i2) {
                this.b = i3;
                return;
            } else {
                throw rir.a();
            }
        }
        throw rir.b();
    }
}
