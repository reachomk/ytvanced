package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

/* renamed from: akzd */
final /* synthetic */ class akzd implements OnLayoutChangeListener {
    private final TextView a;
    private final int b;

    akzd(TextView textView, int i) {
        this.a = textView;
        this.b = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextView textView = this.a;
        i = this.b;
        Drawable drawable = textView.getCompoundDrawablesRelative()[0];
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i);
            textView.setCompoundDrawablesRelative(drawable, null, null, null);
            LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.height = (i + textView.getPaddingTop()) + textView.getPaddingBottom();
            textView.setLayoutParams(layoutParams);
        }
    }
}
