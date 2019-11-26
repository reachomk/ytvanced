package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kmo */
public final class kmo extends akpl {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.vdp_upsell_title));
    private final TextView c = ((TextView) this.a.findViewById(R.id.vdp_upsell_description));
    private final ImageView d = ((ImageView) this.a.findViewById(R.id.vdp_upsell_carrier_logo));
    private final akkq e;
    private ayxb f;

    public kmo(Context context, akkq akkq) {
        this.e = (akkq) amqw.a((Object) akkq);
        this.a = View.inflate(context, R.layout.vdp_upsell_header, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        TextView textView;
        arml arml;
        this.f = (ayxb) amqw.a((ayxb) obj);
        ayxb ayxb = this.f;
        if ((ayxb.a & 1) != 0) {
            textView = this.b;
            arml = ayxb.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        ayxb = this.f;
        if ((ayxb.a & 2) != 0) {
            textView = this.c;
            arml = ayxb.c;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        ayxb = this.f;
        if ((ayxb.a & 4) != 0) {
            akkq akkq = this.e;
            ImageView imageView = this.d;
            aygk aygk = ayxb.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
        }
    }
}
