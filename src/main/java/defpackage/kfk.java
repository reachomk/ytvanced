package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kfk */
public final class kfk implements akot {
    public akor a;
    private final akpk b;
    private final ViewGroup c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title_text));
    private final akod e;
    private final kfp f;
    private final zzl g;
    private final Resources h;
    private int i;

    public kfk(Context context, akpe akpe, fmx fmx, esh esh, epv epv, zzl zzl) {
        this.h = context.getResources();
        this.g = zzl;
        this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.mysubs_content_filter, null, false);
        this.f = new kfp(this.c, esh.a(null, R.layout.mysubs_sort_filter_item_header, R.layout.mysubs_sort_filter_spinner_contents), fmx);
        RecyclerView recyclerView = (RecyclerView) this.c.findViewById(R.id.button_container);
        recyclerView.a(new ans(0, false));
        akph akph = new akph();
        akph.a(aphg.class, new kfm(epv, new kfn(this)));
        apa a = akpe.a(akph);
        this.b = new akpk();
        a.a(this.b);
        this.e = new akod();
        a.a(this.e);
        recyclerView.a(a);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        avit avit = (avit) obj;
        this.a = akor;
        this.e.a = akor.a;
        this.b.clear();
        for (aphj aphj : avit.d) {
            if (!(aphj == null || (1 & aphj.a) == 0)) {
                akpk akpk = this.b;
                Object obj2 = aphj.b;
                if (obj2 == null) {
                    obj2 = aphg.s;
                }
                akpk.add(obj2);
            }
        }
        ViewGroup viewGroup;
        if (foh.o(this.g) && this.h.getConfiguration().orientation == 1) {
            this.i = xss.a(this.h.getDisplayMetrics(), 16);
            viewGroup = this.c;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, this.c.getPaddingRight(), this.i);
        } else {
            viewGroup = this.c;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, this.c.getPaddingRight(), 0);
        }
        axqn axqn = null;
        if (TextUtils.isEmpty(ajqy.a(avit.b == 1 ? (arml) avit.c : arml.f))) {
            kfp kfp = this.f;
            if (((avit.b == 6 ? (aviv) avit.c : aviv.c).a & 1) != 0) {
                aviv aviv;
                if (avit.b == 6) {
                    aviv = (aviv) avit.c;
                } else {
                    aviv = aviv.c;
                }
                axqn = aviv.b;
                if (axqn == null) {
                    axqn = axqn.f;
                }
            }
            avir avir = avit.e;
            if (avir == null) {
                avir = avir.c;
            }
            kfp.a(akor, axqn, avir);
            this.d.setVisibility(8);
            return;
        }
        this.d.setText(ajqy.a(avit.b == 1 ? (arml) avit.c : null));
        this.d.setVisibility(0);
        this.f.a(this.a, null, null);
    }
}
