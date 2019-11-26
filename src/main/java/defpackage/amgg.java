package defpackage;

import android.text.TextUtils;
import android.util.Pair;

/* renamed from: amgg */
final /* synthetic */ class amgg implements anim {
    private final amgb a;
    private final azzh b;

    amgg(amgb amgb, azzh azzh) {
        this.a = amgb;
        this.b = azzh;
    }

    public final anjv a(Object obj) {
        amgb amgb = this.a;
        azzh azzh = this.b;
        azzl azzl = (azzl) obj;
        if (azzl.a()) {
            throw new bqe(azzl.a);
        } else if (azzl.b()) {
            azyp azyp = azzl.b;
            int i = azyp.a;
            if (i >= 0) {
                azyn azyn = azyp.b;
                if (azyn != null) {
                    String b = azyn.b("X-Goog-Upload-Status");
                    if ("cancelled".equals(b)) {
                        throw new bql(amgb.a(i, azyn, new byte[0]));
                    } else if ("final".equals(b) && i != 200) {
                        throw new bql(amgb.a(i, azyn, new byte[0]));
                    } else if (TextUtils.isEmpty(b)) {
                        throw new bqe(amgb.a(i, azyn, new byte[0]));
                    } else if (i == 200) {
                        String b2 = azyn.b("X-Goog-Upload-Header-Scotty-Resource-Id");
                        String e = azzh.e();
                        if (TextUtils.isEmpty(b2) || TextUtils.isEmpty(e)) {
                            throw new bql(amgb.a(200, azyn, new byte[0]));
                        }
                        Pair pair = new Pair(b2, e);
                        return anjf.a(amgb.a(amjq.a(), true, new amgf((String) pair.first, (String) pair.second)));
                    } else {
                        throw new bqe(amgb.a(i, azyn, new byte[0]));
                    }
                }
                throw new AssertionError("Null response headers");
            }
            throw new bqe();
        } else {
            throw new bqe();
        }
    }
}
