package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: allv */
final /* synthetic */ class allv implements OnClickListener {
    private final alls a;

    allv(alls alls) {
        this.a = alls;
    }

    public final void onClick(View view) {
        alls alls = this.a;
        aomm aomm = alls.c;
        if (aomm != null) {
            int i = aomm.b;
            apxu apxu = i == 3 ? (apxu) aomm.c : i != 4 ? null : (apxu) aomm.c;
            if (apxu != null) {
                if ((aomm.a & 32) != 0) {
                    alls.d.a(3, new acvs(aomm.f), null);
                }
                alls.b.a(apxu, amur.e().b("com.google.android.libraries.youtube.innertube.endpoint.tag", alls.c).b("permission_requester", alls.a).b("interaction_logger_override", alls.d).b());
            }
        }
    }
}
