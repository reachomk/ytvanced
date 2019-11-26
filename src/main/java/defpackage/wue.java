package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wue */
public final class wue implements akot {
    private final aaas a;
    private final akkq b;
    private final LinearLayout c;
    private final YouTubeTextView d = ((YouTubeTextView) this.c.findViewById(R.id.title));
    private final YouTubeTextView e = ((YouTubeTextView) this.c.findViewById(R.id.subtitle));
    private final ImageView f = ((ImageView) this.c.findViewById(R.id.icon));
    private final View g = this.c.findViewById(R.id.top_spacer);
    private final View h = this.c.findViewById(R.id.title_spacer);
    private final YouTubeTextView i = ((YouTubeTextView) this.c.findViewById(R.id.end_button));
    private final akyy j;
    private final YouTubeTextView k;
    private final akyy l;

    public wue(Context context, aaas aaas, akkq akkq, akzb akzb) {
        this.a = aaas;
        this.b = akkq;
        this.c = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.sponsorships_heading_layout, null, false);
        this.j = akzb.a(this.i);
        this.k = (YouTubeTextView) this.c.findViewById(R.id.bottom_button);
        this.l = akzb.a(this.k);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        axak axak;
        axsr axsr = (axsr) obj;
        acvx acvx = akor.a;
        axak axak2 = null;
        if (axsr.g) {
            LinearLayout linearLayout = this.c;
            linearLayout.setBackgroundColor(xwe.a(linearLayout.getContext(), R.attr.ytGeneralBackgroundB));
        } else {
            this.c.setBackground(null);
        }
        TextView textView = this.d;
        boolean z = true;
        if ((axsr.a & 1) != 0) {
            arml = axsr.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.a, false));
        textView = this.e;
        if ((axsr.a & 4) != 0) {
            arml = axsr.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.a, false));
        if ((axsr.a & 2) == 0) {
            xpr.a(this.f, false);
        } else {
            xpr.a(this.f, true);
            akkq akkq = this.b;
            ImageView imageView = this.f;
            aygk aygk = axsr.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
        }
        xpr.a(this.g, axsr.h);
        Object obj2 = (this.e.getVisibility() == 0 || this.f.getVisibility() == 0) ? 1 : null;
        View view = this.h;
        boolean z2 = obj2 != null && this.d.getVisibility() == 0;
        xpr.a(view, z2);
        xpr.a(this.i, (axsr.a & 8) != 0);
        akyy akyy = this.j;
        if ((axsr.a & 8) != 0) {
            axak = axsr.e;
            if (axak == null) {
                axak = axak.a;
            }
        } else {
            axak = null;
        }
        akyy.a((aphg) ajzv.a(ajzv.a(axak), aphg.class), acvx);
        View view2 = this.k;
        if ((axsr.a & 16) == 0) {
            z = false;
        }
        xpr.a(view2, z);
        akyy = this.l;
        if ((axsr.a & 16) != 0) {
            axak2 = axsr.f;
            if (axak2 == null) {
                axak2 = axak.a;
            }
        }
        akyy.a((aphg) ajzv.a(ajzv.a(axak2), aphg.class), acvx);
    }
}
