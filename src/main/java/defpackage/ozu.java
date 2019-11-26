package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ozu */
public final class ozu {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public static ozu a(oza oza) {
        try {
            oza.d(4);
            int d = (oza.d() & 3) + 1;
            if (d != 3) {
                int i;
                int i2;
                float f;
                int i3;
                ArrayList arrayList = new ArrayList();
                int d2 = oza.d() & 31;
                for (i = 0; i < d2; i++) {
                    arrayList.add(ozu.b(oza));
                }
                i = oza.d();
                for (i2 = 0; i2 < i; i2++) {
                    arrayList.add(ozu.b(oza));
                }
                if (d2 > 0) {
                    oyy a = oyw.a((byte[]) arrayList.get(0), d, ((byte[]) arrayList.get(0)).length);
                    d2 = a.e;
                    int i4 = a.f;
                    f = a.g;
                    i2 = d2;
                    i3 = i4;
                } else {
                    i2 = -1;
                    i3 = -1;
                    f = 1.0f;
                }
                return new ozu(arrayList, d, i2, i3, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new oae("Error parsing AVC config", e);
        }
    }

    private ozu(List list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    private static byte[] b(oza oza) {
        int e = oza.e();
        int i = oza.b;
        oza.d(e);
        byte[] bArr = oza.a;
        byte[] bArr2 = new byte[(oyd.a.length + e)];
        System.arraycopy(oyd.a, 0, bArr2, 0, oyd.a.length);
        System.arraycopy(bArr, i, bArr2, oyd.a.length, e);
        return bArr2;
    }
}
