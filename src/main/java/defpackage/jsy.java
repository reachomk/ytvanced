package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* renamed from: jsy */
public final class jsy implements akot {
    public final aaas a;
    private final akkq b;
    private final akvo c;
    private final View d;
    private final ImageView e = ((ImageView) this.d.findViewById(R.id.thumbnail));
    private final TextView f = ((TextView) this.d.findViewById(R.id.duration));
    private final TextView g = ((TextView) this.d.findViewById(R.id.headline));
    private final TextView h = ((TextView) this.d.findViewById(R.id.view_count));
    private final ImageView i = ((ImageView) this.d.findViewById(R.id.contextual_menu_anchor));
    private final int j;

    public jsy(Context context, aaas aaas, akkq akkq, akvo akvo, ViewGroup viewGroup) {
        this.a = aaas;
        this.b = akkq;
        this.c = akvo;
        this.d = LayoutInflater.from(context).inflate(R.layout.compact_suggested_video, viewGroup, false);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.compact_suggested_video_last_video_spacing);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.b.a(this.e);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aqgn aqgn = (aqgn) obj;
        this.d.setOnClickListener(new jtb(this, aqgn));
        View view = this.d;
        int j = abe.j(view);
        int paddingTop = this.d.getPaddingTop();
        int k = abe.k(this.d);
        int i = 0;
        if (akor.a("isLastVideo", false)) {
            i = this.j;
        }
        abe.a(view, j, paddingTop, k, i);
        akkq akkq = this.b;
        ImageView imageView = this.e;
        aygk aygk = aqgn.d;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.f;
        arml arml2 = null;
        if ((aqgn.a & 8) != 0) {
            arml = aqgn.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.g;
        if ((aqgn.a & 1) != 0) {
            arml = aqgn.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.h;
        if ((aqgn.a & 2) != 0) {
            arml2 = aqgn.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml2));
        akvo akvo = this.c;
        View rootView = this.d.getRootView();
        ImageView imageView2 = this.i;
        anxp anxp = aqgn.f;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(MenuRendererOuterClass.menuRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        akvo.a(rootView, imageView2, (auvn) b, aqgn, acvx.g);
    }
}
