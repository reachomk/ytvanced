package defpackage;

import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ilx */
public final class ilx implements imj {
    private final abgc a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final Map f = new HashMap();

    public ilx(abgc abgc) {
        this.a = abgc;
        this.b = 6;
        this.e = 3;
        this.c = 8000;
        this.d = 3000;
    }

    public final boolean a(apxu apxu, afsw afsw) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) obj;
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.size() == 0) {
            return false;
        }
        int a = awhp.a(((awhn) playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.get(0)).b);
        if (a == 0 || a != 3) {
            a = awhp.a(((awhn) playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.get(0)).b);
            if (a == 0 || a != 11) {
                return false;
            }
        }
        b(playlistEditEndpointOuterClass$PlaylistEditEndpoint.b).a(apxu, afsw);
        return true;
    }

    public final void a(String str, String str2, String str3, afsw afsw) {
        ima b = b(str);
        b.a(new imd(b, str2, str3, afsw));
    }

    public final void a(String str) {
        b(str).a();
    }

    private final ima b(String str) {
        if (!this.f.containsKey(str)) {
            this.f.put(str, new ima(this.a, str, this.b, this.e, this.c, this.d));
        }
        return (ima) this.f.get(str);
    }
}
