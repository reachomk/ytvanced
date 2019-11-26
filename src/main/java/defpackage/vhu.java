package defpackage;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vhu */
public final class vhu implements vgy {
    public final vhb a;
    public final CopyOnWriteArrayList b;
    public final zzl c;
    public final ScheduledExecutorService d;
    public final Executor e;
    public final String f;
    public final String g;
    public final vsm h;
    public ajpa i;
    private final ajmq j;
    private final vht k;
    private final AtomicReference l;
    private final long m;
    private final long n;
    private final long o;
    private final long p;
    private final ajmp q;
    private final ajmp r;
    private vdo s;

    public vhu(vhb vhb, ajmq ajmq, CopyOnWriteArrayList copyOnWriteArrayList, zzl zzl, ScheduledExecutorService scheduledExecutorService, Executor executor, vqy vqy, List list, long j, long j2, String str, String str2, vsm vsm, long j3, long j4) {
        ajmp vic;
        ajmp ajmp;
        ajmp ajmp2;
        this.a = vhb;
        this.j = ajmq;
        this.b = copyOnWriteArrayList;
        this.c = zzl;
        this.d = scheduledExecutorService;
        this.e = executor;
        this.k = new vht(list);
        this.l = new AtomicReference(vqy);
        this.m = j;
        this.n = j2;
        this.f = str;
        this.g = str2;
        this.h = vsm;
        this.o = j3;
        this.p = j4;
        if (this.h != vsm.PRE_ROLL) {
            long j5;
            long j6;
            if (this.h == vsm.MID_ROLL) {
                j5 = this.o;
                j6 = this.m;
            } else {
                j5 = this.n;
                j6 = this.m;
            }
            j5 = Math.max(0, j5 - j6);
            if (this.h != vsm.MID_ROLL) {
                j6 = this.n;
            } else {
                j6 = this.o;
            }
            vic = new vic(this, j5, j6, ajms.AD_MODULE, ajmr.AD_NOT_DRAWABLE);
        } else {
            ajmp = null;
        }
        this.q = ajmp;
        if (this.h != vsm.PRE_ROLL) {
            vic = new vif(this, this.o, this.p, ajms.AD_MODULE, ajmr.AD_MARKER);
        } else {
            ajmp2 = null;
        }
        this.r = ajmp2;
        this.i = null;
        this.s = null;
    }

    public final void a(long j, long j2) {
    }

    public final void a() {
        a("enable()");
        if (this.h == vsm.PRE_ROLL) {
            d();
            return;
        }
        ajmv e = this.j.e();
        if (e != null) {
            e.a(this.q);
            e.a(this.r);
            return;
        }
        throw new vha("CueRangeRegistrar was null");
    }

    public final void b() {
        a("disable()");
        c();
        if (this.h != vsm.PRE_ROLL) {
            ajmv e = this.j.e();
            if (e != null) {
                e.b(this.r);
                e.b(this.q);
                return;
            }
            throw new vha("CueRangeRegistrar was null");
        }
    }

    private final void a(vij vij) {
        xak.a();
        if (this.i != null) {
            vij.a(true);
            return;
        }
        ajoz f = this.j.f();
        if (f == null) {
            vij.a(false);
        } else {
            f.a(new vie(this, vij));
        }
    }

    public final void c() {
        xak.a();
        ajpa ajpa = this.i;
        if (ajpa != null) {
            ajpa.a();
        }
        a(null);
        vdo vdo = this.s;
        if (vdo != null) {
            vdo.a();
        }
        a(null);
    }

    public final void a(ajpa ajpa) {
        xak.a();
        this.i = ajpa;
    }

    public final void a(vdo vdo) {
        xak.a();
        this.s = vdo;
    }

    public final void d() {
        if (this.j.f() == null) {
            this.a.a();
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            e();
        } else {
            this.e.execute(new vhx(this));
        }
    }

