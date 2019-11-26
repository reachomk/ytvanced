package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: ewq */
public final class ewq extends akpl {
    private final akou a;
    private final akkq b;
    private final akoj c;
    private final View d;
    private final ImageView e = ((ImageView) this.d.findViewById(R.id.thumbnail));
    private final TextView f = ((TextView) this.d.findViewById(R.id.title));
    private final TextView g = ((TextView) this.d.findViewById(R.id.subtitle));
    private final TextView h = ((TextView) this.d.findViewById(R.id.action_button));
    private final akyy i;
    private final int j;

    public ewq(Context context, flu flu, akkq akkq, aaas aaas, akzb akzb) {
        this.a = flu;
        this.b = akkq;
        this.d = View.inflate(context, R.layout.compact_tvfilm_entry_point_item, null);
        this.i = akzb.a(this.h);
        this.a.a(this.d);
        this.c = new akoj(aaas, (akou) flu);
        this.j = xss.a(context.getResources().getDisplayMetrics(), 8);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.d;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        aphg aphg;
        aqgo aqgo = (aqgo) obj;
        akkq akkq = this.b;
        ImageView imageView = this.e;
        aygk aygk = aqgo.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.f;
        if ((aqgo.a & 2) != 0) {
            arml = aqgo.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.g;
        if ((aqgo.a & 4) != 0) {
            arml = aqgo.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        if ((aqgo.a & 8) != 0) {
            anxp anxp = aqgo.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphg = (aphg) b;
        } else {
            aphg = null;
        }
        this.i.a(aphg, akor.a);
        if ((aqgo.a & 16) != 0) {
            akoj akoj = this.c;
            acvx acvx = akor.a;
            apxu apxu = aqgo.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            akoj.a(acvx, apxu, akor.b());
            xpr.a(this.d, null);
            this.h.setClickable(false);
        }
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.bottomMargin = this.j;
        this.d.setLayoutParams(layoutParams);
    }
}
