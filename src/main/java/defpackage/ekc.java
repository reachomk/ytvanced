package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;

/* renamed from: ekc */
public final class ekc {
    public static final apxu a;

    public static apxu a(String str) {
        str = xvd.a(str);
        avnv avnv = (avnv) avnw.d.createBuilder();
        avnv.copyOnWrite();
        avnw avnw = (avnw) avnv.instance;
        if (str != null) {
            avnw.a |= 2;
            avnw.b = str;
            avnw avnw2 = (avnw) ((anxl) avnv.build());
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(OfflineEndpointOuterClass.offlineEndpoint, avnw2);
            return (apxu) ((anxl) apxx.build());
        }
        throw new NullPointerException();
    }

    public static boolean a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
        apxu.a(access$000);
        return apxu.h.a(access$000.d);
    }

    public static boolean a(apxu apxu, bcaa bcaa) {
        anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            if (ebm.b(((apge) obj).b)) {
                eki eki = (eki) bcaa.get();
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                apxu.a(access$000);
                Object b2 = apxu.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                if (eki.a(ebm.c(((apge) b2).b))) {
                    return true;
                }
            }
        }
        return false;
    }

    static {
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(DownloadsPageEndpointOuterClass.downloadsPageEndpoint, aqxw.c);
        a = (apxu) ((anxl) apxx.build());
    }
}
