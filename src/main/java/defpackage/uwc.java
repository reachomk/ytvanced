package defpackage;

import android.content.Context;

/* renamed from: uwc */
public class uwc extends alcs {
    public final uvn a;
    public final aldg b;
    private final uwm g;

    public uwc(Context context, aaas aaas, acvx acvx, alct alct, aldg aldg, uvn uvn, uwm uwm) {
        super(context, aaas, acvx, alct, aldg);
        this.a = uvn;
        this.g = uwm;
        this.b = aldg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Missing block: B:11:0x0030, code skipped:
            if (r4 == 225) goto L_0x0034;
     */
    public android.preference.Preference a(defpackage.akaf r19, java.lang.String r20) {
        /*
        r18 = this;
        r9 = r18;
        r0 = r19;
        r1 = r0.b;
        r2 = r0.a;
        r3 = 0;
        if (r1 == 0) goto L_0x00de;
    L_0x000b:
        r4 = r1.b;
        r4 = defpackage.axhi.a(r4);
        r5 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r6 = 289; // 0x121 float:4.05E-43 double:1.43E-321;
        if (r4 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x001d;
    L_0x0018:
        r7 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        if (r4 != r7) goto L_0x001d;
    L_0x001c:
        goto L_0x0034;
    L_0x001d:
        r4 = r1.b;
        r4 = defpackage.axhi.a(r4);
        if (r4 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0028;
    L_0x0026:
        if (r4 == r6) goto L_0x0034;
    L_0x0028:
        r4 = r1.b;
        r4 = defpackage.axhi.a(r4);
        if (r4 == 0) goto L_0x00de;
    L_0x0030:
        if (r4 == r5) goto L_0x0034;
    L_0x0032:
        goto L_0x00de;
    L_0x0034:
        r8 = r0.b;
        r0 = r1.b;
        r0 = defpackage.axhi.a(r0);
        r16 = 1;
        if (r0 != 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0046;
    L_0x0041:
        if (r0 != r6) goto L_0x0046;
    L_0x0043:
        r17 = 1;
        goto L_0x0052;
    L_0x0046:
        r0 = r1.b;
        r0 = defpackage.axhi.a(r0);
        if (r0 == 0) goto L_0x0050;
    L_0x004e:
        if (r0 == r5) goto L_0x0043;
    L_0x0050:
        r17 = 0;
    L_0x0052:
        r7 = new uwk;
        r11 = r9.c;
        r13 = r9.g;
        r14 = r9.b;
        r10 = r7;
        r12 = r17;
        r15 = r8;
        r10.<init>(r11, r12, r13, r14, r15);
        r0 = r8.a;
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x0074;
    L_0x0067:
        r0 = r8.c;
        if (r0 != 0) goto L_0x006d;
    L_0x006b:
        r0 = defpackage.arml.f;
    L_0x006d:
        r0 = defpackage.ajqy.a(r0);
        r7.setTitle(r0);
    L_0x0074:
        r0 = r8.e;
        r0 = java.lang.Boolean.valueOf(r0);
        r7.setDefaultValue(r0);
        r10 = new uwg;
        r3 = r9.b;
        r5 = r9.g;
        r11 = r9.d;
        r0 = r10;
        r1 = r7;
        r2 = r18;
        r4 = r8;
        r6 = r7;
        r12 = r7;
        r7 = r11;
        r11 = r8;
        r8 = r17;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r12.setOnPreferenceChangeListener(r10);
        r0 = r11.f;
        r0 = r0 ^ 1;
        r12.setEnabled(r0);
        r0 = r11.f;
        if (r0 != 0) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00b3;
    L_0x00a2:
        r0 = r11.a;
        r0 = r0 & 1024;
        if (r0 == 0) goto L_0x00b3;
    L_0x00a8:
        r0 = r11.j;
        if (r0 != 0) goto L_0x00ae;
    L_0x00ac:
        r0 = defpackage.arml.f;
    L_0x00ae:
        r0 = defpackage.ajqy.a(r0);
        goto L_0x00d3;
    L_0x00b3:
        r0 = r11.e;
        if (r0 == 0) goto L_0x00b8;
    L_0x00b7:
        goto L_0x00c9;
    L_0x00b8:
        r0 = r11.a;
        r0 = r0 & 512;
        if (r0 == 0) goto L_0x00c9;
    L_0x00be:
        r0 = r11.i;
        if (r0 != 0) goto L_0x00c4;
    L_0x00c2:
        r0 = defpackage.arml.f;
    L_0x00c4:
        r0 = defpackage.ajqy.a(r0);
        goto L_0x00d3;
    L_0x00c9:
        r0 = r11.d;
        if (r0 != 0) goto L_0x00cf;
    L_0x00cd:
        r0 = defpackage.arml.f;
    L_0x00cf:
        r0 = defpackage.ajqy.a(r0);
    L_0x00d3:
        r12.setSummary(r0);
        r0 = r9.g;
        r0 = r0.a;
        r0.add(r12);
        return r12;
    L_0x00de:
        if (r2 == 0) goto L_0x01af;
    L_0x00e0:
        r1 = r2.b;
        r1 = defpackage.axhi.a(r1);
        if (r1 == 0) goto L_0x01af;
    L_0x00e8:
        r4 = 291; // 0x123 float:4.08E-43 double:1.44E-321;
        if (r1 == r4) goto L_0x00ee;
    L_0x00ec:
        goto L_0x01af;
    L_0x00ee:
        r0 = new uwi;
        r1 = r9.c;
        r4 = r9.b;
        r0.<init>(r1, r4);
        r1 = r2.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0117;
    L_0x00fd:
        r1 = r2.c;
        if (r1 != 0) goto L_0x0103;
    L_0x0101:
        r1 = defpackage.arml.f;
    L_0x0103:
        r1 = defpackage.ajqy.a(r1);
        r0.setTitle(r1);
        r1 = r2.c;
        if (r1 != 0) goto L_0x0110;
    L_0x010e:
        r1 = defpackage.arml.f;
    L_0x0110:
        r1 = defpackage.ajqy.a(r1);
        r0.setDialogTitle(r1);
    L_0x0117:
        r1 = r2.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x012a;
    L_0x011d:
        r1 = r2.d;
        if (r1 != 0) goto L_0x0123;
    L_0x0121:
        r1 = defpackage.arml.f;
    L_0x0123:
        r1 = defpackage.ajqy.a(r1);
        r0.setSummary(r1);
    L_0x012a:
        r1 = r2.e;
        r4 = new uwe;
        r4.<init>(r9);
        r1 = defpackage.amux.a(r1, r4);
        r1 = defpackage.amvj.a(r1);
        r4 = defpackage.uwd.a;
        r1 = defpackage.amvj.a(r1, r4);
        r4 = 0;
    L_0x0140:
        r5 = r1.size();
        r6 = -1;
        if (r4 >= r5) goto L_0x015a;
    L_0x0147:
        r5 = r1.get(r4);
        r5 = (defpackage.axgu) r5;
        r5 = r5.b;
        r7 = "FINGERPRINT";
        r5 = r7.equalsIgnoreCase(r5);
        if (r5 != 0) goto L_0x015b;
    L_0x0157:
        r4 = r4 + 1;
        goto L_0x0140;
    L_0x015a:
        r4 = -1;
    L_0x015b:
        if (r4 >= 0) goto L_0x015e;
    L_0x015d:
        goto L_0x0162;
    L_0x015e:
        r0.a = r4;
        r0.b = r1;
    L_0x0162:
        r4 = r1.size();
        r4 = new java.lang.CharSequence[r4];
        r5 = r1.size();
        r5 = new java.lang.CharSequence[r5];
        r7 = -1;
    L_0x016f:
        r8 = r1.size();
        if (r3 >= r8) goto L_0x0190;
    L_0x0175:
        r8 = r1.get(r3);
        r8 = (defpackage.axgu) r8;
        r10 = r8.b;
        r4[r3] = r10;
        r10 = r8.d;
        r5[r3] = r10;
        r10 = r9.b;
        r8 = r10.a(r8);
        if (r8 != 0) goto L_0x018c;
    L_0x018b:
        goto L_0x018d;
    L_0x018c:
        r7 = r3;
    L_0x018d:
        r3 = r3 + 1;
        goto L_0x016f;
    L_0x0190:
        r0.setEntries(r4);
        r0.setEntryValues(r5);
        if (r7 != r6) goto L_0x0199;
    L_0x0198:
        goto L_0x01a6;
    L_0x0199:
        if (r7 == r6) goto L_0x019c;
    L_0x019b:
        r6 = r7;
    L_0x019c:
        r0.setValueIndex(r6);
        r3 = r0.getEntry();
        r0.setSummary(r3);
    L_0x01a6:
        r3 = new uwb;
        r3.<init>(r9, r2, r1, r0);
        r0.setOnPreferenceChangeListener(r3);
        return r0;
    L_0x01af:
        r0 = super.a(r19, r20);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwc.a(akaf, java.lang.String):android.preference.Preference");
    }
}
