package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: kbe */
public final class kbe extends ilg {
    private final akkq h;
    private final akou i;
    private final akoj j;
    private final ImageView k = ((ImageView) this.c.findViewById(R.id.station_thumbnail));

    public kbe(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo, akvp akvp) {
        super(context, akkq, akvo, (int) R.layout.compact_station_item, akvp);
        this.h = (akkq) amqw.a((Object) akkq);
        this.i = (akou) amqw.a((Object) flu);
        flu.a(this.c);
        this.j = new akoj(aaas, (akou) flu);
    }

    public final View K_() {
        return this.i.a();
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.j.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        arml arml;
        aqgm aqgm = (aqgm) obj;
        akoj akoj = this.j;
        acvx acvx = akor.a;
        arml arml2 = null;
        if ((aqgm.a & 8) != 0) {
            apxu = aqgm.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(aqgm.g.d(), null);
        if ((aqgm.a & 1) != 0) {
            arml = aqgm.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a(ajqy.a(arml));
        if ((aqgm.a & 2) != 0) {
            arml = aqgm.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        b(ajqy.a(arml));
        if ((aqgm.a & 4) != 0) {
            arml2 = aqgm.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        c(ajqy.a(arml2));
        akkq akkq = this.h;
        ImageView imageView = this.k;
        aygk aygk = aqgm.f;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        this.i.a(akor);
    }
}
