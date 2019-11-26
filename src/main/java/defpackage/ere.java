package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: ere */
public final class ere implements akot, ezk {
    private aqxj a;
    private final fmx b;
    private final View c;
    private final Button d = ((Button) this.c.findViewById(R.id.donation_button));
    private final akyu e;
    private final View f;
    private final YouTubeTextView g;
    private final akyu h;
    private final erf i;
    private final eri j;
    private final ezg k;

    public ere(Context context, aaas aaas, akpi akpi, akkq akkq, fmx fmx, ezg ezg) {
        this.b = fmx;
        this.k = ezg;
        this.c = LayoutInflater.from(context).inflate(R.layout.donation_companion, null, false);
        this.i = new erf((ViewGroup) this.c.findViewById(R.id.campaign_group), true, akkq);
        View view = this.d;
        xpr.a(view, view.getBackground());
        this.e = new akyu(aaas, akpi, this.d);
        this.j = new eri(context, (ViewGroup) this.c.findViewById(R.id.progress_group));
        this.f = this.c.findViewById(R.id.divider);
        this.g = (YouTubeTextView) this.c.findViewById(R.id.expand_button);
        View view2 = this.g;
        xpr.a(view2, view2.getBackground());
        this.h = new akyu(aaas, akpi, this.g);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final void a(String str, aqxj aqxj) {
        aqxj aqxj2 = this.a;
        if (aqxj2 != null && aqxj2.B.equals(str)) {
            this.j.a(aqxj);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aphj aphj;
        aphg aphg;
        TextView textView;
        aqxj aqxj = (aqxj) obj;
        acvx acvx = akor.a;
        this.a = aqxj;
        this.i.a(aqxj);
        if ((aqxj.a & 256) != 0) {
            aphj = aqxj.g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        } else {
            aphg = null;
        }
        this.e.a(aphg, acvx);
        if (aphg != null) {
            arml arml;
            textView = this.d;
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
        }
        this.j.a(aqxj);
        if ((aqxj.a & 16384) != 0) {
            aphj = aqxj.m;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        } else {
            aphg = null;
        }
        this.h.a(aphg, acvx);
        if (aphg != null) {
            arml arml2;
            aruh aruh;
            textView = this.g;
            if ((aphg.a & 128) != 0) {
                arml2 = aphg.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            xpr.a(textView, ajqy.a(arml2));
            this.f.setVisibility(0);
            if ((aphg.a & 1024) != 0) {
                arup arup = aphg.k;
                if (arup == null) {
                    arup = arup.c;
                }
                aruh = arup.a == 102716411 ? (aruh) arup.b : aruh.j;
            } else {
                aruh = null;
            }
            if (aruh != null) {
                this.b.a(aruh, this.g, aphg, acvx);
            }
        } else {
            this.f.setVisibility(8);
        }
        acvx.a(aqxj.C.d(), null);
        this.k.a(aqxj.B, (ezk) this);
    }
}
