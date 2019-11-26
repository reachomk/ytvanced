package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: jye */
final class jye {
    public final View a;
    public final eso b;
    public final eus c;
    public apxu d;
    public final /* synthetic */ jya e;
    private final TextView f;
    private final TextView g;
    private final ImageView h;
    private final jnx i;

    public final void a(akor akor, ajrw ajrw) {
        String f = xvd.f(xvd.b(ajrw.a));
        this.f.setText(f);
        this.d = ajrw.k;
        xpr.a(this.h, this.d != null);
        ajrv ajrv = ajrw.d;
        aphg aphg = null;
        ajsi ajsi = ajrv != null ? ajrv.a : null;
        axwa axwa = ajrv != null ? ajrv.b : null;
        if (ajsi != null) {
            xpr.a(this.g, false);
            jya jya = this.e;
            if (jya.m == null) {
                jgd jgd = jya.i;
                jya.m = new jgc((Activity) jgd.a((Activity) jgd.a.get(), 1), (akkq) jgd.a((akkq) jgd.b.get(), 2), (aaas) jgd.a((aaas) jgd.c.get(), 3), (View) jgd.a(((ViewStub) jya.d.findViewById(R.id.channel_offer_card_stub)).inflate(), 4));
            }
            this.e.m.a(ajsi);
            View view = this.e.g;
            if (view != null) {
                view.setVisibility(0);
            }
            apnc apnc = ajsi.d;
            if (apnc == null) {
                axwa = null;
            } else {
                axwa = apnc.b;
                if (axwa == null) {
                    axwa = axwa.M;
                }
            }
        } else {
            xpr.a(this.g, ajqy.a(ajrw.f));
            jgc jgc = this.e.m;
            if (jgc != null) {
                jgc.a(null);
            }
            View view2 = this.e.g;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        if (axwa != null) {
            axwa = (axwa) ((anxl) evj.b(this.e.a, (axwd) ((anxo) axwa.toBuilder()), f).build());
            ajrw.d.b = axwa;
        }
        this.b.a(axwa, akor.a);
        if (this.i != null) {
            axak axak = ajrw.o;
            if (axak != null) {
                anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                axak.a(access$000);
                Object b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aphg = (aphg) b;
            }
            this.i.a(aphg, akor.a);
        }
    }

    /* synthetic */ jye(jya jya, View view) {
        jnx jnx;
        this.e = jya;
        this.a = view;
        this.f = (TextView) view.findViewById(R.id.channel_title);
        this.g = (TextView) view.findViewById(R.id.channel_subtitle);
        this.h = (ImageView) view.findViewById(R.id.profile_editor_icon);
        TextView textView = (TextView) view.findViewById(R.id.subscribe_button);
        View findViewById = view.findViewById(R.id.subscription_notification_view);
        TextView textView2 = (TextView) view.findViewById(R.id.sponsor_button);
        this.c = jya.k.a(findViewById);
        this.b = jya.j.a(textView, this.c);
        if (textView2 == null) {
            jnx = null;
        } else {
            jnx = jya.l.a(textView2);
        }
        this.i = jnx;
        this.h.setOnClickListener(new jyh(this));
    }
}
