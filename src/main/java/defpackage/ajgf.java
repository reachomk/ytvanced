package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ajgf */
public final class ajgf extends ajps implements ajfa, xcp {
    public final xsc a;
    private final ajek b;
    private final zzl c;
    private final Map d = new HashMap();
    private boolean e;

    public ajgf(ajek ajek, xci xci, bctz bctz, aiqh aiqh, xsc xsc, zzl zzl, zyw zyw) {
        super(1);
        this.b = (ajek) amqw.a((Object) ajek);
        this.a = xsc;
        this.c = zzl;
        if (aipo.a(zyw, 68719476736L)) {
            ajcg.a(bctz, ajge.a).a(new ajgh(this));
            aiqh.b.a(new ajgg(this));
            return;
        }
        xci.a((Object) this);
    }

    public final void a(String str) {
        if (!this.d.containsKey(str)) {
            awtm b = b();
            if (b.b) {
                ajek ajek = this.b;
                aulg aulg = b.d;
                if (aulg == null) {
                    aulg = aulg.e;
                }
                ajee a = ajek.a(new aakm(aulg), str, null, true, false, aajj.b, false);
                if (a != null) {
                    this.d.put(str, a);
                }
            }
        }
    }

    public final void c(String str) {
        ajee ajee = str != null ? (ajee) this.d.get(str) : null;
        if (ajee != null) {
            ajee.a(ajeq.NOT_STARTED);
            ajee.c();
            ajee.i.a();
            if (ajee.m == ajeq.NOT_STARTED || ajee.m == ajeq.SUSPENDED) {
                ajee.a(ajee.f());
            } else {
                xtl.b("QoE client released unexpectedly", new Exception());
                ajee.a(ajeq.SUSPENDED);
            }
            ajee.j.deleteObserver(ajee);
            ajee.e.b(ajee.f);
            ajee.e.b(ajee.g);
            ajee.e.b(ajee.h);
            ajee.c();
            ajee.b.b(ajee);
            ajee.i.a();
            for (ajer ajer : ajee.z) {
                ajer.a.remove(ajee);
            }
            this.d.remove(str);
        }
    }

    public final void d(String str) {
        ajee ajee = str != null ? (ajee) this.d.get(str) : null;
        if (ajee != null) {
            if (e()) {
                ajee.a("dedi", new ajgj(this));
            }
            ajee.a();
        }
    }

