package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.abf;
import defpackage.acv;
import defpackage.adl;
import defpackage.akv;
import defpackage.aly;
import defpackage.arv;

public class AppCompatButton extends Button implements abf, acv {
    public final akv mBackgroundTintHelper;
    public final aly mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(arv.a(context), attributeSet, i);
        this.mBackgroundTintHelper = new akv(this);
        this.mBackgroundTintHelper.a(attributeSet, i);
        this.mTextHelper = new aly(this);
        this.mTextHelper.a(attributeSet, i);
        this.mTextHelper.a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        akv akv = this.mBackgroundTintHelper;
        if (akv != null) {
            akv.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        akv akv = this.mBackgroundTintHelper;
        if (akv != null) {
            akv.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        akv akv = this.mBackgroundTintHelper;
        if (akv != null) {
            akv.a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        akv akv = this.mBackgroundTintHelper;
        return akv != null ? akv.b() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        akv akv = this.mBackgroundTintHelper;
        if (akv != null) {
            akv.a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        akv akv = this.mBackgroundTintHelper;
        return akv != null ? akv.c() : null;
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        akv akv = this.mBackgroundTintHelper;
        if (akv != null) {
            akv.d();
        }
        aly aly = this.mTextHelper;
        if (aly != null) {
            aly.a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        aly aly = this.mTextHelper;
        if (aly != null) {
            aly.a(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        aly aly = this.mTextHelper;
        if (aly != null) {
            aly.b();
        }
    }

    public void setTextSize(int i, float f) {
        if (k) {
            super.setTextSize(i, f);
            return;
        }
        aly aly = this.mTextHelper;
        if (aly != null) {
            aly.a(i, f);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null && !k && this.mTextHelper.d()) {
            this.mTextHelper.c();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (k) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        aly aly = this.mTextHelper;
        if (aly != null) {
            aly.a(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (k) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        aly aly = this.mTextHelper;
        if (aly != null) {
            aly.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (k) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        aly aly = this.mTextHelper;
        if (aly != null) {
            aly.a(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        if (!k) {
            aly aly = this.mTextHelper;
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

    public int getAutoSizeStepGranularity() {
        if (k) {
            return super.getAutoSizeStepGranularity();
        }
        aly aly = this.mTextHelper;
        if (aly == null) {
            return -1;
        }
        return aly.f();
    }

    public int getAutoSizeMinTextSize() {
        if (k) {
            return super.getAutoSizeMinTextSize();
        }
        aly aly = this.mTextHelper;
        if (aly == null) {
            return -1;
        }
        return aly.g();
    }

    public int getAutoSizeMaxTextSize() {
        if (k) {
            return super.getAutoSizeMaxTextSize();
        }
        aly aly = this.mTextHelper;
        if (aly == null) {
            return -1;
        }
        return aly.h();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (k) {
            return super.getAutoSizeTextAvailableSizes();
        }
        aly aly = this.mTextHelper;
        return aly != null ? aly.i() : new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        aly aly = this.mTextHelper;
        if (aly != null) {
            aly.a(z);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(adl.a((TextView) this, callback));
    }
}
