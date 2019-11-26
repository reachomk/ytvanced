package defpackage;

import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: xnc */
public class xnc implements wxg {
    public final ImageView a;
    private final xnh b;
    private final xni c;
    private final Animation d;
    private boolean e;

    public xnc(ImageView imageView, xnh xnh, xni xni) {
        this.a = (ImageView) amqw.a((Object) imageView);
        this.b = (xnh) amqw.a((Object) xnh);
        this.c = xni;
        this.d = xnh.b();
        Animation animation = this.d;
        if (animation != null) {
            animation.setAnimationListener(new xnf(this));
        }
        imageView.setTag(R.id.bitmap_loader_tag, this);
        this.e = false;
    }

    private final void b() {
        this.a.setTag(R.id.bitmap_loader_tag, null);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        if (this.e) {
            if (this.a.getTag(R.id.bitmap_loader_tag) == this) {
                this.a.invalidate();
                xni xni = this.c;
                if (xni != null) {
                    xni.a();
                }
                b();
            }
            return;
        }
        xtl.d("Ignoring onBitmapRendered called before onResponse.");
    }
}
