package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: akw */
public final class akw extends CheckedTextView {
    private static final int[] a = new int[]{16843016};
    private final aly b = new aly(this);

    public akw(Context context, AttributeSet attributeSet) {
        super(arv.a(context), attributeSet, 16843720);
        this.b.a(attributeSet, 16843720);
        this.b.a();
        arz a = arz.a(getContext(), attributeSet, a, 16843720, 0);
        setCheckMarkDrawable(a.a(0));
        a.a();
    }

    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(agb.b(getContext(), i));
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
        aly aly = this.b;
        if (aly != null) {
            aly.a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return alc.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(adl.a((TextView) this, callback));
    }
}
