package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconMessageRendererOuterClass;
import java.util.Iterator;
import java.util.Map;

/* renamed from: acet */
public final class acet extends nd {
    public akvp Z;
    public acwa aa;
    public aaas ab;
    public akpi ac;
    public avdl ad;
    public Map ae;
    private View af;
    private TextView ag;
    private RecyclerView ah;
    private acez ai;
    private akyy aj;
    private akyy ak;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((acew) xse.a(p())).a(this);
        a(1, 0);
        LayoutInflater from = LayoutInflater.from(M_());
        this.af = from.inflate(R.layout.multi_message_confirm_dialog_layout, new ScrollView(M_()));
        this.ag = (TextView) this.af.findViewById(R.id.title);
        this.ah = (RecyclerView) this.af.findViewById(R.id.recycler_view);
        apn ans = new ans();
        ans.b(1);
        this.ah.a(ans);
        this.ai = new acez(from);
        this.ah.a(this.ai);
        this.aj = new akyy(this.ab, this.Z, this.ac, (TextView) this.af.findViewById(R.id.cancel_button));
        this.ak = new akyy(this.ab, this.Z, this.ac, (TextView) this.af.findViewById(R.id.confirm_button));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (F_()) {
            dismiss();
            a(this.v, "MultiMessageConfirmDialogFragment");
        }
    }

    public final Dialog a(Bundle bundle) {
        Object b;
        aphg aphg;
        amqw.a(this.ad);
        TextView textView = this.ag;
        arml arml = this.ad.b;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        this.ai.c.clear();
        if (this.ad.e.size() == 0) {
            this.ah.setVisibility(8);
        } else {
            Iterator it = this.ad.e.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Spanned a;
                axak axak = (axak) it.next();
                anxr access$000 = anxl.checkIsLite(IconMessageRendererOuterClass.iconMessageRenderer);
                axak.a(access$000);
                b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                arwd arwd = (arwd) b;
                acez acez = this.ai;
                if ((arwd.a & 1) != 0) {
                    akvp akvp = this.Z;
                    arwf arwf = arwd.b;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a2 = arwh.a(arwf.b);
                    if (a2 == null) {
                        a2 = arwh.UNKNOWN;
                    }
                    i = akvp.a(a2);
                }
                if ((arwd.a & 2) != 0) {
                    arml arml2 = arwd.c;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                    a = ajqy.a(arml2);
                } else {
                    a = null;
                }
                acez.c.add(new aceq(i, a));
            }
            this.ah.setVisibility(0);
        }
        this.ai.aa_();
        akyy akyy = this.aj;
        anxp anxp = this.ad.d;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$0002);
        if (anxp.h.a(access$0002.d)) {
            anxp = this.ad.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$0002);
            b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aphg = (aphg) b;
        } else {
            aphg = null;
        }
        akyy.a(aphg, this.aa.t(), this.ae);
        this.aj.c = new aces(this);
        akyy = this.ak;
        anxp = this.ad.c;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$0002);
        if (anxp.h.a(access$0002.d)) {
            anxp = this.ad.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$0002);
            b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aphg = (aphg) b;
        } else {
            aphg = null;
        }
        akyy.a(aphg, this.aa.t(), this.ae);
        this.ak.c = new acev(this);
        this.aa.t().a(this.ad.f.d(), null);
        return new Builder(M_()).setView(this.af).create();
    }
}
