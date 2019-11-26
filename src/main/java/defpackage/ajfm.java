package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: ajfm */
public final class ajfm {
    public final Executor a;
    public final String b;
    public final xhv c;
    public final afoi d;
    public final aqtq e;
    private final afqv f;
    private final Context g;
    private final tgv h;
    private final afpu i;
    private final awcq j;
    private final aakm k;
    private final int l;
    private final xvo m;
    private final xvo n;
    private volatile boolean o;
    private boolean p;

    ajfm(afqv afqv, Executor executor, Context context, tgv tgv, afpu afpu, xhv xhv, afoi afoi, zyw zyw, awcq awcq, aakm aakm, String str, int i) {
        this.f = (afqv) amqw.a((Object) afqv);
        this.a = (Executor) amqw.a((Object) executor);
        this.g = (Context) amqw.a((Object) context);
        this.h = (tgv) amqw.a((Object) tgv);
        this.i = (afpu) amqw.a((Object) afpu);
        this.j = (awcq) amqw.a((Object) awcq);
        this.k = (aakm) amqw.a((Object) aakm);
        this.n = xvo.a(aakm.a());
        String valueOf = String.valueOf(awcq.b);
        String str2 = "?";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        this.m = xvo.a(Uri.parse(valueOf));
        this.c = (xhv) amqw.a((Object) xhv);
        this.d = (afoi) amqw.a((Object) afoi);
        amqw.a((Object) zyw);
        this.e = ajfm.a((zyw) amqw.a((Object) zyw));
        this.b = str;
        this.l = i;
        this.o = false;
        this.p = true;
    }

    ajfm(afqv afqv, Executor executor, Context context, tgv tgv, afpu afpu, xhv xhv, afoi afoi, zyw zyw, ajfq ajfq) {
        ajfq ajfq2 = ajfq;
        this(afqv, executor, context, tgv, afpu, xhv, afoi, zyw, ajfq2.a, ajfq2.b, ajfq2.c, ajfq2.d);
        this.o = ajfq2.e;
    }

    ajfm(afqv afqv, Executor executor, Context context, tgv tgv, afpu afpu, xhv xhv, afoi afoi, zyw zyw, awcq awcq, aakm aakm) {
        this(afqv, executor, context, tgv, afpu, xhv, afoi, zyw, awcq, aakm, "", 0);
        aqtq a = ajfm.a(zyw);
        boolean z = false;
        if (a != null && a.f) {
            z = true;
        }
        this.p = z;
    }

    static aqtq a(zyw zyw) {
        apxn a = zyw.a();
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            if ((auya.b & 16777216) != 0) {
                auya auya2 = a.i;
                if (auya2 == null) {
                    auya2 = auya.J;
                }
                aqtq aqtq = auya2.H;
                if (aqtq == null) {
                    aqtq = aqtq.g;
                }
                return aqtq;
            }
        }
        return null;
    }

    public final ajfq a() {
        return new ajfq(this.j, this.k, this.b, this.l, this.o);
    }

    public final void a(ahkm ahkm) {
        if (ahkm.g && ahkm.a >= ((long) this.k.a(5)) * 1000) {
            b();
        }
    }

    public final void b() {
        if (!this.o) {
            this.o = true;
            this.a.execute(new ajfp(this, this.i.c(), this.i.h(), this.i.g()));
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(afpt afpt) {
        if (b("c5a")) {
            HashMap hashMap = new HashMap();
            hashMap.put("challenge", this.j.b);
            String str = "c5b";
            this.h.a(this.g, !amqu.a(a(str)) ? a(str) : "yt_player", hashMap, new ajfr(this, afpt));
            return;
        }
        a(null, afpt);
    }

    public final void a(String str, afpt afpt) {
        xvo a = xvo.a(this.n);
        if (!this.b.isEmpty()) {
            a.b("cpn", this.b);
        }
        Uri a2 = a.a();
        String str2 = "atr";
        afqy b = afqv.b(str2);
        b.a(a2);
        HashMap hashMap = new HashMap();
        xvo a3 = xvo.a(this.m);
        String str3 = "c3a";
        if (b(str3)) {
            a3.b("r3a", Integer.toString(this.l % Integer.parseInt(a(str3))));
        }
        if (str != null) {
            a3.b("r5a", str);
        }
        hashMap.put(str2, a3.a().getEncodedQuery());
        b.g = hashMap;
        b.e = this.p;
        b.a(new aakn(this.k));
        b.h = afpt;
        str = String.valueOf(a2);
        String valueOf = String.valueOf(hashMap);
        StringBuilder stringBuilder = new StringBuilder((str.length() + 17) + valueOf.length());
        stringBuilder.append("Pinging ");
        stringBuilder.append(str);
        stringBuilder.append("\nParams: ");
        stringBuilder.append(valueOf);
        xtl.e(stringBuilder.toString());
        this.f.a(null, b, aftp.b);
    }

    private final boolean b(String str) {
        return this.m.b(str) != null;
    }

    public final String a(String str) {
        return this.m.b(str);
    }
}
