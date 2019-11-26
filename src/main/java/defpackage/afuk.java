package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: afuk */
public final class afuk {
    public final amqp a;
    private final Context b;
    private final Intent c;
    private final Intent d;
    private final amqp e;
    private final int f;
    private final int g;
    private final int h;
    private final afwq i;
    private final afyb j;
    private final Executor k;
    private final xci l;
    private final SharedPreferences m;
    private final wya n;
    private final akkq o;
    private final xsc p;
    private final bcaa q;
    private final zzl r;
    private final acvx s;

    public afuk(Context context, Intent intent, Intent intent2, amqp amqp, int i, int i2, int i3, afwq afwq, afyb afyb, wya wya, Executor executor, xci xci, SharedPreferences sharedPreferences, amqp amqp2, akkq akkq, xsc xsc, bcaa bcaa, zzl zzl, acvx acvx) {
        this.b = context;
        this.c = intent;
        this.d = intent2;
        this.e = amqp;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = afwq;
        this.j = afyb;
        this.k = executor;
        this.l = xci;
        this.m = sharedPreferences;
        this.n = wya;
        this.a = amqp2;
        this.o = akkq;
        this.p = xsc;
        this.q = bcaa;
        this.r = zzl;
        this.s = acvx;
    }

    public final void a(byte[] bArr, String str) {
        byte[] bArr2 = bArr;
        String str2 = str;
        atur atur = null;
        if (afuk.a(aouo.class, str2)) {
            afxh.b(this.q, "STEP_PROCESSING", this.r);
            aouo aouo = (aouo) afuk.a(aouo.u.getParserForType(), bArr2);
            if (afxv.b(aouo)) {
                a(aouo.l);
            }
            if (afxv.a(aouo) || afxv.a(aouo, (akvp) this.e.b())) {
                avmc avmc;
                afxv afxv;
                afxh.b(this.q, "STEP_BUILDING", this.r);
                zzl zzl = this.r;
                if (zzl == null || zzl.b() == null) {
                    avmc = null;
                } else {
                    avmc avmc2 = this.r.b().q;
                    if (avmc2 == null) {
                        avmc2 = avmc.m;
                    }
                    avmc = avmc2;
                }
                acvx acvx = this.s;
                if (!(acvx == null || (aouo.a & 131072) == 0)) {
                    acvx.a(acwl.aj, null, null);
                }
                afyb afyb = this.j;
                Context context = this.b;
                Intent intent = this.d;
                Intent intent2 = this.c;
                int i = this.f;
                int i2 = this.g;
                int i3 = this.h;
                akvp akvp = (akvp) this.e.b();
                SharedPreferences sharedPreferences = this.m;
                akkq akkq = this.o;
                xsc xsc = this.p;
                bcaa bcaa = this.q;
                acvx acvx2 = this.s;
                Iterator it = afyb.a.iterator();
                while (it.hasNext()) {
                    afxo afxo = (afxo) ((WeakReference) it.next()).get();
                    if (afxo == null) {
                        it.remove();
                    } else if (afxo.a(aouo)) {
                        afxv = null;
                        break;
                    }
                }
                afxv = afxv.a(context, aouo, intent, intent2, i, i2, i3, akvp, sharedPreferences, akkq, xsc, bcaa, avmc, acvx2);
                if (afxv != null) {
                    afxv.a(this.b, this.n, this.q, this.r, this.s);
                    if ((aouo.a & 32) != 0 && this.a.a()) {
                        aaas aaas = (aaas) this.a.b();
                        apxu apxu = aouo.i;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        aaas.a(apxu, null);
                    }
                    if (VERSION.SDK_INT >= 23) {
                        int i4 = aouo.r;
                        if (i4 > 0) {
                            afxv.a(this.b, i4);
                        }
                    }
                    a(aouo.k);
                } else {
                    afxh.b(this.q, "DID_NOT_BUILD", this.r);
                    xtl.d("System notification suppressed or failed to build.");
                }
                this.l.d(new afye(aouo));
                return;
            }
            afxh.b(this.q, "FAIL_INVALID_2", this.r);
            return;
        }
        if (afuk.a(apaa.class, str2)) {
            apaa apaa = (apaa) afuk.a(apaa.d.getParserForType(), bArr2);
            if (apaa != null) {
                a(apaa.c);
            }
        } else if (afuk.a(atuv.class, str2)) {
            try {
                atuv atuv = (atuv) anxl.parseFrom(atuv.c, bArr2);
                if ((atuv.a & 1) != 0) {
                    afwq afwq = this.i;
                    atup atup = atuv.b;
                    if (atup == null) {
                        atup = atup.d;
                    }
                    atun atun = atup.b;
                    if (atun == null) {
                        atun = atun.g;
                    }
                    String str3 = atun.d;
                    atup atup2 = atuv.b;
                    if (atup2 == null) {
                        atup2 = atup.d;
                    }
                    if ((atup2.a & 2) != 0) {
                        atup atup3 = atuv.b;
                        if (atup3 == null) {
                            atup3 = atup.d;
                        }
                        atur = atup3.c;
                        if (atur == null) {
                            atur = atur.c;
                        }
                    }
                    afwq.a(str3, atur);
                }
            } catch (anyg unused) {
            }
        } else {
            xtl.c("Unknown renderer type.");
        }
    }

    private final void a(List list) {
        if (this.a.a()) {
            if (list != null) {
                this.k.execute(new afuj(this, list));
            }
            return;
        }
        xtl.d("ActionHandler is not present, ignoring actions.");
    }

    private static anze a(anzq anzq, byte[] bArr) {
        try {
            return (anze) anzq.a(bArr, anxa.c());
        } catch (anyg unused) {
            return null;
        }
    }

    private static boolean a(Class cls, String str) {
        return cls.getName().equals(str);
    }
}
