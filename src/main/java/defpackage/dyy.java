package defpackage;

import com.google.protos.youtube.api.innertube.ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint;
import java.util.Map;

/* renamed from: dyy */
public final class dyy implements aaap {
    public final aaas a;
    public final xoi b;
    public final bcaa c;
    private final abdx d;
    private final afve e;

    public dyy(abdx abdx, aaas aaas, xoi xoi, afve afve, bcaa bcaa) {
        this.d = (abdx) amqw.a((Object) abdx);
        this.a = aaas;
        this.b = (xoi) amqw.a((Object) xoi);
        this.e = (afve) amqw.a((Object) afve);
        this.c = (bcaa) amqw.a((Object) bcaa);
    }

    public final void a(apxu apxu, Map map) {
        String str;
        abdx abdx = this.d;
        aaml abdv = new abdv(abdx.c, abdx.d.c());
        abdv.b = this.e.a();
        anxr access$000 = anxl.checkIsLite(ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint.modifyPlaylistNotificationPreferenceEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint.modifyPlaylistNotificationPreferenceEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            str = ((ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint) obj).b;
        } else {
            str = null;
        }
        abdv.a = str;
        abdv.a(apxu.b.d());
        etb etb = (etb) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", etb.class);
        abdx abdx2 = this.d;
        abdx2.j.a(abdv, new dyx(this, etb));
    }
}
