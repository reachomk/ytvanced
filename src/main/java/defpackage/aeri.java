package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: aeri */
public final class aeri implements aerg {
    private static final Comparator b = new aerh();
    private static final Comparator c = new aerk();
    private final int d;
    private final ArrayList e = new ArrayList();
    private final float f;
    private final aerj[] g = new aerj[5];
    private int h = -1;
    private int i;
    private int j;

    public aeri(int i, float f) {
        this.d = i;
        this.f = f;
    }

    public final void a() {
    }

    public final void a(float f) {
        aerj aerj;
        if (this.h != 1) {
            Collections.sort(this.e, b);
            this.h = 1;
        }
        int i = this.j;
        if (i > 0) {
            aerj[] aerjArr = this.g;
            i--;
            this.j = i;
            aerj = aerjArr[i];
        } else {
            aerj = new aerj();
        }
        int i2 = this.i;
        this.i = i2 + 1;
        aerj.a = i2;
        aerj.b = f;
        while (this.e.size() >= this.d) {
            aerj aerj2 = (aerj) this.e.get(0);
            this.e.remove(0);
            i2 = this.j;
            if (i2 < 5) {
                aerj[] aerjArr2 = this.g;
                this.j = i2 + 1;
                aerjArr2[i2] = aerj2;
            }
        }
        this.e.add(aerj);
    }

    public final float b() {
        if (this.e.isEmpty()) {
            return Float.NaN;
        }
        if (this.h != 0) {
            Collections.sort(this.e, c);
            this.h = 0;
        }
        int size = this.e.size();
        float f = this.f;
        float f2 = (float) (size + 1);
        if (f <= 1.0f / f2) {
            return ((aerj) this.e.get(0)).b;
        }
        float f3 = (float) size;
        if (f >= f3 / (f3 + 1.0f)) {
            return ((aerj) this.e.get(size - 1)).b;
        }
        f2 = (f2 * f) - 4.0f;
        size = (int) f2;
        f3 = ((aerj) this.e.get(size)).b;
        return f3 + ((f2 % 1.0f) * (((aerj) this.e.get(size + 1)).b - f3));
    }
}
