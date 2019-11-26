package defpackage;

import android.media.MediaCodecInfo.CodecProfileLevel;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: okx */
public final class okx {
    private static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap b = new HashMap();
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private static final SparseIntArray f;
    private static final Map g;
    private static final Map h;
    private static final Map i;
    private static final SparseIntArray j;
    private static int k = -1;

    public static okq a(String str) {
        List a = okx.a(str, false, false);
        return !a.isEmpty() ? (okq) a.get(0) : null;
    }

    public static synchronized List a(String str, boolean z, boolean z2) {
        synchronized (okx.class) {
            ola ola = new ola(str, z, z2);
            List list = (List) b.get(ola);
            if (list == null) {
                olc ole;
                if (ozp.a >= 21) {
                    ole = new ole(z, z2);
                } else {
                    ole = new olf();
                }
                List a = okx.a(ola, ole, str);
                if (z && a.isEmpty() && ozp.a >= 21 && ozp.a <= 23) {
                    a = okx.a(ola, new olf(), str);
                    if (!a.isEmpty()) {
                        String str2 = ((okq) a.get(0)).a;
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 63) + String.valueOf(str2).length());
                        stringBuilder.append("MediaCodecList API didn't list secure decoder for: ");
                        stringBuilder.append(str);
                        stringBuilder.append(". Assuming: ");
                        stringBuilder.append(str2);
                        oyp.a("MediaCodecUtil", stringBuilder.toString());
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (ozp.a < 26 && ozp.b.equals("R9") && a.size() == 1) {
                        if (((okq) a.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                            a.add(new okq("OMX.google.raw.decoder", "audio/raw", null, false, false, false));
                        }
                    }
                    okx.a(a, okz.a);
                } else if (ozp.a < 21 && a.size() > 1) {
                    str = ((okq) a.get(0)).a;
                    if ("OMX.SEC.mp3.dec".equals(str) || "OMX.SEC.MP3.Decoder".equals(str) || "OMX.brcm.audio.mp3.decoder".equals(str)) {
                        okx.a(a, oky.a);
                    }
                }
                List unmodifiableList = Collections.unmodifiableList(a);
                b.put(ola, unmodifiableList);
                return unmodifiableList;
            }
            return list;
        }
    }

    public static List a(List list, nzw nzw) {
        List arrayList = new ArrayList(list);
        okx.a(arrayList, new okw(nzw));
        return arrayList;
    }

