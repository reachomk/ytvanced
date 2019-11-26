package defpackage;

import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import java.util.Map;

/* renamed from: fua */
public final class fua implements aaap {
    private final kzb a;
    private final aadw b;

    public fua(kzb kzb, aadw aadw) {
        this.a = kzb;
        this.b = aadw;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint) b;
        if ((createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.a & 8) == 0) {
            a(createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.b, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map);
            return;
        }
        bbsf bbsf = new bbsf(this.b.b(createPlaylistEndpointOuterClass$CreatePlaylistEndpoint.e).a(bbmt.a()).a(new ftz(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map)), bbod.d, bbod.d, (bbnw) bbow.a(new fuc(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map), "onError is null"), bbod.c, bbod.c, bbod.c);
        bbsf bbsf2 = bbsf;
        new bbsf(bbsf2, bbod.d, bbod.d, bbod.d, (bbnp) bbow.a(new fub(this, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, map), "onComplete is null"), bbod.c, bbod.c).a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    public final void a(java.util.List r8, com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint r9, java.util.Map r10) {
        /*
        r7 = this;
        r1 = r7.a;
        r3 = r9.c;
        r4 = r9.d;
        if (r10 == 0) goto L_0x001d;
    L_0x0008:
        r9 = "PLAYLIST_CREATION_LISTENER_KEY";
        r0 = r10.get(r9);
        r0 = r0 instanceof defpackage.flg;
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r9 = r10.get(r9);
        r9 = (defpackage.flg) r9;
        r9 = defpackage.amqp.b(r9);
        goto L_0x001f;
    L_0x001d:
        r9 = defpackage.ampo.a;
    L_0x001f:
        r5 = r9;
        defpackage.amqw.a(r8);
        defpackage.amqw.a(r3);
        defpackage.amqw.a(r4);
        r9 = r1.d;
        r9 = r9.a();
        if (r9 == 0) goto L_0x003b;
    L_0x0031:
        r9 = r1.g;
        r8 = r9.a(r8, r3, r4, r5);
        r8.show();
        return;
    L_0x003b:
        r9 = r1.e;
        r10 = r1.a;
        r6 = new kzd;
        r0 = r6;
        r2 = r8;
        r0.<init>(r1, r2, r3, r4, r5);
        r8 = 0;
        r9.a(r10, r8, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fua.a(java.util.List, com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint, java.util.Map):void");
    }
}
