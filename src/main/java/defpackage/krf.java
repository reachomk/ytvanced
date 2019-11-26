package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;

/* renamed from: krf */
public class krf extends krc {
    public final ImageView e = ((ImageView) this.f.findViewById(R.id.thumbnail));
    private final View f;
    private final ImageView g = ((ImageView) this.f.findViewById(R.id.icon));
    private final View h;
    private final View i;
    private final ImageView j;
    private final TextView k;
    private Integer l;
    private MarginLayoutParams m;
    private Float n;

    protected krf(akkq akkq, akvp akvp, akvo akvo, View view, View view2, boolean z) {
        super(akkq, akvp, akvo, view, view2, z);
        this.f = view2.findViewById(R.id.thumbnail_wrapper);
        this.h = view2.findViewById(R.id.overlay_badge_layout);
        this.i = this.h.findViewById(R.id.native_overlay_badge);
        this.j = (ImageView) this.i.findViewById(R.id.overlay_badge_icon);
        this.k = (TextView) this.i.findViewById(R.id.overlay_badge_text);
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajyq ajyq, aviq aviq, Integer num) {
        super.a(acvx, obj, ajyq, aviq, num);
        a(ajyq.a, ajyq.c, (avjb) ajzv.a(ajyq.b, avjb.class), ajyq.r);
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajyp ajyp, aviq aviq, Integer num) {
        amqw.a((Object) ajyp);
        Spanned a = ajqy.a(ajyp.e);
        Spanned a2 = ajqy.a(ajyp.i);
        awqa awqa = ajyp.s;
        boolean z = ajzv.b(ajyp.m, aphg.class) && aviq != null;
        a(acvx, obj, a, a2, awqa, z, (auvn) ajzv.a(ajyp.m, auvn.class));
        awqz awqz = null;
        aohg aohg = ajzv.b(ajyp.r, aohe.class) ? (aohg) ((anxo) ((aohe) ajzv.a(ajyp.r, aohe.class)).toBuilder()) : null;
        if (!(aohg == null || num == null)) {
            aohg.a(num.intValue());
            ajzv.a(ajyp.r, AdCtaButtonRendererOuterClass.adCtaButtonRenderer, (anxl) aohg.build());
        }
        Spanned a3 = ajqy.a(ajyp.j);
        aohe aohe = aohg != null ? (aohe) ((anxl) aohg.build()) : null;
        awqw awqw = ajyp.t;
        if (awqw != null) {
            awqz = (awqz) ((anxo) awqw.toBuilder());
        }
        a(a3, aohe, awqz, ajyp.q);
        a(ajyp.a, ajyp.d, (avjb) ajzv.a(ajyp.c, avjb.class), ajyp.u);
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajyx ajyx, aviq aviq) {
        amqw.a((Object) ajyx);
        Spanned a = ajqy.a(ajyx.d);
        Spanned a2 = ajqy.a(ajyx.e);
        awqa awqa = ajyx.p;
        boolean z = ajzv.b(ajyx.k, aphg.class) && aviq != null;
        a(acvx, obj, a, a2, awqa, z, (auvn) ajzv.a(ajyx.k, auvn.class));
        aohe aohe = (aohe) ajzv.a(ajyx.h, aohe.class);
        awqw awqw = ajyx.q;
        a(null, aohe, awqw != null ? (awqz) ((anxo) awqw.toBuilder()) : null, ajyx.o);
        a(ajyx.a, ajyx.c, (avjb) ajzv.a(ajyx.b, avjb.class), ajyx.s);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(acvx acvx, Object obj, ajyq ajyq, awpi awpi, boolean z) {
        super.a(acvx, obj, ajyq, awpi, z);
        a(ajyq.a, null, (avjb) ajzv.a(ajyq.b, avjb.class), false);
    }

    /* Access modifiers changed, original: protected */
    public void a(acvx acvx, Object obj, ajym ajym) {
        super.a(acvx, obj, ajym);
        a(ajym.b, null, (avjb) ajzv.a(ajym.c, avjb.class), false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(acvx acvx, Object obj, ajym ajym, awpq awpq, boolean z) {
        super.a(acvx, obj, ajym, awpq, z);
        a(ajym.b, null, (avjb) ajzv.a(ajym.c, avjb.class), false);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        View view = this.f;
        if (view instanceof FixedAspectRatioFrameLayout) {
            if (this.n == null) {
                FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) view;
                this.n = Float.valueOf(fixedAspectRatioFrameLayout.a);
                fixedAspectRatioFrameLayout.a = 1.0f;
            }
        } else if (this.l == null) {
            LayoutParams layoutParams = view.getLayoutParams();
            this.l = Integer.valueOf(layoutParams.height);
            layoutParams.height = layoutParams.width + 18;
            this.f.setLayoutParams(layoutParams);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        View view = this.f;
        if (view instanceof FixedAspectRatioFrameLayout) {
            Float f = this.n;
            if (f != null) {
                ((FixedAspectRatioFrameLayout) view).a = f.floatValue();
                this.n = null;
            }
        } else if (this.l != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.l.intValue();
            this.f.setLayoutParams(layoutParams);
            this.l = null;
        }
    }

    private final void a(aygk aygk, arwf arwf, avjb avjb, boolean z) {
        ImageView imageView;
        if (aygk == null) {
            imageView = this.e;
            imageView.setImageDrawable(ra.a(imageView.getContext(), !z ? R.drawable.native_ad_fallback_thumbnail : R.drawable.native_ad_fallback_square_thumbnail));
        } else {
            this.a.a(this.e, aygk);
        }
        if (z) {
            a();
        } else {
            b();
        }
        if (arwf != null) {
            ImageView imageView2 = this.g;
            akvp akvp = this.b;
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            imageView2.setImageResource(akvp.a(a));
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
        xpr.a(this.h, avjb != null);
        if (avjb != null) {
            Drawable background = this.i.getBackground();
            if (background instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) background.getCurrent().mutate();
                int i = avjb.d;
                if (i != 0) {
                    gradientDrawable.setColor(i);
                } else {
                    gradientDrawable.setColor(this.i.getResources().getColor(R.color.native_thumbnail_badge_background_color));
                }
            }
            if ((avjb.a & 1) != 0) {
                imageView = this.j;
                akvp akvp2 = this.b;
                arwf arwf2 = avjb.b;
                if (arwf2 == null) {
                    arwf2 = arwf.c;
                }
                arwh a2 = arwh.a(arwf2.b);
                if (a2 == null) {
                    a2 = arwh.UNKNOWN;
                }
                imageView.setImageResource(akvp2.a(a2));
                this.j.setVisibility(0);
            } else {
                this.j.setVisibility(8);
            }
        }
        TextView textView = this.k;
        CharSequence charSequence = null;
        if (avjb != null) {
            arml arml;
            if ((avjb.a & 2) != 0) {
                arml = avjb.c;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            charSequence = ajqy.a(arml);
        }
        xpr.a(textView, charSequence);
    }

    protected static void a(View view, int i) {
        if (view != null && (view.getLayoutParams() instanceof GridLayout.LayoutParams)) {
            GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) view.getLayoutParams();
            layoutParams.rowSpec = GridLayout.spec(i);
            view.setLayoutParams(layoutParams);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Integer num) {
        TextView textView = this.c;
        if (textView != null && (textView.getLayoutParams() instanceof GridLayout.LayoutParams)) {
            GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) this.c.getLayoutParams();
            if (this.m == null) {
                this.m = new MarginLayoutParams(layoutParams);
            }
            layoutParams.bottomMargin = num.intValue();
            this.c.setLayoutParams(layoutParams);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        TextView textView = this.c;
        if (textView != null && this.m != null && (textView.getLayoutParams() instanceof GridLayout.LayoutParams)) {
            GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams.leftMargin = this.m.leftMargin;
            layoutParams.topMargin = this.m.topMargin;
            layoutParams.rightMargin = this.m.rightMargin;
            layoutParams.bottomMargin = this.m.bottomMargin;
            this.c.setLayoutParams(layoutParams);
            this.m = null;
        }
    }
}
