package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.abf;
import defpackage.acv;
import defpackage.adl;
import defpackage.adm;
import defpackage.agb;
import defpackage.akv;
import defpackage.alc;
import defpackage.alv;
import defpackage.aly;
import defpackage.arv;
import defpackage.ary;
import defpackage.sj;

public class AppCompatTextView extends TextView implements abf, acv, adm {
    private final akv a;
    private final aly b;
    private final alv c;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(arv.a(context), attributeSet, i);
        this.a = new akv(this);
        this.a.a(attributeSet, i);
        this.b = new aly(this);
        this.b.a(attributeSet, i);
        this.b.a();
        this.c = new alv(this);
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        akv akv = this.a;
        if (akv != null) {
            akv.a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        akv akv = this.a;
        if (akv != null) {
            akv.a();
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        akv akv = this.a;
        if (akv != null) {
            akv.a(colorStateList);
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        akv akv = this.a;
        return akv != null ? akv.b() : null;
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        akv akv = this.a;
        if (akv != null) {
            akv.a(mode);
        }
    }

    public final Mode getSupportBackgroundTintMode() {
        akv akv = this.a;
        return akv != null ? akv.c() : null;
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        aly aly = this.b;
        if (aly != null) {
            aly.a(context, i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        akv akv = this.a;
        if (akv != null) {
            akv.d();
        }
        aly aly = this.b;
        if (aly != null) {
            aly.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        aly aly = this.b;
        if (aly != null) {
            aly.b();
        }
    }

    public final void setTextSize(int i, float f) {
        if (k) {
            super.setTextSize(i, f);
            return;
        }
        aly aly = this.b;
        if (aly != null) {
            aly.a(i, f);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.b != null && !k && this.b.d()) {
            this.b.c();
        }
    }

    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (k) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        aly aly = this.b;
        if (aly != null) {
            aly.a(i);
        }
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (k) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        aly aly = this.b;
        if (aly != null) {
            aly.a(i, i2, i3, i4);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (k) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        aly aly = this.b;
        if (aly != null) {
            aly.a(iArr, i);
        }
    }

    public final int getAutoSizeTextType() {
        if (!k) {
            aly aly = this.b;
            if (aly != null) {
                return aly.e();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public final int getAutoSizeStepGranularity() {
        if (k) {
            return super.getAutoSizeStepGranularity();
        }
        aly aly = this.b;
        if (aly == null) {
            return -1;
        }
        return aly.f();
    }

    public final int getAutoSizeMinTextSize() {
        if (k) {
            return super.getAutoSizeMinTextSize();
        }
        aly aly = this.b;
        if (aly == null) {
            return -1;
        }
        return aly.g();
    }

    public final int getAutoSizeMaxTextSize() {
        if (k) {
            return super.getAutoSizeMaxTextSize();
        }
        aly aly = this.b;
        if (aly == null) {
            return -1;
        }
        return aly.h();
    }

    public final int[] getAutoSizeTextAvailableSizes() {
        if (k) {
            return super.getAutoSizeTextAvailableSizes();
        }
        aly aly = this.b;
        return aly != null ? aly.i() : new int[0];
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return alc.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public final void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            adl.b(this, i);
        }
    }

    public final void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            adl.c(this, i);
        }
    }

    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public final void setLineHeight(int i) {
        adl.d(this, i);
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(adl.a((TextView) this, callback));
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            alv alv = this.c;
            if (alv != null) {
                alv.a = textClassifier;
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public final TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            alv alv = this.c;
            if (alv != null) {
                return alv.a();
            }
        }
        return super.getTextClassifier();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        aly aly = this.b;
        if (aly != null) {
            aly.a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        aly aly = this.b;
        if (aly != null) {
            aly.a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        aly aly = this.b;
        if (aly != null) {
            aly.a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? agb.b(context, i) : null;
        Drawable b2 = i2 != 0 ? agb.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? agb.b(context, i3) : null;
        if (i4 != 0) {
            drawable = agb.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        aly aly = this.b;
        if (aly != null) {
            aly.a();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        aly aly = this.b;
        if (aly != null) {
            aly.a();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? agb.b(context, i) : null;
        Drawable b2 = i2 != 0 ? agb.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? agb.b(context, i3) : null;
        if (i4 != 0) {
            drawable = agb.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        aly aly = this.b;
        if (aly != null) {
            aly.a();
        }
    }

    public final void a(ColorStateList colorStateList) {
        aly aly = this.b;
        if (aly.a == null) {
            aly.a = new ary();
        }
        ary ary = aly.a;
        ary.a = colorStateList;
        ary.d = colorStateList != null;
        aly.j();
        this.b.a();
    }

    public final void a(Mode mode) {
        aly aly = this.b;
        if (aly.a == null) {
            aly.a = new ary();
        }
        ary ary = aly.a;
        ary.b = mode;
        ary.c = mode != null;
        aly.j();
        this.b.a();
    }

    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = sj.a(getContext(), typeface, i);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }
}
