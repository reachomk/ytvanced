package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.Iterator;

/* renamed from: ewo */
public final class ewo extends akpl {
    private final Context a;
    private final akou b;
    private final fna c;
    private final xci d;
    private final View e;
    private final LinearLayout f = ((LinearLayout) this.e.findViewById(R.id.offer_rows));

    public ewo(Context context, flu flu, fna fna, xci xci) {
        this.a = context;
        this.b = flu;
        this.c = fna;
        this.d = xci;
        this.e = View.inflate(context, R.layout.compact_multi_offer_view, null);
        flu.a(this.e);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b.a();
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        int i;
        anyd anyd = ((aqfk) obj).b;
        this.f.removeAllViews();
        Iterator it = anyd.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            aqfo aqfo = (aqfo) it.next();
            if (aqfo.a.size() > 0) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.a).inflate(R.layout.compact_multi_offer_payment_row, this.f, false);
                for (aqfm aqfm : aqfo.a) {
                    aphg aphg;
                    aphj aphj = aqfm.b;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    if ((aphj.a & 1) == 0) {
                        aphg = null;
                    } else {
                        aphj aphj2 = aqfm.b;
                        if (aphj2 == null) {
                            aphj2 = aphj.d;
                        }
                        aphg = aphj2.b;
                        if (aphg == null) {
                            aphg = aphg.s;
                        }
                    }
                    acvx acvx = akor.a;
                    YouTubeTextView youTubeTextView = (YouTubeTextView) LayoutInflater.from(this.a).inflate(R.layout.compact_multi_offer_payment_cell, linearLayout, false);
                    fnb a = this.c.a(youTubeTextView);
                    a.c = new ewn(this.d, acvx);
                    a.a(aphg, acvx);
                    linearLayout.addView(youTubeTextView);
                }
                this.f.addView(linearLayout);
            }
        }
        LinearLayout linearLayout2 = this.f;
        if (linearLayout2.getChildCount() <= 0) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        this.b.a(akor);
    }
}
