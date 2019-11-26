package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.EditText;
import com.google.android.youtube.R;

/* renamed from: gkp */
public final class gkp implements OnLayoutChangeListener {
    public final int a;
    public boolean b = true;
    public EditText c;
    public View d;
    public View e;
    public View f;

    public gkp(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_continue_button_margin_bottom) - context.getResources().getDimensionPixelSize(R.dimen.text_color_picker_height);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_continue_button_height) + (dimensionPixelSize + dimensionPixelSize);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 != i6 || i4 != i8) {
            this.d.post(new gks(this));
        }
    }
}
