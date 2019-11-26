package defpackage;

import com.google.protos.youtube.api.innertube.DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint;
import java.util.Map;

/* renamed from: dxx */
public final class dxx implements aaap {
    private final fkz a;

    public dxx(fkz fkz) {
        this.a = (fkz) amqw.a((Object) fkz);
    }

    public final void a(apxu apxu, Map map) {
        fkz fkz = this.a;
        anxr access$000 = anxl.checkIsLite(DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.deletePlaylistEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        fkz.a(((DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint) b).b).show();
    }
}
