package defpackage;

import android.text.TextUtils;

/* renamed from: abmh */
public final class abmh extends aaml {
    public String a;
    public String b;
    public String c;
    public String d;
    public byte[] e = zzp.a;
    public byte[] p = zzp.a;
    public long q = -1;
    public augl r = augl.d;
    public CharSequence s;
    public ayip t;

    public abmh(aamd aamd, afpt afpt) {
        super("ypc/handle_transaction", aamd, afpt);
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.s = str;
        this.t = ayip.TRANSACTION_PRODUCT_DATA_TYPE_UNKNOWN;
    }

    private final atpj n() {
        atpj atpj = (atpj) atpk.j.createBuilder();
        String str = this.a;
        atpj.copyOnWrite();
        atpk atpk = (atpk) atpj.instance;
        if (str != null) {
            atpk.a |= 2;
            atpk.c = str;
            str = this.b;
            atpj.copyOnWrite();
            atpk = (atpk) atpj.instance;
            if (str != null) {
                atpk.a |= 4;
                atpk.d = str;
                str = this.c;
                atpj.copyOnWrite();
                atpk = (atpk) atpj.instance;
                if (str != null) {
                    atpk.a |= 8;
                    atpk.e = str;
                    str = this.d;
                    atpj.copyOnWrite();
                    atpk = (atpk) atpj.instance;
                    if (str != null) {
                        atpk.a |= 16;
                        atpk.f = str;
                        anvu a = anvu.a(this.e);
                        atpj.copyOnWrite();
                        atpk = (atpk) atpj.instance;
                        if (a != null) {
                            atpk.a |= 32;
                            atpk.g = a;
                            a = anvu.a(this.p);
                            atpj.copyOnWrite();
                            atpk = (atpk) atpj.instance;
                            if (a != null) {
                                atpk.a |= 64;
                                atpk.h = a;
                                if (this.q != -1) {
                                    apig apig = (apig) apid.f.createBuilder();
                                    apig.a(this.q);
                                    if (this.r.b.size() > 0) {
                                        apig.a(this.r);
                                    }
                                    if (!TextUtils.isEmpty(this.s)) {
                                        apig.a(this.s.toString());
                                    }
                                    ayim ayim = (ayim) ayin.c.createBuilder();
                                    ayik ayik = (ayik) ayil.c.createBuilder();
                                    ayik.copyOnWrite();
                                    ayil ayil = (ayil) ayik.instance;
                                    ayil.b = (apid) ((anxl) apig.build());
                                    ayil.a |= 1;
                                    ayim.copyOnWrite();
                                    ayin ayin = (ayin) ayim.instance;
                                    ayin.b = (ayil) ((anxl) ayik.build());
                                    ayin.a |= 1;
                                    atpj.copyOnWrite();
                                    atpk atpk2 = (atpk) atpj.instance;
                                    atpk2.i = (ayin) ((anxl) ayim.build());
                                    atpk2.a |= 256;
                                }
                                return atpj;
                            }
                            throw new NullPointerException();
                        }
                        throw new NullPointerException();
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:14:0x0035, code skipped:
            if ((r0.a & 2) != 0) goto L_0x0037;
     */
    public final void b() {
        /*
        r5 = this;
        r0 = r5.n();
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.atpk) r0;
        r1 = r0.c;
        defpackage.xvd.a(r1);
        r1 = r5.t;
        r2 = defpackage.ayip.TRANSACTION_PRODUCT_DATA_TYPE_UNKNOWN;
        r3 = 0;
        r4 = 1;
        if (r1 == r2) goto L_0x0037;
    L_0x0019:
        r1 = r5.t;
        r2 = defpackage.ayip.TRANSACTION_PRODUCT_DATA_TYPE_BUY_BUCKET;
        if (r1 != r2) goto L_0x0038;
    L_0x001f:
        r0 = r0.i;
        if (r0 != 0) goto L_0x0025;
    L_0x0023:
        r0 = defpackage.ayin.c;
    L_0x0025:
        r0 = r0.b;
        if (r0 != 0) goto L_0x002b;
    L_0x0029:
        r0 = defpackage.ayil.c;
    L_0x002b:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0031;
    L_0x002f:
        r0 = defpackage.apid.f;
    L_0x0031:
        r0 = r0.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0038;
    L_0x0037:
        r3 = 1;
    L_0x0038:
        defpackage.amqw.b(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmh.b():void");
    }

    public final /* synthetic */ anzd c() {
        return n();
    }
}
