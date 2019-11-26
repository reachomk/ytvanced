package defpackage;

import java.util.Arrays;

/* renamed from: ojd */
public final class ojd implements ojf {
    private final oza a = new oza(new byte[18]);
    private final String b;
    private String c;
    private ofy d;
    private int e = 0;
    private int f;
    private int g;
    private long h;
    private nzw i;
    private int j;
    private long k;

    public ojd(String str) {
        this.b = str;
    }

    public final void b() {
    }

    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public final void a(ofo ofo, okl okl) {
        okl.a();
        this.c = okl.c();
        this.d = ofo.a(okl.b(), 1);
    }

    public final void a(long j, int i) {
        this.k = j;
    }

    public final void a(oza oza) {
        oza oza2 = oza;
        while (oza.b() > 0) {
            int i = this.e;
            int i2 = 2;
            int i3 = 1;
            byte[] bArr;
            int i4;
            if (i == 0) {
                while (oza.b() > 0) {
                    i = this.g << 8;
                    this.g = i;
                    i |= oza.d();
                    this.g = i;
                    if (ocr.a(i)) {
                        bArr = this.a.a;
                        i4 = this.g;
                        bArr[0] = (byte) (i4 >> 24);
                        bArr[1] = (byte) (i4 >> 16);
                        bArr[2] = (byte) (i4 >> 8);
                        bArr[3] = (byte) i4;
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i == 1) {
                bArr = this.a.a;
                int min = Math.min(oza.b(), 18 - this.f);
                oza2.a(bArr, this.f, min);
                i = this.f + min;
                this.f = i;
                if (i == 18) {
                    bArr = this.a.a;
                    if (this.i == null) {
                        oyx oyx;
                        int min2;
                        int i5;
                        String str = this.c;
                        String str2 = this.b;
                        int i6 = -1;
                        if (bArr[0] == Byte.MAX_VALUE) {
                            oyx = new oyx(bArr);
                        } else {
                            int i7;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            byte b = copyOf[0];
                            if (b == (byte) -2 || b == (byte) -1) {
                                for (int i8 = 0; i8 < copyOf.length - 1; i8 += 2) {
                                    byte b2 = copyOf[i8];
                                    i7 = i8 + 1;
                                    copyOf[i8] = copyOf[i7];
                                    copyOf[i7] = b2;
                                }
                            }
                            oyx oyx2 = new oyx(copyOf);
                            if (copyOf[0] == (byte) 31) {
                                oyx oyx3 = new oyx(copyOf);
                                while (oyx3.a() >= 16) {
                                    oyx3.b(i2);
                                    i7 = oyx3.c(14) & 16383;
                                    min2 = Math.min(8 - oyx2.c, 14);
                                    i2 = oyx2.c;
                                    i5 = (8 - i2) - min2;
                                    byte[] bArr2 = oyx2.a;
                                    int i9 = oyx2.b;
                                    byte b3 = (byte) (bArr2[i9] & ((65280 >> i2) | ((1 << i5) - 1)));
                                    bArr2[i9] = b3;
                                    min2 = 14 - min2;
                                    bArr2[i9] = (byte) (b3 | ((i7 >>> min2) << i5));
                                    i9++;
                                    for (i4 = 8; min2 > i4; i4 = 8) {
                                        i2 = i9 + 1;
                                        min2 -= 8;
                                        oyx2.a[i9] = (byte) (i7 >>> min2);
                                        i9 = i2;
                                    }
                                    i2 = 8 - min2;
                                    bArr2 = oyx2.a;
                                    byte b4 = (byte) (bArr2[i9] & ((1 << i2) - 1));
                                    bArr2[i9] = b4;
                                    bArr2[i9] = (byte) (((((1 << min2) - 1) & i7) << i2) | b4);
                                    oyx2.b(14);
                                    oyx2.g();
                                    i2 = 2;
                                }
                            }
                            oyx2.a(copyOf);
                            oyx = oyx2;
                        }
                        oyx.b(60);
                        i4 = ocr.a[oyx.c(6)];
                        i5 = ocr.b[oyx.c(4)];
                        i2 = oyx.c(5);
                        if (i2 < ocr.c.length) {
                            min2 = 2;
                            i6 = (ocr.c[i2] * 1000) / 2;
                        } else {
                            min2 = 2;
                        }
                        oyx.b(10);
                        if (oyx.c(min2) <= 0) {
                            i3 = 0;
                        }
                        this.i = nzw.a(str, "audio/vnd.dts", i6, -1, i4 + i3, i5, null, null, str2);
                        this.d.a(this.i);
                    }
                    this.j = ocr.b(bArr);
                    this.h = (long) ((int) ((((long) ocr.a(bArr)) * 1000000) / ((long) this.i.w)));
                    this.a.c(0);
                    this.d.a(this.a, 18);
                    this.e = 2;
                }
            } else if (i == 2) {
                i = Math.min(oza.b(), this.j - this.f);
                this.d.a(oza2, i);
                i4 = this.f + i;
                this.f = i4;
                int i10 = this.j;
                if (i4 == i10) {
                    this.d.a(this.k, 1, i10, 0, null);
                    this.k += this.h;
                    this.e = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
