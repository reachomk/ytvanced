package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: ken */
public final class ken implements akot {
    public final lwc a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final fnb e;
    private final fnb f;
    private final akou g;
    private final akvp h;

    public ken(Context context, akpn akpn, akvp akvp, fna fna, lwc lwc, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.limited_state_msg, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.lim_state_msg_header_text);
        this.c = (TextView) inflate.findViewById(R.id.lim_state_msg_subtext);
        this.d = (ImageView) inflate.findViewById(R.id.lim_state_msg_icon);
        this.e = fna.a((TextView) inflate.findViewById(R.id.learn_more_button));
        this.f = fna.a((TextView) inflate.findViewById(R.id.go_home_button));
        this.g = (akou) amqw.a((Object) akpn);
        this.h = (akvp) amqw.a((Object) akvp);
        this.a = lwc;
        akpn.a(inflate);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.g.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        anxp anxp;
        anxr access$000;
        Object b;
        auaf auaf = (auaf) obj;
        TextView textView = this.b;
        aphg aphg = null;
        if ((auaf.a & 1) != 0) {
            arml = auaf.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.c;
        if ((auaf.a & 2) != 0) {
            arml = auaf.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        if ((auaf.a & 8) != 0) {
            aphg aphg2;
            anxp = auaf.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = auaf.e;
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
                aphg2 = (aphg) b;
            } else {
                aphg2 = null;
            }
            this.e.a(aphg2, akor.a);
        }
        if ((auaf.a & 16) != 0) {
            anxp = auaf.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = auaf.f;
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
            }
            this.f.a(aphg, akor.a);
            this.f.c = new kem(this);
        }
        if ((auaf.a & 4) != 0) {
            ImageView imageView = this.d;
            arwf arwf = auaf.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            int a2 = this.h.a(a);
            if (a2 != 0) {
                imageView.setImageResource(a2);
                imageView.setVisibility(0);
            }
        }
        this.g.a(akor);
    }
}
