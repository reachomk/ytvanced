package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jtj */
public final class jtj implements akot {
    public final aaas a;
    private final akkq b;
    private final akvo c;
    private final View d;
    private final ImageView e = ((ImageView) this.d.findViewById(R.id.thumbnail));
    private final TextView f = ((TextView) this.d.findViewById(R.id.title));
    private final TextView g = ((TextView) this.d.findViewById(R.id.description));
    private final ImageView h = ((ImageView) this.d.findViewById(R.id.contextual_menu_anchor));

    public jtj(Context context, aaas aaas, akkq akkq, akvo akvo, ViewGroup viewGroup) {
        this.a = aaas;
        this.b = akkq;
        this.c = akvo;
        this.d = LayoutInflater.from(context).inflate(R.layout.suggested_videos_header, viewGroup, false);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.b.a(this.e);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aygk aygk;
        arml arml;
        axyo axyo = (axyo) obj;
        this.d.setOnClickListener(new jti(this, axyo));
        akkq akkq = this.b;
        ImageView imageView = this.e;
        axak axak = null;
        if ((axyo.a & 4) != 0) {
            aygk = axyo.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.f;
        if ((axyo.a & 1) != 0) {
            arml = axyo.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.g;
        if ((axyo.a & 2) != 0) {
            arml = axyo.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        akvo akvo = this.c;
        View rootView = this.d.getRootView();
        ImageView imageView2 = this.h;
        if ((axyo.a & 8) != 0) {
            axak = axyo.e;
            if (axak == null) {
                axak = axak.a;
            }
        }
        akvo.a(rootView, imageView2, (auvn) ajzv.a(ajzv.a(axak), auvn.class), axyo, acvx.g);
    }
}
