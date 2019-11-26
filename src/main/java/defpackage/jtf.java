package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;

/* renamed from: jtf */
public final class jtf implements akot {
    public final aaas a;
    private final akkq b;
    private final akvo c;
    private final View d;
    private final ImageView e = ((ImageView) this.d.findViewById(R.id.thumbnail));
    private final TextView f = ((TextView) this.d.findViewById(R.id.duration));
    private final TextView g = ((TextView) this.d.findViewById(R.id.headline));
    private final WrappingTextView h = ((WrappingTextView) this.d.findViewById(R.id.details));
    private final ImageView i = ((ImageView) this.d.findViewById(R.id.contextual_menu_anchor));
    private final View j = this.d.findViewById(R.id.separator);

    public jtf(Context context, aaas aaas, akkq akkq, akvo akvo, ViewGroup viewGroup) {
        this.a = aaas;
        this.b = akkq;
        this.c = akvo;
        this.d = LayoutInflater.from(context).inflate(R.layout.suggested_video, viewGroup, false);
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
        axyj axyj = (axyj) obj;
        this.d.setOnClickListener(new jte(this, axyj));
        akkq akkq = this.b;
        ImageView imageView = this.e;
        axak axak = null;
        if ((axyj.a & 8) != 0) {
            aygk = axyj.e;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.f;
        if ((axyj.a & 16) != 0) {
            arml = axyj.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.g;
        if ((axyj.a & 1) != 0) {
            arml = axyj.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        amuo j = amul.j();
        if ((axyj.a & 4) != 0) {
            arml = axyj.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if (a != null) {
            j.c(fpi.a(a));
        }
        if ((axyj.a & 2) != 0) {
            arml = axyj.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a = ajqy.a(arml);
        if (a != null) {
            j.c(fpi.a(a));
        }
        amul a2 = j.a();
        if (a2.isEmpty()) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.h.a(a2);
        }
        akvo akvo = this.c;
        View rootView = this.d.getRootView();
        ImageView imageView2 = this.i;
        if ((axyj.a & 32) != 0) {
            axak = axyj.g;
            if (axak == null) {
                axak = axak.a;
            }
        }
        akvo.a(rootView, imageView2, (auvn) ajzv.a(ajzv.a(axak), auvn.class), axyj, acvx.g);
        xpr.a(this.j, akor.a("isLastVideo", false) ^ 1);
    }
}
