package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: hoq */
public final class hoq extends hnk {
    private final Context a;

    public hoq(Context context) {
        super(ajta.class);
        this.a = context;
    }

    private final arml a(int i) {
        return ajqy.a(this.a.getString(i));
    }

    public final /* synthetic */ Object a() {
        ajta ajta = new ajta();
        ajta.b = a(R.string.habanero_entry_point_title);
        ajta.c = a(R.string.habanero_entry_point_subtitle);
        arwe arwe = (arwe) arwf.c.createBuilder();
        arwe.a(arwh.OFFLINE_COMMUTE);
        ajta.j = (arwf) ((anxl) arwe.build());
        aphm aphm = (aphm) aphj.d.createBuilder();
        aphf aphf = (aphf) aphg.s.createBuilder();
        aphf.a(a(R.string.habanero_entry_point_cta_button));
        aphf.a(14);
        apxx apxx = (apxx) apxu.d.createBuilder();
        anxr anxr = BrowseEndpointOuterClass.browseEndpoint;
        apgd apgd = (apgd) apge.j.createBuilder();
        apgd.a("FEcommute_onboarding_recs");
        apxx.a(anxr, (apge) ((anxl) apgd.build()));
        aphf.copyOnWrite();
        aphg aphg = (aphg) aphf.instance;
        aphg.n = (apxu) ((anxl) apxx.build());
        aphg.a |= 8192;
        aphm.a(aphf);
        ajta.f = (aphj) ((anxl) aphm.build());
        return ajta;
    }
}
