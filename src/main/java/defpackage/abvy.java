package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: abvy */
final class abvy implements OnEditorActionListener {
    private final /* synthetic */ abvm a;

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4 && (keyEvent == null || keyEvent.getAction() != 0)) {
            return false;
        }
        this.a.v();
        return true;
    }

    /* synthetic */ abvy(abvm abvm) {
        this.a = abvm;
    }
}
