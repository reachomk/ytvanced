package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gme */
final class gme extends apa {
    public final List c;
    private final gpj d;
    private final gmd e;

    public gme(gpj gpj, gas gas, gmd gmd) {
        this.d = gpj;
        this.e = gmd;
        List<ReelWatchEndpointOuterClass$ReelWatchEndpoint> list = gas.a;
        this.c = new ArrayList(list.size());
        for (ReelWatchEndpointOuterClass$ReelWatchEndpoint gmj : list) {
            this.c.add(new gmj(gmj));
        }
    }

    public final int a() {
        return this.c.size();
    }

    public final /* synthetic */ void a(aqj aqj) {
        gmm gmm = (gmm) aqj;
        gmj gmj = gmm.q;
        if (gmj != null) {
            gmj.c = null;
            gmm.q = null;
        }
        gpa gpa = gmm.p;
        if (gpa != null) {
            gpa.h();
        }
    }
}
