package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ihi */
public final class ihi extends ihj {
    private TextView n;
    private TextView o;
    private TextView p;
    private RatingBar q;

    public ihi(Context context, akkq akkq) {
        super(context, akkq);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(View view) {
        this.b = xpr.a(view, (int) R.id.app_promo_ad_cta_overlay_stub, (int) R.id.app_promo_ad_cta_overlay);
        this.g = this.b.findViewById(R.id.collapse_cta_container);
        this.d = this.b.findViewById(R.id.expanded_details_container);
        this.c = this.b.findViewById(R.id.expanded_background_container);
        this.e = (ImageView) this.b.findViewById(R.id.app_promo_thumbnail_icon);
        this.f = this.b.findViewById(R.id.expanded_details_cta);
        this.n = (TextView) this.b.findViewById(R.id.expanded_details_title);
        this.o = (TextView) this.b.findViewById(R.id.expanded_details_description);
        this.p = (TextView) this.b.findViewById(R.id.expanded_details_rating_score);
        this.q = (RatingBar) this.b.findViewById(R.id.expanded_details_rating_bar);
        ihh ihh = new ihh(this);
        this.f.setOnClickListener(ihh);
        this.c.setOnClickListener(ihh);
        this.g.setOnClickListener(ihh);
        this.e.setOnClickListener(ihh);
    }

    public final void a() {
        if (this.h != null && this.e != null) {
            arml arml;
            arml arml2;
            super.a();
            aowq aowq = ((aowm) this.h).c;
            if (aowq == null) {
                aowq = aowq.i;
            }
            int a = aohf.a(aowq.h);
            if (a == 0) {
                a = 1;
            }
            this.l = a;
            aowo aowo = ((aowm) this.h).d;
            if (aowo == null) {
                aowo = aowo.d;
            }
            a = aohf.a(aowo.c);
            if (a == 0) {
                a = 1;
            }
            this.m = a;
            this.e.setImageResource(R.drawable.app_download);
            aowm aowm = (aowm) this.h;
            if ((aowm.a & 1) != 0) {
                akkq akkq = this.a;
                ImageView imageView = this.e;
                aygk aygk = aowm.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akkq.a(imageView, aygk, akko.h().a(true).a(new ihk(this)).a());
            }
            float f = aowq.e;
            if (f > 0.0f) {
                f = Math.min(5.0f, f);
                this.q.setVisibility(0);
                this.q.setRating(f);
                xpr.a(this.p, String.format("%1.1f", new Object[]{Float.valueOf(f)}));
                this.p.setTextColor(aowq.g);
            } else {
                this.q.setVisibility(8);
                this.p.setVisibility(8);
            }
            aphj aphj = aowq.b;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            TextView textView = (TextView) this.f;
            arml arml3 = null;
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            textView = (TextView) this.f;
            aphe aphe = aphg.b == 17 ? (aphe) aphg.c : aphe.c;
            textView.setTextColor((aphe.a == 118483990 ? (apfb) aphe.b : apfb.f).c);
            Drawable background = this.f.getBackground();
            aphe aphe2 = aphg.b == 17 ? (aphe) aphg.c : aphe.c;
            background.setColorFilter((aphe2.a == 118483990 ? (apfb) aphe2.b : apfb.f).b, Mode.SRC);
            TextView textView2 = this.n;
            if ((aowq.a & 2) != 0) {
                arml2 = aowq.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            textView2.setText(ajqy.a(arml2));
            this.n.setTextColor(aowq.g);
            textView2 = this.o;
            if ((aowq.a & 4) != 0) {
                arml3 = aowq.d;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            }
            textView2.setText(ajqy.a(arml3));
            this.o.setTextColor(aowq.g);
            this.c.getBackground().setColorFilter(aowq.f, Mode.SRC);
            aowo aowo2 = ((aowm) this.h).d;
            if (aowo2 == null) {
                aowo2 = aowo.d;
            }
            aphj aphj2 = aowo2.b;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            aphg aphg2 = aphj2.b;
            if (aphg2 == null) {
                aphg2 = aphg.s;
            }
            Drawable background2 = this.g.getBackground();
            aphe aphe3 = aphg2.b == 17 ? (aphe) aphg2.c : aphe.c;
            background2.setColorFilter((aphe3.a == 118483990 ? (apfb) aphe3.b : apfb.f).b, Mode.SRC);
            if (((aowm) this.h).g && VERSION.SDK_INT >= 21) {
                this.c.setElevation(10.0f);
                this.d.setZ(10.0f);
                this.e.setZ(10.0f);
                this.g.setZ(10.0f);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }
}
