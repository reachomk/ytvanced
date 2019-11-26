package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.youtube.R;

/* renamed from: hza */
final class hza implements OnLayoutChangeListener {
    private final int a;
    private int b;
    private final /* synthetic */ hyy c;

    hza(hyy hyy) {
        this.c = hyy;
        this.a = hyy.getResources().getDimensionPixelSize(R.dimen.app_related_end_screen_item_padding);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i4 -= i2;
        if (this.b != i4) {
            this.b = i4;
            hyy hyy = this.c;
            hyy.b = (i4 - hyy.c()) - this.a;
            view = this.c.a;
            if (view != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.bottomMargin = this.c.b;
                this.c.a.setLayoutParams(marginLayoutParams);
            }
            hyy = this.c;
            hyy.a(hyy.d.a, false, 0);
        }
    }
}
