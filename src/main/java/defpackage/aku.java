package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: aku */
public class aku extends AutoCompleteTextView implements abf {
    private static final int[] a = new int[]{16843126};
    private final akv b;
    private final aly c;

    public aku(Context context) {
        this(context, null);
    }

    public aku(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public aku(Context context, AttributeSet attributeSet, int i) {
        super(arv.a(context), attributeSet, i);
        arz a = arz.a(getContext(), attributeSet, a, i, 0);
        if (a.h(0)) {
            setDropDownBackgroundDrawable(a.a(0));
        }
        a.a();
        this.b = new akv(this);
        this.b.a(attributeSet, i);
        this.c = new aly(this);
        this.c.a(attributeSet, i);
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return alc.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(adl.a((TextView) this, callback));
    }
}
