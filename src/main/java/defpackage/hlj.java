package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hlj */
public final class hlj extends akpl {
    public final esk a;
    public akor b;
    private final ejw c;
    private final ViewGroup d;
    private final Spinner e = ((Spinner) this.d.findViewById(R.id.spinner));
    private final hll f;
    private final TextView g;
    private final akyy h;

    public hlj(Context context, ejw ejw, akzb akzb) {
        this.c = ejw;
        this.d = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.client_sorting_section_header, null);
        this.a = esl.a(this.d, this.e, R.layout.sort_filter_spinner_contents, R.layout.sort_filter_item_header, context.getResources().getDimensionPixelOffset(R.dimen.sort_filter_top_bottom_padding));
        this.f = new hll(this);
        this.e.setAdapter(this.a);
        this.g = (TextView) this.d.findViewById(R.id.right_button);
        this.h = akzb.a(this.g);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.c.b(this);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        apwi apwi = (apwi) obj;
        this.b = akor;
        esk esk = this.a;
        aphg aphg = null;
        if ((apwi.a & 1) != 0) {
            arml = apwi.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        esk.b = ajqy.a(arml);
        this.e.setOnItemSelectedListener(null);
        esk = this.a;
        anyd<apwe> anyd = apwi.c;
        List arrayList = new ArrayList();
        for (apwe hli : anyd) {
            arrayList.add(new hli(hli));
        }
        esk.a(arrayList);
        Spinner spinner = this.e;
        int i = 0;
        while (i < apwi.c.size()) {
            if (((apwe) apwi.c.get(i)).c) {
                break;
            }
            i++;
        }
        i = 0;
        spinner.setSelection(i, false);
        this.e.setOnItemSelectedListener(this.f);
        acvx acvx = akor.a;
        if (apwi.e.size() != 0) {
            for (aphj aphj : apwi.e) {
                if ((aphj.a & 1) != 0) {
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                }
            }
        }
        if (aphg == null) {
            this.g.setVisibility(8);
        } else {
            this.h.a((int) R.dimen.text_button_icon_padding);
            this.h.b();
            this.h.a(aphg, acvx);
        }
        this.c.a(this);
    }
}
