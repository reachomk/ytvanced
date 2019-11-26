package defpackage;

import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;

/* renamed from: imk */
public final class imk implements imj {
    private final abgc a;

    public imk(abgc abgc) {
        this.a = abgc;
    }

    public final void a(String str) {
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
        abgh a = this.a.a();
        a.a = playlistEditEndpointOuterClass$PlaylistEditEndpoint.b;
        a.c = playlistEditEndpointOuterClass$PlaylistEditEndpoint.e;
        if ((apxu.a & 1) != 0) {
            a.a(apxu.b);
        } else {
            a.g();
        }
        a.a(playlistEditEndpointOuterClass$PlaylistEditEndpoint.c);
        this.a.a(a, afsw);
        return true;
    }

    public final void a(String str, String str2, String str3, afsw afsw) {
        abgh a = this.a.a();
        a.a = str;
        a.a(str2, str3);
        a.g();
        this.a.a(a, afsw);
    }
}
