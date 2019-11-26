package defpackage;

import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;

/* renamed from: ffp */
public final class ffp implements fff {
    private final artk a;

    public ffp(String str, String str2) {
        artj artj = (artj) artk.f.createBuilder();
        arwe arwe = (arwe) arwf.c.createBuilder();
        arwe.a(arwh.PLAY_ARROW);
        artj.copyOnWrite();
        artk artk = (artk) artj.instance;
        artk.d = (arwf) ((anxl) arwe.build());
        artk.a |= 1;
        aody aody = (aody) aodv.c.createBuilder();
        str2 = xvd.a(str2);
        aody.copyOnWrite();
        aodv aodv = (aodv) aody.instance;
        if (str2 != null) {
            aodv.a |= 2;
            aodv.b = str2;
            artj.copyOnWrite();
            artk artk2 = (artk) artj.instance;
            artk2.e = (aodv) ((anxl) aody.build());
            artk2.a |= 8;
            avse avse = (avse) avsc.g.createBuilder();
            avse.b(xvd.a(str));
            avse.a(0);
            avsc avsc = (avsc) ((anxl) avse.build());
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(OfflineWatchEndpointOuterClass.offlineWatchEndpoint, avsc);
            artj.copyOnWrite();
            artk artk3 = (artk) artj.instance;
            artk3.c = (anxl) apxx.build();
            artk3.b = 3;
            this.a = (artk) ((anxl) artj.build());
            return;
        }
        throw new NullPointerException();
    }

    public final arwf a() {
        artk artk = this.a;
        if ((artk.a & 1) == 0) {
            return null;
        }
        arwf arwf = artk.d;
        if (arwf == null) {
            arwf = arwf.c;
        }
        return arwf;
    }

    public final apxu b() {
        artk artk = this.a;
        return artk.b == 2 ? (apxu) artk.c : null;
    }

    public final String c() {
        artk artk = this.a;
        if ((artk.a & 8) == 0) {
            return null;
        }
        aodv aodv = artk.e;
        if (aodv == null) {
            aodv = aodv.c;
        }
        return aodv.b;
    }

    public final apxu d() {
        artk artk = this.a;
        return artk.b == 3 ? (apxu) artk.c : null;
    }

    public final Object e() {
        return this.a;
    }
}