    public static int a() {
        if (k == -1) {
            okq a = okx.a("video/avc");
            int i = 0;
            if (a != null) {
                CodecProfileLevel[] a2 = a.a();
                int length = a2.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = a2[i].level;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i3 = 101376;
                                break;
                            case 64:
                                i3 = 202752;
                                break;
                            case 128:
                            case 256:
                                i3 = 414720;
                                break;
                            case 512:
                                i3 = 921600;
                                break;
                            case 1024:
                                i3 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i3 = 2097152;
                                break;
                            case 8192:
                                i3 = 2228224;
                                break;
                            case 16384:
                                i3 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i3 = 9437184;
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                    }
                    i3 = 25344;
                    i2 = Math.max(i3, i2);
                    i++;
                }
                i = Math.max(i2, ozp.a >= 21 ? 345600 : 172800);
            }
            k = i;
        }
        return k;
    }

    public static android.util.Pair b(java.lang.String r14) {
        /*
        r0 = 0;
        if (r14 == 0) goto L_0x033a;
    L_0x0003:
        r1 = "\\.";
        r1 = r14.split(r1);
        r2 = 0;
        r3 = r1[r2];
        r4 = r3.hashCode();
        r5 = 6;
        r6 = 4;
        r7 = 3;
        r8 = 2;
        r9 = -1;
        r10 = 1;
        switch(r4) {
            case 3006243: goto L_0x0060;
            case 3006244: goto L_0x0056;
            case 3095771: goto L_0x004c;
            case 3095823: goto L_0x0042;
            case 3199032: goto L_0x0038;
            case 3214780: goto L_0x002e;
            case 3356560: goto L_0x0024;
            case 3624515: goto L_0x001a;
            default: goto L_0x0019;
        };
    L_0x0019:
        goto L_0x006a;
    L_0x001a:
        r4 = "vp09";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x006a;
    L_0x0022:
        r3 = 2;
        goto L_0x006b;
    L_0x0024:
        r4 = "mp4a";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x006a;
    L_0x002c:
        r3 = 7;
        goto L_0x006b;
    L_0x002e:
        r4 = "hvc1";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x006a;
    L_0x0036:
        r3 = 4;
        goto L_0x006b;
    L_0x0038:
        r4 = "hev1";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x006a;
    L_0x0040:
        r3 = 3;
        goto L_0x006b;
    L_0x0042:
        r4 = "dvhe";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x006a;
    L_0x004a:
        r3 = 5;
        goto L_0x006b;
    L_0x004c:
        r4 = "dvh1";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x006a;
    L_0x0054:
        r3 = 6;
        goto L_0x006b;
    L_0x0056:
        r4 = "avc2";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x006a;
    L_0x005e:
        r3 = 1;
        goto L_0x006b;
    L_0x0060:
        r4 = "avc1";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x006a;
    L_0x0068:
        r3 = 0;
        goto L_0x006b;
    L_0x006a:
        r3 = -1;
    L_0x006b:
        r4 = 16;
        r11 = "MediaCodecUtil";
        switch(r3) {
            case 0: goto L_0x0281;
            case 1: goto L_0x0281;
            case 2: goto L_0x01fb;
            case 3: goto L_0x0160;
            case 4: goto L_0x0160;
            case 5: goto L_0x00d0;
            case 6: goto L_0x00d0;
            case 7: goto L_0x0073;
            default: goto L_0x0072;
        };
    L_0x0072:
        return r0;
    L_0x0073:
        r3 = r1.length;
        r5 = "Ignoring malformed MP4A codec string: ";
        if (r3 == r7) goto L_0x008c;
    L_0x0078:
        r1 = r14.length();
        if (r1 != 0) goto L_0x0084;
    L_0x007e:
        r14 = new java.lang.String;
        r14.<init>(r5);
        goto L_0x0088;
    L_0x0084:
        r14 = r5.concat(r14);
    L_0x0088:
        defpackage.oyp.a(r11, r14);
        goto L_0x00cf;
    L_0x008c:
        r3 = r1[r10];	 Catch:{ NumberFormatException -> 0x00bb }
        r3 = java.lang.Integer.parseInt(r3, r4);	 Catch:{ NumberFormatException -> 0x00bb }
        r3 = defpackage.oyu.a(r3);	 Catch:{ NumberFormatException -> 0x00bb }
        r4 = "audio/mp4a-latm";
        r3 = r4.equals(r3);	 Catch:{ NumberFormatException -> 0x00bb }
        if (r3 == 0) goto L_0x00cf;
    L_0x009e:
        r1 = r1[r8];	 Catch:{ NumberFormatException -> 0x00bb }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x00bb }
        r3 = j;	 Catch:{ NumberFormatException -> 0x00bb }
        r1 = r3.get(r1, r9);	 Catch:{ NumberFormatException -> 0x00bb }
        if (r1 == r9) goto L_0x00cf;
    L_0x00ac:
        r3 = new android.util.Pair;	 Catch:{ NumberFormatException -> 0x00bb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NumberFormatException -> 0x00bb }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ NumberFormatException -> 0x00bb }
        r3.<init>(r1, r2);	 Catch:{ NumberFormatException -> 0x00bb }
        r0 = r3;
        goto L_0x00cf;
        r1 = r14.length();
        if (r1 != 0) goto L_0x00c8;
    L_0x00c2:
        r14 = new java.lang.String;
        r14.<init>(r5);
        goto L_0x00cc;
    L_0x00c8:
        r14 = r5.concat(r14);
    L_0x00cc:
        defpackage.oyp.a(r11, r14);
    L_0x00cf:
        return r0;
    L_0x00d0:
        r2 = r1.length;
        r3 = "Ignoring malformed Dolby Vision codec string: ";
        if (r2 >= r7) goto L_0x00ea;
    L_0x00d5:
        r1 = r14.length();
        if (r1 != 0) goto L_0x00e1;
    L_0x00db:
        r14 = new java.lang.String;
        r14.<init>(r3);
        goto L_0x00e5;
    L_0x00e1:
        r14 = r3.concat(r14);
    L_0x00e5:
        defpackage.oyp.a(r11, r14);
        goto L_0x015f;
    L_0x00ea:
        r2 = a;
        r4 = r1[r10];
        r2 = r2.matcher(r4);
        r4 = r2.matches();
        if (r4 != 0) goto L_0x010c;
    L_0x00f8:
        r1 = r14.length();
        if (r1 != 0) goto L_0x0104;
    L_0x00fe:
        r14 = new java.lang.String;
        r14.<init>(r3);
        goto L_0x0108;
    L_0x0104:
        r14 = r3.concat(r14);
    L_0x0108:
        defpackage.oyp.a(r11, r14);
        goto L_0x015f;
    L_0x010c:
        r14 = r2.group(r10);
        r2 = h;
        r2 = r2.get(r14);
        r2 = (java.lang.Integer) r2;
        if (r2 != 0) goto L_0x0134;
    L_0x011a:
        r14 = java.lang.String.valueOf(r14);
        r1 = "Unknown Dolby Vision profile string: ";
        r2 = r14.length();
        if (r2 != 0) goto L_0x012c;
    L_0x0126:
        r14 = new java.lang.String;
        r14.<init>(r1);
        goto L_0x0130;
    L_0x012c:
        r14 = r1.concat(r14);
    L_0x0130:
        defpackage.oyp.a(r11, r14);
        goto L_0x015f;
    L_0x0134:
        r14 = r1[r8];
        r1 = i;
        r1 = r1.get(r14);
        r1 = (java.lang.Integer) r1;
        if (r1 != 0) goto L_0x015a;
    L_0x0140:
        r14 = java.lang.String.valueOf(r14);
        r1 = "Unknown Dolby Vision level string: ";
        r2 = r14.length();
        if (r2 != 0) goto L_0x0152;
    L_0x014c:
        r14 = new java.lang.String;
        r14.<init>(r1);
        goto L_0x0156;
    L_0x0152:
        r14 = r1.concat(r14);
    L_0x0156:
        defpackage.oyp.a(r11, r14);
        goto L_0x015f;
    L_0x015a:
        r0 = new android.util.Pair;
        r0.<init>(r2, r1);
    L_0x015f:
        return r0;
    L_0x0160:
        r2 = r1.length;
        r3 = "Ignoring malformed HEVC codec string: ";
        if (r2 >= r6) goto L_0x017a;
    L_0x0165:
        r1 = r14.length();
        if (r1 != 0) goto L_0x0171;
    L_0x016b:
        r14 = new java.lang.String;
        r14.<init>(r3);
        goto L_0x0175;
    L_0x0171:
        r14 = r3.concat(r14);
    L_0x0175:
        defpackage.oyp.a(r11, r14);
        goto L_0x01fa;
    L_0x017a:
        r2 = a;
        r4 = r1[r10];
        r2 = r2.matcher(r4);
        r4 = r2.matches();
        if (r4 != 0) goto L_0x019c;
    L_0x0188:
        r1 = r14.length();
        if (r1 != 0) goto L_0x0194;
    L_0x018e:
        r14 = new java.lang.String;
        r14.<init>(r3);
        goto L_0x0198;
    L_0x0194:
        r14 = r3.concat(r14);
    L_0x0198:
        defpackage.oyp.a(r11, r14);
        goto L_0x01fa;
    L_0x019c:
        r14 = r2.group(r10);
        r2 = "1";
        r2 = r2.equals(r14);
        if (r2 != 0) goto L_0x01ca;
    L_0x01a8:
        r2 = "2";
        r2 = r2.equals(r14);
        if (r2 != 0) goto L_0x01cb;
    L_0x01b0:
        r14 = java.lang.String.valueOf(r14);
        r1 = "Unknown HEVC profile string: ";
        r2 = r14.length();
        if (r2 != 0) goto L_0x01c2;
    L_0x01bc:
        r14 = new java.lang.String;
        r14.<init>(r1);
        goto L_0x01c6;
    L_0x01c2:
        r14 = r1.concat(r14);
    L_0x01c6:
        defpackage.oyp.a(r11, r14);
        goto L_0x01fa;
    L_0x01ca:
        r8 = 1;
    L_0x01cb:
        r14 = r1[r7];
        r1 = g;
        r1 = r1.get(r14);
        r1 = (java.lang.Integer) r1;
        if (r1 != 0) goto L_0x01f1;
    L_0x01d7:
        r14 = java.lang.String.valueOf(r14);
        r1 = "Unknown HEVC level string: ";
        r2 = r14.length();
        if (r2 != 0) goto L_0x01e9;
    L_0x01e3:
        r14 = new java.lang.String;
        r14.<init>(r1);
        goto L_0x01ed;
    L_0x01e9:
        r14 = r1.concat(r14);
    L_0x01ed:
        defpackage.oyp.a(r11, r14);
        goto L_0x01fa;
    L_0x01f1:
        r0 = new android.util.Pair;
        r14 = java.lang.Integer.valueOf(r8);
        r0.<init>(r14, r1);
    L_0x01fa:
        return r0;
    L_0x01fb:
        r2 = r1.length;
        r3 = "Ignoring malformed VP9 codec string: ";
        if (r2 >= r7) goto L_0x0214;
    L_0x0200:
        r1 = r14.length();
        if (r1 != 0) goto L_0x020c;
    L_0x0206:
        r14 = new java.lang.String;
        r14.<init>(r3);
        goto L_0x0210;
    L_0x020c:
        r14 = r3.concat(r14);
    L_0x0210:
        defpackage.oyp.a(r11, r14);
        goto L_0x0280;
    L_0x0214:
        r2 = r1[r10];	 Catch:{ NumberFormatException -> 0x026c }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x026c }
        r1 = r1[r8];	 Catch:{ NumberFormatException -> 0x026c }
        r14 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x026c }
        r1 = e;
        r1 = r1.get(r2, r9);
        if (r1 != r9) goto L_0x023f;
    L_0x0228:
        r14 = new java.lang.StringBuilder;
        r1 = 32;
        r14.<init>(r1);
        r1 = "Unknown VP9 profile: ";
        r14.append(r1);
        r14.append(r2);
        r14 = r14.toString();
        defpackage.oyp.a(r11, r14);
        goto L_0x0280;
    L_0x023f:
        r2 = f;
        r2 = r2.get(r14, r9);
        if (r2 != r9) goto L_0x025e;
    L_0x0247:
        r1 = new java.lang.StringBuilder;
        r2 = 30;
        r1.<init>(r2);
        r2 = "Unknown VP9 level: ";
        r1.append(r2);
        r1.append(r14);
        r14 = r1.toString();
        defpackage.oyp.a(r11, r14);
        goto L_0x0280;
    L_0x025e:
        r0 = new android.util.Pair;
        r14 = java.lang.Integer.valueOf(r1);
        r1 = java.lang.Integer.valueOf(r2);
        r0.<init>(r14, r1);
        goto L_0x0280;
        r1 = r14.length();
        if (r1 != 0) goto L_0x0279;
    L_0x0273:
        r14 = new java.lang.String;
        r14.<init>(r3);
        goto L_0x027d;
    L_0x0279:
        r14 = r3.concat(r14);
    L_0x027d:
        defpackage.oyp.a(r11, r14);
    L_0x0280:
        return r0;
    L_0x0281:
        r3 = r1.length;
        r12 = "Ignoring malformed AVC codec string: ";
        if (r3 >= r8) goto L_0x029b;
    L_0x0286:
        r1 = r14.length();
        if (r1 != 0) goto L_0x0292;
    L_0x028c:
        r14 = new java.lang.String;
        r14.<init>(r12);
        goto L_0x0296;
    L_0x0292:
        r14 = r12.concat(r14);
    L_0x0296:
        defpackage.oyp.a(r11, r14);
        goto L_0x033a;
    L_0x029b:
        r13 = r1[r10];	 Catch:{ NumberFormatException -> 0x0326 }
        r13 = r13.length();	 Catch:{ NumberFormatException -> 0x0326 }
        if (r13 != r5) goto L_0x02b8;
    L_0x02a3:
        r3 = r1[r10];	 Catch:{ NumberFormatException -> 0x0326 }
        r2 = r3.substring(r2, r8);	 Catch:{ NumberFormatException -> 0x0326 }
        r2 = java.lang.Integer.parseInt(r2, r4);	 Catch:{ NumberFormatException -> 0x0326 }
        r1 = r1[r10];	 Catch:{ NumberFormatException -> 0x0326 }
        r1 = r1.substring(r6);	 Catch:{ NumberFormatException -> 0x0326 }
        r14 = java.lang.Integer.parseInt(r1, r4);	 Catch:{ NumberFormatException -> 0x0326 }
        goto L_0x02da;
    L_0x02b8:
        if (r3 >= r7) goto L_0x02ce;
    L_0x02ba:
        r1 = r14.length();	 Catch:{ NumberFormatException -> 0x0326 }
        if (r1 != 0) goto L_0x02c6;
    L_0x02c0:
        r1 = new java.lang.String;	 Catch:{ NumberFormatException -> 0x0326 }
        r1.<init>(r12);	 Catch:{ NumberFormatException -> 0x0326 }
        goto L_0x02ca;
    L_0x02c6:
        r1 = r12.concat(r14);	 Catch:{ NumberFormatException -> 0x0326 }
    L_0x02ca:
        defpackage.oyp.a(r11, r1);	 Catch:{ NumberFormatException -> 0x0326 }
        goto L_0x033a;
    L_0x02ce:
        r2 = r1[r10];	 Catch:{ NumberFormatException -> 0x0326 }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0326 }
        r1 = r1[r8];	 Catch:{ NumberFormatException -> 0x0326 }
        r14 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0326 }
    L_0x02da:
        r1 = c;
        r1 = r1.get(r2, r9);
        if (r1 != r9) goto L_0x02f9;
    L_0x02e2:
        r14 = new java.lang.StringBuilder;
        r1 = 32;
        r14.<init>(r1);
        r1 = "Unknown AVC profile: ";
        r14.append(r1);
        r14.append(r2);
        r14 = r14.toString();
        defpackage.oyp.a(r11, r14);
        goto L_0x033a;
    L_0x02f9:
        r2 = d;
        r2 = r2.get(r14, r9);
        if (r2 != r9) goto L_0x0318;
    L_0x0301:
        r1 = new java.lang.StringBuilder;
        r2 = 30;
        r1.<init>(r2);
        r2 = "Unknown AVC level: ";
        r1.append(r2);
        r1.append(r14);
        r14 = r1.toString();
        defpackage.oyp.a(r11, r14);
        goto L_0x033a;
    L_0x0318:
        r0 = new android.util.Pair;
        r14 = java.lang.Integer.valueOf(r1);
        r1 = java.lang.Integer.valueOf(r2);
        r0.<init>(r14, r1);
        goto L_0x033a;
        r1 = r14.length();
        if (r1 != 0) goto L_0x0333;
    L_0x032d:
        r14 = new java.lang.String;
        r14.<init>(r12);
        goto L_0x0337;
    L_0x0333:
        r14 = r12.concat(r14);
    L_0x0337:
        defpackage.oyp.a(r11, r14);
    L_0x033a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okx.b(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x02ce A:{Catch:{ Exception -> 0x02fa }} */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02cd A:{Catch:{ Exception -> 0x02fa }} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0274 A:{SYNTHETIC, Splitter:B:150:0x0274} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0274 A:{SYNTHETIC, Splitter:B:150:0x0274} */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0274 A:{SYNTHETIC, Splitter:B:150:0x0274} */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0335 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0304 A:{SYNTHETIC, Splitter:B:199:0x0304} */
    /* JADX WARNING: Missing block: B:85:0x016c, code skipped:
            if ("OMX.Exynos.AAC.Decoder".equals(r12) == false) goto L_0x01c6;
     */
    /* JADX WARNING: Missing block: B:103:0x01c4, code skipped:
            if ("SCV31".equals(defpackage.ozp.b) == false) goto L_0x01c6;
     */
    /* JADX WARNING: Missing block: B:121:0x020e, code skipped:
            if (defpackage.ozp.b.startsWith("t0") != false) goto L_0x002e;
     */
    private static java.util.ArrayList a(defpackage.ola r18, defpackage.olc r19, java.lang.String r20) {
        /*
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r4 = "secure-playback";
        r5 = "tunneled-playback";
        r6 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0367 }
        r6.<init>();	 Catch:{ Exception -> 0x0367 }
        r7 = r1.a;	 Catch:{ Exception -> 0x0367 }
        r8 = r19.a();	 Catch:{ Exception -> 0x0367 }
        r9 = r19.b();	 Catch:{ Exception -> 0x0367 }
        r11 = 0;
    L_0x001a:
        if (r11 >= r8) goto L_0x0366;
    L_0x001c:
        r0 = r2.a(r11);	 Catch:{ Exception -> 0x0367 }
        r12 = r0.getName();	 Catch:{ Exception -> 0x0367 }
        r13 = r0.isEncoder();	 Catch:{ Exception -> 0x0367 }
        r14 = ".secure";
        if (r13 == 0) goto L_0x0031;
    L_0x002c:
        r16 = r8;
    L_0x002e:
        r15 = 0;
        goto L_0x026f;
    L_0x0031:
        if (r9 != 0) goto L_0x003a;
    L_0x0033:
        r13 = r12.endsWith(r14);	 Catch:{ Exception -> 0x0367 }
        if (r13 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x002c;
    L_0x003a:
        r13 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0367 }
        r15 = 21;
        if (r13 >= r15) goto L_0x0070;
    L_0x0040:
        r13 = "CIPAACDecoder";
        r13 = r13.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r13 != 0) goto L_0x002c;
    L_0x0048:
        r13 = "CIPMP3Decoder";
        r13 = r13.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r13 != 0) goto L_0x002c;
    L_0x0050:
        r13 = "CIPVorbisDecoder";
        r13 = r13.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r13 != 0) goto L_0x002c;
    L_0x0058:
        r13 = "CIPAMRNBDecoder";
        r13 = r13.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r13 != 0) goto L_0x002c;
    L_0x0060:
        r13 = "AACDecoder";
        r13 = r13.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r13 != 0) goto L_0x002c;
    L_0x0068:
        r13 = "MP3Decoder";
        r13 = r13.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r13 != 0) goto L_0x002c;
    L_0x0070:
        r13 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0367 }
        r15 = 18;
        if (r13 >= r15) goto L_0x009c;
    L_0x0076:
        r13 = "OMX.MTK.AUDIO.DECODER.AAC";
        r13 = r13.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r13 == 0) goto L_0x009c;
    L_0x007e:
        r13 = "a70";
        r15 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r13 = r13.equals(r15);	 Catch:{ Exception -> 0x0367 }
        if (r13 != 0) goto L_0x002c;
    L_0x0088:
        r13 = "Xiaomi";
        r15 = defpackage.ozp.c;	 Catch:{ Exception -> 0x0367 }
        r13 = r13.equals(r15);	 Catch:{ Exception -> 0x0367 }
        if (r13 == 0) goto L_0x009c;
    L_0x0092:
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r15 = "HM";
        r13 = r13.startsWith(r15);	 Catch:{ Exception -> 0x0367 }
        if (r13 != 0) goto L_0x002c;
    L_0x009c:
        r13 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0367 }
        r15 = 16;
        if (r13 != r15) goto L_0x0122;
    L_0x00a2:
        r13 = "OMX.qcom.audio.decoder.mp3";
        r13 = r13.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r13 == 0) goto L_0x0122;
    L_0x00aa:
        r13 = "dlxu";
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r13.equals(r10);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x00b4:
        r10 = "protou";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x00be:
        r10 = "ville";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x00c8:
        r10 = "villeplus";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x00d2:
        r10 = "villec2";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x00dc:
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r13 = "gee";
        r10 = r10.startsWith(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x00e6:
        r10 = "C6602";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x00f0:
        r10 = "C6603";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x00fa:
        r10 = "C6606";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x0104:
        r10 = "C6616";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x010e:
        r10 = "L36h";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x0118:
        r10 = "SO-02E";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x0122:
        r10 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0367 }
        if (r10 != r15) goto L_0x0156;
    L_0x0126:
        r10 = "OMX.qcom.audio.decoder.aac";
        r10 = r10.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r10 == 0) goto L_0x0156;
    L_0x012e:
        r10 = "C1504";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x0138:
        r10 = "C1505";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x0142:
        r10 = "C1604";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x014c:
        r10 = "C1605";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x0156:
        r10 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0367 }
        r13 = 24;
        r15 = "samsung";
        if (r10 >= r13) goto L_0x01c6;
    L_0x015e:
        r10 = "OMX.SEC.aac.dec";
        r10 = r10.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x016e;
    L_0x0166:
        r10 = "OMX.Exynos.AAC.Decoder";
        r10 = r10.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r10 == 0) goto L_0x01c6;
    L_0x016e:
        r10 = defpackage.ozp.c;	 Catch:{ Exception -> 0x0367 }
        r10 = r15.equals(r10);	 Catch:{ Exception -> 0x0367 }
        if (r10 == 0) goto L_0x01c6;
    L_0x0176:
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r13 = "zeroflte";
        r10 = r10.startsWith(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x0180:
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r13 = "zerolte";
        r10 = r10.startsWith(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x018a:
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r13 = "zenlte";
        r10 = r10.startsWith(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x0194:
        r10 = "SC-05G";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x019e:
        r10 = "marinelteatt";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x01a8:
        r10 = "404SC";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x01b2:
        r10 = "SC-04G";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x01bc:
        r10 = "SCV31";
        r13 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002c;
    L_0x01c6:
        r10 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0367 }
        r13 = "jflte";
        r16 = r8;
        r8 = 19;
        if (r10 > r8) goto L_0x0210;
    L_0x01d0:
        r10 = "OMX.SEC.vp8.dec";
        r10 = r10.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r10 == 0) goto L_0x0210;
    L_0x01d8:
        r10 = defpackage.ozp.c;	 Catch:{ Exception -> 0x0367 }
        r10 = r15.equals(r10);	 Catch:{ Exception -> 0x0367 }
        if (r10 == 0) goto L_0x0210;
    L_0x01e0:
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r15 = "d2";
        r10 = r10.startsWith(r15);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002e;
    L_0x01ea:
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r15 = "serrano";
        r10 = r10.startsWith(r15);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002e;
    L_0x01f4:
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r10 = r10.startsWith(r13);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002e;
    L_0x01fc:
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r15 = "santos";
        r10 = r10.startsWith(r15);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002e;
    L_0x0206:
        r10 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r15 = "t0";
        r10 = r10.startsWith(r15);	 Catch:{ Exception -> 0x0367 }
        if (r10 != 0) goto L_0x002e;
    L_0x0210:
        r10 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0367 }
        if (r10 > r8) goto L_0x0224;
    L_0x0214:
        r8 = defpackage.ozp.b;	 Catch:{ Exception -> 0x0367 }
        r8 = r8.startsWith(r13);	 Catch:{ Exception -> 0x0367 }
        if (r8 == 0) goto L_0x0224;
    L_0x021c:
        r8 = "OMX.qcom.video.decoder.vp8";
        r8 = r8.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r8 != 0) goto L_0x002e;
    L_0x0224:
        r8 = "audio/eac3-joc";
        r8 = r8.equals(r3);	 Catch:{ Exception -> 0x0367 }
        if (r8 == 0) goto L_0x0236;
    L_0x022c:
        r8 = "OMX.MTK.AUDIO.DECODER.DSPAC3";
        r8 = r8.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r8 == 0) goto L_0x0236;
    L_0x0234:
        goto L_0x002e;
    L_0x0236:
        r8 = "video/dolby-vision";
        r8 = r3.equals(r8);	 Catch:{ Exception -> 0x0367 }
        if (r8 == 0) goto L_0x025c;
    L_0x023e:
        r8 = "OMX.MS.HEVCDV.Decoder";
        r8 = r8.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r8 != 0) goto L_0x0259;
    L_0x0246:
        r8 = "OMX.RTK.video.decoder";
        r8 = r8.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r8 != 0) goto L_0x0256;
    L_0x024e:
        r8 = "OMX.realtek.video.decoder.tunneled";
        r8 = r8.equals(r12);	 Catch:{ Exception -> 0x0367 }
        if (r8 == 0) goto L_0x025c;
    L_0x0256:
        r15 = "video/dv_hevc";
        goto L_0x026f;
    L_0x0259:
        r15 = "video/hevcdv";
        goto L_0x026f;
    L_0x025c:
        r8 = r0.getSupportedTypes();	 Catch:{ Exception -> 0x0367 }
        r10 = r8.length;	 Catch:{ Exception -> 0x0367 }
        r13 = 0;
    L_0x0262:
        if (r13 >= r10) goto L_0x002e;
    L_0x0264:
        r15 = r8[r13];	 Catch:{ Exception -> 0x0367 }
        r17 = r15.equalsIgnoreCase(r3);	 Catch:{ Exception -> 0x0367 }
        if (r17 != 0) goto L_0x026f;
    L_0x026c:
        r13 = r13 + 1;
        goto L_0x0262;
    L_0x026f:
        if (r15 != 0) goto L_0x0274;
    L_0x0271:
        r13 = 0;
        goto L_0x032d;
    L_0x0274:
        r0 = r0.getCapabilitiesForType(r15);	 Catch:{ Exception -> 0x02fa }
        r8 = r2.a(r5, r15, r0);	 Catch:{ Exception -> 0x02fa }
        r10 = r2.a(r5, r0);	 Catch:{ Exception -> 0x02fa }
        r13 = r1.c;	 Catch:{ Exception -> 0x02fa }
        if (r13 != 0) goto L_0x0287;
    L_0x0284:
        if (r10 != 0) goto L_0x0271;
    L_0x0286:
        goto L_0x028a;
    L_0x0287:
        if (r8 != 0) goto L_0x028a;
    L_0x0289:
        goto L_0x0271;
    L_0x028a:
        r8 = r2.a(r4, r15, r0);	 Catch:{ Exception -> 0x02fa }
        r10 = r2.a(r4, r0);	 Catch:{ Exception -> 0x02fa }
        r13 = r1.b;	 Catch:{ Exception -> 0x02fa }
        if (r13 != 0) goto L_0x0299;
    L_0x0296:
        if (r10 != 0) goto L_0x0271;
    L_0x0298:
        goto L_0x029c;
    L_0x0299:
        if (r8 != 0) goto L_0x029c;
    L_0x029b:
        goto L_0x0271;
    L_0x029c:
        r10 = defpackage.ozp.a;	 Catch:{ Exception -> 0x02fa }
        r13 = 22;
        r2 = 1;
        if (r10 > r13) goto L_0x02ca;
    L_0x02a3:
        r10 = "ODROID-XU3";
        r13 = defpackage.ozp.d;	 Catch:{ Exception -> 0x02fa }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x02fa }
        if (r10 != 0) goto L_0x02b7;
    L_0x02ad:
        r10 = "Nexus 10";
        r13 = defpackage.ozp.d;	 Catch:{ Exception -> 0x02fa }
        r10 = r10.equals(r13);	 Catch:{ Exception -> 0x02fa }
        if (r10 == 0) goto L_0x02ca;
    L_0x02b7:
        r10 = "OMX.Exynos.AVC.Decoder";
        r10 = r10.equals(r12);	 Catch:{ Exception -> 0x02fa }
        if (r10 != 0) goto L_0x02c8;
    L_0x02bf:
        r10 = "OMX.Exynos.AVC.Decoder.secure";
        r10 = r10.equals(r12);	 Catch:{ Exception -> 0x02fa }
        if (r10 != 0) goto L_0x02c8;
    L_0x02c7:
        goto L_0x02ca;
    L_0x02c8:
        r10 = 1;
        goto L_0x02cb;
    L_0x02ca:
        r10 = 0;
    L_0x02cb:
        if (r9 != 0) goto L_0x02ce;
    L_0x02cd:
        goto L_0x02d3;
    L_0x02ce:
        r13 = r1.b;	 Catch:{ Exception -> 0x02fa }
        if (r13 != r8) goto L_0x02d3;
    L_0x02d2:
        goto L_0x02da;
    L_0x02d3:
        if (r9 != 0) goto L_0x02e3;
    L_0x02d5:
        r13 = r1.b;	 Catch:{ Exception -> 0x02fa }
        if (r13 == 0) goto L_0x02da;
    L_0x02d9:
        goto L_0x02e3;
    L_0x02da:
        r13 = 0;
        r0 = defpackage.okq.a(r12, r7, r0, r10, r13);	 Catch:{ Exception -> 0x02f8 }
        r6.add(r0);	 Catch:{ Exception -> 0x02f8 }
        goto L_0x032d;
    L_0x02e3:
        r13 = 0;
        if (r9 != 0) goto L_0x032d;
    L_0x02e6:
        if (r8 == 0) goto L_0x032d;
    L_0x02e8:
        r8 = java.lang.String.valueOf(r12);	 Catch:{ Exception -> 0x02f8 }
        r8 = r8.concat(r14);	 Catch:{ Exception -> 0x02f8 }
        r0 = defpackage.okq.a(r8, r7, r0, r10, r2);	 Catch:{ Exception -> 0x02f8 }
        r6.add(r0);	 Catch:{ Exception -> 0x02f8 }
        return r6;
    L_0x02f8:
        r0 = move-exception;
        goto L_0x02fc;
    L_0x02fa:
        r0 = move-exception;
        r13 = 0;
    L_0x02fc:
        r2 = defpackage.ozp.a;	 Catch:{ Exception -> 0x0367 }
        r8 = 23;
        r10 = "MediaCodecUtil";
        if (r2 > r8) goto L_0x0335;
    L_0x0304:
        r2 = r6.isEmpty();	 Catch:{ Exception -> 0x0367 }
        if (r2 != 0) goto L_0x0335;
    L_0x030a:
        r0 = java.lang.String.valueOf(r12);	 Catch:{ Exception -> 0x0367 }
        r0 = r0.length();	 Catch:{ Exception -> 0x0367 }
        r0 = r0 + 46;
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0367 }
        r2.<init>(r0);	 Catch:{ Exception -> 0x0367 }
        r0 = "Skipping codec ";
        r2.append(r0);	 Catch:{ Exception -> 0x0367 }
        r2.append(r12);	 Catch:{ Exception -> 0x0367 }
        r0 = " (failed to query capabilities)";
        r2.append(r0);	 Catch:{ Exception -> 0x0367 }
        r0 = r2.toString();	 Catch:{ Exception -> 0x0367 }
        defpackage.oyp.b(r10, r0);	 Catch:{ Exception -> 0x0367 }
    L_0x032d:
        r11 = r11 + 1;
        r2 = r19;
        r8 = r16;
        goto L_0x001a;
    L_0x0335:
        r1 = java.lang.String.valueOf(r12);	 Catch:{ Exception -> 0x0367 }
        r1 = r1.length();	 Catch:{ Exception -> 0x0367 }
        r1 = r1 + 25;
        r2 = r15.length();	 Catch:{ Exception -> 0x0367 }
        r1 = r1 + r2;
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0367 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0367 }
        r1 = "Failed to query codec ";
        r2.append(r1);	 Catch:{ Exception -> 0x0367 }
        r2.append(r12);	 Catch:{ Exception -> 0x0367 }
        r1 = " (";
        r2.append(r1);	 Catch:{ Exception -> 0x0367 }
        r2.append(r15);	 Catch:{ Exception -> 0x0367 }
        r1 = ")";
        r2.append(r1);	 Catch:{ Exception -> 0x0367 }
        r1 = r2.toString();	 Catch:{ Exception -> 0x0367 }
        defpackage.oyp.b(r10, r1);	 Catch:{ Exception -> 0x0367 }
        throw r0;	 Catch:{ Exception -> 0x0367 }
    L_0x0366:
        return r6;
    L_0x0367:
        r0 = move-exception;
        r1 = new old;
        r1.<init>(r0);
        goto L_0x036f;
    L_0x036e:
        throw r1;
    L_0x036f:
        goto L_0x036e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okx.a(ola, olc, java.lang.String):java.util.ArrayList");
    }

    private static void a(List list, olh olh) {
        Collections.sort(list, new olb(olh));
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(66, 1);
        c.put(77, 2);
        c.put(88, 4);
        c.put(100, 8);
        c.put(110, 16);
        c.put(afy.av, 32);
        c.put(244, 64);
        sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(10, 1);
        d.put(11, 4);
        d.put(12, 8);
        d.put(13, 16);
        d.put(20, 32);
        d.put(21, 64);
        d.put(22, 128);
        d.put(30, 256);
        d.put(31, 512);
        d.put(32, 1024);
        d.put(40, 2048);
        d.put(41, 4096);
        d.put(42, 8192);
        d.put(50, 16384);
        d.put(51, 32768);
        d.put(52, 65536);
        sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(0, 1);
        e.put(1, 2);
        e.put(2, 4);
        e.put(3, 8);
        sparseIntArray = new SparseIntArray();
        f = sparseIntArray;
        sparseIntArray.put(10, 1);
        f.put(11, 2);
        f.put(20, 4);
        f.put(21, 8);
        f.put(30, 16);
        f.put(31, 32);
        f.put(40, 64);
        f.put(41, 128);
        f.put(50, 256);
        f.put(51, 512);
        f.put(60, 2048);
        f.put(61, 4096);
        f.put(62, 8192);
        HashMap hashMap = new HashMap();
        g = hashMap;
        Integer valueOf = Integer.valueOf(1);
        hashMap.put("L30", valueOf);
        Map map = g;
        Integer valueOf2 = Integer.valueOf(4);
        map.put("L60", valueOf2);
        map = g;
        Integer valueOf3 = Integer.valueOf(16);
        map.put("L63", valueOf3);
        map = g;
        Integer valueOf4 = Integer.valueOf(64);
        map.put("L90", valueOf4);
        map = g;
        Integer valueOf5 = Integer.valueOf(256);
        map.put("L93", valueOf5);
        g.put("L120", Integer.valueOf(1024));
        g.put("L123", Integer.valueOf(4096));
        g.put("L150", Integer.valueOf(16384));
        g.put("L153", Integer.valueOf(65536));
        g.put("L156", Integer.valueOf(262144));
        g.put("L180", Integer.valueOf(1048576));
        g.put("L183", Integer.valueOf(4194304));
        g.put("L186", Integer.valueOf(16777216));
        map = g;
        Integer valueOf6 = Integer.valueOf(2);
        map.put("H30", valueOf6);
        map = g;
        Integer valueOf7 = Integer.valueOf(8);
        map.put("H60", valueOf7);
        map = g;
        Integer valueOf8 = Integer.valueOf(32);
        map.put("H63", valueOf8);
        map = g;
        Integer valueOf9 = Integer.valueOf(128);
        map.put("H90", valueOf9);
        map = g;
        Integer valueOf10 = Integer.valueOf(512);
        map.put("H93", valueOf10);
        g.put("H120", Integer.valueOf(2048));
        g.put("H123", Integer.valueOf(8192));
        g.put("H150", Integer.valueOf(32768));
        g.put("H153", Integer.valueOf(131072));
        g.put("H156", Integer.valueOf(524288));
        g.put("H180", Integer.valueOf(2097152));
        g.put("H183", Integer.valueOf(8388608));
        g.put("H186", Integer.valueOf(33554432));
        hashMap = new HashMap();
        h = hashMap;
        hashMap.put("00", valueOf);
        h.put("01", valueOf6);
        h.put("02", valueOf2);
        h.put("03", valueOf7);
        h.put("04", valueOf3);
        h.put("05", valueOf8);
        h.put("06", valueOf4);
        h.put("07", valueOf9);
        h.put("08", valueOf5);
        h.put("09", valueOf10);
        hashMap = new HashMap();
        i = hashMap;
        hashMap.put("01", valueOf);
        i.put("02", valueOf6);
        i.put("03", valueOf2);
        i.put("04", valueOf7);
        i.put("05", valueOf3);
        i.put("06", valueOf8);
        i.put("07", valueOf4);
        i.put("08", valueOf9);
        i.put("09", valueOf5);
        sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.put(1, 1);
        j.put(2, 2);
        j.put(3, 3);
        j.put(4, 4);
        j.put(5, 5);
        j.put(6, 6);
        j.put(17, 17);
        j.put(20, 20);
        j.put(23, 23);
        j.put(29, 29);
        j.put(39, 39);
        j.put(42, 42);
    }
}
