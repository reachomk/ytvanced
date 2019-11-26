package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kwa */
public final class kwa implements akot {
    public aogr a;
    private final akkq b;
    private final vod c;
    private final ajqw d;
    private final View e;
    private final ImageView f = ((ImageView) this.e.findViewById(R.id.icon));
    private final TextView g = ((TextView) this.e.findViewById(R.id.text));
    private akko h;

    public kwa(Context context, akkq akkq, vod vod, aaas aaas) {
        this.b = akkq;
        this.c = vod;
        ajqv a = ajqw.a();
        a.a = context;
        a.c = new akta(aaas);
        this.d = a.a();
        this.e = LayoutInflater.from(context).inflate(R.layout.ad_clickable_icon_section, null, false);
        this.e.setOnClickListener(new kwd(this, vod, aaas));
    }

    public final View K_() {
        return this.e;
    }

    public final void a(akpb akpb) {
        this.c.b(this.a);
        this.a = null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aogr aogr = (aogr) obj;
        this.a = aogr;
        boolean z = true;
        xpr.a(this.e, true);
        arml arml = null;
        akor.a.a(aogr.e.d(), null);
        if (this.h == null) {
            this.h = akko.h().a(true).a(new kwc()).a();
        }
        akkq akkq = this.b;
        ImageView imageView = this.f;
        aygk aygk = aogr.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk, this.h);
        View view = this.f;
        if ((aogr.a & 1) == 0) {
            z = false;
        }
        xpr.a(view, z);
        TextView textView = this.g;
        if ((aogr.a & 2) != 0) {
            arml = aogr.c;
            if (arml == null) {
                arml = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml, this.d));
    }
}
