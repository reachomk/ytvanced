package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ogp */
final class ogp {
    public int A = 200;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public int L = 1;
    public int M = -1;
    public int N = 8000;
    public long O = 0;
    public long P = 0;
    public ogo Q;
    public boolean R;
    public boolean S = true;
    public String T = "eng";
    public ofy U;
    public int V;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public byte[] g;
    public ogb h;
    public byte[] i;
    public odq j;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = 0;
    public int p = -1;
    public float q = 0.0f;
    public float r = 0.0f;
    public float s = 0.0f;
    public byte[] t = null;
    public int u = -1;
    public boolean v = false;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int z = 1000;

    private ogp() {
    }

    public static Pair a(oza oza) {
        try {
            oza.d(16);
            long j = oza.j();
            if (j == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (j == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (j == 826496599) {
                int i = oza.b + 20;
                byte[] bArr = oza.a;
                while (true) {
                    int length = bArr.length;
                    if (i < length - 4) {
                        if (bArr[i] == (byte) 0 && bArr[i + 1] == (byte) 0 && bArr[i + 2] == (byte) 1) {
                            if (bArr[i + 3] == (byte) 15) {
                                return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i, length)));
                            }
                        }
                        i++;
                    } else {
                        throw new oae("Failed to find FourCC VC1 initialization data");
                    }
                }
            }
            oyp.a("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
            return new Pair("video/x-unknown", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new oae("Error parsing FourCC private data");
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
                        throw new oae(str);
                    }
                    throw new oae(str);
                }
                throw new oae(str);
            }
            throw new oae(str);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new oae(str);
        }
    }

    public static boolean b(oza oza) {
        try {
            int f = oza.f();
            if (f == 1) {
                return true;
            }
            if (f == 65534) {
                oza.c(24);
                return oza.m() == ogn.a.getMostSignificantBits() && oza.m() == ogn.a.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new oae("Error parsing MS/ACM codec private");
        }
    }

    /* synthetic */ ogp(byte b) {
    }
}
