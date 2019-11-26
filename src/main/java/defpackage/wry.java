package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wry */
public final class wry extends akpl {
    private final akkq a;
    private final aaas b;
    private final akou c;
    private final akue d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final int h;
    private final int i;
    private final int j;

    public wry(Context context, akkq akkq, aaas aaas, wrx wrx, akuh akuh) {
        this.a = akkq;
        this.b = aaas;
        this.c = (akou) amqw.a((Object) wrx);
        this.h = xwe.a(context, R.attr.ytTextPrimary, 0);
        this.i = xwe.a(context, R.attr.ytTextSecondary, 0);
        this.j = xwe.a(context, R.attr.ytStaticBlue, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.music_key_promo_small_feature_item, null);
        this.e = (ImageView) inflate.findViewById(R.id.icon);
        this.f = (TextView) inflate.findViewById(R.id.header);
        this.g = (TextView) inflate.findViewById(R.id.description);
        this.d = akuh.a.a(this.f).a(this.h).b(this.g).b(this.i).c(this.j).b();
        wrx.a(inflate);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        avhi avhi = (avhi) obj;
        this.e.setVisibility((avhi.a & 1) == 0 ? 8 : 0);
        akkq akkq = this.a;
        ImageView imageView = this.e;
        aygk aygk = avhi.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.f;
        arml arml = avhi.c;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.g;
        apfb apfb = null;
        if ((avhi.a & 4) != 0) {
            arml = avhi.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.b, false));
        akue akue = this.d;
        if ((avhi.a & 8) != 0) {
            avhg avhg = avhi.e;
            if (avhg == null) {
                avhg = avhg.c;
            }
            if (avhg.a == 118483990) {
                apfb = (apfb) avhg.b;
            } else {
                apfb = apfb.f;
            }
        }
        akue.a(apfb);
        this.c.a(akor);
    }
}
