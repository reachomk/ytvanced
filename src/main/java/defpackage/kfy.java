package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* renamed from: kfy */
final class kfy implements akot {
    public final View a;
    public final aaas b;
    private final acvx c;
    private final kbr d;
    private final TextView e;
    private final TextView f;
    private final TextView g;

    public kfy(View view, aaas aaas, acvx acvx, kbr kbr) {
        this.a = view;
        this.b = aaas;
        this.c = acvx;
        this.d = kbr;
        this.e = (TextView) view.findViewById(R.id.success_response_text);
        this.f = (TextView) view.findViewById(R.id.undo_text);
        this.g = (TextView) view.findViewById(R.id.dismissal_reasons_text);
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.notification_text_min_touch_area_height);
        TextView textView = this.f;
        View view2 = (View) textView.getParent();
        view2.post(new kfz(textView, dimensionPixelSize, view2));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, avls avls) {
        jme jme = null;
        akor.a.a(avls.e.d(), null);
        TextView textView = this.e;
        arml arml = avls.b;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.e;
        arml = avls.b;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setContentDescription(kfx.a(arml));
        textView = this.f;
        arml = avls.c;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.f;
        arml = avls.c;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setContentDescription(kfx.a(arml));
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", avls);
        this.f.setOnClickListener(new kgb(this, avls, hashMap));
        anxr access$000 = anxl.checkIsLite(avlq.b);
        avls.a(access$000);
        if (avls.h.a(access$000.d)) {
            Object obj;
            arml arml2;
            access$000 = anxl.checkIsLite(avlq.b);
            avls.a(access$000);
            Object b = avls.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            asnl asnl = (asnl) obj;
            TextView textView2 = this.g;
            if ((asnl.a & 4) != 0) {
                arml2 = asnl.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            xpr.a(textView2, ajqy.a(arml2));
            textView2 = this.g;
            if ((asnl.a & 4) != 0) {
                arml2 = asnl.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            textView2.setContentDescription(kfx.a(arml2));
            b = akor.a("sectionController");
            if (b instanceof jme) {
                jme = (jme) b;
            }
            this.g.setOnClickListener(new kga(this, avls, jme));
            akor.a.a(new acvs(asnl.b), new acvs(avls.e));
            return;
        }
        xpr.a(this.g, false);
    }
}
