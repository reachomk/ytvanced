package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: akcq */
public class akcq extends akcn {
    private final aqhy a;
    private final acvx b;
    private final akcp c;

    protected akcq(aqhy aqhy, aaas aaas, acvx acvx, akcp akcp, Object obj) {
        super(aaas, obj);
        this.a = (aqhy) amqw.a((Object) aqhy);
        this.b = (acvx) amqw.a((Object) acvx);
        this.c = akcp;
    }

    public static void a(Context context, aqhy aqhy, aaas aaas, acvx acvx, Object obj) {
        akcq.a(context, aqhy, aaas, acvx, null, obj);
    }

    public static void a(Context context, aqhy aqhy, aaas aaas, acvx acvx, akcp akcp, Object obj) {
        akcq.a(context, aqhy, aaas, acvx, true, akcp, obj, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f8  */
    public static void a(android.content.Context r7, defpackage.aqhy r8, defpackage.aaas r9, defpackage.acvx r10, boolean r11, defpackage.akcp r12, java.lang.Object r13, defpackage.akvp r14) {
        /*
        r6 = new akcq;
        r0 = r6;
        r1 = r8;
        r2 = r9;
        r3 = r10;
        r4 = r12;
        r5 = r13;
        r0.<init>(r1, r2, r3, r4, r5);
        r12 = new android.app.AlertDialog$Builder;
        r12.<init>(r7);
        r7 = r8.a;
        r7 = r7 & 8;
        if (r7 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0030;
    L_0x0017:
        if (r14 == 0) goto L_0x0030;
    L_0x0019:
        r7 = r8.d;
        if (r7 != 0) goto L_0x001f;
    L_0x001d:
        r7 = defpackage.arwf.c;
    L_0x001f:
        r7 = r7.b;
        r7 = defpackage.arwh.a(r7);
        if (r7 != 0) goto L_0x0029;
    L_0x0027:
        r7 = defpackage.arwh.UNKNOWN;
    L_0x0029:
        r7 = r14.a(r7);
        r12.setIcon(r7);
    L_0x0030:
        r7 = r8.a;
        r14 = 1;
        r7 = r7 & r14;
        r0 = 0;
        if (r7 == 0) goto L_0x003e;
    L_0x0037:
        r7 = r8.b;
        if (r7 != 0) goto L_0x003f;
    L_0x003b:
        r7 = defpackage.arml.f;
        goto L_0x003f;
    L_0x003e:
        r7 = r0;
    L_0x003f:
        r7 = defpackage.ajqy.a(r7);
        r12.setTitle(r7);
        r7 = defpackage.akcs.a(r8, r9);
        r12.setMessage(r7);
        r7 = defpackage.akcs.d(r8);
        r12.setNegativeButton(r7, r6);
        r7 = defpackage.akcs.c(r8);
        r12.setPositiveButton(r7, r6);
        r7 = r12.create();
        r7.setCancelable(r14);
        r7.setCanceledOnTouchOutside(r11);
        r6.a(r7);
        r6.d();
        r11 = new acvs;
        r12 = r8.j;
        r11.<init>(r12);
        r10.a(r11, r0);
        r11 = defpackage.akcs.a(r8);
        if (r11 == 0) goto L_0x0085;
    L_0x007b:
        r12 = new acvs;
        r11 = r11.r;
        r12.<init>(r11);
        r10.a(r12, r0);
    L_0x0085:
        r11 = defpackage.akcs.b(r8);
        if (r11 == 0) goto L_0x0095;
    L_0x008b:
        r12 = new acvs;
        r11 = r11.r;
        r12.<init>(r11);
        r10.a(r12, r0);
    L_0x0095:
        r10 = 16908299; // 0x102000b float:2.387726E-38 double:8.3538097E-317;
        r10 = r7.findViewById(r10);
        r11 = r10 instanceof android.widget.TextView;
        if (r11 == 0) goto L_0x00b7;
    L_0x00a0:
        r10 = (android.widget.TextView) r10;
        r11 = android.text.method.LinkMovementMethod.getInstance();
        r10.setMovementMethod(r11);
        r11 = android.os.Build.VERSION.SDK_INT;
        r12 = 26;
        if (r11 >= r12) goto L_0x00b7;
    L_0x00af:
        r11 = new xou;
        r11.<init>(r10);
        defpackage.abe.a(r10, r11);
    L_0x00b7:
        r10 = 16908313; // 0x1020019 float:2.38773E-38 double:8.3538166E-317;
        r10 = r7.findViewById(r10);
        r10 = (android.widget.Button) r10;
        r11 = defpackage.akcs.a(r8);
        if (r11 != 0) goto L_0x00c7;
    L_0x00c6:
        goto L_0x00e1;
    L_0x00c7:
        r12 = r11.q;
        if (r12 != 0) goto L_0x00cd;
    L_0x00cb:
        r12 = defpackage.aodx.c;
    L_0x00cd:
        r12 = r12.a;
        r12 = r12 & r14;
        if (r12 == 0) goto L_0x00e1;
    L_0x00d2:
        r11 = r11.q;
        if (r11 != 0) goto L_0x00d8;
    L_0x00d6:
        r11 = defpackage.aodx.c;
    L_0x00d8:
        r11 = r11.b;
        if (r11 != 0) goto L_0x00de;
    L_0x00dc:
        r11 = defpackage.aodv.c;
    L_0x00de:
        r11 = r11.b;
        goto L_0x00e5;
    L_0x00e1:
        r11 = defpackage.akcs.c(r8);
    L_0x00e5:
        r10.setContentDescription(r11);
        r10 = 16908314; // 0x102001a float:2.3877302E-38 double:8.353817E-317;
        r7 = r7.findViewById(r10);
        r7 = (android.widget.Button) r7;
        r10 = defpackage.akcs.b(r8);
        if (r10 != 0) goto L_0x00f8;
    L_0x00f7:
        goto L_0x0112;
    L_0x00f8:
        r11 = r10.q;
        if (r11 != 0) goto L_0x00fe;
    L_0x00fc:
        r11 = defpackage.aodx.c;
    L_0x00fe:
        r11 = r11.a;
        r11 = r11 & r14;
        if (r11 == 0) goto L_0x0112;
    L_0x0103:
        r10 = r10.q;
        if (r10 != 0) goto L_0x0109;
    L_0x0107:
        r10 = defpackage.aodx.c;
    L_0x0109:
        r10 = r10.b;
        if (r10 != 0) goto L_0x010f;
    L_0x010d:
        r10 = defpackage.aodv.c;
    L_0x010f:
        r10 = r10.b;
        goto L_0x0116;
    L_0x0112:
        r10 = defpackage.akcs.d(r8);
    L_0x0116:
        r7.setContentDescription(r10);
        r7 = r8.h;
        r9.a(r7, r13);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akcq.a(android.content.Context, aqhy, aaas, acvx, boolean, akcp, java.lang.Object, akvp):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        aphg a = akcs.a(this.a);
        aaas aaas;
        if (a == null) {
            aqhy aqhy = this.a;
            int i = aqhy.a;
            apxu apxu;
            if ((262144 & i) != 0) {
                aaas = this.d;
                apxu = aqhy.o;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, c());
            } else if ((i & 65536) != 0) {
                aaas = this.d;
                apxu = aqhy.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, c());
            }
        } else {
            apxu apxu2;
            if ((a.a & 8192) != 0) {
                aaas = this.d;
                apxu2 = a.n;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas.a(apxu2, c());
            }
            if ((a.a & 4096) != 0) {
                aaas = this.d;
                apxu2 = a.m;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas.a(apxu2, c());
            }
            if ((a.a & 2048) != 0) {
                aaas = this.d;
                apxu2 = a.l;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas.a(apxu2, c());
            }
            this.b.a(3, new acvs(a.r), null);
        }
        akcp akcp = this.c;
        if (akcp != null) {
            akcp.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        aphg b = akcs.b(this.a);
        aaas aaas;
        if (b == null) {
            aqhy aqhy = this.a;
            if ((aqhy.a & 131072) != 0) {
                aaas = this.d;
                apxu apxu = aqhy.n;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, c());
            }
        } else {
            apxu apxu2;
            if ((b.a & 4096) != 0) {
                aaas = this.d;
                apxu2 = b.m;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas.a(apxu2, c());
            }
            if ((b.a & 2048) != 0) {
                aaas = this.d;
                apxu2 = b.l;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                aaas.a(apxu2, c());
            }
            this.b.a(3, new acvs(b.r), null);
        }
        akcp akcp = this.c;
        if (akcp != null) {
            akcp.b();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(int i) {
        akcp akcp = this.c;
        if (akcp != null) {
            akcp.a(i == 5);
        }
        if (i != 1) {
            this.d.a(this.a.i, this.e);
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final Map c() {
        Map c = super.c();
        c.remove(acwi.b);
        return c;
    }
}
