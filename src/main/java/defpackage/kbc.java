package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: kbc */
public final class kbc extends ilg {
    private final akou h;
    private final akoj i;

    public kbc(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo, akvp akvp) {
        super(context, akkq, akvo, (int) R.layout.compact_radio_item, akvp);
        this.h = (akou) amqw.a((Object) flu);
        flu.a(this.c);
        this.i = new akoj(aaas, (akou) flu);
    }

    public final View K_() {
        return this.h.a();
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.i.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        arml arml;
        aqgi aqgi = (aqgi) obj;
        akoj akoj = this.i;
        acvx acvx = akor.a;
        arml arml2 = null;
        if ((aqgi.a & 16) != 0) {
            apxu = aqgi.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(aqgi.m.d(), null);
        LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) this.a.getResources().getDimension(R.dimen.list_item_thumbnail_width);
        }
        if ((aqgi.a & 4) != 0) {
            arml = aqgi.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a(ajqy.a(arml));
        if ((aqgi.a & 1024) != 0) {
            arml2 = aqgi.j;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        b(ajqy.a(arml2));
        aygk aygk = aqgi.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        a(aygk);
        List list = aqgi.d;
        if (ilg.a(list)) {
            b(list);
        } else {
            arml = aqgi.i;
            if (arml == null) {
                arml = arml.f;
            }
            CharSequence a = ajqy.a(arml);
            arml arml3 = aqgi.h;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            a(a, ajqy.a(arml3));
        }
        View a2 = this.h.a();
        auvr auvr = aqgi.g;
        if (auvr == null) {
            auvr = auvr.c;
        }
        a(a2, auvr, aqgi, akor.a);
        this.h.a(akor);
    }
}
