package defpackage;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ntt */
final class ntt extends ntv {
    private static final byte[] c = new byte[]{(byte) 73, (byte) 68, (byte) 51};
    public long a;
    private final nxa d = new nxa(new byte[7]);
    private final nwz e = new nwz(Arrays.copyOf(c, 10));
    private final nrs f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private nrs n;
    private long o;

    public ntt(nrs nrs, nrs nrs2) {
        super(nrs);
        this.f = nrs2;
        nrs2.a(nmx.a());
        c();
    }

    public final void b() {
    }

    public final void a() {
        c();
    }

    public final void a(long j, boolean z) {
        this.a = j;
    }

    public final void a(nwz nwz) {
        while (nwz.b() > 0) {
            int i = this.g;
            boolean z = true;
            byte[] bArr;
            int i2;
            if (i == 0) {
                bArr = nwz.a;
                int i3 = nwz.b;
                int i4 = nwz.c;
                while (i3 < i4) {
                    i2 = i3 + 1;
                    i3 = bArr[i3] & 255;
                    int i5 = this.i;
                    if (i5 == 512 && i3 >= 240 && i3 != 255) {
                        if (((i3 & 1) ^ 1) == 0) {
                            z = false;
                        }
                        this.j = z;
                        this.g = 2;
                        this.h = 0;
                        nwz.c(i2);
                    } else {
                        i3 |= i5;
                        if (i3 == 329) {
                            this.i = 768;
                        } else if (i3 == 511) {
                            this.i = 512;
                        } else if (i3 != 836) {
                            if (i3 == 1075) {
                                this.g = 1;
                                this.h = c.length;
                                this.m = 0;
                                this.e.c(0);
                                nwz.c(i2);
                                break;
                            } else if (i5 != 256) {
                                this.i = 256;
                                i3 = i2 - 1;
                            }
                        } else {
                            this.i = 1024;
                        }
                        i3 = i2;
                    }
                }
                nwz.c(i3);
            } else if (i != 1) {
                if (i == 2) {
                    if (a(nwz, this.d.a, !this.j ? 5 : 7)) {
                        this.d.a(0);
                        if (this.k) {
                            this.d.b(10);
                        } else {
                            i = this.d.c(2) + 1;
                            if (i != 2) {
                                StringBuilder stringBuilder = new StringBuilder(61);
                                stringBuilder.append("Detected audio object type: ");
                                stringBuilder.append(i);
                                stringBuilder.append(", but assuming AAC LC.");
                                Log.w("AdtsReader", stringBuilder.toString());
                            }
                            i = this.d.c(4);
                            this.d.b(1);
                            bArr = nwh.a(i, this.d.c(3));
                            Pair a = nwh.a(bArr);
                            nmx a2 = nmx.a(null, "audio/mp4a-latm", -1, -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), null);
                            this.l = 1024000000 / ((long) a2.r);
                            this.b.a(a2);
                            this.k = true;
                        }
                        this.d.b(4);
                        i = this.d.c(13) - 7;
                        if (this.j) {
                            i -= 2;
                        }
                        a(this.b, this.l, 0, i);
                    }
                } else if (i == 3) {
                    i = Math.min(nwz.b(), this.m - this.h);
                    this.n.a(nwz, i);
                    int i6 = this.h + i;
                    this.h = i6;
                    i2 = this.m;
                    if (i6 == i2) {
                        this.n.a(this.a, 1, i2, 0, null);
                        this.a += this.o;
                        c();
                    }
                }
            } else if (a(nwz, this.e.a, 10)) {
                this.f.a(this.e, 10);
                this.e.c(6);
                a(this.f, 0, 10, this.e.m() + 10);
            }
        }
    }

    private final boolean a(nwz nwz, byte[] bArr, int i) {
        int min = Math.min(nwz.b(), i - this.h);
        nwz.a(bArr, this.h, min);
        int i2 = this.h + min;
        this.h = i2;
        return i2 == i;
    }

    public final void c() {
        this.g = 0;
        this.h = 0;
        this.i = 256;
    }

    private final void a(nrs nrs, long j, int i, int i2) {
        this.g = 3;
        this.h = i;
        this.n = nrs;
        this.o = j;
        this.m = i2;
    }
}
