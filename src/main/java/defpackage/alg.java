package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.youtube.R;

/* renamed from: alg */
public class alg extends RadioButton implements abf, adn {
    private final akz a;
    private final akv b;
    private final aly c;

    public alg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public alg(Context context, AttributeSet attributeSet, byte b) {
        super(arv.a(context), attributeSet, R.attr.radioButtonStyle);
        this.a = new akz(this);
        this.a.a(attributeSet, R.attr.radioButtonStyle);
        this.b = new akv(this);
        this.b.a(attributeSet, R.attr.radioButtonStyle);
        this.c = new aly(this);
        this.c.a(attributeSet, (int) R.attr.radioButtonStyle);
    }

    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        akz akz = this.a;
        if (akz != null) {
            akz.a();
        }
    }

    public final void setButtonDrawable(int i) {
        setButtonDrawable(agb.b(getContext(), i));
    }

    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        akz akz = this.a;
        return compoundPaddingLeft;
    }

    public final void a(ColorStateList colorStateList) {
        akz akz = this.a;
        if (akz != null) {
            akz.a(colorStateList);
        }
    }

    public final ColorStateList a() {
        akz akz = this.a;
        return akz != null ? akz.a : null;
    }

    public final void a(Mode mode) {
        akz akz = this.a;
        if (akz != null) {
            akz.a(mode);
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        akv akv = this.b;
        if (akv != null) {
            akv.a(colorStateList);
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        akv akv = this.b;
        return akv != null ? akv.b() : null;
    }

    public final void setSupportBackgroundTintMode(Mode mode) {
        akv akv = this.b;
        if (akv != null) {
            akv.a(mode);
        }
    }

    public final Mode getSupportBackgroundTintMode() {
        akv akv = this.b;
        return akv != null ? akv.c() : null;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        akv akv = this.b;
        if (akv != null) {
            akv.a();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        akv akv = this.b;
        if (akv != null) {
            akv.a(i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        akv akv = this.b;
        if (akv != null) {
            akv.d();
        }
        aly aly = this.c;
        if (aly != null) {
            aly.a();
        }
    }
}
