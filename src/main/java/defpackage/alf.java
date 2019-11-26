package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.youtube.R;

/* renamed from: alf */
public final class alf extends MultiAutoCompleteTextView implements abf {
    private static final int[] a = new int[]{16843126};
    private final akv b;
    private final aly c;

    public alf(Context context, AttributeSet attributeSet) {
        super(arv.a(context), attributeSet, R.attr.autoCompleteTextViewStyle);
        arz a = arz.a(getContext(), attributeSet, a, R.attr.autoCompleteTextViewStyle, 0);
        if (a.h(0)) {
            setDropDownBackgroundDrawable(a.a(0));
        }
        a.a();
        this.b = new akv(this);
        this.b.a(attributeSet, R.attr.autoCompleteTextViewStyle);
        this.c = new aly(this);
        this.c.a(attributeSet, (int) R.attr.autoCompleteTextViewStyle);
        this.c.a();
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(agb.b(getContext(), i));
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        akv akv = this.b;
        if (akv != null) {
            akv.a(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        akv akv = this.b;
        if (akv != null) {
            akv.a();
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

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        aly aly = this.c;
        if (aly != null) {
            aly.a(context, i);
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return alc.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }
}
