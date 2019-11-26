package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.GridLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ewl */
public final class ewl implements akot {
    private final akkq a;
    private final akou b;
    private final akoj c;
    private final Resources d;
    private final View e;
    private final ImageView f = ((ImageView) this.e.findViewById(R.id.thumbnail));
    private final TextView g = ((TextView) this.e.findViewById(R.id.textual_call_to_action));
    private final TextView h = ((TextView) this.e.findViewById(R.id.title));
    private final TextView i = ((TextView) this.e.findViewById(R.id.subtitle));
    private final TextView j = ((TextView) this.e.findViewById(R.id.top_metadata));
    private final akyy k;
    private final TextView l = ((TextView) this.e.findViewById(R.id.offer_button_cta));

    public ewl(Context context, akkq akkq, akop akop, akzb akzb, flu flu) {
        this.c = akop.a(flu);
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (akou) amqw.a((Object) flu);
        this.d = context.getResources();
        this.e = View.inflate(context, R.layout.compact_movie_upsell, null);
        this.k = akzb.a(this.l);
        flu.a(this.e);
    }

    public final void a(akpb akpb) {
        this.c.a();
    }

    public final View K_() {
        return this.b.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aphg aphg;
        aqfi aqfi = (aqfi) obj;
        LayoutParams layoutParams = (LayoutParams) this.f.getLayoutParams();
        int i = aqfi.a;
        akkq akkq;
        ImageView imageView;
        aygk aygk;
        if ((i & 8) != 0) {
            layoutParams.width = this.d.getDimensionPixelSize(R.dimen.compact_movie_upsell_thumbnail_width);
            akkq = this.a;
            imageView = this.f;
            aygk = aqfi.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
        } else if ((i & 4) != 0) {
            layoutParams.width = this.d.getDimensionPixelSize(R.dimen.compact_show_upsell_thumbnail_width);
            akkq = this.a;
            imageView = this.f;
            aygk = aqfi.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
        }
        apxu apxu = null;
        xpr.a(this.e, null, 0);
        TextView textView = this.g;
        if ((aqfi.a & 512) != 0) {
            arml = aqfi.j;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.h;
        if ((aqfi.a & 1) != 0) {
            arml = aqfi.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.i;
        if ((aqfi.a & 2) != 0) {
            arml = aqfi.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.j;
        if ((aqfi.a & 128) != 0) {
            arml = aqfi.h;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        akyy akyy = this.k;
        aphj aphj = aqfi.k;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) == 0) {
            aphg = null;
        } else {
            aphj = aqfi.k;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        akyy.a(aphg, akor.a);
        if ((aqfi.a & 8) != 0) {
            xpv.a(this.l, ra.a(this.l.getContext(), (int) R.drawable.button_color_transparent_background));
        }
        akor.a.a(aqfi.l.d(), null);
        akoj akoj = this.c;
        acvx acvx = akor.a;
        if ((aqfi.a & 32) != 0) {
            apxu = aqfi.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        akoj.a(acvx, apxu, akor.b());
        this.b.a(akor);
    }
}
