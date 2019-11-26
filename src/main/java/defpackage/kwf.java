package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kwf */
public final class kwf implements akot {
    public aoic a;
    private final akkq b;
    private final vod c;
    private final ajqw d;
    private final View e;
    private final ImageView f = ((ImageView) this.e.findViewById(R.id.primary_image));
    private final ImageView g = ((ImageView) this.e.findViewById(R.id.icon));
    private final TextView h = ((TextView) this.e.findViewById(R.id.title));
    private final TextView i = ((TextView) this.e.findViewById(R.id.heading));
    private final TextView j = ((TextView) this.e.findViewById(R.id.subheading));
    private akko k;

    public kwf(Context context, akkq akkq, vod vod, aaas aaas) {
        this.b = akkq;
        this.c = vod;
        ajqv a = ajqw.a();
        a.a = context;
        a.c = new akta(aaas);
        this.d = a.a();
        this.e = LayoutInflater.from(context).inflate(R.layout.ad_item_details_section, null, false);
        this.e.setOnClickListener(new kwe(this, vod, aaas));
    }

    public final View K_() {
        return this.e;
    }

    public final void a(akpb akpb) {
        this.c.b(this.a);
        this.a = null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aoic aoic = (aoic) obj;
        boolean z = true;
        xpr.a(this.e, true);
        arml arml2 = null;
        akor.a.a(aoic.h.d(), null);
        if (this.k == null) {
            this.k = akko.h().a(true).a(new kwh()).a();
        }
        this.a = aoic;
        akkq akkq = this.b;
        ImageView imageView = this.f;
        aygk aygk = aoic.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk, this.k);
        xpr.a(this.f, (aoic.a & 1) != 0);
        akkq = this.b;
        imageView = this.g;
        aygk aygk2 = aoic.c;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        akkq.a(imageView, aygk2, this.k);
        View view = this.g;
        if ((aoic.a & 2) == 0) {
            z = false;
        }
        xpr.a(view, z);
        TextView textView = this.h;
        if ((aoic.a & 4) != 0) {
            arml = aoic.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml, this.d));
        textView = this.i;
        if ((aoic.a & 8) != 0) {
            arml = aoic.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml, this.d));
        textView = this.j;
        if ((aoic.a & 16) != 0) {
            arml2 = aoic.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml2, this.d));
    }
}
