package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ffa */
public final class ffa implements ffb {
    public TextView a;
    private final Activity b;
    private final akvp c;
    private Animation d;
    private Animation e;
    private fez f;
    private FrameLayout g;
    private FrameLayout h;
    private boolean i = false;

    public ffa(Activity activity, akvp akvp) {
        this.b = activity;
        this.c = akvp;
    }

    public final void a(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            FrameLayout frameLayout3 = this.g;
            if (frameLayout3 != null) {
                frameLayout2.removeView(frameLayout3);
            }
        }
        this.f = null;
        this.h = null;
        this.h = frameLayout;
        if (this.g != null) {
            d();
        }
    }

    private final void d() {
        this.h.addView(this.g);
        this.g = (FrameLayout) this.h.findViewById(R.id.content_pill_layout);
        this.a = (TextView) this.g.findViewById(R.id.content_pill_text);
    }

    public final void a(fez fez) {
        if (this.h != null) {
            if (this.g == null) {
                this.g = (FrameLayout) LayoutInflater.from(this.b).inflate(R.layout.content_pill, this.h, false);
                d();
            }
            if (!this.i) {
                this.e = AnimationUtils.loadAnimation(this.b, R.anim.pill_fade_in_translate_to_top);
                this.d = AnimationUtils.loadAnimation(this.b, R.anim.pill_fade_out);
                this.d.setAnimationListener(new ffd(this));
                this.i = true;
            }
            if (fez != this.f) {
                this.f = fez;
                this.a.setText(fez.a());
                Drawable drawable = this.b.getResources().getDrawable(this.c.a(fez.b()));
                if (drawable != null) {
                    adl.a(this.a, drawable, null, null);
                }
            }
            this.g.bringToFront();
            this.a.setVisibility(0);
            this.a.startAnimation(this.e);
            return;
        }
        throw new IllegalStateException("Controller must be initialized for a feed before the content pill can be shown.");
    }

    public final void a(boolean z) {
        TextView textView = this.a;
        if (!(textView == null || this.h == null)) {
            if (z) {
                textView.startAnimation(this.d);
                return;
            }
            textView.setVisibility(8);
        }
    }

    public final amqp b() {
        if (a().a()) {
            return amqp.c(this.g);
        }
        return ampo.a;
    }

    public final amqp c() {
        if (a().a()) {
            return amqp.c(this.a);
        }
        return ampo.a;
    }

    public final amqp a() {
        return amqp.c(this.f);
    }
}
