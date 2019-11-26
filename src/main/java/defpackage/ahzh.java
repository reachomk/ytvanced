package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ahzh */
public final class ahzh extends aiua implements aiaa, OnClickListener, AnimationListener {
    public ahzz a;
    private boolean b;
    private boolean c;
    private final int d;
    private boolean e;
    private boolean f;
    private final int g;
    private final int h;
    private final int i;
    private final ImageView j = ((ImageView) findViewById(R.id.branding_watermark));
    private final View k = findViewById(R.id.promo_collapsed);
    private final ImageView l = ((ImageView) this.k.findViewById(R.id.promo_thumbnail_collapsed));
    private final View m = this.k.findViewById(R.id.promo_expand_arrow);
    private final View n;
    private final ImageView o;
    private final TextView p;
    private final TextView q;
    private final ImageButton r;
    private final Animation s;
    private final Animation t;
    private final Animation u;
    private final Animation v;
    private final Animation w;
    private final Animation x;

    public ahzh(Context context, int i) {
        super(context);
        Resources resources = context.getResources();
        this.s = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.t = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        this.u = AnimationUtils.loadAnimation(context, R.anim.left_translate_in);
        this.v = AnimationUtils.loadAnimation(context, R.anim.left_translate_out);
        this.w = AnimationUtils.loadAnimation(context, R.anim.left_translate_in);
        this.x = AnimationUtils.loadAnimation(context, R.anim.left_translate_out);
        long integer = (long) resources.getInteger(R.integer.fade_duration_fast);
        this.s.setDuration(integer);
        this.t.setDuration(integer);
        this.t.setAnimationListener(this);
        this.v.setAnimationListener(this);
        this.x.setAnimationListener(this);
        this.u.setAnimationListener(this);
        LayoutInflater.from(context).inflate(R.layout.invideo_programming_overlay, this);
        this.k.setOnClickListener(this);
        this.n = findViewById(R.id.promo_website_expanded);
        this.o = (ImageView) this.n.findViewById(R.id.promo_website_thumbnail_expanded);
        this.p = (TextView) this.n.findViewById(R.id.promo_website_title);
        this.q = (TextView) this.n.findViewById(R.id.promo_website_description);
        this.r = (ImageButton) this.n.findViewById(R.id.promo_website_dismiss);
        this.n.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.d = (resources.getDimensionPixelSize(R.dimen.annotation_banner_ads_cta_bottom_margin) + resources.getDimensionPixelSize(R.dimen.invideo_ad_progress_bar_height)) + i;
        this.i = resources.getDimensionPixelOffset(R.dimen.annotation_banner_ads_right_margin);
        this.g = xss.a(resources.getDisplayMetrics(), 16);
        this.h = xss.a(resources.getDisplayMetrics(), 32);
        ahzk ahzk = new ahzk(this);
        View view = this.n;
        view.setOnTouchListener(new amjw(view, ahzk));
        view = this.k;
        view.setOnTouchListener(new amjw(view, ahzk));
        e();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void e() {
        this.c = false;
        setVisibility(8);
        this.j.setVisibility(8);
        this.j.setImageBitmap(null);
        this.k.setVisibility(8);
        this.m.setVisibility(0);
        this.l.setImageBitmap(null);
        this.l.setVisibility(8);
        this.n.setVisibility(8);
        this.p.setText(null);
        this.q.setText(null);
        this.o.setImageBitmap(null);
        this.o.setVisibility(8);
        c();
    }

    public final void a(ahzz ahzz) {
        this.a = ahzz;
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void onClick(View view) {
        ahzz ahzz = this.a;
        if (ahzz != null) {
            if (view == this.n) {
                ahzz.a();
            } else if (view == this.k) {
                ahzz.b();
            } else if (view == this.r) {
                ahzz.c();
            }
        }
    }

    public final void a(Bitmap bitmap, int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        this.j.getLayoutParams().width = (int) applyDimension;
        this.j.getLayoutParams().height = (int) applyDimension2;
        this.j.setImageBitmap(bitmap);
    }

    public final void f() {
        this.j.setVisibility(0);
        d();
    }

    public final void g() {
        this.j.setVisibility(8);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        this.p.setText(charSequence);
        this.q.setText(charSequence2);
    }

    public final void a(Bitmap bitmap) {
        this.o.setImageBitmap(bitmap);
        ImageView imageView = this.o;
        int i = bitmap == null ? 8 : 0;
        imageView.setVisibility(i);
        this.l.setImageBitmap(bitmap);
        this.l.setVisibility(i);
        this.l.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.annotation_banner_icon_height);
    }

    public final void a(boolean z, boolean z2) {
        if (z) {
            this.m.setVisibility(8);
            this.n.setVisibility(0);
            if (z2) {
                this.n.startAnimation(this.u);
            }
        } else if (this.n.getVisibility() == 0) {
            this.k.setVisibility(0);
            if (z2 && getVisibility() == 0) {
                this.m.setVisibility(8);
                this.n.startAnimation(this.v);
            } else {
                this.n.setVisibility(8);
                this.m.setVisibility(0);
            }
        } else {
            this.m.setVisibility(0);
            this.k.setVisibility(0);
            if (z2) {
                this.k.startAnimation(this.w);
            }
        }
        d();
    }

    public final void a(boolean z) {
        if (this.n.getVisibility() == 0) {
            if (z) {
                this.n.startAnimation(this.v);
            } else {
                this.n.setVisibility(8);
            }
        }
        if (this.k.getVisibility() != 0) {
            return;
        }
        if (z) {
            this.k.startAnimation(this.x);
        } else {
            this.k.setVisibility(8);
        }
    }

    public final void b(boolean z) {
        this.c = z;
        c();
    }

    public final void b(boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
        c();
    }

    private final void c() {
        boolean z = this.c;
        int i = 0;
        int i2 = z ? this.d : this.e ? !this.f ? this.g : this.h : 0;
        int i3 = z ? this.i : 0;
        ahzh.a(this.k, i2, i3);
        ahzh.a(this.n, i2, i3);
        if (this.c && !getResources().getBoolean(R.bool.annonations_banner_ads_show_thumbnail)) {
            i = 8;
        }
        this.o.setVisibility(i);
        this.l.setVisibility(i);
    }

    private static void a(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = i;
        layoutParams.setMarginEnd(i2);
        view.setLayoutParams(layoutParams);
    }

    private final boolean d() {
        int i = 0;
        boolean z = (this.j.getVisibility() == 0 || this.n.getVisibility() == 0 || this.k.getVisibility() == 0) && !this.b;
        if (!z) {
            i = 8;
        }
        setVisibility(i);
        if (!z) {
            a((ViewGroup) this);
        }
        return z;
    }

    public final void c(boolean z) {
        if (z == this.b) {
            this.b = z ^ 1;
            c();
            if (this.b && getVisibility() == 0) {
                startAnimation(this.t);
            } else if (!this.b && d()) {
                startAnimation(this.s);
            }
        }
    }

    public final void onAnimationEnd(Animation animation) {
        if (animation == this.t) {
            setVisibility(8);
            a((ViewGroup) this);
        }
        ahzh.a(animation, this.x, this.k);
        ahzh.a(animation, this.v, this.n);
        ahzh.a(animation, this.u, this.k);
        if (animation == this.v) {
            this.m.setVisibility(0);
        }
    }

    private final void a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.clearAnimation();
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
        }
    }

    private static void a(Animation animation, Animation animation2, View view) {
        if (animation == animation2) {
            view.setVisibility(8);
        }
    }
}
