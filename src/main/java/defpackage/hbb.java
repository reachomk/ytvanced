package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint;

/* renamed from: hbb */
final /* synthetic */ class hbb implements xar {
    private final haz a;

    hbb(haz haz) {
        this.a = haz;
    }

    public final void accept(Object obj) {
        haz haz = this.a;
        ajvi ajvi = (ajvi) obj;
        abuw abuw = haz.b;
        if (abuw != null) {
            abuw.b();
        }
        hau hau = haz.a;
        ajun ajun = ajvi.a;
        if (ajun != null) {
            ajuo ajuo = ajun.a;
            if (ajuo != null) {
                axyq b = hcm.b(ajuo);
                if (b != null) {
                    ajuo ajuo2 = ajun.a;
                    String str = ajuo2 != null ? ajuo2.a : null;
                    lui lui = hau.b.a;
                    if (lui == null || hau.h.c) {
                        hau.j = new abxm(hau.a, hau.g);
                        abxm abxm = hau.j;
                        abxm.d.a(b);
                        ((ViewGroup) abxm.findViewById(R.id.sticker_bottom_sheet_container)).addView(abxm.d.b);
                        abxm.show();
                        hau.d.a(new acvs(ajvi.b), null);
                        hau.c.a(hau);
                    } else if (!TextUtils.isEmpty(str)) {
                        len g = lui.g();
                        leh a = g.a(str);
                        if (a instanceof lfm) {
                            ((lfm) a).a(ajuo);
                        } else {
                            g.a(ajun);
                        }
                        apxx apxx = (apxx) apxu.d.createBuilder();
                        axlo axlo = (axlo) ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.c.createBuilder();
                        axlo.copyOnWrite();
                        ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint = (ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint) axlo.instance;
                        if (str != null) {
                            showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.a |= 1;
                            showEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.b = str;
                            apxx.a(ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.showEngagementPanelNavigationEndpoint, (ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint) ((anxl) axlo.build()));
                            hau.i.a((apxu) ((anxl) apxx.build()), amur.a("engagement_panel_id_key", "live-chat-item-section"));
                            hau.d.a(new acvs(ajvi.b), null);
                            hau.c.a(hau);
                            return;
                        }
                        throw new NullPointerException();
                    }
                }
            }
        }
    }
}
