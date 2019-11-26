package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: pvk */
public final class pvk extends ptd implements pwh {
    public final Lock b;
    public final qaj c;
    public final Looper d;
    public final Queue e = new LinkedList();
    public final Map f;
    public Set g = new HashSet();
    public final pwu h;
    private pwe i = null;
    private final int j;
    private final Context k;
    private volatile boolean l;
    private long m = 120000;
    private long n = 5000;
    private final pvp o;
    private final psf p;
    private pwc q;
    private final pyp r;
    private final Map s;
    private final psq t;
    private final pui u = new pui();
    private final ArrayList v;
    private Integer w = null;
    private Set x = null;
    private final qai y = new pvn(this);

    public pvk(Context context, Lock lock, Looper looper, pyp pyp, psf psf, psq psq, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        Looper looper2 = looper;
        int i3 = i;
        this.k = context;
        this.b = lock;
        this.c = new qaj(looper, this.y);
        this.d = looper2;
        this.o = new pvp(this, looper);
        this.p = psf;
        this.j = i3;
        if (i3 >= 0) {
            this.w = Integer.valueOf(i2);
        }
        this.s = map;
        this.f = map2;
        this.v = arrayList;
        this.h = new pwu(this.f);
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = (pte) list.get(i4);
            qaj qaj = this.c;
            pzr.a(obj);
            synchronized (qaj.i) {
                if (qaj.b.contains(obj)) {
                    String valueOf = String.valueOf(obj);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 62);
                    stringBuilder.append("registerConnectionCallbacks(): listener ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" is already registered");
                    Log.w("GmsClientEvents", stringBuilder.toString());
                } else {
                    qaj.b.add(obj);
                }
            }
            if (qaj.a.i()) {
                Handler handler = qaj.h;
                handler.sendMessage(handler.obtainMessage(1, obj));
            }
        }
        size = list2.size();
        for (i3 = 0; i3 < size; i3++) {
            this.c.a((pth) list2.get(i3));
        }
        this.r = pyp;
        this.t = psq;
    }

    private static String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public final pts a(pts pts) {
        pzr.b(pts.b != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f.containsKey(pts.b);
        pso pso = pts.c;
        Object obj = pso != null ? pso.a : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(obj);
        stringBuilder.append(" required for this call.");
        pzr.b(containsKey, stringBuilder.toString());
        this.b.lock();
        try {
            pwe pwe = this.i;
            if (pwe == null) {
                this.e.add(pts);
                return pts;
            }
            pts = pwe.a(pts);
            this.b.unlock();
            return pts;
        } finally {
            this.b.unlock();
        }
    }

    public final pts b(pts pts) {
        pzr.b(pts.b != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f.containsKey(pts.b);
        pso pso = pts.c;
        Object obj = pso != null ? pso.a : "the API";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 65);
        stringBuilder.append("GoogleApiClient is not configured to use ");
        stringBuilder.append(obj);
        stringBuilder.append(" required for this call.");
        pzr.b(containsKey, stringBuilder.toString());
        this.b.lock();
        try {
            if (this.i == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.l) {
                this.e.add(pts);
                while (!this.e.isEmpty()) {
                    pts pts2 = (pts) this.e.remove();
                    this.h.a(pts2);
                    pts2.b(Status.c);
                }
                return pts;
            } else {
                pts = this.i.b(pts);
                this.b.unlock();
                return pts;
            }
        } finally {
            this.b.unlock();
        }
    }

    public final psw a(pss pss) {
        Object obj = (psw) this.f.get(pss);
        pzr.a(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public final void c() {
        this.b.lock();
        try {
            boolean z = true;
            if (this.j >= 0) {
                pzr.a(this.w != null, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.w;
                if (num == null) {
                    this.w = Integer.valueOf(pvk.a(this.f.values()));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = this.w.intValue();
            this.b.lock();
            if (!(intValue == 3 || intValue == 1 || intValue == 2)) {
                z = false;
            }
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Illegal sign-in mode: ");
            stringBuilder.append(intValue);
            pzr.b(z, stringBuilder.toString());
            a(intValue);
            h();
        } catch (Throwable th) {
        } finally {
            this.b.unlock();
        }
        this.b.unlock();
    }

    public final psa d() {
        boolean z = true;
        pzr.a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.b.lock();
        try {
            if (this.j >= 0) {
                if (this.w == null) {
                    z = false;
                }
                pzr.a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.w;
                if (num == null) {
                    this.w = Integer.valueOf(pvk.a(this.f.values()));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            a(this.w.intValue());
            this.c.b();
            psa b = this.i.b();
            return b;
        } finally {
            this.b.unlock();
        }
    }

    public final void e() {
        this.b.lock();
        try {
            pwu pwu = this.h;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) pwu.c.toArray(pwu.b)) {
                basePendingResult.a(null);
                synchronized (basePendingResult.d) {
                    if (((ptd) basePendingResult.e.get()) == null || !basePendingResult.g) {
                        basePendingResult.c();
                    }
                }
                if (basePendingResult.d()) {
                    pwu.c.remove(basePendingResult);
                }
            }
            pwe pwe = this.i;
            if (pwe != null) {
                pwe.c();
            }
            pui pui = this.u;
            for (pue a : pui.a) {
                a.a();
            }
            pui.a.clear();
            for (pts pts : this.e) {
                pts.a(null);
                pts.c();
            }
            this.e.clear();
            if (this.i != null) {
                j();
                this.c.a();
                this.b.unlock();
                return;
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
        }
    }

    public final boolean f() {
        pwe pwe = this.i;
        return pwe != null && pwe.d();
    }

    public final boolean g() {
        pwe pwe = this.i;
        return pwe != null && pwe.e();
    }

    private final void a(int i) {
        pvk thisR;
        Integer num = this.w;
        if (num == null) {
            this.w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String b = pvk.b(i);
            String b2 = pvk.b(this.w.intValue());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(b).length() + 51) + String.valueOf(b2).length());
            stringBuilder.append("Cannot use sign-in mode: ");
            stringBuilder.append(b);
            stringBuilder.append(". Mode was already set to ");
            stringBuilder.append(b2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (this.i == null) {
            Object obj = null;
            for (psw psw : this.f.values()) {
                if (psw.k()) {
                    obj = 1;
                }
                psw.m();
            }
            int intValue = this.w.intValue();
            if (intValue == 1) {
                thisR = this;
                if (obj == null) {
                    throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                }
            } else if (intValue == 2 && obj != null) {
                Context context = this.k;
                Lock lock = this.b;
                Looper looper = this.d;
                psh psh = this.p;
                Map map = this.f;
                pyp pyp = this.r;
                Map map2 = this.s;
                psq psq = this.t;
                ArrayList arrayList = this.v;
                zj zjVar = new zj();
                zj zjVar2 = new zj();
                for (Entry entry : map.entrySet()) {
                    psw psw2 = (psw) entry.getValue();
                    psw2.m();
                    if (psw2.k()) {
                        zjVar.put((pss) entry.getKey(), psw2);
                    } else {
                        zjVar2.put((pss) entry.getKey(), psw2);
                    }
                }
                pzr.a(zjVar.isEmpty() ^ 1, (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                zj zjVar3 = new zj();
                zj zjVar4 = new zj();
                for (pso pso : map2.keySet()) {
                    pss b3 = pso.b();
                    if (zjVar.containsKey(b3)) {
                        zjVar3.put(pso, (Boolean) map2.get(pso));
                    } else if (zjVar2.containsKey(b3)) {
                        zjVar4.put(pso, (Boolean) map2.get(pso));
                    } else {
                        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                intValue = arrayList.size();
                int i2 = 0;
                while (i2 < intValue) {
                    int i3 = i2 + 1;
                    pxk pxk = (pxk) arrayList.get(i2);
                    i = intValue;
                    if (zjVar3.containsKey(pxk.a)) {
                        arrayList2.add(pxk);
                    } else if (zjVar4.containsKey(pxk.a)) {
                        arrayList3.add(pxk);
                    } else {
                        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                    }
                    intValue = i;
                    i2 = i3;
                }
                ArrayList arrayList4 = arrayList3;
                Looper looper2 = looper;
                psh psh2 = psh;
                zj zjVar5 = zjVar;
                ArrayList arrayList5 = arrayList2;
                pxm pxm = r0;
                pxm pxm2 = new pxm(context, this, lock, looper2, psh2, zjVar5, zjVar2, pyp, psq, arrayList5, arrayList4, zjVar3, zjVar4);
                this.i = pxm;
                return;
            } else {
                thisR = this;
            }
            thisR.i = new pvq(thisR.k, this, thisR.b, thisR.d, thisR.p, thisR.f, thisR.r, thisR.s, thisR.t, thisR.v, this);
            return;
        }
    }

    public final void h() {
        this.c.b();
        this.i.a();
    }

    public final void i() {
        this.b.lock();
        try {
            if (this.l) {
                h();
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean j() {
        boolean z = false;
        if (this.l) {
            this.l = false;
            this.o.removeMessages(2);
            z = true;
            this.o.removeMessages(1);
            pwc pwc = this.q;
            if (pwc != null) {
                pwc.a();
                this.q = null;
            }
        }
        return z;
    }

    public final void a(pth pth) {
        qaj qaj = this.c;
        pzr.a((Object) pth);
        synchronized (qaj.i) {
            if (!qaj.d.remove(pth)) {
                String valueOf = String.valueOf(pth);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 57);
                stringBuilder.append("unregisterConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            }
        }
    }

    public final void a(Bundle bundle) {
        while (!this.e.isEmpty()) {
            b((pts) this.e.remove());
        }
        qaj qaj = this.c;
        boolean z = true;
        pzr.a(Looper.myLooper() == qaj.h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (qaj.i) {
            pzr.a(qaj.g ^ 1);
            qaj.h.removeMessages(1);
            qaj.g = true;
            if (qaj.c.size() != 0) {
                z = false;
            }
            pzr.a(z);
            ArrayList arrayList = new ArrayList(qaj.b);
            int i = qaj.f.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                pte pte = (pte) obj;
                if (!qaj.e || !qaj.a.i() || qaj.f.get() != i) {
                    break;
                } else if (!qaj.c.contains(pte)) {
                    pte.a(bundle);
                }
            }
            qaj.c.clear();
            qaj.g = false;
        }
    }

    public final void a(psa psa) {
        if (!psl.c(this.k, psa.b)) {
            j();
        }
        if (!this.l) {
            qaj qaj = this.c;
            int i = 0;
            pzr.a(Looper.myLooper() == qaj.h.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
            qaj.h.removeMessages(1);
            synchronized (qaj.i) {
                ArrayList arrayList = new ArrayList(qaj.d);
                int i2 = qaj.f.get();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    pth pth = (pth) obj;
                    if (qaj.e) {
                        if (qaj.f.get() == i2) {
                            if (qaj.d.contains(pth)) {
                                pth.a(psa);
                            }
                        }
                    }
                    break;
                }
            }
            this.c.a();
        }
    }

    public final void a(int i, boolean z) {
        int i2;
        if (i == 1 && !this.l) {
            this.l = true;
            if (this.q == null) {
                this.q = psf.a(this.k.getApplicationContext(), new pvo(this));
            }
            pvp pvp = this.o;
            pvp.sendMessageDelayed(pvp.obtainMessage(1), this.m);
            pvp = this.o;
            pvp.sendMessageDelayed(pvp.obtainMessage(2), this.n);
        }
        for (BasePendingResult c : (BasePendingResult[]) this.h.c.toArray(pwu.b)) {
            c.c(pwu.a);
        }
        qaj qaj = this.c;
        pzr.a(Looper.myLooper() == qaj.h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        qaj.h.removeMessages(1);
        synchronized (qaj.i) {
            qaj.g = true;
            ArrayList arrayList = new ArrayList(qaj.b);
            i2 = qaj.f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                pte pte = (pte) obj;
                if (!qaj.e || qaj.f.get() != i2) {
                    break;
                } else if (qaj.b.contains(pte)) {
                    pte.a(i);
                }
            }
            qaj.c.clear();
            qaj.g = false;
        }
        this.c.a();
        if (i == 2) {
            h();
        }
    }

    public final Context a() {
        return this.k;
    }

    public final Looper b() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final String k() {
        StringWriter stringWriter = new StringWriter();
        a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.k);
        printWriter.append(str).append("mResuming=").print(this.l);
        printWriter.append(" mWorkQueue.size()=").print(this.e.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.h.c.size());
        pwe pwe = this.i;
        if (pwe != null) {
            pwe.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public static int a(Iterable iterable) {
        Object obj = null;
        for (psw psw : iterable) {
            if (psw.k()) {
                obj = 1;
            }
            psw.m();
        }
        if (obj == null) {
            return 3;
        }
        return 1;
    }
}
