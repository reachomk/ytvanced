package defpackage;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ojb */
public final class ojb implements ojf {
    private static final byte[] c = new byte[]{(byte) 73, (byte) 68, (byte) 51};
    public long a;
    public long b;
    private final boolean d;
    private final oyx e;
    private final oza f;
    private final String g;
    private String h;
    private ofy i;
    private ofy j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private ofy u;
    private long v;

    public ojb() {
        this(true, null);
    }

    public static boolean a(int i) {
        return (i & 65526) == 65520;
    }

    public final void b() {
    }

    public ojb(boolean z, String str) {
        this.e = new oyx(new byte[7]);
        this.f = new oza(Arrays.copyOf(c, 10));
        d();
        this.p = -1;
        this.q = -1;
        this.a = -9223372036854775807L;
        this.d = z;
        this.g = str;
    }

    public final void a() {
        c();
    }

    public final void a(ofo ofo, okl okl) {
        okl.a();
        this.h = okl.c();
        this.i = ofo.a(okl.b(), 1);
        if (this.d) {
            okl.a();
            this.j = ofo.a(okl.b(), 4);
            this.j.a(nzw.a(okl.c(), "application/id3"));
            return;
        }
        this.j = new ofn();
    }

    public final void a(long j, int i) {
        this.b = j;
    }

    public final void a(oza oza) {
        oza oza2 = oza;
        while (oza.b() > 0) {
            int i = this.k;
            int i2 = 2;
            byte[] bArr;
            int i3;
            int i4;
            if (i == 0) {
                bArr = oza2.a;
                int i5 = oza2.b;
                i3 = oza2.c;
                while (i5 < i3) {
                    int i6;
                    int i7 = i5 + 1;
                    i5 = bArr[i5] & 255;
                    if (this.m == 512 && ojb.a((byte) -1, (byte) i5)) {
                        if (!this.o) {
                            int i8 = i7 - 2;
                            oza2.c(i8 + 1);
                            if (ojb.b(oza2, this.e.a, 1)) {
                                this.e.a(4);
                                int c = this.e.c(1);
                                i6 = this.p;
                                if (i6 == -1 || c == i6) {
                                    if (this.q != -1) {
                                        if (ojb.b(oza2, this.e.a, 1)) {
                                            this.e.a(i2);
                                            if (this.e.c(4) == this.q) {
                                                oza2.c(i8 + 2);
                                            }
                                        }
                                    }
                                    if (ojb.b(oza2, this.e.a, 4)) {
                                        this.e.a(14);
                                        i6 = this.e.c(13);
                                        if (i6 > 6) {
                                            i8 += i6;
                                            i6 = i8 + 1;
                                            if (i6 < oza2.c) {
                                                byte[] bArr2 = oza2.a;
                                                if (ojb.a(bArr2[i8], bArr2[i6])) {
                                                    if (this.p != -1) {
                                                        if (((oza2.a[i6] & 8) >> 3) == c) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.r = (i5 & 8) >> 3;
                        this.n = ((i5 & 1) ^ 1) != 0;
                        if (this.o) {
                            e();
                        } else {
                            this.k = 1;
                            this.l = 0;
                        }
                        oza2.c(i7);
                    }
                    i6 = this.m;
                    i2 = i6 | i5;
                    if (i2 == 329) {
                        this.m = 768;
                    } else if (i2 == 511) {
                        this.m = 512;
                    } else if (i2 != 836) {
                        if (i2 == 1075) {
                            this.k = 2;
                            this.l = c.length;
                            this.t = 0;
                            this.f.c(0);
                            oza2.c(i7);
                            break;
                        } else if (i6 != 256) {
                            this.m = 256;
                            i5 = i7 - 1;
                            i2 = 2;
                        }
                    } else {
                        this.m = 1024;
                    }
                    i5 = i7;
                    i2 = 2;
                }
                oza2.c(i5);
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (a(oza2, this.e.a, !this.n ? 5 : 7)) {
                            this.e.a(0);
                            if (this.s) {
                                this.e.b(10);
                            } else {
                                i = this.e.c(2) + 1;
                                if (i != 2) {
                                    StringBuilder stringBuilder = new StringBuilder(61);
                                    stringBuilder.append("Detected audio object type: ");
                                    stringBuilder.append(i);
                                    stringBuilder.append(", but assuming AAC LC.");
                                    oyp.a("AdtsReader", stringBuilder.toString());
                                }
                                this.e.b(5);
                                bArr = oyd.a(this.q, this.e.c(3));
                                Pair a = oyd.a(bArr);
                                nzw a2 = nzw.a(this.h, "audio/mp4a-latm", -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), null, this.g);
                                this.a = 1024000000 / ((long) a2.w);
                                this.i.a(a2);
                                this.s = true;
                            }
                            this.e.b(4);
                            i = this.e.c(13) - 7;
                            if (this.n) {
                                i -= 2;
                            }
                            a(this.i, this.a, 0, i);
                        }
                    } else if (i == 4) {
                        i = Math.min(oza.b(), this.t - this.l);
                        this.u.a(oza2, i);
                        i4 = this.l + i;
                        this.l = i4;
                        i3 = this.t;
                        if (i4 == i3) {
                            this.u.a(this.b, 1, i3, 0, null);
                            this.b += this.v;
                            d();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(oza2, this.f.a, 10)) {
                    this.j.a(this.f, 10);
                    this.f.c(6);
                    a(this.j, 0, 10, this.f.n() + 10);
                }
            } else if (oza.b() != 0) {
                oyx oyx = this.e;
                oyx.a[0] = oza2.a[oza2.b];
                oyx.a(2);
                i = this.e.c(4);
                i4 = this.q;
                if (i4 == -1 || i == i4) {
                    if (!this.o) {
                        this.o = true;
                        this.p = this.r;
                        this.q = i;
                    }
                    e();
                } else {
                    c();
                }
            }
        }
    }

    public final void c() {
        this.o = false;
        d();
    }

    private final boolean a(oza oza, byte[] bArr, int i) {
        int min = Math.min(oza.b(), i - this.l);
        oza.a(bArr, this.l, min);
        int i2 = this.l + min;
        this.l = i2;
        return i2 == i;
    }

    private final void d() {
        this.k = 0;
        this.l = 0;
        this.m = 256;
    }

    private final void a(ofy ofy, long j, int i, int i2) {
        this.k = 4;
        this.l = i;
        this.u = ofy;
        this.v = j;
        this.t = i2;
    }

    private final void e() {
        this.k = 3;
        this.l = 0;
    }

    private static boolean a(byte b, byte b2) {
        return ojb.a(((b & 255) << 8) | (b2 & 255));
    }

    private static boolean b(oza oza, byte[] bArr, int i) {
        if (oza.b() < i) {
            return false;
        }
        oza.a(bArr, 0, i);
        return true;
    }
}
