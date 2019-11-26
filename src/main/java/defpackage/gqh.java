package defpackage;

import android.util.Pair;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* renamed from: gqh */
public final class gqh implements aixi {
    public final abfd a;
    private final gqm b;
    private final xsc c;
    private gqk d;

    public gqh(gqm gqm, xsc xsc, abfd abfd) {
        this.c = (xsc) amqw.a((Object) xsc);
        this.b = gqm;
        this.a = abfd;
    }

    public final anjv a(aiqq aiqq, String str, int i, aiqw aiqw) {
        return null;
    }

    public final Pair a(aiqq aiqq, String str, aiqw aiqw) {
        apxu apxu = aiqq.b;
        anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        if (((ReelWatchEndpointOuterClass$ReelWatchEndpoint) b) == null) {
            return new Pair(null, null);
        }
        aiqq.b();
        return new Pair(a(str, aiqq, aiqw), a(aiqq));
    }

    public final anjv a(aiqq aiqq) {
        afsx afsx = new afsx();
        afsx.a_(null);
        return afsx;
    }

    public final anjv a(String str, aiqq aiqq, aiqw aiqw) {
        Object obj;
        apxu apxu = aiqq.b;
        anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj;
        anjv anjv = null;
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint == null) {
            return null;
        }
        afsx afsx = new afsx();
        avtq avtq = reelWatchEndpointOuterClass$ReelWatchEndpoint.j;
        if (avtq == null) {
            avtq = avtq.d;
        }
        if (!((avtq.a & 2) == 0 || (reelWatchEndpointOuterClass$ReelWatchEndpoint.a & 1) == 0)) {
            avtq = reelWatchEndpointOuterClass$ReelWatchEndpoint.j;
            if (avtq == null) {
                avtq = avtq.d;
            }
            avtm avtm = avtq.c;
            if (avtm == null) {
                avtm = avtm.y;
            }
            anjv = new aaje(avtm, str, aiqq.g());
            anjv.a(reelWatchEndpointOuterClass$ReelWatchEndpoint.b);
        }
        this.d = new gqk(this, anjv, this.c.b(), afsx);
        this.b.a(apxu, str, this.d);
        return afsx;
    }
}
