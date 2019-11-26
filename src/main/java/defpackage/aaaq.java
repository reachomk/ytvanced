package defpackage;

import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: aaaq */
public final class aaaq implements aaai {
    public final boolean a(apxu apxu, apxu apxu2) {
        Object b;
        Object b2;
        anxr access$000 = anxl.checkIsLite(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                return true;
            }
        }
        access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        apxu.a(access$000);
        boolean z = false;
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                apge apge = (apge) b;
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                apxu2.a(access$000);
                b2 = apxu2.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                apge apge2 = (apge) b2;
                if (apge.b.equals(apge2.b) && apge.e == apge2.e && apge.c.equals(apge2.c)) {
                    return true;
                }
                return false;
            }
        }
        access$000 = anxl.checkIsLite(OfflineEndpointOuterClass.offlineEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(OfflineEndpointOuterClass.offlineEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                return true;
            }
        }
        access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                axcv axcv = (axcv) b;
                access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
                apxu2.a(access$000);
                b2 = apxu2.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                axcv axcv2 = (axcv) b2;
                if (axcv.b.equals(axcv2.b) && axcv.c.equals(axcv2.c)) {
                    return true;
                }
                return false;
            }
        }
        access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                String str = ((ayvl) b).b;
                access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                apxu2.a(access$000);
                b2 = apxu2.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                return str.equals(((ayvl) b2).b);
            }
        }
        access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                azje azje = (azje) b;
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu2.a(access$000);
                b2 = apxu2.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                azje azje2 = (azje) b2;
                if (azje.e.equals(azje2.e) && azje.j.equals(azje2.j) && Float.compare(azje.h, azje2.h) == 0 && Float.compare(azje.g, azje2.g) == 0 && azje.f == azje2.f && azje.d == azje2.d && azje.b.equals(azje2.b) && azje.c.equals(azje2.c)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
