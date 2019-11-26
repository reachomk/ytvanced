package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aizh */
public final class aizh implements aizi, aizm, aizo {
    private final amqv a;
    private final boolean b;
    private final Set c;
    private final String d;
    private boolean e;
    private boolean f;
    private boolean g;
    private aafc h;
    private aafv i;

    public aizh(String str, boolean z, amqv amqv) {
        this.a = (amqv) amqw.a((Object) amqv);
        this.d = str;
        this.b = z;
        this.c = new HashSet();
    }

    public final void a(aizl aizl, aiqq aiqq) {
    }

    public final boolean b(aiqq aiqq) {
        return true;
    }

    public final void bE_() {
    }

    public aizh(aizg aizg, amqv amqv) {
        amqw.a((Object) aizg);
        this.a = (amqv) amqw.a((Object) amqv);
        this.d = aizg.a;
        this.i = aizg.b;
        this.f = aizg.c;
        this.e = aizg.d;
        this.b = false;
        this.c = new HashSet();
        f();
    }

    public final void a(aafv aafv) {
        this.i = aafv;
        f();
    }

    public final boolean a() {
        aafv aafv = this.i;
        if (aafv != null) {
            aafl aafl = aafv.i;
            if (aafl != null && aafl.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        aafv aafv = this.i;
        if (aafv != null) {
            aafl aafl = aafv.i;
            if (aafl != null && aafl.a()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void o_(boolean z) {
        this.e = z;
        f();
    }

    public final synchronized boolean b() {
        return this.e;
    }

    public final synchronized void b(boolean z) {
        this.f = z;
        f();
    }

    public final synchronized boolean e() {
        return this.f;
    }

    public final synchronized void a(boolean z) {
        this.g = z;
        f();
    }

    public final aizl a(aiqq aiqq) {
        return c(aiqq) ? new aizl(aizn.JUMP, aiqq) : null;
    }

    public final aiqq a(aizl aizl) {
        int ordinal = aizl.e.ordinal();
        aiqs a;
        if (ordinal == 0) {
            a = aiqq.a();
            a.a = g();
            return a.b();
        } else if (ordinal == 1) {
            a = aiqq.a();
            a.a = this.h.c();
            return a.b();
        } else if (ordinal == 2) {
            a = aiqq.a();
            a.a = h();
            a.e = true;
            a.d = true;
            return a.b();
        } else if (ordinal == 3) {
            a = aiqq.a();
            a.a = i();
            a.e = true;
            a.d = true;
            return a.b();
        } else if (ordinal == 4) {
            return aizl.f;
        } else {
            String valueOf = String.valueOf(aizl.e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 29);
            stringBuilder.append("Unsupported navigation type: ");
            stringBuilder.append(valueOf);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    public final aiqw bD_() {
        return aiqw.a;
    }

    private final boolean c(aiqq aiqq) {
        return !TextUtils.isEmpty(this.d) && TextUtils.equals(aiqq.c(), this.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0022  */
    private final synchronized void f() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.i;	 Catch:{ all -> 0x0058 }
        r1 = 0;
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        goto L_0x0038;
    L_0x0007:
        r0 = r0.i;	 Catch:{ all -> 0x0058 }
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        goto L_0x0038;
    L_0x000c:
        r0 = r4.e;	 Catch:{ all -> 0x0058 }
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x001b;
    L_0x0012:
        r0 = r4.a();	 Catch:{ all -> 0x0058 }
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x001b;
    L_0x0019:
        r0 = 1;
        goto L_0x001c;
    L_0x001b:
        r0 = 0;
    L_0x001c:
        r4.e = r0;	 Catch:{ all -> 0x0058 }
        r0 = r4.f;	 Catch:{ all -> 0x0058 }
        if (r0 == 0) goto L_0x002a;
    L_0x0022:
        r0 = r4.d();	 Catch:{ all -> 0x0058 }
        if (r0 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x002a;
    L_0x0029:
        r2 = 1;
    L_0x002a:
        r4.f = r2;	 Catch:{ all -> 0x0058 }
        r0 = r4.i;	 Catch:{ all -> 0x0058 }
        r0 = r0.i;	 Catch:{ all -> 0x0058 }
        r1 = r4.e;	 Catch:{ all -> 0x0058 }
        r3 = r4.g;	 Catch:{ all -> 0x0058 }
        r1 = r0.a(r1, r2, r3);	 Catch:{ all -> 0x0058 }
    L_0x0038:
        r0 = r4.h;	 Catch:{ all -> 0x0058 }
        if (r0 == r1) goto L_0x0056;
    L_0x003c:
        r4.h = r1;	 Catch:{ all -> 0x0058 }
        r0 = r4.c;	 Catch:{ all -> 0x0058 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0058 }
    L_0x0044:
        r1 = r0.hasNext();	 Catch:{ all -> 0x0058 }
        if (r1 == 0) goto L_0x0054;
    L_0x004a:
        r1 = r0.next();	 Catch:{ all -> 0x0058 }
        r1 = (defpackage.aizp) r1;	 Catch:{ all -> 0x0058 }
        r1.a();	 Catch:{ all -> 0x0058 }
        goto L_0x0044;
    L_0x0054:
        monitor-exit(r4);
        return;
    L_0x0056:
        monitor-exit(r4);
        return;
    L_0x0058:
        r0 = move-exception;
        monitor-exit(r4);
        goto L_0x005c;
    L_0x005b:
        throw r0;
    L_0x005c:
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizh.f():void");
    }

    private final apxu g() {
        aafc aafc = this.h;
        return (aafc == null || !a(aafc.b())) ? null : this.h.b();
    }

    private final apxu h() {
        aafc aafc = this.h;
        return (aafc == null || !a(aafc.a())) ? null : this.h.a();
    }

    private final apxu i() {
        aafc aafc = this.h;
        return (aafc == null || !a(aafc.d())) ? null : this.h.d();
    }

    private final boolean a(apxu apxu) {
        return apxu != null && this.a.a(apxu);
    }

    public final synchronized void a(aizp aizp) {
        this.c.add(aizp);
    }

    public final synchronized void b(aizp aizp) {
        this.c.remove(aizp);
    }

    public final synchronized aizu c() {
        return new aizg(this.d, this.i, this.f, this.e);
    }

    public final int b(aizl aizl) {
        int ordinal = aizl.e.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            if (g() != null) {
                z = true;
            }
            return aizl.a(z);
        } else if (ordinal != 1) {
            int i = 3;
            if (ordinal == 2) {
                if (h() != null && this.b) {
                    i = 2;
                } else if (this.i == null) {
                    return i;
                } else {
                    return 1;
                }
                return i;
            } else if (ordinal != 3) {
                return (ordinal == 4 && c(aizl.f)) ? 2 : 1;
            } else {
                if (i() != null) {
                    z = true;
                }
                return aizl.a(z);
            }
        } else {
            aafc aafc = this.h;
            apxu apxu = null;
            if (aafc != null && a(aafc.c())) {
                apxu = this.h.c();
            }
            if (apxu != null) {
                z = true;
            }
            return aizl.a(z);
        }
    }
}
