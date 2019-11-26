package defpackage;

import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.Map;

/* renamed from: fuc */
final /* synthetic */ class fuc implements bbnw {
    private final fua a;
    private final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint b;
    private final Map c;

    fuc(fua fua, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, Map map) {
        this.a = fua;
        this.b = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        this.c = map;
    }

    public final void accept(Object obj) {
        this.a.a(amul.g(), this.b, this.c);
    }
}
