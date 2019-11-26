package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputEditText;

/* renamed from: uzy */
public final class uzy extends InputConnectionWrapper {
    private final /* synthetic */ CodeInputEditText a;

    public uzy(CodeInputEditText codeInputEditText, InputConnection inputConnection) {
        this.a = codeInputEditText;
        super(inputConnection, true);
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            CodeInputEditText codeInputEditText = this.a;
            uzx uzx = codeInputEditText.a;
            if (uzx != null) {
                uzx.a(codeInputEditText);
            }
        }
        return super.sendKeyEvent(keyEvent);
    }
}
