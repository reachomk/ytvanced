package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;

/* renamed from: gon */
public final class gon implements xne {
    private final ColorDrawable a;

    public gon(ColorDrawable colorDrawable) {
        this.a = colorDrawable;
    }

    public final void a(ImageView imageView) {
        imageView.setImageDrawable(this.a);
    }
}
