package defpackage;

import android.text.Layout;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: kjx */
final class kjx implements OnLayoutChangeListener {
    private final /* synthetic */ kjs a;

    kjx(kjs kjs) {
        this.a = kjs;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((View) view.getParent()) != null && this.a.a.getVisibility() == 0) {
            Layout layout = this.a.a.getLayout();
            if (layout != null && layout.getLineCount() > 0 && layout.getEllipsisCount(0) > 0) {
                this.a.a.setVisibility(8);
            }
        }
    }
}
