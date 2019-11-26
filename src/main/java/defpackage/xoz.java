package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.LayerDrawable;
import com.google.android.youtube.R;

/* renamed from: xoz */
public final class xoz extends LayerDrawable implements Callback {
    public xoz(Context context, Drawable drawable) {
        Drawable[] drawableArr = new Drawable[2];
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        drawableArr[0] = drawable;
        drawableArr[1] = ra.a(context, (int) R.drawable.tab_new_content_background);
        super(drawableArr);
    }
}
