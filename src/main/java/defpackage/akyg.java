package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.youtube.R;

/* renamed from: akyg */
public abstract class akyg extends ufe {
    public void W_() {
        super.W_();
        Window window = this.c.getWindow();
        Context M_ = M_();
        TypedArray obtainStyledAttributes = M_.getTheme().obtainStyledAttributes(new int[]{16843499});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        int f = xss.f(M_);
        f = xss.d(M_) ? f - (dimension << 2) : xss.b(M_) ? f - (dimension + dimension) : -1;
        window.setLayout(f, -2);
        this.c.getWindow().setBackgroundDrawable(new ColorDrawable(xwe.a(M_(), R.attr.ytBrandBackgroundSolid)));
    }
}
