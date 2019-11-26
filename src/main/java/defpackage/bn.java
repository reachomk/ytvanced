package defpackage;

import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: bn */
public final class bn extends Format {
    private static final String[] h = new String[]{"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] i;
    private static final String[] j;
    private static final Locale k;
    public static final long serialVersionUID = 7136212545847378652L;
    private transient Locale a;
    private transient ck b;
    private transient Map c;
    private transient DateFormat d;
    private transient NumberFormat e;
    private transient bu f;
    private transient bu g;

    public static final String a(Locale locale, String str, Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder(str.length());
        new bn(str, locale).a(0, null, null, null, objArr, new bq(stringBuilder), null);
        return stringBuilder.toString();
    }

    private bn(String str, Locale locale) {
        this.a = locale;
        ck ckVar;
        try {
            ckVar = this.b;
            if (ckVar == null) {
                this.b = new ck(str);
            } else {
                ckVar.a(str);
            }
            Map map = this.c;
            if (map != null) {
                map.clear();
            }
            int a = this.b.a() - 2;
            int i = 1;
            while (i < a) {
                cl a2 = this.b.a(i);
                if (a2.e == 6 && a2.b() == 2) {
                    Object instance;
                    int i2 = i + 2;
                    ck ckVar2 = this.b;
                    int i3 = i2 + 1;
                    String a3 = ckVar2.a(ckVar2.a(i2));
                    String str2 = "";
                    cl a4 = this.b.a(i3);
                    if (a4.e == 11) {
                        str2 = this.b.a(a4);
                        i3++;
                    }
                    int a5 = bn.a(a3, h);
                    if (a5 == 0) {
                        i2 = bn.a(str2, i);
                        if (i2 == 0) {
                            instance = NumberFormat.getInstance(this.a);
                        } else if (i2 == 1) {
                            instance = NumberFormat.getCurrencyInstance(this.a);
                        } else if (i2 == 2) {
                            instance = NumberFormat.getPercentInstance(this.a);
                        } else if (i2 != 3) {
                            instance = new DecimalFormat(str2, new DecimalFormatSymbols(this.a));
                        } else {
                            instance = NumberFormat.getIntegerInstance(this.a);
                        }
                    } else if (a5 == 1) {
                        i2 = bn.a(str2, j);
                        if (i2 == 0) {
                            instance = DateFormat.getDateInstance(2, this.a);
                        } else if (i2 == 1) {
                            instance = DateFormat.getDateInstance(3, this.a);
                        } else if (i2 == 2) {
                            instance = DateFormat.getDateInstance(2, this.a);
                        } else if (i2 == 3) {
                            instance = DateFormat.getDateInstance(1, this.a);
                        } else if (i2 != 4) {
                            instance = new SimpleDateFormat(str2, this.a);
                        } else {
                            instance = DateFormat.getDateInstance(0, this.a);
                        }
                    } else if (a5 == 2) {
                        i2 = bn.a(str2, j);
                        if (i2 == 0) {
                            instance = DateFormat.getTimeInstance(2, this.a);
                        } else if (i2 == 1) {
                            instance = DateFormat.getTimeInstance(3, this.a);
                        } else if (i2 == 2) {
                            instance = DateFormat.getTimeInstance(2, this.a);
                        } else if (i2 == 3) {
                            instance = DateFormat.getTimeInstance(1, this.a);
                        } else if (i2 != 4) {
                            instance = new SimpleDateFormat(str2, this.a);
                        } else {
                            instance = DateFormat.getTimeInstance(0, this.a);
                        }
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a3).length() + 22);
                        stringBuilder.append("Unknown format type \"");
                        stringBuilder.append(a3);
                        stringBuilder.append("\"");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(Integer.valueOf(i), instance);
                    i = i3;
                }
                i++;
            }
        } catch (RuntimeException e) {
            ckVar = this.b;
            if (ckVar != null) {
                ckVar.b = null;
                ckVar.e = false;
                ckVar.c.clear();
                ArrayList arrayList = ckVar.d;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
            throw e;
        }
    }

    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        a(obj, new bq(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj != null) {
            StringBuilder stringBuilder = new StringBuilder();
            bq bqVar = new bq(stringBuilder);
            bqVar.c = new ArrayList();
            a(obj, bqVar, null);
            AttributedString attributedString = new AttributedString(stringBuilder.toString());
            for (bp bpVar : bqVar.c) {
                attributedString.addAttribute(bpVar.a, bpVar.b, bpVar.c, bpVar.d);
            }
            return attributedString.getIterator();
        }
        throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x022e  */
    private final void a(java.lang.String r28, java.text.ParsePosition r29, java.lang.Object[] r30, java.util.Map r31) {
        /*
        r27 = this;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r31;
        if (r1 == 0) goto L_0x0260;
    L_0x000a:
        r4 = r0.b;
        r5 = r4.b;
        r6 = 0;
        r4 = r4.a(r6);
        r4 = r4.a();
        r7 = r29.getIndex();
        r8 = new java.text.ParsePosition;
        r8.<init>(r6);
        r9 = 1;
        r10 = r7;
        r7 = r4;
        r4 = 1;
    L_0x0024:
        r11 = r0.b;
        r11 = r11.a(r4);
        r12 = r11.e;
        r13 = r11.a;
        r13 = r13 - r7;
        if (r13 != 0) goto L_0x0032;
    L_0x0031:
        goto L_0x003c;
    L_0x0032:
        r7 = r5.regionMatches(r7, r1, r10, r13);
        if (r7 != 0) goto L_0x003c;
    L_0x0038:
        r2.setErrorIndex(r10);
        return;
    L_0x003c:
        r10 = r10 + r13;
        r7 = 2;
        if (r12 == r7) goto L_0x025d;
    L_0x0040:
        r13 = 3;
        if (r12 != r13) goto L_0x0047;
    L_0x0043:
        r22 = r5;
        goto L_0x024d;
    L_0x0047:
        r14 = 4;
        if (r12 == r14) goto L_0x0043;
    L_0x004a:
        r12 = r0.b;
        r12 = r12.b(r4);
        r11 = r11.b();
        r4 = r4 + 1;
        r14 = r0.b;
        r14 = r14.a(r4);
        if (r30 == 0) goto L_0x0068;
    L_0x005e:
        r14 = r14.c;
        r16 = java.lang.Integer.valueOf(r14);
        r15 = r16;
        r6 = 0;
        goto L_0x007e;
    L_0x0068:
        r6 = r14.e;
        r15 = 9;
        if (r6 == r15) goto L_0x0075;
    L_0x006e:
        r6 = r14.c;
        r6 = java.lang.Integer.toString(r6);
        goto L_0x007b;
    L_0x0075:
        r6 = r0.b;
        r6 = r6.a(r14);
    L_0x007b:
        r15 = r6;
        r6 = r15;
        r14 = 0;
    L_0x007e:
        r4 = r4 + 1;
        r7 = r0.c;
        if (r7 == 0) goto L_0x00ad;
    L_0x0084:
        r19 = r4 + -2;
        r13 = java.lang.Integer.valueOf(r19);
        r7 = r7.get(r13);
        r7 = (java.text.Format) r7;
        if (r7 == 0) goto L_0x00ad;
    L_0x0092:
        r8.setIndex(r10);
        r4 = r7.parseObject(r1, r8);
        r7 = r8.getIndex();
        if (r7 != r10) goto L_0x00a3;
    L_0x009f:
        r2.setErrorIndex(r10);
        return;
    L_0x00a3:
        r7 = r8.getIndex();
        r22 = r5;
        r24 = r6;
        goto L_0x0229;
    L_0x00ad:
        if (r11 == r9) goto L_0x01aa;
    L_0x00af:
        r7 = r0.c;
        if (r7 == 0) goto L_0x00bf;
    L_0x00b3:
        r13 = r4 + -2;
        r13 = java.lang.Integer.valueOf(r13);
        r7 = r7.containsKey(r13);
        if (r7 != 0) goto L_0x01aa;
    L_0x00bf:
        r7 = 3;
        if (r11 != r7) goto L_0x0173;
    L_0x00c2:
        r8.setIndex(r10);
        r7 = r0.b;
        r11 = r8.getIndex();
        r17 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
        r13 = r11;
    L_0x00ce:
        r15 = r7.c(r4);
        r9 = 7;
        if (r15 == r9) goto L_0x0151;
    L_0x00d5:
        r9 = r7.a(r4);
        r20 = r7.b(r9);
        r4 = r4 + 2;
        r9 = r7.b(r4);
        r15 = r7.b;
        r22 = r7.a(r4);
        r22 = r22.a();
        r19 = 1;
        r23 = 0;
        r26 = r22;
        r22 = r5;
        r5 = r26;
    L_0x00f7:
        r4 = r4 + 1;
        r24 = r6;
        r6 = r7.a(r4);
        if (r4 != r9) goto L_0x0105;
    L_0x0101:
        r25 = r7;
        r3 = 3;
        goto L_0x010d;
    L_0x0105:
        r25 = r7;
        r7 = r6.e;
        r3 = 3;
        if (r7 == r3) goto L_0x010d;
    L_0x010c:
        goto L_0x0126;
    L_0x010d:
        r7 = r6.a;
        r7 = r7 - r5;
        if (r7 == 0) goto L_0x011b;
    L_0x0112:
        r5 = r1.regionMatches(r11, r15, r5, r7);
        if (r5 == 0) goto L_0x0119;
    L_0x0118:
        goto L_0x011b;
    L_0x0119:
        r4 = -1;
        goto L_0x0130;
    L_0x011b:
        r5 = r23 + r7;
        if (r4 == r9) goto L_0x012f;
    L_0x011f:
        r6 = r6.a();
        r23 = r5;
        r5 = r6;
    L_0x0126:
        r3 = r31;
        r6 = r24;
        r7 = r25;
        r19 = 1;
        goto L_0x00f7;
    L_0x012f:
        r4 = r5;
    L_0x0130:
        if (r4 >= 0) goto L_0x0133;
    L_0x0132:
        goto L_0x0144;
    L_0x0133:
        r4 = r4 + r11;
        if (r4 > r13) goto L_0x0137;
    L_0x0136:
        goto L_0x0144;
    L_0x0137:
        r5 = r28.length();
        if (r4 != r5) goto L_0x0141;
    L_0x013d:
        r13 = r4;
        r17 = r20;
        goto L_0x0155;
    L_0x0141:
        r13 = r4;
        r17 = r20;
    L_0x0144:
        r4 = r9 + 1;
        r3 = r31;
        r5 = r22;
        r6 = r24;
        r7 = r25;
        r9 = 1;
        goto L_0x00ce;
    L_0x0151:
        r22 = r5;
        r24 = r6;
    L_0x0155:
        if (r13 != r11) goto L_0x015b;
    L_0x0157:
        r8.setErrorIndex(r11);
        goto L_0x015e;
    L_0x015b:
        r8.setIndex(r13);
    L_0x015e:
        r3 = r8.getIndex();
        if (r3 != r10) goto L_0x0168;
    L_0x0164:
        r2.setErrorIndex(r10);
        return;
    L_0x0168:
        r4 = java.lang.Double.valueOf(r17);
        r7 = r8.getIndex();
        r9 = 1;
        goto L_0x0229;
    L_0x0173:
        r1 = defpackage.cm.b(r11);
        if (r1 != 0) goto L_0x01a2;
    L_0x0179:
        r1 = 5;
        if (r11 != r1) goto L_0x017d;
    L_0x017c:
        goto L_0x01a2;
    L_0x017d:
        r1 = new java.lang.IllegalStateException;
        r2 = defpackage.cm.a(r11);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 19;
        r4.<init>(r3);
        r3 = "unexpected argType ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        r1.<init>(r2);
        throw r1;
    L_0x01a2:
        r1 = new java.lang.UnsupportedOperationException;
        r2 = "Parsing of plural/select/selectordinal argument is not supported.";
        r1.<init>(r2);
        throw r1;
    L_0x01aa:
        r22 = r5;
        r24 = r6;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r0.b;
        r5 = r4.b;
        r4 = r4.a(r12);
        r4 = r4.a();
        r6 = r12 + 1;
    L_0x01c1:
        r7 = r0.b;
        r7 = r7.a(r6);
        r9 = r7.e;
        r11 = r7.a;
        r3.append(r5, r4, r11);
        r4 = 6;
        if (r9 != r4) goto L_0x01d2;
    L_0x01d1:
        goto L_0x01dc;
    L_0x01d2:
        r4 = 2;
        if (r9 == r4) goto L_0x01dc;
    L_0x01d5:
        r4 = r7.a();
        r6 = r6 + 1;
        goto L_0x01c1;
    L_0x01dc:
        r3 = r3.toString();
        r4 = r3.length();
        if (r4 == 0) goto L_0x01eb;
    L_0x01e6:
        r3 = r1.indexOf(r3, r10);
        goto L_0x01ef;
    L_0x01eb:
        r3 = r28.length();
    L_0x01ef:
        r7 = r3;
        if (r7 < 0) goto L_0x0249;
    L_0x01f2:
        r3 = r1.substring(r10, r7);
        r4 = r15.toString();
        r5 = java.lang.String.valueOf(r4);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r9 = 2;
        r5 = r5 + r9;
        r6.<init>(r5);
        r5 = "{";
        r6.append(r5);
        r6.append(r4);
        r4 = "}";
        r6.append(r4);
        r4 = r6.toString();
        r4 = r3.equals(r4);
        if (r4 != 0) goto L_0x0223;
    L_0x0220:
        r17 = r3;
        goto L_0x0225;
    L_0x0223:
        r17 = 0;
    L_0x0225:
        r9 = r4 ^ 1;
        r4 = r17;
    L_0x0229:
        if (r9 != 0) goto L_0x022e;
    L_0x022b:
        r3 = r31;
        goto L_0x023c;
    L_0x022e:
        if (r30 == 0) goto L_0x0233;
    L_0x0230:
        r30[r14] = r4;
        goto L_0x022b;
    L_0x0233:
        r3 = r31;
        if (r3 == 0) goto L_0x023c;
    L_0x0237:
        r15 = r24;
        r3.put(r15, r4);
    L_0x023c:
        r4 = r0.b;
        r4 = r4.a(r12);
        r4 = r4.a();
        r10 = r7;
        r7 = r4;
        goto L_0x0253;
    L_0x0249:
        r2.setErrorIndex(r10);
        return;
    L_0x024d:
        r5 = r11.a();
        r12 = r4;
        r7 = r5;
    L_0x0253:
        r4 = 1;
        r5 = r12 + 1;
        r4 = r5;
        r5 = r22;
        r6 = 0;
        r9 = 1;
        goto L_0x0024;
    L_0x025d:
        r2.setIndex(r10);
    L_0x0260:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn.a(java.lang.String, java.text.ParsePosition, java.lang.Object[], java.util.Map):void");
    }

    public final Object parseObject(String str, ParsePosition parsePosition) {
        int index;
        if (this.b.e) {
            Map hashMap = new HashMap();
            index = parsePosition.getIndex();
            a(str, parsePosition, null, hashMap);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return hashMap;
        }
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i != 0) {
                i = this.b.b(i);
            }
            int c;
            do {
                i++;
                c = this.b.c(i);
                if (c == 6) {
                    break;
                }
            } while (c != 2);
            i = -1;
            if (i < 0) {
                break;
            }
            short s = this.b.a(i + 1).c;
            if (s > i2) {
                i2 = s;
            }
        }
        Object[] objArr = new Object[(i2 + 1)];
        index = parsePosition.getIndex();
        a(str, parsePosition, objArr, null);
        if (parsePosition.getIndex() == index) {
            return null;
        }
        return objArr;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    private final NumberFormat a() {
        if (this.e == null) {
            this.e = NumberFormat.getInstance(this.a);
        }
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:199:0x03f3 A:{LOOP_END, LOOP:3: B:103:0x0230->B:199:0x03f3} */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x03e0 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x03e0 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03f3 A:{LOOP_END, LOOP:3: B:103:0x0230->B:199:0x03f3} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03f3 A:{LOOP_END, LOOP:3: B:103:0x0230->B:199:0x03f3} */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x03e0 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x03e0 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03f3 A:{LOOP_END, LOOP:3: B:103:0x0230->B:199:0x03f3} */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0528  */
    /* JADX WARNING: Missing block: B:106:0x0240, code skipped:
            r27 = r11;
            r28 = r15;
     */
    private final void a(int r30, defpackage.br r31, java.lang.Object[] r32, java.util.Map r33, java.lang.Object[] r34, defpackage.bq r35, java.text.FieldPosition r36) {
        /*
        r29 = this;
        r8 = r29;
        r0 = r30;
        r9 = r31;
        r10 = r32;
        r11 = r33;
        r12 = r34;
        r13 = r35;
        r1 = r8.b;
        r14 = r1.b;
        r1 = r1.a(r0);
        r1 = r1.a();
        r15 = 1;
        r0 = r0 + r15;
        r7 = r36;
    L_0x001e:
        r2 = r8.b;
        r2 = r2.a(r0);
        r3 = r2.e;
        r4 = r2.a;
        r5 = r13.a;	 Catch:{ IOException -> 0x058a }
        r5.append(r14, r1, r4);	 Catch:{ IOException -> 0x058a }
        r5 = r13.b;	 Catch:{ IOException -> 0x058a }
        r4 = r4 - r1;
        r5 = r5 + r4;
        r13.b = r5;	 Catch:{ IOException -> 0x058a }
        r1 = 2;
        if (r3 == r1) goto L_0x0589;
    L_0x0036:
        r4 = r2.a();
        r5 = 5;
        if (r3 == r5) goto L_0x0559;
    L_0x003d:
        r6 = 6;
        if (r3 != r6) goto L_0x0552;
    L_0x0040:
        r3 = r8.b;
        r4 = r3.b(r0);
        r2 = r2.b();
        r0 = r0 + 1;
        r3 = r8.b;
        r3 = r3.a(r0);
        r6 = r8.b;
        r6 = r6.a(r3);
        r22 = 0;
        r23 = 0;
        if (r10 != 0) goto L_0x0095;
    L_0x005e:
        if (r12 == 0) goto L_0x0080;
    L_0x0060:
        r3 = 0;
    L_0x0061:
        r5 = r12.length;
        if (r3 >= r5) goto L_0x007a;
    L_0x0064:
        r5 = r12[r3];
        r5 = r5.toString();
        r5 = r6.equals(r5);
        if (r5 == 0) goto L_0x0077;
    L_0x0070:
        r3 = r3 + 1;
        r3 = r12[r3];
        r5 = r3;
        r3 = 0;
        goto L_0x007d;
    L_0x0077:
        r3 = r3 + 2;
        goto L_0x0061;
    L_0x007a:
        r5 = r22;
        r3 = 1;
    L_0x007d:
        r1 = r5;
        r5 = r6;
        goto L_0x00ab;
    L_0x0080:
        if (r11 == 0) goto L_0x0090;
    L_0x0082:
        r3 = r11.containsKey(r6);
        if (r3 == 0) goto L_0x0090;
    L_0x0088:
        r3 = r11.get(r6);
        r1 = r3;
        r5 = r6;
    L_0x008e:
        r3 = 0;
        goto L_0x00ab;
    L_0x0090:
        r5 = r6;
    L_0x0091:
        r1 = r22;
        r3 = 1;
        goto L_0x00ab;
    L_0x0095:
        r3 = r3.c;
        r5 = r13.c;
        if (r5 == 0) goto L_0x00a0;
    L_0x009b:
        r5 = java.lang.Integer.valueOf(r3);
        goto L_0x00a2;
    L_0x00a0:
        r5 = r22;
    L_0x00a2:
        if (r3 >= 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x0091;
    L_0x00a5:
        r1 = r10.length;
        if (r3 >= r1) goto L_0x0091;
    L_0x00a8:
        r1 = r10[r3];
        goto L_0x008e;
    L_0x00ab:
        r0 = r0 + 1;
        r15 = r13.b;
        if (r3 != 0) goto L_0x04e2;
    L_0x00b1:
        if (r1 == 0) goto L_0x04d2;
    L_0x00b3:
        r24 = 0;
        if (r9 != 0) goto L_0x00ba;
    L_0x00b7:
        r16 = r4;
        goto L_0x00d8;
    L_0x00ba:
        r3 = r9.e;
        r16 = r4;
        r4 = r0 + -2;
        if (r3 != r4) goto L_0x00d8;
    L_0x00c2:
        r2 = r9.d;
        r0 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1));
        if (r0 != 0) goto L_0x00d2;
    L_0x00c8:
        r0 = r9.f;
        r1 = r9.c;
        r2 = r9.g;
        r13.a(r0, r1, r2);
        goto L_0x00ee;
    L_0x00d2:
        r0 = r9.f;
        r13.a(r0, r1);
        goto L_0x00ee;
    L_0x00d8:
        r3 = r8.c;
        if (r3 == 0) goto L_0x00fb;
    L_0x00dc:
        r4 = r0 + -2;
        r4 = java.lang.Integer.valueOf(r4);
        r3 = r3.get(r4);
        r3 = (java.text.Format) r3;
        if (r3 != 0) goto L_0x00eb;
    L_0x00ea:
        goto L_0x00fb;
    L_0x00eb:
        r13.a(r3, r1);
    L_0x00ee:
        r27 = r5;
        r20 = r7;
        r2 = r13;
        r19 = r14;
        r28 = r15;
        r9 = r16;
        goto L_0x050f;
    L_0x00fb:
        r4 = 1;
        if (r2 == r4) goto L_0x0499;
    L_0x00fe:
        r4 = r8.c;
        if (r4 == 0) goto L_0x010e;
    L_0x0102:
        r17 = r0 + -2;
        r3 = java.lang.Integer.valueOf(r17);
        r3 = r4.containsKey(r3);
        if (r3 != 0) goto L_0x0499;
    L_0x010e:
        r3 = "' is not a Number";
        r4 = "'";
        r17 = r5;
        r5 = 3;
        if (r2 != r5) goto L_0x01b3;
    L_0x0117:
        r2 = r1 instanceof java.lang.Number;
        if (r2 == 0) goto L_0x0191;
    L_0x011b:
        r1 = (java.lang.Number) r1;
        r1 = r1.doubleValue();
        r3 = r8.b;
        r4 = r3.a();
        r0 = r0 + 2;
    L_0x0129:
        r5 = r3.b(r0);
        r6 = 1;
        r5 = r5 + r6;
        if (r5 >= r4) goto L_0x016d;
    L_0x0131:
        r6 = r5 + 1;
        r5 = r3.a(r5);
        r30 = r4;
        r4 = r5.e;
        r18 = r7;
        r7 = 7;
        if (r4 != r7) goto L_0x0141;
    L_0x0140:
        goto L_0x016f;
    L_0x0141:
        r4 = r3.b(r5);
        r7 = r6 + 1;
        r36 = r7;
        r7 = r3.c;
        r6 = r7.get(r6);
        r6 = (defpackage.cl) r6;
        r6 = r6.a;
        r7 = r3.b;
        r6 = r7.charAt(r6);
        r7 = 60;
        if (r6 == r7) goto L_0x0162;
    L_0x015d:
        r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x016f;
    L_0x0161:
        goto L_0x0166;
    L_0x0162:
        r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x016f;
    L_0x0166:
        r4 = r30;
        r0 = r36;
        r7 = r18;
        goto L_0x0129;
    L_0x016d:
        r18 = r7;
    L_0x016f:
        r3 = 0;
        r1 = r29;
        r2 = r0;
        r0 = r16;
        r4 = r32;
        r7 = r17;
        r5 = r33;
        r6 = r34;
        r11 = r7;
        r10 = r18;
        r7 = r35;
        r1.a(r2, r3, r4, r5, r6, r7);
        r9 = r0;
        r20 = r10;
        r27 = r11;
        r2 = r13;
        r19 = r14;
        r28 = r15;
        goto L_0x050f;
    L_0x0191:
        r0 = new java.lang.IllegalArgumentException;
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        r5 = new java.lang.StringBuilder;
        r2 = r2 + 18;
        r5.<init>(r2);
        r5.append(r4);
        r5.append(r1);
        r5.append(r3);
        r1 = r5.toString();
        r0.<init>(r1);
        throw r0;
    L_0x01b3:
        r10 = r7;
        r7 = r16;
        r11 = r17;
        r5 = defpackage.cm.b(r2);
        r26 = r7;
        r7 = "other";
        if (r5 == 0) goto L_0x0423;
    L_0x01c2:
        r5 = r1 instanceof java.lang.Number;
        if (r5 == 0) goto L_0x0401;
    L_0x01c6:
        r3 = 4;
        if (r2 != r3) goto L_0x01d8;
    L_0x01c9:
        r2 = r8.f;
        if (r2 != 0) goto L_0x01d5;
    L_0x01cd:
        r2 = new bu;
        r3 = 1;
        r2.<init>(r8, r3);
        r8.f = r2;
    L_0x01d5:
        r2 = r8.f;
        goto L_0x01e6;
    L_0x01d8:
        r2 = r8.g;
        if (r2 != 0) goto L_0x01e4;
    L_0x01dc:
        r2 = new bu;
        r3 = 2;
        r2.<init>(r8, r3);
        r8.g = r2;
    L_0x01e4:
        r2 = r8.g;
    L_0x01e6:
        r1 = (java.lang.Number) r1;
        r3 = r8.b;
        r4 = r3.c;
        r4 = r4.get(r0);
        r4 = (defpackage.cl) r4;
        r5 = r4.e;
        r5 = defpackage.co.a(r5);
        if (r5 == 0) goto L_0x0201;
    L_0x01fa:
        r3 = r3.b(r4);
        r20 = r3;
        goto L_0x0203;
    L_0x0201:
        r20 = r24;
    L_0x0203:
        r5 = new br;
        r16 = r5;
        r17 = r0;
        r18 = r6;
        r19 = r1;
        r16.<init>(r17, r18, r19, r20);
        r6 = r8.b;
        r16 = r1.doubleValue();
        r1 = r6.a();
        r3 = r6.a(r0);
        r4 = r3.e;
        r4 = defpackage.co.a(r4);
        if (r4 == 0) goto L_0x022c;
    L_0x0226:
        r24 = r6.b(r3);
        r0 = r0 + 1;
    L_0x022c:
        r12 = r22;
        r3 = 0;
        r4 = 0;
    L_0x0230:
        r19 = r14;
        r14 = r0 + 1;
        r0 = r6.a(r0);
        r9 = r0.e;
        r20 = r10;
        r10 = 7;
        if (r9 != r10) goto L_0x0246;
    L_0x023f:
        r2 = r3;
    L_0x0240:
        r27 = r11;
        r28 = r15;
        goto L_0x03e1;
    L_0x0246:
        r9 = r6.c(r14);
        r9 = defpackage.co.a(r9);
        if (r9 == 0) goto L_0x0268;
    L_0x0250:
        r0 = r14 + 1;
        r9 = r6.a(r14);
        r9 = r6.b(r9);
        r14 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1));
        if (r14 == 0) goto L_0x0266;
    L_0x025e:
        r14 = r0;
        r27 = r11;
    L_0x0261:
        r28 = r15;
    L_0x0263:
        r15 = 6;
        goto L_0x03d8;
    L_0x0266:
        r2 = r0;
        goto L_0x0240;
    L_0x0268:
        if (r4 != 0) goto L_0x03cb;
    L_0x026a:
        r9 = r6.a(r0, r7);
        if (r9 == 0) goto L_0x0286;
    L_0x0270:
        if (r3 != 0) goto L_0x03cb;
    L_0x0272:
        if (r12 == 0) goto L_0x0282;
    L_0x0274:
        r0 = r12.equals(r7);
        if (r0 != 0) goto L_0x027b;
    L_0x027a:
        goto L_0x0282;
    L_0x027b:
        r27 = r11;
        r3 = r14;
        r28 = r15;
        r4 = 1;
        goto L_0x0263;
    L_0x0282:
        r27 = r11;
        r3 = r14;
        goto L_0x0261;
    L_0x0286:
        if (r12 != 0) goto L_0x03b4;
    L_0x0288:
        r9 = r16 - r24;
        r12 = r2.b;
        if (r12 != 0) goto L_0x029d;
    L_0x028e:
        r12 = r2.a;
        r12 = r12.a;
        r18 = r4;
        r4 = r2.c;
        r4 = defpackage.bt.a(r12, r4);
        r2.b = r4;
        goto L_0x029f;
    L_0x029d:
        r18 = r4;
    L_0x029f:
        r4 = r2.a;
        r12 = r5.a;
        r21 = r14;
        r14 = r4.b;
        r14 = r14.a();
        r27 = r11;
        r11 = r4.b;
        r11 = r11.a(r12);
        r11 = r11.e;
        r11 = defpackage.co.a(r11);
        if (r11 == 0) goto L_0x02bd;
    L_0x02bb:
        r12 = r12 + 1;
    L_0x02bd:
        r11 = r12 + 1;
        r28 = r15;
        r15 = r4.b;
        r12 = r15.a(r12);
        r15 = r12.e;
        r13 = 7;
        if (r15 == r13) goto L_0x02f5;
    L_0x02cc:
        r13 = r4.b;
        r12 = r13.a(r12, r7);
        if (r12 != 0) goto L_0x02f3;
    L_0x02d4:
        r12 = r4.b;
        r12 = r12.c(r11);
        r12 = defpackage.co.a(r12);
        if (r12 == 0) goto L_0x02e2;
    L_0x02e0:
        r11 = r11 + 1;
    L_0x02e2:
        r12 = r4.b;
        r11 = r12.b(r11);
        r12 = 1;
        r11 = r11 + r12;
        if (r11 < r14) goto L_0x02ed;
    L_0x02ec:
        goto L_0x02f6;
    L_0x02ed:
        r13 = r35;
        r12 = r11;
        r15 = r28;
        goto L_0x02bd;
    L_0x02f3:
        r12 = 1;
        goto L_0x02f7;
    L_0x02f5:
        r12 = 1;
    L_0x02f6:
        r11 = 0;
    L_0x02f7:
        r4 = r2.a;
        r13 = r5.b;
    L_0x02fb:
        r11 = r11 + r12;
        r12 = r4.b;
        r12 = r12.a(r11);
        r14 = r12.e;
        r15 = 2;
        if (r14 == r15) goto L_0x033c;
    L_0x0307:
        r15 = 5;
        if (r14 == r15) goto L_0x0338;
    L_0x030a:
        r15 = 6;
        if (r14 != r15) goto L_0x0336;
    L_0x030d:
        r12 = r12.b();
        r14 = r13.length();
        if (r14 != 0) goto L_0x0318;
    L_0x0317:
        goto L_0x0330;
    L_0x0318:
        r14 = 1;
        if (r12 != r14) goto L_0x031c;
    L_0x031b:
        goto L_0x031f;
    L_0x031c:
        r14 = 2;
        if (r12 != r14) goto L_0x0330;
    L_0x031f:
        r12 = r4.b;
        r14 = r11 + 1;
        r12 = r12.a(r14);
        r14 = r4.b;
        r12 = r14.a(r12, r13);
        if (r12 == 0) goto L_0x0330;
    L_0x032f:
        goto L_0x033e;
    L_0x0330:
        r12 = r4.b;
        r11 = r12.b(r11);
    L_0x0336:
        r12 = 1;
        goto L_0x02fb;
    L_0x0338:
        r15 = 6;
        r4 = -1;
        r11 = -1;
        goto L_0x033e;
    L_0x033c:
        r15 = 6;
        r11 = 0;
    L_0x033e:
        r5.e = r11;
        if (r11 <= 0) goto L_0x0354;
    L_0x0342:
        r4 = r2.a;
        r4 = r4.c;
        if (r4 == 0) goto L_0x0354;
    L_0x0348:
        r11 = java.lang.Integer.valueOf(r11);
        r4 = r4.get(r11);
        r4 = (java.text.Format) r4;
        r5.f = r4;
    L_0x0354:
        r4 = r5.f;
        if (r4 != 0) goto L_0x0363;
    L_0x0358:
        r4 = r2.a;
        r4 = r4.a();
        r5.f = r4;
        r4 = 1;
        r5.h = r4;
    L_0x0363:
        r4 = r5.f;
        r11 = r5.c;
        r4 = r4.format(r11);
        r5.g = r4;
        r4 = r2.b;
        r4 = r4.a;
        r11 = new bz;
        r11.<init>(r9);
        r9 = r11.a;
        r9 = java.lang.Double.isInfinite(r9);
        if (r9 != 0) goto L_0x03a7;
    L_0x037e:
        r9 = r11.a;
        r9 = java.lang.Double.isNaN(r9);
        if (r9 != 0) goto L_0x03a7;
    L_0x0386:
        r4 = r4.b;
        r4 = r4.iterator();
    L_0x038c:
        r9 = r4.hasNext();
        if (r9 == 0) goto L_0x03a1;
    L_0x0392:
        r9 = r4.next();
        r9 = (defpackage.cf) r9;
        r10 = r9.b;
        r10 = r10.a(r11);
        if (r10 == 0) goto L_0x038c;
    L_0x03a0:
        goto L_0x03a3;
    L_0x03a1:
        r9 = r22;
    L_0x03a3:
        r4 = r9.a;
        r12 = r4;
        goto L_0x03a8;
    L_0x03a7:
        r12 = r7;
    L_0x03a8:
        if (r3 == 0) goto L_0x03bd;
    L_0x03aa:
        r4 = r12.equals(r7);
        if (r4 != 0) goto L_0x03b1;
    L_0x03b0:
        goto L_0x03bd;
    L_0x03b1:
        r18 = 1;
        goto L_0x03bd;
    L_0x03b4:
        r18 = r4;
        r27 = r11;
        r21 = r14;
        r28 = r15;
        r15 = 6;
    L_0x03bd:
        if (r18 != 0) goto L_0x03d4;
    L_0x03bf:
        r0 = r6.a(r0, r12);
        if (r0 != 0) goto L_0x03c6;
    L_0x03c5:
        goto L_0x03d4;
    L_0x03c6:
        r3 = r21;
        r14 = r3;
        r4 = 1;
        goto L_0x03d8;
    L_0x03cb:
        r18 = r4;
        r27 = r11;
        r21 = r14;
        r28 = r15;
        r15 = 6;
    L_0x03d4:
        r4 = r18;
        r14 = r21;
    L_0x03d8:
        r0 = r6.b(r14);
        r9 = 1;
        r0 = r0 + r9;
        if (r0 < r1) goto L_0x03f3;
    L_0x03e0:
        r2 = r3;
    L_0x03e1:
        r1 = r29;
        r3 = r5;
        r4 = r32;
        r5 = r33;
        r6 = r34;
        r9 = r26;
        r7 = r35;
        r1.a(r2, r3, r4, r5, r6, r7);
        goto L_0x0470;
    L_0x03f3:
        r9 = r31;
        r13 = r35;
        r14 = r19;
        r10 = r20;
        r11 = r27;
        r15 = r28;
        goto L_0x0230;
    L_0x0401:
        r0 = new java.lang.IllegalArgumentException;
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        r5 = new java.lang.StringBuilder;
        r2 = r2 + 18;
        r5.<init>(r2);
        r5.append(r4);
        r5.append(r1);
        r5.append(r3);
        r1 = r5.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0423:
        r20 = r10;
        r27 = r11;
        r19 = r14;
        r28 = r15;
        r9 = r26;
        r3 = 5;
        if (r2 != r3) goto L_0x0474;
    L_0x0430:
        r2 = r8.b;
        r1 = r1.toString();
        r3 = r2.a();
    L_0x043a:
        r4 = r0 + 1;
        r0 = r2.a(r0);
        r5 = r0.e;
        r6 = 7;
        if (r5 == r6) goto L_0x0460;
    L_0x0445:
        r5 = r2.a(r0, r1);
        if (r5 == 0) goto L_0x044d;
    L_0x044b:
        r2 = r4;
        goto L_0x0462;
    L_0x044d:
        if (r23 != 0) goto L_0x0458;
    L_0x044f:
        r0 = r2.a(r0, r7);
        if (r0 != 0) goto L_0x0456;
    L_0x0455:
        goto L_0x0458;
    L_0x0456:
        r23 = r4;
    L_0x0458:
        r0 = r2.b(r4);
        r4 = 1;
        r0 = r0 + r4;
        if (r0 < r3) goto L_0x043a;
    L_0x0460:
        r2 = r23;
    L_0x0462:
        r3 = 0;
        r1 = r29;
        r4 = r32;
        r5 = r33;
        r6 = r34;
        r7 = r35;
        r1.a(r2, r3, r4, r5, r6, r7);
    L_0x0470:
        r2 = r35;
        goto L_0x050f;
    L_0x0474:
        r0 = new java.lang.IllegalStateException;
        r1 = defpackage.cm.a(r2);
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 19;
        r3.<init>(r2);
        r2 = "unexpected argType ";
        r3.append(r2);
        r3.append(r1);
        r1 = r3.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0499:
        r27 = r5;
        r20 = r7;
        r19 = r14;
        r28 = r15;
        r9 = r16;
        r0 = r1 instanceof java.lang.Number;
        if (r0 == 0) goto L_0x04b1;
    L_0x04a7:
        r0 = r29.a();
        r2 = r35;
        r2.a(r0, r1);
        goto L_0x050f;
    L_0x04b1:
        r2 = r35;
        r0 = r1 instanceof java.util.Date;
        if (r0 != 0) goto L_0x04bf;
    L_0x04b7:
        r0 = r1.toString();
        r2.a(r0);
        goto L_0x050f;
    L_0x04bf:
        r0 = r8.d;
        if (r0 != 0) goto L_0x04cc;
    L_0x04c3:
        r0 = r8.a;
        r3 = 3;
        r0 = java.text.DateFormat.getDateTimeInstance(r3, r3, r0);
        r8.d = r0;
    L_0x04cc:
        r0 = r8.d;
        r2.a(r0, r1);
        goto L_0x050f;
    L_0x04d2:
        r9 = r4;
        r27 = r5;
        r20 = r7;
        r2 = r13;
        r19 = r14;
        r28 = r15;
        r0 = "null";
        r2.a(r0);
        goto L_0x050f;
    L_0x04e2:
        r9 = r4;
        r27 = r5;
        r20 = r7;
        r2 = r13;
        r19 = r14;
        r28 = r15;
        r0 = java.lang.String.valueOf(r6);
        r0 = r0.length();
        r1 = new java.lang.StringBuilder;
        r3 = 2;
        r0 = r0 + r3;
        r1.<init>(r0);
        r0 = "{";
        r1.append(r0);
        r1.append(r6);
        r0 = "}";
        r1.append(r0);
        r0 = r1.toString();
        r2.a(r0);
    L_0x050f:
        r0 = r2.c;
        if (r0 == 0) goto L_0x0524;
    L_0x0513:
        r1 = r2.b;
        r3 = r28;
        if (r3 >= r1) goto L_0x0526;
    L_0x0519:
        r4 = new bp;
        r6 = r27;
        r4.<init>(r6, r3, r1);
        r0.add(r4);
        goto L_0x0526;
    L_0x0524:
        r3 = r28;
    L_0x0526:
        if (r20 == 0) goto L_0x0541;
    L_0x0528:
        r0 = defpackage.bs.a;
        r1 = r20.getFieldAttribute();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0541;
    L_0x0534:
        r1 = r20;
        r1.setBeginIndex(r3);
        r0 = r2.b;
        r1.setEndIndex(r0);
        r1 = r22;
        goto L_0x0543;
    L_0x0541:
        r1 = r20;
    L_0x0543:
        r0 = r8.b;
        r0 = r0.a(r9);
        r0 = r0.a();
        r3 = r31;
        r7 = r1;
        r1 = r0;
        goto L_0x0578;
    L_0x0552:
        r1 = r7;
        r2 = r13;
        r19 = r14;
        r3 = r31;
        goto L_0x0575;
    L_0x0559:
        r1 = r7;
        r3 = r9;
        r2 = r13;
        r19 = r14;
        r5 = r3.h;
        if (r5 == 0) goto L_0x056c;
    L_0x0562:
        r5 = r3.f;
        r6 = r3.c;
        r7 = r3.g;
        r2.a(r5, r6, r7);
        goto L_0x0575;
    L_0x056c:
        r5 = r29.a();
        r6 = r3.c;
        r2.a(r5, r6);
    L_0x0575:
        r9 = r0;
        r7 = r1;
        r1 = r4;
    L_0x0578:
        r0 = 1;
        r4 = r9 + 1;
        r10 = r32;
        r11 = r33;
        r12 = r34;
        r13 = r2;
        r9 = r3;
        r0 = r4;
        r14 = r19;
        r15 = 1;
        goto L_0x001e;
    L_0x0589:
        return;
    L_0x058a:
        r0 = move-exception;
        r1 = new cp;
        r1.<init>(r0);
        goto L_0x0592;
    L_0x0591:
        throw r1;
    L_0x0592:
        goto L_0x0591;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn.a(int, br, java.lang.Object[], java.util.Map, java.lang.Object[], bq, java.text.FieldPosition):void");
    }

    private final void a(int i, br brVar, Object[] objArr, Map map, Object[] objArr2, bq bqVar) {
        if (this.b.a != cj.DOUBLE_REQUIRED) {
            a(i, brVar, objArr, map, objArr2, bqVar, null);
            return;
        }
        throw new UnsupportedOperationException("JDK apostrophe mode not supported");
    }

    private final void a(Object obj, bq bqVar, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            a(null, (Map) obj, bqVar, fieldPosition);
        } else {
            a((Object[]) obj, null, bqVar, fieldPosition);
        }
    }

    private final void a(Object[] objArr, Map map, bq bqVar, FieldPosition fieldPosition) {
        if (objArr == null || !this.b.e) {
            a(0, null, objArr, map, null, bqVar, fieldPosition);
            return;
        }
        throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
    }

    private static final int a(String str, String[] strArr) {
        str = bl.a(str).toLowerCase(k);
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    static {
        r0 = new String[4];
        String str = "";
        r0[0] = str;
        r0[1] = "currency";
        r0[2] = "percent";
        r0[3] = "integer";
        i = r0;
        j = new String[]{str, "short", "medium", "long", "full"};
        k = new Locale(str);
    }
}
