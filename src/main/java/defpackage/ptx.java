package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: ptx */
public final class ptx implements pte, pth, pxn {
    public final Queue a = new LinkedList();
    public final psw b;
    public final Set c = new HashSet();
    public final Map d = new HashMap();
    public final int e;
    public boolean f;
    public final List g = new ArrayList();
    public final /* synthetic */ pty h;
    private final psp i;
    private final pxd j;
    private final puq k;
    private final pwn l;
    private psa m = null;

    public ptx(pty pty, psz psz) {
        this.h = pty;
        this.b = psz.b.a().a(psz.a, pty.m.getLooper(), psz.a().a(), null, this, this);
        psw psw = this.b;
        if (psw instanceof pzx) {
            this.i = pzx.d();
        } else {
            this.i = psw;
        }
        this.j = psz.c;
        this.k = new puq();
        this.e = psz.e;
        if (this.b.k()) {
            this.l = new pwn(pty.g, pty.m, psz.a().a());
        } else {
            this.l = null;
        }
    }

    public final void a(Bundle bundle) {
        if (Looper.myLooper() == this.h.m.getLooper()) {
            a();
        } else {
            this.h.m.post(new pvx(this));
        }
    }

    public final void a() {
        e();
        c(psa.a);
        g();
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            pwk pwk = (pwk) it.next();
            if (a(null) != null) {
                it.remove();
            } else {
                try {
                    pwk.a.a(this.i, new ryl());
                } catch (DeadObjectException unused) {
                    a(1);
                    this.b.e();
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        c();
        j();
    }

    public final void a(int i) {
        if (Looper.myLooper() == this.h.m.getLooper()) {
            b();
        } else {
            this.h.m.post(new pvw(this));
        }
    }

    public final void b() {
        e();
        this.f = true;
        this.k.a(true, pwu.a);
        Handler handler = this.h.m;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.j), this.h.c);
        handler = this.h.m;
        handler.sendMessageDelayed(Message.obtain(handler, 11, this.j), this.h.d);
        this.h.h.a();
    }

