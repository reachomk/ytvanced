package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: itc */
final class itc implements OnPreDrawListener {
    public final /* synthetic */ ita a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ int c;
    private final /* synthetic */ List d;

    itc(ita ita, boolean z, int i, List list) {
        this.a = ita;
        this.b = z;
        this.c = i;
        this.d = list;
    }

    public final boolean onPreDraw() {
        this.a.d.getViewTreeObserver().removeOnPreDrawListener(this);
        int measuredWidth = this.b ? (this.a.d.getMeasuredWidth() + this.a.a.getDimensionPixelSize(R.dimen.clarification_box_open_in_new_icon_size)) + this.a.a.getDimensionPixelSize(R.dimen.clarification_box_open_in_new_icon_padding_start) : 0;
        WrappingTextViewForClarifyBox wrappingTextViewForClarifyBox = this.a.c;
        wrappingTextViewForClarifyBox.b = this.c;
        wrappingTextViewForClarifyBox.d = new itf(this, this.b);
        wrappingTextViewForClarifyBox = this.a.c;
        wrappingTextViewForClarifyBox.c = measuredWidth;
        wrappingTextViewForClarifyBox.a = new ArrayList(this.d);
        wrappingTextViewForClarifyBox.requestLayout();
        this.a.b.invalidate();
        return true;
    }
}
