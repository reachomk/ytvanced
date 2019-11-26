package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/* renamed from: aeru */
public final class aeru implements aerz, nqg {
    private static final npv f = new nqa(new npx("video/x-unknown", new byte[0]));
    public final aesp a;
    public final Handler b;
    public final List c = new ArrayList();
    public npv d;
    public Runnable e;
    private final Looper g;
    private final aetm h;
    private final HashMap i;
    private final aesu j;
    private final nqk k;
    private final afjj l;
    private final aajj m;
    private final Random n;
    private final aero o;

    public aeru(Looper looper, aetm aetm, HashMap hashMap, Handler handler, aesu aesu, nqk nqk, afjj afjj, aajj aajj) {
        nqk nqk2 = nqk;
        this.g = looper;
        this.h = aetm;
        this.i = hashMap;
        this.b = handler;
        this.j = aesu;
        this.k = nqk2;
        this.l = afjj;
        this.m = (aajj) amqw.a((Object) aajj);
        this.n = new Random();
        this.o = new aero();
        try {
            nqk2.a("sessionSharing", "enable");
            this.a = new aerx(looper, aetm, hashMap, handler, aesu, aert.a, nqk, afjj);
            this.a.a(f);
            nqk2.a((nqg) this);
        } catch (IllegalStateException e) {
            afpf afpf = afpf.media;
            String valueOf = String.valueOf(e.getLocalizedMessage());
            String str = "Cannot set mediaDrm property sessionSharing to enable";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            afpc.a(1, afpf, valueOf);
            throw new nqp();
        }
    }

    public final void a() {
    }

