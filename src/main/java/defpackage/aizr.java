package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: aizr */
public final class aizr implements aizi, aizm {
    private final aiqq a;
    private final String[] b;
    private final Set c;
    private boolean d;
    private int e;

    public aizr(aiqq aiqq) {
        this.a = aiqq;
        this.b = aizr.c(aiqq);
        this.e = aiqq.e();
        this.c = new HashSet();
    }

    public final void a(aafv aafv) {
    }

    public final void a(aizl aizl, aiqq aiqq) {
    }

    public final void a(boolean z) {
    }

    public final boolean a() {
        return true;
    }

    public final boolean b(aiqq aiqq) {
        return true;
    }

    public final void bE_() {
    }

    public aizr(aizq aizq) {
        this.a = aizq.a;
        this.b = aizr.c(this.a);
        this.e = aizq.b;
        this.c = new HashSet();
    }

    private static String[] c(aiqq aiqq) {
        return (String[]) aiqq.f().toArray(new String[0]);
    }

    public final synchronized void o_(boolean z) {
        boolean f = f();
        boolean d = d();
        this.d = z;
        if (!(f == f() && d == d())) {
            h();
        }
    }

    public final synchronized boolean b() {
        return this.d;
    }

    public final aizl a(aiqq aiqq) {
        return new aizl(aizn.JUMP, aiqq);
    }

    public final aiqq a(aizl aizl) {
        int ordinal = aizl.e.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return g();
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    afpc.a(1, afpf.player, "Autonav unsupported by VideoIdsSequenceNavigator.");
                    return null;
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
        }
        if (aizl.e != aizn.AUTOPLAY) {
            z = false;
        }
        return b(z);
    }

    public final aiqw bD_() {
        return aiqw.a;
    }

    /* JADX WARNING: Missing block: B:10:0x0011, code skipped:
            return r1;
     */
    private final synchronized boolean d() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.d;	 Catch:{ all -> 0x0012 }
        r1 = 1;
        if (r0 != 0) goto L_0x0010;
    L_0x0006:
        r0 = r2.e();	 Catch:{ all -> 0x0012 }
        if (r0 == 0) goto L_0x000e;
    L_0x000c:
        r1 = 0;
        goto L_0x0010;
    L_0x000e:
        monitor-exit(r2);
        return r1;
    L_0x0010:
        monitor-exit(r2);
        return r1;
    L_0x0012:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizr.d():boolean");
    }

    private final boolean e() {
        return this.e >= this.b.length + -1;
    }

    private final synchronized aiqq b(boolean z) {
        if (d()) {
            int i;
            if (this.d) {
                if (e()) {
                    i = 0;
                    a(i);
                    return a(this.e, z);
                }
            }
            i = this.e + 1;
            a(i);
            return a(this.e, z);
        }
        afpc.a(1, afpf.player, "Attempting to advance to non-existent video.");
        return null;
    }

    /* JADX WARNING: Missing block: B:10:0x000f, code skipped:
            return r1;
     */
    private final synchronized boolean f() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.d;	 Catch:{ all -> 0x0010 }
        r1 = 1;
        if (r0 != 0) goto L_0x000e;
    L_0x0006:
        r0 = r2.e;	 Catch:{ all -> 0x0010 }
        if (r0 > 0) goto L_0x000c;
    L_0x000a:
        r1 = 0;
        goto L_0x000e;
    L_0x000c:
        monitor-exit(r2);
        return r1;
    L_0x000e:
        monitor-exit(r2);
        return r1;
    L_0x0010:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizr.f():boolean");
    }

    private final synchronized aiqq g() {
        if (f()) {
            int max;
            if (!this.d || this.e > 0) {
                max = Math.max(0, this.e - 1);
            } else {
                max = this.b.length - 1;
            }
            a(max);
            return a(this.e, false);
        }
        afpc.a(1, afpf.player, "Attempting to go to prior video of the first video.");
        return null;
    }

    private final synchronized void a(int i) {
        if (this.e != i) {
            this.e = i;
            h();
        }
    }

    public final synchronized void a(aizp aizp) {
        this.c.add(aizp);
    }

    public final synchronized void b(aizp aizp) {
        this.c.remove(aizp);
    }

    private final synchronized void h() {
        for (aizp a : this.c) {
            a.a();
        }
    }

    public final aizu c() {
        return new aizq(this.a, this.e);
    }

    private final aiqq a(int i, boolean z) {
        int max = Math.max(0, Math.min(i, this.b.length - 1));
        if (max != i) {
            afpf afpf = afpf.player;
            StringBuilder stringBuilder = new StringBuilder(80);
            stringBuilder.append("Out of bounds access of video IDs list. Index ");
            stringBuilder.append(i);
            stringBuilder.append(" bounded to ");
            stringBuilder.append(max);
            afpc.a(1, afpf, stringBuilder.toString());
        }
        aiqs a = aiqq.a();
        a.a = airn.a(this.b[max], "", -1, 0.0f);
        a.e = z;
        a.d = z;
        return a.b();
    }

    public final int b(aizl aizl) {
        int ordinal = aizl.e.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return aizl.a(f());
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return ordinal != 4 ? 1 : 2;
                } else {
                    return aizl.a(false);
                }
            }
        }
        return aizl.a(d());
    }
}
