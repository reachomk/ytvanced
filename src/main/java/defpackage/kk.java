package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.support.design.textfield.TextInputLayout;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.youtube.R;

/* renamed from: kk */
public final class kk extends ks {
    public static final boolean a = (VERSION.SDK_INT >= 21);
    public boolean b = false;
    public long c = Long.MAX_VALUE;
    public StateListDrawable d;
    public hu e;
    public final TextWatcher f = new kn(this);
    private final lg j = new kp(this);

    public kk(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(int i) {
        return i != 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        float dimensionPixelOffset = (float) this.h.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.h.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.h.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        hu a = a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        hu a2 = a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.e = a;
        this.d = new StateListDrawable();
        this.d.addState(new int[]{16842922}, a);
        this.d.addState(new int[0], a2);
        this.g.a(agb.b(this.h, !a ? R.drawable.mtrl_ic_arrow_drop_down : R.drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.g;
        textInputLayout.d(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.g.a(new ko(this));
        this.g.a(this.j);
    }

    public final void a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (c()) {
                this.b = false;
            }
            if (this.b) {
                this.b = false;
            } else {
                this.i.toggle();
                if (this.i.a) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
            }
        }
    }

    private final hu a(float f, float f2, float f3, int i) {
        ia iaVar = new ia();
        iaVar.a(f, f, f2, f2);
        hu a = hu.a(this.h, f3);
        a.a(iaVar);
        hw hwVar = a.a;
        if (hwVar.i == null) {
            hwVar.i = new Rect();
        }
        a.a.i.set(0, i, 0, i);
        a.e = a.a.i;
        a.invalidateSelf();
        return a;
    }

    public final boolean c() {
        long currentTimeMillis = System.currentTimeMillis() - this.c;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public static AutoCompleteTextView a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
}
