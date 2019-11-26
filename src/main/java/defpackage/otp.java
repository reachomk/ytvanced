package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: otp */
public final class otp extends ori {
    private final oto a = new oto();
    private final oza b = new oza();
    private final otl c = new otl();
    private final otf d = new otf();
    private final List e = new ArrayList();

    public otp() {
        super("WebvttDecoder");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x002b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0275 A:{SYNTHETIC, EDGE_INSN: B:172:0x0275->B:124:0x0275 ?: BREAK  , EDGE_INSN: B:172:0x0275->B:124:0x0275 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x002b A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:43:0x00fc, code skipped:
            if (r3 != null) goto L_0x0100;
     */
    public final /* synthetic */ defpackage.ork a(byte[] r19, int r20, boolean r21) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r1.b;
        r2 = r19;
        r3 = r20;
        r0.a(r2, r3);
        r0 = r1.c;
        r0.a();
        r0 = r1.e;
        r0.clear();
        r0 = r1.b;	 Catch:{ oae -> 0x02d3 }
        defpackage.ots.a(r0);	 Catch:{ oae -> 0x02d3 }
    L_0x001a:
        r0 = r1.b;
        r0 = r0.s();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x001a;
    L_0x0026:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x002b:
        r2 = r1.b;
        r3 = 2;
        r4 = -1;
        r5 = 0;
        r6 = 1;
        r7 = -1;
        r8 = 0;
    L_0x0033:
        if (r7 == r4) goto L_0x02a6;
    L_0x0035:
        r2.c(r8);
        if (r7 == 0) goto L_0x02a0;
    L_0x003a:
        if (r7 == r6) goto L_0x0293;
    L_0x003c:
        if (r7 == r3) goto L_0x005b;
    L_0x003e:
        r2 = r1.a;
        r3 = r1.b;
        r4 = r1.c;
        r5 = r1.e;
        r2 = r2.a(r3, r4, r5);
        if (r2 == 0) goto L_0x002b;
    L_0x004c:
        r2 = r1.c;
        r2 = r2.b();
        r0.add(r2);
        r2 = r1.c;
        r2.a();
        goto L_0x002b;
    L_0x005b:
        r2 = r0.isEmpty();
        if (r2 == 0) goto L_0x028b;
    L_0x0061:
        r2 = r1.b;
        r2.s();
        r2 = r1.d;
        r3 = r1.b;
        r7 = r2.c;
        r7.setLength(r5);
        r7 = r3.b;
    L_0x0071:
        r8 = r3.s();
        r8 = android.text.TextUtils.isEmpty(r8);
        if (r8 == 0) goto L_0x0288;
    L_0x007b:
        r8 = r2.b;
        r9 = r3.a;
        r3 = r3.b;
        r8.a(r9, r3);
        r3 = r2.b;
        r3.c(r7);
        r3 = r2.b;
        r7 = r2.c;
        defpackage.otf.a(r3);
        r8 = r3.b();
        r9 = "{";
        r10 = 5;
        r11 = "";
        if (r8 < r10) goto L_0x00ff;
    L_0x009b:
        r8 = r3.e(r10);
        r10 = "::cue";
        r8 = r10.equals(r8);
        if (r8 != 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00ff;
    L_0x00a8:
        r8 = r3.b;
        r10 = defpackage.otf.a(r3, r7);
        if (r10 == 0) goto L_0x00ff;
    L_0x00b0:
        r13 = r9.equals(r10);
        if (r13 == 0) goto L_0x00bb;
    L_0x00b6:
        r3.c(r8);
        r8 = r11;
        goto L_0x0100;
    L_0x00bb:
        r8 = "(";
        r8 = r8.equals(r10);
        if (r8 == 0) goto L_0x00ef;
    L_0x00c3:
        r8 = r3.b;
        r10 = r3.c;
        r13 = 0;
    L_0x00c8:
        if (r8 < r10) goto L_0x00cb;
    L_0x00ca:
        goto L_0x00e1;
    L_0x00cb:
        if (r13 != 0) goto L_0x00e1;
    L_0x00cd:
        r13 = r8 + 1;
        r14 = r3.a;
        r8 = r14[r8];
        r8 = (char) r8;
        r14 = 41;
        if (r8 != r14) goto L_0x00da;
    L_0x00d8:
        r8 = 1;
        goto L_0x00db;
    L_0x00da:
        r8 = 0;
    L_0x00db:
        r17 = r13;
        r13 = r8;
        r8 = r17;
        goto L_0x00c8;
    L_0x00e1:
        r8 = r8 + -1;
        r10 = r3.b;
        r8 = r8 - r10;
        r8 = r3.e(r8);
        r8 = r8.trim();
        goto L_0x00f0;
    L_0x00ef:
        r8 = 0;
    L_0x00f0:
        r3 = defpackage.otf.a(r3, r7);
        r7 = ")";
        r7 = r7.equals(r3);
        if (r7 == 0) goto L_0x00ff;
    L_0x00fc:
        if (r3 == 0) goto L_0x00ff;
    L_0x00fe:
        goto L_0x0100;
    L_0x00ff:
        r8 = 0;
    L_0x0100:
        if (r8 != 0) goto L_0x0104;
    L_0x0102:
        goto L_0x027e;
    L_0x0104:
        r3 = r2.b;
        r7 = r2.c;
        r3 = defpackage.otf.a(r3, r7);
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x027e;
    L_0x0112:
        r3 = new otk;
        r3.<init>();
        r7 = r11.equals(r8);
        if (r7 != 0) goto L_0x016f;
    L_0x011d:
        r7 = 91;
        r7 = r8.indexOf(r7);
        if (r7 == r4) goto L_0x013f;
    L_0x0125:
        r9 = defpackage.otf.a;
        r10 = r8.substring(r7);
        r9 = r9.matcher(r10);
        r10 = r9.matches();
        if (r10 == 0) goto L_0x013b;
    L_0x0135:
        r9 = r9.group(r6);
        r3.d = r9;
    L_0x013b:
        r8 = r8.substring(r5, r7);
    L_0x013f:
        r7 = "\\.";
        r7 = defpackage.ozp.a(r8, r7);
        r8 = r7[r5];
        r9 = 35;
        r9 = r8.indexOf(r9);
        if (r9 == r4) goto L_0x015e;
    L_0x014f:
        r4 = r8.substring(r5, r9);
        r3.b = r4;
        r9 = r9 + 1;
        r4 = r8.substring(r9);
        r3.a = r4;
        goto L_0x0160;
    L_0x015e:
        r3.b = r8;
    L_0x0160:
        r4 = r7.length;
        if (r4 <= r6) goto L_0x016f;
    L_0x0163:
        r4 = java.util.Arrays.copyOfRange(r7, r6, r4);
        r4 = (java.lang.String[]) r4;
        r4 = java.util.Arrays.asList(r4);
        r3.c = r4;
    L_0x016f:
        r4 = 0;
        r7 = 0;
    L_0x0171:
        r8 = "}";
        if (r4 != 0) goto L_0x0275;
    L_0x0175:
        r4 = r2.b;
        r7 = r4.b;
        r9 = r2.c;
        r4 = defpackage.otf.a(r4, r9);
        if (r4 == 0) goto L_0x018a;
    L_0x0181:
        r9 = r8.equals(r4);
        if (r9 == 0) goto L_0x0188;
    L_0x0187:
        goto L_0x018a;
    L_0x0188:
        r9 = 0;
        goto L_0x018b;
    L_0x018a:
        r9 = 1;
    L_0x018b:
        if (r9 != 0) goto L_0x026e;
    L_0x018d:
        r10 = r2.b;
        r10.c(r7);
        r7 = r2.b;
        r10 = r2.c;
        defpackage.otf.a(r7);
        r13 = defpackage.otf.b(r7, r10);
        r14 = r11.equals(r13);
        if (r14 != 0) goto L_0x026e;
    L_0x01a3:
        r14 = defpackage.otf.a(r7, r10);
        r15 = ":";
        r14 = r15.equals(r14);
        if (r14 == 0) goto L_0x026e;
    L_0x01af:
        defpackage.otf.a(r7);
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r15 = 0;
    L_0x01b8:
        r5 = ";";
        if (r15 == 0) goto L_0x01c1;
    L_0x01bc:
        r14 = r14.toString();
        goto L_0x01e2;
    L_0x01c1:
        r12 = r7.b;
        r6 = defpackage.otf.a(r7, r10);
        if (r6 == 0) goto L_0x01e1;
    L_0x01c9:
        r16 = r8.equals(r6);
        if (r16 != 0) goto L_0x01db;
    L_0x01cf:
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x01d6;
    L_0x01d5:
        goto L_0x01db;
    L_0x01d6:
        r14.append(r6);
        r6 = 1;
        goto L_0x01b8;
    L_0x01db:
        r7.c(r12);
        r6 = 1;
        r15 = 1;
        goto L_0x01b8;
    L_0x01e1:
        r14 = 0;
    L_0x01e2:
        if (r14 == 0) goto L_0x026e;
    L_0x01e4:
        r6 = r11.equals(r14);
        if (r6 != 0) goto L_0x026e;
    L_0x01ea:
        r6 = r7.b;
        r10 = defpackage.otf.a(r7, r10);
        r5 = r5.equals(r10);
        if (r5 != 0) goto L_0x01ff;
    L_0x01f6:
        r5 = r8.equals(r10);
        if (r5 == 0) goto L_0x026e;
    L_0x01fc:
        r7.c(r6);
    L_0x01ff:
        r5 = "color";
        r5 = r5.equals(r13);
        if (r5 == 0) goto L_0x0211;
    L_0x0207:
        r5 = defpackage.oyg.b(r14);
        r3.f = r5;
        r5 = 1;
        r3.g = r5;
        goto L_0x026f;
    L_0x0211:
        r5 = 1;
        r6 = "background-color";
        r6 = r6.equals(r13);
        if (r6 == 0) goto L_0x0223;
    L_0x021a:
        r6 = defpackage.oyg.b(r14);
        r3.h = r6;
        r3.i = r5;
        goto L_0x026f;
    L_0x0223:
        r6 = "text-decoration";
        r6 = r6.equals(r13);
        if (r6 == 0) goto L_0x0236;
    L_0x022b:
        r6 = "underline";
        r6 = r6.equals(r14);
        if (r6 == 0) goto L_0x026f;
    L_0x0233:
        r3.k = r5;
        goto L_0x026f;
    L_0x0236:
        r5 = "font-family";
        r5 = r5.equals(r13);
        if (r5 != 0) goto L_0x0266;
    L_0x023e:
        r5 = "font-weight";
        r5 = r5.equals(r13);
        if (r5 == 0) goto L_0x0252;
    L_0x0246:
        r5 = "bold";
        r5 = r5.equals(r14);
        if (r5 == 0) goto L_0x026e;
    L_0x024e:
        r5 = 1;
        r3.l = r5;
        goto L_0x026f;
    L_0x0252:
        r5 = 1;
        r6 = "font-style";
        r6 = r6.equals(r13);
        if (r6 == 0) goto L_0x026f;
    L_0x025b:
        r6 = "italic";
        r6 = r6.equals(r14);
        if (r6 == 0) goto L_0x026f;
    L_0x0263:
        r3.m = r5;
        goto L_0x026f;
    L_0x0266:
        r5 = 1;
        r6 = defpackage.ozp.d(r14);
        r3.e = r6;
        goto L_0x026f;
    L_0x026e:
        r5 = 1;
    L_0x026f:
        r7 = r4;
        r4 = r9;
        r5 = 0;
        r6 = 1;
        goto L_0x0171;
    L_0x0275:
        r2 = r8.equals(r7);
        if (r2 != 0) goto L_0x027c;
    L_0x027b:
        goto L_0x027e;
    L_0x027c:
        r12 = r3;
        goto L_0x027f;
    L_0x027e:
        r12 = 0;
    L_0x027f:
        if (r12 == 0) goto L_0x002b;
    L_0x0281:
        r2 = r1.e;
        r2.add(r12);
        goto L_0x002b;
    L_0x0288:
        r5 = 0;
        goto L_0x0071;
    L_0x028b:
        r0 = new orm;
        r2 = "A style block was found after the first cue.";
        r0.<init>(r2);
        throw r0;
    L_0x0293:
        r2 = r1.b;
    L_0x0295:
        r3 = r2.s();
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x002b;
    L_0x029f:
        goto L_0x0295;
    L_0x02a0:
        r2 = new otr;
        r2.<init>(r0);
        return r2;
    L_0x02a6:
        r5 = 1;
        r8 = r2.b;
        r6 = r2.s();
        if (r6 == 0) goto L_0x02ce;
    L_0x02af:
        r7 = "STYLE";
        r7 = r7.equals(r6);
        if (r7 != 0) goto L_0x02c9;
    L_0x02b7:
        r7 = "NOTE";
        r6 = r6.startsWith(r7);
        if (r6 != 0) goto L_0x02c4;
    L_0x02bf:
        r7 = 3;
        r5 = 0;
        r6 = 1;
        goto L_0x0033;
    L_0x02c4:
        r5 = 0;
        r6 = 1;
        r7 = 1;
        goto L_0x0033;
    L_0x02c9:
        r5 = 0;
        r6 = 1;
        r7 = 2;
        goto L_0x0033;
    L_0x02ce:
        r5 = 0;
        r6 = 1;
        r7 = 0;
        goto L_0x0033;
    L_0x02d3:
        r0 = move-exception;
        r2 = new orm;
        r2.<init>(r0);
        goto L_0x02db;
    L_0x02da:
        throw r2;
    L_0x02db:
        goto L_0x02da;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otp.a(byte[], int, boolean):ork");
    }
}
