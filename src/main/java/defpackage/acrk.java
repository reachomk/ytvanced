package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acrk */
public final class acrk implements akot, OnClickListener {
    private final akvq a;
    private final aaas b;
    private final akvp c;
    private final akvr d;
    private final View e;
    private final TextView f = ((TextView) this.e.findViewById(R.id.title));
    private final ImageView g = ((ImageView) this.e.findViewById(R.id.icon));
    private auvj h;

    public acrk(Context context, aaas aaas, akvp akvp, akvr akvr, akvq akvq) {
        amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.d = (akvr) amqw.a((Object) akvr);
        this.c = (akvp) amqw.a((Object) akvp);
        this.a = akvq;
        this.e = View.inflate(context, R.layout.lc_input_select_spinner_dropdown_item, null);
        View view = this.e;
        xpr.a(view, view.getBackground(), 0);
        this.e.setOnClickListener(this);
    }

    public final void a(akpb akpb) {
    }

    public final void onClick(View view) {
        akvq akvq = this.a;
        if (akvq != null) {
            akvq.a();
        }
        apxu d = abmk.d(this.h);
        if (d != null) {
            this.b.a(d, this.d.a());
            return;
        }
        d = abmk.c(this.h);
        if (d != null) {
            this.b.a(d, this.d.a());
        }
    }

    public final View K_() {
        return this.e;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        int a;
        auvj auvj = (auvj) obj;
        this.f.setText(abmk.a(auvj));
        arwf b = abmk.b(auvj);
        if (b != null) {
            akvp akvp = this.c;
            arwh a2 = arwh.a(b.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            a = akvp.a(a2);
        } else {
            a = 0;
        }
        if (a != 0) {
            this.g.setImageResource(a);
            this.g.setVisibility(0);
        } else {
            this.g.setImageResource(17170445);
            this.g.setVisibility(8);
        }
        this.h = auvj;
    }
}
