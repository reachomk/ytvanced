package defpackage;

import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;

/* renamed from: aaoe */
public final class aaoe {
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public Boolean e;
    public String f;
    public aofo g;
    private final SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint h;
    private String i;

    public aaoe(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) {
        this.h = selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
    }

    public final void a() {
        SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint = this.h;
        if (selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint != null && selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.b.size() != 0) {
            for (aofq aofq : this.h.b) {
                if ((aofq.a & 4) != 0) {
                    aofu aofu = aofq.c;
                    if (aofu == null) {
                        aofu = aofu.c;
                    }
                    this.i = aofu.b;
                }
                if ((aofq.a & 8) != 0) {
                    aofw aofw = aofq.d;
                    if (aofw == null) {
                        aofw = aofw.c;
                    }
                    if (!aofw.b.isEmpty()) {
                        aofw = aofq.d;
                        if (aofw == null) {
                            aofw = aofw.c;
                        }
                        this.b = aofw.b;
                    }
                }
                if ((aofq.a & 1) != 0) {
                    aofs aofs = aofq.b;
                    if (aofs == null) {
                        aofs = aofs.c;
                    }
                    if (!aofs.b.isEmpty()) {
                        aofs = aofq.b;
                        if (aofs == null) {
                            aofs = aofs.c;
                        }
                        this.a = aofs.b;
                    }
                }
                if ((aofq.a & 1024) != 0) {
                    aoga aoga = aofq.g;
                    if (aoga == null) {
                        aoga = aoga.c;
                    }
                    this.d = Boolean.valueOf(aoga.b);
                }
                if ((aofq.a & 2048) != 0) {
                    aqsu aqsu = aofq.h;
                    if (aqsu == null) {
                        aqsu = aqsu.c;
                    }
                    this.c = aqsu.b;
                }
                if (this.g == null) {
                    aofo aofo = aofq.f;
                    if (aofo == null) {
                        aofo = aofo.d;
                    }
                    this.g = aofo;
                }
                if ((aofq.a & 16) != 0) {
                    this.e = Boolean.valueOf(true);
                    aofy aofy = aofq.e;
                    if (aofy == null) {
                        aofy = aofy.c;
                    }
                    this.f = aofy.b;
                }
            }
        }
    }

    public final String b() {
        if (this.i == null) {
            a();
        }
        return this.i;
    }
}
