package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gqc */
public final class gqc {
    public static final int i = 4;
    public final gqm a;
    public final gqf b;
    public final xsc c;
    public final aipx d;
    public final zzl e;
    public final ajam f;
    public String g;
    public final bdfu h = new bdfu();
    private final gqw j;
    private gqd k;

    public gqc(gqw gqw, gqm gqm, gqf gqf, xsc xsc, aipx aipx, zzl zzl, ajam ajam) {
        this.j = gqw;
        this.b = (gqf) amqw.a((Object) gqf);
        this.c = (xsc) amqw.a((Object) xsc);
        this.a = gqm;
        this.d = (aipx) amqw.a((Object) aipx);
        this.e = zzl;
        this.f = ajam;
    }

    public final void a(apxu apxu) {
        Object obj;
        gqd gqd = this.k;
        if (gqd != null) {
            gqd.a = true;
            gqg gqg = gqd.b;
            if (gqg != null) {
                gqg.a();
                gqd.b = null;
            }
            gqg = gqd.c;
            if (gqg != null) {
                gqg.a();
                gqd.c = null;
            }
            gqg = gqd.d;
            if (gqg != null) {
                gqg.a();
                gqd.d = null;
            }
            gqg = gqd.e;
            if (gqg != null) {
                gqg.a();
                gqd.e = null;
            }
            this.k = null;
        }
        anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj;
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null) {
            xtl.c("No reel watch endpoint.");
            return;
        }
        this.k = new gqd(this, this.g, reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
        ArrayList a = this.b.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ((gqi) a.get(i)).b(apxu);
        }
        this.a.a(apxu, this.g, this.k);
    }

    public final apxu a(String str, int i) {
        gas gas = this.j.a;
        apxu apxu = null;
        if (gas != null) {
            List list;
            apxx apxx;
            if (i != 2) {
                list = gas.a;
                if (list != null && str != null) {
                    i = list.size();
                    while (true) {
                        i--;
                        if (i > 0) {
                            if (str.equals(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) gas.a.get(i)).c)) {
                                apxx = (apxx) apxu.d.createBuilder();
                                apxx.a(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) gas.a.get(i - 1));
                                apxu = (apxu) ((anxl) apxx.build());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                return apxu;
            }
            list = gas.a;
            if (list != null && str != null) {
                i = list.size() - 1;
                for (int i2 = 0; i2 < i; i2++) {
                    if (str.equals(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) gas.a.get(i2)).c)) {
                        apxx = (apxx) apxu.d.createBuilder();
                        apxx.a(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) gas.a.get(i2 + 1));
                        apxu = (apxu) ((anxl) apxx.build());
                        break;
                    }
                }
            }
        }
        return apxu;
    }
}
