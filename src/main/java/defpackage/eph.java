package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: eph */
public final class eph extends epi {
    private final ajqw d;
    private final akvp e;
    private final float f;
    private final TextView g;
    private final ImageView h;

    public eph(akkq akkq, Context context, akvp akvp, epk epk, View view) {
        super(view, akkq);
        amqw.a((Object) context);
        this.e = (akvp) amqw.a((Object) akvp);
        ajqv a = ajqw.a();
        a.a = context;
        this.d = a.a();
        this.f = context.getResources().getDisplayMetrics().density;
        view.setVisibility(8);
        this.g = (TextView) view.findViewById(R.id.ad_cta_button_text);
        this.h = (ImageView) view.findViewById(R.id.ad_cta_button_icon);
        if (epk != null) {
            a(epk);
        }
    }

    public final void a(epk epk) {
        this.a.setOnClickListener(new epg(this, epk));
    }

    public final void a(aohe aohe, acvx acvx) {
        arml arml = null;
        if (acvx != null) {
            acvx.a(aohe.l.d(), null);
        }
        this.c = aohe;
        int i = 0;
        this.a.setVisibility(0);
        TextView textView = this.g;
        if ((aohe.a & 1) != 0) {
            arml = aohe.d;
            if (arml == null) {
                arml = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml, this.d));
        if ((aohe.a & 2) == 0) {
            arwf arwf = aohe.f;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            if (a != arwh.UNKNOWN) {
                this.h.setVisibility(0);
                ImageView imageView = this.h;
                akvp akvp = this.e;
                arwf arwf2 = aohe.f;
                if (arwf2 == null) {
                    arwf2 = arwf.c;
                }
                arwh a2 = arwh.a(arwf2.b);
                if (a2 == null) {
                    a2 = arwh.UNKNOWN;
                }
                imageView.setImageResource(akvp.a(a2));
            } else {
                this.h.setVisibility(8);
            }
        } else {
            this.h.setVisibility(0);
            akkq akkq = this.b;
            ImageView imageView2 = this.h;
            aygk aygk = aohe.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView2, aygk, epi.a(0));
        }
        if (this.a.getBackground().getCurrent() instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.a.getBackground().getCurrent().mutate();
            if (aohe.b == 3) {
                i = ((Integer) aohe.c).intValue();
            }
            gradientDrawable.setColor(i);
            gradientDrawable.setCornerRadius(this.f * ((float) aohe.g));
            gradientDrawable.setStroke(Math.round(this.f * ((float) aohe.i)), aohe.h);
            this.a.setBackground(gradientDrawable);
        }
    }
}
