package defpackage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ost */
public final class ost extends ori {
    private static final Pattern a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    private static final Pattern b = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder c = new StringBuilder();
    private final ArrayList d = new ArrayList();

    public ost() {
        super("SubripDecoder");
    }

    private static float b(int i) {
        return i != 0 ? i != 1 ? 0.92f : 0.5f : 0.08f;
    }

    private static long a(Matcher matcher, int i) {
        return ((((Long.parseLong(matcher.group(i + 1)) * 3600000) + (Long.parseLong(matcher.group(i + 2)) * 60000)) + (Long.parseLong(matcher.group(i + 3)) * 1000)) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0017 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01aa  */
    public final /* synthetic */ defpackage.ork a(byte[] r17, int r18, boolean r19) {
        /*
        r16 = this;
        r0 = r16;
        r1 = "SubripDecoder";
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = new oys;
        r3.<init>();
        r4 = new oza;
        r5 = r17;
        r6 = r18;
        r4.<init>(r5, r6);
    L_0x0017:
        r5 = r4.s();
        if (r5 == 0) goto L_0x01de;
    L_0x001d:
        r6 = r5.length();
        if (r6 == 0) goto L_0x0017;
    L_0x0023:
        java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x01c7 }
        r5 = r4.s();
        if (r5 != 0) goto L_0x0033;
    L_0x002c:
        r4 = "Unexpected end";
        defpackage.oyp.a(r1, r4);
        goto L_0x01de;
    L_0x0033:
        r6 = a;
        r6 = r6.matcher(r5);
        r7 = r6.matches();
        if (r7 == 0) goto L_0x01b0;
    L_0x003f:
        r5 = 1;
        r7 = defpackage.ost.a(r6, r5);
        r3.a(r7);
        r7 = 6;
        r8 = r6.group(r7);
        r8 = android.text.TextUtils.isEmpty(r8);
        r9 = 0;
        if (r8 != 0) goto L_0x005c;
    L_0x0053:
        r6 = defpackage.ost.a(r6, r7);
        r3.a(r6);
        r6 = 1;
        goto L_0x005d;
    L_0x005c:
        r6 = 0;
    L_0x005d:
        r7 = r0.c;
        r7.setLength(r9);
        r7 = r0.d;
        r7.clear();
    L_0x0067:
        r7 = r4.s();
        r8 = android.text.TextUtils.isEmpty(r7);
        if (r8 != 0) goto L_0x00bd;
    L_0x0071:
        r8 = r0.c;
        r8 = r8.length();
        if (r8 <= 0) goto L_0x0080;
    L_0x0079:
        r8 = r0.c;
        r10 = "<br>";
        r8.append(r10);
    L_0x0080:
        r8 = r0.c;
        r10 = r0.d;
        r7 = r7.trim();
        r11 = new java.lang.StringBuilder;
        r11.<init>(r7);
        r12 = b;
        r7 = r12.matcher(r7);
        r12 = 0;
    L_0x0094:
        r13 = r7.find();
        if (r13 == 0) goto L_0x00b4;
    L_0x009a:
        r13 = r7.group();
        r10.add(r13);
        r14 = r7.start();
        r14 = r14 - r12;
        r13 = r13.length();
        r15 = r14 + r13;
        r9 = "";
        r11.replace(r14, r15, r9);
        r12 = r12 + r13;
        r9 = 0;
        goto L_0x0094;
    L_0x00b4:
        r7 = r11.toString();
        r8.append(r7);
        r9 = 0;
        goto L_0x0067;
    L_0x00bd:
        r7 = r0.c;
        r7 = r7.toString();
        r7 = android.text.Html.fromHtml(r7);
        r8 = 0;
    L_0x00c8:
        r9 = r0.d;
        r9 = r9.size();
        if (r8 >= r9) goto L_0x00e3;
    L_0x00d0:
        r9 = r0.d;
        r9 = r9.get(r8);
        r9 = (java.lang.String) r9;
        r11 = "\\{\\\\an[1-9]\\}";
        r11 = r9.matches(r11);
        if (r11 != 0) goto L_0x00e4;
    L_0x00e0:
        r8 = r8 + 1;
        goto L_0x00c8;
    L_0x00e3:
        r9 = 0;
    L_0x00e4:
        if (r9 != 0) goto L_0x00ed;
    L_0x00e6:
        r5 = new orf;
        r5.<init>(r7);
        goto L_0x01a5;
    L_0x00ed:
        r8 = r9.hashCode();
        r11 = "{\\an9}";
        r12 = "{\\an7}";
        r13 = "{\\an3}";
        r14 = "{\\an1}";
        r15 = 3;
        r10 = 2;
        switch(r8) {
            case -685620710: goto L_0x012b;
            case -685620648: goto L_0x0123;
            case -685620617: goto L_0x0119;
            case -685620555: goto L_0x010f;
            case -685620524: goto L_0x0107;
            case -685620462: goto L_0x00ff;
            default: goto L_0x00fe;
        };
    L_0x00fe:
        goto L_0x0133;
    L_0x00ff:
        r8 = r9.equals(r11);
        if (r8 == 0) goto L_0x0133;
    L_0x0105:
        r8 = 5;
        goto L_0x0134;
    L_0x0107:
        r8 = r9.equals(r12);
        if (r8 == 0) goto L_0x0133;
    L_0x010d:
        r8 = 2;
        goto L_0x0134;
    L_0x010f:
        r8 = "{\\an6}";
        r8 = r9.equals(r8);
        if (r8 == 0) goto L_0x0133;
    L_0x0117:
        r8 = 4;
        goto L_0x0134;
    L_0x0119:
        r8 = "{\\an4}";
        r8 = r9.equals(r8);
        if (r8 == 0) goto L_0x0133;
    L_0x0121:
        r8 = 1;
        goto L_0x0134;
    L_0x0123:
        r8 = r9.equals(r13);
        if (r8 == 0) goto L_0x0133;
    L_0x0129:
        r8 = 3;
        goto L_0x0134;
    L_0x012b:
        r8 = r9.equals(r14);
        if (r8 == 0) goto L_0x0133;
    L_0x0131:
        r8 = 0;
        goto L_0x0134;
    L_0x0133:
        r8 = -1;
    L_0x0134:
        if (r8 == 0) goto L_0x0146;
    L_0x0136:
        if (r8 == r5) goto L_0x0146;
    L_0x0138:
        if (r8 == r10) goto L_0x0146;
    L_0x013a:
        if (r8 == r15) goto L_0x0144;
    L_0x013c:
        r15 = 4;
        if (r8 == r15) goto L_0x0144;
    L_0x013f:
        r15 = 5;
        if (r8 == r15) goto L_0x0144;
    L_0x0142:
        r8 = 1;
        goto L_0x0147;
    L_0x0144:
        r8 = 2;
        goto L_0x0147;
    L_0x0146:
        r8 = 0;
    L_0x0147:
        r15 = r9.hashCode();
        switch(r15) {
            case -685620710: goto L_0x017b;
            case -685620679: goto L_0x0171;
            case -685620648: goto L_0x0169;
            case -685620524: goto L_0x0161;
            case -685620493: goto L_0x0157;
            case -685620462: goto L_0x014f;
            default: goto L_0x014e;
        };
    L_0x014e:
        goto L_0x0183;
    L_0x014f:
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x0183;
    L_0x0155:
        r9 = 5;
        goto L_0x0184;
    L_0x0157:
        r11 = "{\\an8}";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x0183;
    L_0x015f:
        r9 = 4;
        goto L_0x0184;
    L_0x0161:
        r9 = r9.equals(r12);
        if (r9 == 0) goto L_0x0183;
    L_0x0167:
        r9 = 3;
        goto L_0x0184;
    L_0x0169:
        r9 = r9.equals(r13);
        if (r9 == 0) goto L_0x0183;
    L_0x016f:
        r9 = 2;
        goto L_0x0184;
    L_0x0171:
        r11 = "{\\an2}";
        r9 = r9.equals(r11);
        if (r9 == 0) goto L_0x0183;
    L_0x0179:
        r9 = 1;
        goto L_0x0184;
    L_0x017b:
        r9 = r9.equals(r14);
        if (r9 == 0) goto L_0x0183;
    L_0x0181:
        r9 = 0;
        goto L_0x0184;
    L_0x0183:
        r9 = -1;
    L_0x0184:
        if (r9 == 0) goto L_0x0196;
    L_0x0186:
        if (r9 == r5) goto L_0x0196;
    L_0x0188:
        if (r9 == r10) goto L_0x0196;
    L_0x018a:
        r11 = 3;
        if (r9 == r11) goto L_0x0194;
    L_0x018d:
        r10 = 4;
        if (r9 == r10) goto L_0x0194;
    L_0x0190:
        r10 = 5;
        if (r9 == r10) goto L_0x0194;
    L_0x0193:
        goto L_0x0197;
    L_0x0194:
        r5 = 0;
        goto L_0x0197;
    L_0x0196:
        r5 = 2;
    L_0x0197:
        r9 = new orf;
        r5 = defpackage.ost.b(r5);
        r10 = defpackage.ost.b(r8);
        r9.<init>(r7, r5, r10, r8);
        r5 = r9;
    L_0x01a5:
        r2.add(r5);
        if (r6 == 0) goto L_0x0017;
    L_0x01aa:
        r5 = 0;
        r2.add(r5);
        goto L_0x0017;
    L_0x01b0:
        r6 = "Skipping invalid timing: ";
        r7 = r5.length();
        if (r7 != 0) goto L_0x01be;
    L_0x01b8:
        r5 = new java.lang.String;
        r5.<init>(r6);
        goto L_0x01c2;
    L_0x01be:
        r5 = r6.concat(r5);
    L_0x01c2:
        defpackage.oyp.a(r1, r5);
        goto L_0x0017;
    L_0x01c7:
        r6 = "Skipping invalid index: ";
        r7 = r5.length();
        if (r7 != 0) goto L_0x01d5;
    L_0x01cf:
        r5 = new java.lang.String;
        r5.<init>(r6);
        goto L_0x01d9;
    L_0x01d5:
        r5 = r6.concat(r5);
    L_0x01d9:
        defpackage.oyp.a(r1, r5);
        goto L_0x0017;
    L_0x01de:
        r1 = r2.size();
        r1 = new defpackage.orf[r1];
        r2.toArray(r1);
        r2 = r3.a();
        r3 = new osw;
        r3.<init>(r1, r2);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ost.a(byte[], int, boolean):ork");
    }
}
