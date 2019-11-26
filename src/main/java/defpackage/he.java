package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: he */
public final class he extends alg {
    private static final int[][] a = new int[][]{new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList b;

    public he(Context context, AttributeSet attributeSet) {
        super(hd.b(context, attributeSet, R.attr.radioButtonStyle, R.style.f734Widget.MaterialComponents.CompoundButton.RadioButton), attributeSet, (byte) 0);
        TypedArray a = hd.a(getContext(), attributeSet, hh.a, R.attr.radioButtonStyle, R.style.f734Widget.MaterialComponents.CompoundButton.RadioButton, new int[0]);
        boolean z = a.getBoolean(0, false);
        a.recycle();
        if (z && acu.a(this) == null) {
            if (this.b == null) {
                int a2 = hi.a((View) this, (int) R.attr.colorControlActivated);
                int a3 = hi.a((View) this, (int) R.attr.colorOnSurface);
                int a4 = hi.a((View) this, (int) R.attr.colorSurface);
                int[] iArr = new int[a.length];
                iArr[0] = fp.a(a4, a2, 1.0f);
                iArr[1] = fp.a(a4, a3, 0.54f);
                iArr[2] = fp.a(a4, a3, 0.38f);
                iArr[3] = fp.a(a4, a3, 0.38f);
                this.b = new ColorStateList(a, iArr);
            }
            acu.a(this, this.b);
        }
    }
}
