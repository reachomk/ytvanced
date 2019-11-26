package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: paa */
public final class paa {
    public final List a;
    public final int b;

    public static paa a(oza oza) {
        try {
            int i;
            int e;
            oza.d(21);
            int d = oza.d() & 3;
            int d2 = oza.d();
            int i2 = oza.b;
            int i3 = 0;
            int i4 = 0;
            while (i3 < d2) {
                oza.d(1);
                int e2 = oza.e();
                i = i4;
                for (i4 = 0; i4 < e2; i4++) {
                    e = oza.e();
                    i += e + 4;
                    oza.d(e);
                }
                i3++;
                i4 = i;
            }
            oza.c(i2);
            byte[] bArr = new byte[i4];
            i3 = 0;
            i = 0;
            while (i3 < d2) {
                oza.d(1);
                e = oza.e();
                int i5 = i;
                for (i = 0; i < e; i++) {
                    int e3 = oza.e();
                    System.arraycopy(oyw.a, 0, bArr, i5, oyw.a.length);
                    i5 += oyw.a.length;
                    System.arraycopy(oza.a, oza.b, bArr, i5, e3);
                    i5 += e3;
                    oza.d(e3);
                }
                i3++;
                i = i5;
            }
            return new paa(i4 != 0 ? Collections.singletonList(bArr) : null, d + 1);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw new oae("Error parsing HEVC config", e4);
        }
    }

    private paa(List list, int i) {
        this.a = list;
        this.b = i;
    }
}
