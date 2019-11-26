package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: khr */
public final class khr implements akot {
    private final akkq a;
    private final RelativeLayout b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.price));
    private final TextView e = ((TextView) this.b.findViewById(R.id.free_trial_text));
    private final View f = this.b.findViewById(R.id.contextual_menu_anchor);
    private final akvo g;
    private final ImageView h = ((ImageView) this.b.findViewById(R.id.thumbnail));
    private final akou i;
    private final akoj j;

    public khr(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo) {
        this.j = new akoj(aaas, (akou) flu);
        amqw.a((Object) context);
        this.a = (akkq) amqw.a((Object) akkq);
        this.i = (akou) amqw.a((Object) flu);
        this.g = (akvo) amqw.a((Object) akvo);
        this.b = (RelativeLayout) View.inflate(context, R.layout.purchase_item, null);
        flu.a(this.b);
    }

    public final View K_() {
        return this.i.a();
    }

    public final void a(akpb akpb) {
        this.j.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        arml arml;
        awth awth = (awth) obj;
        akoj akoj = this.j;
        acvx acvx = akor.a;
        anxl anxl = null;
        if ((awth.a & 8) != 0) {
            apxu = awth.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(awth.i.d(), null);
        TextView textView = this.c;
        if ((awth.a & 2) != 0) {
            arml = awth.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        if ((awth.a & 4) != 0) {
            arml = awth.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.e;
        if ((awth.a & 32) != 0) {
            arml = awth.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        if ((awth.a & 1) == 0) {
            this.a.a(this.h);
        } else {
            akkq akkq = this.a;
            ImageView imageView = this.h;
            aygk aygk = awth.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
        }
        this.f.setVisibility(0);
        akvo akvo = this.g;
        View a = this.i.a();
        View view = this.f;
        auvr auvr = awth.h;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) != 0) {
            auvr auvr2 = awth.h;
            if (auvr2 == null) {
                auvr2 = auvr.c;
            }
            anxl = auvr2.b;
            if (anxl == null) {
                anxl = auvn.l;
            }
        }
        anxl anxl2 = anxl;
        akvo.a(a, view, anxl2, awth, akor.a);
        this.i.a(akor);
    }
}
