package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: pvq */
public final class pvq implements pwe, pxn {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final psh d;
    public final pvs e;
    public final Map f;
    public final Map g = new HashMap();
    public final pyp h;
    public final Map i;
    public final psq j;
    public volatile pvr k;
    public int l;
    public final pvk m;
    public final pwh n;
    private psa o = null;

    public pvq(Context context, pvk pvk, Lock lock, Looper looper, psh psh, Map map, pyp pyp, Map map2, psq psq, ArrayList arrayList, pwh pwh) {
        this.c = context;
        this.a = lock;
        this.d = psh;
        this.f = map;
        this.h = pyp;
        this.i = map2;
        this.j = psq;
        this.m = pvk;
        this.n = pwh;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((pxk) arrayList.get(i)).b = this;
            i = i2;
        }
        this.e = new pvs(this, looper);
        this.b = lock.newCondition();
        this.k = new pvl(this);
    }

    public final pts a(pts pts) {
        pts.f();
        return this.k.a(pts);
    }

    public final pts b(pts pts) {
        pts.f();
        return this.k.b(pts);
    }

    public final void a() {
        this.k.c();
    }

    public final psa b() {
        a();
        while (e()) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new psa(15, null);
            }
        }
        if (d()) {
            return psa.a;
        }
        psa psa = this.o;
        if (psa == null) {
            psa = new psa(13, null);
        }
        return psa;
    }

    public final void c() {
        if (this.k.b()) {
            this.g.clear();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(psa psa) {
        this.a.lock();
        try {
            this.o = psa;
            this.k = new pvl(this);
            this.k.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final boolean d() {
        return this.k instanceof puw;
    }

    public final boolean e() {
        return this.k instanceof puy;
    }

    public final void a(psa psa, pso pso, boolean z) {
        this.a.lock();
        try {
            this.k.a(psa, pso, z);
        } finally {
            this.a.unlock();
        }
    }

    public final void a(Bundle bundle) {
        this.a.lock();
        try {
            this.k.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    public final void a(int i) {
        this.a.lock();
        try {
            this.k.a(i);
        } finally {
            this.a.unlock();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(pvt pvt) {
        this.e.sendMessage(this.e.obtainMessage(1, pvt));
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.k);
        for (pso pso : this.i.keySet()) {
            printWriter.append(str).append(pso.a).println(":");
            ((psw) this.f.get(pso.b())).a(concat, printWriter);
        }
    }
}
