package defpackage;

import android.view.View.MeasureSpec;

/* renamed from: cpz */
public final class cpz {
    public static boolean a(int i, int i2) {
        boolean z = true;
        if (i != i2) {
            if (MeasureSpec.getMode(i) == 0) {
                return MeasureSpec.getMode(i2) == 0 ? z : false;
            } else {
                z = false;
            }
        }
    }

    public static boolean a(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i);
        if (!(i == i2 || (mode2 == 0 && mode == 0))) {
            float f = (float) i3;
            if ((mode != 1073741824 || Math.abs(((float) size) - f) >= 0.5f) && (!(mode == aocf.UNSET_ENUM_VALUE && mode2 == 0 && ((float) size) >= f) && (mode2 != aocf.UNSET_ENUM_VALUE || mode != aocf.UNSET_ENUM_VALUE || size2 <= size || f > ((float) size)))) {
                return false;
            }
        }
        return true;
    }
}
