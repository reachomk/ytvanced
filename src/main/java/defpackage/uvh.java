package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: uvh */
final /* synthetic */ class uvh implements OnEditorActionListener {
    private final uvg a;
    private final uvy b;

    uvh(uvg uvg, uvy uvy) {
        this.a = uvg;
        this.b = uvy;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        uvg uvg = this.a;
        uvy uvy = this.b;
        if (i != 6) {
            return false;
        }
        uvg.a(uvy);
        return true;
    }
}
