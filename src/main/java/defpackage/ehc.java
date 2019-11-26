package defpackage;

import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;

/* renamed from: ehc */
public final class ehc implements aaai {
    public final boolean a(apxu apxu, apxu apxu2) {
        Object b;
        Object b2;
        anxr access$000 = anxl.checkIsLite(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                String str = ((PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint) b).b;
                access$000 = anxl.checkIsLite(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint);
                apxu2.a(access$000);
                b2 = apxu2.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                return str.equals(((PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint) b2).b);
            }
        }
        access$000 = anxl.checkIsLite(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                int a = aqxx.a(((aqxw) b).b);
                if (a == 0) {
                    a = 1;
                }
                anxr access$0002 = anxl.checkIsLite(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
                apxu2.a(access$0002);
                b2 = apxu2.h.b(access$0002.d);
                if (b2 == null) {
                    b2 = access$0002.b;
                } else {
                    b2 = access$0002.a(b2);
                }
                int a2 = aqxx.a(((aqxw) b2).b);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a == a2) {
                    return true;
                }
            }
        }
        return false;
    }
}
