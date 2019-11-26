package defpackage;

import android.view.View.MeasureSpec;

/* renamed from: cya */
public final class cya {
    public static int a(int i) {
        int mode = MeasureSpec.getMode(i);
        if (mode == aocf.UNSET_ENUM_VALUE) {
            return MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), aocf.UNSET_ENUM_VALUE);
        }
        if (mode == 0) {
            return MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 0);
        }
        if (mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 1073741824);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }

    public static void a(int i, int i2, float f, crd crd) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        int ceil = (int) Math.ceil((double) (((float) i) / f));
        int ceil2 = (int) Math.ceil((double) (((float) i2) * f));
        if (mode == 0 && mode2 == 0) {
            crd.a = 0;
            crd.b = 0;
        } else if (mode != aocf.UNSET_ENUM_VALUE || mode2 != aocf.UNSET_ENUM_VALUE) {
            if (mode == 1073741824) {
                crd.a = i;
                if (mode2 != 0 && ceil > i2) {
                    crd.b = i2;
                    return;
                }
                crd.b = ceil;
            } else if (mode2 == 1073741824) {
                crd.b = i2;
                if (mode != 0 && ceil2 > i) {
                    crd.a = i;
                } else {
                    crd.a = ceil2;
                }
            } else if (mode == aocf.UNSET_ENUM_VALUE) {
                crd.a = i;
                crd.b = ceil;
            } else if (mode2 == aocf.UNSET_ENUM_VALUE) {
                crd.a = ceil2;
                crd.b = i2;
            }
        } else if (ceil <= i2) {
            crd.a = i;
            crd.b = ceil;
        } else {
            crd.a = ceil2;
            crd.b = i2;
        }
    }
}
