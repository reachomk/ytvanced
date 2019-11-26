package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hid */
public class hid implements hif {
    public final Context a;
    private final bcaa b;
    private final hia c;
    private final ahcn d;
    private final bcaa e;
    private final aaas f;

    public hid(Context context, hia hia, ahcn ahcn, bcaa bcaa, bcaa bcaa2, aaas aaas) {
        this.a = context;
        this.d = ahcn;
        this.b = bcaa;
        this.f = aaas;
        this.e = bcaa2;
        this.c = hia;
    }

    public void a(String str) {
        if (!b(str)) {
            if (TextUtils.isEmpty(str)) {
                xpr.a(this.a, (int) R.string.add_video_to_offline_error, 1);
                return;
            }
            a(str, this.c.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(String str) {
        if (this.f != null) {
            hia hia = this.c;
            aphg aphg = hia != null ? hia.b : null;
            if (!(aphg == null || (aphg.a & 2048) == 0)) {
                apxu apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                Map hashMap = new HashMap();
                hashMap.put("YpcGetOfflineUpsellResponse_videoIdKey", str);
                this.f.a(apxu, hashMap);
                anxr access$000 = anxl.checkIsLite(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, avsj avsj) {
        agqy a = ((agwc) this.b.get()).b().k().a(str);
        if (a == null || a.i()) {
            this.d.a(str, avsj, this.c, (acvx) this.e.get());
            return;
        }
        if (hia.a(a)) {
            this.d.a(str, true);
        } else if (a.v()) {
            if (a.w()) {
                this.d.a(null, str, this.c, true);
            } else if (a.s()) {
                xpr.a(this.a, (int) R.string.add_video_to_offline_error, 1);
            } else if (a.t()) {
                agqw agqw = a.j;
                if (agqw.c()) {
                    this.d.a(agqw, true);
                    return;
                }
                Object a2 = agqw.a();
                if (a2 != null) {
                    this.d.a(str, a2, (acvx) this.e.get());
                }
            } else {
                this.d.a(str, true);
            }
        }
    }
}
