package defpackage;

import java.util.ArrayList;

/* renamed from: bdcc */
public class bdcc {
    private final int a = 1;
    private Object[] b;
    private int c;
    public Object[] f;
    public volatile int g;

    public final void b(Object obj) {
        Object[] objArr;
        if (this.g == 0) {
            this.f = new Object[(this.a + 1)];
            objArr = this.f;
            this.b = objArr;
            objArr[0] = obj;
            this.c = 1;
            this.g = 1;
            return;
        }
        int i = this.c;
        int i2 = this.a;
        if (i == i2) {
            objArr = new Object[(i2 + 1)];
            objArr[0] = obj;
            this.b[i2] = objArr;
            this.b = objArr;
            this.c = 1;
            this.g++;
            return;
        }
        this.b[i] = obj;
        this.c = i + 1;
        this.g++;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.g;
        ArrayList arrayList = new ArrayList(i2 + 1);
        Object[] objArr = this.f;
        int i3 = 0;
        while (true) {
            int i4 = 0;
            while (i3 < i2) {
                arrayList.add(objArr[i4]);
                i3++;
                i4++;
                if (i4 == i) {
                    objArr = (Object[]) objArr[i];
                }
            }
            return arrayList.toString();
        }
    }
}
