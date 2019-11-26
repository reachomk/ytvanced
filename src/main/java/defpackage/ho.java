package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.StateSet;

/* renamed from: ho */
public final class ho {
    private static final boolean a = (VERSION.SDK_INT >= 21);
    private static final int[] b = new int[]{16842919};
    private static final int[] c = new int[]{16843623, 16842908};
    private static final int[] d = new int[]{16842908};
    private static final int[] e = new int[]{16843623};
    private static final int[] f = new int[]{16842913, 16842919};
    private static final int[] g = new int[]{16842913, 16843623, 16842908};
    private static final int[] h = new int[]{16842913, 16842908};
    private static final int[] i = new int[]{16842913, 16843623};
    private static final int[] j = new int[]{16842913};

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr;
        if (a) {
            r0 = new int[2][];
            iArr = new int[]{j, ho.a(colorStateList, f)};
            r0[1] = StateSet.NOTHING;
            iArr[1] = ho.a(colorStateList, b);
            return new ColorStateList(r0, iArr);
        }
        r4 = new int[10][];
        int[] iArr2 = new int[10];
        int[] iArr3 = f;
        r4[0] = iArr3;
        iArr2[0] = ho.a(colorStateList, iArr3);
        iArr3 = g;
        r4[1] = iArr3;
        iArr2[1] = ho.a(colorStateList, iArr3);
        int[] iArr4 = h;
        r4[2] = iArr4;
        iArr2[2] = ho.a(colorStateList, iArr4);
        iArr = i;
        r4[3] = iArr;
        iArr2[3] = ho.a(colorStateList, iArr);
        r4[4] = j;
        iArr2[4] = 0;
        iArr = b;
        r4[5] = iArr;
        iArr2[5] = ho.a(colorStateList, iArr);
        iArr = c;
        r4[6] = iArr;
        iArr2[6] = ho.a(colorStateList, iArr);
        iArr = d;
        r4[7] = iArr;
        iArr2[7] = ho.a(colorStateList, iArr);
        iArr = e;
        r4[8] = iArr;
        iArr2[8] = ho.a(colorStateList, iArr);
        r4[9] = StateSet.NOTHING;
        iArr2[9] = 0;
        return new ColorStateList(r4, iArr2);
    }

    private static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList == null ? 0 : colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (!a) {
            return colorForState;
        }
        int alpha = Color.alpha(colorForState);
        return sc.c(colorForState, Math.min(alpha + alpha, 255));
    }
}
