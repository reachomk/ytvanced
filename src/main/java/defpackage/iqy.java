package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: iqy */
final /* synthetic */ class iqy implements OnEditorActionListener {
    private final iqu a;

    iqy(iqu iqu) {
        this.a = iqu;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        iqu iqu = this.a;
        if (TextUtils.getTrimmedLength(iqu.aK) > 0) {
            abnx abnx = iqu.at;
            String str = iqu.aK;
            abnx.t = 13;
            abnx.g = str;
            xpr.a(iqu.aF);
            iqu.d(iqu.aK);
        }
        return true;
    }
}
