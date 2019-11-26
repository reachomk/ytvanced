package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: yfn */
final class yfn implements OnEditorActionListener {
    private final /* synthetic */ yfh a;

    yfn(yfh yfh) {
        this.a = yfh;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (!textView.getText().toString().trim().isEmpty()) {
            this.a.d();
        }
        return true;
    }
}
