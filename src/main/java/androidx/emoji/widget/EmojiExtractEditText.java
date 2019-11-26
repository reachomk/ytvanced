package androidx.emoji.widget;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import defpackage.aad;
import defpackage.adl;
import defpackage.axu;
import defpackage.axv;

public class EmojiExtractEditText extends ExtractEditText {
    private axu a;
    private boolean b;

    public EmojiExtractEditText(Context context) {
        super(context);
        a(null, 0, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 16842862, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(attributeSet, i, i2);
    }

    private final void a(AttributeSet attributeSet, int i, int i2) {
        if (!this.b) {
            this.b = true;
            int i3 = new axv(this, attributeSet, i, i2).a;
            axu a = a();
            aad.a(i3, "maxEmojiCount should be greater than 0");
            a.a.a(i3);
            setKeyListener(super.getKeyListener());
        }
    }

    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            axu a = a();
            aad.a((Object) keyListener, (Object) "keyListener cannot be null");
            keyListener = a.a.a(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return onCreateInputConnection != null ? a().a.a(onCreateInputConnection, editorInfo) : null;
    }

    private final axu a() {
        if (this.a == null) {
            this.a = new axu(this);
        }
        return this.a;
    }

    public final void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(adl.a((TextView) this, callback));
    }
}