    public final void ba_() {
        this.e = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    public final void b(defpackage.aetv r20, java.lang.String r21) {
        /*
        r19 = this;
        r0 = r20;
        r1 = r21;
        if (r1 == 0) goto L_0x0011;
    L_0x0006:
        r2 = r19;
        r3 = r2.d;
        r1 = r3.get(r1);
        r1 = (defpackage.ajee) r1;
        goto L_0x0014;
    L_0x0011:
        r2 = r19;
        r1 = 0;
    L_0x0014:
        if (r1 == 0) goto L_0x01f5;
    L_0x0016:
        r3 = r0.b;
        if (r3 == 0) goto L_0x001f;
    L_0x001a:
        r5 = r3.b();
        goto L_0x0020;
    L_0x001f:
        r5 = 0;
    L_0x0020:
        r6 = "";
        if (r3 != 0) goto L_0x0026;
    L_0x0024:
        r7 = r6;
        goto L_0x002a;
    L_0x0026:
        r7 = r3.t();
    L_0x002a:
        r8 = r0.c;
        if (r8 == 0) goto L_0x0033;
    L_0x002e:
        r9 = r8.b();
        goto L_0x0034;
    L_0x0033:
        r9 = 0;
    L_0x0034:
        if (r8 != 0) goto L_0x0038;
    L_0x0036:
        r10 = r6;
        goto L_0x003c;
    L_0x0038:
        r10 = r8.t();
    L_0x003c:
        r11 = r0.d;
        if (r11 == 0) goto L_0x0045;
    L_0x0040:
        r11 = r11.b();
        goto L_0x0046;
    L_0x0045:
        r11 = 0;
    L_0x0046:
        r12 = r0.h;
        r13 = r0.g;
        r14 = "s";
        r15 = 1;
        if (r13 == 0) goto L_0x006c;
    L_0x004f:
        r16 = r13.b();
        if (r16 == 0) goto L_0x0056;
    L_0x0055:
        goto L_0x007f;
    L_0x0056:
        r4 = r1.G;
        if (r4 == 0) goto L_0x0063;
    L_0x005a:
        r4 = r13.c();
        if (r4 != 0) goto L_0x007f;
    L_0x0060:
        r14 = "i";
        goto L_0x007f;
    L_0x0063:
        r4 = r13.a();
        if (r4 == 0) goto L_0x006c;
    L_0x0069:
        r14 = "m";
        goto L_0x007f;
    L_0x006c:
        r4 = r1.G;
        if (r4 == 0) goto L_0x0071;
    L_0x0070:
        goto L_0x007b;
    L_0x0071:
        if (r12 != r15) goto L_0x0074;
    L_0x0073:
        goto L_0x0078;
    L_0x0074:
        r4 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        if (r12 != r4) goto L_0x007b;
    L_0x0078:
        r14 = "a";
        goto L_0x007f;
    L_0x007b:
        r14 = defpackage.afhz.b(r12);
    L_0x007f:
        r4 = r1.f();
        r12 = android.text.TextUtils.isEmpty(r14);
        if (r12 != 0) goto L_0x01f5;
    L_0x0089:
        if (r3 != 0) goto L_0x008d;
    L_0x008b:
        if (r8 == 0) goto L_0x01f5;
    L_0x008d:
        if (r8 == 0) goto L_0x0095;
    L_0x008f:
        r8 = r8.w();
        if (r8 == 0) goto L_0x00a2;
    L_0x0095:
        if (r3 == 0) goto L_0x009d;
    L_0x0097:
        r3 = r3.w();
        if (r3 == 0) goto L_0x00a2;
    L_0x009d:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.a(r3);
    L_0x00a2:
        r3 = ";";
        r8 = ":";
        if (r5 < 0) goto L_0x00ad;
    L_0x00a8:
        r12 = r1.o;
        if (r5 == r12) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00bd;
    L_0x00ad:
        if (r11 <= 0) goto L_0x00b3;
    L_0x00af:
        r12 = r1.q;
        if (r11 != r12) goto L_0x00bd;
    L_0x00b3:
        if (r7 == 0) goto L_0x01a4;
    L_0x00b5:
        r12 = r1.p;
        r12 = r7.equals(r12);
        if (r12 != 0) goto L_0x01a4;
    L_0x00bd:
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r12.append(r4);
        r12.append(r8);
        r12.append(r5);
        r13 = android.text.TextUtils.isEmpty(r7);
        if (r13 != 0) goto L_0x00d7;
    L_0x00d1:
        r12.append(r3);
        r12.append(r7);
    L_0x00d7:
        r12.append(r8);
        if (r11 != 0) goto L_0x00de;
    L_0x00dc:
        r13 = r6;
        goto L_0x00e2;
    L_0x00de:
        r13 = java.lang.Integer.valueOf(r11);
    L_0x00e2:
        r12.append(r13);
        r12.append(r8);
        r13 = r1.o;
        if (r13 < 0) goto L_0x00f1;
    L_0x00ec:
        r13 = java.lang.Integer.valueOf(r13);
        goto L_0x00f2;
    L_0x00f1:
        r13 = r6;
    L_0x00f2:
        r12.append(r13);
        r12.append(r8);
        r12.append(r14);
        r13 = r1.i;
        r12 = r12.toString();
        r15 = "vfs";
        r13.a(r15, r12);
        r1.q = r11;
        r1.o = r5;
        r1.p = r7;
        r1.b();
        r1.b(r4);
        r11 = r0.i;
        r17 = 0;
        r5 = 2;
        r7 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1));
        if (r7 <= 0) goto L_0x015b;
    L_0x011b:
        r7 = r1.i;
        r13 = java.util.Locale.US;
        r15 = new java.lang.Object[r5];
        r17 = 0;
        r15[r17] = r4;
        r11 = (float) r11;
        r12 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r11 = r11 / r12;
        r11 = java.lang.Float.valueOf(r11);
        r12 = 1;
        r15[r12] = r11;
        r11 = "%s:%.2f";
        r11 = java.lang.String.format(r13, r11, r15);
        r12 = "bwe";
        r7.a(r12, r11);
        r7 = r1.G;
        if (r7 == 0) goto L_0x015b;
    L_0x013f:
        r7 = r1.i;
        r0 = r0.j;
        r11 = new java.lang.StringBuilder;
        r12 = 16;
        r11.<init>(r12);
        r12 = "ibws:";
        r11.append(r12);
        r11.append(r0);
        r0 = r11.toString();
        r11 = "ctmp";
        r7.a(r11, r0);
    L_0x015b:
        r0 = r1.t;
        if (r0 != 0) goto L_0x0160;
    L_0x015f:
        goto L_0x01a4;
    L_0x0160:
        r0 = r0.ordinal();
        if (r0 == 0) goto L_0x0172;
    L_0x0166:
        r7 = 1;
        if (r0 == r7) goto L_0x0172;
    L_0x0169:
        if (r0 == r5) goto L_0x0172;
    L_0x016b:
        r5 = 4;
        if (r0 == r5) goto L_0x0172;
    L_0x016e:
        r5 = 5;
        if (r0 == r5) goto L_0x0172;
    L_0x0171:
        goto L_0x01a4;
    L_0x0172:
        r0 = r1.v;
        r5 = -1;
        if (r0 == r5) goto L_0x01a4;
    L_0x0177:
        r7 = r1.u;
        if (r7 == r5) goto L_0x01a4;
    L_0x017b:
        r5 = r1.i;
        r11 = java.lang.String.valueOf(r4);
        r11 = r11.length();
        r12 = new java.lang.StringBuilder;
        r11 = r11 + 24;
        r12.<init>(r11);
        r12.append(r4);
        r12.append(r8);
        r12.append(r0);
        r12.append(r8);
        r12.append(r7);
        r0 = r12.toString();
        r7 = "view";
        r5.a(r7, r0);
    L_0x01a4:
        if (r9 < 0) goto L_0x01ab;
    L_0x01a6:
        r0 = r1.r;
        if (r9 == r0) goto L_0x01ab;
    L_0x01aa:
        goto L_0x01b5;
    L_0x01ab:
        if (r10 == 0) goto L_0x01f5;
    L_0x01ad:
        r0 = r1.s;
        r0 = r10.equals(r0);
        if (r0 != 0) goto L_0x01f5;
    L_0x01b5:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r4);
        r0.append(r8);
        r0.append(r9);
        r4 = android.text.TextUtils.isEmpty(r10);
        if (r4 != 0) goto L_0x01cf;
    L_0x01c9:
        r0.append(r3);
        r0.append(r10);
    L_0x01cf:
        r0.append(r8);
        r3 = r1.r;
        if (r3 < 0) goto L_0x01da;
    L_0x01d6:
        r6 = java.lang.Integer.valueOf(r3);
    L_0x01da:
        r0.append(r6);
        r0.append(r8);
        r0.append(r14);
        r3 = r1.i;
        r0 = r0.toString();
        r4 = "afs";
        r3.a(r4, r0);
        r1.r = r9;
        r1.s = r10;
        r0 = 0;
        r1.G = r0;
    L_0x01f5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajgf.b(aetv, java.lang.String):void");
    }

    public final void a(aetv aetv, String str) {
        b(aetv, str);
    }

    public final void a(String str, aevf aevf, String str2) {
        ajee ajee = str2 != null ? (ajee) this.d.get(str2) : null;
        if (ajee != null) {
            ajee.a(str, aevf);
        }
    }

    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        String b;
        String str;
        aajs aajs;
        if (ordinal == 4 || ordinal == 5) {
            aakm aakm;
            aakj aakj = ahkn.c;
            if (aakj == null) {
                aakm = null;
            } else {
                aakm = aakj.m().f;
            }
            aakm aakm2 = aakm;
            if (aakm2 != null) {
                this.e = false;
                b = ahkn.c.b();
                str = ahkn.f;
                aajs = ahkn.b.c;
                a(b, str, aajs != null ? aajs.i() : true, aakm2, ahkn.c.n());
            } else {
                xtl.d("Missing QoE base url");
            }
        } else if (ordinal == 7 || ordinal == 8) {
            b = ahkn.b.b();
            str = ahkn.e;
            aajs = ahkn.b.c;
            a(b, str, aajs != null ? aajs.i() : true, ahkn.b.m().f, ahkn.b.n());
            this.e = false;
        }
    }

    public final void a(ahkr ahkr) {
        String str = ahkr.b;
        ajee ajee = str != null ? (ajee) this.d.get(str) : null;
        if (ajee != null) {
            int i = ahkr.a;
            if (i == 2) {
                ajee.x = false;
                ajee.a(ajeq.PLAYING);
            } else if (i == 3) {
                ajee.a(ajeq.PAUSED);
            } else if (i == 5) {
                ajee.a(ajeq.BUFFERING);
            } else if (i == 6) {
                ajee.a(ajeq.PAUSED_BUFFERING);
            } else if (i == 7) {
                ajee.a(ajeq.ENDED);
                ajee.i.a();
                ajee.x = true;
            } else if (i == 9 || i == 10) {
                ajee.a(ajeq.SEEKING);
            }
        }
    }

    public final void a(aiod aiod) {
        String str = aiod.c;
        ajee ajee = str != null ? (ajee) this.d.get(str) : null;
        if (ajee != null && aiod.a == 15) {
            int i = aiod.b;
            if (i != ajee.n) {
                ajet ajet = ajee.i;
                String f = ajee.f();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(f).length() + 12);
                stringBuilder.append(f);
                stringBuilder.append(":");
                stringBuilder.append(i);
                ajet.a("sur", stringBuilder.toString());
                ajee.n = i;
            }
        }
    }

    public final void a(ahkm ahkm) {
        String str = ahkm.h;
        ajee ajee = str != null ? (ajee) this.d.get(str) : null;
        if (ajee != null) {
            if (ahkm.g) {
                ajee.w = ahkm;
            }
            long e = (long) ((aeql) ajee.k.get()).e();
            if (e != -1 && ajee.l.b() > 6283) {
                ajee.l.a(e);
            }
        }
    }

    public final void a(afif afif, String str) {
        ajee ajee = str != null ? (ajee) this.d.get(str) : null;
        if (ajee != null) {
            ajee.a(afif);
        }
    }

    public final void b(String str) {
        ajee ajee = str != null ? (ajee) this.d.get(str) : null;
        if (ajee != null) {
            if (e()) {
                ajee.a("dedi", new ajgi(this));
            }
            ajee.a();
        }
    }

    public final void a(ahjc ahjc) {
        String str = ahjc.b;
        ajee ajee = str != null ? (ajee) this.d.get(str) : null;
        awtm b = b();
        if (ahjc.h == 4 && ajee != null && b.c) {
            if (!TextUtils.isEmpty(ahjc.e)) {
                xvo xvo = ajee.C;
                if (xvo != null) {
                    xvo.b("docid", ahjc.e);
                    ajee.i.a(ajee.C);
                }
            }
            ajee.a(new afif(2, "net.retryexhausted", 0, ahjc.d));
            ajee.d();
        }
    }

    public final void a(ahjn ahjn) {
        for (ajee ajee : this.d.values()) {
            int i;
            airc airc = ahjn.a;
            if (airc != null) {
                i = airc.i;
                airc airc2 = ajee.t;
                if (airc2 == null || airc2 != airc) {
                    ajee.t = airc;
                    ajet ajet = ajee.i;
                    String f = ajee.f();
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(f).length() + 12);
                    stringBuilder.append(f);
                    stringBuilder.append(":");
                    stringBuilder.append(i);
                    ajet.a("vis", stringBuilder.toString());
                }
            }
            int i2 = ahjn.c;
            i = ahjn.d;
            if (i2 != ajee.v || i != ajee.u) {
                ajee.v = i2;
                ajee.u = i;
            }
        }
    }

    public final void a(ahjd ahjd) {
        for (ajee ajee : this.d.values()) {
            if (Float.compare(ajee.D, ahjd.b) != 0) {
                ajee.D = ahjd.b;
                String f = ajee.f();
                ajet ajet = ajee.i;
                float f2 = ajee.D;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(f).length() + 16);
                stringBuilder.append(f);
                stringBuilder.append(":");
                stringBuilder.append(f2);
                ajet.a("rate", stringBuilder.toString());
                ajee.a(f);
            }
        }
    }

    private final awtm b() {
        awtm awtm;
        zzl zzl = this.c;
        if (zzl == null || zzl.b() == null) {
            awtm = awtm.x;
        } else {
            auuo auuo = this.c.b().k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            awtm = auuo.e;
            if (awtm == null) {
                return awtm.x;
            }
        }
        return awtm;
    }

    private final boolean e() {
        zzl zzl = this.c;
        if (zzl != null) {
            arvt b = zzl.b();
            if (b != null) {
                auuo auuo = b.k;
                if (auuo == null) {
                    auuo = auuo.k;
                }
                aorz aorz = auuo.i;
                if (aorz == null) {
                    aorz = aorz.j;
                }
                if (aorz.h) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void a(String str, String str2, boolean z, aakm aakm, aajj aajj) {
        ajee ajee = (ajee) this.d.get(str2);
        if (ajee == null) {
            ajee a = this.b.a(aakm, str2, str, z, this.e, aajj, true);
            if (a != null) {
                this.d.put(str2, a);
            }
        } else if (!ajee.A) {
            ajee.a(aakm, ajee.a(((aakm) amqw.a((Object) aakm)).a(), xvd.a(str2), str, true, this.b.a));
            ajee.F = z;
            ajee.a(aajj.a(ajee.a));
            ajee.d();
        }
    }

    public final void a(String str, long j) {
        for (ajee ajee : this.d.values()) {
            ajet ajet = ajee.i;
            String f = ajee.f();
            String b = ajee.b(j);
            int length = String.valueOf(f).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 2) + String.valueOf(str).length()) + String.valueOf(b).length());
            stringBuilder.append(f);
            f = ":";
            stringBuilder.append(f);
            stringBuilder.append(str);
            stringBuilder.append(f);
            stringBuilder.append(b);
            ajet.a("error", stringBuilder.toString());
            ajee.i.a();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjd.class, ahjn.class};
        } else if (i == 0) {
            a((ahjd) obj);
            return null;
        } else if (i == 1) {
            a((ahjn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
