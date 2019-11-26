package defpackage;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: axw */
final class axw extends axx {
    private final EditText a;
    private final ayh b = new ayh(this.a);

    axw(EditText editText) {
        this.a = editText;
        this.a.addTextChangedListener(this.b);
        this.a.setEditableFactory(axy.a());
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        this.b.a = i;
    }

    /* Access modifiers changed, original: final */
    public final KeyListener a(KeyListener keyListener) {
        return !(keyListener instanceof ayb) ? new ayb(keyListener) : keyListener;
    }

    /* Access modifiers changed, original: final */
    public final InputConnection a(InputConnection inputConnection, EditorInfo editorInfo) {
        return !(inputConnection instanceof aya) ? new aya(this.a, inputConnection, editorInfo) : inputConnection;
    }
}
