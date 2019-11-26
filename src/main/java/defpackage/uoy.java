package defpackage;

import android.content.Context;

/* renamed from: uoy */
public final class uoy {
    public final ukq a = ukq.a;
    public final ukf b = ukf.a;
    public final uoh c = uoh.a;
    public Context d;
    public boolean e;
    public boolean f = true;
    public upb g;
    public ukm h;
    public boolean i;

    static int[] a(ukz ukz, int i) {
        ukz ukz2 = ukz;
        int i2 = i;
        int i3 = 1;
        uhy.a(true);
        long j = ukz2.g / ((long) i2);
        int[] iArr = new int[i2];
        int i4 = 0;
        while (i4 < i2) {
            long j2;
            int i5;
            long j3 = ((long) i4) * j;
            long j4 = j3 + j;
            long max = ((long) (((float) j) * (((float) i4) / ((float) Math.max(i3, i2 - 1))))) + j3;
            uhy.a(j3 <= j4);
            int b = ukz2.b(j3);
            int c = ukz2.c(j4 - 1);
            if (b == -1 || c == -1 || b > c) {
                j2 = j;
                i5 = i4;
                i3 = -1;
            } else {
                j2 = j;
                i5 = i4;
                long max2 = Math.max(Math.min(max, ukz2.b(c)), ukz2.b(b));
                int b2 = ukz2.b(max2);
                boolean z = b2 != -1 && b2 <= c;
                uhy.b(z);
                i3 = ukz2.c(max2);
                boolean z2 = i3 != -1 && i3 >= b;
                uhy.b(z2);
                long[] jArr = ukz2.h;
                if (jArr[b2] - max <= max - jArr[i3]) {
                    i3 = b2;
                }
            }
            if (i3 != -1) {
                iArr[i5] = i3;
            } else {
                iArr[i5] = ukz2.a(j3);
            }
            i4 = i5 + 1;
            j = j2;
            i3 = 1;
        }
        return iArr;
    }
}
