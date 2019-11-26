package defpackage;

import java.util.List;

/* renamed from: afjr */
public final class afjr {
    public int a;

    public final float a(awmc awmc, List list, int i, int i2) {
        if (i != 0) {
            float f = 0.0f;
            while (i2 < list.size()) {
                f += ((Float) list.get(i2)).floatValue() * a(awmc, list, i - 1, i2);
                i2++;
            }
            return f;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        return awmc.d.c(i3);
    }
}
