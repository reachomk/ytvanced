package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

/* renamed from: hjr */
public final class hjr implements hic {
    public final hia a;
    public final hif b;
    private final bcaa c;
    private final hmi d;
    private final xci e;

    public hjr(Context context, bcaa bcaa, hih hih, ahcn ahcn, aaas aaas, acwa acwa, xci xci, OfflineArrowView offlineArrowView) {
        this.e = xci;
        this.c = bcaa;
        this.a = hih.a(this);
        this.b = new hid(context, this.a, ahcn, bcaa, new hjq(acwa), aaas);
        this.d = hml.a(offlineArrowView, new hjt(this));
    }

    public final void a(String str, avsj avsj) {
        this.e.a(this.a);
        this.a.a(avsj);
        this.a.c = str;
        a(hjr.a(str, (agwc) this.c.get()), avsj);
    }

    public final void b() {
        this.e.b(this.a);
    }

    public static agqy a(String str, agwc agwc) {
        if (agwc == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return agwc.b().k().a(str);
    }

    public final void aC_() {
        this.d.c();
    }

    public final void a(agqy agqy, avsj avsj) {
        if (!hjr.b(agqy, avsj)) {
            this.d.b.setVisibility(8);
        } else if (agqy == null || hia.a(agqy)) {
            this.d.a(true);
            this.d.a(agqy);
        } else {
            this.d.a(false);
            this.d.a();
        }
    }

    public final void a(agqy agqy) {
        this.d.a(true);
        this.d.a(agqy);
    }

    public static boolean b(agqy agqy, avsj avsj) {
        boolean z = true;
        if (!hia.a(agqy)) {
            if (avsj == null) {
                z = false;
            } else if (avsj.b) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }
}