    /* JADX WARNING: Missing block: B:13:0x0021, code skipped:
            return false;
     */
    private final boolean b(defpackage.psa r4) {
        /*
        r3 = this;
        r0 = defpackage.pty.f;
        monitor-enter(r0);
        r1 = r3.h;	 Catch:{ all -> 0x0022 }
        r2 = r1.k;	 Catch:{ all -> 0x0022 }
        if (r2 == 0) goto L_0x001f;
    L_0x0009:
        r1 = r1.l;	 Catch:{ all -> 0x0022 }
        r2 = r3.j;	 Catch:{ all -> 0x0022 }
        r1 = r1.contains(r2);	 Catch:{ all -> 0x0022 }
        if (r1 == 0) goto L_0x001f;
    L_0x0013:
        r1 = r3.h;	 Catch:{ all -> 0x0022 }
        r1 = r1.k;	 Catch:{ all -> 0x0022 }
        r2 = r3.e;	 Catch:{ all -> 0x0022 }
        r1.b(r4, r2);	 Catch:{ all -> 0x0022 }
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        r4 = 1;
        return r4;
    L_0x001f:
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        r4 = 0;
        return r4;
    L_0x0022:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ptx.b(psa):boolean");
    }

    public final void a(psa psa, pso pso, boolean z) {
        if (Looper.myLooper() == this.h.m.getLooper()) {
            a(psa);
        } else {
            this.h.m.post(new pvz(this, psa));
        }
    }

    public final void a(psa psa) {
        pzr.a(this.h.m);
        pwn pwn = this.l;
        if (pwn != null) {
            rxy rxy = pwn.f;
            if (rxy != null) {
                rxy.e();
            }
        }
        e();
        this.h.h.a();
        c(psa);
        if (psa.b == 4) {
            a(pty.b);
        } else if (this.a.isEmpty()) {
            this.m = psa;
        } else {
            if (!(b(psa) || this.h.a(psa, this.e))) {
                if (psa.b == 18) {
                    this.f = true;
                }
                if (this.f) {
                    Handler handler = this.h.m;
                    handler.sendMessageDelayed(Message.obtain(handler, 9, this.j), this.h.c);
                    return;
                }
                String a = this.j.a();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 38);
                stringBuilder.append("API: ");
                stringBuilder.append(a);
                stringBuilder.append(" is not available on this device.");
                a(new Status(17, stringBuilder.toString()));
            }
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            pvm pvm = (pvm) arrayList.get(i);
            if (this.b.i()) {
                if (b(pvm)) {
                    this.a.remove(pvm);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final void a(pvm pvm) {
        pzr.a(this.h.m);
        if (!this.b.i()) {
            this.a.add(pvm);
            psa psa = this.m;
            if (psa == null || !psa.a()) {
                h();
            } else {
                a(this.m);
            }
        } else if (b(pvm)) {
            j();
        } else {
            this.a.add(pvm);
        }
    }

    public final void d() {
        pzr.a(this.h.m);
        a(pty.a);
        int i = 0;
        this.k.a(false, pty.a);
        puh[] puhArr = (puh[]) this.d.keySet().toArray(new puh[this.d.size()]);
        int length = puhArr.length;
        while (i < length) {
            a(new pxa(puhArr[i], new ryl()));
            i++;
        }
        c(new psa(4));
        if (this.b.i()) {
            this.b.a(new pvy(this));
        }
    }

    public final void e() {
        pzr.a(this.h.m);
        this.m = null;
    }

    public final psa f() {
        pzr.a(this.h.m);
        return this.m;
    }

    private final boolean b(pvm pvm) {
        if (pvm instanceof pwi) {
            pwi pwi = (pwi) pvm;
            psc a = a(pwi.b(this));
            if (a == null) {
                c(pvm);
                return true;
            }
            pwi.c(this);
            pwi.a(new pto(a));
            return false;
        }
        c(pvm);
        return true;
    }

    private final void c(pvm pvm) {
        pvm.a(this.k, i());
        try {
            pvm.a(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.e();
        }
    }

    public final void a(Status status) {
        pzr.a(this.h.m);
        for (pvm a : this.a) {
            a.a(status);
        }
        this.a.clear();
    }

    public final void g() {
        if (this.f) {
            this.h.m.removeMessages(11, this.j);
            this.h.m.removeMessages(9, this.j);
            this.f = false;
        }
    }

    private final void j() {
        this.h.m.removeMessages(12, this.j);
        Handler handler = this.h.m;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.j), this.h.e);
    }

    public final boolean a(boolean z) {
        pzr.a(this.h.m);
        if (this.b.i() && this.d.size() == 0) {
            puq puq = this.k;
            if (puq.a.isEmpty() && puq.b.isEmpty()) {
                this.b.e();
                return true;
            } else if (z) {
                j();
            }
        }
        return false;
    }

    public final void h() {
        pzr.a(this.h.m);
        if (!(this.b.i() || this.b.j())) {
            pty pty = this.h;
            int a = pty.h.a(pty.g, this.b);
            if (a != 0) {
                a(new psa(a, null));
                return;
            }
            pye ptz = new ptz(this.h, this.b, this.j);
            if (this.b.k()) {
                pwn pwn = this.l;
                rxy rxy = pwn.f;
                if (rxy != null) {
                    rxy.e();
                }
                pwn.e.h = Integer.valueOf(System.identityHashCode(pwn));
                psq psq = pwn.c;
                Context context = pwn.a;
                Looper looper = pwn.b.getLooper();
                pyp pyp = pwn.e;
                pwn.f = (rxy) psq.a(context, looper, pyp, pyp.g, pwn, pwn);
                pwn.g = ptz;
                Set set = pwn.d;
                if (set == null || set.isEmpty()) {
                    pwn.b.post(new pwm(pwn));
                } else {
                    pwn.f.h();
                }
            }
            this.b.a(ptz);
        }
    }

    private final void c(psa psa) {
        for (pxe pxe : this.c) {
            if (pzj.a(psa, psa.a)) {
                this.b.n();
            }
            pxe.a();
        }
        this.c.clear();
    }

    public final boolean i() {
        return this.b.k();
    }

    private final psc a(psc[] pscArr) {
        if (!(pscArr == null || pscArr.length == 0)) {
            psc[] o = this.b.o();
            int i = 0;
            if (o == null) {
                o = new psc[0];
            }
            zj zjVar = new zj(r3);
            for (psc psc : o) {
                zjVar.put(psc.a, Long.valueOf(psc.a()));
            }
            int length = pscArr.length;
            while (i < length) {
                psc psc2 = pscArr[i];
                if (!zjVar.containsKey(psc2.a) || ((Long) zjVar.get(psc2.a)).longValue() < psc2.a()) {
                    return psc2;
                }
                i++;
            }
        }
        return null;
    }
}
