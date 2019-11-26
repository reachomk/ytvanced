package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.concurrent.TimeUnit;

/* renamed from: mkq */
public final class mkq implements ebj, ejc, xcp {
    public final mlg a;
    public final aizy b;
    public apxu c;
    public boolean d;
    private final mlb e;
    private final zyw f;
    private final xci g;
    private final eif h;
    private final ebk i;
    private final adqf j;
    private final fkc k;
    private final lwc l;
    private final aaas m;
    private final Handler n;
    private final bdfu o = new bdfu();
    private boolean p;

    public mkq(mlb mlb, mlg mlg, zyw zyw, xci xci, eif eif, ebk ebk, adqf adqf, fkc fkc, lwc lwc, aizy aizy, aaas aaas, Handler handler) {
        this.e = mlb;
        this.a = mlg;
        this.f = zyw;
        this.g = xci;
        this.h = eif;
        this.i = ebk;
        this.j = adqf;
        this.k = fkc;
        this.l = lwc;
        this.b = aizy;
        this.m = aaas;
        this.n = handler;
    }

    public final void b(boolean z) {
        if (!this.p) {
            this.p = true;
            mlg mlg = this.a;
            apxn a = this.f.a();
            int i = 1800;
            if (a != null) {
                aulu aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if ((aulu.g & 2) != 0) {
                    aulu aulu2 = a.e;
                    if (aulu2 == null) {
                        aulu2 = aulu.bw;
                    }
                    azga azga = aulu2.ap;
                    if (azga == null) {
                        azga = azga.f;
                    }
                    i = azga.c;
                }
            }
            mlg.b = TimeUnit.SECONDS.toMillis((long) i);
            this.a.a(this.e.b(), TimeUnit.MINUTES);
            this.a.a();
            this.g.a((Object) this);
            this.h.a(this);
            this.i.a((ebj) this);
            this.o.a(this.a.a.a(new mkt(this)), this.e.b.c().a(new mks(this)));
            if (!this.i.a) {
                if (this.b.c()) {
                    this.a.c();
                }
                if (z && this.h.c().l()) {
                    this.b.e();
                }
            }
        }
    }

    public final void a() {
        if (this.p) {
            this.p = false;
            this.a.d();
            this.a.b();
            this.g.b(this);
            this.h.b(this);
            this.i.b(this);
            this.o.a();
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (!ejd2.l() || ejd2.g()) {
            this.a.d();
        } else if (this.b.c()) {
            this.a.c();
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.a.d();
            return;
        }
        if (this.b.c()) {
            this.a.c();
        }
    }

    public final void b() {
        this.d = false;
        ejd c = this.h.c();
        if (c == ejd.WATCH_WHILE_FULLSCREEN) {
            this.l.j();
        } else if (c == ejd.WATCH_WHILE_MINIMIZED) {
            this.k.b(2);
            this.l.f(true);
        } else if (c == ejd.VIRTUAL_REALITY_FULLSCREEN) {
            this.k.b(2);
            this.l.f();
        }
        this.b.b();
        this.m.a(this.c, amur.a("engagement_panel_close_listener_key", new mku(this)));
    }

    private final void c() {
        apxu apxu = this.c;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) b;
            if (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint != null) {
                artm artm = (artm) HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c.createBuilder();
                artm.a(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b);
                HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) ((anxl) artm.build());
                apxx apxx = (apxx) apxu.d.createBuilder();
                apxx.a(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint);
                this.m.a((apxu) ((anxl) apxx.build()), null);
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{afqf.class, afqh.class, ahkf.class, ahkr.class};
        } else if (i == 0) {
            this.a.e();
        } else if (i == 1) {
            this.a.e();
        } else if (i == 2) {
            ahkf ahkf = (ahkf) obj;
            int i2 = ahkf.e;
            if (i2 == 1 || i2 == 3) {
                this.c = null;
                this.a.d();
            } else if (i2 == 5) {
                this.c = ahkf.c.a.q;
                if (this.d && this.c != null) {
                    this.n.post(new mkv(this));
                    return null;
                }
            }
        } else if (i != 3) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((ahkr) obj).a != 2 || this.h.c().g() || this.i.a || this.j.d() != 2) {
            this.a.d();
        } else {
            this.a.c();
            c();
        }
        return clsArr;
    }
}
