package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: igj */
final class igj implements vwq {
    public ViewGroup a;
    public TextView b;
    public TextView c;
    public vwt d;
    public aybu e;
    public final /* synthetic */ igd f;
    private final float g;
    private ViewGroup h;
    private ImageView i;
    private ImageView j;

    public igj(igd igd, Context context) {
        this.f = igd;
        this.g = context.getResources().getDisplayMetrics().density;
        a();
    }

    private final void b() {
        if (this.a == null) {
            this.f.c();
            this.a = (ViewGroup) this.f.c.findViewById(R.id.survey_interstitial);
            this.j = (ImageView) this.a.findViewById(R.id.interstitial_background);
            this.h = (ViewGroup) this.a.findViewById(R.id.interstitial_dialog);
            this.b = (TextView) this.h.findViewById(R.id.interstitial_text);
            this.c = (TextView) this.h.findViewById(R.id.interstitial_start_button);
            this.i = (ImageView) this.h.findViewById(R.id.interstitial_logo);
            this.c.setOnClickListener(new igo(this));
            this.a.setOnClickListener(new igl(this));
            this.h.setOnClickListener(igm.a);
        }
    }

    public final void a(aybu aybu) {
        arml arml;
        axak axak;
        axak axak2;
        this.e = aybu;
        b();
        TextView textView = this.b;
        arml arml2 = null;
        if ((aybu.a & 2) != 0) {
            arml = aybu.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        akkq akkq = this.f.a;
        ImageView imageView = this.i;
        aygk aygk = aybu.h;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        if ((aybu.a & 32) != 0) {
            axak = aybu.i;
            if (axak == null) {
                axak = axak.a;
            }
        } else {
            axak = null;
        }
        aygn aygn = (aygn) ajzv.a(ajzv.a(axak), aygn.class);
        if (aygn != null) {
            akkq akkq2 = this.f.a;
            ImageView imageView2 = this.j;
            aygk aygk2 = aygn.b;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            akkq2.a(imageView2, aygk2);
        }
        if ((aybu.a & 4) != 0) {
            axak2 = aybu.g;
            if (axak2 == null) {
                axak2 = axak.a;
            }
        } else {
            axak2 = null;
        }
        aohe aohe = (aohe) ajzv.a(ajzv.a(axak2), aohe.class);
        if (aohe != null) {
            textView = this.c;
            if ((aohe.a & 1) != 0) {
                arml2 = aohe.d;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            textView.setText(ajqy.a(arml2));
            if (this.c.getBackground().getCurrent() instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.c.getBackground().getCurrent().mutate();
                gradientDrawable.setColor(aohe.b == 3 ? ((Integer) aohe.c).intValue() : 0);
                gradientDrawable.setCornerRadius(this.g * ((float) aohe.g));
                gradientDrawable.setStroke(Math.round(this.g * ((float) aohe.i)), aohe.h);
                this.c.setBackground(gradientDrawable);
            }
            this.c.setVisibility(0);
            return;
        }
        this.c.setVisibility(8);
    }

    public final void a(vwt vwt) {
        this.d = vwt;
    }

    public final void a() {
        this.e = null;
        a(false);
    }

    public final void a(boolean z) {
        if (!this.f.b || z) {
            b();
        }
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            viewGroup.setVisibility(!z ? 8 : 0);
        }
    }
}
