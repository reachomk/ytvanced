package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: adno */
final /* synthetic */ class adno implements Runnable {
    private final adnm a;
    private final String b;
    private final adpw c;

    adno(adnm adnm, String str, adpw adpw) {
        this.a = adnm;
        this.b = str;
        this.c = adpw;
    }

    public final void run() {
        adnm adnm = this.a;
        String str = this.b;
        adpw adpw = this.c;
        if (!str.equals(((aizy) adnm.a.e.get()).m())) {
            aizy aizy = (aizy) adnm.a.e.get();
            apxx apxx = (apxx) apxu.d.createBuilder();
            azjd azjd = (azjd) azje.r.createBuilder();
            azjd.a(adpw.a());
            String e = adpw.e();
            if (e != null) {
                azjd.b(e);
            }
            apxx.a(WatchEndpointOuterClass.watchEndpoint, (azje) ((anxl) azjd.build()));
            aiqs a = aiqq.a();
            a.a = (apxu) ((anxl) apxx.build());
            a.a();
            aiqq b = a.b();
            String.valueOf(b).length();
            aizy.a(b);
        }
        adnh adnh = adnm.a;
        adnh.j = false;
        if (!TextUtils.isEmpty(adnh.k)) {
            adnh = adnm.a;
            adnh.a(adnh.k);
            adnm.a.k = null;
        }
    }
}