    public final void e() {
        a("enterSlot()");
        xak.a();
        this.a.a(this.f, this.g);
        try {
            this.k.a(1);
            a(true, false);
        } catch (vhv unused) {
            f();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098 A:{Catch:{ all -> 0x0111, all -> 0x010a, all -> 0x00f3, vhv -> 0x0118 }} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b A:{Catch:{ all -> 0x0111, all -> 0x010a, all -> 0x00f3, vhv -> 0x0118 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0085 */
    private final void a(boolean r9, boolean r10) {
        /*
        r8 = this;
        r0 = new java.lang.StringBuilder;
        r1 = 57;
        r0.<init>(r1);
        r1 = "setupNextAdToPlay(previousAdNotOfficiallyCompleted=";
        r0.append(r1);
        r0.append(r10);
        r1 = ")";
        r0.append(r1);
        r0 = r0.toString();
        r8.a(r0);
        defpackage.xak.a();
        r0 = r8.k;	 Catch:{ vhv -> 0x0118 }
        defpackage.xak.a();	 Catch:{ vhv -> 0x0118 }
        r1 = r0.a;	 Catch:{ vhv -> 0x0118 }
        r1.lock();	 Catch:{ vhv -> 0x0118 }
        r1 = r0.b;	 Catch:{ all -> 0x0111 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0111 }
        r2 = 1;
        r1 = r1 ^ r2;
        r0 = r0.a;	 Catch:{ vhv -> 0x0118 }
        r0.unlock();	 Catch:{ vhv -> 0x0118 }
        r0 = 0;
        if (r1 != 0) goto L_0x00a3;
    L_0x0038:
        r9 = "concludeBreak()";
        r8.a(r9);	 Catch:{ vhv -> 0x0118 }
        r9 = r8.k;	 Catch:{ vhv -> 0x0085 }
        r10 = 2;
        r9.a(r10);	 Catch:{ vhv -> 0x0085 }
        r9 = r8.k;	 Catch:{ vhv -> 0x0085 }
        defpackage.xak.a();	 Catch:{ vhv -> 0x0085 }
        r10 = r9.a;	 Catch:{ vhv -> 0x0085 }
        r10.lock();	 Catch:{ vhv -> 0x0085 }
        r10 = r9.c;	 Catch:{ all -> 0x007e }
        r10 = r10.size();	 Catch:{ all -> 0x007e }
        if (r10 != r2) goto L_0x0078;
    L_0x0055:
        r10 = r9.c;	 Catch:{ all -> 0x007e }
        r10 = r10.get(r0);	 Catch:{ all -> 0x007e }
        r10 = r10 instanceof defpackage.vta;	 Catch:{ all -> 0x007e }
        if (r10 == 0) goto L_0x0078;
    L_0x005f:
        r9.d = r0;	 Catch:{ all -> 0x007e }
        r10 = r9.b;	 Catch:{ all -> 0x007e }
        r10.clear();	 Catch:{ all -> 0x007e }
        r10 = new defpackage.vso[r2];	 Catch:{ all -> 0x007e }
        r1 = defpackage.vtg.a;	 Catch:{ all -> 0x007e }
        r10[r0] = r1;	 Catch:{ all -> 0x007e }
        r10 = java.util.Arrays.asList(r10);	 Catch:{ all -> 0x007e }
        r9.a(r10);	 Catch:{ all -> 0x007e }
        r10 = r9.c;	 Catch:{ all -> 0x007e }
        r10.clear();	 Catch:{ all -> 0x007e }
    L_0x0078:
        r9 = r9.a;	 Catch:{ vhv -> 0x0085 }
        r9.unlock();	 Catch:{ vhv -> 0x0085 }
        goto L_0x0085;
    L_0x007e:
        r10 = move-exception;
        r9 = r9.a;	 Catch:{ vhv -> 0x0085 }
        r9.unlock();	 Catch:{ vhv -> 0x0085 }
        throw r10;	 Catch:{ vhv -> 0x0085 }
    L_0x0085:
        r9 = r8.h;	 Catch:{ vhv -> 0x0118 }
        r10 = defpackage.vsm.PRE_ROLL;	 Catch:{ vhv -> 0x0118 }
        if (r9 != r10) goto L_0x0098;
    L_0x008b:
        r8.c();	 Catch:{ vhv -> 0x0118 }
        r9 = r8.a;	 Catch:{ vhv -> 0x0118 }
        r10 = r8.f;	 Catch:{ vhv -> 0x0118 }
        r0 = r8.g;	 Catch:{ vhv -> 0x0118 }
        r9.b(r10, r0);	 Catch:{ vhv -> 0x0118 }
        return;
    L_0x0098:
        r9 = r8.e;	 Catch:{ vhv -> 0x0118 }
        r10 = new via;	 Catch:{ vhv -> 0x0118 }
        r10.<init>(r8);	 Catch:{ vhv -> 0x0118 }
        r9.execute(r10);	 Catch:{ vhv -> 0x0118 }
        return;
    L_0x00a3:
        r1 = r8.k;	 Catch:{ vhv -> 0x0118 }
        defpackage.xak.a();	 Catch:{ vhv -> 0x0118 }
        r3 = r1.a;	 Catch:{ vhv -> 0x0118 }
        r3.lock();	 Catch:{ vhv -> 0x0118 }
        r3 = r1.d;	 Catch:{ all -> 0x010a }
        if (r3 != r2) goto L_0x0102;
    L_0x00b1:
        r2 = r1.b;	 Catch:{ all -> 0x010a }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x010a }
        if (r2 != 0) goto L_0x00fa;
    L_0x00b9:
        r2 = r1.b;	 Catch:{ all -> 0x010a }
        r0 = r2.get(r0);	 Catch:{ all -> 0x010a }
        r5 = r0;
        r5 = (defpackage.anjv) r5;	 Catch:{ all -> 0x010a }
        r0 = r1.a;	 Catch:{ vhv -> 0x0118 }
        r0.unlock();	 Catch:{ vhv -> 0x0118 }
        r0 = r8.k;	 Catch:{ vhv -> 0x0118 }
        defpackage.xak.a();	 Catch:{ vhv -> 0x0118 }
        r1 = r0.a;	 Catch:{ vhv -> 0x0118 }
        r1.lock();	 Catch:{ vhv -> 0x0118 }
        r1 = r0.c;	 Catch:{ all -> 0x00f3 }
        r4 = r1.size();	 Catch:{ all -> 0x00f3 }
        r0 = r0.a;	 Catch:{ vhv -> 0x0118 }
        r0.unlock();	 Catch:{ vhv -> 0x0118 }
        r0 = r5.isDone();	 Catch:{ vhv -> 0x0118 }
        if (r0 != 0) goto L_0x00ef;
    L_0x00e2:
        r0 = new vhw;	 Catch:{ vhv -> 0x0118 }
        r2 = r0;
        r3 = r8;
        r6 = r9;
        r7 = r10;
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ vhv -> 0x0118 }
        r8.a(r0);	 Catch:{ vhv -> 0x0118 }
        return;
    L_0x00ef:
        r8.a(r9, r5);	 Catch:{ vhv -> 0x0118 }
        return;
    L_0x00f3:
        r9 = move-exception;
        r10 = r0.a;	 Catch:{ vhv -> 0x0118 }
        r10.unlock();	 Catch:{ vhv -> 0x0118 }
        throw r9;	 Catch:{ vhv -> 0x0118 }
    L_0x00fa:
        r9 = new vhv;	 Catch:{ all -> 0x010a }
        r10 = "Tried to get current ad for scheduling when queue is empty";
        r9.<init>(r10);	 Catch:{ all -> 0x010a }
        throw r9;	 Catch:{ all -> 0x010a }
    L_0x0102:
        r9 = new vhv;	 Catch:{ all -> 0x010a }
        r10 = "Tried to get current ad for scheduling before slot entered";
        r9.<init>(r10);	 Catch:{ all -> 0x010a }
        throw r9;	 Catch:{ all -> 0x010a }
    L_0x010a:
        r9 = move-exception;
        r10 = r1.a;	 Catch:{ vhv -> 0x0118 }
        r10.unlock();	 Catch:{ vhv -> 0x0118 }
        throw r9;	 Catch:{ vhv -> 0x0118 }
    L_0x0111:
        r9 = move-exception;
        r10 = r0.a;	 Catch:{ vhv -> 0x0118 }
        r10.unlock();	 Catch:{ vhv -> 0x0118 }
        throw r9;	 Catch:{ vhv -> 0x0118 }
    L_0x0118:
        r9 = move-exception;
        r9 = java.lang.String.valueOf(r9);
        r10 = r9.length();
        r0 = new java.lang.StringBuilder;
        r10 = r10 + 28;
        r0.<init>(r10);
        r10 = "failed setupNextAdToPlay(): ";
        r0.append(r10);
        r0.append(r9);
        r9 = r0.toString();
        r8.a(r9);
        r8.f();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhu.a(boolean, boolean):void");
    }

    public final void a(boolean z, anjv anjv) {
        String valueOf = String.valueOf(anjv);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 17);
        stringBuilder.append("tryToPlayNextAd(");
        stringBuilder.append(valueOf);
        valueOf = ")";
        stringBuilder.append(valueOf);
        a(stringBuilder.toString());
        xak.a();
        vht vht;
        try {
            vso vso = (vso) anjv.get();
            boolean z2 = false;
            if (vso == null) {
                this.k.b(null);
                a("nothing to play, try next ad");
                a(z, false);
                return;
            }
            vht = this.k;
            xak.a();
            vht.a.lock();
            if (vht.d == 1 && !vht.b.isEmpty() && ((anjv) vht.b.get(0)).isDone() && amqq.a(vso, ((anjv) vht.b.get(0)).get())) {
                z2 = true;
            }
            vht.a.unlock();
            if (z2) {
                String valueOf2 = String.valueOf(vso);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 8);
                stringBuilder2.append("playAd(");
                stringBuilder2.append(valueOf2);
                stringBuilder2.append(valueOf);
                a(stringBuilder2.toString());
                xak.a();
                if (z) {
                    if (((vqy) this.l.get()) instanceof vth) {
                        afpc.a(2, afpf.ad, "InterruptSlotHandler: Ready to play ad when break is unresolved.");
                    }
                    vhb vhb = this.a;
                    this.l.get();
                    vhb.b();
                }
                if (!(vso instanceof vrx)) {
                    if (!(vso instanceof vta)) {
                        if (vso instanceof vsl) {
                            a(new vhz(this, vso));
                            return;
                        } else if (vso instanceof vsk) {
                            a(new vhy(this, vso));
                            return;
                        } else {
                            f();
                            return;
                        }
                    }
                }
                this.a.a(this.f, this.g, this.h, vso);
                b(vso, vra.NO_AD, -1, -1);
                return;
            }
            f();
        } catch (Exception unused) {
            vht.a.unlock();
        } catch (InterruptedException | CancellationException | ExecutionException | vhv unused2) {
            f();
        } catch (Throwable th) {
            vht.a.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* JADX WARNING: Failed to process nested try/catch */
    public final void f() {
        /*
        r3 = this;
        r0 = "forceCancelBreak()";
        r3.a(r0);
        r0 = r3.k;	 Catch:{ vhv -> 0x000b }
        r1 = 2;
        r0.a(r1);	 Catch:{ vhv -> 0x000b }
    L_0x000b:
        r3.b();	 Catch:{ vha -> 0x000f }
        goto L_0x002e;
    L_0x000f:
        r0 = move-exception;
        r0 = java.lang.String.valueOf(r0);
        r1 = r0.length();
        r2 = new java.lang.StringBuilder;
        r1 = r1 + 51;
        r2.<init>(r1);
        r1 = "failed to disable break during forced cancelation: ";
        r2.append(r1);
        r2.append(r0);
        r0 = r2.toString();
        r3.a(r0);
    L_0x002e:
        r0 = r3.h;
        r1 = defpackage.vsm.PRE_ROLL;
        if (r0 != r1) goto L_0x0041;
    L_0x0034:
        r3.c();
        r0 = r3.a;
        r1 = r3.g;
        r2 = r3.h;
        r0.a(r1, r2);
        return;
    L_0x0041:
        r0 = r3.e;
        r1 = new vib;
        r1.<init>(r3);
        r0.execute(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhu.f():void");
    }

    private final void b(vso vso, vra vra, int i, int i2) {
        String valueOf = String.valueOf(vso);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 11);
        stringBuilder.append("onAdEnded(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        a(stringBuilder.toString());
        try {
            this.k.b(vso);
            this.a.a(this.g, this.h, vso, vra, i, i2);
            boolean z = true;
            if (vra != vra.USER_SKIPPED) {
                if (vra != vra.AD_VIDEO_TIMEOUT) {
                    z = false;
                }
            }
            a(false, z);
        } catch (vhv unused) {
            f();
        }
    }

    public final void a(vso vso, vra vra, int i, int i2) {
        String valueOf = String.valueOf(vso);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 25);
        stringBuilder.append("onAdSkipUserInteraction(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        a(stringBuilder.toString());
        if (this.i != null) {
            b(vso, vra, i, i2);
        }
    }

    public final void a(vso vso) {
        String valueOf = String.valueOf(vso);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 13);
        stringBuilder.append("onAdTimeout(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        a(stringBuilder.toString());
        if (this.i != null) {
            b(vso, vra.AD_VIDEO_TIMEOUT, -1, -1);
        }
    }

    public final void a(vqy vqy, List list) {
        vht vht;
        vhs vhs;
        try {
            String valueOf = String.valueOf(list);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 14);
            stringBuilder.append("updateLayout(");
            stringBuilder.append(valueOf);
            stringBuilder.append(")");
            a(stringBuilder.toString());
            if (((vqy) this.l.get()) instanceof vth) {
                this.l.set(vqy);
            }
            vht = this.k;
            vht.a.lock();
            vhs = null;
            int i = vht.d;
            if (i != 0) {
                int i2 = 1;
                if (i == 1) {
                    String str = "Tried to append ads when nothing needed to be resolved";
                    if (vht.b.isEmpty()) {
                        throw new vhv(str);
                    }
                    anjv anjv = (anjv) vht.b.get(0);
                    if (anjv.isDone()) {
                        throw new vhv(str);
                    }
                    if (list.isEmpty()) {
                        ((vhs) anjv).a(null);
                    } else {
                        ((vhs) anjv).a((vso) list.get(0));
                        while (i2 < vht.b.size()) {
                            if (i2 < list.size()) {
                                vht.b.set(i2, vht.a((vso) list.get(i2)));
                            } else {
                                vht.b.remove(i2);
                            }
                            i2++;
                        }
                        vht.a(list.subList(i2, list.size()));
                    }
                    if (!vht.b.isEmpty() && (vht.b.get(0) instanceof vhs)) {
                        vhs = (vhs) vht.b.get(0);
                    }
                    vht.a.unlock();
                    if (vhs != null) {
                        vhs.a();
                    }
                } else if (i != 2) {
                    throw new vhv("Unknown scheduling queue state");
                } else {
                    throw new vhv("Tried to update scheduling queue after break completed");
                }
            }
            vht.b.clear();
            vht.a(list);
            if (!vht.b.isEmpty() && (vht.b.get(0) instanceof vhs)) {
                vhs = (vhs) vht.b.get(0);
            }
            vht.a.unlock();
            if (vhs != null) {
                vhs.a();
            }
        } catch (vhv unused) {
        } catch (Throwable th) {
            if (!vht.b.isEmpty() && (vht.b.get(0) instanceof vhs)) {
                vhs = (vhs) vht.b.get(0);
            }
            vht.a.unlock();
            if (vhs != null) {
                vhs.a();
            }
        }
    }

    private final void a(String str) {
        String valueOf = String.valueOf(this.h);
        String str2 = this.g;
        valueOf.length();
        String.valueOf(str2).length();
        String.valueOf(str).length();
    }
}
