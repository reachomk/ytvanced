package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;

/* renamed from: cyv */
final class cyv extends EditText {
    cyv(Context context) {
        super(context);
    }

    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }
}
