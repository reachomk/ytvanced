package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ala */
public class ala extends EditText implements abf {
    private final akv a;
    private final aly b;
    private final alv c;

    public ala(Context context) {
        this(context, null);
    }

    public ala(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public ala(Context context, AttributeSet attributeSet, int i) {
        super(arv.a(context), attributeSet, i);
        this.a = new akv(this);
        this.a.a(attributeSet, i);
        this.b = new aly(this);
        this.b.a(attributeSet, i);
        this.b.a();
        this.c = new alv(this);
    }

    public final Editable getText() {
        if (VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
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

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        aly aly = this.b;
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
}
