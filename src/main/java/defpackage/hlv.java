package defpackage;

import android.view.View;
import android.view.ViewStub;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: hlv */
public final class hlv implements xcp {
    public final agwc a;
    public final hnf b;
    public String c;
    public String d;
    public anjv e;
    public anjv f;
    private final ViewStub g;
    private final ScheduledExecutorService h;
    private final Executor i;
    private final xci j;
    private final ahdm k;
    private final hng l;
    private final hnj m = new hlu(this);
    private View n;
    private boolean o;

    public hlv(ScheduledExecutorService scheduledExecutorService, Executor executor, agwc agwc, xci xci, ahdm ahdm, hng hng, ViewStub viewStub, hnf hnf) {
        this.h = scheduledExecutorService;
        this.i = executor;
        this.a = agwc;
        this.j = xci;
        this.k = ahdm;
        this.l = hng;
        this.g = viewStub;
        this.b = hnf;
    }

    public final void a(akor akor) {
        if (this.k.b()) {
            this.c = akor.b("VideoPresenterConstants.VIDEO_ID");
            this.d = akor.b("PlaylistPresenterConstants.PLAYLIST_ID");
            if (amqu.a(this.c) && amqu.a(this.d)) {
                a(false);
                return;
            }
            this.j.a((Object) this);
            this.l.a(this.m);
            b();
            return;
        }
        a(false);
    }

    public final void a() {
        c();
        this.c = null;
        this.d = null;
        this.j.b(this);
        this.l.b(this.m);
        a(false);
    }

    public final void b() {
        c();
        if (this.c != null) {
            this.e = anic.a(anjf.a(new hlx(this), this.h), new hlw(this), this.h);
            anjf.a(this.e, new hmd(this), this.i);
        } else if (this.d != null) {
            this.f = anic.a(anjf.a(new hlz(this), this.h), new hly(this), this.h);
            anjf.a(this.f, new hma(this), this.i);
        }
    }

    public final void a(boolean z) {
        xak.a();
        if (z && this.n == null) {
            this.n = this.g.inflate();
            hnf hnf = this.b;
            if (hnf != null) {
                View view = this.n;
                hnf.a = view;
                view.setOnClickListener(new hmb(this));
            }
        }
        View view2 = this.n;
        if (!(view2 == null || z == this.o)) {
            xpr.a(view2, z);
        }
        this.o = z;
    }

    private final void c() {
        anjv anjv = this.e;
        if (anjv != null) {
            anjv.cancel(false);
            this.e = null;
        }
        anjv = this.f;
        if (anjv != null) {
            anjv.cancel(false);
            this.f = null;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{agkz.class, aglm.class, agll.class};
        } else if (i != 0) {
            if (i == 1) {
                aglm aglm = (aglm) obj;
                if (aglm.a.a().equals(this.c) && aglm.a.u() == agqs.PLAYABLE) {
                    a(true);
                } else if (this.d != null && this.a.b().n().l(aglm.a.a()).contains(this.d)) {
                    a(true);
                    return null;
                }
            } else if (i != 2) {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (((agll) obj).a.equals(this.c)) {
                a(false);
                return null;
            }
        } else if (((agkz) obj).a.equals(this.d)) {
            a(false);
            return null;
        }
        return clsArr;
    }
}
