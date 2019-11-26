package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pyd */
public abstract class pyd {
    private static final psc[] a = new psc[0];
    public final Object A;
    public final Object B;
    public pyz C;
    public pye D;
    public final ArrayList E;
    public int F;
    public final pyc G;
    public final pyf H;
    public psa I;
    public boolean J;
    public volatile pyu K;
    public AtomicInteger L;
    private long b;
    private int c;
    private long d;
    private qap e;
    private final pyw f;
    private final psh g;
    private IInterface h;
    private pyk i;
    private final int j;
    private final String k;
    public int v;
    public long w;
    public final Context x;
    public final Looper y;
    public final Handler z;

    protected pyd(Context context, Looper looper, pyc pyc, pyf pyf) {
        this(context, looper, pyw.a(context), psh.d, 116, (pyc) pzr.a((Object) pyc), (pyf) pzr.a((Object) pyf), null);
    }

    public abstract IInterface a(IBinder iBinder);

    public abstract String a();

    public abstract String b();

    public Bundle f() {
        return null;
    }

    public boolean k() {
        return false;
    }

    public final boolean l() {
        return true;
    }

    public final boolean m() {
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void p() {
    }

    public Account r() {
        return null;
    }

    protected pyd(Context context, Looper looper, pyw pyw, psh psh, int i, pyc pyc, pyf pyf, String str) {
        this.A = new Object();
        this.B = new Object();
        this.E = new ArrayList();
        this.F = 1;
        this.I = null;
        this.J = false;
        this.K = null;
        this.L = new AtomicInteger(0);
        this.x = (Context) pzr.a((Object) context, (Object) "Context must not be null");
        this.y = (Looper) pzr.a((Object) looper, (Object) "Looper must not be null");
        this.f = (pyw) pzr.a((Object) pyw, (Object) "Supervisor must not be null");
        this.g = (psh) pzr.a((Object) psh, (Object) "API availability must not be null");
        this.z = new pyj(this, looper);
        this.j = i;
        this.G = pyc;
        this.H = pyf;
        this.k = str;
    }

    private final String d() {
        String str = this.k;
        return str == null ? this.x.getClass().getName() : str;
    }

    public final psc[] o() {
        pyu pyu = this.K;
        return pyu != null ? pyu.b : null;
    }

    /* Access modifiers changed, original: protected */
    public void a(psa psa) {
        this.c = psa.b;
        this.d = System.currentTimeMillis();
    }

    private final void a(int i, IInterface iInterface) {
        boolean z = false;
        if ((i != 4 ? null : 1) == (iInterface == null ? null : 1)) {
            z = true;
        }
        pzr.b(z);
        synchronized (this.A) {
            this.F = i;
            this.h = iInterface;
            p();
            pyk pyk;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    pyw pyw;
                    qap qap;
                    String str;
                    if (this.i != null) {
                        qap qap2 = this.e;
                        if (qap2 != null) {
                            String str2 = qap2.a;
                            String str3 = qap2.b;
                            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 70) + String.valueOf(str3).length());
                            stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
                            stringBuilder.append(str2);
                            stringBuilder.append(" on ");
                            stringBuilder.append(str3);
                            Log.e("GmsClient", stringBuilder.toString());
                            pyw = this.f;
                            qap = this.e;
                            str2 = qap.a;
                            str = qap.b;
                            pyk = this.i;
                            d();
                            pyw.a(str2, str, 129, pyk);
                            this.L.incrementAndGet();
                        }
                    }
                    this.i = new pyk(this, this.L.get());
                    this.e = new qap("com.google.android.gms", a());
                    pyw = this.f;
                    qap = this.e;
                    if (!pyw.a(new pyv(qap.a, qap.b, 129), this.i, d())) {
                        qap qap3 = this.e;
                        str = qap3.a;
                        String str4 = qap3.b;
                        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str4).length());
                        stringBuilder2.append("unable to connect to service: ");
                        stringBuilder2.append(str);
                        stringBuilder2.append(" on ");
                        stringBuilder2.append(str4);
                        Log.e("GmsClient", stringBuilder2.toString());
                        a(16, this.L.get());
                    }
                } else if (i == 4) {
                    this.b = System.currentTimeMillis();
                }
            } else if (this.i != null) {
                pyk = this.i;
                d();
                this.f.a(a(), "com.google.android.gms", 129, pyk);
                this.i = null;
            }
        }
    }

    public final boolean a(int i, int i2, IInterface iInterface) {
        synchronized (this.A) {
            if (this.F != i) {
                return false;
            }
            a(i2, iInterface);
            return true;
        }
    }

    public final void q() {
        int b = psh.b(this.x, c());
        if (b != 0) {
            a(1, null);
            this.D = (pye) pzr.a(new pyn(this), (Object) "Connection progress callbacks cannot be null.");
            Handler handler = this.z;
            handler.sendMessage(handler.obtainMessage(3, this.L.get(), b, null));
            return;
        }
        a(new pyn(this));
    }

    public final void a(pye pye) {
        this.D = (pye) pzr.a((Object) pye, (Object) "Connection progress callbacks cannot be null.");
        a(2, null);
    }

    public final boolean i() {
        boolean z;
        synchronized (this.A) {
            z = this.F == 4;
        }
        return z;
    }

    public final boolean j() {
        boolean z;
        synchronized (this.A) {
            int i = this.F;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    public void e() {
        this.L.incrementAndGet();
        synchronized (this.E) {
            int size = this.E.size();
            for (int i = 0; i < size; i++) {
                ((pyi) this.E.get(i)).e();
            }
            this.E.clear();
        }
        synchronized (this.B) {
            this.C = null;
        }
        a(1, null);
    }

    public final void c(int i) {
        Handler handler = this.z;
        handler.sendMessage(handler.obtainMessage(6, this.L.get(), i));
    }

    public psc[] s() {
        return a;
    }

    public psc[] t() {
        return a;
    }

    /* Access modifiers changed, original: protected */
    public Bundle g() {
        return new Bundle();
    }

    /* Access modifiers changed, original: protected */
    public void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.z;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new pym(this, i, iBinder, bundle)));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, int i2) {
        Handler handler = this.z;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new pyo(this, i)));
    }

    public final void u() {
        if (!i()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final IInterface v() {
        IInterface iInterface;
        synchronized (this.A) {
            if (this.F != 5) {
                u();
                pzr.a(this.h != null, (Object) "Client is connected but service is null");
                iInterface = this.h;
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public final void a(pyy pyy, Set set) {
        Bundle g = g();
        pyt pyt = new pyt(this.j);
        pyt.a = this.x.getPackageName();
        pyt.d = g;
        if (set != null) {
            pyt.c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (k()) {
            Account account;
            if (r() == null) {
                account = new Account("<<default account>>", "com.google");
            } else {
                account = r();
            }
            pyt.e = account;
            if (pyy != null) {
                pyt.b = pyy.asBinder();
            }
        }
        pyt.f = s();
        pyt.g = t();
        try {
            synchronized (this.B) {
                pyz pyz = this.C;
                if (pyz == null) {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                } else {
                    pyz.a(new pyl(this, this.L.get()), pyt);
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            c(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            a(8, null, null, this.L.get());
        }
    }

    public final void a(pyh pyh) {
        pvy pvy = (pvy) pyh;
        pvy.a.h.m.post(new pwb(pvy));
    }

    /* Access modifiers changed, original: protected */
    public Set w() {
        return Collections.EMPTY_SET;
    }

    public final void a(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        pyz pyz;
        PrintWriter append;
        synchronized (this.A) {
            i = this.F;
            iInterface = this.h;
        }
        synchronized (this.B) {
            pyz = this.C;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(b()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pyz == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(pyz.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.b > 0) {
            append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.b;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(format).length() + 21);
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(format);
            append.println(stringBuilder.toString());
        }
        if (this.w > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            i = this.v;
            if (i == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i != 2) {
                printWriter.append(String.valueOf(i));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            append = printWriter.append(" lastSuspendedTime=");
            long j2 = this.w;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(format2).length() + 21);
            stringBuilder2.append(j2);
            stringBuilder2.append(" ");
            stringBuilder2.append(format2);
            append.println(stringBuilder2.toString());
        }
        if (this.d > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(pta.a(this.c));
            PrintWriter append2 = printWriter.append(" lastFailedTime=");
            long j3 = this.d;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(format3).length() + 21);
            stringBuilder3.append(j3);
            stringBuilder3.append(" ");
            stringBuilder3.append(format3);
            append2.println(stringBuilder3.toString());
        }
    }

    public final String n() {
        if (i()) {
            qap qap = this.e;
            if (qap != null) {
                return qap.b;
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int c() {
        return psh.c;
    }
}
