package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ive */
final class ive extends jxw {
    private final akoj a;
    private final akvp b;
    private final akvo c;
    private final TextView d;
    private final View e;
    private final ViewGroup z;

    public ive(Context context, akkq akkq, aaas aaas, akou akou, gal gal, akvo akvo, akvp akvp) {
        super(context, akkq, aaas, gal, akou, (int) R.layout.watch_card_compact_video_condensed_item, null);
        this.a = new akoj(aaas, akou);
        View view = this.h;
        this.d = (TextView) view.findViewById(R.id.serial_id);
        this.e = view.findViewById(R.id.thumbnail_layout);
        this.z = (ViewGroup) view.findViewById(R.id.badge_layout);
        this.c = akvo;
        this.b = akvp;
    }

    public final View K_() {
        return this.h;
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.a.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        arml arml;
        arml arml2;
        arml arml3;
        auvn auvn;
        azhw azhw = (azhw) obj;
        akoj akoj = this.a;
        acvx acvx = akor.a;
        if ((azhw.a & 64) != 0) {
            apxu = azhw.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b(), this);
        if ((azhw.a & 1) != 0) {
            aygk aygk = azhw.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(aygk);
            xpr.a(this.e, true);
            xpr.a(this.d, false);
        } else {
            xpr.a(this.d, azhw.l);
            xpr.a(this.e, false);
        }
        TextView textView = this.i;
        if ((azhw.a & 2) != 0) {
            arml = azhw.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.l;
        if ((azhw.a & 4) != 0) {
            arml = azhw.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        iwv.a(this.f, this.z, this.b, azhw.i, false);
        if ((azhw.a & 16) != 0) {
            arml2 = azhw.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence a = ajqy.a(arml2);
        if ((azhw.a & 16) != 0) {
            arml3 = azhw.f;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        } else {
            arml3 = null;
        }
        a(a, ajqy.b(arml3));
        akvo akvo = this.c;
        View view = this.h;
        View view2 = this.v;
        auvr auvr = azhw.k;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((1 & auvr.a) == 0) {
            auvn = null;
        } else {
            auvr auvr2 = azhw.k;
            if (auvr2 == null) {
                auvr2 = auvr.c;
            }
            auvn auvn2 = auvr2.b;
            if (auvn2 == null) {
                auvn2 = auvn.l;
            }
            auvn = auvn2;
        }
        akvo.a(view, view2, auvn, azhw, akor.a);
    }
}
