package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kah */
public final class kah extends akpl {
    private final akou a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.tip_card_title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.tip_card_message));
    private final fnb e;
    private appy f;

    public kah(Context context, flu flu, fna fna) {
        this.a = (akou) amqw.a((Object) flu);
        this.b = View.inflate(context, R.layout.channel_tip_card_item, null);
        this.e = fna.a((TextView) this.b.findViewById(R.id.tip_button));
        flu.a(this.b);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        appy appy = (appy) obj;
        if (this.f == appy) {
            this.a.a(akor);
            return;
        }
        arml arml;
        this.f = appy;
        TextView textView = this.c;
        aphg aphg = null;
        if ((appy.a & 1) != 0) {
            arml = appy.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        if ((appy.a & 2) != 0) {
            arml = appy.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        if (!(this.c.getVisibility() == 8 || this.d.getVisibility() == 8)) {
            fnb fnb = this.e;
            aphj aphj = appy.d;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                aphj aphj2 = appy.d;
                if (aphj2 == null) {
                    aphj2 = aphj.d;
                }
                aphg = aphj2.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
            }
            fnb.a(aphg, akor.a);
        }
        this.a.a(akor);
    }
}
