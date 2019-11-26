package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: wnj */
public final class wnj implements akot, wqt, xsu {
    private static final String d = System.getProperty("line.separator");
    public final aaas a;
    public final wnk b;
    public final LoadingFrameLayout c;
    private final wnw e;
    private final wqq f;
    private final View g;
    private final won h;
    private final won i;
    private final View j = this.g.findViewById(R.id.close_button);
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;

    public wnj(Context context, ViewGroup viewGroup, aaas aaas, wqq wqq, wop wop, wny wny, wnk wnk) {
        this.a = new wnx(aaas, new woa(new wnm(this)));
        this.f = wqq;
        this.b = (wnk) amqw.a((Object) wnk);
        this.g = LayoutInflater.from(context).inflate(R.layout.ypc_membership_with_perks_offer_layout, viewGroup, false);
        this.e = wny.a(this.g);
        this.j.setOnClickListener(new wnl(this));
        this.h = wop.a(this.a, this.g.findViewById(R.id.yt_perks));
        this.i = wop.a(this.a, this.g.findViewById(R.id.custom_perks));
        this.m = (TextView) this.g.findViewById(R.id.offer_alerts);
        this.k = (TextView) this.g.findViewById(R.id.offer_price_text);
        this.l = (TextView) this.g.findViewById(R.id.offer_payment_clauses);
        this.c = (LoadingFrameLayout) this.g.findViewById(R.id.purchase_button_container);
        this.c.b();
        this.n = (TextView) this.g.findViewById(R.id.purchase_button);
    }

    public final void c() {
        this.f.b(this);
    }

    public final void a(akpb akpb) {
        this.f.b(this);
    }

    public final View K_() {
        return this.g;
    }

    public final void a(akcf akcf) {
        this.c.b();
    }

    public final void ac_() {
        this.c.b();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        arml arml2;
        axak axak;
        auus auus = (auus) obj;
        this.f.a((wqt) this);
        wnw wnw = this.e;
        aygk aygk = auus.k;
        if (aygk == null) {
            aygk = aygk.f;
        }
        aygk aygk2 = auus.e;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        aygk aygk3 = auus.d;
        if (aygk3 == null) {
            aygk3 = aygk.f;
        }
        arwf arwf = auus.f;
        if (arwf == null) {
            arwf = arwf.c;
        }
        wnw.a(aygk, aygk2, aygk3, arwf);
        View view = this.j;
        aphj aphj = auus.j;
        if (aphj == null) {
            aphj = aphj.d;
        }
        wnw.a(view, aphj);
        TextView textView = this.k;
        if ((auus.a & 16) != 0) {
            arml = auus.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.k;
        textView.getClass();
        textView.post(new wno(textView));
        this.l.setText(ajqy.a(d, aabb.b(auus.h, this.a)));
        List a = aabb.a(auus.c, this.a);
        boolean isEmpty = a.isEmpty() ^ 1;
        if (isEmpty) {
            this.m.setText(ajqy.a(d, a));
        }
        xpr.a(this.m, isEmpty);
        aphj aphj2 = auus.i;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        aphg aphg = aphj2.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        TextView textView2 = this.n;
        if ((aphg.a & 128) != 0) {
            arml2 = aphg.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        textView2.setText(ajqy.a(arml2));
        this.n.setOnClickListener(new wnn(this, aphg, akor));
        won won = this.h;
        if ((auus.a & 256) != 0) {
            axak = auus.l;
            if (axak == null) {
                axak = axak.a;
            }
        } else {
            axak = null;
        }
        wnw.a(akor, won, ajzv.a(axak));
        won = this.i;
        if ((auus.a & 512) != 0) {
            axak = auus.m;
            if (axak == null) {
                axak = axak.a;
            }
        } else {
            axak = null;
        }
        wnw.a(akor, won, ajzv.a(axak));
        acvx acvx = akor.a;
        acvx.a(auus.o.d(), null);
        acvx.a(aphg.r.d(), null);
    }
}
