package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: bjm */
public final class bjm {
    public static final Map a = new HashMap();

    public static bki a(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("url_");
        stringBuilder.append(str);
        return bjm.a(stringBuilder.toString(), new bjl(context, str));
    }

    public static bki b(Context context, String str) {
        return bjm.a(str, new bjq(context.getApplicationContext(), str));
    }

    public static bkf c(Context context, String str) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("asset_");
            stringBuilder.append(str);
            String stringBuilder2 = stringBuilder.toString();
            if (str.endsWith(".zip")) {
                return bjm.a(new ZipInputStream(context.getAssets().open(str)), stringBuilder2);
            }
            return bjm.a(context.getAssets().open(str), stringBuilder2);
        } catch (IOException e) {
            return new bkf(e);
        }
    }

    public static bki a(Context context, int i) {
        return bjm.a(bjm.a(i), new bjp(context.getApplicationContext(), i));
    }

    public static bkf b(Context context, int i) {
        try {
            return bjm.a(context.getResources().openRawResource(i), bjm.a(i));
        } catch (NotFoundException e) {
            return new bkf(e);
        }
    }

    private static String a(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rawRes_");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public static bkf a(InputStream inputStream, String str) {
        try {
            bkf a = bjm.a(new JsonReader(new InputStreamReader(inputStream)), str);
            return a;
        } finally {
            bpg.a((Closeable) inputStream);
        }
    }

    public static bki a(JsonReader jsonReader) {
        return bjm.a(null, new bjs(jsonReader));
    }

    public static bkf a(JsonReader jsonReader, String str) {
        return bjm.a(jsonReader, str, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:258:0x03d9 A:{Catch:{ Exception -> 0x0570, all -> 0x056e }} */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03d9 A:{Catch:{ Exception -> 0x0570, all -> 0x056e }} */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03d9 A:{Catch:{ Exception -> 0x0570, all -> 0x056e }} */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03d9 A:{Catch:{ Exception -> 0x0570, all -> 0x056e }} */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03d9 A:{Catch:{ Exception -> 0x0570, all -> 0x056e }} */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03d9 A:{Catch:{ Exception -> 0x0570, all -> 0x056e }} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0138 A:{Catch:{ Exception -> 0x0570, all -> 0x056e }} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0138 A:{Catch:{ Exception -> 0x0570, all -> 0x056e }} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0138 A:{Catch:{ Exception -> 0x0570, all -> 0x056e }} */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARNING: Missing block: B:86:0x0158, code skipped:
            r28 = r0;
            r26 = r6;
            r25 = r7;
     */
    /* JADX WARNING: Missing block: B:196:0x0306, code skipped:
            r27 = r8;
            r29 = r10;
            r10 = r9;
     */
    /* JADX WARNING: Missing block: B:284:0x0503, code skipped:
            r15 = r18;
     */
    /* JADX WARNING: Missing block: B:285:0x0505, code skipped:
            r14 = r19;
     */
    /* JADX WARNING: Missing block: B:286:0x0507, code skipped:
            r13 = r20;
     */
    /* JADX WARNING: Missing block: B:287:0x0509, code skipped:
            r12 = r21;
     */
    /* JADX WARNING: Missing block: B:288:0x050b, code skipped:
            r9 = r10;
            r7 = r25;
            r6 = r26;
            r8 = r27;
            r0 = r28;
            r10 = r29;
     */
    private static defpackage.bkf a(android.util.JsonReader r32, java.lang.String r33, boolean r34) {
        /*
        r1 = r32;
        r0 = defpackage.bpg.a();	 Catch:{ Exception -> 0x0570 }
        r2 = new zr;	 Catch:{ Exception -> 0x0570 }
        r2.<init>();	 Catch:{ Exception -> 0x0570 }
        r3 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0570 }
        r3.<init>();	 Catch:{ Exception -> 0x0570 }
        r4 = new java.util.HashMap;	 Catch:{ Exception -> 0x0570 }
        r4.<init>();	 Catch:{ Exception -> 0x0570 }
        r5 = new java.util.HashMap;	 Catch:{ Exception -> 0x0570 }
        r5.<init>();	 Catch:{ Exception -> 0x0570 }
        r6 = new java.util.HashMap;	 Catch:{ Exception -> 0x0570 }
        r6.<init>();	 Catch:{ Exception -> 0x0570 }
        r7 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0570 }
        r7.<init>();	 Catch:{ Exception -> 0x0570 }
        r8 = new aaf;	 Catch:{ Exception -> 0x0570 }
        r8.<init>();	 Catch:{ Exception -> 0x0570 }
        r9 = new bjj;	 Catch:{ Exception -> 0x0570 }
        r9.<init>();	 Catch:{ Exception -> 0x0570 }
        r32.beginObject();	 Catch:{ Exception -> 0x0570 }
        r10 = 0;
        r10 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
    L_0x0037:
        r16 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r16 == 0) goto L_0x0518;
    L_0x003d:
        r11 = r32.nextName();	 Catch:{ Exception -> 0x0570 }
        r17 = r11.hashCode();
        r18 = r15;
        r15 = "h";
        r19 = r14;
        r14 = "layers";
        r20 = r13;
        r13 = "w";
        r21 = r12;
        r23 = -1;
        switch(r17) {
            case -1408207997: goto L_0x00bc;
            case -1109732030: goto L_0x00b4;
            case 104: goto L_0x00ac;
            case 118: goto L_0x00a2;
            case 119: goto L_0x009a;
            case 3276: goto L_0x0090;
            case 3367: goto L_0x0086;
            case 3553: goto L_0x007c;
            case 94623709: goto L_0x0071;
            case 97615364: goto L_0x0066;
            case 839250809: goto L_0x005a;
            default: goto L_0x0058;
        };
    L_0x0058:
        goto L_0x00c6;
    L_0x005a:
        r12 = "markers";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x00c6;
    L_0x0062:
        r11 = 10;
        goto L_0x00c7;
    L_0x0066:
        r12 = "fonts";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x00c6;
    L_0x006e:
        r11 = 8;
        goto L_0x00c7;
    L_0x0071:
        r12 = "chars";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x00c6;
    L_0x0079:
        r11 = 9;
        goto L_0x00c7;
    L_0x007c:
        r12 = "op";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x00c6;
    L_0x0084:
        r11 = 3;
        goto L_0x00c7;
    L_0x0086:
        r12 = "ip";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x00c6;
    L_0x008e:
        r11 = 2;
        goto L_0x00c7;
    L_0x0090:
        r12 = "fr";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x00c6;
    L_0x0098:
        r11 = 4;
        goto L_0x00c7;
    L_0x009a:
        r11 = r11.equals(r13);
        if (r11 == 0) goto L_0x00c6;
    L_0x00a0:
        r11 = 0;
        goto L_0x00c7;
    L_0x00a2:
        r12 = "v";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x00c6;
    L_0x00aa:
        r11 = 5;
        goto L_0x00c7;
    L_0x00ac:
        r11 = r11.equals(r15);
        if (r11 == 0) goto L_0x00c6;
    L_0x00b2:
        r11 = 1;
        goto L_0x00c7;
    L_0x00b4:
        r11 = r11.equals(r14);
        if (r11 == 0) goto L_0x00c6;
    L_0x00ba:
        r11 = 6;
        goto L_0x00c7;
    L_0x00bc:
        r12 = "assets";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x00c6;
    L_0x00c4:
        r11 = 7;
        goto L_0x00c7;
    L_0x00c6:
        r11 = -1;
    L_0x00c7:
        r12 = "fFamily";
        r24 = 0;
        switch(r11) {
            case 0: goto L_0x04f4;
            case 1: goto L_0x04dd;
            case 2: goto L_0x04c7;
            case 3: goto L_0x04af;
            case 4: goto L_0x049c;
            case 5: goto L_0x0465;
            case 6: goto L_0x041b;
            case 7: goto L_0x030d;
            case 8: goto L_0x0244;
            case 9: goto L_0x014c;
            case 10: goto L_0x00de;
            default: goto L_0x00ce;
        };
    L_0x00ce:
        r28 = r0;
        r26 = r6;
        r25 = r7;
        r27 = r8;
        r29 = r10;
        r10 = r9;
        r32.skipValue();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0503;
    L_0x00de:
        r32.beginArray();	 Catch:{ Exception -> 0x0570 }
    L_0x00e1:
        r11 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r11 == 0) goto L_0x0148;
    L_0x00e7:
        r32.beginObject();	 Catch:{ Exception -> 0x0570 }
    L_0x00ea:
        r11 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r11 == 0) goto L_0x013c;
    L_0x00f0:
        r11 = r32.nextName();	 Catch:{ Exception -> 0x0570 }
        r12 = r11.hashCode();
        r13 = 3178; // 0xc6a float:4.453E-42 double:1.57E-320;
        if (r12 == r13) goto L_0x0119;
    L_0x00fc:
        r13 = 3214; // 0xc8e float:4.504E-42 double:1.588E-320;
        if (r12 == r13) goto L_0x010f;
    L_0x0100:
        r13 = 3705; // 0xe79 float:5.192E-42 double:1.8305E-320;
        if (r12 == r13) goto L_0x0105;
    L_0x0104:
        goto L_0x0123;
    L_0x0105:
        r12 = "tm";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x0123;
    L_0x010d:
        r11 = 1;
        goto L_0x0124;
    L_0x010f:
        r12 = "dr";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x0123;
    L_0x0117:
        r11 = 2;
        goto L_0x0124;
    L_0x0119:
        r12 = "cm";
        r11 = r11.equals(r12);
        if (r11 == 0) goto L_0x0123;
    L_0x0121:
        r11 = 0;
        goto L_0x0124;
    L_0x0123:
        r11 = -1;
    L_0x0124:
        if (r11 == 0) goto L_0x0138;
    L_0x0126:
        r12 = 1;
        if (r11 == r12) goto L_0x0134;
    L_0x0129:
        r12 = 2;
        if (r11 == r12) goto L_0x0130;
    L_0x012c:
        r32.skipValue();	 Catch:{ Exception -> 0x0570 }
        goto L_0x00ea;
    L_0x0130:
        r32.nextDouble();	 Catch:{ Exception -> 0x0570 }
        goto L_0x00ea;
    L_0x0134:
        r32.nextDouble();	 Catch:{ Exception -> 0x0570 }
        goto L_0x00ea;
    L_0x0138:
        r32.nextString();	 Catch:{ Exception -> 0x0570 }
        goto L_0x00ea;
    L_0x013c:
        r32.endObject();	 Catch:{ Exception -> 0x0570 }
        r11 = new bmj;	 Catch:{ Exception -> 0x0570 }
        r11.<init>();	 Catch:{ Exception -> 0x0570 }
        r7.add(r11);	 Catch:{ Exception -> 0x0570 }
        goto L_0x00e1;
    L_0x0148:
        r32.endArray();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0158;
    L_0x014c:
        r32.beginArray();	 Catch:{ Exception -> 0x0570 }
    L_0x014f:
        r11 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r11 != 0) goto L_0x0160;
    L_0x0155:
        r32.endArray();	 Catch:{ Exception -> 0x0570 }
    L_0x0158:
        r28 = r0;
        r26 = r6;
        r25 = r7;
        goto L_0x0306;
    L_0x0160:
        r11 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0570 }
        r11.<init>();	 Catch:{ Exception -> 0x0570 }
        r32.beginObject();	 Catch:{ Exception -> 0x0570 }
        r14 = 0;
        r28 = r14;
        r30 = r24;
        r31 = r30;
        r27 = 0;
    L_0x0172:
        r14 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r14 == 0) goto L_0x022f;
    L_0x0178:
        r14 = r32.nextName();	 Catch:{ Exception -> 0x0570 }
        r15 = r14.hashCode();
        switch(r15) {
            case -1866931350: goto L_0x01b4;
            case 119: goto L_0x01ac;
            case 3173: goto L_0x01a2;
            case 3076010: goto L_0x0198;
            case 3530753: goto L_0x018e;
            case 109780401: goto L_0x0184;
            default: goto L_0x0183;
        };
    L_0x0183:
        goto L_0x01bc;
    L_0x0184:
        r15 = "style";
        r14 = r14.equals(r15);
        if (r14 == 0) goto L_0x01bc;
    L_0x018c:
        r14 = 3;
        goto L_0x01bd;
    L_0x018e:
        r15 = "size";
        r14 = r14.equals(r15);
        if (r14 == 0) goto L_0x01bc;
    L_0x0196:
        r14 = 1;
        goto L_0x01bd;
    L_0x0198:
        r15 = "data";
        r14 = r14.equals(r15);
        if (r14 == 0) goto L_0x01bc;
    L_0x01a0:
        r14 = 5;
        goto L_0x01bd;
    L_0x01a2:
        r15 = "ch";
        r14 = r14.equals(r15);
        if (r14 == 0) goto L_0x01bc;
    L_0x01aa:
        r14 = 0;
        goto L_0x01bd;
    L_0x01ac:
        r14 = r14.equals(r13);
        if (r14 == 0) goto L_0x01bc;
    L_0x01b2:
        r14 = 2;
        goto L_0x01bd;
    L_0x01b4:
        r14 = r14.equals(r12);
        if (r14 == 0) goto L_0x01bc;
    L_0x01ba:
        r14 = 4;
        goto L_0x01bd;
    L_0x01bc:
        r14 = -1;
    L_0x01bd:
        if (r14 == 0) goto L_0x0222;
    L_0x01bf:
        r15 = 1;
        if (r14 == r15) goto L_0x021d;
    L_0x01c2:
        r15 = 2;
        if (r14 == r15) goto L_0x0217;
    L_0x01c5:
        r15 = 3;
        if (r14 == r15) goto L_0x020f;
    L_0x01c8:
        r15 = 4;
        if (r14 == r15) goto L_0x0207;
    L_0x01cb:
        r15 = 5;
        if (r14 == r15) goto L_0x01d2;
    L_0x01ce:
        r32.skipValue();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0172;
    L_0x01d2:
        r32.beginObject();	 Catch:{ Exception -> 0x0570 }
    L_0x01d5:
        r14 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r14 == 0) goto L_0x0202;
    L_0x01db:
        r14 = "shapes";
        r15 = r32.nextName();	 Catch:{ Exception -> 0x0570 }
        r14 = r14.equals(r15);	 Catch:{ Exception -> 0x0570 }
        if (r14 == 0) goto L_0x01fe;
    L_0x01e7:
        r32.beginArray();	 Catch:{ Exception -> 0x0570 }
    L_0x01ea:
        r14 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r14 == 0) goto L_0x01fa;
    L_0x01f0:
        r14 = defpackage.boj.a(r1, r9);	 Catch:{ Exception -> 0x0570 }
        r14 = (defpackage.bnl) r14;	 Catch:{ Exception -> 0x0570 }
        r11.add(r14);	 Catch:{ Exception -> 0x0570 }
        goto L_0x01ea;
    L_0x01fa:
        r32.endArray();	 Catch:{ Exception -> 0x0570 }
        goto L_0x01d5;
    L_0x01fe:
        r32.skipValue();	 Catch:{ Exception -> 0x0570 }
        goto L_0x01d5;
    L_0x0202:
        r32.endObject();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0172;
    L_0x0207:
        r14 = r32.nextString();	 Catch:{ Exception -> 0x0570 }
        r31 = r14;
        goto L_0x0172;
    L_0x020f:
        r14 = r32.nextString();	 Catch:{ Exception -> 0x0570 }
        r30 = r14;
        goto L_0x0172;
    L_0x0217:
        r28 = r32.nextDouble();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0172;
    L_0x021d:
        r32.nextDouble();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0172;
    L_0x0222:
        r14 = r32.nextString();	 Catch:{ Exception -> 0x0570 }
        r15 = 0;
        r14 = r14.charAt(r15);	 Catch:{ Exception -> 0x0570 }
        r27 = r14;
        goto L_0x0172;
    L_0x022f:
        r32.endObject();	 Catch:{ Exception -> 0x0570 }
        r14 = new bmf;	 Catch:{ Exception -> 0x0570 }
        r25 = r14;
        r26 = r11;
        r25.<init>(r26, r27, r28, r30, r31);	 Catch:{ Exception -> 0x0570 }
        r11 = r14.hashCode();	 Catch:{ Exception -> 0x0570 }
        r8.b(r11, r14);	 Catch:{ Exception -> 0x0570 }
        goto L_0x014f;
    L_0x0244:
        r32.beginObject();	 Catch:{ Exception -> 0x0570 }
    L_0x0247:
        r11 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r11 == 0) goto L_0x02fd;
    L_0x024d:
        r11 = r32.nextName();	 Catch:{ Exception -> 0x0570 }
        r13 = r11.hashCode();
        r14 = 3322014; // 0x32b09e float:4.655133E-39 double:1.641293E-317;
        if (r13 == r14) goto L_0x025b;
    L_0x025a:
        goto L_0x0265;
    L_0x025b:
        r13 = "list";
        r11 = r11.equals(r13);
        if (r11 == 0) goto L_0x0265;
    L_0x0263:
        r11 = 0;
        goto L_0x0266;
    L_0x0265:
        r11 = -1;
    L_0x0266:
        if (r11 == 0) goto L_0x026c;
    L_0x0268:
        r32.skipValue();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0247;
    L_0x026c:
        r32.beginArray();	 Catch:{ Exception -> 0x0570 }
    L_0x026f:
        r11 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r11 != 0) goto L_0x0279;
    L_0x0275:
        r32.endArray();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0247;
    L_0x0279:
        r32.beginObject();	 Catch:{ Exception -> 0x0570 }
        r11 = r24;
        r13 = r11;
        r14 = r13;
    L_0x0280:
        r15 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r15 == 0) goto L_0x02ea;
    L_0x0286:
        r15 = r32.nextName();	 Catch:{ Exception -> 0x0570 }
        r22 = r15.hashCode();
        switch(r22) {
            case -1866931350: goto L_0x02b8;
            case -1408684838: goto L_0x02ac;
            case -1294566165: goto L_0x02a0;
            case 96619537: goto L_0x0294;
            default: goto L_0x0291;
        };
    L_0x0291:
        r25 = r7;
        goto L_0x02c2;
    L_0x0294:
        r25 = r7;
        r7 = "fName";
        r7 = r15.equals(r7);
        if (r7 == 0) goto L_0x02c2;
    L_0x029e:
        r7 = 1;
        goto L_0x02c3;
    L_0x02a0:
        r25 = r7;
        r7 = "fStyle";
        r7 = r15.equals(r7);
        if (r7 == 0) goto L_0x02c2;
    L_0x02aa:
        r7 = 2;
        goto L_0x02c3;
    L_0x02ac:
        r25 = r7;
        r7 = "ascent";
        r7 = r15.equals(r7);
        if (r7 == 0) goto L_0x02c2;
    L_0x02b6:
        r7 = 3;
        goto L_0x02c3;
    L_0x02b8:
        r25 = r7;
        r7 = r15.equals(r12);
        if (r7 == 0) goto L_0x02c2;
    L_0x02c0:
        r7 = 0;
        goto L_0x02c3;
    L_0x02c2:
        r7 = -1;
    L_0x02c3:
        if (r7 == 0) goto L_0x02e2;
    L_0x02c5:
        r15 = 1;
        if (r7 == r15) goto L_0x02dc;
    L_0x02c8:
        r15 = 2;
        if (r7 == r15) goto L_0x02d6;
    L_0x02cb:
        r15 = 3;
        if (r7 == r15) goto L_0x02d2;
    L_0x02ce:
        r32.skipValue();	 Catch:{ Exception -> 0x0570 }
        goto L_0x02e7;
    L_0x02d2:
        r32.nextDouble();	 Catch:{ Exception -> 0x0570 }
        goto L_0x02e7;
    L_0x02d6:
        r7 = r32.nextString();	 Catch:{ Exception -> 0x0570 }
        r14 = r7;
        goto L_0x02e7;
    L_0x02dc:
        r7 = r32.nextString();	 Catch:{ Exception -> 0x0570 }
        r13 = r7;
        goto L_0x02e7;
    L_0x02e2:
        r7 = r32.nextString();	 Catch:{ Exception -> 0x0570 }
        r11 = r7;
    L_0x02e7:
        r7 = r25;
        goto L_0x0280;
    L_0x02ea:
        r25 = r7;
        r32.endObject();	 Catch:{ Exception -> 0x0570 }
        r7 = new bmg;	 Catch:{ Exception -> 0x0570 }
        r7.<init>(r11, r13, r14);	 Catch:{ Exception -> 0x0570 }
        r11 = r7.b;	 Catch:{ Exception -> 0x0570 }
        r6.put(r11, r7);	 Catch:{ Exception -> 0x0570 }
        r7 = r25;
        goto L_0x026f;
    L_0x02fd:
        r25 = r7;
        r32.endObject();	 Catch:{ Exception -> 0x0570 }
        r28 = r0;
        r26 = r6;
    L_0x0306:
        r27 = r8;
        r29 = r10;
        r10 = r9;
        goto L_0x0503;
    L_0x030d:
        r25 = r7;
        r32.beginArray();	 Catch:{ Exception -> 0x0570 }
    L_0x0312:
        r7 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r7 == 0) goto L_0x040d;
    L_0x0318:
        r7 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0570 }
        r7.<init>();	 Catch:{ Exception -> 0x0570 }
        r11 = new zr;	 Catch:{ Exception -> 0x0570 }
        r11.<init>();	 Catch:{ Exception -> 0x0570 }
        r32.beginObject();	 Catch:{ Exception -> 0x0570 }
        r26 = r6;
        r6 = r24;
        r12 = r6;
    L_0x032a:
        r27 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r27 == 0) goto L_0x03e8;
    L_0x0330:
        r27 = r8;
        r8 = r32.nextName();	 Catch:{ Exception -> 0x0570 }
        r28 = r0;
        r0 = r8.hashCode();
        r29 = r10;
        r10 = -1109732030; // 0xffffffffbddad542 float:-0.10685207 double:NaN;
        if (r0 == r10) goto L_0x0386;
    L_0x0343:
        r10 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r0 == r10) goto L_0x037e;
    L_0x0347:
        r10 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        if (r0 == r10) goto L_0x0374;
    L_0x034b:
        r10 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        if (r0 == r10) goto L_0x036a;
    L_0x034f:
        r10 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        if (r0 == r10) goto L_0x0362;
    L_0x0353:
        r10 = 3355; // 0xd1b float:4.701E-42 double:1.6576E-320;
        if (r0 == r10) goto L_0x0358;
    L_0x0357:
        goto L_0x038e;
    L_0x0358:
        r0 = "id";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x038e;
    L_0x0360:
        r0 = 0;
        goto L_0x038f;
    L_0x0362:
        r0 = r8.equals(r13);
        if (r0 == 0) goto L_0x038e;
    L_0x0368:
        r0 = 2;
        goto L_0x038f;
    L_0x036a:
        r0 = "u";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x038e;
    L_0x0372:
        r0 = 5;
        goto L_0x038f;
    L_0x0374:
        r0 = "p";
        r0 = r8.equals(r0);
        if (r0 == 0) goto L_0x038e;
    L_0x037c:
        r0 = 4;
        goto L_0x038f;
    L_0x037e:
        r0 = r8.equals(r15);
        if (r0 == 0) goto L_0x038e;
    L_0x0384:
        r0 = 3;
        goto L_0x038f;
    L_0x0386:
        r0 = r8.equals(r14);
        if (r0 == 0) goto L_0x038e;
    L_0x038c:
        r0 = 1;
        goto L_0x038f;
    L_0x038e:
        r0 = -1;
    L_0x038f:
        if (r0 == 0) goto L_0x03d9;
    L_0x0391:
        r8 = 1;
        if (r0 == r8) goto L_0x03ba;
    L_0x0394:
        r8 = 2;
        if (r0 == r8) goto L_0x03b5;
    L_0x0397:
        r8 = 3;
        if (r0 == r8) goto L_0x03b0;
    L_0x039a:
        r8 = 4;
        if (r0 == r8) goto L_0x03a8;
    L_0x039d:
        r8 = 5;
        if (r0 == r8) goto L_0x03a4;
    L_0x03a0:
        r32.skipValue();	 Catch:{ Exception -> 0x0570 }
        goto L_0x03ae;
    L_0x03a4:
        r32.nextString();	 Catch:{ Exception -> 0x0570 }
        goto L_0x03ae;
    L_0x03a8:
        r8 = 5;
        r0 = r32.nextString();	 Catch:{ Exception -> 0x0570 }
        r12 = r0;
    L_0x03ae:
        r10 = r9;
        goto L_0x03df;
    L_0x03b0:
        r8 = 5;
        r32.nextInt();	 Catch:{ Exception -> 0x0570 }
        goto L_0x03ae;
    L_0x03b5:
        r8 = 5;
        r32.nextInt();	 Catch:{ Exception -> 0x0570 }
        goto L_0x03ae;
    L_0x03ba:
        r8 = 5;
        r32.beginArray();	 Catch:{ Exception -> 0x0570 }
    L_0x03be:
        r0 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r0 == 0) goto L_0x03d4;
    L_0x03c4:
        r0 = defpackage.bou.a(r1, r9);	 Catch:{ Exception -> 0x0570 }
        r10 = r9;
        r8 = r0.d;	 Catch:{ Exception -> 0x0570 }
        r11.b(r8, r0);	 Catch:{ Exception -> 0x0570 }
        r7.add(r0);	 Catch:{ Exception -> 0x0570 }
        r9 = r10;
        r8 = 5;
        goto L_0x03be;
    L_0x03d4:
        r10 = r9;
        r32.endArray();	 Catch:{ Exception -> 0x0570 }
        goto L_0x03df;
    L_0x03d9:
        r10 = r9;
        r0 = r32.nextString();	 Catch:{ Exception -> 0x0570 }
        r6 = r0;
    L_0x03df:
        r9 = r10;
        r8 = r27;
        r0 = r28;
        r10 = r29;
        goto L_0x032a;
    L_0x03e8:
        r28 = r0;
        r27 = r8;
        r29 = r10;
        r10 = r9;
        r32.endObject();	 Catch:{ Exception -> 0x0570 }
        if (r12 == 0) goto L_0x03ff;
    L_0x03f4:
        r0 = new bkc;	 Catch:{ Exception -> 0x0570 }
        r0.<init>(r6, r12);	 Catch:{ Exception -> 0x0570 }
        r6 = r0.a;	 Catch:{ Exception -> 0x0570 }
        r5.put(r6, r0);	 Catch:{ Exception -> 0x0570 }
        goto L_0x0402;
    L_0x03ff:
        r4.put(r6, r7);	 Catch:{ Exception -> 0x0570 }
    L_0x0402:
        r9 = r10;
        r6 = r26;
        r8 = r27;
        r0 = r28;
        r10 = r29;
        goto L_0x0312;
    L_0x040d:
        r28 = r0;
        r26 = r6;
        r27 = r8;
        r29 = r10;
        r10 = r9;
        r32.endArray();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0503;
    L_0x041b:
        r28 = r0;
        r26 = r6;
        r25 = r7;
        r27 = r8;
        r29 = r10;
        r10 = r9;
        r32.beginArray();	 Catch:{ Exception -> 0x0570 }
        r0 = 0;
    L_0x042a:
        r6 = r32.hasNext();	 Catch:{ Exception -> 0x0570 }
        if (r6 == 0) goto L_0x0460;
    L_0x0430:
        r6 = defpackage.bou.a(r1, r10);	 Catch:{ Exception -> 0x0570 }
        r7 = r6.u;	 Catch:{ Exception -> 0x0570 }
        r8 = 3;
        if (r7 != r8) goto L_0x043b;
    L_0x0439:
        r0 = r0 + 1;
    L_0x043b:
        r3.add(r6);	 Catch:{ Exception -> 0x0570 }
        r11 = r6.d;	 Catch:{ Exception -> 0x0570 }
        r2.b(r11, r6);	 Catch:{ Exception -> 0x0570 }
        r6 = 4;
        if (r0 <= r6) goto L_0x042a;
    L_0x0446:
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0570 }
        r7.<init>();	 Catch:{ Exception -> 0x0570 }
        r9 = "You have ";
        r7.append(r9);	 Catch:{ Exception -> 0x0570 }
        r7.append(r0);	 Catch:{ Exception -> 0x0570 }
        r9 = " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.";
        r7.append(r9);	 Catch:{ Exception -> 0x0570 }
        r7 = r7.toString();	 Catch:{ Exception -> 0x0570 }
        defpackage.bpb.a(r7);	 Catch:{ Exception -> 0x0570 }
        goto L_0x042a;
    L_0x0460:
        r32.endArray();	 Catch:{ Exception -> 0x0570 }
        goto L_0x0503;
    L_0x0465:
        r28 = r0;
        r26 = r6;
        r25 = r7;
        r27 = r8;
        r29 = r10;
        r10 = r9;
        r0 = r32.nextString();	 Catch:{ Exception -> 0x0570 }
        r6 = "\\.";
        r0 = r0.split(r6);	 Catch:{ Exception -> 0x0570 }
        r6 = 0;
        r7 = r0[r6];	 Catch:{ Exception -> 0x0570 }
        r6 = java.lang.Integer.parseInt(r7);	 Catch:{ Exception -> 0x0570 }
        r7 = 1;
        r7 = r0[r7];	 Catch:{ Exception -> 0x0570 }
        r7 = java.lang.Integer.parseInt(r7);	 Catch:{ Exception -> 0x0570 }
        r8 = 2;
        r0 = r0[r8];	 Catch:{ Exception -> 0x0570 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Exception -> 0x0570 }
        r0 = defpackage.bpg.a(r6, r7, r0);	 Catch:{ Exception -> 0x0570 }
        if (r0 != 0) goto L_0x0503;
    L_0x0495:
        r0 = "Lottie only supports bodymovin >= 4.4.0";
        r10.a(r0);	 Catch:{ Exception -> 0x0570 }
        goto L_0x0503;
    L_0x049c:
        r28 = r0;
        r26 = r6;
        r25 = r7;
        r27 = r8;
        r29 = r10;
        r10 = r9;
        r6 = r32.nextDouble();	 Catch:{ Exception -> 0x0570 }
        r0 = (float) r6;	 Catch:{ Exception -> 0x0570 }
        r15 = r0;
        goto L_0x0505;
    L_0x04af:
        r28 = r0;
        r26 = r6;
        r25 = r7;
        r27 = r8;
        r29 = r10;
        r10 = r9;
        r6 = r32.nextDouble();	 Catch:{ Exception -> 0x0570 }
        r0 = (float) r6;	 Catch:{ Exception -> 0x0570 }
        r6 = -1138501878; // 0xffffffffbc23d70a float:-0.01 double:NaN;
        r0 = r0 + r6;
        r14 = r0;
        r15 = r18;
        goto L_0x0507;
    L_0x04c7:
        r28 = r0;
        r26 = r6;
        r25 = r7;
        r27 = r8;
        r29 = r10;
        r10 = r9;
        r6 = r32.nextDouble();	 Catch:{ Exception -> 0x0570 }
        r0 = (float) r6;	 Catch:{ Exception -> 0x0570 }
        r13 = r0;
        r15 = r18;
        r14 = r19;
        goto L_0x0509;
    L_0x04dd:
        r28 = r0;
        r26 = r6;
        r25 = r7;
        r27 = r8;
        r29 = r10;
        r10 = r9;
        r0 = r32.nextInt();	 Catch:{ Exception -> 0x0570 }
        r12 = r0;
        r15 = r18;
        r14 = r19;
        r13 = r20;
        goto L_0x050b;
    L_0x04f4:
        r28 = r0;
        r26 = r6;
        r25 = r7;
        r27 = r8;
        r10 = r9;
        r0 = r32.nextInt();	 Catch:{ Exception -> 0x0570 }
        r29 = r0;
    L_0x0503:
        r15 = r18;
    L_0x0505:
        r14 = r19;
    L_0x0507:
        r13 = r20;
    L_0x0509:
        r12 = r21;
    L_0x050b:
        r9 = r10;
        r7 = r25;
        r6 = r26;
        r8 = r27;
        r0 = r28;
        r10 = r29;
        goto L_0x0037;
    L_0x0518:
        r28 = r0;
        r26 = r6;
        r27 = r8;
        r29 = r10;
        r21 = r12;
        r20 = r13;
        r19 = r14;
        r18 = r15;
        r10 = r9;
        r32.endObject();	 Catch:{ Exception -> 0x0570 }
        r11 = r29;
        r0 = (float) r11;	 Catch:{ Exception -> 0x0570 }
        r0 = r0 * r28;
        r0 = (int) r0;	 Catch:{ Exception -> 0x0570 }
        r11 = r21;
        r6 = (float) r11;	 Catch:{ Exception -> 0x0570 }
        r6 = r6 * r28;
        r6 = (int) r6;	 Catch:{ Exception -> 0x0570 }
        r7 = new android.graphics.Rect;	 Catch:{ Exception -> 0x0570 }
        r8 = 0;
        r7.<init>(r8, r8, r0, r6);	 Catch:{ Exception -> 0x0570 }
        r10.h = r7;	 Catch:{ Exception -> 0x0570 }
        r13 = r20;
        r10.i = r13;	 Catch:{ Exception -> 0x0570 }
        r14 = r19;
        r10.j = r14;	 Catch:{ Exception -> 0x0570 }
        r15 = r18;
        r10.k = r15;	 Catch:{ Exception -> 0x0570 }
        r10.g = r3;	 Catch:{ Exception -> 0x0570 }
        r10.f = r2;	 Catch:{ Exception -> 0x0570 }
        r10.b = r4;	 Catch:{ Exception -> 0x0570 }
        r10.c = r5;	 Catch:{ Exception -> 0x0570 }
        r0 = r27;
        r10.e = r0;	 Catch:{ Exception -> 0x0570 }
        r0 = r26;
        r10.d = r0;	 Catch:{ Exception -> 0x0570 }
        r0 = defpackage.bmk.a;	 Catch:{ Exception -> 0x0570 }
        r2 = r33;
        r0.a(r2, r10);	 Catch:{ Exception -> 0x0570 }
        r0 = new bkf;	 Catch:{ Exception -> 0x0570 }
        r0.<init>(r10);	 Catch:{ Exception -> 0x0570 }
        if (r34 == 0) goto L_0x056d;
    L_0x056a:
        defpackage.bpg.a(r32);
    L_0x056d:
        return r0;
    L_0x056e:
        r0 = move-exception;
        goto L_0x057c;
    L_0x0570:
        r0 = move-exception;
        r2 = new bkf;	 Catch:{ all -> 0x056e }
        r2.<init>(r0);	 Catch:{ all -> 0x056e }
        if (r34 == 0) goto L_0x057b;
    L_0x0578:
        defpackage.bpg.a(r32);
    L_0x057b:
        return r2;
    L_0x057c:
        if (r34 != 0) goto L_0x057f;
    L_0x057e:
        goto L_0x0582;
    L_0x057f:
        defpackage.bpg.a(r32);
    L_0x0582:
        goto L_0x0584;
    L_0x0583:
        throw r0;
    L_0x0584:
        goto L_0x0583;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjm.a(android.util.JsonReader, java.lang.String, boolean):bkf");
    }

    public static bkf a(ZipInputStream zipInputStream, String str) {
        bkf bkf;
        try {
            HashMap hashMap = new HashMap();
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            Object obj = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (name.contains(".json")) {
                    obj = (bjj) bjm.a(new JsonReader(new InputStreamReader(zipInputStream)), null, false).a;
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (obj == null) {
                bkf = new bkf(new IllegalArgumentException("Unable to parse composition"));
            } else {
                for (Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    for (bkc bkc : obj.c.values()) {
                        if (bkc.b.equals(str2)) {
                            break;
                        }
                    }
                    bkc bkc2 = null;
                    if (bkc2 != null) {
                        bkc2.c = (Bitmap) entry.getValue();
                    }
                }
                for (Entry entry2 : obj.c.entrySet()) {
                    if (((bkc) entry2.getValue()).c == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("There is no image for ");
                        stringBuilder.append(((bkc) entry2.getValue()).b);
                        bkf = new bkf(new IllegalStateException(stringBuilder.toString()));
                        break;
                    }
                }
                bmk.a.a(str, obj);
                bkf = new bkf(obj);
            }
        } catch (IOException e) {
            bkf = new bkf(e);
        } catch (Throwable th) {
            bpg.a((Closeable) zipInputStream);
        }
        bpg.a((Closeable) zipInputStream);
        return bkf;
    }

    private static bki a(String str, Callable callable) {
        bjj bjj;
        if (str == null) {
            bjj = null;
        } else {
            bjj = (bjj) bmk.a.b.a((Object) str);
        }
        if (bjj != null) {
            return new bki(new bjr(bjj));
        }
        if (str != null && a.containsKey(str)) {
            return (bki) a.get(str);
        }
        bki bki = new bki(callable);
        bki.a(new bjo(str));
        bki.c(new bjn(str));
        a.put(str, bki);
        return bki;
    }
}
