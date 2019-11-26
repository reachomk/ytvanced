package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ipf */
public final class ipf implements akot {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final flu d;
    private final ipe e;
    private final acvx f;
    private final fnb g;

    public ipf(Context context, akpe akpe, akvz akvz, acwa acwa, flu flu, zyw zyw, fna fna) {
        if (!wvl.a(zyw)) {
            context = xuv.a(context, null, R.style.f516Theme.YouTube.Dark);
            flu.a(xwe.a(context, R.attr.ytSeparator, 0));
        }
        this.d = flu;
        this.a = LayoutInflater.from(context).inflate(R.layout.red_carpet_shelf, null);
        this.b = (TextView) this.a.findViewById(R.id.shelf_title);
        this.c = (TextView) this.a.findViewById(R.id.shelf_subtitle);
        this.g = fna.a((TextView) this.a.findViewById(R.id.shelf_view_all_button));
        RecyclerView recyclerView = (RecyclerView) this.a.findViewById(R.id.shelf_supported_renderers);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.a(new ans(1, false));
        recyclerView.a(new iph(context.getResources()));
        this.f = acwa.t();
        this.e = new ipe(recyclerView, akpe, akvz, acwa);
        this.d.a(this.a);
    }

    public final View K_() {
        return this.d.b;
    }

    public final void a(akpb akpb) {
        this.e.a.clear();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ajzo ajzo = (ajzo) obj;
        xpr.a(this.b, ajqy.a(ajzo.a));
        this.b.setContentDescription(ajqy.b(ajzo.a));
        xpr.a(this.c, ajqy.a(ajzo.b));
        this.c.setContentDescription(ajqy.b(ajzo.b));
        this.g.a((aphg) ajzv.a(ajzo.e, aphg.class), akor.a, null);
        this.e.a.clear();
        this.e.a(ajzo.c);
        this.f.a(ajzo.d, null);
        ajzn[] ajznArr = ajzo.c;
        int i = 1;
        int i2 = 0;
        if (ajznArr != null && ajznArr.length > 0) {
            ajzm ajzm = ajznArr[0].b;
            if (ajzm != null) {
                awvh[] awvhArr = ajzm.a;
                if (awvhArr != null && awvhArr.length > 0 && awvhArr[0].a == 138945852) {
                    i2 = 1;
                }
            }
        }
        if (i2 == 0) {
            i = 2;
        }
        flv.a(akor, i);
        this.d.a(akor);
    }
}
