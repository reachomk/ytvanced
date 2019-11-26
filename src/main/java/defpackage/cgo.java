package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: cgo */
public abstract class cgo extends cgt implements che {
    private Animatable d;

    public cgo(ImageView imageView) {
        super(imageView);
    }

    public abstract void a(Object obj);

    public final Drawable e() {
        return ((ImageView) this.c).getDrawable();
    }

    public final void d(Drawable drawable) {
        ((ImageView) this.c).setImageDrawable(drawable);
    }

    public void b(Drawable drawable) {
        c(null);
        d(drawable);
    }

    public void c(Drawable drawable) {
        c(null);
        d(drawable);
    }

    public void a(Drawable drawable) {
        super.a(drawable);
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
        c(null);
        d(drawable);
    }

    public void a(Object obj, chb chb) {
        if (chb == null || !chb.a(obj, this)) {
            c(obj);
        } else {
            d(obj);
        }
    }

    public final void a() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void b() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    private final void c(Object obj) {
        a(obj);
        d(obj);
    }

    private final void d(Object obj) {
        if (obj instanceof Animatable) {
            this.d = (Animatable) obj;
            this.d.start();
            return;
        }
        this.d = null;
    }
}
