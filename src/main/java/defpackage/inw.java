package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.red.presenter.CompactYpcOfferModuleView;
import com.google.android.youtube.R;

/* renamed from: inw */
public final class inw extends akpl {
    private final CompactYpcOfferModuleView a;
    private final akou b;
    private final fnb c;
    private final aaas d;

    public inw(Context context, flu flu, aaas aaas, fna fna) {
        amqw.a((Object) context);
        amqw.a((Object) aaas);
        this.b = (akou) amqw.a((Object) flu);
        this.d = aaas;
        this.a = (CompactYpcOfferModuleView) LayoutInflater.from(context).inflate(R.layout.compact_ypc_offer_module_custom_view, null);
        this.c = fna.a(this.a.c);
        flu.a(this.a);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b.a();
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        obj = (aqfq) obj;
        aabd.a(this.d, obj.g, obj);
        TextView textView = this.a.a;
        aphg aphg = null;
        if (textView != null) {
            if ((obj.a & 2) != 0) {
                arml = obj.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
        }
        textView = this.a.b;
        if (textView != null) {
            if ((obj.a & 4) != 0) {
                arml = obj.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
        }
        if (this.a.c != null) {
            fnb fnb = this.c;
            aphj aphj = obj.e;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                aphj aphj2 = obj.e;
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
        this.b.a(akor);
    }
}
