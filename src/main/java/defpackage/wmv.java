package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: wmv */
final /* synthetic */ class wmv implements OnEditorActionListener {
    private final wmt a;

    wmv(wmt wmt) {
        this.a = wmt;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        wmt wmt = this.a;
        if (i != 6) {
            return false;
        }
        wmt.a.c(wmt.c.getText().toString());
        wmt.c.clearFocus();
        return true;
    }
}
