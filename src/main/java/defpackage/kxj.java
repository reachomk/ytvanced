package defpackage;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: kxj */
final class kxj {
    public final Context a;
    public final kxt b;
    public final kxf c;
    public final FrameLayout d;
    public final int e;
    public final int f;
    public kxa g;
    public kxq h;
    public kxq i;

    kxj(Context context, kxt kxt, kxf kxf, FrameLayout frameLayout) {
        this.a = context;
        this.b = kxt;
        this.c = kxf;
        this.d = frameLayout;
        this.e = context.getResources().getDimensionPixelSize(R.dimen.primetime_no_box_bottom_margin);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.primetime_box_bottom_margin);
    }

    public final void a(int i) {
        LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).setMarginEnd(this.a.getResources().getDimensionPixelSize(i));
            this.d.setLayoutParams(layoutParams);
        }
    }

    public final void a(LayoutParams layoutParams, int i) {
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).bottomMargin = i;
            this.d.setLayoutParams(layoutParams);
        }
    }
}
