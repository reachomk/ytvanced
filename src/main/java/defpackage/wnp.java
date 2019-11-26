package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FeedbackSurveyRendererOuterClass;

/* renamed from: wnp */
public final class wnp implements akot {
    public final aaas a;
    public final View b;
    private final wnw c;
    private final TextView d = ((TextView) this.b.findViewById(R.id.title));
    private final TextView e = ((TextView) this.b.findViewById(R.id.okay_button));
    private final ViewGroup f;
    private final won g;
    private final won h;
    private final wnk i;
    private final wnb j;

    public wnp(Context context, aaas aaas, wop wop, wny wny, wnb wnb, ViewGroup viewGroup, wnk wnk) {
        this.a = new wnx(aaas, new woa(new wns(this)));
        this.j = wnb;
        this.b = LayoutInflater.from(context).inflate(R.layout.ypc_membership_post_transaction_layout, viewGroup, false);
        this.c = wny.a(this.b);
        this.i = wnk;
        this.b.findViewById(R.id.close_button).setOnClickListener(new wnr(this));
        this.g = wop.a(this.a, this.b.findViewById(R.id.yt_perks));
        this.h = wop.a(this.a, this.b.findViewById(R.id.custom_perks));
        this.f = (ViewGroup) this.b.findViewById(R.id.survey);
        this.f.addView(wnb.a);
    }

    public final void a(akpb akpb) {
    }

    /* renamed from: a */
    public final void a_(akor akor, auuw auuw) {
        arml arml;
        anze anze;
        aphg aphg;
        wnw wnw = this.c;
        aygk aygk = auuw.h;
        if (aygk == null) {
            aygk = aygk.f;
        }
        aygk aygk2 = auuw.f;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        aygk aygk3 = auuw.e;
        if (aygk3 == null) {
            aygk3 = aygk.f;
        }
        arwf arwf = auuw.c;
        if (arwf == null) {
            arwf = arwf.c;
        }
        wnw.a(aygk, aygk2, aygk3, arwf);
        TextView textView = this.d;
        boolean z = true;
        if ((auuw.a & 1) != 0) {
            arml = auuw.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        won won = this.g;
        if ((auuw.a & 128) != 0) {
            anze = auuw.i;
            if (anze == null) {
                anze = axak.a;
            }
        } else {
            anze = null;
        }
        wnw.a(akor, won, (ajzw) ajzv.a(anze, ajzw.class));
        won = this.h;
        if ((auuw.a & 256) != 0) {
            anze = auuw.j;
            if (anze == null) {
                anze = axak.a;
            }
        } else {
            anze = null;
        }
        wnw.a(akor, won, (ajzw) ajzv.a(anze, ajzw.class));
        anxp anxp = auuw.k;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(FeedbackSurveyRendererOuterClass.feedbackSurveyRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        arjw arjw = (arjw) b;
        xpr.a(this.f, arjw != null);
        if (arjw != null) {
            this.j.a(arjw);
        }
        aphj aphj = auuw.d;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) == 0) {
            aphg = null;
        } else {
            aphj = auuw.d;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        if (aphg != null) {
            arml arml2;
            TextView textView2 = this.e;
            if ((aphg.a & 128) != 0) {
                arml2 = aphg.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            textView2.setText(ajqy.a(arml2));
            this.e.setOnClickListener(new wnu(this, aphg));
            akor.a.a(aphg.r.d(), null);
        }
        View view = this.e;
        if (aphg == null) {
            z = false;
        }
        xpr.a(view, z);
        akor.a.a(auuw.n.d(), null);
    }

    public final void b() {
        this.j.b();
        this.i.a();
    }

    public final View K_() {
        return this.b;
    }
}
