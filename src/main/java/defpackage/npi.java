package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: npi */
public class npi extends DefaultHandler implements nwd {
    private static final Pattern a = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private final String b;
    private final XmlPullParserFactory c;

    public npi(String str) {
        this.b = str;
        try {
            this.c = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(XmlPullParser xmlPullParser) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x015a A:{Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0149 A:{Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0162 A:{LOOP_END, Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }, LOOP:0: B:21:0x006e->B:68:0x0162} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0162 A:{LOOP_END, Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }, LOOP:0: B:21:0x006e->B:68:0x0162} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0162 A:{LOOP_END, Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }, LOOP:0: B:21:0x006e->B:68:0x0162} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012b A:{SYNTHETIC} */
    /* renamed from: a */
    public defpackage.npf b(java.lang.String r29, java.io.InputStream r30) {
        /*
        r28 = this;
        r1 = r28;
        r0 = "MPD";
        r2 = r1.c;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r2 = r2.newPullParser();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r3 = 0;
        r4 = r30;
        r2.setInput(r4, r3);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r4 = r2.next();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r5 = 2;
        if (r4 != r5) goto L_0x0168;
    L_0x0017:
        r4 = r2.getName();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r4 = r0.equals(r4);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        if (r4 == 0) goto L_0x0168;
    L_0x0021:
        r4 = "availabilityStartTime";
        r6 = defpackage.npi.a(r2, r4);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r4 = "mediaPresentationDuration";
        r8 = -1;
        r4 = defpackage.npi.c(r2, r4, r8);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r10 = "minBufferTime";
        defpackage.npi.c(r2, r10, r8);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r10 = "type";
        r10 = r2.getAttributeValue(r3, r10);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r11 = 0;
        if (r10 == 0) goto L_0x0044;
    L_0x003d:
        r12 = "dynamic";
        r10 = r10.equals(r12);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        goto L_0x0045;
    L_0x0044:
        r10 = 0;
    L_0x0045:
        if (r10 == 0) goto L_0x004e;
    L_0x0047:
        r12 = "minimumUpdatePeriod";
        r12 = defpackage.npi.c(r2, r12, r8);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        goto L_0x004f;
    L_0x004e:
        r12 = r8;
    L_0x004f:
        if (r10 == 0) goto L_0x0058;
    L_0x0051:
        r14 = "timeShiftBufferDepth";
        r14 = defpackage.npi.c(r2, r14, r8);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        goto L_0x0059;
    L_0x0058:
        r14 = r8;
    L_0x0059:
        r3 = new java.util.ArrayList;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r3.<init>();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        if (r10 != 0) goto L_0x0063;
    L_0x0060:
        r17 = 0;
        goto L_0x0065;
    L_0x0063:
        r17 = r8;
    L_0x0065:
        r8 = r29;
        r19 = r14;
        r14 = r17;
        r9 = 0;
        r21 = 0;
    L_0x006e:
        r2.next();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r22 = r12;
        r12 = "BaseURL";
        r12 = defpackage.nxc.b(r2, r12);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        if (r12 != 0) goto L_0x0113;
    L_0x007b:
        r12 = "UTCTiming";
        r12 = defpackage.nxc.b(r2, r12);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        if (r12 != 0) goto L_0x00fc;
    L_0x0083:
        r12 = "Location";
        r12 = defpackage.nxc.b(r2, r12);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        if (r12 != 0) goto L_0x00ee;
    L_0x008b:
        r12 = "Period";
        r12 = defpackage.nxc.b(r2, r12);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        if (r12 == 0) goto L_0x00e8;
    L_0x0093:
        if (r9 != 0) goto L_0x00e8;
    L_0x0095:
        r12 = r1.a(r2, r8, r14);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r13 = r12.first;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r13 = (defpackage.npk) r13;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r24 = r14;
        r14 = r13.a;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r17 = -1;
        r26 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1));
        if (r26 == 0) goto L_0x00c2;
    L_0x00a7:
        r12 = r12.second;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r12 = (java.lang.Long) r12;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r14 = r12.longValue();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r12 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1));
        if (r12 == 0) goto L_0x00b9;
    L_0x00b3:
        r26 = r6;
        r6 = r13.a;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r6 = r6 + r14;
        goto L_0x00bd;
    L_0x00b9:
        r26 = r6;
        r6 = -1;
    L_0x00bd:
        r3.add(r13);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r14 = r6;
        goto L_0x00fa;
    L_0x00c2:
        r26 = r6;
        if (r10 == 0) goto L_0x00cb;
    L_0x00c6:
        r14 = r24;
        r7 = 0;
        r9 = 1;
        goto L_0x0125;
    L_0x00cb:
        r0 = new nnc;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r2 = r3.size();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r3 = new java.lang.StringBuilder;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r4 = 47;
        r3.<init>(r4);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r4 = "Unable to determine start of period ";
        r3.append(r4);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r3.append(r2);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r2 = r3.toString();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r0.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
    L_0x00e8:
        r26 = r6;
        r24 = r14;
        r7 = 0;
        goto L_0x011a;
    L_0x00ee:
        r26 = r6;
        r24 = r14;
        r6 = r2.nextText();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r21 = r6;
        r14 = r24;
    L_0x00fa:
        r7 = 0;
        goto L_0x0125;
    L_0x00fc:
        r26 = r6;
        r24 = r14;
        r6 = "schemeIdUri";
        r7 = 0;
        r6 = r2.getAttributeValue(r7, r6);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r12 = "value";
        r12 = r2.getAttributeValue(r7, r12);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r13 = new npw;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r13.<init>(r6, r12);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        goto L_0x011a;
    L_0x0113:
        r26 = r6;
        r24 = r14;
        r7 = 0;
        if (r11 == 0) goto L_0x011d;
    L_0x011a:
        r14 = r24;
        goto L_0x0125;
    L_0x011d:
        r6 = defpackage.npi.c(r2, r8);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r8 = r6;
        r14 = r24;
        r11 = 1;
    L_0x0125:
        r6 = defpackage.nxc.a(r2, r0);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        if (r6 == 0) goto L_0x0162;
    L_0x012b:
        r12 = -1;
        r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1));
        if (r0 != 0) goto L_0x0142;
    L_0x0131:
        r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r0 == 0) goto L_0x0137;
    L_0x0135:
        r8 = r14;
        goto L_0x0143;
    L_0x0137:
        if (r10 == 0) goto L_0x013a;
    L_0x0139:
        goto L_0x0142;
    L_0x013a:
        r0 = new nnc;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r2 = "Unable to determine duration of static manifest.";
        r0.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
    L_0x0142:
        r8 = r4;
    L_0x0143:
        r0 = r3.isEmpty();	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        if (r0 != 0) goto L_0x015a;
    L_0x0149:
        r0 = new npf;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r5 = r0;
        r6 = r26;
        r11 = r22;
        r13 = r19;
        r15 = r21;
        r16 = r3;
        r5.<init>(r6, r8, r10, r11, r13, r15, r16);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        return r0;
    L_0x015a:
        r0 = new nnc;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r2 = "No periods found.";
        r0.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
    L_0x0162:
        r12 = r22;
        r6 = r26;
        goto L_0x006e;
    L_0x0168:
        r0 = new nnc;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        r2 = "inputStream does not contain a valid media presentation description";
        r0.<init>(r2);	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
        throw r0;	 Catch:{ XmlPullParserException -> 0x0177, ParseException -> 0x0170 }
    L_0x0170:
        r0 = move-exception;
        r2 = new nnc;
        r2.<init>(r0);
        throw r2;
    L_0x0177:
        r0 = move-exception;
        r2 = new nnc;
        r2.<init>(r0);
        goto L_0x017f;
    L_0x017e:
        throw r2;
    L_0x017f:
        goto L_0x017e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npi.b(java.lang.String, java.io.InputStream):npf");
    }

    /* Access modifiers changed, original: protected */
    public Pair a(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        j = npi.c(xmlPullParser, "start", j);
        long c = npi.c(xmlPullParser, "duration", -1);
        List arrayList = new ArrayList();
        Object obj = null;
        npn npn = null;
        while (true) {
            xmlPullParser.next();
            if (nxc.b(xmlPullParser, "BaseURL")) {
                if (obj == null) {
                    str = npi.c(xmlPullParser, str);
                    obj = 1;
                }
            } else if (nxc.b(xmlPullParser, "AdaptationSet")) {
                arrayList.add(a(xmlPullParser, str, npn));
            } else if (nxc.b(xmlPullParser, "SegmentBase")) {
                npn = a(xmlPullParser, null);
            } else if (nxc.b(xmlPullParser, "SegmentList")) {
                npn = a(xmlPullParser, null);
            } else if (nxc.b(xmlPullParser, "SegmentTemplate")) {
                npn = a(xmlPullParser, null);
            }
            if (nxc.a(xmlPullParser, "Period")) {
                return Pair.create(a(attributeValue, j, arrayList), Long.valueOf(c));
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public npk a(String str, long j, List list) {
        return new npk(j, list);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02fb A:{LOOP_END, LOOP:1: B:39:0x0199->B:102:0x02fb} */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0220 A:{SYNTHETIC, EDGE_INSN: B:117:0x0220->B:67:0x0220 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0376 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0356 A:{LOOP_END, LOOP:0: B:1:0x005d->B:109:0x0356} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0356 A:{LOOP_END, LOOP:0: B:1:0x005d->B:109:0x0356} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0376 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0376 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0356 A:{LOOP_END, LOOP:0: B:1:0x005d->B:109:0x0356} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0356 A:{LOOP_END, LOOP:0: B:1:0x005d->B:109:0x0356} */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0376 A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:96:0x02df, code skipped:
            if ("wvtt".equals(r0) == false) goto L_0x02e4;
     */
    public defpackage.npe a(org.xmlpull.v1.XmlPullParser r59, java.lang.String r60, defpackage.npn r61) {
        /*
        r58 = this;
        r11 = r58;
        r12 = r59;
        r13 = "id";
        r14 = -1;
        r15 = defpackage.npi.a(r12, r13, r14);
        r0 = defpackage.npi.d(r59);
        r10 = "mimeType";
        r9 = 0;
        r8 = r12.getAttributeValue(r9, r10);
        r7 = "codecs";
        r6 = r12.getAttributeValue(r9, r7);
        r5 = "width";
        r4 = defpackage.npi.a(r12, r5, r14);
        r3 = "height";
        r2 = defpackage.npi.a(r12, r3, r14);
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r1 = defpackage.npi.a(r12, r1);
        r9 = "audioSamplingRate";
        r17 = r15;
        r15 = defpackage.npi.a(r12, r9, r14);
        r14 = "lang";
        r18 = r0;
        r0 = 0;
        r19 = r12.getAttributeValue(r0, r14);
        r0 = new nph;
        r0.<init>();
        r20 = r9;
        r9 = new java.util.ArrayList;
        r9.<init>();
        r21 = 0;
        r22 = r60;
        r24 = r61;
        r25 = r15;
        r15 = r19;
        r23 = -1;
        r19 = r9;
        r9 = r18;
        r18 = 0;
    L_0x005d:
        r59.next();
        r26 = r1;
        r1 = "BaseURL";
        r27 = defpackage.nxc.b(r12, r1);
        r60 = r1;
        if (r27 != 0) goto L_0x031b;
    L_0x006c:
        r1 = "ContentProtection";
        r27 = defpackage.nxc.b(r12, r1);
        if (r27 == 0) goto L_0x009e;
    L_0x0074:
        r1 = r58.a(r59);
        if (r1 == 0) goto L_0x007d;
    L_0x007a:
        r0.a(r1);
    L_0x007d:
        r33 = r2;
        r39 = r3;
        r51 = r4;
        r52 = r5;
        r53 = r6;
        r54 = r7;
        r55 = r8;
        r34 = r13;
        r2 = r19;
        r28 = r20;
        r36 = r25;
        r27 = r26;
        r12 = 0;
        r13 = r0;
        r20 = r10;
        r19 = r14;
    L_0x009b:
        r14 = r9;
        goto L_0x033d;
    L_0x009e:
        r27 = r0;
        r0 = "ContentComponent";
        r0 = defpackage.nxc.b(r12, r0);
        if (r0 == 0) goto L_0x00c5;
    L_0x00a8:
        r0 = 0;
        r1 = r12.getAttributeValue(r0, r14);
        if (r15 != 0) goto L_0x00b1;
    L_0x00af:
        r15 = r1;
        goto L_0x00bb;
    L_0x00b1:
        if (r1 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00bb;
    L_0x00b4:
        r0 = r15.equals(r1);
        defpackage.nwf.b(r0);
    L_0x00bb:
        r0 = defpackage.npi.d(r59);
        r0 = defpackage.npi.a(r9, r0);
        r9 = r0;
        goto L_0x00db;
    L_0x00c5:
        r0 = "Representation";
        r28 = defpackage.nxc.b(r12, r0);
        if (r28 != 0) goto L_0x015c;
    L_0x00cd:
        r0 = "AudioChannelConfiguration";
        r0 = defpackage.nxc.b(r12, r0);
        if (r0 == 0) goto L_0x00fd;
    L_0x00d5:
        r0 = defpackage.npi.f(r59);
        r23 = r0;
    L_0x00db:
        r33 = r2;
        r39 = r3;
        r51 = r4;
        r52 = r5;
        r53 = r6;
        r54 = r7;
        r55 = r8;
        r0 = r12;
        r34 = r13;
        r2 = r19;
        r28 = r20;
        r36 = r25;
        r13 = r27;
        r12 = 0;
        r20 = r10;
        r19 = r14;
        r27 = r26;
        goto L_0x034e;
    L_0x00fd:
        r0 = "SegmentBase";
        r0 = defpackage.nxc.b(r12, r0);
        if (r0 == 0) goto L_0x0110;
    L_0x0105:
        r0 = r24;
        r0 = (defpackage.npu) r0;
        r0 = r11.a(r12, r0);
    L_0x010d:
        r24 = r0;
        goto L_0x00db;
    L_0x0110:
        r0 = "SegmentList";
        r0 = defpackage.nxc.b(r12, r0);
        if (r0 == 0) goto L_0x0121;
    L_0x0118:
        r0 = r24;
        r0 = (defpackage.npp) r0;
        r0 = r11.a(r12, r0);
        goto L_0x010d;
    L_0x0121:
        r0 = "SegmentTemplate";
        r0 = defpackage.nxc.b(r12, r0);
        if (r0 == 0) goto L_0x0132;
    L_0x0129:
        r0 = r24;
        r0 = (defpackage.nps) r0;
        r0 = r11.a(r12, r0);
        goto L_0x010d;
    L_0x0132:
        r0 = defpackage.nxc.a(r59);
        if (r0 == 0) goto L_0x013b;
    L_0x0138:
        r58.b(r59);
    L_0x013b:
        r33 = r2;
        r39 = r3;
        r51 = r4;
        r52 = r5;
        r53 = r6;
        r54 = r7;
        r55 = r8;
        r34 = r13;
        r2 = r19;
        r28 = r20;
        r36 = r25;
        r13 = r27;
        r12 = 0;
        r20 = r10;
        r19 = r14;
        r27 = r26;
        goto L_0x009b;
    L_0x015c:
        r28 = r9;
        r9 = 0;
        r16 = r12.getAttributeValue(r9, r13);
        r9 = "bandwidth";
        r9 = defpackage.npi.d(r12, r9);
        r29 = defpackage.npi.a(r12, r10, r8);
        r30 = defpackage.npi.a(r12, r7, r6);
        r31 = defpackage.npi.a(r12, r5, r4);
        r32 = defpackage.npi.a(r12, r3, r2);
        r33 = r2;
        r2 = r26;
        r26 = defpackage.npi.a(r12, r2);
        r34 = r13;
        r13 = r25;
        r57 = r20;
        r20 = r10;
        r10 = r57;
        r25 = defpackage.npi.a(r12, r10, r13);
        r36 = r2;
        r2 = r22;
        r38 = r23;
        r37 = r24;
        r35 = 0;
    L_0x0199:
        r59.next();
        r39 = r3;
        r3 = r60;
        r40 = defpackage.nxc.b(r12, r3);
        if (r40 != 0) goto L_0x0209;
    L_0x01a6:
        r60 = r3;
        r3 = "AudioChannelConfiguration";
        r3 = defpackage.nxc.b(r12, r3);
        if (r3 == 0) goto L_0x01bb;
    L_0x01b0:
        r3 = defpackage.npi.f(r59);
        r40 = r1;
        r38 = r3;
    L_0x01b8:
        r1 = r27;
        goto L_0x0211;
    L_0x01bb:
        r3 = "SegmentBase";
        r3 = defpackage.nxc.b(r12, r3);
        if (r3 == 0) goto L_0x01d0;
    L_0x01c3:
        r3 = r37;
        r3 = (defpackage.npu) r3;
        r3 = r11.a(r12, r3);
    L_0x01cb:
        r40 = r1;
        r37 = r3;
        goto L_0x01b8;
    L_0x01d0:
        r3 = "SegmentList";
        r3 = defpackage.nxc.b(r12, r3);
        if (r3 == 0) goto L_0x01e1;
    L_0x01d8:
        r3 = r37;
        r3 = (defpackage.npp) r3;
        r3 = r11.a(r12, r3);
        goto L_0x01cb;
    L_0x01e1:
        r3 = "SegmentTemplate";
        r3 = defpackage.nxc.b(r12, r3);
        if (r3 == 0) goto L_0x01f2;
    L_0x01e9:
        r3 = r37;
        r3 = (defpackage.nps) r3;
        r3 = r11.a(r12, r3);
        goto L_0x01cb;
    L_0x01f2:
        r3 = defpackage.nxc.b(r12, r1);
        if (r3 == 0) goto L_0x0206;
    L_0x01f8:
        r3 = r58.a(r59);
        if (r3 == 0) goto L_0x0206;
    L_0x01fe:
        r40 = r1;
        r1 = r27;
        r1.a(r3);
        goto L_0x0211;
    L_0x0206:
        r40 = r1;
        goto L_0x01b8;
    L_0x0209:
        r40 = r1;
        r60 = r3;
        r1 = r27;
        if (r35 == 0) goto L_0x0213;
    L_0x0211:
        r3 = r2;
        goto L_0x021a;
    L_0x0213:
        r2 = defpackage.npi.c(r12, r2);
        r3 = r2;
        r35 = 1;
    L_0x021a:
        r2 = defpackage.nxc.a(r12, r0);
        if (r2 == 0) goto L_0x02fb;
    L_0x0220:
        r2 = r1;
        r0 = r58;
        r27 = r36;
        r36 = r13;
        r13 = 1;
        r1 = r16;
        r13 = r2;
        r2 = r29;
        r50 = r3;
        r3 = r31;
        r51 = r4;
        r4 = r32;
        r52 = r5;
        r5 = r26;
        r53 = r6;
        r6 = r38;
        r54 = r7;
        r7 = r25;
        r55 = r8;
        r8 = r9;
        r12 = 0;
        r57 = r28;
        r28 = r10;
        r10 = r19;
        r19 = r14;
        r14 = r57;
        r9 = r15;
        r56 = r10;
        r10 = r30;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r1 = r11.b;
        if (r37 != 0) goto L_0x0261;
    L_0x025c:
        r37 = new npu;
        r37.<init>();
    L_0x0261:
        r2 = r37;
        r3 = r2 instanceof defpackage.npu;
        if (r3 == 0) goto L_0x027d;
    L_0x0267:
        r3 = new npo;
        r43 = -1;
        r46 = r2;
        r46 = (defpackage.npu) r46;
        r47 = 0;
        r48 = -1;
        r41 = r3;
        r42 = r1;
        r45 = r0;
        r41.<init>(r42, r43, r45, r46, r47, r48, r50);
        goto L_0x028a;
    L_0x027d:
        r3 = r2 instanceof defpackage.npq;
        if (r3 == 0) goto L_0x02f3;
    L_0x0281:
        r3 = new npl;
        r2 = (defpackage.npq) r2;
        r4 = r50;
        r3.<init>(r1, r0, r2, r4);
    L_0x028a:
        r0 = r13.c;
        if (r0 != 0) goto L_0x0294;
    L_0x028e:
        r13.b = r12;
        r1 = 1;
        r13.c = r1;
        goto L_0x0298;
    L_0x0294:
        r1 = 1;
        defpackage.nwf.b(r1);
    L_0x0298:
        r0 = r3.b;
        r0 = r0.b;
        r2 = android.text.TextUtils.isEmpty(r0);
        r4 = 2;
        if (r2 != 0) goto L_0x02e4;
    L_0x02a3:
        r2 = defpackage.nwt.b(r0);
        if (r2 != 0) goto L_0x02e2;
    L_0x02a9:
        r2 = defpackage.nwt.a(r0);
        if (r2 == 0) goto L_0x02b1;
    L_0x02af:
        r4 = 1;
        goto L_0x02e5;
    L_0x02b1:
        r1 = defpackage.nwt.c(r0);
        r2 = "text";
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x02e5;
    L_0x02bd:
        r1 = "application/ttml+xml";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x02e5;
    L_0x02c5:
        r1 = "application/mp4";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02e4;
    L_0x02cd:
        r0 = r3.b;
        r0 = r0.i;
        r1 = "stpp";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x02e5;
    L_0x02d9:
        r1 = "wvtt";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x02e4;
    L_0x02e1:
        goto L_0x02e5;
    L_0x02e2:
        r4 = 0;
        goto L_0x02e5;
    L_0x02e4:
        r4 = -1;
    L_0x02e5:
        r0 = defpackage.npi.a(r14, r4);
        r2 = r56;
        r2.add(r3);
        r9 = r0;
        r0 = r59;
        goto L_0x034e;
    L_0x02f3:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase";
        r0.<init>(r1);
        throw r0;
    L_0x02fb:
        r51 = r4;
        r2 = r19;
        r27 = r36;
        r4 = r3;
        r36 = r13;
        r19 = r14;
        r14 = r28;
        r12 = r59;
        r14 = r19;
        r3 = r39;
        r19 = r2;
        r2 = r4;
        r36 = r27;
        r4 = r51;
        r27 = r1;
        r1 = r40;
        goto L_0x0199;
    L_0x031b:
        r33 = r2;
        r39 = r3;
        r51 = r4;
        r52 = r5;
        r53 = r6;
        r54 = r7;
        r55 = r8;
        r34 = r13;
        r2 = r19;
        r28 = r20;
        r36 = r25;
        r27 = r26;
        r1 = 1;
        r12 = 0;
        r13 = r0;
        r20 = r10;
        r19 = r14;
        r14 = r9;
        if (r18 == 0) goto L_0x0341;
    L_0x033d:
        r0 = r59;
        r9 = r14;
        goto L_0x034e;
    L_0x0341:
        r0 = r59;
        r3 = r22;
        r3 = defpackage.npi.c(r0, r3);
        r22 = r3;
        r9 = r14;
        r18 = 1;
    L_0x034e:
        r1 = "AdaptationSet";
        r1 = defpackage.nxc.a(r0, r1);
        if (r1 != 0) goto L_0x0376;
    L_0x0356:
        r12 = r0;
        r0 = r13;
        r14 = r19;
        r10 = r20;
        r1 = r27;
        r20 = r28;
        r13 = r34;
        r25 = r36;
        r3 = r39;
        r4 = r51;
        r5 = r52;
        r6 = r53;
        r7 = r54;
        r8 = r55;
        r19 = r2;
        r2 = r33;
        goto L_0x005d;
    L_0x0376:
        r0 = r13.a;
        if (r0 != 0) goto L_0x037b;
    L_0x037a:
        goto L_0x037c;
    L_0x037b:
        r12 = r0;
    L_0x037c:
        r0 = r17;
        r0 = r11.a(r0, r9, r2, r12);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npi.a(org.xmlpull.v1.XmlPullParser, java.lang.String, npn):npe");
    }

    /* Access modifiers changed, original: protected */
    public npe a(int i, int i2, List list, List list2) {
        return new npe(i2, list, list2);
    }

    private static int d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        int i = -1;
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                i = 1;
            } else if ("video".equals(attributeValue)) {
                i = 0;
            } else if ("text".equals(attributeValue)) {
                return 2;
            }
        }
        return i;
    }

    /* Access modifiers changed, original: protected */
    public npd a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        npx npx = null;
        UUID uuid = npx;
        Object obj = null;
        do {
            xmlPullParser.next();
            if (nxc.b(xmlPullParser, "cenc:pssh") && xmlPullParser.next() == 4) {
                npx = new npx("video/mp4", Base64.decode(xmlPullParser.getText(), 0));
                uuid = nsv.a(npx.b);
                obj = 1;
            }
        } while (!nxc.a(xmlPullParser, "ContentProtection"));
        if (obj == null || uuid != null) {
            return new npd(attributeValue, uuid, npx);
        }
        Log.w("MPDParser", "Skipped unsupported ContentProtection element");
        return null;
    }

    /* Access modifiers changed, original: protected */
    public nom a(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4) {
        return new nom(str, str2, i, i2, f, i3, i4, i5, str3, str4);
    }

    private final npu a(XmlPullParser xmlPullParser, npu npu) {
        long parseLong;
        long j;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        npu npu2 = npu;
        long b = npi.b(xmlPullParser2, "timescale", npu2 != null ? npu2.b : 1);
        long j2 = 0;
        long b2 = npi.b(xmlPullParser2, "presentationTimeOffset", npu2 != null ? npu2.c : 0);
        if (npu2 != null) {
            j2 = npu2.d;
        }
        long j3 = npu2 != null ? npu2.e : -1;
        String str = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong2 = Long.parseLong(split[0]);
            parseLong = (Long.parseLong(split[1]) - parseLong2) + 1;
            j = parseLong2;
        } else {
            j = j2;
            parseLong = j3;
        }
        if (npu2 != null) {
            str = npu2.a;
        }
        while (true) {
            xmlPullParser.next();
            if (nxc.b(xmlPullParser2, "Initialization")) {
                str = npi.e(xmlPullParser);
            }
            if (nxc.a(xmlPullParser2, "SegmentBase")) {
                return new npu(str, b, b2, j, parseLong);
            }
        }
    }

    private final npp a(XmlPullParser xmlPullParser, npp npp) {
        List list;
        List list2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        npp npp2 = npp;
        long b = npi.b(xmlPullParser2, "timescale", npp2 != null ? npp2.b : 1);
        long b2 = npi.b(xmlPullParser2, "presentationTimeOffset", npp2 != null ? npp2.c : 0);
        long b3 = npi.b(xmlPullParser2, "duration", npp2 != null ? npp2.f : -1);
        int a = npi.a(xmlPullParser2, "startNumber", npp2 != null ? npp2.e : 1);
        List list3 = null;
        List list4 = null;
        npj npj = list4;
        do {
            xmlPullParser.next();
            if (nxc.b(xmlPullParser2, "Initialization")) {
                npj = npi.e(xmlPullParser);
            } else if (nxc.b(xmlPullParser2, "SegmentTimeline")) {
                list3 = c(xmlPullParser);
            } else if (nxc.b(xmlPullParser2, "SegmentURL")) {
                if (list4 == null) {
                    list4 = new ArrayList();
                }
                list4.add(npi.b(xmlPullParser2, "media", "mediaRange"));
            }
        } while (!nxc.a(xmlPullParser2, "SegmentList"));
        if (npp2 != null) {
            if (npj == null) {
                npj = npp2.a;
            }
            if (list3 == null) {
                list3 = npp2.g;
            }
            if (list4 == null) {
                list = npp2.d;
                list2 = list3;
                return new npp(npj, b, b2, a, b3, list2, list);
            }
        }
        list2 = list3;
        list = list4;
        return new npp(npj, b, b2, a, b3, list2, list);
    }

    /* Access modifiers changed, original: protected */
    public nps a(XmlPullParser xmlPullParser, nps nps) {
        List list;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        nps nps2 = nps;
        long b = npi.b(xmlPullParser2, "timescale", nps2 != null ? nps2.b : 1);
        long b2 = npi.b(xmlPullParser2, "presentationTimeOffset", nps2 != null ? nps2.c : 0);
        long b3 = npi.b(xmlPullParser2, "duration", nps2 != null ? nps2.f : -1);
        int a = npi.a(xmlPullParser2, "startNumber", nps2 != null ? nps2.e : 1);
        List list2 = null;
        npt a2 = npi.a(xmlPullParser2, "media", nps2 != null ? nps2.h : null);
        npt a3 = npi.a(xmlPullParser2, "initialization", nps2 != null ? nps2.d : null);
        npj npj = null;
        do {
            xmlPullParser.next();
            if (nxc.b(xmlPullParser2, "Initialization")) {
                npj = npi.e(xmlPullParser);
            } else if (nxc.b(xmlPullParser2, "SegmentTimeline")) {
                list2 = c(xmlPullParser);
            }
        } while (!nxc.a(xmlPullParser2, "SegmentTemplate"));
        if (nps2 != null) {
            if (npj == null) {
                npj = nps2.a;
            }
            if (list2 == null) {
                list = nps2.g;
                return new nps(npj, b, b2, a, b3, list, a3, a2);
            }
        }
        list = list2;
        return new nps(npj, b, b2, a, b3, list, a3, a2);
    }

    /* Access modifiers changed, original: protected */
    public List c(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        while (true) {
            xmlPullParser.next();
            if (nxc.b(xmlPullParser, "S")) {
                j = npi.b(xmlPullParser, "t", j);
                long b = npi.b(xmlPullParser, "d");
                int i = 0;
                int a = npi.a(xmlPullParser, "r", 0) + 1;
                while (i < a) {
                    arrayList.add(npi.a(j, b));
                    j += b;
                    i++;
                }
            }
            if (nxc.a(xmlPullParser, "SegmentTimeline")) {
                return arrayList;
            }
        }
    }

    protected static npr a(long j, long j2) {
        return new npr(j, j2);
    }

    private static npt a(XmlPullParser xmlPullParser, String str, npt npt) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return npt;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        String str2 = "";
        strArr[0] = str2;
        int i = 0;
        int i2 = 0;
        while (i < attributeValue.length()) {
            String str3 = "$";
            int indexOf = attributeValue.indexOf(str3, i);
            String valueOf;
            if (indexOf == -1) {
                str3 = String.valueOf(strArr[i2]);
                valueOf = String.valueOf(attributeValue.substring(i));
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    valueOf = str3.concat(valueOf);
                }
                strArr[i2] = valueOf;
                i = attributeValue.length();
            } else if (indexOf != i) {
                str3 = String.valueOf(strArr[i2]);
                valueOf = String.valueOf(attributeValue.substring(i, indexOf));
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    valueOf = str3.concat(valueOf);
                }
                strArr[i2] = valueOf;
                i = indexOf;
            } else if (attributeValue.startsWith("$$", i)) {
                strArr[i2] = String.valueOf(strArr[i2]).concat(str3);
                i += 2;
            } else {
                i++;
                int indexOf2 = attributeValue.indexOf(str3, i);
                valueOf = attributeValue.substring(i, indexOf2);
                if (valueOf.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    String substring;
                    indexOf = valueOf.indexOf("%0");
                    if (indexOf != -1) {
                        substring = valueOf.substring(indexOf);
                        String str4 = "d";
                        if (!substring.endsWith(str4)) {
                            substring = substring.concat(str4);
                        }
                        valueOf = valueOf.substring(0, indexOf);
                    } else {
                        substring = "%01d";
                    }
                    if (valueOf.equals("Number")) {
                        iArr[i2] = 2;
                    } else if (valueOf.equals("Bandwidth")) {
                        iArr[i2] = 3;
                    } else if (valueOf.equals("Time")) {
                        iArr[i2] = 4;
                    } else {
                        String str5 = "Invalid template: ";
                        throw new IllegalArgumentException(attributeValue.length() == 0 ? new String(str5) : str5.concat(attributeValue));
                    }
                    strArr2[i2] = substring;
                }
                i2++;
                strArr[i2] = str2;
                i = indexOf2 + 1;
            }
        }
        return new npt(strArr, iArr, strArr2, i2);
    }

