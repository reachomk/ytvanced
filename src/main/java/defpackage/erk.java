package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: erk */
public final class erk extends akpl {
    public final xci a;
    public final aaas b;
    public arqn c;
    private final akkq d;
    private final akvp e;
    private final LayoutInflater f;
    private final Resources g;
    private final ViewGroup h;
    private erm i;

    public erk(Context context, akkq akkq, xci xci, aaas aaas, akvp akvp) {
        amqw.a((Object) context);
        this.d = (akkq) amqw.a((Object) akkq);
        this.a = (xci) amqw.a((Object) xci);
        this.b = (aaas) amqw.a((Object) aaas);
        this.e = (akvp) amqw.a((Object) akvp);
        this.f = LayoutInflater.from(context);
        this.g = context.getResources();
        this.h = new FrameLayout(context);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.h;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        int a;
        this.c = (arqn) obj;
        int i = 0;
        if (this.i == null) {
            this.i = new erm(this, this.f.inflate(!this.g.getBoolean(R.bool.generic_promo_banner_view) ? R.layout.generic_promo_card : R.layout.generic_promo_banner, this.h, false));
        }
        erm erm = this.i;
        TextView textView = erm.b;
        arqn arqn = this.c;
        arml arml2 = null;
        if ((arqn.a & 1) != 0) {
            arml = arqn.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = erm.c;
        arqn = this.c;
        if ((arqn.a & 2) != 0) {
            arml2 = arqn.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        textView.setText(ajqy.a(arml2));
        if ((this.c.a & 64) == 0) {
            erm.d.setVisibility(8);
        } else {
            erm.d.setVisibility(0);
        }
        akkq akkq = this.d;
        ImageView imageView = erm.e;
        aygk aygk = this.c.g;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        aphj aphj = this.c.d;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        if ((aphg.a & 128) != 0) {
            Button button = erm.g;
            aphj aphj2 = this.c.d;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            aphg aphg2 = aphj2.b;
            if (aphg2 == null) {
                aphg2 = aphg.s;
            }
            arml arml3 = aphg2.g;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            button.setText(ajqy.a(arml3));
        } else {
            erm.g.setVisibility(8);
        }
        arqn arqn2 = this.c;
        if ((arqn2.a & 16) != 0) {
            akvp akvp = this.e;
            arwf arwf = arqn2.f;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            a = akvp.a(a2);
        } else {
            a = 0;
        }
        if (a != 0) {
            this.d.a(erm.f);
            erm.f.setBackgroundResource(a);
        } else {
            aygk aygk2 = this.c.e;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            this.d.a(erm.f, aygk2);
            imageView = erm.f;
            if (!aklb.a(aygk2)) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        this.h.removeAllViews();
        this.h.addView(erm.a);
    }
}
