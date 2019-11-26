package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: fix */
public final class fix {
    public static boolean a(apxu apxu) {
        String b = fix.b(apxu);
        String str = null;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                anxr access$0002 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                apxu.a(access$0002);
                Object b2 = apxu.h.b(access$0002.d);
                if (b2 == null) {
                    obj = access$0002.b;
                } else {
                    obj = access$0002.a(b2);
                }
                str = ((apge) obj).i;
            }
        }
        boolean z = false;
        if (b == null && str == null) {
            return false;
        }
        anxr access$0003 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        apxu.a(access$0003);
        Object b3 = apxu.h.b(access$0003.d);
        if (b3 == null) {
            b3 = access$0003.b;
        } else {
            b3 = access$0003.a(b3);
        }
        String str2 = ((apge) b3).c;
        if (b != null && (fix.a(b) || (str != null && fix.a(str)))) {
            if (!"FEtrending".equals(b)) {
                z = true;
            } else if (TextUtils.isEmpty(str2)) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    private static boolean a(String str) {
        return "FEshared".equals(str) || "FElibrary".equals(str) || "FEoffline_what_to_watch".equals(str) || "FEsubscriptions".equals(str) || "FEtrending".equals(str) || "FEwhat_to_watch".equals(str) || "FEactivity".equals(str) || "FEexplore".equals(str);
    }

    public static String a(fiw fiw) {
        return fiw != null ? fix.b(fiw.a()) : null;
    }

    public static String b(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                return ((apge) b).b;
            }
        }
        return null;
    }
}
