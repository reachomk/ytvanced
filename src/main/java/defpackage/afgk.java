package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: afgk */
public final class afgk {
    private static final int a = nxf.c("ytmp");
    private static final int b = nxf.c("mshp");
    private static final int c = nxf.c("raw ");
    private static final int d = nxf.c("dfl8");
    private static final int e = nxf.c("mesh");
    private static final int f = nxf.c("proj");
    private final List g = new ArrayList();

    private static int a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public final afkm a(byte[] bArr) {
        afkm afkm = null;
        if (bArr != null) {
            nwz nwz = new nwz(bArr);
            try {
                int i = nwz.b;
                nwz.c(0);
                nwz.d(4);
                int j = nwz.j();
                nwz.c(i);
                if (j != f) {
                    return a(nwz, nwz.c());
                }
                nwz.d(8);
                i = nwz.b;
                while (i < nwz.c()) {
                    nwz.c(i);
                    j = nwz.j();
                    if (j == 0) {
                        break;
                    }
                    int j2 = nwz.j();
                    if (j2 != a) {
                        if (j2 != b) {
                            i += j;
                        }
                    }
                    afkm = a(nwz, j + i);
                    break;
                }
                return afkm;
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    private final afkm a(nwz nwz, int i) {
        int d = nwz.d();
        nwz.d(3);
        if (d != 0) {
            return null;
        }
        afkm afkm;
        d = nwz.j();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (((afkm) this.g.get(i2)).a == d) {
                afkm = (afkm) this.g.get(i2);
                break;
            }
        }
        afkm = null;
        if (afkm != null) {
            return afkm;
        }
        int j = nwz.j();
        if (j == c) {
            afkm = afgk.a(nwz, i, d);
        } else if (j == d) {
            int[] iArr = new int[1];
            byte[] bArr = nwz.a;
            int i3 = nwz.b;
            byte[] a = afgk.a(bArr, i3, i - i3, iArr);
            if (a == null) {
                return null;
            }
            afkm = afgk.a(new nwz(a, iArr[0]), iArr[0], d);
        }
        if (afkm == null || afkm.b == null) {
            return null;
        }
        this.g.add(afkm);
        return afkm;
    }

    private static afkm a(nwz nwz, int i, int i2) {
        nwz nwz2 = nwz;
        int i3 = nwz2.b;
        afkm afkm = new afkm(i2);
        int i4 = i3;
        int i5 = 0;
        loop0:
        while (i4 < i) {
            nwz2.c(i4);
            int j = nwz.j();
            String str = "Projection mesh decoder error.";
            if (j != 0) {
                afkm afkm2;
                int i6;
                int i7;
                if (nwz.j() != e) {
                    afkm2 = afkm;
                    i6 = i4;
                    i7 = j;
                } else if (i5 < 2) {
                    int j2 = nwz.j();
                    if (j2 <= 10000) {
                        float[] fArr = new float[j2];
                        int i8 = 0;
                        while (i8 < j2) {
                            int i9 = i8 + 1;
                            fArr[i8] = Float.intBitsToFloat(nwz.j());
                            i8 = i9;
                        }
                        i8 = nwz.j();
                        if (i8 <= 32000) {
                            double log = Math.log(2.0d);
                            double d = (double) j2;
                            Double.isNaN(d);
                            Double.isNaN(d);
                            int ceil = (int) Math.ceil(Math.log(d + d) / log);
                            nxa nxa = new nxa(nwz2.a);
                            nxa.a(nwz2.b << 3);
                            float[] fArr2 = new float[(i8 * 5)];
                            int i10 = 0;
                            i7 = 0;
                            i6 = 0;
                            int i11 = 0;
                            int i12 = 0;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                int i15 = i10 + 1;
                                int a;
                                afkm afkm3;
                                int i16;
                                if (i10 < i8) {
                                    i10 = i7 + afgk.a(nxa.c(ceil));
                                    a = i6 + afgk.a(nxa.c(ceil));
                                    i3 = i11 + afgk.a(nxa.c(ceil));
                                    i6 = i4;
                                    i4 = i12 + afgk.a(nxa.c(ceil));
                                    i11 = ceil;
                                    ceil = i13 + afgk.a(nxa.c(ceil));
                                    i7 = j;
                                    afkm3 = afkm;
                                    if (Math.max(Math.max(i10, a), Math.max(i3, i4)) < j2 && ceil < j2) {
                                        i16 = i14 + 1;
                                        fArr2[i14] = fArr[i10];
                                        j = i16 + 1;
                                        fArr2[i16] = fArr[a];
                                        i16 = j + 1;
                                        fArr2[j] = fArr[i3];
                                        j = i16 + 1;
                                        fArr2[i16] = fArr[i4];
                                        i14 = j + 1;
                                        fArr2[j] = fArr[ceil];
                                        i13 = ceil;
                                        j = i7;
                                        ceil = i11;
                                        afkm = afkm3;
                                        i11 = i3;
                                        i12 = i4;
                                        i7 = i10;
                                        i4 = i6;
                                        i10 = i15;
                                        i3 = i;
                                        i6 = a;
                                        nwz2 = nwz;
                                    }
                                } else {
                                    afkm3 = afkm;
                                    i6 = i4;
                                    i7 = j;
                                    nxa.a((((nxa.b << 3) + nxa.c) + 7) & -8);
                                    nxa.c(32);
                                    nxa.c(8);
                                    i3 = nxa.c(8);
                                    a = nxa.c(32);
                                    if (a <= 128000) {
                                        double d2 = (double) i8;
                                        Double.isNaN(d2);
                                        Double.isNaN(d2);
                                        i16 = (int) Math.ceil(Math.log(d2 + d2) / log);
                                        float[] fArr3 = new float[(a * 3)];
                                        float[] fArr4 = new float[(a + a)];
                                        i10 = 0;
                                        j2 = 0;
                                        while (true) {
                                            int i17 = 4;
                                            if (i10 < a) {
                                                j2 += afgk.a(nxa.c(i16));
                                                if (j2 < i8) {
                                                    int i18 = i10 * 3;
                                                    ceil = j2 * 5;
                                                    fArr3[i18] = fArr2[ceil];
                                                    fArr3[i18 + 1] = fArr2[ceil + 1];
                                                    fArr3[i18 + 2] = fArr2[ceil + 2];
                                                    i18 = i10 + i10;
                                                    fArr4[i18] = fArr2[ceil + 3];
                                                    fArr4[i18 + 1] = fArr2[ceil + 4];
                                                    i10++;
                                                } else {
                                                    throw new RuntimeException(str);
                                                }
                                            }
                                            if (i3 == 1) {
                                                i17 = 5;
                                            } else if (i3 == 2) {
                                                i17 = 6;
                                            }
                                            afkp afkp = new afkp();
                                            afkp.a.add(new afko(fArr3, fArr4, i17));
                                            if (i5 != 0) {
                                                afkm2 = afkm3;
                                                afkm2.c = afkp;
                                            } else {
                                                afkm2 = afkm3;
                                                afkm2.b = afkp;
                                            }
                                            i5++;
                                        }
                                    } else {
                                        throw new RuntimeException(str);
                                    }
                                }
                            }
                            throw new RuntimeException(str);
                        }
                        throw new RuntimeException(str);
                    }
                    throw new RuntimeException(str);
                } else {
                    throw new RuntimeException(str);
                }
                i4 = i6 + i7;
                nwz2 = nwz;
                afkm = afkm2;
            } else {
                throw new RuntimeException(str);
            }
        }
        return afkm;
    }

    private static byte[] a(byte[] bArr, int i, int i2, int[] iArr) {
        Inflater inflater = new Inflater(true);
        inflater.setInput(bArr, i, i2);
        byte[] bArr2 = new byte[102400];
        int i3 = 0;
        int i4 = 102400;
        while (true) {
            try {
                i3 += inflater.inflate(bArr2, i3, i4 - i3);
                int needsInput = inflater.needsInput() ^ 1;
                if (needsInput != 0) {
                    i4 = bArr2.length;
                    byte[] bArr3 = new byte[(i4 + i4)];
                    System.arraycopy(bArr2, 0, bArr3, 0, i4);
                    i4 = bArr3.length;
                    bArr2 = bArr3;
                }
                if (needsInput == 0) {
                    iArr[0] = i3;
                    return bArr2;
                }
            } catch (DataFormatException unused) {
                return null;
            }
        }
    }
}
