package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: uca */
final class uca implements ucc {
    private static final int[] a = new int[]{0, 4, 8, 10, 12, 14, 16, 18, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 150, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    private final int[] b = new int[a.length];
    private int c;
    private int d;
    private int e;
    private int f;

    uca() {
    }

    public final void a(int i, int i2) {
        uhy.a(i >= 0);
        this.d++;
        if (i > i2) {
            this.c++;
        }
        int[] iArr = this.b;
        int binarySearch = Arrays.binarySearch(a, i);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        }
        iArr[binarySearch] = iArr[binarySearch] + 1;
        this.e = Math.max(this.e, i);
        this.f += i;
    }

    public final boolean a() {
        return this.d != 0;
    }

    public final bcdv b() {
        if (!a()) {
            return null;
        }
        bcdy bcdy = (bcdy) bcdv.h.createBuilder();
        int i = this.c;
        bcdy.copyOnWrite();
        bcdv bcdv = (bcdv) bcdy.instance;
        bcdv.a |= 1;
        bcdv.b = i;
        i = this.d;
        bcdy.copyOnWrite();
        bcdv = (bcdv) bcdy.instance;
        bcdv.a |= 2;
        bcdv.c = i;
        i = this.f;
        bcdy.copyOnWrite();
        bcdv = (bcdv) bcdy.instance;
        bcdv.a |= 8;
        bcdv.e = i;
        i = this.e;
        bcdy.copyOnWrite();
        bcdv = (bcdv) bcdy.instance;
        bcdv.a |= 4;
        bcdv.d = i;
        int[] iArr = this.b;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int[] iArr2 = a;
            if (i2 >= iArr2.length) {
                break;
            }
            if (iArr[i2] > 0) {
                int i3 = i2 + 1;
                int length = iArr2.length;
                int i4 = iArr[i2];
                int i5 = iArr2[i2];
                Integer valueOf = i3 != length ? Integer.valueOf(iArr2[i3] - 1) : null;
                uhy.a(i4 > 0);
                bcdw bcdw = (bcdw) bcdt.e.createBuilder();
                bcdw.copyOnWrite();
                bcdt bcdt = (bcdt) bcdw.instance;
                bcdt.a |= 2;
                bcdt.c = i5;
                bcdw.copyOnWrite();
                bcdt = (bcdt) bcdw.instance;
                bcdt.a |= 1;
                bcdt.b = i4;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    bcdw.copyOnWrite();
                    bcdt = (bcdt) bcdw.instance;
                    bcdt.a |= 4;
                    bcdt.d = intValue;
                }
                arrayList.add((bcdt) ((anxl) bcdw.build()));
            }
            i2++;
        }
        List asList = Arrays.asList((bcdt[]) arrayList.toArray(new bcdt[0]));
        bcdy.copyOnWrite();
        bcdv bcdv2 = (bcdv) bcdy.instance;
        if (!bcdv2.f.a()) {
            bcdv2.f = anxl.mutableCopy(bcdv2.f);
        }
        anvf.addAll(asList, bcdv2.f);
        return (bcdv) ((anxl) bcdy.build());
    }
}
