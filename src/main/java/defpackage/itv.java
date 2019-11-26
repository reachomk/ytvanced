package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: itv */
public final class itv implements akot {
    public final aaas a;
    public ards b;
    public acwb c;
    private final akvo d;
    private final akvp e;
    private final View f;
    private final ImageView g = ((ImageView) this.f.findViewById(R.id.icon));
    private final TextView h = ((TextView) this.f.findViewById(R.id.action));
    private final TextView i = ((TextView) this.f.findViewById(R.id.details));
    private final View j = this.f.findViewById(R.id.contextual_menu_anchor);

    public itv(Context context, aaas aaas, akvo akvo, akvp akvp) {
        amqw.a((Object) context);
        this.a = (aaas) amqw.a((Object) aaas);
        this.d = (akvo) amqw.a((Object) akvo);
        this.e = (akvp) amqw.a((Object) akvp);
        this.f = View.inflate(context, R.layout.multi_action_emergency_support, null);
        this.f.setOnClickListener(new itu(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.f;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        ards ards = (ards) obj;
        anxl anxl = null;
        akor.a.a(ards.g.d(), null);
        this.b = ards;
        this.c = akor;
        this.f.setVisibility(0);
        akor.a.a(ards.g.d(), null);
        if ((ards.a & 4) == 0) {
            this.g.setVisibility(8);
        } else {
            akvp akvp = this.e;
            arwf arwf = ards.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            this.g.setImageResource(akvp.a(a));
            this.g.setVisibility(0);
        }
        TextView textView = this.h;
        if ((ards.a & 1) != 0) {
            arml = ards.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.i;
        if ((ards.a & 2) != 0) {
            arml = ards.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        akvo akvo = this.d;
        View view = this.f;
        View view2 = this.j;
        auvr auvr = ards.f;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) != 0) {
            auvr auvr2 = ards.f;
            if (auvr2 == null) {
                auvr2 = auvr.c;
            }
            anxl = auvr2.b;
            if (anxl == null) {
                anxl = auvn.l;
            }
        }
        anxl anxl2 = anxl;
        akvo.a(view, view2, anxl2, ards, akor.a);
    }
}
