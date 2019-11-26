package defpackage;

import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: se */
public final class se {
    static float[] a(float[] fArr, int i) {
        if (i >= 0) {
            int min = Math.min(i, fArr.length);
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static Path a(String str) {
        Path path = new Path();
        sg[] b = se.b(str);
        if (b == null) {
            return null;
        }
        try {
            sg.a(b, path);
            return path;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error in parsing ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d1 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce A:{LOOP_END, Catch:{ NumberFormatException -> 0x00ea }, LOOP:3: B:32:0x009b->B:52:0x00ce} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3 A:{Catch:{ NumberFormatException -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0110 A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:40:0x00b1, code skipped:
            r15 = null;
     */
    public static defpackage.sg[] b(java.lang.String r18) {
        /*
        r0 = r18;
        if (r0 == 0) goto L_0x0119;
    L_0x0004:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = 1;
        r3 = 0;
        r4 = 1;
        r5 = 0;
    L_0x000d:
        r6 = r18.length();
        if (r4 < r6) goto L_0x0032;
    L_0x0013:
        r4 = r4 - r5;
        if (r4 != r2) goto L_0x0025;
    L_0x0016:
        r2 = r18.length();
        if (r5 >= r2) goto L_0x0025;
    L_0x001c:
        r0 = r0.charAt(r5);
        r2 = new float[r3];
        defpackage.se.a(r1, r0, r2);
    L_0x0025:
        r0 = r1.size();
        r0 = new defpackage.sg[r0];
        r0 = r1.toArray(r0);
        r0 = (defpackage.sg[]) r0;
        return r0;
    L_0x0032:
        r6 = r18.length();
        r7 = 69;
        r8 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r4 >= r6) goto L_0x0059;
    L_0x003c:
        r6 = r0.charAt(r4);
        r9 = r6 + -65;
        r10 = r6 + -90;
        r9 = r9 * r10;
        if (r9 <= 0) goto L_0x0051;
    L_0x0048:
        r9 = r6 + -97;
        r10 = r6 + -122;
        r9 = r9 * r10;
        if (r9 <= 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0056;
    L_0x0051:
        if (r6 == r8) goto L_0x0056;
    L_0x0053:
        if (r6 == r7) goto L_0x0056;
    L_0x0055:
        goto L_0x0059;
    L_0x0056:
        r4 = r4 + 1;
        goto L_0x0032;
    L_0x0059:
        r5 = r0.substring(r5, r4);
        r5 = r5.trim();
        r6 = r5.length();
        if (r6 > 0) goto L_0x0069;
    L_0x0067:
        goto L_0x0110;
    L_0x0069:
        r6 = r5.charAt(r3);
        r9 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r6 == r9) goto L_0x0107;
    L_0x0071:
        r6 = r5.charAt(r3);
        r9 = 90;
        if (r6 != r9) goto L_0x007b;
    L_0x0079:
        goto L_0x0107;
    L_0x007b:
        r6 = r5.length();	 Catch:{ NumberFormatException -> 0x00ea }
        r6 = new float[r6];	 Catch:{ NumberFormatException -> 0x00ea }
        r9 = new sh;	 Catch:{ NumberFormatException -> 0x00ea }
        r9.<init>();	 Catch:{ NumberFormatException -> 0x00ea }
        r10 = r5.length();	 Catch:{ NumberFormatException -> 0x00ea }
        r11 = 1;
        r12 = 0;
    L_0x008c:
        if (r11 < r10) goto L_0x0094;
    L_0x008e:
        r6 = defpackage.se.a(r6, r12);	 Catch:{ NumberFormatException -> 0x00ea }
        goto L_0x0109;
    L_0x0094:
        r9.a = r3;	 Catch:{ NumberFormatException -> 0x00ea }
        r13 = r11;
        r14 = 0;
        r15 = 0;
        r16 = 0;
    L_0x009b:
        r3 = r5.length();	 Catch:{ NumberFormatException -> 0x00ea }
        if (r13 >= r3) goto L_0x00d1;
    L_0x00a1:
        r3 = r5.charAt(r13);	 Catch:{ NumberFormatException -> 0x00ea }
        r2 = 32;
        if (r3 == r2) goto L_0x00c4;
    L_0x00a9:
        if (r3 == r7) goto L_0x00c6;
    L_0x00ab:
        if (r3 == r8) goto L_0x00c6;
    L_0x00ad:
        switch(r3) {
            case 44: goto L_0x00c4;
            case 45: goto L_0x00bc;
            case 46: goto L_0x00b3;
            default: goto L_0x00b0;
        };	 Catch:{ NumberFormatException -> 0x00ea }
    L_0x00b0:
        r2 = 1;
    L_0x00b1:
        r15 = 0;
        goto L_0x00cc;
    L_0x00b3:
        if (r14 != 0) goto L_0x00b8;
    L_0x00b5:
        r2 = 1;
        r14 = 1;
        goto L_0x00b1;
    L_0x00b8:
        r2 = 1;
        r9.a = r2;	 Catch:{ NumberFormatException -> 0x00ea }
        goto L_0x00c9;
    L_0x00bc:
        r2 = 1;
        if (r13 == r11) goto L_0x00b1;
    L_0x00bf:
        if (r15 != 0) goto L_0x00b1;
    L_0x00c1:
        r9.a = r2;	 Catch:{ NumberFormatException -> 0x00ea }
        goto L_0x00c9;
    L_0x00c4:
        r2 = 1;
        goto L_0x00c9;
    L_0x00c6:
        r2 = 1;
        r15 = 1;
        goto L_0x00cc;
    L_0x00c9:
        r15 = 0;
        r16 = 1;
    L_0x00cc:
        if (r16 != 0) goto L_0x00d1;
    L_0x00ce:
        r13 = r13 + 1;
        goto L_0x009b;
    L_0x00d1:
        if (r11 >= r13) goto L_0x00e0;
    L_0x00d3:
        r3 = r12 + 1;
        r11 = r5.substring(r11, r13);	 Catch:{ NumberFormatException -> 0x00ea }
        r11 = java.lang.Float.parseFloat(r11);	 Catch:{ NumberFormatException -> 0x00ea }
        r6[r12] = r11;	 Catch:{ NumberFormatException -> 0x00ea }
        r12 = r3;
    L_0x00e0:
        r3 = r9.a;	 Catch:{ NumberFormatException -> 0x00ea }
        if (r3 != 0) goto L_0x00e7;
    L_0x00e4:
        r11 = r13 + 1;
        goto L_0x00e8;
    L_0x00e7:
        r11 = r13;
    L_0x00e8:
        r3 = 0;
        goto L_0x008c;
    L_0x00ea:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "error in parsing \"";
        r2.append(r3);
        r2.append(r5);
        r3 = "\"";
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x0107:
        r6 = new float[r3];
    L_0x0109:
        r5 = r5.charAt(r3);
        defpackage.se.a(r1, r5, r6);
    L_0x0110:
        r5 = r4 + 1;
        r17 = r5;
        r5 = r4;
        r4 = r17;
        goto L_0x000d;
    L_0x0119:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.b(java.lang.String):sg[]");
    }

    public static sg[] a(sg[] sgVarArr) {
        if (sgVarArr == null) {
            return null;
        }
        sg[] sgVarArr2 = new sg[sgVarArr.length];
        for (int i = 0; i < sgVarArr.length; i++) {
            sgVarArr2[i] = new sg(sgVarArr[i]);
        }
        return sgVarArr2;
    }

    public static boolean a(sg[] sgVarArr, sg[] sgVarArr2) {
        if (sgVarArr == null || sgVarArr2 == null || sgVarArr.length != sgVarArr2.length) {
            return false;
        }
        for (int i = 0; i < sgVarArr.length; i++) {
            sg sgVar = sgVarArr[i];
            char c = sgVar.a;
            sg sgVar2 = sgVarArr2[i];
            if (c != sgVar2.a || sgVar.b.length != sgVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    private static void a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new sg(c, fArr));
    }
}
