package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: knv */
public final class knv implements akot {
    private final akkq a;
    private final View b;
    private final ImageView c = ((ImageView) this.b.findViewById(R.id.image));
    private final TextView d = ((TextView) this.b.findViewById(R.id.title));
    private final TextView e = ((TextView) this.b.findViewById(R.id.subtitle));
    private final TextView f = ((TextView) this.b.findViewById(R.id.button));
    private final akyu g;

    public knv(Context context, akkq akkq, akzb akzb, ViewGroup viewGroup) {
        this.a = akkq;
        this.b = LayoutInflater.from(context).inflate(R.layout.watch_metadata_app_promo, viewGroup, false);
        this.g = akzb.a(this.f);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.a.a(this.c);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        azju azju = (azju) obj;
        if ((azju.a & 1) == 0) {
            xpr.a(this.c, false);
        } else {
            xpr.a(this.c, true);
            akkq akkq = this.a;
            ImageView imageView = this.c;
            aygk aygk = azju.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
        }
        TextView textView = this.d;
        arml arml = azju.c;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.e;
        arml = azju.d;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(textView, ajqy.a(arml));
        aphj aphj = azju.e;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) == 0) {
            xpr.a(this.f, false);
            return;
        }
        xpr.a(this.f, true);
        akyu akyu = this.g;
        aphj aphj2 = azju.e;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        aphg aphg = aphj2.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        akyu.a(aphg, akor.a);
    }
}
