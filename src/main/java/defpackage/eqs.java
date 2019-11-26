package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: eqs */
public final class eqs implements akot {
    public final lud a;
    public final View b;
    public final eqt c;
    private final akkq d;
    private final ImageView e = ((ImageView) this.b.findViewById(R.id.donation_post_header_icon));
    private final YouTubeTextView f = ((YouTubeTextView) this.b.findViewById(R.id.donation_post_thanks));
    private final YouTubeTextView g = ((YouTubeTextView) this.b.findViewById(R.id.donation_post_additional_info));
    private final ImageView h = ((ImageView) this.b.findViewById(R.id.donation_post_creator_thumbnail));
    private final YouTubeTextView i = ((YouTubeTextView) this.b.findViewById(R.id.donation_post_creator_message_title));
    private final YouTubeTextView j = ((YouTubeTextView) this.b.findViewById(R.id.donation_post_creator_message_description));
    private final YouTubeButton k = ((YouTubeButton) this.b.findViewById(R.id.donation_post_done_button));
    private final akyu l;
    private final YouTubeButton m;
    private final akyu n;

    public eqs(Context context, akyz akyz, akkq akkq, lud lud, ViewGroup viewGroup, eqt eqt) {
        this.d = akkq;
        this.a = lud;
        this.b = LayoutInflater.from(context).inflate(R.layout.donation_post_transaction, viewGroup, false);
        this.l = akyz.a(this.k);
        this.m = (YouTubeButton) this.b.findViewById(R.id.donation_post_share_button);
        this.n = akyz.a(this.m);
        this.c = eqt;
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    /* renamed from: a */
    public final void a_(akor akor, aqxi aqxi) {
        aygk aygk;
        anxp anxp;
        Object b;
        aphg aphg;
        arml arml;
        View view;
        acvx acvx = akor.a;
        akkq akkq = this.d;
        ImageView imageView = this.e;
        if ((aqxi.a & 1) != 0) {
            aygk = aqxi.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.f;
        arml arml2 = aqxi.c;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        textView = this.g;
        arml2 = aqxi.d;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        akkq = this.d;
        imageView = this.h;
        aqxg aqxg = aqxi.e;
        if (aqxg == null) {
            aqxg = aqxg.e;
        }
        aygk = aqxg.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk, akko.h().a((int) R.drawable.product_logo_avatar_square_grey_color_120).a());
        textView = this.i;
        aqxg aqxg2 = aqxi.e;
        if (aqxg2 == null) {
            aqxg2 = aqxg.e;
        }
        arml2 = aqxg2.c;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        textView = this.j;
        aqxg2 = aqxi.e;
        if (aqxg2 == null) {
            aqxg2 = aqxg.e;
        }
        arml2 = aqxg2.d;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        if ((aqxi.a & 16) != 0) {
            anxp = aqxi.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphg = (aphg) b;
            this.l.a(aphg, acvx);
            this.l.c = new eqv(this);
            TextView textView2 = this.k;
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(textView2, ajqy.a(arml));
            view = this.k;
            xpr.a(view, view.getBackground());
        } else {
            this.k.setVisibility(8);
        }
        if ((aqxi.a & 32) != 0) {
            anxp = aqxi.g;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$0002);
            b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aphg = (aphg) b;
            this.n.a(aphg, acvx);
            TextView textView3 = this.m;
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(textView3, ajqy.a(arml));
            view = this.m;
            xpr.a(view, view.getBackground());
        } else {
            this.m.setVisibility(8);
        }
        acvx.a(aqxi.h.d(), null);
    }
}