    public final void a(byte[] bArr, int i) {
        for (aesa aesa : this.c) {
            if (Arrays.equals(bArr, aesa.a.i)) {
                aesa.a.c.sendEmptyMessage(i);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("No corresponding session found for event ");
        stringBuilder.append(i);
        xtl.d(stringBuilder.toString());
    }

    public final void a(npv npv) {
        if (!aeru.a(npv, this.d)) {
            String valueOf = String.valueOf(aeru.c(npv));
            String str = "Received drmInitData: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            this.d = npv;
            for (aesa aesa : this.c) {
                if (aeru.a(aesa.b, npv)) {
                    aesa.d = aeff.a.a();
                    return;
                }
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                this.b.removeCallbacks(runnable);
                this.e = null;
            }
            int i = this.o.a(npv.a(aers.a).b).b;
            if (i != -1) {
                for (aesa aesa2 : this.c) {
                    int i2 = aesa2.c;
                    if ((i2 == i - 1 || i2 == i + 1) && aesa2.a.h == 4) {
                        if (this.m.al() != 0) {
                            nxu a = this.o.a(npv.a(aers.a).b);
                            this.e = new aerw(this, a, npv);
                            int al = this.m.al();
                            i = a.c;
                            if (i != -1) {
                                al = Math.min(al, i * 1000);
                            }
                            this.b.postDelayed(this.e, (long) this.n.nextInt(al));
                            return;
                        }
                    }
                }
            }
            b(npv);
        }
    }

    public final void b(npv npv) {
        while (this.c.size() >= 4) {
            aesa aesa = (aesa) this.c.get(0);
            long j = aesa.d;
            for (aesa aesa2 : this.c) {
                long j2 = aesa2.d;
                long j3 = j < j2 ? j2 : j;
                if (j < j2) {
                    aesa = aesa2;
                }
                j = j3;
            }
            String valueOf = String.valueOf(aeru.c(aesa.b));
            String str = "Evicting session with DRM InitData ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            aesa.a.f = null;
            this.c.remove(aesa);
        }
        try {
            aesp aesp = new aesp(this.g, this.h, this.i, this.b, this.j, aerv.a, this.k, this.l);
            this.k.a((nqg) this);
            nxu a = this.o.a(npv.a(aers.a).b);
            this.h.c = Integer.valueOf(a.b);
            aesp.a(npv);
            aesa aesa3 = new aesa(aesp, npv, a.b);
            aesa3.d = aeff.a.a();
            this.c.add(aesa3);
            this.c.size();
        } catch (nqp unused) {
        }
    }

    public final void e() {
        this.b.postDelayed(new aery(this), 100);
    }

    public final int f() {
        return this.a.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d A:{RETURN, PHI: r2 , EDGE_INSN: B:38:0x0085->B:42:0x008d ?: BREAK  } */
    public final int b() {
        /*
        r10 = this;
        r0 = r10.m;
        r0 = r0.al();
        r1 = 4;
        r2 = 3;
        r3 = 0;
        r4 = 1;
        if (r0 == 0) goto L_0x005a;
    L_0x000c:
        r0 = r10.a;
        r0 = r0.h;
        if (r0 == r4) goto L_0x0060;
    L_0x0012:
        r0 = r10.d;
        if (r0 == 0) goto L_0x0027;
    L_0x0016:
        r5 = r10.o;
        r6 = defpackage.aers.a;
        r0 = r0.a(r6);
        r0 = r0.b;
        r0 = r5.a(r0);
        r0 = r0.b;
        goto L_0x0028;
    L_0x0027:
        r0 = -1;
    L_0x0028:
        r5 = r10.c;
        r5 = r5.iterator();
        r6 = 0;
        r7 = 0;
    L_0x0030:
        r8 = r5.hasNext();
        if (r8 == 0) goto L_0x0053;
    L_0x0036:
        r8 = r5.next();
        r8 = (defpackage.aesa) r8;
        r9 = r8.a;
        r9 = r9.h;
        if (r9 != 0) goto L_0x0043;
    L_0x0042:
        r6 = 1;
    L_0x0043:
        if (r9 == r1) goto L_0x0046;
    L_0x0045:
        goto L_0x0030;
    L_0x0046:
        r8 = r8.c;
        r9 = r0 + -1;
        if (r8 < r9) goto L_0x0030;
    L_0x004c:
        r9 = r0 + 1;
        if (r8 <= r9) goto L_0x0051;
    L_0x0050:
        goto L_0x0030;
    L_0x0051:
        r7 = 1;
        goto L_0x0030;
    L_0x0053:
        if (r6 == 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0085;
    L_0x0056:
        if (r7 != 0) goto L_0x0059;
    L_0x0058:
        goto L_0x008d;
    L_0x0059:
        return r1;
    L_0x005a:
        r0 = r10.a;
        r0 = r0.h;
        if (r0 != r4) goto L_0x0062;
    L_0x0060:
        r2 = 1;
        goto L_0x008d;
    L_0x0062:
        r0 = r10.c;
        r0 = r0.iterator();
        r5 = 0;
        r6 = 0;
    L_0x006a:
        r7 = r0.hasNext();
        if (r7 == 0) goto L_0x0087;
    L_0x0070:
        r7 = r0.next();
        r7 = (defpackage.aesa) r7;
        r7 = r7.a;
        r7 = r7.h;
        if (r7 == 0) goto L_0x0085;
    L_0x007c:
        if (r7 != r1) goto L_0x0080;
    L_0x007e:
        r6 = 1;
        goto L_0x006a;
    L_0x0080:
        if (r7 == r2) goto L_0x0083;
    L_0x0082:
        goto L_0x006a;
    L_0x0083:
        r5 = 1;
        goto L_0x006a;
    L_0x0085:
        r2 = 0;
        goto L_0x008d;
    L_0x0087:
        if (r5 != 0) goto L_0x008d;
    L_0x0089:
        if (r6 != 0) goto L_0x008c;
    L_0x008b:
        goto L_0x008d;
    L_0x008c:
        return r1;
    L_0x008d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeru.b():int");
    }

    /* JADX WARNING: Missing block: B:6:0x0012, code skipped:
            if (r0.bf != false) goto L_0x002f;
     */
    private final defpackage.nqh g() {
        /*
        r2 = this;
        r0 = r2.m;
        r0 = r0.c;
        r1 = r0.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0015;
    L_0x000a:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r0 = defpackage.arhh.bv;
    L_0x0010:
        r0 = r0.bf;
        if (r0 == 0) goto L_0x0015;
    L_0x0014:
        goto L_0x002f;
    L_0x0015:
        r0 = r2.c;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x002f;
    L_0x001d:
        r0 = r2.c;
        r1 = 0;
        r0 = r0.get(r1);
        r0 = (defpackage.aesa) r0;
        r0 = r0.a;
        r0 = r0.c();
        r0 = (defpackage.nqh) r0;
        return r0;
    L_0x002f:
        r0 = r2.a;
        r0 = r0.c();
        r0 = (defpackage.nqh) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeru.g():nqh");
    }

    public final boolean a(String str) {
        return g().a(str);
    }

    public final Exception d() {
        for (aesa aesa : this.c) {
            if (aesa.a.d() != null) {
                return aesa.a.d();
            }
        }
        return null;
    }

    private static String c(npv npv) {
        return Base64.encodeToString(npv.a(aers.a).b, 2);
    }

    private static boolean a(npv npv, npv npv2) {
        if (nxf.a((Object) npv, (Object) npv2)) {
            return true;
        }
        return (npv == null || npv2 == null) ? false : nxf.a(npv.a(aers.a), npv2.a(aers.a));
    }

    public final /* synthetic */ nqc c() {
        return g();
    }
}
