package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahcz */
public final class ahcz {
    public final alup a;
    private final afpu b;
    private final bcaa c;
    private final bcaa d;
    private final abfg e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final abfg i;

    public ahcz(xsc xsc, afpu afpu, bcaa bcaa, bcaa bcaa2, aisd aisd, abfg abfg, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.b = afpu;
        this.c = bcaa;
        this.d = bcaa2;
        this.e = aisd;
        this.h = bcaa3;
        this.f = bcaa4;
        this.g = bcaa5;
        this.i = abfg;
        this.a = new aluo(aluj.e().a(ahdc.a).a(new ahdb(xsc)).a(ahde.a).a(), aniv.a, xsc);
    }

    public static boolean a(aakj aakj) {
        atdv l = aakj.l();
        return l != null && aiqr.a(l);
    }

    public static boolean b(aakj aakj) {
        avqc u = aakj.u();
        if (u != null) {
            int a = avqe.a(u.e);
            if (a != 0 && a == 2) {
                return true;
            }
        }
        return false;
    }

    public final aahr a(aahr aahr) {
        if (aahr.c() > 0 && aahr.b() != 22) {
            return aahr;
        }
        wxf a = wxf.a();
        ((afsk) this.f.get()).a(aahr.d, a);
        try {
            long longValue = ((Long) a.get()).longValue();
            aaht aaht = new aaht(aahr);
            aaht.a.b(longValue);
            return aaht.a();
        } catch (ExecutionException e) {
            throw new IOException("fetchContentLengthIfNecessary failed", e);
        }
    }

    public static boolean a(int i) {
        return i == ahdl.a(avsi.AUDIO_ONLY, -1);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ boolean a(String str, ahdi ahdi) {
        Iterable arrayList = new ArrayList();
        if (ahdi.b().equals(str)) {
            arrayList.add(this.a.b(ahdi));
        }
        try {
            anjj anjj = new anjj(amul.a(arrayList));
            Callable anil = new anil();
            new anis(anjj.a, aniv.a, anil).get(1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            afpc.a(2, afpf.offline, "Some error occurred when evicting player response", e);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e7 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    public final defpackage.aakj a(java.lang.String r10, byte[] r11, int r12, int r13, int r14, byte[] r15) {
        /*
        r9 = this;
        defpackage.xak.b();
        r0 = r9.b;
        r0 = r0.c();
        r2 = r0.a();
        if (r15 != 0) goto L_0x0014;
    L_0x000f:
        r0 = 0;
        r0 = new byte[r0];
        r6 = r0;
        goto L_0x0015;
    L_0x0014:
        r6 = r15;
    L_0x0015:
        r0 = new ahcv;
        r1 = r0;
        r3 = r10;
        r4 = r12;
        r5 = r13;
        r7 = r14;
        r8 = r11;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
        r1 = 4;
        r2 = 2;
        r3 = 0;
        r4 = r9.a;	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        r4 = r4.a(r0);	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        r4 = r4.get();	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        r4 = (defpackage.amqp) r4;	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        r5 = r4.a();	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        if (r5 == 0) goto L_0x0058;
    L_0x0035:
        r5 = r4.b();	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        r5 = (defpackage.alug) r5;	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        r5 = r5.b();	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        if (r5 == r1) goto L_0x0058;
    L_0x0041:
        r4 = r4.b();	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        r4 = (defpackage.alug) r4;	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        r4 = r4.a();	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        r4 = (defpackage.aakj) r4;	 Catch:{ InterruptedException -> 0x0050, InterruptedException | ExecutionException -> 0x004e }
        goto L_0x0059;
    L_0x004e:
        r4 = move-exception;
        goto L_0x0051;
    L_0x0050:
        r4 = move-exception;
    L_0x0051:
        r5 = defpackage.afpf.offline;
        r6 = "Some error occurred when reading from the cache player response";
        defpackage.afpc.a(r2, r5, r6, r4);
    L_0x0058:
        r4 = r3;
    L_0x0059:
        if (r4 != 0) goto L_0x00e7;
    L_0x005b:
        r4 = r9.c;
        r4 = r4.get();
        r4 = (defpackage.abfc) r4;
        r5 = r4.a();
        r6 = 1;
        r5.q = r6;
        r5.a = r10;
        if (r15 == 0) goto L_0x0072;
    L_0x006e:
        r5.a(r15);
        goto L_0x0075;
    L_0x0072:
        r5.g();
    L_0x0075:
        r10 = r12 + -1;
        if (r12 == 0) goto L_0x00e6;
    L_0x0079:
        r12 = 5;
        r15 = 3;
        if (r10 == r6) goto L_0x008d;
    L_0x007d:
        if (r10 == r2) goto L_0x008b;
    L_0x007f:
        if (r10 == r15) goto L_0x008e;
    L_0x0081:
        if (r10 == r1) goto L_0x0089;
    L_0x0083:
        if (r10 == r12) goto L_0x0087;
    L_0x0085:
        r1 = 1;
        goto L_0x008e;
    L_0x0087:
        r1 = 6;
        goto L_0x008e;
    L_0x0089:
        r1 = 5;
        goto L_0x008e;
    L_0x008b:
        r1 = 3;
        goto L_0x008e;
    L_0x008d:
        r1 = 2;
    L_0x008e:
        if (r1 == r6) goto L_0x0092;
    L_0x0090:
        r5.Q = r1;
    L_0x0092:
        if (r13 != r6) goto L_0x0095;
    L_0x0094:
        goto L_0x0097;
    L_0x0095:
        r5.R = r13;
    L_0x0097:
        r5.K = r14;
        if (r11 == 0) goto L_0x009d;
    L_0x009b:
        r5.s = r11;
    L_0x009d:
        r10 = r9.d;
        r10 = r10.get();
        r10 = (defpackage.aiuu) r10;
        r10.a(r5);
        r10 = r9.e;
        r10.a(r5);
        r10 = r9.i;
        if (r10 == 0) goto L_0x00b4;
    L_0x00b1:
        r10.a(r5);
    L_0x00b4:
        defpackage.xak.b();
        r1 = defpackage.afsx.a();
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r10 = r4;
        r11 = r5;
        r12 = r1;
        r10.a(r11, r12, r13, r14, r15);
        r10 = r1.get();	 Catch:{ InterruptedException -> 0x00df, ExecutionException -> 0x00d8 }
        r10 = (defpackage.aakj) r10;	 Catch:{ InterruptedException -> 0x00df, ExecutionException -> 0x00d8 }
        r11 = r9.a;
        r11 = r11.a(r0, r10);
        r12 = defpackage.aniv.a;
        r13 = defpackage.ahdf.a;
        defpackage.xan.a(r11, r12, r13);
        return r10;
    L_0x00d8:
        r10 = move-exception;
        r11 = new aanq;
        r11.<init>(r10);
        throw r11;
    L_0x00df:
        r10 = move-exception;
        r11 = new aanq;
        r11.<init>(r10);
        throw r11;
    L_0x00e6:
        throw r3;
    L_0x00e7:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahcz.a(java.lang.String, byte[], int, int, int, byte[]):aakj");
    }

    public final aahr a(int i, int i2, int i3, aajs aajs, boolean z, aajj aajj) {
        if (ahcz.a(i) && !z) {
            return null;
        }
        if (aajs.t && !((aesg) this.g.get()).a()) {
            i2 = Math.min(i2, 480);
        }
        aahr a = ((ahdj) this.h.get()).a(aajs, aajj, i, i2, i3, z);
        if (a != null) {
            try {
                return a(a);
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
