package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: wob */
public final class wob implements akot {
    public final View a;
    private final akzb b;
    private final LayoutInflater c;
    private final TextView d = ((TextView) this.a.findViewById(R.id.title));
    private final TextView e = ((TextView) this.a.findViewById(R.id.subtitle));
    private final ViewGroup f = ((ViewGroup) this.a.findViewById(R.id.offers_container));

    public wob(Context context, akzb akzb, ViewGroup viewGroup) {
        this.b = akzb;
        this.c = LayoutInflater.from(context);
        this.a = this.c.inflate(R.layout.offer_group_layout, viewGroup, false);
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, ayjf ayjf) {
        TextView textView = this.d;
        arml arml = ayjf.b;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.e;
        arml = ayjf.c;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        for (axak axak : ayjf.d) {
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                TextView textView2 = (TextView) this.c.inflate(R.layout.offer_button, this.f, false);
                akyy a = this.b.a(textView2);
                anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                axak.a(access$0002);
                Object b = axak.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                a.a((aphg) b, akor.a);
                this.f.addView(textView2);
            }
        }
    }

    public final void a(akpb akpb) {
        this.f.removeAllViews();
    }
}
