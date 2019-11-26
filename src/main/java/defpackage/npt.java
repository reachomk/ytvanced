package defpackage;

import java.util.Locale;

/* renamed from: npt */
public final class npt {
    private final String[] a;
    private final int[] b;
    private final String[] c;
    private final int d;

    public npt(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.a = strArr;
        this.b = iArr;
        this.c = strArr2;
        this.d = i;
    }

    public final String a(String str, int i, int i2, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = this.d;
            if (i3 < i4) {
                stringBuilder.append(this.a[i3]);
                i4 = this.b[i3];
                if (i4 == 1) {
                    stringBuilder.append(str);
                } else if (i4 == 2) {
                    stringBuilder.append(String.format(Locale.US, this.c[i3], new Object[]{Integer.valueOf(i)}));
                } else if (i4 == 3) {
                    stringBuilder.append(String.format(Locale.US, this.c[i3], new Object[]{Integer.valueOf(i2)}));
                } else if (i4 == 4) {
                    stringBuilder.append(String.format(Locale.US, this.c[i3], new Object[]{Long.valueOf(j)}));
                }
                i3++;
            } else {
                stringBuilder.append(this.a[i4]);
                return stringBuilder.toString();
            }
        }
    }
}
