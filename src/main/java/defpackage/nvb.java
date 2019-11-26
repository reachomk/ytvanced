package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: nvb */
final class nvb {
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public int F = 1;
    public int G = -1;
    public int H = 8000;
    public long I = 0;
    public long J = 0;
    public String K = "eng";
    public nrs L;
    public int M;
    public String a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = 0;
    public byte[] n = null;
    public int o = -1;
    public boolean p = false;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = 1000;
    public int u = 200;
    public float v = -1.0f;
    public float w = -1.0f;
    public float x = -1.0f;
    public float y = -1.0f;
    public float z = -1.0f;

    private nvb() {
    }

    public static List a(nwz nwz) {
        try {
            nwz.d(16);
            long i = nwz.i();
            if (i == 826496599) {
                int i2 = nwz.b + 20;
                byte[] bArr = nwz.a;
                while (true) {
                    int length = bArr.length;
                    if (i2 < length - 4) {
                        if (bArr[i2] == (byte) 0 && bArr[i2 + 1] == (byte) 0 && bArr[i2 + 2] == (byte) 1) {
                            if (bArr[i2 + 3] == (byte) 15) {
                                return Collections.singletonList(Arrays.copyOfRange(bArr, i2, length));
                            }
                        }
                        i2++;
                    } else {
                        throw new nnc("Failed to find FourCC VC1 initialization data");
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder(57);
            stringBuilder.append("Unsupported FourCC compression type: ");
            stringBuilder.append(i);
            throw new nnc(stringBuilder.toString());
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new nnc("Error parsing FourCC VC1 codec private");
        }
    }

    public static Pair b(nwz nwz) {
        try {
            nwz.c(4);
            int d = (nwz.d() & 3) + 1;
            if (d != 3) {
                ArrayList arrayList = new ArrayList();
                int d2 = nwz.d() & 31;
                for (int i = 0; i < d2; i++) {
                    arrayList.add(nwv.a(nwz));
                }
                d2 = nwz.d();
                for (int i2 = 0; i2 < d2; i2++) {
                    arrayList.add(nwv.a(nwz));
                }
                return Pair.create(arrayList, Integer.valueOf(d));
            }
            throw new nnc();
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new nnc("Error parsing AVC codec private");
        }
    }

    public static Pair c(nwz nwz) {
        try {
            int i;
            int e;
            nwz.c(21);
            int d = nwz.d() & 3;
            int d2 = nwz.d();
            int i2 = nwz.b;
            int i3 = 0;
            int i4 = 0;
            while (i3 < d2) {
                nwz.d(1);
                int e2 = nwz.e();
                i = i4;
                for (i4 = 0; i4 < e2; i4++) {
                    e = nwz.e();
                    i += e + 4;
                    nwz.d(e);
                }
                i3++;
                i4 = i;
            }
            nwz.c(i2);
            byte[] bArr = new byte[i4];
            i3 = 0;
            i = 0;
            while (i3 < d2) {
                nwz.d(1);
                e = nwz.e();
                int i5 = i;
                for (i = 0; i < e; i++) {
                    int e3 = nwz.e();
                    System.arraycopy(nwv.a, 0, bArr, i5, nwv.a.length);
                    i5 += nwv.a.length;
                    System.arraycopy(nwz.a, nwz.b, bArr, i5, e3);
                    i5 += e3;
                    nwz.d(e3);
                }
                i3++;
                i = i5;
            }
            return Pair.create(i4 != 0 ? Collections.singletonList(bArr) : null, Integer.valueOf(d + 1));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new nnc("Error parsing HEVC codec private");
        }
    }

    public static List a(byte[] bArr) {
        String str = "Error parsing vorbis codec private";
        try {
            if (bArr[0] == (byte) 2) {
                byte b;
                byte b2;
                int i = 1;
                int i2 = 0;
                while (true) {
                    b = bArr[i];
                    if (b != (byte) -1) {
                        break;
                    }
                    i2 += 255;
                    i++;
                }
                i++;
                i2 += b;
                int i3 = 0;
                while (true) {
                    b2 = bArr[i];
                    if (b2 != (byte) -1) {
                        break;
                    }
                    i3 += 255;
                    i++;
                }
                i++;
                i3 += b2;
                if (bArr[i] == (byte) 1) {
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, i, bArr2, 0, i2);
                    i += i2;
                    if (bArr[i] == (byte) 3) {
                        i += i3;
                        if (bArr[i] == (byte) 5) {
                            i2 = bArr.length - i;
                            byte[] bArr3 = new byte[i2];
                            System.arraycopy(bArr, i, bArr3, 0, i2);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new nnc(str);
                    }
                    throw new nnc(str);
                }
                throw new nnc(str);
            }
            throw new nnc(str);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new nnc(str);
        }
    }

    public static boolean d(nwz nwz) {
        try {
            int f = nwz.f();
            if (f == 1) {
                return true;
            }
            if (f == 65534) {
                nwz.c(24);
                return nwz.l() == nuz.a.getMostSignificantBits() && nwz.l() == nuz.a.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new nnc("Error parsing MS/ACM codec private");
        }
    }

    /* synthetic */ nvb(byte b) {
    }
}
