package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.design.textfield.TextInputLayout;
import android.view.View;
import android.widget.EditText;
import com.google.android.youtube.R;

/* renamed from: kp */
final class kp implements lg {
    private final /* synthetic */ kk a;

    kp(kk kkVar) {
        this.a = kkVar;
    }

    public final void a(EditText editText) {
        int i;
        View a = kk.a(editText);
        kk kkVar = this.a;
        if (kk.a) {
            i = kkVar.g.g;
            if (i == 2) {
                a.setDropDownBackgroundDrawable(kkVar.e);
            } else if (i == 1) {
                a.setDropDownBackgroundDrawable(kkVar.d);
            }
        }
        kkVar = this.a;
        if (a.getKeyListener() == null) {
            TextInputLayout textInputLayout = kkVar.g;
            int i2 = textInputLayout.g;
            hu a2 = textInputLayout.a();
            int a3 = hi.a(a, (int) R.attr.colorControlHighlight);
            r8 = new int[2][];
            r8[0] = new int[]{16842919};
            r8[1] = new int[0];
            int a4;
            if (i2 == 2) {
                Drawable layerDrawable;
                a4 = hi.a(a, (int) R.attr.colorSurface);
                hu huVar = new hu(a2.a());
                a3 = fp.a(a3, a4, 0.1f);
                huVar.a(new ColorStateList(r8, new int[]{a3, 0}));
                if (kk.a) {
                    huVar.setTint(a4);
                    ColorStateList colorStateList = new ColorStateList(r8, new int[]{a3, a4});
                    hu huVar2 = new hu(a2.a());
                    huVar2.setTint(-1);
                    RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, huVar, huVar2);
                    layerDrawable = new LayerDrawable(new Drawable[]{rippleDrawable, a2});
                } else {
                    layerDrawable = new LayerDrawable(new Drawable[]{huVar, a2});
                }
                abe.a(a, layerDrawable);
            } else if (i2 == 1) {
                i2 = fp.a(a3, kkVar.g.h, 0.1f);
                int[] iArr = new int[]{i2, a4};
                if (kk.a) {
                    abe.a(a, new RippleDrawable(new ColorStateList(r8, iArr), a2, a2));
                } else {
                    new hu(a2.a()).a(new ColorStateList(r8, iArr));
                    Drawable layerDrawable2 = new LayerDrawable(new Drawable[]{a2, r1});
                    i = abe.j(a);
                    int paddingTop = a.getPaddingTop();
                    i2 = abe.k(a);
                    a3 = a.getPaddingBottom();
                    abe.a(a, layerDrawable2);
                    abe.a(a, i, paddingTop, i2, a3);
                }
            }
        }
        kkVar = this.a;
        a.setOnTouchListener(new kr(kkVar, a));
        a.setOnFocusChangeListener(new kq(kkVar));
        if (kk.a) {
            a.setOnDismissListener(new kt(kkVar));
        }
        a.setThreshold(0);
        editText.removeTextChangedListener(this.a.f);
        editText.addTextChangedListener(this.a.f);
        this.a.g.d(true);
    }
}
