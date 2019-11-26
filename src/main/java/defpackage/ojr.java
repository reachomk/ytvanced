package defpackage;

/* renamed from: ojr */
public final class ojr implements okh {
    private final ojf a;
    private final oyx b = new oyx(new byte[10]);
    private int c = 0;
    private int d;
    private ozo e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public ojr(ojf ojf) {
        this.a = ojf;
    }

    public final void a(ozo ozo, ofo ofo, okl okl) {
        this.e = ozo;
        this.a.a(ofo, okl);
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    public final void a(oza oza, int i) {
        int i2;
        oza oza2 = oza;
        String str = "PesReader";
        int i3 = -1;
        int i4 = 3;
        if ((i & 1) != 0) {
            i2 = this.c;
            if (!(i2 == 0 || i2 == 1)) {
                if (i2 == 2) {
                    oyp.a(str, "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    i2 = this.j;
                    if (i2 != -1) {
                        StringBuilder stringBuilder = new StringBuilder(59);
                        stringBuilder.append("Unexpected start indicator: expected ");
                        stringBuilder.append(i2);
                        stringBuilder.append(" more bytes");
                        oyp.a(str, stringBuilder.toString());
                    }
                    this.a.b();
                } else {
                    throw new IllegalStateException();
                }
            }
            a(1);
        }
        i2 = i;
        while (oza.b() > 0) {
            int i5 = this.c;
            if (i5 != 0) {
                int i6 = 0;
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (a(oza2, this.b.a, Math.min(10, this.i)) && a(oza2, null, this.i)) {
                            long b;
                            this.b.a(0);
                            if (this.f) {
                                this.b.b(4);
                                i5 = this.b.c(i4);
                                this.b.b(1);
                                int c = this.b.c(15);
                                this.b.b(1);
                                long c2 = (((long) (c << 15)) | (((long) i5) << 30)) | ((long) this.b.c(15));
                                this.b.b(1);
                                if (!this.h && this.g) {
                                    this.b.b(4);
                                    c = this.b.c(i4);
                                    this.b.b(1);
                                    int c3 = this.b.c(15);
                                    this.b.b(1);
                                    int c4 = this.b.c(15);
                                    this.b.b(1);
                                    this.e.b(((((long) c) << 30) | ((long) (c3 << 15))) | ((long) c4));
                                    this.h = true;
                                }
                                b = this.e.b(c2);
                            } else {
                                b = -9223372036854775807L;
                            }
                            i2 |= !this.k ? 0 : 4;
                            this.a.a(b, i2);
                            a(3);
                        }
                    } else if (i5 == i4) {
                        i5 = oza.b();
                        int i7 = this.j;
                        if (i7 != i3) {
                            i6 = i5 - i7;
                        }
                        if (i6 > 0) {
                            i5 -= i6;
                            oza2.b(oza2.b + i5);
                        }
                        this.a.a(oza2);
                        i6 = this.j;
                        if (i6 != i3) {
                            i6 -= i5;
                            this.j = i6;
                            if (i6 == 0) {
                                this.a.b();
                                a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(oza2, this.b.a, 9)) {
                    i5 = 0;
                    this.b.a(0);
                    i4 = this.b.c(24);
                    if (i4 != 1) {
                        StringBuilder stringBuilder2 = new StringBuilder(41);
                        stringBuilder2.append("Unexpected start code prefix: ");
                        stringBuilder2.append(i4);
                        oyp.a(str, stringBuilder2.toString());
                        this.j = -1;
                    } else {
                        this.b.b(8);
                        i4 = this.b.c(16);
                        this.b.b(5);
                        this.k = this.b.e();
                        this.b.b(2);
                        this.f = this.b.e();
                        this.g = this.b.e();
                        this.b.b(6);
                        i5 = this.b.c(8);
                        this.i = i5;
                        if (i4 != 0) {
                            this.j = (i4 - 3) - i5;
                        } else {
                            this.j = -1;
                        }
                        i5 = 2;
                    }
                    a(i5);
                }
            } else {
                oza2.d(oza.b());
            }
            i3 = -1;
            i4 = 3;
        }
    }

    private final void a(int i) {
        this.c = i;
        this.d = 0;
    }

    private final boolean a(oza oza, byte[] bArr, int i) {
        int min = Math.min(oza.b(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            oza.d(min);
        } else {
            oza.a(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
