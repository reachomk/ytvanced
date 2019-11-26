package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: wlx */
public final class wlx {
    public final akmx a;
    public akor b;
    private final Map c = new WeakHashMap();

    public wlx(akmx akmx) {
        this.a = akmx;
    }

    public final aphv a(String str, ajsh ajsh, boolean z) {
        aphj aphj = ajsh.a;
        aphv aphv = null;
        if (!(aphj == null || (aphj.a & 2) == 0)) {
            aphv = aphj.c;
            if (aphv == null) {
                aphv = aphv.s;
            }
        }
        return (aphv) a(wlx.c(str), (Object) aphv, ajsh.e, z);
    }

    public final aphv b(String str, ajsh ajsh, boolean z) {
        aphj aphj = ajsh.c;
        aphv aphv = null;
        if (!(aphj == null || (aphj.a & 2) == 0)) {
            aphv = aphj.c;
            if (aphv == null) {
                aphv = aphv.s;
            }
        }
        return (aphv) a(wlx.d(str), (Object) aphv, ajsh.e, z);
    }

    public final apzc a(ajsn ajsn, boolean z) {
        ajrn ajrn = ajsn.k;
        awly awly = ajrn != null ? ajrn.d : null;
        if (awly == null || ajsn.u == apzc.COMMENT_POLL_STATUS_UNKNOWN) {
            return ajsn.u;
        }
        return (apzc) a(wlx.b(ajsn.g), ajsn.u, awly.i, z);
    }

    public final void a(String str, long j, aphv aphv, aphv aphv2) {
        if (j != 0) {
            if (aphv != null) {
                this.a.b(wlx.c(str), new wlz(aphv, j));
            }
            if (aphv2 != null) {
                this.a.b(wlx.d(str), new wlz(aphv2, j));
            }
        }
    }

    public final void a(String str, awly awly) {
        if (awly != null && awly.i != 0) {
            this.a.b(wlx.a(str), new wlz(awly, awly.i));
        }
    }

    public final void a(String str, long j, apzc apzc) {
        if (j != 0 && apzc != apzc.COMMENT_POLL_STATUS_UNKNOWN) {
            this.a.b(wlx.b(str), new wlz(apzc, j));
        }
    }

    public final void a(Uri uri, wmc wmc) {
        akmz wma = new wma(this, wmc);
        this.a.a(uri, wma);
        this.c.put(wmc, wma);
    }

    public final void a(wmc wmc) {
        akmz akmz = (akmz) this.c.remove(wmc);
        if (akmz != null) {
            this.a.a(akmz);
        }
    }

    public final Object a(Uri uri, Object obj, long j, boolean z) {
        if (!(obj == null || j == 0)) {
            wlz wlz = (wlz) this.a.a(uri);
            if (wlz != null && wlz.b >= j) {
                return wlz.a;
            }
            if ((wlz == null && z) || (wlz != null && wlz.b < j)) {
                this.a.a(uri, new wlz(obj, j));
            }
        }
        return obj;
    }

    private static Uri c(String str) {
        return akmx.a(1, "comment", str, "like_button");
    }

    private static Uri d(String str) {
        return akmx.a(1, "comment", str, "dislike_button");
    }

    public static Uri a(String str) {
        return akmx.a(1, "comment", str, "poll_renderer");
    }

    public static Uri b(String str) {
        return akmx.a(1, "comment", str, "poll_status");
    }
}
