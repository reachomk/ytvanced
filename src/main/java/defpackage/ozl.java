package defpackage;

import java.util.Arrays;

/* renamed from: ozl */
public final class ozl {
    private long[] a = new long[10];
    private Object[] b = new Object[10];
    private int c;
    private int d;

    public final synchronized void a(long j, Object obj) {
        int i;
        int i2 = this.d;
        if (i2 > 0) {
            if (j <= this.a[((this.c + i2) - 1) % this.b.length]) {
                a();
            }
        }
        i2 = this.b.length;
        if (this.d >= i2) {
            i = i2 + i2;
            long[] jArr = new long[i];
            Object[] objArr = new Object[i];
            int i3 = this.c;
            i2 -= i3;
            System.arraycopy(this.a, i3, jArr, 0, i2);
            System.arraycopy(this.b, this.c, objArr, 0, i2);
            i3 = this.c;
            if (i3 > 0) {
                System.arraycopy(this.a, 0, jArr, i2, i3);
                System.arraycopy(this.b, 0, objArr, i2, this.c);
            }
            this.a = jArr;
            this.b = objArr;
            this.c = 0;
        }
        i2 = this.c;
        i = this.d;
        Object[] objArr2 = this.b;
        i2 = (i2 + i) % objArr2.length;
        this.a[i2] = j;
        objArr2[i2] = obj;
        this.d = i + 1;
    }

    public final synchronized void a() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, null);
    }

    public final synchronized Object a(long j) {
        Object obj;
        obj = null;
        while (true) {
            int i = this.d;
            if (i <= 0) {
                break;
            }
            long[] jArr = this.a;
            int i2 = this.c;
            if (j - jArr[i2] < 0) {
                break;
            }
            Object[] objArr = this.b;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            this.c = (i2 + 1) % objArr.length;
            this.d = i - 1;
            obj = obj2;
        }
        return obj;
    }
}
