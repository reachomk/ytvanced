package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: hhg */
final class hhg implements OnSharedPreferenceChangeListener {
    private final /* synthetic */ hhe a;

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        hhb hhb = (hhb) this.a.d.get();
        hpr hpr = (hpr) this.a.e.get();
        if ("offline_recs_enabled".equals(str)) {
            hhe hhe = this.a;
            boolean f = ((hgy) hhe.c.get()).f();
            aqxt aqxt = (aqxt) aqxr.c.createBuilder();
            aqxt.copyOnWrite();
            aqxr aqxr = (aqxr) aqxt.instance;
            aqxr.a |= 1;
            aqxr.b = f;
            aqxr aqxr2 = (aqxr) ((anxl) aqxt.build());
            asmz asmz = (asmz) asmw.f.createBuilder();
            asmz.copyOnWrite();
            asmw asmw = (asmw) asmz.instance;
            if (aqxr2 != null) {
                asmw.c = aqxr2;
                asmw.b = 228;
                hhe.f.a((asmw) ((anxl) asmz.build()));
                hhb.a();
                return;
            }
            throw new NullPointerException();
        }
        String str2 = "main_app_auto_offline_storage_limit_megabytes_%s";
        if (hpr.f.c() != afpt.g) {
            str2 = xuq.a(str2, hpr.f.c().a());
        }
        if (str2.equals(str)) {
            hpr.c.b().o().a(hpr.a, avrp.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_IN_ORDER_DEDUPE, hpr.a(hpr.e.getLong(ebn.AUTO_OFFLINE_LAST_SYNC_MINIMUM_UNUSED_BYTES, 0)));
        }
    }

    /* synthetic */ hhg(hhe hhe) {
        this.a = hhe;
    }
}
