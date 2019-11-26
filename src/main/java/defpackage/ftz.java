package defpackage;

import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.Map;

/* renamed from: ftz */
final /* synthetic */ class ftz implements bbnw {
    private final fua a;
    private final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b;
    private final Map c;

    ftz(fua fua, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, Map map) {
        this.a = fua;
        this.b = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        this.c = map;
    }

    public final void accept(Object obj) {
        this.a.a(((aveh) ((aadq) obj)).getSelectedVideoIds(), this.b, this.c);
    }
}
