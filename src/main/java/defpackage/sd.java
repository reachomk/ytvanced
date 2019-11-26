package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: sd */
public final class sd {
    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return sd.a(xmlPullParser, str) ? typedArray.getFloat(i, f) : f;
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return sd.a(xmlPullParser, str) ? typedArray.getInt(i, i2) : i2;
    }

    private static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (sd.a(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x024e A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x024e A:{RETURN} */
    /* JADX WARNING: Missing block: B:13:0x0047, code skipped:
            r7 = r0.getName();
     */
    /* JADX WARNING: Missing block: B:14:0x004b, code skipped:
            r10 = r7.hashCode();
            r12 = "gradient";
     */
    /* JADX WARNING: Missing block: B:15:0x0054, code skipped:
            if (r10 == 89650992) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:17:0x0059, code skipped:
            if (r10 == 1191572447) goto L_0x005c;
     */
    /* JADX WARNING: Missing block: B:19:0x0062, code skipped:
            if (r7.equals("selector") == false) goto L_0x006e;
     */
    /* JADX WARNING: Missing block: B:20:0x0064, code skipped:
            r10 = null;
     */
    /* JADX WARNING: Missing block: B:22:0x006a, code skipped:
            if (r7.equals(r12) == false) goto L_0x006e;
     */
    /* JADX WARNING: Missing block: B:23:0x006c, code skipped:
            r10 = 1;
     */
    /* JADX WARNING: Missing block: B:24:0x006e, code skipped:
            r10 = -1;
     */
    /* JADX WARNING: Missing block: B:25:0x006f, code skipped:
            if (r10 == null) goto L_0x0221;
     */
    /* JADX WARNING: Missing block: B:26:0x0071, code skipped:
            if (r10 != 1) goto L_0x0203;
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            r7 = r0.getName();
     */
    /* JADX WARNING: Missing block: B:29:0x007b, code skipped:
            if (r7.equals(r12) == false) goto L_0x01e5;
     */
    /* JADX WARNING: Missing block: B:30:0x007d, code skipped:
            r7 = defpackage.sd.a(r4, r1, r6, defpackage.cr.q);
            r14 = defpackage.sd.a(r7, r0, "startX", 8, 0.0f);
            r15 = defpackage.sd.a(r7, r0, "startY", 9, 0.0f);
            r16 = defpackage.sd.a(r7, r0, "endX", 10, 0.0f);
            r17 = defpackage.sd.a(r7, r0, "endY", 11, 0.0f);
            r10 = defpackage.sd.a(r7, r0, "centerX", 3, 0.0f);
            r2 = defpackage.sd.a(r7, r0, "centerY", 4, 0.0f);
            r13 = defpackage.sd.a(r7, r0, "type", 2, r5);
            r8 = defpackage.sd.c(r7, r0, "startColor", r5);
            r18 = defpackage.sd.a(r0, r3);
            r3 = defpackage.sd.c(r7, r0, r3, 7);
            r11 = defpackage.sd.c(r7, r0, "endColor", 1);
            r9 = defpackage.sd.a(r7, r0, "tileMode", 6, r5);
            r20 = r2;
            r21 = defpackage.sd.a(r7, r0, "gradientRadius", 5, 0.0f);
            r7.recycle();
            r2 = r0.getDepth() + 1;
            r5 = new java.util.ArrayList(20);
            r12 = new java.util.ArrayList(20);
     */
    /* JADX WARNING: Missing block: B:31:0x00f3, code skipped:
            r7 = r0.next();
            r22 = r10;
     */
    /* JADX WARNING: Missing block: B:32:0x00fa, code skipped:
            if (r7 == 1) goto L_0x0169;
     */
    /* JADX WARNING: Missing block: B:33:0x00fc, code skipped:
            r10 = r0.getDepth();
            r23 = r15;
     */
    /* JADX WARNING: Missing block: B:34:0x0102, code skipped:
            if (r10 >= r2) goto L_0x0108;
     */
    /* JADX WARNING: Missing block: B:36:0x0105, code skipped:
            if (r7 != 3) goto L_0x0108;
     */
    /* JADX WARNING: Missing block: B:39:0x0109, code skipped:
            if (r7 != 2) goto L_0x0164;
     */
    /* JADX WARNING: Missing block: B:40:0x010b, code skipped:
            if (r10 > r2) goto L_0x0164;
     */
    /* JADX WARNING: Missing block: B:42:0x0117, code skipped:
            if (r0.getName().equals("item") == false) goto L_0x0164;
     */
    /* JADX WARNING: Missing block: B:43:0x0119, code skipped:
            r7 = defpackage.sd.a(r4, r1, r6, defpackage.cr.r);
            r15 = r7.hasValue(0);
            r24 = r7.hasValue(1);
     */
    /* JADX WARNING: Missing block: B:44:0x0129, code skipped:
            if (r15 == false) goto L_0x0149;
     */
    /* JADX WARNING: Missing block: B:45:0x012b, code skipped:
            if (r24 == false) goto L_0x0149;
     */
    /* JADX WARNING: Missing block: B:46:0x012d, code skipped:
            r24 = r7.getColor(0, 0);
            r25 = r7.getFloat(1, 0.0f);
            r7.recycle();
            r12.add(java.lang.Integer.valueOf(r24));
            r5.add(java.lang.Float.valueOf(r25));
     */
    /* JADX WARNING: Missing block: B:47:0x0149, code skipped:
            r2 = new java.lang.StringBuilder();
            r2.append(r0.getPositionDescription());
            r2.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARNING: Missing block: B:48:0x0163, code skipped:
            throw new org.xmlpull.v1.XmlPullParserException(r2.toString());
     */
    /* JADX WARNING: Missing block: B:49:0x0164, code skipped:
            r10 = r22;
            r15 = r23;
     */
    /* JADX WARNING: Missing block: B:50:0x0169, code skipped:
            r23 = r15;
     */
    /* JADX WARNING: Missing block: B:52:0x016f, code skipped:
            if (r12.size() <= 0) goto L_0x0177;
     */
    /* JADX WARNING: Missing block: B:53:0x0171, code skipped:
            r2 = new defpackage.rx(r12, r5);
     */
    /* JADX WARNING: Missing block: B:54:0x0177, code skipped:
            r2 = null;
     */
    /* JADX WARNING: Missing block: B:55:0x0178, code skipped:
            if (r2 == null) goto L_0x017b;
     */
    /* JADX WARNING: Missing block: B:57:0x017b, code skipped:
            if (r18 == false) goto L_0x0183;
     */
    /* JADX WARNING: Missing block: B:58:0x017d, code skipped:
            r2 = new defpackage.rx(r8, r3, r11);
     */
    /* JADX WARNING: Missing block: B:59:0x0183, code skipped:
            r2 = new defpackage.rx(r8, r11);
     */
    /* JADX WARNING: Missing block: B:61:0x0189, code skipped:
            if (r13 == 1) goto L_0x01b1;
     */
    /* JADX WARNING: Missing block: B:63:0x018c, code skipped:
            if (r13 == 2) goto L_0x01a3;
     */
    /* JADX WARNING: Missing block: B:64:0x018e, code skipped:
            r1 = r2.a;
            r13 = new android.graphics.LinearGradient(r14, r23, r16, r17, r1, r2.b, defpackage.ru.a(r9));
     */
    /* JADX WARNING: Missing block: B:65:0x01a3, code skipped:
            r3 = r22;
            r0 = new android.graphics.SweepGradient(r3, r20, r2.a, r2.b);
     */
    /* JADX WARNING: Missing block: B:66:0x01b1, code skipped:
            r4 = r20;
            r3 = r22;
     */
    /* JADX WARNING: Missing block: B:67:0x01b8, code skipped:
            if (r21 <= 0.0f) goto L_0x01dd;
     */
    /* JADX WARNING: Missing block: B:68:0x01ba, code skipped:
            r1 = r2.a;
            r18 = new android.graphics.RadialGradient(r3, r4, r21, r1, r2.b, defpackage.ru.a(r9));
     */
    /* JADX WARNING: Missing block: B:72:?, code skipped:
            r2 = new defpackage.ro(r0, null, 0);
     */
    /* JADX WARNING: Missing block: B:73:0x01da, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:74:0x01db, code skipped:
            r5 = null;
     */
    /* JADX WARNING: Missing block: B:77:0x01e4, code skipped:
            throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Missing block: B:78:0x01e5, code skipped:
            r2 = new java.lang.StringBuilder();
            r2.append(r0.getPositionDescription());
            r2.append(": invalid gradient color tag ");
            r2.append(r7);
     */
    /* JADX WARNING: Missing block: B:79:0x0202, code skipped:
            throw new org.xmlpull.v1.XmlPullParserException(r2.toString());
     */
    /* JADX WARNING: Missing block: B:80:0x0203, code skipped:
            r2 = new java.lang.StringBuilder();
            r2.append(r0.getPositionDescription());
            r2.append(": unsupported complex color tag ");
            r2.append(r7);
     */
    /* JADX WARNING: Missing block: B:81:0x0220, code skipped:
            throw new org.xmlpull.v1.XmlPullParserException(r2.toString());
     */
    /* JADX WARNING: Missing block: B:82:0x0221, code skipped:
            r0 = defpackage.rp.a(r4, r0, r6, r1);
     */
    /* JADX WARNING: Missing block: B:83:0x022b, code skipped:
            r5 = null;
     */
    /* JADX WARNING: Missing block: B:85:?, code skipped:
            r2 = new defpackage.ro(null, r0, r0.getDefaultColor());
     */
    /* JADX WARNING: Missing block: B:91:0x023f, code skipped:
            r0 = e;
     */
    public static defpackage.ro a(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
        r0 = r26;
        r1 = r28;
        r2 = r30;
        r3 = "centerColor";
        r4 = r27;
        r5 = r29;
        r4 = defpackage.sd.a(r4, r5);
        r5 = 0;
        if (r4 == 0) goto L_0x024f;
    L_0x0013:
        r4 = new android.util.TypedValue;
        r4.<init>();
        r0.getValue(r2, r4);
        r6 = r4.type;
        r7 = 28;
        if (r6 < r7) goto L_0x002f;
    L_0x0021:
        r6 = r4.type;
        r7 = 31;
        if (r6 <= r7) goto L_0x0028;
    L_0x0027:
        goto L_0x002f;
    L_0x0028:
        r0 = r4.data;
        r0 = defpackage.ro.a(r0);
        return r0;
    L_0x002f:
        r4 = r26.getResources();
        r0 = r0.getResourceId(r2, r5);
        r0 = r4.getXml(r0);	 Catch:{ Exception -> 0x0241 }
        r6 = android.util.Xml.asAttributeSet(r0);	 Catch:{ Exception -> 0x0241 }
    L_0x003f:
        r7 = r0.next();	 Catch:{ Exception -> 0x0241 }
        r8 = 2;
        r9 = 1;
        if (r7 != r8) goto L_0x0230;
    L_0x0047:
        r7 = r0.getName();	 Catch:{ Exception -> 0x0241 }
        r10 = r7.hashCode();
        r11 = 89650992; // 0x557f730 float:1.01546526E-35 double:4.42934753E-316;
        r12 = "gradient";
        if (r10 == r11) goto L_0x0066;
    L_0x0056:
        r11 = 1191572447; // 0x4705f3df float:34291.87 double:5.887150106E-315;
        if (r10 == r11) goto L_0x005c;
    L_0x005b:
        goto L_0x006e;
    L_0x005c:
        r10 = "selector";
        r10 = r7.equals(r10);
        if (r10 == 0) goto L_0x006e;
    L_0x0064:
        r10 = 0;
        goto L_0x006f;
    L_0x0066:
        r10 = r7.equals(r12);
        if (r10 == 0) goto L_0x006e;
    L_0x006c:
        r10 = 1;
        goto L_0x006f;
    L_0x006e:
        r10 = -1;
    L_0x006f:
        if (r10 == 0) goto L_0x0221;
    L_0x0071:
        if (r10 != r9) goto L_0x0203;
    L_0x0073:
        r7 = r0.getName();	 Catch:{ Exception -> 0x0241 }
        r10 = r7.equals(r12);	 Catch:{ Exception -> 0x0241 }
        if (r10 == 0) goto L_0x01e5;
    L_0x007d:
        r7 = defpackage.cr.q;	 Catch:{ Exception -> 0x0241 }
        r7 = defpackage.sd.a(r4, r1, r6, r7);	 Catch:{ Exception -> 0x0241 }
        r10 = "startX";
        r11 = 8;
        r12 = 0;
        r14 = defpackage.sd.a(r7, r0, r10, r11, r12);	 Catch:{ Exception -> 0x0241 }
        r10 = "startY";
        r11 = 9;
        r15 = defpackage.sd.a(r7, r0, r10, r11, r12);	 Catch:{ Exception -> 0x0241 }
        r10 = "endX";
        r11 = 10;
        r16 = defpackage.sd.a(r7, r0, r10, r11, r12);	 Catch:{ Exception -> 0x0241 }
        r10 = "endY";
        r11 = 11;
        r17 = defpackage.sd.a(r7, r0, r10, r11, r12);	 Catch:{ Exception -> 0x0241 }
        r10 = "centerX";
        r11 = 3;
        r10 = defpackage.sd.a(r7, r0, r10, r11, r12);	 Catch:{ Exception -> 0x0241 }
        r13 = "centerY";
        r2 = 4;
        r2 = defpackage.sd.a(r7, r0, r13, r2, r12);	 Catch:{ Exception -> 0x0241 }
        r13 = "type";
        r13 = defpackage.sd.a(r7, r0, r13, r8, r5);	 Catch:{ Exception -> 0x0241 }
        r8 = "startColor";
        r8 = defpackage.sd.c(r7, r0, r8, r5);	 Catch:{ Exception -> 0x0241 }
        r18 = defpackage.sd.a(r0, r3);	 Catch:{ Exception -> 0x0241 }
        r11 = 7;
        r3 = defpackage.sd.c(r7, r0, r3, r11);	 Catch:{ Exception -> 0x0241 }
        r11 = "endColor";
        r11 = defpackage.sd.c(r7, r0, r11, r9);	 Catch:{ Exception -> 0x0241 }
        r9 = "tileMode";
        r12 = 6;
        r9 = defpackage.sd.a(r7, r0, r9, r12, r5);	 Catch:{ Exception -> 0x0241 }
        r12 = "gradientRadius";
        r5 = 5;
        r20 = r2;
        r2 = 0;
        r21 = defpackage.sd.a(r7, r0, r12, r5, r2);	 Catch:{ Exception -> 0x0241 }
        r7.recycle();	 Catch:{ Exception -> 0x0241 }
        r2 = r0.getDepth();	 Catch:{ Exception -> 0x0241 }
        r5 = 1;
        r2 = r2 + r5;
        r5 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0241 }
        r7 = 20;
        r5.<init>(r7);	 Catch:{ Exception -> 0x0241 }
        r12 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0241 }
        r12.<init>(r7);	 Catch:{ Exception -> 0x0241 }
    L_0x00f3:
        r7 = r0.next();	 Catch:{ Exception -> 0x0241 }
        r22 = r10;
        r10 = 1;
        if (r7 == r10) goto L_0x0169;
    L_0x00fc:
        r10 = r0.getDepth();	 Catch:{ Exception -> 0x0241 }
        r23 = r15;
        if (r10 >= r2) goto L_0x0108;
    L_0x0104:
        r15 = 3;
        if (r7 != r15) goto L_0x0108;
    L_0x0107:
        goto L_0x016b;
    L_0x0108:
        r15 = 2;
        if (r7 != r15) goto L_0x0164;
    L_0x010b:
        if (r10 > r2) goto L_0x0164;
    L_0x010d:
        r7 = r0.getName();	 Catch:{ Exception -> 0x0241 }
        r10 = "item";
        r7 = r7.equals(r10);	 Catch:{ Exception -> 0x0241 }
        if (r7 == 0) goto L_0x0164;
    L_0x0119:
        r7 = defpackage.cr.r;	 Catch:{ Exception -> 0x0241 }
        r7 = defpackage.sd.a(r4, r1, r6, r7);	 Catch:{ Exception -> 0x0241 }
        r10 = 0;
        r15 = r7.hasValue(r10);	 Catch:{ Exception -> 0x0241 }
        r10 = 1;
        r24 = r7.hasValue(r10);	 Catch:{ Exception -> 0x0241 }
        if (r15 == 0) goto L_0x0149;
    L_0x012b:
        if (r24 == 0) goto L_0x0149;
    L_0x012d:
        r15 = 0;
        r24 = r7.getColor(r15, r15);	 Catch:{ Exception -> 0x0241 }
        r15 = 0;
        r25 = r7.getFloat(r10, r15);	 Catch:{ Exception -> 0x0241 }
        r7.recycle();	 Catch:{ Exception -> 0x0241 }
        r7 = java.lang.Integer.valueOf(r24);	 Catch:{ Exception -> 0x0241 }
        r12.add(r7);	 Catch:{ Exception -> 0x0241 }
        r7 = java.lang.Float.valueOf(r25);	 Catch:{ Exception -> 0x0241 }
        r5.add(r7);	 Catch:{ Exception -> 0x0241 }
        goto L_0x0164;
    L_0x0149:
        r1 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ Exception -> 0x0241 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0241 }
        r2.<init>();	 Catch:{ Exception -> 0x0241 }
        r0 = r0.getPositionDescription();	 Catch:{ Exception -> 0x0241 }
        r2.append(r0);	 Catch:{ Exception -> 0x0241 }
        r0 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!";
        r2.append(r0);	 Catch:{ Exception -> 0x0241 }
        r0 = r2.toString();	 Catch:{ Exception -> 0x0241 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0241 }
        throw r1;	 Catch:{ Exception -> 0x0241 }
    L_0x0164:
        r10 = r22;
        r15 = r23;
        goto L_0x00f3;
    L_0x0169:
        r23 = r15;
    L_0x016b:
        r0 = r12.size();	 Catch:{ Exception -> 0x0241 }
        if (r0 <= 0) goto L_0x0177;
    L_0x0171:
        r2 = new rx;	 Catch:{ Exception -> 0x0241 }
        r2.<init>(r12, r5);	 Catch:{ Exception -> 0x0241 }
        goto L_0x0178;
    L_0x0177:
        r2 = 0;
    L_0x0178:
        if (r2 == 0) goto L_0x017b;
    L_0x017a:
        goto L_0x0188;
    L_0x017b:
        if (r18 == 0) goto L_0x0183;
    L_0x017d:
        r2 = new rx;	 Catch:{ Exception -> 0x0241 }
        r2.<init>(r8, r3, r11);	 Catch:{ Exception -> 0x0241 }
        goto L_0x0188;
    L_0x0183:
        r2 = new rx;	 Catch:{ Exception -> 0x0241 }
        r2.<init>(r8, r11);	 Catch:{ Exception -> 0x0241 }
    L_0x0188:
        r0 = 1;
        if (r13 == r0) goto L_0x01b1;
    L_0x018b:
        r0 = 2;
        if (r13 == r0) goto L_0x01a3;
    L_0x018e:
        r0 = new android.graphics.LinearGradient;	 Catch:{ Exception -> 0x0241 }
        r1 = r2.a;	 Catch:{ Exception -> 0x0241 }
        r2 = r2.b;	 Catch:{ Exception -> 0x0241 }
        r20 = defpackage.ru.a(r9);	 Catch:{ Exception -> 0x0241 }
        r13 = r0;
        r15 = r23;
        r18 = r1;
        r19 = r2;
        r13.<init>(r14, r15, r16, r17, r18, r19, r20);	 Catch:{ Exception -> 0x0241 }
        goto L_0x01d1;
    L_0x01a3:
        r0 = new android.graphics.SweepGradient;	 Catch:{ Exception -> 0x0241 }
        r1 = r2.a;	 Catch:{ Exception -> 0x0241 }
        r2 = r2.b;	 Catch:{ Exception -> 0x0241 }
        r4 = r20;
        r3 = r22;
        r0.<init>(r3, r4, r1, r2);	 Catch:{ Exception -> 0x0241 }
        goto L_0x01d1;
    L_0x01b1:
        r4 = r20;
        r3 = r22;
        r0 = 0;
        r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x01dd;
    L_0x01ba:
        r0 = new android.graphics.RadialGradient;	 Catch:{ Exception -> 0x0241 }
        r1 = r2.a;	 Catch:{ Exception -> 0x0241 }
        r2 = r2.b;	 Catch:{ Exception -> 0x0241 }
        r24 = defpackage.ru.a(r9);	 Catch:{ Exception -> 0x0241 }
        r18 = r0;
        r19 = r3;
        r20 = r4;
        r22 = r1;
        r23 = r2;
        r18.<init>(r19, r20, r21, r22, r23, r24);	 Catch:{ Exception -> 0x0241 }
    L_0x01d1:
        r2 = new ro;	 Catch:{ Exception -> 0x0241 }
        r1 = 0;
        r3 = 0;
        r2.<init>(r0, r1, r3);	 Catch:{ Exception -> 0x01da }
        goto L_0x024b;
    L_0x01da:
        r0 = move-exception;
        r5 = r1;
        goto L_0x0243;
    L_0x01dd:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ Exception -> 0x0241 }
        r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type";
        r0.<init>(r1);	 Catch:{ Exception -> 0x0241 }
        throw r0;	 Catch:{ Exception -> 0x0241 }
    L_0x01e5:
        r1 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ Exception -> 0x0241 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0241 }
        r2.<init>();	 Catch:{ Exception -> 0x0241 }
        r0 = r0.getPositionDescription();	 Catch:{ Exception -> 0x0241 }
        r2.append(r0);	 Catch:{ Exception -> 0x0241 }
        r0 = ": invalid gradient color tag ";
        r2.append(r0);	 Catch:{ Exception -> 0x0241 }
        r2.append(r7);	 Catch:{ Exception -> 0x0241 }
        r0 = r2.toString();	 Catch:{ Exception -> 0x0241 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0241 }
        throw r1;	 Catch:{ Exception -> 0x0241 }
    L_0x0203:
        r1 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ Exception -> 0x0241 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0241 }
        r2.<init>();	 Catch:{ Exception -> 0x0241 }
        r0 = r0.getPositionDescription();	 Catch:{ Exception -> 0x0241 }
        r2.append(r0);	 Catch:{ Exception -> 0x0241 }
        r0 = ": unsupported complex color tag ";
        r2.append(r0);	 Catch:{ Exception -> 0x0241 }
        r2.append(r7);	 Catch:{ Exception -> 0x0241 }
        r0 = r2.toString();	 Catch:{ Exception -> 0x0241 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0241 }
        throw r1;	 Catch:{ Exception -> 0x0241 }
    L_0x0221:
        r0 = defpackage.rp.a(r4, r0, r6, r1);	 Catch:{ Exception -> 0x0241 }
        r2 = new ro;	 Catch:{ Exception -> 0x0241 }
        r1 = r0.getDefaultColor();	 Catch:{ Exception -> 0x0241 }
        r5 = 0;
        r2.<init>(r5, r0, r1);	 Catch:{ Exception -> 0x023f }
        goto L_0x024b;
    L_0x0230:
        r2 = 1;
        r5 = 0;
        if (r7 == r2) goto L_0x0237;
    L_0x0234:
        r5 = 0;
        goto L_0x003f;
    L_0x0237:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ Exception -> 0x023f }
        r1 = "No start tag found";
        r0.<init>(r1);	 Catch:{ Exception -> 0x023f }
        throw r0;	 Catch:{ Exception -> 0x023f }
    L_0x023f:
        r0 = move-exception;
        goto L_0x0243;
    L_0x0241:
        r0 = move-exception;
        r5 = 0;
    L_0x0243:
        r1 = "ComplexColorCompat";
        r2 = "Failed to inflate ComplexColor.";
        android.util.Log.e(r1, r2, r0);
        r2 = r5;
    L_0x024b:
        if (r2 != 0) goto L_0x024e;
    L_0x024d:
        goto L_0x024f;
    L_0x024e:
        return r2;
    L_0x024f:
        r1 = 0;
        r0 = defpackage.ro.a(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):ro");
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (sd.a(xmlPullParser, str)) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    public static String b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (sd.a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static TypedValue a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (sd.a(xmlPullParser, str)) {
            return typedArray.peekValue(0);
        }
        return null;
    }

    public static TypedArray a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme != null) {
            return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        return resources.obtainAttributes(attributeSet, iArr);
    }

    public static boolean a(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static int a(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static String b(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static CharSequence c(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static CharSequence[] d(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId == 0 ? i2 : i;
    }
}
