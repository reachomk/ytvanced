package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: kct */
public final class kct extends ilg {
    private final akou h;
    private final akoj i;
    private final TextView j = ((TextView) this.c.findViewById(R.id.title));

    public kct(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo, akvp akvp) {
        super(context, akkq, akvo, (int) R.layout.grid_narrow_radio_item, akvp);
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
        arrw arrw = (arrw) obj;
        akoj akoj = this.i;
        acvx acvx = akor.a;
        apxu apxu = arrw.i;
        if (apxu == null) {
            apxu = apxu.d;
        }
        akoj.a(acvx, apxu, akor.b());
        auvr auvr = null;
        akor.a.a(arrw.m.d(), null);
        arml arml = arrw.d;
        if (arml == null) {
            arml = arml.f;
        }
        a(ajqy.a(arml));
        TextView textView = this.j;
        int i = arrw.e;
        if (i == 0) {
            i = 1;
        }
        textView.setMaxLines(i);
        if ((arrw.a & 64) != 0) {
            arml = arrw.h;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        b(ajqy.a(arml));
        aygk aygk = arrw.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        a(aygk);
        if (ilg.a((List) arrw.c)) {
            b(arrw.c);
        } else {
            arml arml2;
            if ((arrw.a & 32) != 0) {
                arml = arrw.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            CharSequence a = ajqy.a(arml);
            if ((arrw.a & 16) != 0) {
                arml2 = arrw.f;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            a(a, ajqy.a(arml2));
        }
        View a2 = this.h.a();
        if ((arrw.a & 512) != 0) {
            auvr = arrw.k;
            if (auvr == null) {
                auvr = auvr.c;
            }
        }
        a(a2, auvr, arrw, akor.a);
        this.h.a(akor);
    }
}
