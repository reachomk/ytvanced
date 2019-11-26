package defpackage;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abmy */
public final class abmy implements abnq {
    private final Map a;
    private byte[] b;
    private String c;

    public abmy(byte[] bArr, Map map) {
        this.b = bArr;
        this.a = map;
    }

    public final int a() {
        return 1;
    }

    public abmy(byte[] bArr) {
        this.b = bArr;
        this.a = new HashMap();
    }

    public abmy() {
        this.c = null;
        this.a = new HashMap();
    }

    public final byte[] b() {
        byte[] bArr = this.b;
        if (bArr == null) {
            String str = this.c;
            if (str != null) {
                return str.getBytes(Charset.forName("UTF-8"));
            }
            bArr = null;
        }
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0148 A:{Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110 A:{Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }} */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0131 A:{Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0148 A:{Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009b */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:31|32) */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            r9.clear();
            defpackage.xtl.c("Invalid group ID found in suggestions");
     */
    public final defpackage.abnp c() {
        /*
        r27 = this;
        r1 = r27;
        r0 = "zm";
        r2 = "zl";
        r3 = "du";
        r4 = "b";
        r5 = "ai";
        r6 = "e";
        r7 = r1.c;
        r8 = 0;
        if (r7 != 0) goto L_0x0033;
    L_0x0013:
        r7 = r1.b;
        if (r7 == 0) goto L_0x0032;
    L_0x0017:
        r9 = r7.length;
        if (r9 == 0) goto L_0x0032;
    L_0x001a:
        r9 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0028 }
        r10 = r1.a;	 Catch:{ UnsupportedEncodingException -> 0x0028 }
        r10 = defpackage.bqp.a(r10);	 Catch:{ UnsupportedEncodingException -> 0x0028 }
        r9.<init>(r7, r10);	 Catch:{ UnsupportedEncodingException -> 0x0028 }
        r1.c = r9;	 Catch:{ UnsupportedEncodingException -> 0x0028 }
        goto L_0x0033;
    L_0x0028:
        r7 = new java.lang.String;
        r9 = r1.b;
        r7.<init>(r9);
        r1.c = r7;
        goto L_0x0033;
    L_0x0032:
        return r8;
    L_0x0033:
        r7 = r1.c;
        r7 = r7.isEmpty();
        if (r7 != 0) goto L_0x01c9;
    L_0x003b:
        r7 = new java.util.ArrayList;
        r9 = 10;
        r7.<init>(r9);
        r9 = r1.c;
        r10 = 91;
        r10 = r9.indexOf(r10);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r9 = r9.substring(r10);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r10 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r10.<init>(r9);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r9 = new android.util.SparseArray;	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r9.<init>();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r11 = r10.length();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r12 = 2;
        r13 = 1;
        r14 = 0;
        if (r11 <= r12) goto L_0x00a4;
    L_0x0061:
        r11 = r10.getJSONObject(r12);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r15 = r11.has(r6);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r15 == 0) goto L_0x0073;
    L_0x006b:
        r6 = r11.getInt(r6);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r6 <= 0) goto L_0x0073;
    L_0x0071:
        r6 = 1;
        goto L_0x0074;
    L_0x0073:
        r6 = 0;
    L_0x0074:
        r15 = r11.has(r5);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r15 == 0) goto L_0x00a5;
    L_0x007a:
        r5 = r11.getJSONObject(r5);	 Catch:{ NumberFormatException -> 0x009b }
        r11 = r5.keys();	 Catch:{ NumberFormatException -> 0x009b }
    L_0x0082:
        r15 = r11.hasNext();	 Catch:{ NumberFormatException -> 0x009b }
        if (r15 == 0) goto L_0x00a5;
    L_0x0088:
        r15 = r11.next();	 Catch:{ NumberFormatException -> 0x009b }
        r15 = (java.lang.String) r15;	 Catch:{ NumberFormatException -> 0x009b }
        r8 = java.lang.Integer.parseInt(r15);	 Catch:{ NumberFormatException -> 0x009b }
        r15 = r5.getString(r15);	 Catch:{ NumberFormatException -> 0x009b }
        r9.put(r8, r15);	 Catch:{ NumberFormatException -> 0x009b }
        r8 = 0;
        goto L_0x0082;
    L_0x009b:
        r9.clear();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r5 = "Invalid group ID found in suggestions";
        defpackage.xtl.c(r5);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        goto L_0x00a5;
    L_0x00a4:
        r6 = 0;
    L_0x00a5:
        r5 = r10.getJSONArray(r13);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r8 = 0;
        r10 = 0;
    L_0x00ab:
        r11 = r5.length();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r8 >= r11) goto L_0x0183;
    L_0x00b1:
        r11 = r5.getJSONArray(r8);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r15 = r11.getString(r14);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r12 = android.os.Build.VERSION.SDK_INT;	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r13 = 24;
        if (r12 < r13) goto L_0x00c6;
    L_0x00bf:
        r12 = 63;
        r12 = android.text.Html.fromHtml(r15, r12);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        goto L_0x00ca;
    L_0x00c6:
        r12 = android.text.Html.fromHtml(r15);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
    L_0x00ca:
        r26 = r12;
        r17 = r26.toString();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r12 = 1;
        r13 = r11.optInt(r12, r14);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r15 = r11.length();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r12 = 3;
        if (r15 > r12) goto L_0x00e2;
    L_0x00dc:
        r12 = 0;
    L_0x00dd:
        r21 = 0;
    L_0x00df:
        r25 = 0;
        goto L_0x010a;
    L_0x00e2:
        r12 = r11.getJSONObject(r12);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r15 = 33;
        if (r13 == r15) goto L_0x00fc;
    L_0x00ea:
        r15 = 35;
        if (r13 == r15) goto L_0x00ef;
    L_0x00ee:
        goto L_0x00dd;
    L_0x00ef:
        r15 = r12.has(r3);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r15 == 0) goto L_0x00dd;
    L_0x00f5:
        r15 = r12.getString(r3);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r21 = r15;
        goto L_0x00df;
    L_0x00fc:
        r15 = r12.has(r4);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r15 == 0) goto L_0x00dd;
    L_0x0102:
        r15 = r12.getString(r4);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r25 = r15;
        r21 = 0;
    L_0x010a:
        r15 = r9.size();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r15 <= 0) goto L_0x0125;
    L_0x0110:
        r15 = r12.has(r2);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r15 == 0) goto L_0x0125;
    L_0x0116:
        r15 = r12.getInt(r2);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r16 = r9.get(r15);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r16 = (java.lang.String) r16;	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r22 = r15;
        r23 = r16;
        goto L_0x0129;
    L_0x0125:
        r22 = 0;
        r23 = 0;
    L_0x0129:
        r15 = r9.size();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r16 = -1;
        if (r15 <= 0) goto L_0x013f;
    L_0x0131:
        r15 = r12.has(r0);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r15 == 0) goto L_0x013f;
    L_0x0137:
        r10 = r12.getInt(r0);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r24 = r10;
        r10 = 1;
        goto L_0x0141;
    L_0x013f:
        r24 = -1;
    L_0x0141:
        r12 = r11.length();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r15 = 2;
        if (r12 <= r15) goto L_0x016c;
    L_0x0148:
        r11 = r11.getJSONArray(r15);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r11 == 0) goto L_0x016c;
    L_0x014e:
        r12 = r11.length();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r12 <= 0) goto L_0x016c;
    L_0x0154:
        r12 = r11.length();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r12 = new int[r12];	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
    L_0x015a:
        r15 = r11.length();	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        if (r14 >= r15) goto L_0x0169;
    L_0x0160:
        r15 = r11.getInt(r14);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r12[r14] = r15;	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r14 = r14 + 1;
        goto L_0x015a;
    L_0x0169:
        r20 = r12;
        goto L_0x016e;
    L_0x016c:
        r20 = 0;
    L_0x016e:
        r11 = new abnv;	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r19 = defpackage.abnv.k;	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r16 = r11;
        r18 = r13;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r7.add(r11);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r8 = r8 + 1;
        r12 = 2;
        r13 = 1;
        r14 = 0;
        goto L_0x00ab;
    L_0x0183:
        if (r10 == 0) goto L_0x0188;
    L_0x0185:
        java.util.Collections.sort(r7);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
    L_0x0188:
        r0 = new abnp;	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        r0.<init>(r7, r6);	 Catch:{ JSONException -> 0x01ac, IndexOutOfBoundsException -> 0x018e }
        return r0;
    L_0x018e:
        r0 = move-exception;
        r2 = r1.c;
        r2 = java.lang.String.valueOf(r2);
        r3 = "Could not find valid response data, response was";
        r4 = r2.length();
        if (r4 != 0) goto L_0x01a3;
    L_0x019d:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x01a7;
    L_0x01a3:
        r2 = r3.concat(r2);
    L_0x01a7:
        defpackage.xtl.a(r2, r0);
    L_0x01aa:
        r2 = 0;
        return r2;
    L_0x01ac:
        r0 = move-exception;
        r2 = r1.c;
        r2 = java.lang.String.valueOf(r2);
        r3 = "error processing suggestions, response was ";
        r4 = r2.length();
        if (r4 != 0) goto L_0x01c1;
    L_0x01bb:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x01c5;
    L_0x01c1:
        r2 = r3.concat(r2);
    L_0x01c5:
        defpackage.xtl.a(r2, r0);
        goto L_0x01aa;
    L_0x01c9:
        r2 = r8;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmy.c():abnp");
    }
}
