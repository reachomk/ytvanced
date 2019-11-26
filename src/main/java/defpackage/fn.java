package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: fn */
public final class fn extends akx {
    private static final int[][] a = new int[][]{new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList b;

    public fn(Context context, AttributeSet attributeSet) {
        super(hd.b(context, attributeSet, R.attr.checkboxStyle, R.style.f733Widget.MaterialComponents.CompoundButton.CheckBox), attributeSet, (byte) 0);
        TypedArray a = hd.a(getContext(), attributeSet, fq.a, R.attr.checkboxStyle, R.style.f733Widget.MaterialComponents.CompoundButton.CheckBox, new int[0]);
        boolean z = a.getBoolean(0, false);
        a.recycle();
        if (z && acu.a(this) == null) {
            if (this.b == null) {
                int[] iArr = new int[a.length];
                int a2 = hi.a((View) this, (int) R.attr.colorControlActivated);
                int a3 = hi.a((View) this, (int) R.attr.colorSurface);
                int a4 = hi.a((View) this, (int) R.attr.colorOnSurface);
                iArr[0] = fp.a(a3, a2, 1.0f);
                iArr[1] = fp.a(a3, a4, 0.54f);
                iArr[2] = fp.a(a3, a4, 0.38f);
                iArr[3] = fp.a(a3, a4, 0.38f);
                this.b = new ColorStateList(a, iArr);
            }
            acu.a(this, this.b);
        }
    }
}
