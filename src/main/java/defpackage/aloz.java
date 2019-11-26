package defpackage;

import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: aloz */
public final class aloz {
    private static final akko a = akko.h().a((int) R.drawable.product_logo_avatar_square_grey_color_120).a();
    private final akkq b;
    private final ImageView c;

    public aloz(akkq akkq, ImageView imageView) {
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (ImageView) amqw.a((Object) imageView);
    }

    public final void a(aygk aygk) {
        this.b.a(this.c, aygk, a);
    }

    public final void a() {
        this.b.a(this.c);
    }

    public final void a(int i) {
        this.c.setVisibility(i);
    }
}
