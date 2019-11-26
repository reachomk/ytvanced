package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: aicr */
final class aicr extends AnimationDrawable {
    private final ImageView a;
    private final Drawable b;
    private boolean c;

    public final boolean setVisible(boolean z, boolean z2) {
        z2 = super.setVisible(z, z2);
        if (!(z || this.c)) {
            b();
            this.b.setVisible(false, false);
        }
        return z2;
    }

    public final void a() {
        this.c = false;
        this.a.setImageDrawable(this);
        stop();
        selectDrawable(0);
        start();
    }

    public final void b() {
        this.c = true;
        this.a.setImageDrawable(this.b);
        stop();
    }

    /* synthetic */ aicr(ImageView imageView, int i, int i2) {
        this.a = imageView;
        Drawable a = ra.a(imageView.getContext(), i);
        this.b = ra.a(imageView.getContext(), i2);
        i2 = 0;
        if (a instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) a;
            setOneShot(animationDrawable.isOneShot());
            while (i2 < animationDrawable.getNumberOfFrames()) {
                addFrame(animationDrawable.getFrame(i2), animationDrawable.getDuration(i2));
                i2++;
            }
            return;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            addFrame(drawable, 0);
        }
    }
}
