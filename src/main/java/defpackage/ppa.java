package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ppa */
public final class ppa extends qae {
    public static final pon a = new pon("CastClientImpl");
    public static final Object t = new Object();
    public static final Object u = new Object();
    private final long M;
    private final Bundle N;
    private ppc O;
    private boolean P;
    private Bundle Q;
    public pjb b;
    public final CastDevice c;
    public final pjk d;
    public final Map e = new HashMap();
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public double j;
    public pjp k;
    public int l;
    public int m;
    public final AtomicLong n = new AtomicLong(0);
    public String o;
    public String p;
    public final Map q = new HashMap();
    public ptu r;
    public ptu s;

    public ppa(Context context, Looper looper, pyp pyp, CastDevice castDevice, long j, pjk pjk, Bundle bundle, pte pte, pth pth) {
        super(context, looper, 10, pyp, pte, pth);
        this.c = castDevice;
        this.d = pjk;
        this.M = j;
        this.N = bundle;
        d();
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public final int c() {
        return 12800000;
    }

    public final void d() {
        this.P = false;
        this.l = -1;
        this.m = -1;
        this.b = null;
        this.f = null;
        this.j = 0.0d;
        this.g = false;
        this.k = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        a.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 1001) {
            this.P = true;
            this.h = true;
            this.i = true;
        } else {
            this.P = false;
        }
        if (i == 1001) {
            this.Q = new Bundle();
            this.Q.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.a(i, iBinder, bundle, i2);
    }

    public final void e() {
        a.a("disconnect(); ServiceListener=%s, isConnected=%b", this.O, Boolean.valueOf(i()));
        ppc ppc = this.O;
        this.O = null;
        if (ppc == null || ppc.a() == null) {
            a.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        x();
        try {
            ((ppn) v()).a();
        } catch (RemoteException | IllegalStateException e) {
            a.b("Error while disconnecting the controller interface: %s", e.getMessage());
        } finally {
            super.e();
        }
    }

    public final Bundle f() {
        Bundle bundle = this.Q;
        if (bundle == null) {
            return null;
        }
        this.Q = null;
        return bundle;
    }

    /* Access modifiers changed, original: protected|final */
    public final Bundle g() {
        Bundle bundle = new Bundle();
        a.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.o, this.p);
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this.c);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.M);
        Bundle bundle2 = this.N;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.O = new ppc(this);
        IBinder iBinder = this.O;
        iBinder.asBinder();
        bundle.putParcelable("listener", new BinderWrapper(iBinder));
        String str = this.o;
        if (str != null) {
            bundle.putString("last_application_id", str);
            str = this.p;
            if (str != null) {
                bundle.putString("last_session_id", str);
            }
        }
        return bundle;
    }

    public final void a(ptu ptu) {
        synchronized (t) {
            ptu ptu2 = this.r;
            if (ptu2 != null) {
                ptu2.a(new ppd(new Status(2002)));
            }
            this.r = ptu;
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        pjj pjj;
        synchronized (this.e) {
            pjj = (pjj) this.e.remove(str);
        }
        if (pjj != null) {
            try {
                ((ppn) v()).c(str);
            } catch (IllegalStateException e) {
                a.b("Error unregistering namespace (%s): %s", str, e.getMessage());
            }
        }
    }

    public final void a(psa psa) {
        super.a(psa);
        x();
    }

    private final void x() {
        a.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.e) {
            this.e.clear();
        }
    }

    public final boolean h() {
        if (this.P) {
            ppc ppc = this.O;
            if (!(ppc == null || ppc.a.get() == null)) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j, int i) {
        ptu ptu;
        synchronized (this.q) {
            ptu = (ptu) this.q.remove(Long.valueOf(j));
        }
        if (ptu != null) {
            ptu.a(new Status(i));
        }
    }

    public final void a(int i) {
        synchronized (t) {
            ptu ptu = this.r;
            if (ptu != null) {
                ptu.a(new ppd(new Status(i)));
                this.r = null;
            }
        }
    }

    public final void b(int i) {
        synchronized (u) {
            ptu ptu = this.s;
            if (ptu != null) {
                ptu.a(new Status(i));
                this.s = null;
            }
        }
    }
}
