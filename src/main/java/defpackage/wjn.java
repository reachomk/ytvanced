package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: wjn */
public final class wjn implements akot {
    public final aaas a;
    public axql b;
    public aoa c;
    public wfb d;
    public Map e;
    private final akvp f;
    private final View g;
    private final TextView h = ((TextView) this.g.findViewById(R.id.text));
    private final TextView i = ((TextView) this.g.findViewById(R.id.subtitle));
    private final ImageView j = ((ImageView) this.g.findViewById(R.id.icon));

    public wjn(Context context, akvp akvp, aaas aaas) {
        amqw.a((Object) context);
        this.f = (akvp) amqw.a((Object) akvp);
        this.a = (aaas) amqw.a((Object) aaas);
        this.g = View.inflate(context, R.layout.sort_filter_sub_menu_item, null);
        this.g.setOnClickListener(new wjm(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.g;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        axql axql = (axql) obj;
        if (axql != null) {
            this.b = axql;
            obj = akor.a("sortFilterMenu");
            this.c = obj instanceof aoa ? (aoa) obj : null;
            akor.a("sortFilterMenuModel");
            this.d = (wfb) akor.a("sortFilterContinuationHandler");
            this.e = (Map) akor.b("sortFilterEndpointArgsKey", null);
            this.h.setText(this.b.d);
            xpr.a(this.i, this.b.e);
            axql axql2 = this.b;
            if ((axql2.a & 64) == 0) {
                this.j.setImageDrawable(null);
                this.j.setVisibility(8);
                return;
            }
            ImageView imageView = this.j;
            akvp akvp = this.f;
            arwf arwf = axql2.g;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            imageView.setImageResource(akvp.a(a));
            this.j.setVisibility(0);
        }
    }
}
