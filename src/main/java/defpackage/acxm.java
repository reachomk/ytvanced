package defpackage;

import android.os.Bundle;

/* renamed from: acxm */
public final class acxm {
    public Bundle a = null;

    public static apxu a(Bundle bundle) {
        if (bundle != null) {
            String str = "tracking_interaction_parent_csn";
            if (bundle.containsKey(str)) {
                apxx apxx = (apxx) apxu.d.createBuilder();
                avjh avjh = (avjh) avjf.h.createBuilder();
                str = bundle.getString(str);
                if (str != null) {
                    avjh.a(str);
                }
                str = "tracking_interaction_parent_ve";
                if (bundle.containsKey(str)) {
                    avjh.a(bundle.getInt(str));
                }
                str = "tracking_interaction_click_tracking_params";
                if (bundle.containsKey(str)) {
                    byte[] byteArray = bundle.getByteArray(str);
                    if (byteArray != null) {
                        apxx.a(anvu.a(byteArray));
                    } else {
                        apxx.a();
                    }
                }
                apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
                return (apxu) ((anxl) apxx.build());
            }
        }
        return null;
    }

    public static Bundle a(acvx acvx) {
        Bundle bundle = null;
        if (acvx != null) {
            acwp c = acvx.c();
            if (c != null) {
                bundle = new Bundle();
                bundle.putString("tracking_interaction_parent_csn", c.a);
                acwl acwl = c.e;
                if (acwl != null) {
                    bundle.putInt("tracking_interaction_parent_ve", acwl.aH);
                }
            }
        }
        return bundle;
    }

    public static Bundle a(apxu apxu) {
        Bundle bundle = null;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(avjd.b);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(avjd.b);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                avjf avjf = (avjf) obj;
                if ((avjf.a & 1) != 0) {
                    bundle = new Bundle();
                    bundle.putString("tracking_interaction_parent_csn", avjf.b);
                    int i = avjf.c;
                    if (i > 0) {
                        bundle.putInt("tracking_interaction_parent_ve", i);
                    }
                    if ((apxu.a & 1) != 0) {
                        bundle.putByteArray("tracking_interaction_click_tracking_params", apxu.b.d());
                    }
                }
            }
        }
        return bundle;
    }
}
