package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: puy */
public final class puy implements pvr {
    public final pvq a;
    public final Lock b;
    public final Context c;
    public final psh d;
    public rxy e;
    public boolean f;
    public boolean g;
    public pyy h;
    public boolean i;
    public boolean j;
    public final pyp k;
    private psa l;
    private int m;
    private int n = 0;
    private int o;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private boolean r;
    private final Map s;
    private final psq t;
    private final ArrayList u = new ArrayList();

    public puy(pvq pvq, pyp pyp, Map map, psh psh, psq psq, Lock lock, Context context) {
        this.a = pvq;
        this.k = pyp;
        this.s = map;
        this.d = psh;
        this.t = psq;
        this.b = lock;
        this.c = context;
    }

    private static String c(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public final void c() {
    }

    public final void a() {
        this.a.g.clear();
        this.f = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.g = false;
        this.i = false;
        HashMap hashMap = new HashMap();
        for (pso pso : this.s.keySet()) {
            psw psw = (psw) this.a.f.get(pso.b());
            boolean booleanValue = ((Boolean) this.s.get(pso)).booleanValue();
            if (psw.k()) {
                this.f = true;
                if (booleanValue) {
                    this.q.add(pso.b());
                } else {
                    this.r = false;
                }
            }
            hashMap.put(psw, new pva(this, pso, booleanValue));
        }
        if (this.f) {
            this.k.h = Integer.valueOf(System.identityHashCode(this.a.m));
            pvj pvj = new pvj(this);
            psq psq = this.t;
            Context context = this.c;
            Looper looper = this.a.m.d;
            pyp pyp = this.k;
            this.e = (rxy) psq.a(context, looper, pyp, pyp.g, pvj, pvj);
        }
        this.o = this.a.f.size();
        this.u.add(pvv.a.submit(new pvd(this, hashMap)));
    }

    public final boolean d() {
        int i = this.o - 1;
        this.o = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            String str = "GoogleApiClientConnecting";
            Log.w(str, this.a.m.k());
            Log.wtf(str, "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new psa(8, null));
            return false;
        }
        psa psa = this.l;
        if (psa == null) {
            return true;
        }
        this.a.l = this.m;
        b(psa);
        return false;
    }

    public final void e() {
        if (this.o != 0) {
            return;
        }
        if (!this.f || this.g) {
            ArrayList arrayList = new ArrayList();
            this.n = 1;
            this.o = this.a.f.size();
            for (pss pss : this.a.f.keySet()) {
                if (!this.a.g.containsKey(pss)) {
                    arrayList.add((psw) this.a.f.get(pss));
                } else if (d()) {
                    g();
                }
            }
            if (!arrayList.isEmpty()) {
                this.u.add(pvv.a.submit(new pve(this, arrayList)));
            }
        }
    }

    public final void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    public final void a(psa psa, pso pso, boolean z) {
        if (b(1)) {
            b(psa, pso, z);
            if (d()) {
                g();
            }
        }
    }

    private final void g() {
        pvq pvq = this.a;
        pvq.a.lock();
        try {
            pvq.m.j();
            pvq.k = new puw(pvq);
            pvq.k.a();
            pvq.b.signalAll();
            pvv.a.execute(new pvb(this));
            rxy rxy = this.e;
            if (rxy != null) {
                if (this.i) {
                    rxy.a(this.h, this.j);
                }
                a(false);
            }
            for (pss pss : this.a.g.keySet()) {
                ((psw) this.a.f.get(pss)).e();
            }
            this.a.n.a(!this.p.isEmpty() ? this.p : null);
        } finally {
            pvq.a.unlock();
        }
    }

    public final pts a(pts pts) {
        this.a.m.e.add(pts);
        return pts;
    }

    public final pts b(pts pts) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final boolean b() {
        h();
        a(true);
        this.a.a(null);
        return true;
    }

    public final void a(int i) {
        b(new psa(8, null));
    }

    public final void b(psa psa, pso pso, boolean z) {
        if (!(z && !psa.a() && psh.a(null, psa.b, null) == null) && (this.l == null || this.m > Integer.MAX_VALUE)) {
            this.l = psa;
            this.m = Integer.MAX_VALUE;
        }
        this.a.g.put(pso.b(), psa);
    }

    public final void f() {
        this.f = false;
        this.a.m.g = Collections.emptySet();
        for (pss pss : this.q) {
            if (!this.a.g.containsKey(pss)) {
                this.a.g.put(pss, new psa(17, null));
            }
        }
    }

    public final boolean a(psa psa) {
        return this.r && !psa.a();
    }

    public final void b(psa psa) {
        h();
        a(psa.a() ^ 1);
        this.a.a(psa);
        this.a.n.a(psa);
    }

    private final void a(boolean z) {
        rxy rxy = this.e;
        if (rxy != null) {
            if (rxy.i() && z) {
                this.e.d();
            }
            this.e.e();
            this.h = null;
        }
    }

    private final void h() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((Future) arrayList.get(i)).cancel(true);
            i = i2;
        }
        this.u.clear();
    }

    public final boolean b(int i) {
        if (this.n == i) {
            return true;
        }
        String str = "GoogleApiClientConnecting";
        Log.w(str, this.a.m.k());
        String valueOf = String.valueOf(this);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 23);
        stringBuilder.append("Unexpected callback in ");
        stringBuilder.append(valueOf);
        Log.w(str, stringBuilder.toString());
        int i2 = this.o;
        StringBuilder stringBuilder2 = new StringBuilder(33);
        stringBuilder2.append("mRemainingConnections=");
        stringBuilder2.append(i2);
        Log.w(str, stringBuilder2.toString());
        valueOf = puy.c(this.n);
        String c = puy.c(i);
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(c).length());
        stringBuilder3.append("GoogleApiClient connecting is in step ");
        stringBuilder3.append(valueOf);
        stringBuilder3.append(" but received callback for step ");
        stringBuilder3.append(c);
        Log.wtf(str, stringBuilder3.toString(), new Exception());
        b(new psa(8, null));
        return false;
    }
}
