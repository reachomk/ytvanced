package defpackage;

import android.text.Layout;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;

/* renamed from: hst */
final class hst implements OnGlobalLayoutListener {
    private final /* synthetic */ TextView a;
    private final /* synthetic */ TextView b;

    hst(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Layout layout = this.a.getLayout();
        if (layout != null && layout.getLineCount() != 0 && layout.getEllipsisCount(0) != 0) {
            String[] split = this.a.getText().toString().split(" • ");
            if (split.length == 2) {
                this.a.setText(split[0]);
                xpr.a(this.b, split[1]);
                this.a.requestLayout();
                this.b.requestLayout();
            }
        }
    }
}
