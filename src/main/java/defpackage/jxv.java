package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;

/* renamed from: jxv */
public final class jxv implements akot {
    public aqas a;
    private final Activity b;
    private final akvp c;
    private final View d;
    private final TextView e = ((TextView) this.d.findViewById(R.id.channel_title));
    private final TextView f = ((TextView) this.d.findViewById(R.id.channel_subscribers));
    private final TextView g = ((TextView) this.d.findViewById(R.id.subscribe_button));
    private final eso h;

    public jxv(Activity activity, aaas aaas, akvp akvp, est est, eur eur) {
        this.b = (Activity) amqw.a((Object) activity);
        this.c = akvp;
        this.d = LayoutInflater.from(activity).inflate(R.layout.backstage_subscribe_bar, null);
        this.h = est.a(this.g, eur.a(this.d.findViewById(R.id.subscription_notification_view)));
        this.d.setOnClickListener(new jxu(this, aaas));
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.h.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        int a;
        arml arml2;
        aqas aqas = (aqas) obj;
        this.a = aqas;
        anxp anxp = aqas.d;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        axwa axwa = (axwa) b;
        acvx acvx = akor.a;
        TextView textView = this.e;
        arml arml3 = null;
        if ((aqas.a & 1) != 0) {
            arml = aqas.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        if ((aqas.a & 8) != 0) {
            akvp akvp = this.c;
            arwf arwf = aqas.e;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            a = akvp.a(a2);
        } else {
            a = 0;
        }
        if (a > 0) {
            Drawable drawable = this.b.getResources().getDrawable(a);
            drawable.setBounds(0, 0, 55, 55);
            this.e.setCompoundDrawablesRelative(null, null, drawable, null);
            this.e.setCompoundDrawablePadding(2);
        } else {
            this.e.setCompoundDrawablesRelative(null, null, null, null);
        }
        TextView textView2 = this.f;
        if ((axwa.a & 64) != 0) {
            arml2 = axwa.k;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        textView2.setText(ajqy.a(arml2));
        axwd axwd = (axwd) ((anxo) axwa.toBuilder());
        Activity activity = this.b;
        aqas aqas2 = this.a;
        if ((aqas2.a & 1) != 0) {
            arml3 = aqas2.b;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        }
        evj.b(activity, axwd, ajqy.a(arml3));
        this.h.a((axwa) ((anxl) axwd.build()), acvx);
    }
}