    private static npj e(XmlPullParser xmlPullParser) {
        return npi.b(xmlPullParser, "sourceURL", "range");
    }

    private static npj b(XmlPullParser xmlPullParser, String str, String str2) {
        long parseLong;
        long parseLong2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            parseLong = Long.parseLong(split[0]);
            if (split.length == 2) {
                parseLong2 = (Long.parseLong(split[1]) - parseLong) + 1;
                return new npj(attributeValue, parseLong, parseLong2);
            }
        }
        parseLong = 0;
        parseLong2 = -1;
        return new npj(attributeValue, parseLong, parseLong2);
    }

    private static int f(XmlPullParser xmlPullParser) {
        int d = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(npi.a(xmlPullParser, "schemeIdUri", null)) ? npi.d(xmlPullParser, "value") : -1;
        while (true) {
            xmlPullParser.next();
            if (nxc.a(xmlPullParser, "AudioChannelConfiguration")) {
                return d;
            }
        }
    }

    private static int a(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 != -1) {
            nwf.b(i == i2);
        }
        return i;
    }

    private static float a(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        attributeValue = matcher.group(2);
        return !TextUtils.isEmpty(attributeValue) ? ((float) parseInt) / ((float) Integer.parseInt(attributeValue)) : (float) parseInt;
    }

    private static long c(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? nxf.b(attributeValue) : j;
    }

    protected static long a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        Matcher matcher = nxf.e.matcher(attributeValue);
        int i = 0;
        if (matcher.matches()) {
            if (!(matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z"))) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if (matcher.group(11).equals("-")) {
                    i = -i;
                }
            }
            Calendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                str = String.valueOf(matcher.group(8));
                String str2 = "0.";
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str = str2.concat(str);
                }
                gregorianCalendar.set(14, new BigDecimal(str).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i != 0) {
                timeInMillis -= (long) (i * 60000);
            }
            return timeInMillis;
        }
        String str3 = "Invalid date/time format: ";
        throw new ParseException(attributeValue.length() == 0 ? new String(str3) : str3.concat(attributeValue), 0);
    }

    private static String c(XmlPullParser xmlPullParser, String str) {
        xmlPullParser.next();
        return nxg.a(str, xmlPullParser.getText());
    }

    private static int d(XmlPullParser xmlPullParser, String str) {
        return npi.a(xmlPullParser, str, -1);
    }

    protected static int a(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? Integer.parseInt(attributeValue) : i;
    }

    protected static long b(XmlPullParser xmlPullParser, String str) {
        return npi.b(xmlPullParser, str, -1);
    }

    protected static long b(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? Long.parseLong(attributeValue) : j;
    }

    protected static String a(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }
}
