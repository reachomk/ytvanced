package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Map;

/* renamed from: wrh */
public final class wrh implements akot, OnDismissListener {
    public final Runnable a;
    public final Runnable b;
    public final View c;
    public int d = 0;
    private final LayoutInflater e;
    private final aaas f;
    private final Map g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final LinearLayout l;
    private final TextView m;
    private final akyy n;
    private final TextView o;
    private final akyy p;
    private azpt q;

    public wrh(Context context, aaas aaas, akzb akzb, Runnable runnable, Runnable runnable2, Map map) {
        this.f = aaas;
        this.a = runnable;
        this.b = runnable2;
        this.g = map;
        this.e = LayoutInflater.from(context);
        this.c = this.e.inflate(R.layout.upgrade_dialog, null, false);
        this.h = (TextView) this.c.findViewById(R.id.title);
        this.i = (TextView) this.c.findViewById(R.id.offer_display_title);
        this.j = (TextView) this.c.findViewById(R.id.access_message);
        this.k = (TextView) this.c.findViewById(R.id.legal_text);
        this.l = (LinearLayout) this.c.findViewById(R.id.billing_details_container);
        this.m = (TextView) this.c.findViewById(R.id.continue_button);
        this.o = (TextView) this.c.findViewById(R.id.cancel_button);
        this.n = akzb.a(this.m);
        this.p = akzb.a(this.o);
    }

    public final void a(akpb akpb) {
    }

    /* renamed from: a */
    public final void a_(akor akor, azpt azpt) {
        akyy akyy;
        anxp anxp;
        anxr access$000;
        Object b;
        aphg aphg;
        acvx acvx = akor.a;
        this.q = azpt;
        TextView textView = this.h;
        azpx azpx = azpt.b;
        if (azpx == null) {
            azpx = azpx.e;
        }
        arml arml = azpx.b;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        textView = this.i;
        azpx = azpt.b;
        if (azpx == null) {
            azpx = azpx.e;
        }
        arml = azpx.c;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.j;
        azpx = azpt.b;
        if (azpx == null) {
            azpx = azpx.e;
        }
        arml = azpx.d;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        textView = this.k;
        if ((azpt.a & 2) != 0) {
            arml = azpt.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        this.l.removeAllViews();
        for (azps azps : azpt.c) {
            View inflate = this.e.inflate(R.layout.billing_item, null, false);
            TextView textView2 = (TextView) inflate.findViewById(R.id.title);
            arml arml2 = azps.b;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            textView2.setText(ajqy.a(arml2));
            textView2 = (TextView) inflate.findViewById(R.id.subtitle);
            arml2 = azps.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            textView2.setText(ajqy.a(arml2));
            textView2 = (TextView) inflate.findViewById(R.id.description);
            arml = azps.d;
            if (arml == null) {
                arml = arml.f;
            }
            textView2.setText(ajqy.a(arml));
            this.l.addView(inflate);
        }
        if ((azpt.a & 8) == 0) {
            this.o.setVisibility(8);
        } else {
            akyy = this.p;
            anxp = azpt.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            akyy.a((aphg) b, acvx);
            this.p.c = new wrg(this);
        }
        akyy = this.n;
        anxp = azpt.e;
        if (anxp == null) {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = azpt.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphg = (aphg) b;
        } else {
            aphg = null;
        }
        akyy.a(aphg, acvx, this.g);
        this.n.c = new wrj(this);
        if ((azpt.a & 32) != 0) {
            acvx.a(azpt.i.d(), null);
        }
        if (azpt.g.size() != 0) {
            this.f.a(azpt.g, null);
        }
    }

    public final View K_() {
        return this.c;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.q.h.size() != 0 && this.d != 1) {
            this.f.a(this.q.h, null);
        }
    }
}
