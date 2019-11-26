package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kbq */
public final class kbq implements akot, kby {
    public final xci a;
    public asnl b;
    public kbs c;
    private final Context d;
    private final View e = this.h.inflate(R.layout.dismissal_reason_list_layout, null);
    private final flu f;
    private final TextView g = ((TextView) this.e.findViewById(R.id.title));
    private final LayoutInflater h = LayoutInflater.from(this.d);
    private final ImageView i = ((ImageView) this.e.findViewById(R.id.close_button));
    private final kbz j;
    private final LinearLayout k = ((LinearLayout) this.e.findViewById(R.id.reasons));
    private final kbr l;

    public kbq(Context context, flu flu, xci xci, kbz kbz, kbr kbr) {
        this.d = context;
        this.f = (flu) amqw.a((Object) flu);
        this.a = (xci) amqw.a((Object) xci);
        this.j = kbz;
        this.l = kbr;
        this.i.setOnClickListener(new kbt(this));
        akvu akvu = new akvu(this.e, this.i);
        this.f.a(this.e);
    }

    public final View K_() {
        return this.f.b;
    }

    /* renamed from: a */
    public final void a_(akor akor, asnl asnl) {
        arml arml = null;
        akor.a.a(asnl.b.d(), null);
        akor.a("parent_renderer", (Object) asnl);
        this.b = asnl;
        LayoutParams layoutParams = this.k.getLayoutParams();
        int i = 0;
        int dimensionPixelSize = akor.a("dismissal_follow_up_dialog", false) ? this.d.getResources().getDimensionPixelSize(R.dimen.dismissal_dialog_min_width) : -1;
        if (dimensionPixelSize != layoutParams.width) {
            layoutParams.width = dimensionPixelSize;
            this.k.setLayoutParams(layoutParams);
        }
        asnn[] asnnArr = (asnn[]) asnl.d.toArray(new asnn[0]);
        akor.a("selection_listener", (Object) this);
        this.k.removeAllViews();
        for (Object obj : asnnArr) {
            kbz kbz = this.j;
            this.k.addView(kbz.a(kbz.a(akor), obj));
        }
        TextView textView = this.g;
        if ((asnl.a & 4) != 0) {
            arml = asnl.c;
            if (arml == null) {
                arml = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml));
        ImageView imageView = this.i;
        if (xss.b(this.d)) {
            i = 8;
        }
        imageView.setVisibility(i);
        int a = aqxa.a(asnl.i);
        String str = "setBackgroundColor";
        if (a == 0 || a != 2) {
            akor.a(str, Integer.valueOf(xwe.a(this.d, R.attr.ytGeneralBackgroundA)));
            this.g.setTextColor(xwe.a(this.d, R.attr.ytTextPrimary));
        } else {
            akor.a(str, Integer.valueOf(xwe.a(this.d, R.attr.ytBorderedButtonChipBackground)));
            this.g.setTextColor(xwe.a(this.d, R.attr.ytTextSecondary));
        }
        this.f.a(akor);
    }

    public final void a(akpb akpb) {
        this.j.a(this.k);
    }

    public final void b() {
        this.a.d(new akwd(this.b));
        avls avls = this.l.a;
        if (avls != null) {
            this.a.d(new akwd(avls));
        }
        kbs kbs = this.c;
        if (kbs != null) {
            kbs.W();
        }
    }
}
