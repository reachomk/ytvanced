package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.List;

/* renamed from: agub */
final /* synthetic */ class agub implements Runnable {
    private final aguc a;
    private final ajgu b;
    private final wxg c;

    agub(aguc aguc, ajgu ajgu, wxg wxg) {
        this.a = aguc;
        this.b = ajgu;
        this.c = wxg;
    }

    public final void run() {
        aguc aguc = this.a;
        Object obj = this.b;
        wxg wxg = this.c;
        try {
            ajis ajis = obj.a;
            ajis ajis2 = null;
            if (ajis == null || ajis.g != null) {
                ajis2 = ajis;
            } else {
                agvz b = aguc.a.b();
                wxf a = wxf.a();
                b.a(ajis.d, a);
                List<ajis> list = (List) a.get();
                if (list != null) {
                    for (ajis ajis3 : list) {
                        if (ajis3 != null && TextUtils.equals(ajis.h, ajis3.h) && TextUtils.equals(ajis.d, ajis3.d)) {
                            ajis2 = ajis3;
                            break;
                        }
                    }
                }
            }
            if (ajis2 != null) {
                aguc.b.a(new ajgu(ajis2), wxg);
            } else {
                wxg.a(obj, new IOException());
            }
        } catch (Exception e) {
            wxg.a(obj, e);
        }
    }
}
