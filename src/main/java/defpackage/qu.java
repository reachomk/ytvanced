package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: qu */
public class qu extends Activity implements aar {
    public final aac d = new aac();

    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !aao.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !aao.a(decorView, keyEvent)) {
            return aao.a(this, decorView, this, keyEvent);
        }
        return true;
    }
}
