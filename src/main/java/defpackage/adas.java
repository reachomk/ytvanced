package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: adas */
public final class adas implements adxz {
    public static final String a = xtl.b("MDX.browserchannel");
    private volatile long A;
    private final AtomicBoolean B = new AtomicBoolean(true);
    private final ScheduledExecutorService C;
    public final adbe b = new adax(this);
    public final adag c;
    public final Queue d = new LinkedBlockingQueue(10);
    public final AtomicBoolean e;
    public final xci f;
    public adxy g;
    public adba h;
    public adbf i;
    public adya j;
    public final Object k = new Object();
    public Thread l = null;
    public boolean m = true;
    public final AtomicBoolean n = new AtomicBoolean(false);
    public final int o = 5000;
    public int p;
    public CountDownLatch q;
    public CountDownLatch r;
    public ScheduledFuture s;
    private final Context t;
    private final ExecutorService u;
    private final Timer v;
    private final long w;
    private final Object x = new Object();
    private Thread y = null;
    private TimerTask z;

    public adas(Context context, adag adag, xci xci) {
        this.t = (Context) amqw.a((Object) context);
        this.c = (adag) amqw.a((Object) adag);
        this.w = 240000;
        this.f = xci;
        g();
        this.r = new CountDownLatch(0);
        this.q = new CountDownLatch(0);
        this.e = new AtomicBoolean(false);
        this.u = Executors.newSingleThreadExecutor(new xaf("mdxMsg"));
        this.C = Executors.newSingleThreadScheduledExecutor(new xaf("mdxTimeout"));
        this.v = new Timer("Timer - Reconnect to RC server");
    }

    public final void a(adxy adxy) {
        int e = e();
        boolean z = false;
        if (!(e == 2 || e == 1)) {
            z = true;
        }
        Object obj = e != 0 ? e != 1 ? e != 2 ? e != 3 ? "Unknown" : "Reconnecting" : "Connected" : "Connecting" : "Disconnected";
        amqw.b(z, "Improper state while setting message listener: %s", obj);
        this.g = adxy;
    }

    public final void a(adya adya) {
        amqw.a((Object) adya);
        this.j = adya;
    }

    public final void a() {
        amqw.a(this.g, (Object) "asyncConnect() called w/o channelMessageListener being set.");
        b();
    }

    public final void b() {
        if (this.q.getCount() != 0) {
            xtl.c(a, "Already in the process of connecting. Ignoring connect request");
            return;
        }
        this.p = 0;
        c(true);
        this.r.countDown();
        synchronized (this.x) {
            Thread thread = this.y;
            if (!(thread == null || thread.isInterrupted())) {
                this.y.interrupt();
            }
            this.y = new adaw(this, "mdxAsyncConnect");
            this.y.start();
        }
    }

    public final void a(adiv adiv, adja adja) {
        this.f.d(new adcj(adiv, "cloud_bc"));
        this.d.offer(new adba(adiv, adja));
        if (this.h == null) {
            h();
        }
    }

    public final void a(boolean z) {
        this.e.set(true);
        for (adba adba : this.d) {
            String valueOf = String.valueOf(adba.a);
            String adja = adba.b.toString();
            valueOf.length();
            String.valueOf(adja).length();
        }
        this.d.clear();
        TimerTask timerTask = this.z;
        if (timerTask != null) {
            timerTask.cancel();
            this.z = null;
        }
        try {
            this.q.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            xtl.a(a, "Interrupted while waiting for BC to connect", e);
        }
        if (this.q.getCount() > 0) {
            xtl.a(a, "Timed out while waiting for BC to connect. Will attempt stopping the connection.");
        }
        if (this.n.get()) {
            b(z);
        }
        this.n.set(false);
        c(false);
    }

    public final void c() {
        this.i.c();
    }

    public final void d() {
        amqw.a(this.g, (Object) "asyncReconnect() called w/o channelMessageListener being set.");
        if (this.n.get()) {
            i();
        }
    }

    public final int e() {
        if (this.n.get()) {
            return 2;
        }
        if (f()) {
            return 1;
        }
        return this.r.getCount() != 0 ? 3 : 0;
    }

    public final boolean f() {
        return this.q.getCount() != 0;
    }

    public final void b(boolean z) {
        synchronized (this.k) {
            Thread thread = this.l;
            if (thread != null) {
                thread.interrupt();
            }
        }
        this.i.a(z);
    }

    public final void g() {
        this.B.set(true);
        this.A = (long) (((int) (Math.random() * 1000.0d)) + 2000);
    }

    public final synchronized void h() {
        adba adba = (adba) this.d.peek();
        this.h = adba;
        if (adba != null) {
            this.s = this.C.schedule(new adau(this, this.u.submit(new adav(this))), (long) this.o, TimeUnit.MILLISECONDS);
        }
    }

    public final void i() {
        this.n.set(false);
        c(false);
        b(false);
        if (!this.e.get()) {
            if (this.B.compareAndSet(true, false)) {
                a(this.j);
                b();
                return;
            }
            Object obj = this.t;
            amqw.a(obj, (Object) "Call Network.setContext() before calling this method");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) obj.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                this.t.sendBroadcast(adij.CLOUD_SERVICE_NO_NETWORK.a());
            }
            if (this.r.getCount() == 0) {
                long j = this.A;
                this.A = j + j;
                if (this.A >= this.w) {
                    xtl.a(a, "Reconnecting for too long, abort");
                    this.t.sendBroadcast(adij.LOUNGE_SERVER_CONNECTION_ERROR.a());
                    g();
                    return;
                }
                j = this.A;
                this.r = new CountDownLatch(1);
                this.z = new adbb(this);
                this.v.schedule(this.z, this.A);
            }
        }
    }

    private final void c(boolean z) {
        if (z) {
            this.q = new CountDownLatch(1);
        } else {
            this.q.countDown();
        }
    }
}
