package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: allz */
public final class allz implements akot {
    private final aaas a;
    private final acvx b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final TextView e = ((TextView) this.c.findViewById(R.id.subtitle));
    private final TextView f = ((TextView) this.c.findViewById(R.id.post_button));
    private final View g = this.c.findViewById(R.id.tooltip_anchor);
    private final akyu h;
    private final Runnable i;

    public allz(Context context, aaas aaas, akpi akpi, acvx acvx, almb almb, Runnable runnable) {
        this.b = (acvx) amqw.a((Object) acvx);
        this.i = (Runnable) amqw.a((Object) runnable);
        amqw.a((Object) context);
        this.a = (aaas) amqw.a((Object) aaas);
        this.c = View.inflate(context, R.layout.community_post_section, null);
        alpf.a(this.c, true);
        this.h = new akyu(aaas, akpi, this.f);
        View view = this.f;
        xpr.a(view, view.getBackground());
        if (almb != null) {
            almb.a(this.g);
        }
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ayks ayks = (ayks) obj;
        this.c.setVisibility(0);
        aphj aphj = ayks.d;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) != 0) {
            arml arml;
            TextView textView = this.d;
            arml arml2 = null;
            if ((ayks.a & 1) != 0) {
                arml = ayks.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            textView = this.e;
            if ((ayks.a & 2) != 0) {
                arml = ayks.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(aabb.a(arml, this.a, false));
            aphj = ayks.d;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            TextView textView2 = this.f;
            if ((aphg.a & 128) != 0) {
                arml2 = aphg.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            textView2.setText(ajqy.a(arml2));
            zj zjVar = new zj(1);
            zjVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.i);
            this.h.a(aphg, this.b, zjVar);
            return;
        }
        this.c.setVisibility(8);
    }
}
