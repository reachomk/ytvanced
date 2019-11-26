package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kmr */
public final class kmr extends akpl {
    public final aaas a;
    public ayxd b;
    public acvx c;
    private final View d;
    private final TextView e = ((TextView) this.d.findViewById(R.id.vdp_offer_title));
    private final TextView f = ((TextView) this.d.findViewById(R.id.vdp_offer_description));
    private final Button g = ((Button) this.d.findViewById(R.id.vdp_offer_purchase_button));

    public kmr(Context context, aaas aaas) {
        this.a = aaas;
        this.d = View.inflate(context, R.layout.vdp_upsell_offer, null);
        this.g.setOnClickListener(new kmq(this));
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.b = null;
        this.c = null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        TextView textView;
        arml arml;
        this.b = (ayxd) amqw.a((ayxd) obj);
        ayxd ayxd = this.b;
        if ((ayxd.a & 1) != 0) {
            textView = this.e;
            arml = ayxd.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        ayxd = this.b;
        if ((ayxd.a & 2) != 0) {
            textView = this.f;
            arml = ayxd.c;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        ayxd = this.b;
        if ((ayxd.a & 4) != 0) {
            Button button = this.g;
            aphj aphj = ayxd.d;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 128) == 0) {
                arml = null;
            } else {
                aphj = this.b.d;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            button.setText(ajqy.a(arml));
        }
        this.c = akor.a;
    }
}
