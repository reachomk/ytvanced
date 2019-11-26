package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: brl */
public class brl implements cev {
    private static final cgg e = ((cgg) cgg.b(Bitmap.class).j());
    public final bqy a;
    public final Context b;
    public final cew c;
    public final CopyOnWriteArrayList d;
    private final cfd f;
    private final cfe g;
    private final cfi h = new cfi();
    private final Runnable i = new bro(this);
    private final Handler j = new Handler(Looper.getMainLooper());
    private final cen k;
    private cgg l;

    public brl(bqy bqy, cew cew, cfe cfe, Context context) {
        cfd cfd = new cfd();
        cep cep = bqy.f;
        this.a = bqy;
        this.c = cew;
        this.g = cfe;
        this.f = cfd;
        this.b = context;
        this.k = cep.a(context.getApplicationContext(), new brq(this, cfd));
        if (chv.c()) {
            this.j.post(this.i);
        } else {
            cew.a(this);
        }
        cew.a(this.k);
        this.d = new CopyOnWriteArrayList(bqy.b.e);
        a(bqy.b.a());
        synchronized (bqy.g) {
            if (bqy.g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bqy.g.add(this);
        }
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void a(cgg cgg) {
        this.l = (cgg) ((cgg) ((cfy) cgg.clone())).k();
    }

    public synchronized brl b(cgg cgg) {
        a(cgg);
        return this;
    }

    private final synchronized void g() {
        cfd cfd = this.f;
        cfd.c = true;
        for (cfz cfz : chv.a(cfd.a)) {
            if (cfz.c()) {
                cfz.b();
                cfd.b.add(cfz);
            }
        }
    }

    private final synchronized void h() {
        cfd cfd = this.f;
        cfd.c = false;
        for (cfz cfz : chv.a(cfd.a)) {
            if (!(cfz.d() || cfz.c())) {
                cfz.a();
            }
        }
        cfd.b.clear();
    }

    public final synchronized void a() {
        h();
        this.h.a();
    }

    public final synchronized void b() {
        g();
        this.h.b();
    }

    public final synchronized void c() {
        this.h.c();
        for (cgu a : chv.a(this.h.a)) {
            a(a);
        }
        this.h.a.clear();
        cfd cfd = this.f;
        for (cfz a2 : chv.a(cfd.a)) {
            cfd.a(a2, false);
        }
        cfd.b.clear();
        this.c.b(this);
        this.c.b(this.k);
        this.j.removeCallbacks(this.i);
        bqy bqy = this.a;
        synchronized (bqy.g) {
            if (bqy.g.contains(this)) {
                bqy.g.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public brj d() {
        return (brj) a(Bitmap.class).b(e);
    }

    public brj e() {
        return a(Drawable.class);
    }

    public brj a(String str) {
        return e().a(str);
    }

    public brj a(Uri uri) {
        return e().a(uri);
    }

    public brj a(Integer num) {
        return e().a(num);
    }

    public brj a(Object obj) {
        return e().a(obj);
    }

    public brj a(Class cls) {
        return new brj(this.a, this, cls, this.b);
    }

    public final void a(View view) {
        a(new brn(view));
    }

    /* JADX WARNING: Missing block: B:28:0x0040, code skipped:
            return;
     */
    public final synchronized void a(defpackage.cgu r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        if (r4 == 0) goto L_0x0044;
    L_0x0003:
        r0 = r3.b(r4);	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x003f;
    L_0x0009:
        r0 = r3.a;	 Catch:{ all -> 0x0041 }
        r1 = r0.g;	 Catch:{ all -> 0x0041 }
        monitor-enter(r1);	 Catch:{ all -> 0x0041 }
        r0 = r0.g;	 Catch:{ all -> 0x003c }
        r0 = r0.iterator();	 Catch:{ all -> 0x003c }
    L_0x0014:
        r2 = r0.hasNext();	 Catch:{ all -> 0x003c }
        if (r2 == 0) goto L_0x0028;
    L_0x001a:
        r2 = r0.next();	 Catch:{ all -> 0x003c }
        r2 = (defpackage.brl) r2;	 Catch:{ all -> 0x003c }
        r2 = r2.b(r4);	 Catch:{ all -> 0x003c }
        if (r2 == 0) goto L_0x0014;
    L_0x0026:
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        goto L_0x003f;
    L_0x0028:
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        r0 = r4.d();	 Catch:{ all -> 0x0041 }
        if (r0 == 0) goto L_0x003f;
    L_0x002f:
        r0 = r4.d();	 Catch:{ all -> 0x0041 }
        r1 = 0;
        r4.a(r1);	 Catch:{ all -> 0x0041 }
        r0.b();	 Catch:{ all -> 0x0041 }
        monitor-exit(r3);
        return;
    L_0x003c:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        throw r4;	 Catch:{ all -> 0x0041 }
    L_0x003f:
        monitor-exit(r3);
        return;
    L_0x0041:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
    L_0x0044:
        monitor-exit(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brl.a(cgu):void");
    }

    private final synchronized boolean b(cgu cgu) {
        cfz d = cgu.d();
        if (d == null) {
            return true;
        }
        if (!this.f.a(d, true)) {
            return false;
        }
        this.h.a.remove(cgu);
        cgu.a(null);
        return true;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(cgu cgu, cfz cfz) {
        this.h.a.add(cgu);
        cfd cfd = this.f;
        cfd.a.add(cfz);
        if (cfd.c) {
            cfz.b();
            cfd.b.add(cfz);
            return;
        }
        cfz.a();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized cgg f() {
        return this.l;
    }

    public final synchronized String toString() {
        StringBuilder stringBuilder;
        String obj = super.toString();
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        int length = String.valueOf(obj).length();
        stringBuilder = new StringBuilder(((length + 21) + valueOf.length()) + valueOf2.length());
        stringBuilder.append(obj);
        stringBuilder.append("{tracker=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", treeNode=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static {
        cgg.b(cdr.class).j();
        ((cgg) cgg.b(bup.b).a(bre.LOW)).d();
    }
}
