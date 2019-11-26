package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ese */
public final class ese implements akot {
    public final aaas a;
    public final esk b;
    public final ViewGroup c;
    public akor d;
    private final ejw e;
    private final akvp f;
    private final Spinner g;
    private final esf h;

    public ese(Context context, aaas aaas, ejw ejw, akvp akvp, esl esl, ViewGroup viewGroup) {
        this(context, aaas, ejw, akvp, viewGroup, (int) R.layout.sort_filter_item_header, (int) R.layout.sort_filter_spinner_contents);
    }

    public ese(Context context, aaas aaas, ejw ejw, akvp akvp, esl esl, ViewGroup viewGroup, byte b) {
        this(context, aaas, ejw, akvp, viewGroup, (int) R.layout.sort_filter_item_header, (int) R.layout.sort_filter_spinner_contents);
    }

    public ese(Context context, aaas aaas, ejw ejw, akvp akvp, ViewGroup viewGroup, int i, int i2) {
        this.a = aaas;
        this.e = ejw;
        this.f = akvp;
        this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sort_filter, viewGroup, false);
        this.g = (Spinner) this.c.findViewById(R.id.spinner);
        this.b = esl.a(this.c, this.g, i2, i, context.getResources().getDimensionPixelOffset(R.dimen.sort_filter_top_bottom_padding));
        esk esk = this.b;
        esk.a.add(new esd(this));
        this.g.setAdapter(this.b);
        this.h = new esf(this);
    }

    public final View K_() {
        return this.c;
    }

    /* renamed from: a */
    public final void a_(akor akor, axqn axqn) {
        this.d = akor;
        this.b.b = axqn.c;
        this.g.setOnItemSelectedListener(null);
        esk esk = this.b;
        anyd<axql> anyd = axqn.b;
        List arrayList = new ArrayList();
        for (axql esi : anyd) {
            arrayList.add(new esi(esi));
        }
        esk.a(arrayList);
        boolean z = false;
        int i = 0;
        while (i < axqn.b.size()) {
            if (((axql) axqn.b.get(i)).f) {
                break;
            }
            i++;
        }
        i = 0;
        this.h.a = i;
        this.g.setSelection(i, false);
        this.g.setOnItemSelectedListener(this.h);
        this.g.setOnTouchListener(new esg(this, axqn));
        if (!esb.a(akor)) {
            this.e.a(this);
        }
        if ((axqn.a & 2) != 0) {
            akvp akvp = this.f;
            arwf arwf = axqn.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            i = akvp.a(a);
        } else {
            i = 0;
        }
        View findViewById = this.g.findViewById(R.id.icon);
        if (findViewById instanceof ImageView) {
            if (i != 0) {
                ((ImageView) findViewById).setImageResource(i);
            }
            if (i != 0) {
                z = true;
            }
            xpr.a(findViewById, z);
        }
        this.b.c = i;
        hkq.a(akor, axqn);
    }

    public final void a(akpb akpb) {
        akor akor = this.d;
        if (akor != null && !esb.a(akor)) {
            this.e.b(this);
        }
    }
}
