package defpackage;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* renamed from: bbhd */
public final class bbhd {
    private static final long a = TimeUnit.SECONDS.toNanos(1);

    static bbgs a(Map map) {
        String str = "retryThrottling";
        if (!map.containsKey(str)) {
            return null;
        }
        map = bbhd.b(map, str);
        float floatValue = bbhd.c(map, "maxTokens").floatValue();
        float floatValue2 = bbhd.c(map, "tokenRatio").floatValue();
        boolean z = true;
        amqw.b(floatValue > 0.0f, (Object) "maxToken should be greater than zero");
        if (floatValue2 <= 0.0f) {
            z = false;
        }
        amqw.b(z, (Object) "tokenRatio should be greater than zero");
        return new bbgs(floatValue, floatValue2);
    }

    static Integer b(Map map) {
        String str = "maxAttempts";
        return map.containsKey(str) ? Integer.valueOf(bbhd.c(map, str).intValue()) : null;
    }

    static Long c(Map map) {
        String str = "initialBackoff";
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Long.valueOf(bbhd.a(bbhd.d(map, str)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Long d(Map map) {
        String str = "maxBackoff";
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Long.valueOf(bbhd.a(bbhd.d(map, str)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Double e(Map map) {
        String str = "backoffMultiplier";
        return map.containsKey(str) ? bbhd.c(map, str) : null;
    }

    static List f(Map map) {
        String str = "retryableStatusCodes";
        return map.containsKey(str) ? bbhd.c(bbhd.a(map, str)) : null;
    }

    static Integer g(Map map) {
        String str = "maxAttempts";
        return map.containsKey(str) ? Integer.valueOf(bbhd.c(map, str).intValue()) : null;
    }

    static Long h(Map map) {
        String str = "hedgingDelay";
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Long.valueOf(bbhd.a(bbhd.d(map, str)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static List i(Map map) {
        String str = "nonFatalStatusCodes";
        return map.containsKey(str) ? bbhd.c(bbhd.a(map, str)) : null;
    }

    static String j(Map map) {
        String str = "service";
        return map.containsKey(str) ? bbhd.d(map, str) : null;
    }

    static String k(Map map) {
        String str = "method";
        return map.containsKey(str) ? bbhd.d(map, str) : null;
    }

    static Map l(Map map) {
        String str = "retryPolicy";
        return map.containsKey(str) ? bbhd.b(map, str) : null;
    }

    static Map m(Map map) {
        String str = "hedgingPolicy";
        return map.containsKey(str) ? bbhd.b(map, str) : null;
    }

    static List n(Map map) {
        String str = "name";
        return map.containsKey(str) ? bbhd.b(bbhd.a(map, str)) : null;
    }

    static Long o(Map map) {
        String str = "timeout";
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Long.valueOf(bbhd.a(bbhd.d(map, str)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Boolean p(Map map) {
        String str = "waitForReady";
        if (!map.containsKey(str) || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", new Object[]{obj, str, map}));
    }

    static Integer q(Map map) {
        String str = "maxRequestMessageBytes";
        return map.containsKey(str) ? Integer.valueOf(bbhd.c(map, str).intValue()) : null;
    }

    static Integer r(Map map) {
        String str = "maxResponseMessageBytes";
        return map.containsKey(str) ? Integer.valueOf(bbhd.c(map, str).intValue()) : null;
    }

    static List s(Map map) {
        String str = "methodConfig";
        return map.containsKey(str) ? bbhd.b(bbhd.a(map, str)) : null;
    }

    public static List t(Map map) {
        ArrayList arrayList = new ArrayList();
        String str = "loadBalancingConfig";
        if (map.containsKey(str)) {
            for (Map add : bbhd.b(bbhd.a(map, str))) {
                arrayList.add(add);
            }
        }
        if (arrayList.isEmpty()) {
            str = "loadBalancingPolicy";
            if (map.containsKey(str)) {
                arrayList.add(Collections.singletonMap(bbhd.d(map, str).toLowerCase(Locale.ROOT), Collections.emptyMap()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Map map : list) {
            if (map.size() == 1) {
                String str = (String) ((Entry) map.entrySet().iterator().next()).getKey();
                arrayList.add(new bbhg(str, bbhd.b(map, str)));
            } else {
                int size = map.size();
                String valueOf = String.valueOf(map);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 94);
                stringBuilder.append("There are ");
                stringBuilder.append(size);
                stringBuilder.append(" fields in a LoadBalancingConfig object. Exactly one is expected. Config=");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    static List a(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", new Object[]{obj, str, map}));
    }

    static Map b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", new Object[]{obj, str, map}));
    }

    static Double c(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Double", new Object[]{obj, str, map}));
    }

    private static String d(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", new Object[]{obj, str, map}));
    }

    static List b(List list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof Map) {
                i++;
            } else {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
        return list;
    }

    static List c(List list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof String) {
                i++;
            } else {
                throw new ClassCastException(String.format("value '%s' for idx %d in '%s' is not string", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
        return list;
    }

    /* JADX WARNING: Missing block: B:76:0x0118, code skipped:
            if (r9 < 0) goto L_0x011a;
     */
    /* JADX WARNING: Missing block: B:79:0x011e, code skipped:
            if (r9 <= 0) goto L_0x0120;
     */
    /* JADX WARNING: Missing block: B:80:0x0120, code skipped:
            r7 = java.util.concurrent.TimeUnit.SECONDS.toNanos(r7);
            r12 = r7 + r10;
     */
    /* JADX WARNING: Missing block: B:81:0x012b, code skipped:
            if ((r10 ^ r7) >= 0) goto L_0x012f;
     */
    /* JADX WARNING: Missing block: B:82:0x012d, code skipped:
            r2 = 1;
     */
    /* JADX WARNING: Missing block: B:83:0x012f, code skipped:
            r2 = 0;
     */
    /* JADX WARNING: Missing block: B:85:0x0133, code skipped:
            if ((r7 ^ r12) < 0) goto L_0x0136;
     */
    /* JADX WARNING: Missing block: B:86:0x0135, code skipped:
            r3 = 1;
     */
    /* JADX WARNING: Missing block: B:88:0x0137, code skipped:
            if ((r2 | r3) != 0) goto L_0x0145;
     */
    /* JADX WARNING: Missing block: B:90:0x0144, code skipped:
            return (1 ^ (r12 >>> 63)) + Long.MAX_VALUE;
     */
    /* JADX WARNING: Missing block: B:91:0x0145, code skipped:
            return r12;
     */
    private static long a(java.lang.String r17) {
        /*
        r0 = r17;
        r1 = r17.isEmpty();
        r2 = "Invalid duration string: ";
        r3 = 0;
        if (r1 != 0) goto L_0x0193;
    L_0x000b:
        r1 = r17.length();
        r4 = -1;
        r1 = r1 + r4;
        r1 = r0.charAt(r1);
        r5 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r1 == r5) goto L_0x001b;
    L_0x0019:
        goto L_0x0193;
    L_0x001b:
        r1 = r0.charAt(r3);
        r5 = 45;
        r6 = 1;
        if (r1 != r5) goto L_0x002a;
    L_0x0024:
        r0 = r0.substring(r6);
        r1 = 1;
        goto L_0x002b;
    L_0x002a:
        r1 = 0;
    L_0x002b:
        r5 = r0.length();
        r5 = r5 + r4;
        r5 = r0.substring(r3, r5);
        r7 = 46;
        r7 = r5.indexOf(r7);
        if (r7 == r4) goto L_0x0047;
    L_0x003c:
        r4 = r7 + 1;
        r4 = r5.substring(r4);
        r5 = r5.substring(r3, r7);
        goto L_0x0049;
    L_0x0047:
        r4 = "";
    L_0x0049:
        r7 = java.lang.Long.parseLong(r5);
        r5 = r4.isEmpty();
        if (r5 != 0) goto L_0x0084;
    L_0x0053:
        r5 = 0;
        r9 = 0;
    L_0x0055:
        r10 = 9;
        if (r5 >= r10) goto L_0x0085;
    L_0x0059:
        r9 = r9 * 10;
        r10 = r4.length();
        if (r5 >= r10) goto L_0x0081;
    L_0x0061:
        r10 = r4.charAt(r5);
        r11 = 48;
        if (r10 < r11) goto L_0x0079;
    L_0x0069:
        r10 = r4.charAt(r5);
        r11 = 57;
        if (r10 > r11) goto L_0x0079;
    L_0x0071:
        r10 = r4.charAt(r5);
        r10 = r10 + -48;
        r9 = r9 + r10;
        goto L_0x0081;
    L_0x0079:
        r0 = new java.text.ParseException;
        r1 = "Invalid nanoseconds.";
        r0.<init>(r1, r3);
        throw r0;
    L_0x0081:
        r5 = r5 + 1;
        goto L_0x0055;
    L_0x0084:
        r9 = 0;
    L_0x0085:
        r4 = 0;
        r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r10 >= 0) goto L_0x00a1;
    L_0x008b:
        r1 = new java.text.ParseException;
        r4 = r0.length();
        if (r4 != 0) goto L_0x0099;
    L_0x0093:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x009d;
    L_0x0099:
        r0 = r2.concat(r0);
    L_0x009d:
        r1.<init>(r0, r3);
        throw r1;
    L_0x00a1:
        if (r1 == 0) goto L_0x00a5;
    L_0x00a3:
        r7 = -r7;
        r9 = -r9;
    L_0x00a5:
        r0 = (long) r9;
        r10 = a;	 Catch:{ IllegalArgumentException -> 0x018b }
        r10 = -r10;
        r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x00b3;
    L_0x00ad:
        r10 = a;	 Catch:{ IllegalArgumentException -> 0x018b }
        r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r2 < 0) goto L_0x00d5;
    L_0x00b3:
        r9 = a;	 Catch:{ IllegalArgumentException -> 0x018b }
        r9 = r0 / r9;
        r2 = "overflow: checkedAdd(";
        r11 = r7 + r9;
        r13 = r7 ^ r9;
        r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1));
        if (r15 >= 0) goto L_0x00c3;
    L_0x00c1:
        r13 = 1;
        goto L_0x00c4;
    L_0x00c3:
        r13 = 0;
    L_0x00c4:
        r14 = r7 ^ r11;
        r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r16 < 0) goto L_0x00cc;
    L_0x00ca:
        r14 = 1;
        goto L_0x00cd;
    L_0x00cc:
        r14 = 0;
    L_0x00cd:
        r13 = r13 | r14;
        if (r13 == 0) goto L_0x0161;
    L_0x00d0:
        r7 = a;	 Catch:{ IllegalArgumentException -> 0x018b }
        r0 = r0 % r7;
        r9 = (int) r0;	 Catch:{ IllegalArgumentException -> 0x018b }
        r7 = r11;
    L_0x00d5:
        r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x00da;
    L_0x00d9:
        goto L_0x00e4;
    L_0x00da:
        if (r9 >= 0) goto L_0x00e4;
    L_0x00dc:
        r0 = (long) r9;	 Catch:{ IllegalArgumentException -> 0x018b }
        r9 = a;	 Catch:{ IllegalArgumentException -> 0x018b }
        r0 = r0 + r9;
        r9 = (int) r0;	 Catch:{ IllegalArgumentException -> 0x018b }
        r0 = -1;
        r7 = r7 + r0;
    L_0x00e4:
        r0 = 1;
        r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r2 < 0) goto L_0x00eb;
    L_0x00ea:
        goto L_0x00f3;
    L_0x00eb:
        if (r9 <= 0) goto L_0x00f3;
    L_0x00ed:
        r9 = (long) r9;	 Catch:{ IllegalArgumentException -> 0x018b }
        r11 = a;	 Catch:{ IllegalArgumentException -> 0x018b }
        r9 = r9 - r11;
        r9 = (int) r9;	 Catch:{ IllegalArgumentException -> 0x018b }
        r7 = r7 + r0;
    L_0x00f3:
        r10 = -315576000000; // 0xffffffb686346200 float:-3.3926236E-35 double:NaN;
        r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r2 < 0) goto L_0x0146;
    L_0x00fc:
        r10 = 315576000000; // 0x4979cb9e00 float:1.3215511E35 double:1.55915260252E-312;
        r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r2 > 0) goto L_0x0146;
    L_0x0105:
        r10 = (long) r9;	 Catch:{ IllegalArgumentException -> 0x018b }
        r12 = -999999999; // 0xffffffffc4653601 float:-916.8438 double:NaN;
        r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r2 < 0) goto L_0x0146;
    L_0x010d:
        r12 = a;	 Catch:{ IllegalArgumentException -> 0x018b }
        r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r2 >= 0) goto L_0x0146;
    L_0x0113:
        r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x0118;
    L_0x0117:
        goto L_0x011a;
    L_0x0118:
        if (r9 >= 0) goto L_0x0120;
    L_0x011a:
        r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x0146;
    L_0x011e:
        if (r9 > 0) goto L_0x0146;
    L_0x0120:
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ IllegalArgumentException -> 0x018b }
        r7 = r2.toNanos(r7);	 Catch:{ IllegalArgumentException -> 0x018b }
        r12 = r7 + r10;
        r10 = r10 ^ r7;
        r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x012f;
    L_0x012d:
        r2 = 1;
        goto L_0x0130;
    L_0x012f:
        r2 = 0;
    L_0x0130:
        r7 = r7 ^ r12;
        r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r9 < 0) goto L_0x0136;
    L_0x0135:
        r3 = 1;
    L_0x0136:
        r2 = r2 | r3;
        if (r2 != 0) goto L_0x0145;
    L_0x0139:
        r2 = 63;
        r2 = r12 >>> r2;
        r0 = r0 ^ r2;
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = r0 + r2;
        return r0;
    L_0x0145:
        return r12;
    L_0x0146:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x018b }
        r1 = "Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds";
        r2 = 2;
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalArgumentException -> 0x018b }
        r4 = java.lang.Long.valueOf(r7);	 Catch:{ IllegalArgumentException -> 0x018b }
        r2[r3] = r4;	 Catch:{ IllegalArgumentException -> 0x018b }
        r4 = java.lang.Integer.valueOf(r9);	 Catch:{ IllegalArgumentException -> 0x018b }
        r2[r6] = r4;	 Catch:{ IllegalArgumentException -> 0x018b }
        r1 = java.lang.String.format(r1, r2);	 Catch:{ IllegalArgumentException -> 0x018b }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x018b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x018b }
    L_0x0161:
        r0 = "checkedAdd";
        r1 = new java.lang.ArithmeticException;	 Catch:{ IllegalArgumentException -> 0x018b }
        r0 = r0.length();	 Catch:{ IllegalArgumentException -> 0x018b }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x018b }
        r0 = r0 + 54;
        r4.<init>(r0);	 Catch:{ IllegalArgumentException -> 0x018b }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x018b }
        r4.append(r7);	 Catch:{ IllegalArgumentException -> 0x018b }
        r0 = ", ";
        r4.append(r0);	 Catch:{ IllegalArgumentException -> 0x018b }
        r4.append(r9);	 Catch:{ IllegalArgumentException -> 0x018b }
        r0 = ")";
        r4.append(r0);	 Catch:{ IllegalArgumentException -> 0x018b }
        r0 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x018b }
        r1.<init>(r0);	 Catch:{ IllegalArgumentException -> 0x018b }
        throw r1;	 Catch:{ IllegalArgumentException -> 0x018b }
    L_0x018b:
        r0 = new java.text.ParseException;
        r1 = "Duration value is out of range.";
        r0.<init>(r1, r3);
        throw r0;
    L_0x0193:
        r1 = new java.text.ParseException;
        r4 = r17.length();
        if (r4 != 0) goto L_0x01a1;
    L_0x019b:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x01a5;
    L_0x01a1:
        r0 = r2.concat(r0);
    L_0x01a5:
        r1.<init>(r0, r3);
        goto L_0x01aa;
    L_0x01a9:
        throw r1;
    L_0x01aa:
        goto L_0x01a9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbhd.a(java.lang.String):long");
    }
}
