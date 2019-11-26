package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: kih */
final class kih {
    public final Context a;
    public final ImageView b;
    public final akko c;
    private final akkq d;

    public kih(Context context, ImageView imageView, akkq akkq) {
        this(context, imageView, akkq, null);
    }

    public kih(Context context, ImageView imageView, akkq akkq, akko akko) {
        this.a = context;
        this.b = imageView;
        this.d = akkq;
        this.c = akko;
    }

    public final void a(aygk aygk, boolean z) {
        this.b.setImageDrawable(null);
        if (this.b.getWidth() == 0) {
            this.b.addOnLayoutChangeListener(new kil(this, aygk, z));
            return;
        }
        Object c;
        if (z) {
            double width = (double) this.b.getWidth();
            Double.isNaN(width);
            int i = (int) (width / 0.5625d);
            width = (double) i;
            Double.isNaN(width);
            c = aklb.c(aygk, (int) (width * 1.7777777777777777d), i);
        } else {
            c = aklb.c(aygk, this.b.getWidth(), this.b.getHeight());
        }
        kig kig = new kig(this, z);
        if (c != null) {
            this.d.b(c, kig);
        } else {
            kig.a(c, null);
        }
    }
}
