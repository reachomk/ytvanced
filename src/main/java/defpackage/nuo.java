package defpackage;

import android.util.Log;

/* renamed from: nuo */
final class nuo extends nuq {
    private final ntv a;
    private final nuk b;
    private final nxa c = new nxa(new byte[10]);
    private int d = 0;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public nuo(ntv ntv, nuk nuk) {
        super();
        this.a = ntv;
        this.b = nuk;
    }

    public final void a() {
        this.d = 0;
        this.e = 0;
        this.h = false;
        this.a.a();
    }

    public final void a(nwz nwz, boolean z, nre nre) {
        int i;
        nwz nwz2 = nwz;
        String str = "TsExtractor";
        int i2 = -1;
        int i3 = 3;
        if (z) {
            i = this.d;
            if (i == 2) {
                Log.w(str, "Unexpected start indicator reading extended header");
            } else if (i == 3) {
                i = this.j;
                if (i != -1) {
                    StringBuilder stringBuilder = new StringBuilder(59);
                    stringBuilder.append("Unexpected start indicator: expected ");
                    stringBuilder.append(i);
                    stringBuilder.append(" more bytes");
                    Log.w(str, stringBuilder.toString());
                }
                this.a.b();
            }
            a(1);
        }
        while (nwz.b() > 0) {
            i = this.d;
            if (i != 0) {
                int i4 = 0;
                if (i != 1) {
                    int c;
                    if (i == 2) {
                        if (a(nwz2, this.c.a, Math.min(10, this.i)) && a(nwz2, null, this.i)) {
                            long a;
                            this.c.a(0);
                            if (this.f) {
                                this.c.b(4);
                                i = this.c.c(i3);
                                this.c.b(1);
                                c = this.c.c(15);
                                this.c.b(1);
                                long c2 = ((((long) i) << 30) | ((long) (c << 15))) | ((long) this.c.c(15));
                                this.c.b(1);
                                if (!this.h && this.g) {
                                    this.c.b(4);
                                    i4 = this.c.c(i3);
                                    this.c.b(1);
                                    c = this.c.c(15);
                                    this.c.b(1);
                                    int c3 = this.c.c(15);
                                    this.c.b(1);
                                    this.b.a(((((long) i4) << 30) | ((long) (c << 15))) | ((long) c3));
                                    this.h = true;
                                }
                                a = this.b.a(c2);
                            } else {
                                a = -1;
                            }
                            this.a.a(a, this.k);
                            a(3);
                        } else {
                            i2 = -1;
                        }
                    } else if (i == i3) {
                        i = nwz.b();
                        c = this.j;
                        if (c != i2) {
                            i4 = i - c;
                        }
                        if (i4 > 0) {
                            i -= i4;
                            nwz2.b(nwz2.b + i);
                        }
                        this.a.a(nwz2);
                        i4 = this.j;
                        if (i4 != i2) {
                            i4 -= i;
                            this.j = i4;
                            if (i4 == 0) {
                                this.a.b();
                                a(1);
                            }
                        }
                    }
                } else if (a(nwz2, this.c.a, 9)) {
                    this.c.a(0);
                    i3 = this.c.c(24);
                    if (i3 != 1) {
                        StringBuilder stringBuilder2 = new StringBuilder(41);
                        stringBuilder2.append("Unexpected start code prefix: ");
                        stringBuilder2.append(i3);
                        Log.w(str, stringBuilder2.toString());
                        this.j = -1;
                    } else {
                        this.c.b(8);
                        i3 = this.c.c(16);
                        this.c.b(5);
                        this.k = this.c.b();
                        this.c.b(2);
                        this.f = this.c.b();
                        this.g = this.c.b();
                        this.c.b(6);
                        i = this.c.c(8);
                        this.i = i;
                        if (i3 != 0) {
                            this.j = (i3 - 3) - i;
                        } else {
                            this.j = -1;
                        }
                        i4 = 2;
                    }
                    a(i4);
                }
            } else {
                nwz2.d(nwz.b());
            }
            i2 = -1;
            i3 = 3;
        }
    }

    private final void a(int i) {
        this.d = i;
        this.e = 0;
    }

    private final boolean a(nwz nwz, byte[] bArr, int i) {
        int min = Math.min(nwz.b(), i - this.e);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            nwz.d(min);
        } else {
            nwz.a(bArr, this.e, min);
        }
        int i2 = this.e + min;
        this.e = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
