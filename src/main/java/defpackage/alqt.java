package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: alqt */
public final class alqt extends Observable implements xcp {
    public final bapu a;
    public final bapu b;
    public final bapu c;
    public final acum d;
    public final ScheduledExecutorService e;
    public int f = 0;
    private final bapu g;
    private final xhv h;
    private final xci i;
    private final bapu j;
    private final Map k = new HashMap();
    private final alqq l;
    private final Map m = new HashMap();

    public alqt(bapu bapu, xhv xhv, xci xci, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, acum acum, ScheduledExecutorService scheduledExecutorService) {
        this.g = bapu;
        this.h = xhv;
        this.i = xci;
        this.j = bapu2;
        this.a = bapu3;
        this.b = bapu4;
        this.c = bapu5;
        this.d = acum;
        this.e = scheduledExecutorService;
        this.l = new alqs(this);
    }

    /* JADX WARNING: Missing block: B:14:0x003c, code skipped:
            return;
     */
    public final synchronized void a() {
        /*
        r3 = this;
        monitor-enter(r3);
        defpackage.xak.b();	 Catch:{ all -> 0x003f }
        r0 = r3.f;	 Catch:{ all -> 0x003f }
        r1 = 1;
        if (r0 == r1) goto L_0x003d;
    L_0x0009:
        if (r0 != 0) goto L_0x0010;
    L_0x000b:
        r0 = r3.i;	 Catch:{ all -> 0x003f }
        r0.a(r3);	 Catch:{ all -> 0x003f }
    L_0x0010:
        r3.f = r1;	 Catch:{ all -> 0x003f }
        r0 = r3.g;	 Catch:{ all -> 0x003f }
        r0 = r0.get();	 Catch:{ all -> 0x003f }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x003f }
        r0 = r0.iterator();	 Catch:{ all -> 0x003f }
    L_0x001e:
        r1 = r0.hasNext();	 Catch:{ all -> 0x003f }
        if (r1 == 0) goto L_0x0030;
    L_0x0024:
        r1 = r0.next();	 Catch:{ all -> 0x003f }
        r1 = (defpackage.alqr) r1;	 Catch:{ all -> 0x003f }
        r2 = r3.l;	 Catch:{ all -> 0x003f }
        r1.a(r2);	 Catch:{ all -> 0x003f }
        goto L_0x001e;
    L_0x0030:
        r0 = r3.h;	 Catch:{ all -> 0x003f }
        r0 = r0.c();	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x003b;
    L_0x0038:
        r3.f();	 Catch:{ all -> 0x003f }
    L_0x003b:
        monitor-exit(r3);
        return;
    L_0x003d:
        monitor-exit(r3);
        return;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r3);
        goto L_0x0043;
    L_0x0042:
        throw r0;
    L_0x0043:
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqt.a():void");
    }

    public final synchronized void b() {
        xak.b();
        if (this.f != 0) {
            this.f = 2;
            for (alqr b : (List) this.g.get()) {
                b.b(this.l);
            }
            g();
        }
    }

    public final synchronized void c() {
        xak.b();
        if (this.f == 2) {
            a();
        }
    }

    private final synchronized void f() {
        for (alqr a : (List) this.g.get()) {
            a.a(this.h);
        }
        h();
        for (alqv alqv : this.k.values()) {
            synchronized (alqv.h) {
                if (alqv.e) {
                    alqv.e = false;
                    alqv.h.e.execute(alqv);
                }
            }
        }
    }

    private final synchronized void g() {
        for (alqr a : (List) this.g.get()) {
            a.a();
        }
    }

    /* JADX WARNING: Missing block: B:12:0x002c, code skipped:
            return;
     */
    private final synchronized void a(defpackage.xgg r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r3 = r3.a;	 Catch:{ all -> 0x0035 }
        if (r3 == 0) goto L_0x002d;
    L_0x0005:
        r3 = r2.f;	 Catch:{ all -> 0x0035 }
        r0 = 1;
        if (r3 != r0) goto L_0x002b;
    L_0x000a:
        r3 = r2.g;	 Catch:{ all -> 0x0035 }
        r3 = r3.get();	 Catch:{ all -> 0x0035 }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x0035 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0035 }
    L_0x0016:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x0028;
    L_0x001c:
        r0 = r3.next();	 Catch:{ all -> 0x0035 }
        r0 = (defpackage.alqr) r0;	 Catch:{ all -> 0x0035 }
        r1 = r2.h;	 Catch:{ all -> 0x0035 }
        r0.b(r1);	 Catch:{ all -> 0x0035 }
        goto L_0x0016;
    L_0x0028:
        r2.h();	 Catch:{ all -> 0x0035 }
    L_0x002b:
        monitor-exit(r2);
        return;
    L_0x002d:
        r2.g();	 Catch:{ all -> 0x0035 }
        r2.i();	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);
        return;
    L_0x0035:
        r3 = move-exception;
        monitor-exit(r2);
        goto L_0x0039;
    L_0x0038:
        throw r3;
    L_0x0039:
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqt.a(xgg):void");
    }

    private final void h() {
        if (this.h.e()) {
            for (String a : ((alqo) this.a.get()).a()) {
                a(a, "cache");
            }
        }
    }

    /* JADX WARNING: Missing block: B:19:0x004b, code skipped:
            return;
     */
    public final synchronized void a(java.lang.String r2, java.lang.String r3) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.k;	 Catch:{ all -> 0x004c }
        r0 = r0.containsKey(r2);	 Catch:{ all -> 0x004c }
        if (r0 != 0) goto L_0x004a;
    L_0x0009:
        r0 = r1.m;	 Catch:{ all -> 0x004c }
        r0 = r0.containsKey(r2);	 Catch:{ all -> 0x004c }
        if (r0 != 0) goto L_0x004a;
    L_0x0011:
        r0 = r1.b(r2, r3);	 Catch:{ all -> 0x004c }
        if (r0 != 0) goto L_0x0039;
    L_0x0017:
        r0 = "cache";
        r0 = r0.equals(r3);	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x002a;
    L_0x001f:
        r0 = r1.a;	 Catch:{ all -> 0x004c }
        r0 = r0.get();	 Catch:{ all -> 0x004c }
        r0 = (defpackage.alqo) r0;	 Catch:{ all -> 0x004c }
        r0.b(r2);	 Catch:{ all -> 0x004c }
    L_0x002a:
        r0 = new alqv;	 Catch:{ all -> 0x004c }
        r0.<init>(r1, r2, r3);	 Catch:{ all -> 0x004c }
        r3 = 3;
        r0.d = r3;	 Catch:{ all -> 0x004c }
        r3 = r1.k;	 Catch:{ all -> 0x004c }
        r3.put(r2, r0);	 Catch:{ all -> 0x004c }
        monitor-exit(r1);
        return;
    L_0x0039:
        r0 = new alqv;	 Catch:{ all -> 0x004c }
        r0.<init>(r1, r2, r3);	 Catch:{ all -> 0x004c }
        r3 = r1.k;	 Catch:{ all -> 0x004c }
        r3.put(r2, r0);	 Catch:{ all -> 0x004c }
        r2 = r1.e;	 Catch:{ all -> 0x004c }
        r2.execute(r0);	 Catch:{ all -> 0x004c }
        monitor-exit(r1);
        return;
    L_0x004a:
        monitor-exit(r1);
        return;
    L_0x004c:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqt.a(java.lang.String, java.lang.String):void");
    }

    public final boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            acum acum = this.d;
            alta alta = new alta();
            alta.a(str2);
            alta.b(4);
            acum.a(alta.a());
            afpc.a(2, afpf.spacecast, "FQDN missing from summary for https");
            return false;
        }
        alsa alsa = (alsa) this.c.get();
        String valueOf = String.valueOf(str);
        String str3 = "http://";
        if (alsa.e.matcher(Uri.parse(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf)).getHost()).matches()) {
            return true;
        }
        acum acum2 = this.d;
        alta alta2 = new alta();
        alta2.a(str2);
        alta2.b(3);
        acum2.a(alta2.a());
        afpc.a(1, afpf.spacecast, String.format("Invalid FQDN: %s. Expecting: %s", new Object[]{str, ((alsa) this.c.get()).e.toString()}));
        return false;
    }

    public final synchronized void a(alte alte, String str) {
        alte alte2 = alte;
        synchronized (this) {
            this.k.remove(str);
            if (this.m.containsKey(alte2.b)) {
                xtl.d(String.format("Duplicate Spacecast found: %s", new Object[]{alte2.b}));
                return;
            }
            Map map = this.m;
            String str2 = alte2.b;
            alrn alrn = (alrn) this.j.get();
            alsc alsc = (alsc) alrn.a((alsc) alrn.a.get(), 1);
            Executor executor = (Executor) alrn.a((Executor) alrn.b.get(), 2);
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) alrn.a((ScheduledExecutorService) alrn.c.get(), 3);
            xhf xhf = (xhf) alrn.a((xhf) alrn.d.get(), 4);
            afsa afsa = (afsa) alrn.a((afsa) alrn.e.get(), 5);
            alqb alqb = (alqb) alrn.a((alqb) alrn.f.get(), 6);
            acum acum = (acum) alrn.a((acum) alrn.g.get(), 7);
            xsc xsc = (xsc) alrn.a((xsc) alrn.h.get(), 8);
            xci xci = (xci) alrn.a((xci) alrn.i.get(), 9);
            alrc alrc = r6;
            alrc alrc2 = new alrc(alsc, executor, scheduledExecutorService, xhf, afsa, alqb, acum, xsc, xci, (alte) alrn.a(alte2, 10));
            map.put(str2, alrc);
            ((alqo) this.a.get()).a(alte2.b);
            setChanged();
            notifyObservers();
        }
    }

    private final synchronized void i() {
        for (alrc a : this.m.values()) {
            a.a(2, null);
        }
        this.m.clear();
        for (alqv alqv : this.k.values()) {
            alqv.f = true;
            ScheduledFuture scheduledFuture = alqv.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
        this.k.clear();
        setChanged();
        notifyObservers();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized Collection d() {
        return new ArrayList(this.m.values());
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized List e() {
        List emptyList;
        if (this.k.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.unmodifiableList(new ArrayList(this.k.values()));
        }
        return emptyList;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xgg.class};
        } else if (i == 0) {
            a((xgg) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
