package defpackage;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: osv */
public final class osv extends ori {
    private static final Pattern a = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern b = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern c = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern d = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern e = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern f = Pattern.compile("^(\\d+) (\\d+)$");
    private static final osx g = new osx(30.0f, 1, 1);
    private static final osy h = new osy(15);
    private final XmlPullParserFactory i;

    public osv() {
        super("TtmlDecoder");
        try {
            this.i = XmlPullParserFactory.newInstance();
            this.i.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192 A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x049a A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x049a A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x049a A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x049a A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x05f7 A:{Catch:{ orm -> 0x05fe }} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192 A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ee A:{SYNTHETIC, Splitter:B:97:0x01ee} */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04d8 A:{SYNTHETIC, Splitter:B:264:0x04d8} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0283 A:{LOOP_START, Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }, LOOP:1: B:133:0x0283->B:262:0x04d2} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017c A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0176 A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192 A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ee A:{SYNTHETIC, Splitter:B:97:0x01ee} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0283 A:{LOOP_START, Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }, LOOP:1: B:133:0x0283->B:262:0x04d2} */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04d8 A:{SYNTHETIC, Splitter:B:264:0x04d8} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x0302 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:187:0x038f */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0176 A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017c A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192 A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ee A:{SYNTHETIC, Splitter:B:97:0x01ee} */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04d8 A:{SYNTHETIC, Splitter:B:264:0x04d8} */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0283 A:{LOOP_START, Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }, LOOP:1: B:133:0x0283->B:262:0x04d2} */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01da A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d4 A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x01cc */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017c A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0176 A:{Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x016e */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:159|160|(1:162)(1:163)|164) */
    /* JADX WARNING: Missing block: B:160:?, code skipped:
            r8 = "Ignoring region with malformed origin: ";
     */
    /* JADX WARNING: Missing block: B:161:0x0308, code skipped:
            if (r2.length() == 0) goto L_0x030a;
     */
    /* JADX WARNING: Missing block: B:162:0x030a, code skipped:
            r2 = new java.lang.String(r8);
     */
    /* JADX WARNING: Missing block: B:163:0x0310, code skipped:
            r2 = r8.concat(r2);
     */
    /* JADX WARNING: Missing block: B:164:0x0314, code skipped:
            defpackage.oyp.a(r15, r2);
     */
    /* JADX WARNING: Missing block: B:188:?, code skipped:
            r8 = "Ignoring region with malformed extent: ";
     */
    /* JADX WARNING: Missing block: B:189:0x0395, code skipped:
            if (r2.length() == 0) goto L_0x0397;
     */
    /* JADX WARNING: Missing block: B:190:0x0397, code skipped:
            r2 = new java.lang.String(r8);
     */
    /* JADX WARNING: Missing block: B:191:0x039d, code skipped:
            r2 = r8.concat(r2);
     */
    /* JADX WARNING: Missing block: B:192:0x03a1, code skipped:
            defpackage.oyp.a(r15, r2);
     */
    private final defpackage.ote a(byte[] r37, int r38) {
        /*
        r36 = this;
        r1 = "\n";
        r2 = "http://www.w3.org/ns/ttml#parameter";
        r3 = r36;
        r4 = r3.i;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r4 = r4.newPullParser();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r5 = new java.util.HashMap;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r5.<init>();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r6 = new java.util.HashMap;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r6.<init>();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r7 = new java.util.HashMap;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r7.<init>();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = "";
        r9 = new otc;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r9.<init>();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r6.put(r8, r9);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = new java.io.ByteArrayInputStream;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r9 = 0;
        r10 = r37;
        r11 = r38;
        r8.<init>(r10, r9, r11);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r10 = 0;
        r4.setInput(r8, r10);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = new java.util.ArrayDeque;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8.<init>();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r11 = r4.getEventType();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12 = g;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r13 = h;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r16 = r10;
        r14 = r12;
        r15 = r13;
        r13 = 0;
        r12 = r16;
    L_0x0047:
        r10 = 1;
        if (r11 == r10) goto L_0x06b9;
    L_0x004a:
        r17 = r8.peek();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r10 = r17;
        r10 = (defpackage.osz) r10;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r13 != 0) goto L_0x0682;
    L_0x0054:
        r9 = r4.getName();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r3 = "tt";
        r18 = r14;
        r14 = " ";
        r19 = r15;
        r15 = 2;
        if (r11 != r15) goto L_0x060f;
    L_0x0063:
        r11 = r3.equals(r9);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r15 = "TtmlDecoder";
        if (r11 != 0) goto L_0x007d;
    L_0x006b:
        r22 = r1;
        r24 = r2;
        r23 = r8;
        r20 = r12;
        r21 = r13;
        r11 = r16;
        r14 = r18;
        r1 = r19;
        goto L_0x01e6;
    L_0x007d:
        r11 = "frameRate";
        r11 = r4.getAttributeValue(r2, r11);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r11 == 0) goto L_0x008a;
    L_0x0085:
        r11 = java.lang.Integer.parseInt(r11);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x008c;
    L_0x008a:
        r11 = 30;
    L_0x008c:
        r20 = r12;
        r12 = "frameRateMultiplier";
        r12 = r4.getAttributeValue(r2, r12);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r12 == 0) goto L_0x00bd;
    L_0x0096:
        r12 = defpackage.ozp.a(r12, r14);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r21 = r13;
        r13 = r12.length;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r22 = r1;
        r1 = 2;
        if (r13 != r1) goto L_0x00b5;
    L_0x00a2:
        r1 = 0;
        r13 = r12[r1];	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r13 = java.lang.Integer.parseInt(r13);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r13 = (float) r13;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r16 = 1;
        r12 = r12[r16];	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12 = java.lang.Integer.parseInt(r12);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12 = (float) r12;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r13 = r13 / r12;
        goto L_0x00c4;
    L_0x00b5:
        r1 = new orm;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2 = "frameRateMultiplier doesn't have 2 parts";
        r1.<init>(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        throw r1;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x00bd:
        r22 = r1;
        r21 = r13;
        r1 = 0;
        r13 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x00c4:
        r12 = g;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12 = r12.b;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r1 = "subFrameRate";
        r1 = r4.getAttributeValue(r2, r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r1 == 0) goto L_0x00d4;
    L_0x00d0:
        r12 = java.lang.Integer.parseInt(r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x00d4:
        r1 = g;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r1 = r1.c;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r16 = r1;
        r1 = "tickRate";
        r1 = r4.getAttributeValue(r2, r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r1 == 0) goto L_0x00e9;
    L_0x00e2:
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r23 = r8;
        goto L_0x00ed;
    L_0x00e9:
        r23 = r8;
        r1 = r16;
    L_0x00ed:
        r8 = new osx;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r11 = (float) r11;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r11 = r11 * r13;
        r8.<init>(r11, r12, r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r1 = h;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r11 = "cellResolution";
        r11 = r4.getAttributeValue(r2, r11);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r11 == 0) goto L_0x0184;
    L_0x00ff:
        r12 = f;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12 = r12.matcher(r11);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r13 = r12.matches();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r13 != 0) goto L_0x0121;
    L_0x010b:
        r12 = "Ignoring malformed cell resolution: ";
        r13 = r11.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r13 != 0) goto L_0x0119;
    L_0x0113:
        r11 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r11.<init>(r12);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x011d;
    L_0x0119:
        r11 = r12.concat(r11);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x011d:
        defpackage.oyp.a(r15, r11);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0184;
    L_0x0121:
        r13 = 1;
        r16 = r12.group(r13);	 Catch:{ NumberFormatException -> 0x0168 }
        r13 = java.lang.Integer.parseInt(r16);	 Catch:{ NumberFormatException -> 0x0168 }
        r16 = r1;
        r1 = 2;
        r12 = r12.group(r1);	 Catch:{ NumberFormatException -> 0x016a }
        r1 = java.lang.Integer.parseInt(r12);	 Catch:{ NumberFormatException -> 0x016a }
        if (r13 == 0) goto L_0x0145;
    L_0x0137:
        if (r1 == 0) goto L_0x0145;
    L_0x0139:
        r12 = new osy;	 Catch:{ NumberFormatException -> 0x016a }
        r12.<init>(r1);	 Catch:{ NumberFormatException -> 0x016a }
        r24 = r2;
        r18 = r8;
        r16 = r12;
        goto L_0x018a;
    L_0x0145:
        r12 = new orm;	 Catch:{ NumberFormatException -> 0x016a }
        r24 = r2;
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x016c }
        r18 = r8;
        r8 = 47;
        r2.<init>(r8);	 Catch:{ NumberFormatException -> 0x016e }
        r8 = "Invalid cell resolution ";
        r2.append(r8);	 Catch:{ NumberFormatException -> 0x016e }
        r2.append(r13);	 Catch:{ NumberFormatException -> 0x016e }
        r2.append(r14);	 Catch:{ NumberFormatException -> 0x016e }
        r2.append(r1);	 Catch:{ NumberFormatException -> 0x016e }
        r1 = r2.toString();	 Catch:{ NumberFormatException -> 0x016e }
        r12.<init>(r1);	 Catch:{ NumberFormatException -> 0x016e }
        throw r12;	 Catch:{ NumberFormatException -> 0x016e }
    L_0x0168:
        r16 = r1;
    L_0x016a:
        r24 = r2;
    L_0x016c:
        r18 = r8;
    L_0x016e:
        r1 = "Ignoring malformed cell resolution: ";
        r2 = r11.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x017c;
    L_0x0176:
        r2 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2.<init>(r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0180;
    L_0x017c:
        r2 = r1.concat(r11);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x0180:
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x018a;
    L_0x0184:
        r16 = r1;
        r24 = r2;
        r18 = r8;
    L_0x018a:
        r1 = "extent";
        r1 = defpackage.ozr.c(r4, r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r1 == 0) goto L_0x01e1;
    L_0x0192:
        r2 = e;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2 = r2.matcher(r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = r2.matches();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r8 != 0) goto L_0x01b4;
    L_0x019e:
        r2 = "Ignoring non-pixel tts extent: ";
        r8 = r1.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r8 != 0) goto L_0x01ac;
    L_0x01a6:
        r1 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r1.<init>(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x01b0;
    L_0x01ac:
        r1 = r2.concat(r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x01b0:
        defpackage.oyp.a(r15, r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x01e1;
    L_0x01b4:
        r8 = 1;
        r11 = r2.group(r8);	 Catch:{ NumberFormatException -> 0x01cc }
        r8 = java.lang.Integer.parseInt(r11);	 Catch:{ NumberFormatException -> 0x01cc }
        r11 = 2;
        r2 = r2.group(r11);	 Catch:{ NumberFormatException -> 0x01cc }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x01cc }
        r11 = new ota;	 Catch:{ NumberFormatException -> 0x01cc }
        r11.<init>(r8, r2);	 Catch:{ NumberFormatException -> 0x01cc }
        goto L_0x01e2;
    L_0x01cc:
        r2 = "Ignoring malformed tts extent: ";
        r8 = r1.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r8 != 0) goto L_0x01da;
    L_0x01d4:
        r1 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r1.<init>(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x01de;
    L_0x01da:
        r1 = r2.concat(r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x01de:
        defpackage.oyp.a(r15, r1);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x01e1:
        r11 = 0;
    L_0x01e2:
        r1 = r16;
        r14 = r18;
    L_0x01e6:
        r2 = r9.equals(r3);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r3 = "style";
        if (r2 != 0) goto L_0x027b;
    L_0x01ee:
        r2 = "head";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x01f6:
        r2 = "body";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x01fe:
        r2 = "div";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x0206:
        r2 = "p";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x020e:
        r2 = "span";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x0216:
        r2 = "br";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x021e:
        r2 = r9.equals(r3);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x0224:
        r2 = "styling";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x022c:
        r2 = "layout";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x0234:
        r2 = "region";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x023c:
        r2 = "metadata";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x0244:
        r2 = "image";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x024c:
        r2 = "data";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x0254:
        r2 = "information";
        r2 = r9.equals(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x027b;
    L_0x025c:
        r2 = "Ignoring unsupported tag: ";
        r3 = r4.getName();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = r3.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r8 != 0) goto L_0x0272;
    L_0x026c:
        r3 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r3.<init>(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0275;
    L_0x0272:
        r2.concat(r3);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x0275:
        r9 = r22;
        r2 = r23;
        goto L_0x060b;
    L_0x027b:
        r2 = "head";
        r2 = r2.equals(r9);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 == 0) goto L_0x04d8;
    L_0x0283:
        r4.next();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2 = defpackage.ozr.b(r4, r3);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x04a0;
    L_0x028c:
        r2 = "region";
        r2 = defpackage.ozr.b(r4, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x02c0;
    L_0x0294:
        r2 = "metadata";
        r2 = defpackage.ozr.b(r4, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 == 0) goto L_0x04cc;
    L_0x029c:
        r4.next();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2 = "image";
        r2 = defpackage.ozr.b(r4, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 == 0) goto L_0x02b6;
    L_0x02a7:
        r2 = "id";
        r2 = defpackage.ozr.c(r4, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 == 0) goto L_0x02b6;
    L_0x02af:
        r8 = r4.nextText();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r7.put(r2, r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x02b6:
        r2 = "metadata";
        r2 = defpackage.ozr.a(r4, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 == 0) goto L_0x029c;
    L_0x02be:
        goto L_0x04cc;
    L_0x02c0:
        r2 = "id";
        r26 = defpackage.ozr.c(r4, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r26 == 0) goto L_0x0497;
    L_0x02c8:
        r2 = "origin";
        r2 = defpackage.ozr.c(r4, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 != 0) goto L_0x02d7;
    L_0x02d0:
        r2 = "Ignoring region without an origin";
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0497;
    L_0x02d7:
        r8 = d;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = r8.matcher(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r10 = e;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r10 = r10.matcher(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12 = r8.matches();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r13 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        if (r12 == 0) goto L_0x0319;
    L_0x02eb:
        r12 = 1;
        r10 = r8.group(r12);	 Catch:{ NumberFormatException -> 0x0302 }
        r10 = java.lang.Float.parseFloat(r10);	 Catch:{ NumberFormatException -> 0x0302 }
        r10 = r10 / r13;
        r12 = 2;
        r8 = r8.group(r12);	 Catch:{ NumberFormatException -> 0x0302 }
        r8 = java.lang.Float.parseFloat(r8);	 Catch:{ NumberFormatException -> 0x0302 }
        r8 = r8 / r13;
        r27 = r10;
        goto L_0x0357;
    L_0x0302:
        r8 = "Ignoring region with malformed origin: ";
        r10 = r2.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r10 != 0) goto L_0x0310;
    L_0x030a:
        r2 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2.<init>(r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0314;
    L_0x0310:
        r2 = r8.concat(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x0314:
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0497;
    L_0x0319:
        r8 = r10.matches();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r8 != 0) goto L_0x0336;
    L_0x031f:
        r8 = "Ignoring region with unsupported origin: ";
        r10 = r2.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r10 != 0) goto L_0x032d;
    L_0x0327:
        r2 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2.<init>(r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0331;
    L_0x032d:
        r2 = r8.concat(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x0331:
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0497;
    L_0x0336:
        if (r11 == 0) goto L_0x0482;
    L_0x0338:
        r8 = 1;
        r12 = r10.group(r8);	 Catch:{ NumberFormatException -> 0x046c }
        r8 = java.lang.Integer.parseInt(r12);	 Catch:{ NumberFormatException -> 0x046c }
        r12 = 2;
        r10 = r10.group(r12);	 Catch:{ NumberFormatException -> 0x046c }
        r10 = java.lang.Integer.parseInt(r10);	 Catch:{ NumberFormatException -> 0x046c }
        r8 = (float) r8;	 Catch:{ NumberFormatException -> 0x046c }
        r12 = r11.a;	 Catch:{ NumberFormatException -> 0x046c }
        r12 = (float) r12;	 Catch:{ NumberFormatException -> 0x046c }
        r8 = r8 / r12;
        r10 = (float) r10;	 Catch:{ NumberFormatException -> 0x046c }
        r12 = r11.b;	 Catch:{ NumberFormatException -> 0x046c }
        r12 = (float) r12;
        r10 = r10 / r12;
        r27 = r8;
        r8 = r10;
    L_0x0357:
        r10 = "extent";
        r10 = defpackage.ozr.c(r4, r10);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r10 != 0) goto L_0x0366;
    L_0x035f:
        r2 = "Ignoring region without an extent";
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0497;
    L_0x0366:
        r12 = d;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12 = r12.matcher(r10);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r9 = e;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r9 = r9.matcher(r10);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r10 = r12.matches();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r10 == 0) goto L_0x03a6;
    L_0x0378:
        r10 = 1;
        r9 = r12.group(r10);	 Catch:{ NumberFormatException -> 0x038f }
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x038f }
        r9 = r9 / r13;
        r10 = 2;
        r12 = r12.group(r10);	 Catch:{ NumberFormatException -> 0x038f }
        r2 = java.lang.Float.parseFloat(r12);	 Catch:{ NumberFormatException -> 0x038f }
        r2 = r2 / r13;
        r31 = r9;
        goto L_0x03e4;
    L_0x038f:
        r8 = "Ignoring region with malformed extent: ";
        r9 = r2.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r9 != 0) goto L_0x039d;
    L_0x0397:
        r2 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2.<init>(r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x03a1;
    L_0x039d:
        r2 = r8.concat(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x03a1:
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0497;
    L_0x03a6:
        r10 = r9.matches();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r10 != 0) goto L_0x03c3;
    L_0x03ac:
        r8 = "Ignoring region with unsupported extent: ";
        r9 = r2.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r9 != 0) goto L_0x03ba;
    L_0x03b4:
        r2 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2.<init>(r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x03be;
    L_0x03ba:
        r2 = r8.concat(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x03be:
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0497;
    L_0x03c3:
        if (r11 == 0) goto L_0x0456;
    L_0x03c5:
        r10 = 1;
        r12 = r9.group(r10);	 Catch:{ NumberFormatException -> 0x0440 }
        r10 = java.lang.Integer.parseInt(r12);	 Catch:{ NumberFormatException -> 0x0440 }
        r12 = 2;
        r9 = r9.group(r12);	 Catch:{ NumberFormatException -> 0x0440 }
        r9 = java.lang.Integer.parseInt(r9);	 Catch:{ NumberFormatException -> 0x0440 }
        r10 = (float) r10;	 Catch:{ NumberFormatException -> 0x0440 }
        r12 = r11.a;	 Catch:{ NumberFormatException -> 0x0440 }
        r12 = (float) r12;	 Catch:{ NumberFormatException -> 0x0440 }
        r10 = r10 / r12;
        r9 = (float) r9;	 Catch:{ NumberFormatException -> 0x0440 }
        r2 = r11.b;	 Catch:{ NumberFormatException -> 0x0440 }
        r2 = (float) r2;
        r2 = r9 / r2;
        r31 = r10;
    L_0x03e4:
        r9 = "displayAlign";
        r9 = defpackage.ozr.c(r4, r9);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r9 != 0) goto L_0x03f1;
    L_0x03ec:
        r28 = r8;
        r30 = 0;
        goto L_0x042d;
    L_0x03f1:
        r9 = defpackage.ozp.d(r9);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r10 = r9.hashCode();
        r12 = -1364013995; // 0xffffffffaeb2cc55 float:-8.1307995E-11 double:NaN;
        if (r10 == r12) goto L_0x040e;
    L_0x03fe:
        r12 = 92734940; // 0x58705dc float:1.2697491E-35 double:4.5817148E-316;
        if (r10 == r12) goto L_0x0404;
    L_0x0403:
        goto L_0x0418;
    L_0x0404:
        r10 = "after";
        r9 = r9.equals(r10);
        if (r9 == 0) goto L_0x0418;
    L_0x040c:
        r9 = 1;
        goto L_0x0419;
    L_0x040e:
        r10 = "center";
        r9 = r9.equals(r10);
        if (r9 == 0) goto L_0x0418;
    L_0x0416:
        r9 = 0;
        goto L_0x0419;
    L_0x0418:
        r9 = -1;
    L_0x0419:
        if (r9 == 0) goto L_0x0425;
    L_0x041b:
        r10 = 1;
        if (r9 == r10) goto L_0x041f;
    L_0x041e:
        goto L_0x03ec;
    L_0x041f:
        r8 = r8 + r2;
        r28 = r8;
        r30 = 2;
        goto L_0x042d;
    L_0x0425:
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r9;
        r8 = r8 + r2;
        r28 = r8;
        r30 = 1;
    L_0x042d:
        r2 = r1.a;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = (float) r2;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r33 = r8 / r2;
        r2 = new otc;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r29 = 0;
        r32 = 1;
        r25 = r2;
        r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0498;
    L_0x0440:
        r8 = "Ignoring region with malformed extent: ";
        r9 = r2.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r9 != 0) goto L_0x044e;
    L_0x0448:
        r2 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2.<init>(r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0452;
    L_0x044e:
        r2 = r8.concat(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x0452:
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0497;
    L_0x0456:
        r8 = "Ignoring region with missing tts:extent: ";
        r9 = r2.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r9 != 0) goto L_0x0464;
    L_0x045e:
        r2 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2.<init>(r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0468;
    L_0x0464:
        r2 = r8.concat(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x0468:
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0497;
    L_0x046c:
        r8 = "Ignoring region with malformed origin: ";
        r9 = r2.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r9 != 0) goto L_0x047a;
    L_0x0474:
        r2 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2.<init>(r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x047e;
    L_0x047a:
        r2 = r8.concat(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x047e:
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0497;
    L_0x0482:
        r8 = "Ignoring region with missing tts:extent: ";
        r9 = r2.length();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r9 != 0) goto L_0x0490;
    L_0x048a:
        r2 = new java.lang.String;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r2.<init>(r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0494;
    L_0x0490:
        r2 = r8.concat(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x0494:
        defpackage.oyp.a(r15, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x0497:
        r2 = 0;
    L_0x0498:
        if (r2 == 0) goto L_0x04cc;
    L_0x049a:
        r8 = r2.a;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r6.put(r8, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x04cc;
    L_0x04a0:
        r2 = defpackage.ozr.c(r4, r3);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = new otb;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8.<init>();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = defpackage.osv.a(r4, r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 == 0) goto L_0x04c5;
    L_0x04af:
        r2 = defpackage.osv.a(r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r9 = r2.length;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r10 = 0;
    L_0x04b5:
        if (r10 >= r9) goto L_0x04c5;
    L_0x04b7:
        r12 = r2[r10];	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12 = r5.get(r12);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12 = (defpackage.otb) r12;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8.a(r12);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r10 = r10 + 1;
        goto L_0x04b5;
    L_0x04c5:
        r2 = r8.l;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 == 0) goto L_0x04cc;
    L_0x04c9:
        r5.put(r2, r8);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
    L_0x04cc:
        r2 = "head";
        r2 = defpackage.ozr.a(r4, r2);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r2 == 0) goto L_0x0283;
    L_0x04d4:
        r2 = r23;
        goto L_0x05fa;
    L_0x04d8:
        r2 = "";
        r8 = r4.getAttributeCount();	 Catch:{ orm -> 0x0600 }
        r9 = 0;
        r32 = defpackage.osv.a(r4, r9);	 Catch:{ orm -> 0x0600 }
        r34 = r2;
        r33 = r9;
        r35 = r33;
        r2 = 0;
        r25 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r27 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r29 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
    L_0x04f9:
        if (r2 >= r8) goto L_0x05a2;
    L_0x04fb:
        r9 = r4.getAttributeName(r2);	 Catch:{ orm -> 0x059c }
        r12 = r4.getAttributeValue(r2);	 Catch:{ orm -> 0x059c }
        r13 = r9.hashCode();
        switch(r13) {
            case -934795532: goto L_0x053b;
            case 99841: goto L_0x0531;
            case 100571: goto L_0x0527;
            case 93616297: goto L_0x051d;
            case 109780401: goto L_0x0515;
            case 1292595405: goto L_0x050b;
            default: goto L_0x050a;
        };
    L_0x050a:
        goto L_0x0545;
    L_0x050b:
        r13 = "backgroundImage";
        r9 = r9.equals(r13);
        if (r9 == 0) goto L_0x0545;
    L_0x0513:
        r9 = 5;
        goto L_0x0546;
    L_0x0515:
        r9 = r9.equals(r3);
        if (r9 == 0) goto L_0x0545;
    L_0x051b:
        r9 = 3;
        goto L_0x0546;
    L_0x051d:
        r13 = "begin";
        r9 = r9.equals(r13);
        if (r9 == 0) goto L_0x0545;
    L_0x0525:
        r9 = 0;
        goto L_0x0546;
    L_0x0527:
        r13 = "end";
        r9 = r9.equals(r13);
        if (r9 == 0) goto L_0x0545;
    L_0x052f:
        r9 = 1;
        goto L_0x0546;
    L_0x0531:
        r13 = "dur";
        r9 = r9.equals(r13);
        if (r9 == 0) goto L_0x0545;
    L_0x0539:
        r9 = 2;
        goto L_0x0546;
    L_0x053b:
        r13 = "region";
        r9 = r9.equals(r13);
        if (r9 == 0) goto L_0x0545;
    L_0x0543:
        r9 = 4;
        goto L_0x0546;
    L_0x0545:
        r9 = -1;
    L_0x0546:
        if (r9 == 0) goto L_0x0590;
    L_0x0548:
        r13 = 1;
        if (r9 == r13) goto L_0x0588;
    L_0x054b:
        r13 = 2;
        if (r9 == r13) goto L_0x0580;
    L_0x054e:
        r13 = 3;
        if (r9 == r13) goto L_0x0574;
    L_0x0551:
        r13 = 4;
        if (r9 == r13) goto L_0x0569;
    L_0x0554:
        r13 = 5;
        if (r9 == r13) goto L_0x0559;
    L_0x0557:
        r9 = 1;
        goto L_0x0597;
    L_0x0559:
        r9 = "#";
        r9 = r12.startsWith(r9);	 Catch:{ orm -> 0x059c }
        if (r9 == 0) goto L_0x0557;
    L_0x0561:
        r9 = 1;
        r12 = r12.substring(r9);	 Catch:{ orm -> 0x059c }
        r35 = r12;
        goto L_0x0597;
    L_0x0569:
        r9 = 1;
        r13 = r6.containsKey(r12);	 Catch:{ orm -> 0x059c }
        if (r13 != 0) goto L_0x0571;
    L_0x0570:
        goto L_0x0597;
    L_0x0571:
        r34 = r12;
        goto L_0x0597;
    L_0x0574:
        r9 = 1;
        r12 = defpackage.osv.a(r12);	 Catch:{ orm -> 0x059c }
        r13 = r12.length;	 Catch:{ orm -> 0x059c }
        if (r13 > 0) goto L_0x057d;
    L_0x057c:
        goto L_0x0597;
    L_0x057d:
        r33 = r12;
        goto L_0x0597;
    L_0x0580:
        r9 = 1;
        r12 = defpackage.osv.a(r12, r14);	 Catch:{ orm -> 0x059c }
        r29 = r12;
        goto L_0x0597;
    L_0x0588:
        r9 = 1;
        r12 = defpackage.osv.a(r12, r14);	 Catch:{ orm -> 0x059c }
        r27 = r12;
        goto L_0x0597;
    L_0x0590:
        r9 = 1;
        r12 = defpackage.osv.a(r12, r14);	 Catch:{ orm -> 0x059c }
        r25 = r12;
    L_0x0597:
        r2 = r2 + 1;
        r9 = 0;
        goto L_0x04f9;
    L_0x059c:
        r0 = move-exception;
        r3 = r0;
        r2 = r23;
        goto L_0x0604;
    L_0x05a2:
        r9 = 1;
        if (r10 != 0) goto L_0x05ab;
    L_0x05a5:
        r12 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        goto L_0x05b6;
    L_0x05ab:
        r2 = r10.a;	 Catch:{ orm -> 0x0600 }
        r12 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r8 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1));
        if (r8 != 0) goto L_0x05b9;
    L_0x05b6:
        r2 = r25;
        goto L_0x05c6;
    L_0x05b9:
        r8 = (r25 > r12 ? 1 : (r25 == r12 ? 0 : -1));
        if (r8 == 0) goto L_0x05bf;
    L_0x05bd:
        r25 = r25 + r2;
    L_0x05bf:
        r8 = (r27 > r12 ? 1 : (r27 == r12 ? 0 : -1));
        if (r8 == 0) goto L_0x05b6;
    L_0x05c3:
        r27 = r27 + r2;
        goto L_0x05b6;
    L_0x05c6:
        r8 = (r27 > r12 ? 1 : (r27 == r12 ? 0 : -1));
        if (r8 != 0) goto L_0x05df;
    L_0x05ca:
        r8 = (r29 > r12 ? 1 : (r29 == r12 ? 0 : -1));
        if (r8 == 0) goto L_0x05d3;
    L_0x05ce:
        r29 = r2 + r29;
        r30 = r29;
        goto L_0x05e1;
    L_0x05d3:
        if (r10 != 0) goto L_0x05d6;
    L_0x05d5:
        goto L_0x05df;
    L_0x05d6:
        r8 = r10.b;	 Catch:{ orm -> 0x059c }
        r16 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r16 == 0) goto L_0x05df;
    L_0x05dc:
        r30 = r8;
        goto L_0x05e1;
    L_0x05df:
        r30 = r27;
    L_0x05e1:
        r26 = r4.getName();	 Catch:{ orm -> 0x0600 }
        r8 = new osz;	 Catch:{ orm -> 0x0600 }
        r27 = 0;
        r25 = r8;
        r28 = r2;
        r25.<init>(r26, r27, r28, r30, r32, r33, r34, r35);	 Catch:{ orm -> 0x0600 }
        r2 = r23;
        r2.push(r8);	 Catch:{ orm -> 0x05fe }
        if (r10 == 0) goto L_0x05fa;
    L_0x05f7:
        r10.a(r8);	 Catch:{ orm -> 0x05fe }
    L_0x05fa:
        r9 = r22;
        goto L_0x067e;
    L_0x05fe:
        r0 = move-exception;
        goto L_0x0603;
    L_0x0600:
        r0 = move-exception;
        r2 = r23;
    L_0x0603:
        r3 = r0;
    L_0x0604:
        r8 = "Suppressing parser error";
        defpackage.oyp.a(r15, r8, r3);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r9 = r22;
    L_0x060b:
        r21 = 1;
        goto L_0x067e;
    L_0x060f:
        r22 = r1;
        r24 = r2;
        r2 = r8;
        r20 = r12;
        r21 = r13;
        r1 = 4;
        if (r11 != r1) goto L_0x0656;
    L_0x061b:
        r1 = r4.getText();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r3 = new osz;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = "\r\n";
        r9 = r22;
        r1 = r1.replaceAll(r8, r9);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = " *\n *";
        r1 = r1.replaceAll(r8, r9);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r1 = r1.replaceAll(r9, r14);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r8 = "[ \t\\x0B\f\r]+";
        r27 = r1.replaceAll(r8, r14);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r34 = "";
        r26 = 0;
        r28 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r30 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r32 = 0;
        r33 = 0;
        r35 = 0;
        r25 = r3;
        r25.<init>(r26, r27, r28, r30, r32, r33, r34, r35);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r10.a(r3);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0678;
    L_0x0656:
        r9 = r22;
        r1 = 3;
        if (r11 != r1) goto L_0x0678;
    L_0x065b:
        r1 = r4.getName();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r1 = r1.equals(r3);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        if (r1 == 0) goto L_0x0671;
    L_0x0665:
        r12 = new ote;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r1 = r2.peek();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r1 = (defpackage.osz) r1;	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r12.<init>(r1, r5, r6, r7);	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        goto L_0x0673;
    L_0x0671:
        r12 = r20;
    L_0x0673:
        r2.pop();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r20 = r12;
    L_0x0678:
        r11 = r16;
        r14 = r18;
        r1 = r19;
    L_0x067e:
        r15 = r1;
        r16 = r11;
        goto L_0x06a1;
    L_0x0682:
        r9 = r1;
        r24 = r2;
        r2 = r8;
        r20 = r12;
        r21 = r13;
        r18 = r14;
        r19 = r15;
        r1 = 2;
        if (r11 != r1) goto L_0x069a;
    L_0x0691:
        r13 = r21 + 1;
    L_0x0693:
        r14 = r18;
        r15 = r19;
        r12 = r20;
        goto L_0x06a9;
    L_0x069a:
        r1 = 3;
        if (r11 == r1) goto L_0x06a6;
    L_0x069d:
        r14 = r18;
        r15 = r19;
    L_0x06a1:
        r12 = r20;
        r13 = r21;
        goto L_0x06a9;
    L_0x06a6:
        r13 = r21 + -1;
        goto L_0x0693;
    L_0x06a9:
        r4.next();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r11 = r4.getEventType();	 Catch:{ XmlPullParserException -> 0x06c6, IOException -> 0x06bc }
        r3 = r36;
        r8 = r2;
        r1 = r9;
        r2 = r24;
        r9 = 0;
        goto L_0x0047;
    L_0x06b9:
        r20 = r12;
        return r20;
    L_0x06bc:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.IllegalStateException;
        r3 = "Unexpected error when reading input.";
        r2.<init>(r3, r1);
        throw r2;
    L_0x06c6:
        r0 = move-exception;
        r1 = r0;
        r2 = new orm;
        r3 = "Unable to decode source";
        r2.<init>(r3, r1);
        goto L_0x06d1;
    L_0x06d0:
        throw r2;
    L_0x06d1:
        goto L_0x06d0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osv.a(byte[], int):ote");
    }

    private static String[] a(String str) {
        str = str.trim();
        return !str.isEmpty() ? ozp.a(str, "\\s+") : new String[0];
    }

    private static defpackage.otb a(org.xmlpull.v1.XmlPullParser r14, defpackage.otb r15) {
        /*
        r0 = r14.getAttributeCount();
        r1 = 0;
        r2 = r15;
        r15 = 0;
    L_0x0007:
        if (r15 >= r0) goto L_0x02e2;
    L_0x0009:
        r3 = r14.getAttributeValue(r15);
        r4 = r14.getAttributeName(r15);
        r5 = r4.hashCode();
        r6 = 4;
        r7 = -1;
        r8 = 3;
        r9 = 2;
        r10 = 1;
        switch(r5) {
            case -1550943582: goto L_0x006f;
            case -1224696685: goto L_0x0065;
            case -1065511464: goto L_0x005b;
            case -879295043: goto L_0x0050;
            case -734428249: goto L_0x0046;
            case 3355: goto L_0x003c;
            case 94842723: goto L_0x0032;
            case 365601008: goto L_0x0028;
            case 1287124693: goto L_0x001e;
            default: goto L_0x001d;
        };
    L_0x001d:
        goto L_0x0079;
    L_0x001e:
        r5 = "backgroundColor";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0026:
        r4 = 1;
        goto L_0x007a;
    L_0x0028:
        r5 = "fontSize";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0030:
        r4 = 4;
        goto L_0x007a;
    L_0x0032:
        r5 = "color";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x003a:
        r4 = 2;
        goto L_0x007a;
    L_0x003c:
        r5 = "id";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0044:
        r4 = 0;
        goto L_0x007a;
    L_0x0046:
        r5 = "fontWeight";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x004e:
        r4 = 5;
        goto L_0x007a;
    L_0x0050:
        r5 = "textDecoration";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0058:
        r4 = 8;
        goto L_0x007a;
    L_0x005b:
        r5 = "textAlign";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0063:
        r4 = 7;
        goto L_0x007a;
    L_0x0065:
        r5 = "fontFamily";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x006d:
        r4 = 3;
        goto L_0x007a;
    L_0x006f:
        r5 = "fontStyle";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0077:
        r4 = 6;
        goto L_0x007a;
    L_0x0079:
        r4 = -1;
    L_0x007a:
        r5 = "TtmlDecoder";
        switch(r4) {
            case 0: goto L_0x02cc;
            case 1: goto L_0x02a6;
            case 2: goto L_0x0280;
            case 3: goto L_0x0276;
            case 4: goto L_0x017f;
            case 5: goto L_0x016e;
            case 6: goto L_0x015d;
            case 7: goto L_0x00e2;
            case 8: goto L_0x0081;
            default: goto L_0x007f;
        };
    L_0x007f:
        goto L_0x02de;
    L_0x0081:
        r3 = defpackage.ozp.d(r3);
        r4 = r3.hashCode();
        switch(r4) {
            case -1461280213: goto L_0x00ab;
            case -1026963764: goto L_0x00a1;
            case 913457136: goto L_0x0097;
            case 1679736913: goto L_0x008d;
            default: goto L_0x008c;
        };
    L_0x008c:
        goto L_0x00b4;
    L_0x008d:
        r4 = "linethrough";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00b4;
    L_0x0095:
        r7 = 0;
        goto L_0x00b4;
    L_0x0097:
        r4 = "nolinethrough";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00b4;
    L_0x009f:
        r7 = 1;
        goto L_0x00b4;
    L_0x00a1:
        r4 = "underline";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00b4;
    L_0x00a9:
        r7 = 2;
        goto L_0x00b4;
    L_0x00ab:
        r4 = "nounderline";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00b4;
    L_0x00b3:
        r7 = 3;
    L_0x00b4:
        if (r7 == 0) goto L_0x00d9;
    L_0x00b6:
        if (r7 == r10) goto L_0x00d0;
    L_0x00b8:
        if (r7 == r9) goto L_0x00c7;
    L_0x00ba:
        if (r7 == r8) goto L_0x00be;
    L_0x00bc:
        goto L_0x02de;
    L_0x00be:
        r2 = defpackage.osv.a(r2);
        r2.b(r1);
        goto L_0x02de;
    L_0x00c7:
        r2 = defpackage.osv.a(r2);
        r2.b(r10);
        goto L_0x02de;
    L_0x00d0:
        r2 = defpackage.osv.a(r2);
        r2.a(r1);
        goto L_0x02de;
    L_0x00d9:
        r2 = defpackage.osv.a(r2);
        r2.a(r10);
        goto L_0x02de;
    L_0x00e2:
        r3 = defpackage.ozp.d(r3);
        r4 = r3.hashCode();
        switch(r4) {
            case -1364013995: goto L_0x0116;
            case 100571: goto L_0x010c;
            case 3317767: goto L_0x0102;
            case 108511772: goto L_0x00f8;
            case 109757538: goto L_0x00ee;
            default: goto L_0x00ed;
        };
    L_0x00ed:
        goto L_0x011f;
    L_0x00ee:
        r4 = "start";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x011f;
    L_0x00f6:
        r7 = 1;
        goto L_0x011f;
    L_0x00f8:
        r4 = "right";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x011f;
    L_0x0100:
        r7 = 2;
        goto L_0x011f;
    L_0x0102:
        r4 = "left";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x011f;
    L_0x010a:
        r7 = 0;
        goto L_0x011f;
    L_0x010c:
        r4 = "end";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x011f;
    L_0x0114:
        r7 = 3;
        goto L_0x011f;
    L_0x0116:
        r4 = "center";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x011f;
    L_0x011e:
        r7 = 4;
    L_0x011f:
        if (r7 == 0) goto L_0x0153;
    L_0x0121:
        if (r7 == r10) goto L_0x0149;
    L_0x0123:
        if (r7 == r9) goto L_0x013f;
    L_0x0125:
        if (r7 == r8) goto L_0x0135;
    L_0x0127:
        if (r7 == r6) goto L_0x012b;
    L_0x0129:
        goto L_0x02de;
    L_0x012b:
        r2 = defpackage.osv.a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_CENTER;
        r2.m = r3;
        goto L_0x02de;
    L_0x0135:
        r2 = defpackage.osv.a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        r2.m = r3;
        goto L_0x02de;
    L_0x013f:
        r2 = defpackage.osv.a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        r2.m = r3;
        goto L_0x02de;
    L_0x0149:
        r2 = defpackage.osv.a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r2.m = r3;
        goto L_0x02de;
    L_0x0153:
        r2 = defpackage.osv.a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r2.m = r3;
        goto L_0x02de;
    L_0x015d:
        r2 = defpackage.osv.a(r2);
        r4 = "italic";
        r3 = r4.equalsIgnoreCase(r3);
        defpackage.oxz.b(r10);
        r2.i = r3;
        goto L_0x02de;
    L_0x016e:
        r2 = defpackage.osv.a(r2);
        r4 = "bold";
        r3 = r4.equalsIgnoreCase(r3);
        defpackage.oxz.b(r10);
        r2.h = r3;
        goto L_0x02de;
    L_0x017f:
        r2 = defpackage.osv.a(r2);	 Catch:{ orm -> 0x025c }
        r4 = "\\s+";
        r4 = defpackage.ozp.a(r3, r4);	 Catch:{ orm -> 0x025c }
        r6 = r4.length;	 Catch:{ orm -> 0x025c }
        if (r6 != r10) goto L_0x0193;
    L_0x018c:
        r4 = c;	 Catch:{ orm -> 0x025c }
        r4 = r4.matcher(r3);	 Catch:{ orm -> 0x025c }
        goto L_0x01a2;
    L_0x0193:
        if (r6 != r9) goto L_0x023e;
    L_0x0195:
        r6 = c;	 Catch:{ orm -> 0x025c }
        r4 = r4[r10];	 Catch:{ orm -> 0x025c }
        r4 = r6.matcher(r4);	 Catch:{ orm -> 0x025c }
        r6 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.";
        defpackage.oyp.a(r5, r6);	 Catch:{ orm -> 0x025c }
    L_0x01a2:
        r6 = r4.matches();	 Catch:{ orm -> 0x025c }
        r11 = "'.";
        if (r6 == 0) goto L_0x021a;
    L_0x01aa:
        r6 = r4.group(r8);	 Catch:{ orm -> 0x025c }
        r12 = r6.hashCode();
        r13 = 37;
        if (r12 == r13) goto L_0x01d3;
    L_0x01b6:
        r13 = 3240; // 0xca8 float:4.54E-42 double:1.601E-320;
        if (r12 == r13) goto L_0x01c9;
    L_0x01ba:
        r13 = 3592; // 0xe08 float:5.033E-42 double:1.7747E-320;
        if (r12 == r13) goto L_0x01bf;
    L_0x01be:
        goto L_0x01dc;
    L_0x01bf:
        r12 = "px";
        r12 = r6.equals(r12);
        if (r12 == 0) goto L_0x01dc;
    L_0x01c7:
        r7 = 0;
        goto L_0x01dc;
    L_0x01c9:
        r12 = "em";
        r12 = r6.equals(r12);
        if (r12 == 0) goto L_0x01dc;
    L_0x01d1:
        r7 = 1;
        goto L_0x01dc;
    L_0x01d3:
        r12 = "%";
        r12 = r6.equals(r12);
        if (r12 == 0) goto L_0x01dc;
    L_0x01db:
        r7 = 2;
    L_0x01dc:
        if (r7 == 0) goto L_0x0208;
    L_0x01de:
        if (r7 == r10) goto L_0x0205;
    L_0x01e0:
        if (r7 != r9) goto L_0x01e5;
    L_0x01e2:
        r2.j = r8;	 Catch:{ orm -> 0x025c }
        goto L_0x020a;
    L_0x01e5:
        r4 = new orm;	 Catch:{ orm -> 0x025c }
        r7 = r6.length();	 Catch:{ orm -> 0x025c }
        r7 = r7 + 30;
        r8 = new java.lang.StringBuilder;	 Catch:{ orm -> 0x025c }
        r8.<init>(r7);	 Catch:{ orm -> 0x025c }
        r7 = "Invalid unit for fontSize: '";
        r8.append(r7);	 Catch:{ orm -> 0x025c }
        r8.append(r6);	 Catch:{ orm -> 0x025c }
        r8.append(r11);	 Catch:{ orm -> 0x025c }
        r6 = r8.toString();	 Catch:{ orm -> 0x025c }
        r4.<init>(r6);	 Catch:{ orm -> 0x025c }
        throw r4;	 Catch:{ orm -> 0x025c }
    L_0x0205:
        r2.j = r9;	 Catch:{ orm -> 0x025c }
        goto L_0x020a;
    L_0x0208:
        r2.j = r10;	 Catch:{ orm -> 0x025c }
    L_0x020a:
        r4 = r4.group(r10);	 Catch:{ orm -> 0x025c }
        r4 = java.lang.Float.valueOf(r4);	 Catch:{ orm -> 0x025c }
        r4 = r4.floatValue();	 Catch:{ orm -> 0x025c }
        r2.k = r4;	 Catch:{ orm -> 0x025c }
        goto L_0x02de;
    L_0x021a:
        r4 = new orm;	 Catch:{ orm -> 0x025c }
        r6 = java.lang.String.valueOf(r3);	 Catch:{ orm -> 0x025c }
        r6 = r6.length();	 Catch:{ orm -> 0x025c }
        r6 = r6 + 36;
        r7 = new java.lang.StringBuilder;	 Catch:{ orm -> 0x025c }
        r7.<init>(r6);	 Catch:{ orm -> 0x025c }
        r6 = "Invalid expression for fontSize: '";
        r7.append(r6);	 Catch:{ orm -> 0x025c }
        r7.append(r3);	 Catch:{ orm -> 0x025c }
        r7.append(r11);	 Catch:{ orm -> 0x025c }
        r6 = r7.toString();	 Catch:{ orm -> 0x025c }
        r4.<init>(r6);	 Catch:{ orm -> 0x025c }
        throw r4;	 Catch:{ orm -> 0x025c }
    L_0x023e:
        r4 = new orm;	 Catch:{ orm -> 0x025c }
        r7 = new java.lang.StringBuilder;	 Catch:{ orm -> 0x025c }
        r8 = 52;
        r7.<init>(r8);	 Catch:{ orm -> 0x025c }
        r8 = "Invalid number of entries for fontSize: ";
        r7.append(r8);	 Catch:{ orm -> 0x025c }
        r7.append(r6);	 Catch:{ orm -> 0x025c }
        r6 = ".";
        r7.append(r6);	 Catch:{ orm -> 0x025c }
        r6 = r7.toString();	 Catch:{ orm -> 0x025c }
        r4.<init>(r6);	 Catch:{ orm -> 0x025c }
        throw r4;	 Catch:{ orm -> 0x025c }
    L_0x025c:
        r3 = java.lang.String.valueOf(r3);
        r4 = "Failed parsing fontSize value: ";
        r6 = r3.length();
        if (r6 != 0) goto L_0x026e;
    L_0x0268:
        r3 = new java.lang.String;
        r3.<init>(r4);
        goto L_0x0272;
    L_0x026e:
        r3 = r4.concat(r3);
    L_0x0272:
        defpackage.oyp.a(r5, r3);
        goto L_0x02de;
    L_0x0276:
        r2 = defpackage.osv.a(r2);
        defpackage.oxz.b(r10);
        r2.a = r3;
        goto L_0x02de;
    L_0x0280:
        r2 = defpackage.osv.a(r2);
        r4 = defpackage.oyg.a(r3);	 Catch:{ IllegalArgumentException -> 0x028c }
        r2.a(r4);	 Catch:{ IllegalArgumentException -> 0x028c }
        goto L_0x02de;
    L_0x028c:
        r3 = java.lang.String.valueOf(r3);
        r4 = "Failed parsing color value: ";
        r6 = r3.length();
        if (r6 != 0) goto L_0x029e;
    L_0x0298:
        r3 = new java.lang.String;
        r3.<init>(r4);
        goto L_0x02a2;
    L_0x029e:
        r3 = r4.concat(r3);
    L_0x02a2:
        defpackage.oyp.a(r5, r3);
        goto L_0x02de;
    L_0x02a6:
        r2 = defpackage.osv.a(r2);
        r4 = defpackage.oyg.a(r3);	 Catch:{ IllegalArgumentException -> 0x02b2 }
        r2.b(r4);	 Catch:{ IllegalArgumentException -> 0x02b2 }
        goto L_0x02de;
    L_0x02b2:
        r3 = java.lang.String.valueOf(r3);
        r4 = "Failed parsing background value: ";
        r6 = r3.length();
        if (r6 != 0) goto L_0x02c4;
    L_0x02be:
        r3 = new java.lang.String;
        r3.<init>(r4);
        goto L_0x02c8;
    L_0x02c4:
        r3 = r4.concat(r3);
    L_0x02c8:
        defpackage.oyp.a(r5, r3);
        goto L_0x02de;
    L_0x02cc:
        r4 = r14.getName();
        r5 = "style";
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x02de;
    L_0x02d8:
        r2 = defpackage.osv.a(r2);
        r2.l = r3;
    L_0x02de:
        r15 = r15 + 1;
        goto L_0x0007;
    L_0x02e2:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osv.a(org.xmlpull.v1.XmlPullParser, otb):otb");
    }

    private static otb a(otb otb) {
        return otb == null ? new otb() : otb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    private static long a(java.lang.String r14, defpackage.osx r15) {
        /*
        r0 = a;
        r0 = r0.matcher(r14);
        r1 = r0.matches();
        r2 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r4 = 5;
        r5 = 4;
        r6 = 3;
        r7 = 2;
        r8 = 1;
        if (r1 == 0) goto L_0x0088;
    L_0x0016:
        r14 = r0.group(r8);
        r8 = java.lang.Long.parseLong(r14);
        r10 = 3600; // 0xe10 float:5.045E-42 double:1.7786E-320;
        r8 = r8 * r10;
        r8 = (double) r8;
        r14 = r0.group(r7);
        r10 = java.lang.Long.parseLong(r14);
        r12 = 60;
        r10 = r10 * r12;
        r10 = (double) r10;
        java.lang.Double.isNaN(r8);
        java.lang.Double.isNaN(r10);
        r8 = r8 + r10;
        r14 = r0.group(r6);
        r6 = java.lang.Long.parseLong(r14);
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r8 = r8 + r6;
        r14 = r0.group(r5);
        r5 = 0;
        if (r14 == 0) goto L_0x0051;
    L_0x004c:
        r10 = java.lang.Double.parseDouble(r14);
        goto L_0x0052;
    L_0x0051:
        r10 = r5;
    L_0x0052:
        r8 = r8 + r10;
        r14 = r0.group(r4);
        if (r14 == 0) goto L_0x0063;
    L_0x0059:
        r10 = java.lang.Long.parseLong(r14);
        r14 = (float) r10;
        r1 = r15.a;
        r14 = r14 / r1;
        r10 = (double) r14;
        goto L_0x0064;
    L_0x0063:
        r10 = r5;
    L_0x0064:
        r8 = r8 + r10;
        r14 = 6;
        r14 = r0.group(r14);
        if (r14 == 0) goto L_0x0083;
    L_0x006c:
        r0 = java.lang.Long.parseLong(r14);
        r0 = (double) r0;
        r14 = r15.b;
        r4 = (double) r14;
        java.lang.Double.isNaN(r0);
        java.lang.Double.isNaN(r4);
        r0 = r0 / r4;
        r14 = r15.a;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r5 = r0 / r14;
    L_0x0083:
        r8 = r8 + r5;
        r8 = r8 * r2;
        r14 = (long) r8;
        return r14;
    L_0x0088:
        r0 = b;
        r0 = r0.matcher(r14);
        r1 = r0.matches();
        if (r1 == 0) goto L_0x012a;
    L_0x0094:
        r14 = r0.group(r8);
        r9 = java.lang.Double.parseDouble(r14);
        r14 = r0.group(r7);
        r0 = r14.hashCode();
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r0 == r1) goto L_0x00ef;
    L_0x00a8:
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r0 == r1) goto L_0x00e5;
    L_0x00ac:
        r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r0 == r1) goto L_0x00db;
    L_0x00b0:
        r1 = 3494; // 0xda6 float:4.896E-42 double:1.7263E-320;
        if (r0 == r1) goto L_0x00d1;
    L_0x00b4:
        r1 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r0 == r1) goto L_0x00c7;
    L_0x00b8:
        r1 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r0 == r1) goto L_0x00bd;
    L_0x00bc:
        goto L_0x00f9;
    L_0x00bd:
        r0 = "t";
        r14 = r14.equals(r0);
        if (r14 == 0) goto L_0x00f9;
    L_0x00c5:
        r14 = 5;
        goto L_0x00fa;
    L_0x00c7:
        r0 = "s";
        r14 = r14.equals(r0);
        if (r14 == 0) goto L_0x00f9;
    L_0x00cf:
        r14 = 2;
        goto L_0x00fa;
    L_0x00d1:
        r0 = "ms";
        r14 = r14.equals(r0);
        if (r14 == 0) goto L_0x00f9;
    L_0x00d9:
        r14 = 3;
        goto L_0x00fa;
    L_0x00db:
        r0 = "m";
        r14 = r14.equals(r0);
        if (r14 == 0) goto L_0x00f9;
    L_0x00e3:
        r14 = 1;
        goto L_0x00fa;
    L_0x00e5:
        r0 = "h";
        r14 = r14.equals(r0);
        if (r14 == 0) goto L_0x00f9;
    L_0x00ed:
        r14 = 0;
        goto L_0x00fa;
    L_0x00ef:
        r0 = "f";
        r14 = r14.equals(r0);
        if (r14 == 0) goto L_0x00f9;
    L_0x00f7:
        r14 = 4;
        goto L_0x00fa;
    L_0x00f9:
        r14 = -1;
    L_0x00fa:
        if (r14 == 0) goto L_0x011f;
    L_0x00fc:
        if (r14 == r8) goto L_0x011c;
    L_0x00fe:
        if (r14 == r7) goto L_0x0126;
    L_0x0100:
        if (r14 == r6) goto L_0x0115;
    L_0x0102:
        if (r14 == r5) goto L_0x010e;
    L_0x0104:
        if (r14 == r4) goto L_0x0107;
    L_0x0106:
        goto L_0x0126;
    L_0x0107:
        r14 = r15.c;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        goto L_0x011a;
    L_0x010e:
        r14 = r15.a;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        goto L_0x011a;
    L_0x0115:
        r14 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
    L_0x011a:
        r9 = r9 / r14;
        goto L_0x0126;
    L_0x011c:
        r14 = 4633641066610819072; // 0x404e000000000000 float:0.0 double:60.0;
        goto L_0x0124;
    L_0x011f:
        r14 = 4660134898793709568; // 0x40ac200000000000 float:0.0 double:3600.0;
    L_0x0124:
        r9 = r9 * r14;
    L_0x0126:
        r9 = r9 * r2;
        r14 = (long) r9;
        return r14;
    L_0x012a:
        r15 = new orm;
        r14 = java.lang.String.valueOf(r14);
        r0 = "Malformed time expression: ";
        r1 = r14.length();
        if (r1 != 0) goto L_0x013e;
    L_0x0138:
        r14 = new java.lang.String;
        r14.<init>(r0);
        goto L_0x0142;
    L_0x013e:
        r14 = r0.concat(r14);
    L_0x0142:
        r15.<init>(r14);
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osv.a(java.lang.String, osx):long");
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ ork a(byte[] bArr, int i, boolean z) {
        return a(bArr, i);
    }
}
