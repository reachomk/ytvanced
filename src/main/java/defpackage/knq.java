package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: knq */
final class knq extends jxw {
    public final TextView A;
    public kng B;
    public View C;
    public int D;
    private final akoj E;
    public final xsc a;
    public final aaas b;
    public final gak c;
    public final View d;
    public final View e;
    public final ImageView z;

    knq(Context context, akkq akkq, View view, aaas aaas, gal gal, akvp akvp, xsc xsc, gak gak, hmc hmc) {
        View view2 = view;
        aaas aaas2 = aaas;
        super(context, akkq, new akpn(), view, aaas, gal, akvp, hmc, null);
        this.a = xsc;
        this.b = aaas2;
        this.c = gak;
        this.E = new akoj(aaas2, view2);
        this.e = view2.findViewById(R.id.thumbnail_layout);
        this.z = (ImageView) view2.findViewById(R.id.channel_avatar);
        this.A = (TextView) view2.findViewById(R.id.context);
        this.d = view2;
        xpr.a(view2.findViewById(R.id.post_author), false);
        xpr.a(view2.findViewById(R.id.post_text), false);
    }

    public final View K_() {
        return this.h;
    }

    /* renamed from: a */
    public final void a_(akor akor, azem azem) {
        apxu apxu;
        akoj akoj = this.E;
        acvx acvx = akor.a;
        if ((azem.a & 512) != 0) {
            apxu = azem.k;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b(), this);
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.E.a();
    }

    /* Access modifiers changed, original: final */
    public final void a(aygk aygk, akkw akkw) {
        super.a(aygk, this.g.a().g().a(akkw).a());
    }
}
