package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import com.google.android.youtube.R;

/* renamed from: wli */
final class wli implements Runnable {
    private final /* synthetic */ Drawable a;
    private final /* synthetic */ Uri b;
    private final /* synthetic */ wlf c;

    wli(wlf wlf, Drawable drawable, Uri uri) {
        this.c = wlf;
        this.a = drawable;
        this.b = uri;
    }

    public final void run() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.c.a.setImageDrawable(null);
            return;
        }
        this.c.a.setImageDrawable(drawable);
        if (this.c.c && VERSION.SDK_INT >= 22) {
            drawable = this.a;
            if (drawable instanceof BitmapDrawable) {
                ss a = su.a(this.c.a.getContext().getResources(), ((BitmapDrawable) drawable).getBitmap());
                a.a(8.0f);
                this.c.a.setImageDrawable(a);
            }
        }
        if (!this.b.equals(this.c.a.getTag(R.id.bitmap_source_tag))) {
            this.c.a.setTag(R.id.bitmap_source_tag, this.b);
            if (this.c.b.hasStarted() && !this.c.b.hasEnded()) {
                this.c.b.cancel();
                this.c.b.reset();
            }
            wlf wlf = this.c;
            wlf.a.startAnimation(wlf.b);
        }
        drawable = this.a;
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (!animatable.isRunning()) {
                animatable.start();
            }
        }
    }
}
