package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: ozg */
public class ozg {
    private static final Comparator a = ozf.a;
    private static final Comparator b = ozi.a;
    private final int c;
    private final ArrayList d = new ArrayList();
    private final ozh[] e = new ozh[5];
    private int f = -1;
    private int g;
    private int h;
    private int i;

    public ozg(int i) {
        this.c = i;
    }

    public final void a(int i, float f) {
        ozh ozh;
        if (this.f != 1) {
            Collections.sort(this.d, a);
            this.f = 1;
        }
        int i2 = this.i;
        if (i2 > 0) {
            ozh[] ozhArr = this.e;
            i2--;
            this.i = i2;
            ozh = ozhArr[i2];
        } else {
            ozh = new ozh();
        }
        int i3 = this.g;
        this.g = i3 + 1;
        ozh.a = i3;
        ozh.b = i;
        ozh.c = f;
        this.d.add(ozh);
        this.h += i;
        while (true) {
            i = this.h;
            int i4 = this.c;
            if (i > i4) {
                i -= i4;
                ozh ozh2 = (ozh) this.d.get(0);
                i2 = ozh2.b;
                if (i2 <= i) {
                    this.h -= i2;
                    this.d.remove(0);
                    i = this.i;
                    if (i < 5) {
                        ozh[] ozhArr2 = this.e;
                        this.i = i + 1;
                        ozhArr2[i] = ozh2;
                    }
                } else {
                    ozh2.b = i2 - i;
                    this.h -= i;
                }
            } else {
                return;
            }
        }
    }

    public final float a_(float f) {
        int i = 0;
        if (this.f != 0) {
            Collections.sort(this.d, b);
            this.f = 0;
        }
        f *= (float) this.h;
        int i2 = 0;
        while (i < this.d.size()) {
            ozh ozh = (ozh) this.d.get(i);
            i2 += ozh.b;
            if (((float) i2) >= f) {
                return ozh.c;
            }
            i++;
        }
        if (this.d.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.d;
        return ((ozh) arrayList.get(arrayList.size() - 1)).c;
    }
}
