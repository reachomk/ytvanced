package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: knx */
public final class knx implements akot {
    public azna a;
    private final TextView b;

    public knx(Context context, kny kny) {
        this.b = (TextView) View.inflate((Context) amqw.a((Object) context), R.layout.ypc_offers_coupon_item, null);
        amqw.a((Object) kny);
        this.b.setOnClickListener(new knw(this, kny));
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.a = null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        azns azns = (azns) obj;
        TextView textView = this.b;
        azna azna = null;
        if ((azns.a & 8) != 0) {
            arml = azns.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        aznq aznq = azns.f;
        if (aznq == null) {
            aznq = aznq.c;
        }
        if ((aznq.a & 1) != 0) {
            aznq = azns.f;
            if (aznq == null) {
                aznq = aznq.c;
            }
            azna = aznq.b;
            if (azna == null) {
                azna = azna.e;
            }
        }
        this.a = azna;
    }
}
