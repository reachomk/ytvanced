package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: jmm */
final /* synthetic */ class jmm implements OnEditorActionListener {
    private final jml a;

    jmm(jml jml) {
        this.a = jml;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        jml jml = this.a;
        if (i != 3) {
            return false;
        }
        jml.a(false);
        return true;
    }
}
