package defpackage;

import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;

/* renamed from: kej */
final class kej {
    public final ImageView a;
    public final int b;
    private final int c;
    private final /* synthetic */ kdw d;

    public kej(kdw kdw, ImageView imageView, int i, int i2) {
        this.d = kdw;
        this.a = imageView;
        this.c = i;
        this.b = i2;
    }

    public final void a() {
        this.a.setImageResource(this.c);
        this.a.setTag("default");
        b();
    }

    public final void b() {
        this.a.getDrawable().mutate().setColorFilter(this.d.c, Mode.SRC_IN);
    }
}
