package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.widget.TextView;
import defpackage.adl;
import defpackage.ayd;

public class EmojiTextView extends TextView {
    private ayd a;
    private boolean b;

    public EmojiTextView(Context context) {
        super(context);
        a();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }

    private final void a() {
        if (!this.b) {
            this.b = true;
            b().a.a();
        }
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(b().a.a(inputFilterArr));
    }

    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        b().a.a(z);
    }

    private final ayd b() {
        if (this.a == null) {
            this.a = new ayd(this);
        }
        return this.a;
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(adl.a((TextView) this, callback));
    }
}
