package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: oim */
final class oim extends oii {
    private oip a;
    private int o;
    private boolean p;
    private ois q;
    private oiq r;

    oim() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(long j) {
        this.h = j;
        int i = 0;
        this.p = j != 0;
        ois ois = this.q;
        if (ois != null) {
            i = ois.d;
        }
        this.o = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final long a(oza oza) {
        int i = 0;
        byte b = oza.a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        int i2;
        oip oip = this.a;
        if (oip.c[(b >> 1) & (255 >>> (8 - oip.d))].a) {
            i2 = oip.a.e;
        } else {
            i2 = oip.a.d;
        }
        if (this.p) {
            i = (this.o + i2) / 4;
        }
        long j = (long) i;
        oza.b(oza.c + 4);
        byte[] bArr = oza.a;
        int i3 = oza.c;
        bArr[i3 - 4] = (byte) ((int) (j & 255));
        bArr[i3 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i3 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr[i3 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.p = true;
        this.o = i2;
        return j;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(oza oza, long j, oil oil) {
        oza oza2 = oza;
        if (this.a != null) {
            return false;
        }
        oip oip = null;
        int i;
        int i2;
        int a;
        if (this.q != null) {
            int i3 = 3;
            if (this.r != null) {
                i = oza2.c;
                byte[] bArr = new byte[i];
                System.arraycopy(oza2.a, 0, bArr, 0, i);
                i = this.q.a;
                i2 = 5;
                oio.a(5, oza2, false);
                int d = oza.d() + 1;
                oin oin = new oin(oza2.a);
                oin.b(oza2.b << 3);
                int i4 = 0;
                while (true) {
                    int i5 = 16;
                    int i6;
                    int a2;
                    int i7;
                    StringBuilder stringBuilder;
                    if (i4 >= d) {
                        int[] iArr;
                        i4 = 6;
                        d = oin.a(6) + 1;
                        i6 = 0;
                        while (i6 < d) {
                            if (oin.a(16) == 0) {
                                i6++;
                            } else {
                                throw new oae("placeholder of time domain transforms not zeroed out");
                            }
                        }
                        d = oin.a(6) + 1;
                        i6 = 0;
                        while (i6 < d) {
                            a = oin.a(i5);
                            if (a == 0) {
                                oin.b(8);
                                oin.b(16);
                                oin.b(16);
                                oin.b(6);
                                oin.b(8);
                                a2 = oin.a(4) + 1;
                                for (i4 = 0; i4 < a2; i4++) {
                                    oin.b(8);
                                }
                            } else if (a == 1) {
                                a = oin.a(i2);
                                int[] iArr2 = new int[a];
                                i4 = -1;
                                i2 = 0;
                                while (i2 < a) {
                                    i3 = oin.a(4);
                                    iArr2[i2] = i3;
                                    if (i3 > i4) {
                                        i4 = i3;
                                    }
                                    i2++;
                                    i3 = 3;
                                }
                                iArr = new int[(i4 + 1)];
                                i2 = 0;
                                while (i2 < iArr.length) {
                                    iArr[i2] = oin.a(i3) + 1;
                                    i5 = oin.a(2);
                                    if (i5 > 0) {
                                        oin.b(8);
                                    }
                                    for (i3 = 0; i3 < (1 << i5); i3++) {
                                        oin.b(8);
                                    }
                                    i2++;
                                    i3 = 3;
                                }
                                oin.b(2);
                                a2 = oin.a(4);
                                i3 = 0;
                                i2 = 0;
                                for (i7 = 0; i7 < a; i7++) {
                                    i3 += iArr[iArr2[i7]];
                                    while (i2 < i3) {
                                        oin.b(a2);
                                        i2++;
                                    }
                                }
                            } else {
                                stringBuilder = new StringBuilder(52);
                                stringBuilder.append("floor type greater than 1 not decodable: ");
                                stringBuilder.append(a);
                                throw new oae(stringBuilder.toString());
                            }
                            i6++;
                            i4 = 6;
                            i3 = 3;
                            i2 = 5;
                            i5 = 16;
                        }
                        a2 = oin.a(i4) + 1;
                        i3 = 0;
                        while (i3 < a2) {
                            if (oin.a(16) <= 2) {
                                oin.b(24);
                                oin.b(24);
                                oin.b(24);
                                i2 = oin.a(i4) + 1;
                                oin.b(8);
                                iArr = new int[i2];
                                for (d = 0; d < i2; d++) {
                                    iArr[d] = ((oin.a() ? oin.a(5) : 0) << 3) + oin.a(3);
                                }
                                for (d = 0; d < i2; d++) {
                                    for (a = 0; a < 8; a++) {
                                        if ((iArr[d] & (1 << a)) != 0) {
                                            oin.b(8);
                                        }
                                    }
                                }
                                i3++;
                                i4 = 6;
                            } else {
                                throw new oae("residueType greater than 2 is not decodable");
                            }
                        }
                        a2 = oin.a(i4) + 1;
                        for (i4 = 0; i4 < a2; i4++) {
                            i2 = oin.a(16);
                            if (i2 != 0) {
                                StringBuilder stringBuilder2 = new StringBuilder(52);
                                stringBuilder2.append("mapping type other than 0 not supported: ");
                                stringBuilder2.append(i2);
                                oyp.b("VorbisUtil", stringBuilder2.toString());
                            } else {
                                i3 = oin.a() ? oin.a(4) + 1 : 1;
                                if (oin.a()) {
                                    i2 = oin.a(8) + 1;
                                    for (d = 0; d < i2; d++) {
                                        a = i - 1;
                                        oin.b(oio.a(a));
                                        oin.b(oio.a(a));
                                    }
                                }
                                if (oin.a(2) == 0) {
                                    if (i3 > 1) {
                                        for (i2 = 0; i2 < i; i2++) {
                                            oin.b(4);
                                        }
                                    }
                                    for (i2 = 0; i2 < i3; i2++) {
                                        oin.b(8);
                                        oin.b(8);
                                        oin.b(8);
                                    }
                                } else {
                                    throw new oae("to reserved bits must be zero after mapping coupling steps");
                                }
                            }
                        }
                        i4 = oin.a(6) + 1;
                        oit[] oitArr = new oit[i4];
                        for (a2 = 0; a2 < i4; a2++) {
                            boolean a3 = oin.a();
                            oin.a(16);
                            oin.a(16);
                            oin.a(8);
                            oitArr[a2] = new oit(a3);
                        }
                        if (oin.a()) {
                            oip = new oip(this.q, bArr, oitArr, oio.a(oitArr.length - 1));
                        } else {
                            throw new oae("framing bit after modes not set as expected");
                        }
                    } else if (oin.a(24) == 5653314) {
                        a2 = oin.a(16);
                        i7 = oin.a(24);
                        long[] jArr = new long[i7];
                        if (oin.a()) {
                            a = oin.a(5) + 1;
                            i2 = 0;
                            while (i2 < jArr.length) {
                                i6 = oin.a(oio.a(i7 - i2));
                                int i8 = i2;
                                for (i2 = 0; i2 < i6 && i8 < jArr.length; i2++) {
                                    jArr[i8] = (long) a;
                                    i8++;
                                }
                                a++;
                                i2 = i8;
                            }
                        } else {
                            boolean a4 = oin.a();
                            for (a = 0; a < jArr.length; a++) {
                                if (!a4) {
                                    jArr[a] = (long) (oin.a(5) + 1);
                                } else if (oin.a()) {
                                    jArr[a] = (long) (oin.a(5) + 1);
                                } else {
                                    jArr[a] = 0;
                                }
                            }
                        }
                        i2 = oin.a(4);
                        if (i2 <= 2) {
                            if (i2 == 1 || i2 == 2) {
                                long j2;
                                oin.b(32);
                                oin.b(32);
                                a = oin.a(4) + 1;
                                oin.b(1);
                                if (i2 != 1) {
                                    j2 = ((long) i7) * ((long) a2);
                                } else if (a2 != 0) {
                                    double d2 = (double) ((long) i7);
                                    double d3 = (double) ((long) a2);
                                    Double.isNaN(d3);
                                    j2 = (long) Math.floor(Math.pow(d2, 1.0d / d3));
                                } else {
                                    j2 = 0;
                                }
                                oin.b((int) (j2 * ((long) a)));
                            }
                            oir oir = new oir();
                            i4++;
                            i3 = 3;
                            i2 = 5;
                        } else {
                            stringBuilder = new StringBuilder(53);
                            stringBuilder.append("lookup type greater than 2 not decodable: ");
                            stringBuilder.append(i2);
                            throw new oae(stringBuilder.toString());
                        }
                    } else {
                        i = oin.a;
                        i7 = oin.b;
                        StringBuilder stringBuilder3 = new StringBuilder(66);
                        stringBuilder3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        stringBuilder3.append((i << 3) + i7);
                        throw new oae(stringBuilder3.toString());
                    }
                }
            }
            oio.a(3, oza2, false);
            oza2.e((int) oza.j()).length();
            long j3 = oza.j();
            String[] strArr = new String[((int) j3)];
            for (i3 = 0; ((long) i3) < j3; i3++) {
                String e = oza2.e((int) oza.j());
                strArr[i3] = e;
                e.length();
            }
            if ((oza.d() & 1) != 0) {
                this.r = new oiq();
            } else {
                throw new oae("framing bit expected to be set");
            }
        }
        oio.a(1, oza2, false);
        oza.j();
        i2 = oza.d();
        long j4 = oza.j();
        oza.l();
        a = oza.l();
        oza.l();
        i = oza.d();
        double pow = Math.pow(2.0d, (double) (i & 15));
        double pow2 = Math.pow(2.0d, (double) ((i & 240) >> 4));
        oza.d();
        this.q = new ois(i2, j4, a, (int) pow, (int) pow2, Arrays.copyOf(oza2.a, oza2.c));
        this.a = oip;
        if (this.a != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.a.a.f);
            arrayList.add(this.a.b);
            ois ois = this.a.a;
            oil.a = nzw.a(null, "audio/vorbis", ois.c, -1, ois.a, (int) ois.b, arrayList, null, null);
        }
        return true;
    }
}
