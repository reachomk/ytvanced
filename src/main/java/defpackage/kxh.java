package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.google.android.youtube.R;

/* renamed from: kxh */
final /* synthetic */ class kxh implements OnLayoutChangeListener {
    private final kxe a;
    private final int b;
    private final int c;
    private final Context d;

    kxh(kxe kxe, int i, int i2, Context context) {
        this.a = kxe;
        this.b = i;
        this.c = i2;
        this.d = context;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        kxe kxe = this.a;
        i = this.b;
        i2 = this.c;
        Context context = this.d;
        for (Drawable drawable : kxe.a.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setBounds(0, i, i2, i + i2);
                st.a(drawable, xwe.a(context, R.attr.ytStaticBrandWhite));
            }
        }
    }
}
