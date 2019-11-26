package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: gim */
public final class gim implements gfz {
    private static final long j = TimeUnit.SECONDS.toMillis(5);
    public final int a;
    public final float b;
    public nf c;
    public View d;
    public AnimatorSet e;
    public final float f;
    private final Handler g;
    private final gkt h;
    private final int i;
    private final Runnable k = new gip(this);

    public gim(Context context, Handler handler, gkt gkt) {
        this.g = handler;
        this.h = gkt;
        Resources resources = context.getResources();
        this.a = resources.getDisplayMetrics().heightPixels;
        this.i = resources.getDisplayMetrics().widthPixels;
        this.b = resources.getDimension(R.dimen.comment_sticker_container_bottom_margin);
        this.f = resources.getDimension(R.dimen.reel_edit_video_tap_for_more_static_sticker_margin);
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
        this.g.post(new gio(this));
    }

    public final void a(badb badb) {
        a(Math.round((((float) this.a) / 2.0f) - Math.min((float) badb.a(), (((float) badb.a()) / ((float) ((bacz) ((bacy) badb).instance).b)) * (((float) this.i) / 2.0f))));
    }

    public final void a(int i) {
        if (this.h.a()) {
            this.g.post(new gir(this, i));
            this.g.removeCallbacks(this.k);
            this.g.postDelayed(this.k, j);
        }
    }

    public final View a() {
        return this.d;
    }
}
