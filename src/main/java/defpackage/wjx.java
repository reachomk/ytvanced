package defpackage;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;

/* renamed from: wjx */
final /* synthetic */ class wjx implements OnLayoutChangeListener {
    private final apbf a;
    private final ImageView b;

    wjx(apbf apbf, ImageView imageView) {
        this.a = apbf;
        this.b = imageView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        apbf apbf = this.a;
        ImageView imageView = this.b;
        aygk aygk = apbf.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, (i3 - i) - ((int) (aklb.g(aygk) * ((float) (i4 - i2)))), marginLayoutParams.bottomMargin);
        imageView.requestLayout();
    }
}
