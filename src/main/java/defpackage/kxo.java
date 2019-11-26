package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.google.android.youtube.R;

/* renamed from: kxo */
final /* synthetic */ class kxo implements OnLayoutChangeListener {
    private final kxp a;

    kxo(kxp kxp) {
        this.a = kxp;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        kxp kxp = this.a;
        for (Drawable drawable : kxp.b.getCompoundDrawables()) {
            Drawable drawable2;
            if (drawable2 != null) {
                drawable2 = st.d(drawable2.mutate());
                st.a(drawable2, xwe.a(kxp.c, R.attr.ytIconInactive));
                kxp.b.setCompoundDrawablesRelative(drawable2, null, null, null);
            }
        }
    }
}
