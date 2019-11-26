package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownTextView;
import com.google.android.youtube.R;

/* renamed from: vyz */
public final class vyz {
    public final Context a;
    public final ImageView b;
    public final AdCountdownTextView c;
    public final vzo d;
    public final ColorDrawable e;
    public final int f = this.e.getColor();
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public vzn q;
    private final Resources r;
    private final int s;

    public vyz(Context context, Resources resources, ImageView imageView, AdCountdownTextView adCountdownTextView, float f) {
        this.a = context;
        this.r = resources;
        this.b = imageView;
        this.c = adCountdownTextView;
        this.e = (ColorDrawable) adCountdownTextView.getBackground();
        this.g = ra.c(context, R.color.skip_ad_button_inverted_background_color);
        this.h = adCountdownTextView.getCurrentTextColor();
        this.i = ra.c(context, R.color.skip_ad_button_inverted_foreground_color);
        this.d = new vzo(adCountdownTextView, adCountdownTextView.getText(), this.h, adCountdownTextView.getTextSize(), this.e, f);
        this.k = adCountdownTextView.getPaddingRight();
        this.j = adCountdownTextView.getPaddingLeft();
        this.l = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_width);
        this.m = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_height);
        this.n = adCountdownTextView.a;
        this.o = 6;
        this.p = resources.getInteger(17694720);
        this.s = resources.getInteger(17694722);
    }

    public final void a(aokm aokm) {
        aohw aohw;
        vzn vzn = this.q;
        if (aokm != null) {
            aohw = aokm.e;
            if (aohw == null) {
                aohw = aohw.d;
            }
        } else {
            aohw = null;
        }
        vzn.a(aohw);
        this.d.a(aokm);
        this.d.b();
        this.q.b();
        int i = this.c.getLayoutParams().width;
        int i2 = this.b.getLayoutParams().width;
        if (i != i2) {
            i = Math.max(i, i2);
            this.c.getLayoutParams().width = i;
            this.b.getLayoutParams().width = i;
        }
    }

    public final void a(int i, int i2) {
        vzo vzo = this.d;
        vzo.a.put("TIME_REMAINING", Integer.valueOf((i2 + 999) / 1000));
        this.d.b = this.r.getString(i, new Object[]{r6});
        this.d.b();
    }

    public final void a() {
        this.c.setAlpha(1.0f);
        abr p = abe.p(this.c);
        p.a(0.0f);
        p.a((long) this.s);
        p.b(5000);
        p.a(new vzb(this));
    }

    public final void b() {
        abe.p(this.c).a();
    }
}
