package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import java.util.Map;

/* renamed from: dzi */
public final class dzi implements aaap {
    public final aaas a;
    public final xoi b;
    public final hpy c;
    private final abgc d;
    private final Activity e;
    private final afpu f;
    private final afqe g;
    private final imj h;

    public dzi(abgc abgc, aaas aaas, xoi xoi) {
        this(abgc, aaas, xoi, null, null, null, null, null);
    }

    public dzi(abgc abgc, aaas aaas, xoi xoi, Activity activity, afpu afpu, afqe afqe, hpy hpy, imj imj) {
        this.d = (abgc) amqw.a((Object) abgc);
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = (xoi) amqw.a((Object) xoi);
        this.e = activity;
        this.f = afpu;
        this.g = afqe;
        this.c = hpy;
        this.h = imj;
    }

    public final void a(apxu apxu, Map map) {
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (!(this.e == null || this.g == null)) {
            afpu afpu = this.f;
            if (!(afpu == null || afpu.a())) {
                this.g.a(this.e, null, new dzh(this, apxu, c));
                return;
            }
        }
        a(apxu, c);
    }

    public final void a(apxu apxu, Object obj) {
        Object obj2;
        anxr access$000 = anxl.checkIsLite(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj2 = access$000.b;
        } else {
            obj2 = access$000.a(b);
        }
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) obj2;
        dzk dzk = new dzk(this, playlistEditEndpointOuterClass$PlaylistEditEndpoint.b, playlistEditEndpointOuterClass$PlaylistEditEndpoint.c, obj);
        imj imj = this.h;
        if (imj == null || !imj.a(apxu, dzk)) {
            abgh a = this.d.a();
            a.a(apxu.b);
            a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
            a.a(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
            a.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.e;
            this.d.a(a, dzk);
        }
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.d.size() != 0) {
            this.a.a(playlistEditEndpointOuterClass$PlaylistEditEndpoint.d, obj);
        }
    }
}
