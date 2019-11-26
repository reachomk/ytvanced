package android.support.design.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v7.widget.AppCompatButton;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.agb;
import defpackage.fl;
import defpackage.fm;
import defpackage.fo;
import defpackage.hc;
import defpackage.hd;
import defpackage.hl;
import defpackage.ho;
import defpackage.ht;
import defpackage.hu;
import defpackage.ia;
import defpackage.st;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable {
    private static final int[] a = new int[]{16842911};
    private static final int[] b = new int[]{16842912};
    private final fl c;
    private Mode d;
    private ColorStateList e;
    private Drawable f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean l;
    private final LinkedHashSet m;
    private int n;

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int dimensionPixelSize;
        Drawable drawable;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        super(hd.b(context, attributeSet2, i2, R.style.f725Widget.MaterialComponents.Button), attributeSet2, i2);
        this.j = false;
        this.l = false;
        this.m = new LinkedHashSet();
        Context context2 = getContext();
        TypedArray a = hd.a(context2, attributeSet, fo.a, i, R.style.f725Widget.MaterialComponents.Button, new int[0]);
        this.i = a.getDimensionPixelSize(fo.m, 0);
        this.d = hc.a(a.getInt(fo.p, -1), Mode.SRC_IN);
        this.e = hl.a(getContext(), a, fo.o);
        this.f = hl.b(getContext(), a, fo.k);
        this.n = a.getInteger(fo.l, 1);
        this.g = a.getDimensionPixelSize(fo.n, 0);
        this.c = new fl(this, new ia(context2, attributeSet2, i2, R.style.f725Widget.MaterialComponents.Button));
        fl flVar = this.c;
        flVar.d = a.getDimensionPixelOffset(fo.d, 0);
        flVar.e = a.getDimensionPixelOffset(fo.e, 0);
        flVar.f = a.getDimensionPixelOffset(fo.f, 0);
        flVar.g = a.getDimensionPixelOffset(fo.c, 0);
        if (a.hasValue(fo.i)) {
            dimensionPixelSize = a.getDimensionPixelSize(fo.i, -1);
            flVar.h = dimensionPixelSize;
            float f = (float) dimensionPixelSize;
            flVar.c.a(f, f, f, f);
        }
        flVar.i = a.getDimensionPixelSize(fo.s, 0);
        flVar.j = hc.a(a.getInt(fo.h, -1), Mode.SRC_IN);
        flVar.k = hl.a(flVar.b.getContext(), a, fo.g);
        flVar.l = hl.a(flVar.b.getContext(), a, fo.r);
        flVar.m = hl.a(flVar.b.getContext(), a, fo.q);
        flVar.q = a.getBoolean(fo.b, false);
        dimensionPixelSize = a.getDimensionPixelSize(fo.j, 0);
        int j = abe.j(flVar.b);
        int paddingTop = flVar.b.getPaddingTop();
        i2 = abe.k(flVar.b);
        int paddingBottom = flVar.b.getPaddingBottom();
        MaterialButton materialButton = flVar.b;
        Drawable huVar = new hu(flVar.c);
        huVar.a(flVar.b.getContext());
        st.a(huVar, flVar.k);
        Mode mode = flVar.j;
        if (mode != null) {
            st.a(huVar, mode);
        }
        int i3 = flVar.i;
        ColorStateList colorStateList = flVar.l;
        huVar.a((float) i3);
        huVar.b(colorStateList);
        hu huVar2 = new hu(flVar.c);
        huVar2.setTint(0);
        int i4 = flVar.i;
        boolean z = flVar.o;
        huVar2.a((float) i4, 0);
        flVar.n = new hu(flVar.c);
        if (fl.a) {
            if (flVar.i > 0) {
                ia iaVar = new ia(flVar.c);
                float f2 = ((float) flVar.i) / 2.0f;
                ht htVar = iaVar.a;
                htVar.a += f2;
                htVar = iaVar.b;
                htVar.a += f2;
                htVar = iaVar.c;
                htVar.a += f2;
                htVar = iaVar.d;
                htVar.a += f2;
                huVar.a(iaVar);
                huVar2.a(iaVar);
                flVar.n.a(iaVar);
            }
            st.a(flVar.n, -1);
            flVar.r = new RippleDrawable(ho.a(flVar.m), flVar.a(new LayerDrawable(new Drawable[]{huVar2, huVar})), flVar.n);
            drawable = flVar.r;
        } else {
            st.a(flVar.n, ho.a(flVar.m));
            flVar.r = new LayerDrawable(new Drawable[]{huVar2, huVar, flVar.n});
            drawable = flVar.a(flVar.r);
        }
        super.setBackgroundDrawable(drawable);
        hu a2 = flVar.a();
        if (a2 != null) {
            a2.b((float) dimensionPixelSize);
        }
        abe.a(flVar.b, j + flVar.d, paddingTop + flVar.f, i2 + flVar.e, paddingBottom + flVar.g);
        a.recycle();
        setCompoundDrawablePadding(this.i);
        d();
    }

    private final String b() {
        return (!e() ? Button.class : CompoundButton.class).getName();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(b());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setChecked(this.j);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(b());
        accessibilityEvent.setChecked(this.j);
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            fl flVar = this.c;
            if (flVar.k != colorStateList) {
                flVar.k = colorStateList;
                if (flVar.a() != null) {
                    st.a(flVar.a(), flVar.k);
                }
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public final ColorStateList getSupportBackgroundTintList() {
        if (f()) {
            return this.c.k;
        }
        return super.getSupportBackgroundTintList();
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        if (f()) {
            fl flVar = this.c;
            if (flVar.j != mode) {
                flVar.j = mode;
                if (!(flVar.a() == null || flVar.j == null)) {
                    st.a(flVar.a(), flVar.j);
                }
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public final Mode getSupportBackgroundTintMode() {
        if (f()) {
            return this.c.j;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public final ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public final void setBackgroundTintMode(Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public final Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public final void setBackgroundColor(int i) {
        if (f()) {
            fl flVar = this.c;
            if (flVar.a() != null) {
                flVar.a().setTint(i);
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? agb.b(getContext(), i) : null);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            fl flVar = this.c;
            flVar.p = true;
            flVar.b.setSupportBackgroundTintList(flVar.k);
            flVar.b.setSupportBackgroundTintMode(flVar.j);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (VERSION.SDK_INT == 21) {
            fl flVar = this.c;
            if (flVar != null) {
                i4 -= i2;
                i3 -= i;
                hu huVar = flVar.n;
                if (huVar != null) {
                    huVar.setBounds(flVar.d, flVar.f, i3 - flVar.e, i4 - flVar.g);
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        c();
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        if (f()) {
            this.c.a().b(f);
        }
    }

    private final void c() {
        if (!(this.f == null || getLayout() == null)) {
            int i = this.n;
            int i2 = 0;
            if (i == 1 || i == 3) {
                this.h = 0;
                d();
            } else {
                TextPaint paint = getPaint();
                String charSequence = getText().toString();
                if (getTransformationMethod() != null) {
                    charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                }
                i = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
                int i3 = this.g;
                if (i3 == 0) {
                    i3 = this.f.getIntrinsicWidth();
                }
                int measuredWidth = (((((getMeasuredWidth() - i) - abe.k(this)) - i3) - this.i) - abe.j(this)) / 2;
                i = abe.g(this) != 1 ? 0 : 1;
                if (this.n == 4) {
                    i2 = 1;
                }
                if (i != i2) {
                    measuredWidth = -measuredWidth;
                }
                if (this.h != measuredWidth) {
                    this.h = measuredWidth;
                    d();
                }
            }
        }
    }

    private final void d() {
        int i;
        Drawable drawable = this.f;
        if (drawable != null) {
            this.f = st.d(drawable).mutate();
            st.a(this.f, this.e);
            Mode mode = this.d;
            if (mode != null) {
                st.a(this.f, mode);
            }
            i = this.g;
            if (i == 0) {
                i = this.f.getIntrinsicWidth();
            }
            int i2 = this.g;
            if (i2 == 0) {
                i2 = this.f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f;
            int i3 = this.h;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        i = this.n;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f, null, null, null);
        } else {
            setCompoundDrawablesRelative(null, null, this.f, null);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (e()) {
            mergeDrawableStates(onCreateDrawableState, a);
        }
        if (this.j) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }

    public final void setChecked(boolean z) {
        if (e() && isEnabled() && this.j != z) {
            this.j = z;
            refreshDrawableState();
            if (!this.l) {
                this.l = true;
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    ((fm) it.next()).a();
                }
                this.l = false;
            }
        }
    }

    public final boolean isChecked() {
        return this.j;
    }

    public final void toggle() {
        setChecked(this.j ^ 1);
    }

    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    private final boolean e() {
        fl flVar = this.c;
        return flVar != null && flVar.q;
    }

    public final ia a() {
        if (f()) {
            return this.c.c;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    private final boolean f() {
        fl flVar = this.c;
        return (flVar == null || flVar.p) ? false : true;
    }
}
