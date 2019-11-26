package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: alwl */
public final class alwl extends BroadcastReceiver {
    public boolean a = false;
    public xcq b;
    public xcq c;
    public xcq d;
    public tub e;
    public ttx f;
    public ttw g;
    public long h = -1;
    public long i = -1;
    public final Object j = new Object();
    public final Application k;
    public final xci l;
    public final xsc m;
    public final ScheduledExecutorService n;
    public final bcaa o;
    public final bcaa p;
    public final bcaa q;
    public final bcaa r;
    public final Runnable s = new alwr(this);
    public ScheduledFuture t;
    private final Executor u;

    public alwl(Application application, xci xci, xsc xsc, ScheduledExecutorService scheduledExecutorService, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.k = application;
        this.l = xci;
        this.m = xsc;
        this.n = scheduledExecutorService;
        this.o = bcaa;
        this.p = bcaa2;
        this.q = bcaa3;
        this.r = bcaa4;
        this.u = ankc.a((Executor) scheduledExecutorService);
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        synchronized (this.j) {
            z = this.a;
        }
        if (z) {
            if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                ((alwe) this.o.get()).j = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                ((alwe) this.o.get()).j = false;
            } else if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                ((alwe) this.o.get()).a(intent);
                alws alws = (alws) this.p.get();
                synchronized (alws.a) {
                    for (alvy alvy : alws.b.values()) {
                        if (alvy.a()) {
                            alvy.d();
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        synchronized (this.j) {
            ScheduledFuture scheduledFuture = this.t;
            if (!(scheduledFuture == null || scheduledFuture.isCancelled())) {
                this.t.cancel(true);
            }
        }
    }

    public final void b() {
        this.u.execute(new alwp(this));
        alws alws = (alws) this.p.get();
        synchronized (alws.a) {
            for (alvy alvy : alws.b.values()) {
                if (alvy.a()) {
                    alvy.c();
                }
            }
        }
    }

    public final void c() {
        this.u.execute(new alwo(this));
        alws alws = (alws) this.p.get();
        synchronized (alws.a) {
            for (alvy alvy : alws.b.values()) {
                if (alvy.a()) {
                    alvy.b();
                }
            }
        }
    }
}
