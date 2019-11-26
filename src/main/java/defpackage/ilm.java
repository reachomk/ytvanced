package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;

/* renamed from: ilm */
final /* synthetic */ class ilm implements OnLayoutChangeListener {
    private final ilf a;
    private final OnClickListener b;

    ilm(ilf ilf, OnClickListener onClickListener) {
        this.a = ilf;
        this.b = onClickListener;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ilf ilf = this.a;
        OnClickListener onClickListener = this.b;
        if (ilf.b.b() || ilf.c.b()) {
            if (!ilf.d.hasOnClickListeners()) {
                ilf.d.setOnClickListener(onClickListener);
                xpr.a(ilf.d, null);
                ilf.d.setClickable(true);
            }
        } else if (ilf.d.hasOnClickListeners()) {
            ilf.d.setOnClickListener(null);
            ilf.d.setBackground(null);
            ilf.d.setClickable(false);
        }
    }
}
