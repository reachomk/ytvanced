package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: oyu */
public final class oyu {
    private static final ArrayList a = new ArrayList();

    public static String a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i != 64) {
            if (i == 163) {
                return "video/wvc1";
            }
            if (i == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i == 165) {
                return "audio/ac3";
            }
            if (i == 166) {
                return "audio/eac3";
            }
            switch (i) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    break;
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        case 174:
                            return "audio/ac4";
                        default:
                            return null;
                    }
            }
        }
        return "audio/mp4a-latm";
    }

    public static boolean a(String str) {
        return "audio".equals(oyu.i(str));
    }

    public static int h(java.lang.String r4) {
        /*
        r0 = r4.hashCode();
        r1 = 6;
        r2 = 5;
        r3 = 0;
        switch(r0) {
            case -2123537834: goto L_0x0047;
            case -1095064472: goto L_0x003d;
            case 187078296: goto L_0x0033;
            case 187078297: goto L_0x0029;
            case 1504578661: goto L_0x001f;
            case 1505942594: goto L_0x0015;
            case 1556697186: goto L_0x000b;
            default: goto L_0x000a;
        };
    L_0x000a:
        goto L_0x0051;
    L_0x000b:
        r0 = "audio/true-hd";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0051;
    L_0x0013:
        r4 = 6;
        goto L_0x0052;
    L_0x0015:
        r0 = "audio/vnd.dts.hd";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0051;
    L_0x001d:
        r4 = 5;
        goto L_0x0052;
    L_0x001f:
        r0 = "audio/eac3";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0051;
    L_0x0027:
        r4 = 1;
        goto L_0x0052;
    L_0x0029:
        r0 = "audio/ac4";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0051;
    L_0x0031:
        r4 = 3;
        goto L_0x0052;
    L_0x0033:
        r0 = "audio/ac3";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0051;
    L_0x003b:
        r4 = 0;
        goto L_0x0052;
    L_0x003d:
        r0 = "audio/vnd.dts";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0051;
    L_0x0045:
        r4 = 4;
        goto L_0x0052;
    L_0x0047:
        r0 = "audio/eac3-joc";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0051;
    L_0x004f:
        r4 = 2;
        goto L_0x0052;
    L_0x0051:
        r4 = -1;
    L_0x0052:
        switch(r4) {
            case 0: goto L_0x0062;
            case 1: goto L_0x0061;
            case 2: goto L_0x0061;
            case 3: goto L_0x005e;
            case 4: goto L_0x005c;
            case 5: goto L_0x0059;
            case 6: goto L_0x0056;
            default: goto L_0x0055;
        };
    L_0x0055:
        return r3;
    L_0x0056:
        r4 = 14;
        return r4;
    L_0x0059:
        r4 = 8;
        return r4;
    L_0x005c:
        r4 = 7;
        return r4;
    L_0x005e:
        r4 = 17;
        return r4;
    L_0x0061:
        return r1;
    L_0x0062:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyu.h(java.lang.String):int");
    }

    public static boolean b(String str) {
        return "video".equals(oyu.i(str));
    }

    public static boolean c(String str) {
        return "text".equals(oyu.i(str));
    }

    public static String d(String str) {
        if (str != null) {
            for (String f : ozp.h(str)) {
                String f2 = oyu.f(f2);
                if (f2 != null && oyu.b(f2)) {
                    return f2;
                }
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str != null) {
            for (String f : ozp.h(str)) {
                String f2 = oyu.f(f2);
                if (f2 != null && oyu.a(f2)) {
                    return f2;
                }
            }
        }
        return null;
    }

    public static String f(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        str = ozp.d(str.trim());
        if (str.startsWith("avc1") || str.startsWith("avc3")) {
            return "video/avc";
        }
        if (str.startsWith("hev1") || str.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (str.startsWith("dvav") || str.startsWith("dva1") || str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (str.startsWith("av01")) {
            return "video/av01";
        }
        if (str.startsWith("vp9") || str.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (str.startsWith("vp8") || str.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        int i = 0;
        if (str.startsWith("mp4a")) {
            if (str.startsWith("mp4a.")) {
                str = str.substring(5);
                if (str.length() >= 2) {
                    try {
                        str2 = oyu.a(Integer.parseInt(ozp.e(str.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (str.startsWith("ac-3") || str.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (str.startsWith("ec-3") || str.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (str.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (str.startsWith("ac-4") || str.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (str.startsWith("dtsc") || str.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (str.startsWith("dtsh") || str.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.startsWith("opus")) {
                return "audio/opus";
            }
            if (str.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (str.startsWith("flac")) {
                return "audio/flac";
            }
            int size = a.size();
            while (i < size) {
                oyt oyt = (oyt) a.get(i);
                if (str.startsWith(oyt.b)) {
                    str2 = oyt.a;
                    break;
                }
                i++;
            }
            return str2;
        }
    }

    public static int g(String str) {
        int i = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (oyu.a(str)) {
            return 1;
        }
        if (oyu.b(str)) {
            return 2;
        }
        if (oyu.c(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            oyt oyt = (oyt) a.get(i2);
            if (str.equals(oyt.a)) {
                i = oyt.c;
                break;
            }
        }
        return i;
    }

    private static String i(String str) {
        if (str != null) {
            int indexOf = str.indexOf(47);
            if (indexOf != -1) {
                return str.substring(0, indexOf);
            }
        }
        return null;
    }
}
