package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: aiic */
public final class aiic extends aiua implements aiif {
    public boolean a = false;
    public boolean b = false;
    private final Handler c;
    private YouTubeTextView d;
    private boolean e = false;
    private boolean f = false;
    private float g;
    private float h;
    private float i;
    private long j;
    private final Runnable k = new aiib(this);

    public aiic(Context context) {
        super(context);
        setBackgroundColor(0);
        setVisibility(8);
        setFocusable(false);
        setFocusableInTouchMode(false);
        abe.b((View) this, 2);
        this.c = new Handler(context.getMainLooper());
    }

    public final LayoutParams b() {
        return new aiuh(-1, -1, true);
    }

    public final void a(CharSequence charSequence) {
        if (this.d == null) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.g = xss.a(displayMetrics, -24.0f);
            this.h = xss.a(displayMetrics, -48.0f);
            this.i = xss.a(displayMetrics, -16.0f);
            LayoutInflater.from(getContext()).inflate(R.layout.paid_content_overlay, this);
            this.d = (YouTubeTextView) findViewById(R.id.paid_content_text);
        }
        this.d.setText(charSequence);
    }

    public final void a(long j) {
        this.j = j;
    }

    public final void bC_() {
        if (this.d != null && this.j != 0) {
            this.f = true;
            setVisibility(0);
            this.d.clearAnimation();
            this.d.setAlpha(0.0f);
            abr p = abe.p(this.d);
            p.a(1.0f);
            p.a(new DecelerateInterpolator());
            p.a(250);
            p.b();
            Context context = getContext();
            YouTubeTextView youTubeTextView = this.d;
            xrn.a(context, youTubeTextView, youTubeTextView.getText());
            addOnLayoutChangeListener(new aiig(this));
            this.c.postDelayed(this.k, this.j);
        }
    }

    public final void c(boolean z) {
        this.a = z;
        if (this.f) {
            a(z, z ^ 1);
        }
    }

    public final void b(boolean z) {
        this.e = z;
        if (this.f) {
            a(this.a, false);
        }
    }

    public final void a(boolean z) {
        if (this.d != null && this.f) {
            this.f = false;
            this.c.removeCallbacks(this.k);
            if (z) {
                abr p = abe.p(this.d);
                p.a(0.0f);
                p.a(new DecelerateInterpolator());
                p.a(250);
                p.a(new aiie(this));
                p.b();
            } else {
                this.d.clearAnimation();
                setVisibility(8);
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        if (this.d != null) {
            float f = !this.e ? this.g : this.h;
            float height = (float) (getHeight() - this.d.getHeight());
            if (!z) {
                f = 0.0f;
            }
            height = (height + f) + this.i;
            if (z2) {
                this.b = true;
                abr p = abe.p(this.d);
                p.a(new DecelerateInterpolator());
                p.a(150);
                View view = (View) p.a.get();
                if (view != null) {
                    view.animate().y(height);
                }
                p.a(new aiid(this));
                p.b();
                return;
            }
            if (this.b) {
                abe.p(this.d).a();
                this.b = false;
            }
            this.d.setY(height);
        }
    }
}
