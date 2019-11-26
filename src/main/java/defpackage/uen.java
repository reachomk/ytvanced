package defpackage;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* renamed from: uen */
final class uen {
    public static final uek a = new uem();
    private static final Logger b = Logger.getLogger(uen.class.getName());

    private uen() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a7 A:{Catch:{ IOException -> 0x00ab }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3 A:{SYNTHETIC, Splitter:B:37:0x00a3} */
    static defpackage.ues a(java.lang.Object r4, java.util.concurrent.ConcurrentHashMap r5, java.lang.String r6, defpackage.uek r7) {
        /*
        r0 = "error closing input stream (ignored)";
        r1 = "cannot load/parse metadata";
        r2 = r5.get(r4);
        r2 = (defpackage.ues) r2;
        if (r2 != 0) goto L_0x00cb;
    L_0x000c:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r6);
        r6 = "_";
        r2.append(r6);
        r2.append(r4);
        r6 = r2.toString();
        r7 = r7.a(r6);
        if (r7 == 0) goto L_0x00b4;
    L_0x0026:
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x0099 }
        r2.<init>(r7);	 Catch:{ IOException -> 0x0099 }
        r3 = new uev;	 Catch:{ all -> 0x0095 }
        r3.<init>();	 Catch:{ all -> 0x0095 }
        r3.readExternal(r2);	 Catch:{ IOException -> 0x008e }
        r2.close();	 Catch:{ IOException -> 0x0037 }
        goto L_0x003f;
    L_0x0037:
        r7 = move-exception;
        r1 = b;
        r2 = java.util.logging.Level.WARNING;
        r1.log(r2, r0, r7);
    L_0x003f:
        r7 = r3.a;
        r0 = r7.size();
        if (r0 == 0) goto L_0x0077;
    L_0x0047:
        r0 = r7.size();
        r1 = 1;
        if (r0 <= r1) goto L_0x0066;
    L_0x004e:
        r0 = b;
        r1 = java.util.logging.Level.WARNING;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "more than one metadata in file ";
        r2.append(r3);
        r2.append(r6);
        r6 = r2.toString();
        r0.log(r1, r6);
    L_0x0066:
        r6 = 0;
        r6 = r7.get(r6);
        r6 = (defpackage.ues) r6;
        r4 = r5.putIfAbsent(r4, r6);
        r4 = (defpackage.ues) r4;
        if (r4 == 0) goto L_0x0076;
    L_0x0075:
        return r4;
    L_0x0076:
        return r6;
    L_0x0077:
        r4 = new java.lang.IllegalStateException;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r7 = "empty metadata: ";
        r5.append(r7);
        r5.append(r6);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
    L_0x008e:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0095 }
        r5.<init>(r1, r4);	 Catch:{ all -> 0x0095 }
        throw r5;	 Catch:{ all -> 0x0095 }
    L_0x0095:
        r4 = move-exception;
        goto L_0x00a1;
    L_0x0097:
        r4 = move-exception;
        goto L_0x00a0;
    L_0x0099:
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0097 }
        r5.<init>(r1, r4);	 Catch:{ all -> 0x0097 }
        throw r5;	 Catch:{ all -> 0x0097 }
    L_0x00a0:
        r2 = 0;
    L_0x00a1:
        if (r2 == 0) goto L_0x00a7;
    L_0x00a3:
        r2.close();	 Catch:{ IOException -> 0x00ab }
        goto L_0x00b3;
    L_0x00a7:
        r7.close();	 Catch:{ IOException -> 0x00ab }
        goto L_0x00b3;
    L_0x00ab:
        r5 = move-exception;
        r6 = b;
        r7 = java.util.logging.Level.WARNING;
        r6.log(r7, r0, r5);
    L_0x00b3:
        throw r4;
    L_0x00b4:
        r4 = new java.lang.IllegalStateException;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r7 = "missing metadata: ";
        r5.append(r7);
        r5.append(r6);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
    L_0x00cb:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uen.a(java.lang.Object, java.util.concurrent.ConcurrentHashMap, java.lang.String, uek):ues");
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap = new ConcurrentHashMap();
        HashSet hashSet = new HashSet(62);
        hashSet.add(Integer.valueOf(7));
        hashSet.add(Integer.valueOf(27));
        hashSet.add(Integer.valueOf(30));
        hashSet.add(Integer.valueOf(31));
        hashSet.add(Integer.valueOf(34));
        hashSet.add(Integer.valueOf(36));
        hashSet.add(Integer.valueOf(39));
        hashSet.add(Integer.valueOf(43));
        hashSet.add(Integer.valueOf(44));
        hashSet.add(Integer.valueOf(49));
        hashSet.add(Integer.valueOf(52));
        hashSet.add(Integer.valueOf(54));
        hashSet.add(Integer.valueOf(55));
        hashSet.add(Integer.valueOf(58));
        hashSet.add(Integer.valueOf(61));
        hashSet.add(Integer.valueOf(62));
        hashSet.add(Integer.valueOf(63));
        hashSet.add(Integer.valueOf(64));
        hashSet.add(Integer.valueOf(66));
        hashSet.add(Integer.valueOf(81));
        hashSet.add(Integer.valueOf(84));
        hashSet.add(Integer.valueOf(90));
        hashSet.add(Integer.valueOf(91));
        hashSet.add(Integer.valueOf(94));
        hashSet.add(Integer.valueOf(95));
        hashSet.add(Integer.valueOf(255));
        hashSet.add(Integer.valueOf(350));
        hashSet.add(Integer.valueOf(351));
        hashSet.add(Integer.valueOf(352));
        hashSet.add(Integer.valueOf(358));
        hashSet.add(Integer.valueOf(359));
        hashSet.add(Integer.valueOf(372));
        hashSet.add(Integer.valueOf(373));
        hashSet.add(Integer.valueOf(380));
        hashSet.add(Integer.valueOf(381));
        hashSet.add(Integer.valueOf(385));
        hashSet.add(Integer.valueOf(505));
        hashSet.add(Integer.valueOf(506));
        hashSet.add(Integer.valueOf(595));
        hashSet.add(Integer.valueOf(675));
        hashSet.add(Integer.valueOf(676));
        hashSet.add(Integer.valueOf(679));
        hashSet.add(Integer.valueOf(855));
        hashSet.add(Integer.valueOf(856));
        hashSet.add(Integer.valueOf(971));
        hashSet.add(Integer.valueOf(972));
        hashSet.add(Integer.valueOf(995));
        hashSet = new HashSet(320);
        hashSet.add("AC");
        hashSet.add("AD");
        hashSet.add("AE");
        hashSet.add("AF");
        hashSet.add("AG");
        hashSet.add("AI");
        hashSet.add("AL");
        hashSet.add("AM");
        hashSet.add("AO");
        hashSet.add("AR");
        hashSet.add("AS");
        hashSet.add("AT");
        hashSet.add("AU");
        hashSet.add("AW");
        hashSet.add("AX");
        hashSet.add("AZ");
        hashSet.add("BA");
        hashSet.add("BB");
        hashSet.add("BD");
        hashSet.add("BE");
        hashSet.add("BF");
        hashSet.add("BG");
        hashSet.add("BH");
        hashSet.add("BI");
        hashSet.add("BJ");
        hashSet.add("BL");
        hashSet.add("BM");
        hashSet.add("BN");
        hashSet.add("BO");
        hashSet.add("BQ");
        hashSet.add("BR");
        hashSet.add("BS");
        hashSet.add("BT");
        hashSet.add("BW");
        hashSet.add("BY");
        hashSet.add("BZ");
        hashSet.add("CA");
        hashSet.add("CC");
        hashSet.add("CD");
        hashSet.add("CF");
        hashSet.add("CG");
        hashSet.add("CH");
        hashSet.add("CI");
        hashSet.add("CK");
        hashSet.add("CL");
        hashSet.add("CM");
        hashSet.add("CN");
        hashSet.add("CO");
        hashSet.add("CR");
        hashSet.add("CU");
        hashSet.add("CV");
        hashSet.add("CW");
        hashSet.add("CX");
        hashSet.add("CY");
        hashSet.add("CZ");
        hashSet.add("DE");
        hashSet.add("DJ");
        hashSet.add("DK");
        hashSet.add("DM");
        hashSet.add("DO");
        hashSet.add("DZ");
        hashSet.add("EC");
        hashSet.add("EE");
        hashSet.add("EG");
        hashSet.add("EH");
        hashSet.add("ER");
        hashSet.add("ES");
        hashSet.add("ET");
        hashSet.add("FI");
        hashSet.add("FJ");
        hashSet.add("FK");
        hashSet.add("FM");
        hashSet.add("FO");
        hashSet.add("FR");
        hashSet.add("GA");
        hashSet.add("GB");
        hashSet.add("GD");
        hashSet.add("GE");
        hashSet.add("GF");
        hashSet.add("GG");
        hashSet.add("GH");
        hashSet.add("GI");
        hashSet.add("GL");
        hashSet.add("GM");
        hashSet.add("GN");
        hashSet.add("GP");
        hashSet.add("GR");
        hashSet.add("GT");
        hashSet.add("GU");
        hashSet.add("GW");
        hashSet.add("GY");
        hashSet.add("HK");
        hashSet.add("HN");
        hashSet.add("HR");
        hashSet.add("HT");
        hashSet.add("HU");
        hashSet.add("ID");
        hashSet.add("IE");
        hashSet.add("IL");
        hashSet.add("IM");
        hashSet.add("IN");
        hashSet.add("IQ");
        hashSet.add("IR");
        hashSet.add("IS");
        hashSet.add("IT");
        hashSet.add("JE");
        hashSet.add("JM");
        hashSet.add("JO");
        hashSet.add("JP");
        hashSet.add("KE");
        hashSet.add("KG");
        hashSet.add("KH");
        hashSet.add("KI");
        hashSet.add("KM");
        hashSet.add("KN");
        hashSet.add("KP");
        hashSet.add("KR");
        hashSet.add("KW");
        hashSet.add("KY");
        hashSet.add("KZ");
        hashSet.add("LA");
        hashSet.add("LB");
        hashSet.add("LC");
        hashSet.add("LI");
        hashSet.add("LK");
        hashSet.add("LR");
        hashSet.add("LS");
        hashSet.add("LT");
        hashSet.add("LU");
        hashSet.add("LV");
        hashSet.add("LY");
        hashSet.add("MA");
        hashSet.add("MC");
        hashSet.add("MD");
        hashSet.add("ME");
        hashSet.add("MF");
        hashSet.add("MG");
        hashSet.add("MH");
        hashSet.add("MK");
        hashSet.add("ML");
        hashSet.add("MM");
        hashSet.add("MN");
        hashSet.add("MO");
        hashSet.add("MP");
        hashSet.add("MQ");
        hashSet.add("MR");
        hashSet.add("MS");
        hashSet.add("MT");
        hashSet.add("MU");
        hashSet.add("MV");
        hashSet.add("MW");
        hashSet.add("MX");
        hashSet.add("MY");
        hashSet.add("MZ");
        hashSet.add("NA");
        hashSet.add("NC");
        hashSet.add("NE");
        hashSet.add("NF");
        hashSet.add("NG");
        hashSet.add("NI");
        hashSet.add("NL");
        hashSet.add("NO");
        hashSet.add("NP");
        hashSet.add("NR");
        hashSet.add("NU");
        hashSet.add("NZ");
        hashSet.add("OM");
        hashSet.add("PA");
        hashSet.add("PE");
        hashSet.add("PF");
        hashSet.add("PG");
        hashSet.add("PH");
        hashSet.add("PK");
        hashSet.add("PL");
        hashSet.add("PM");
        hashSet.add("PR");
        hashSet.add("PS");
        hashSet.add("PT");
        hashSet.add("PW");
        hashSet.add("PY");
        hashSet.add("QA");
        hashSet.add("RE");
        hashSet.add("RO");
        hashSet.add("RS");
        hashSet.add("RU");
        hashSet.add("RW");
        hashSet.add("SA");
        hashSet.add("SB");
        hashSet.add("SC");
        hashSet.add("SD");
        hashSet.add("SE");
        hashSet.add("SG");
        hashSet.add("SH");
        hashSet.add("SI");
        hashSet.add("SJ");
        hashSet.add("SK");
        hashSet.add("SL");
        hashSet.add("SM");
        hashSet.add("SN");
        hashSet.add("SO");
        hashSet.add("SR");
        hashSet.add("ST");
        hashSet.add("SV");
        hashSet.add("SX");
        hashSet.add("SY");
        hashSet.add("SZ");
        hashSet.add("TC");
        hashSet.add("TD");
        hashSet.add("TG");
        hashSet.add("TH");
        hashSet.add("TJ");
        hashSet.add("TL");
        hashSet.add("TM");
        hashSet.add("TN");
        hashSet.add("TO");
        hashSet.add("TR");
        hashSet.add("TT");
        hashSet.add("TV");
        hashSet.add("TW");
        hashSet.add("TZ");
        hashSet.add("UA");
        hashSet.add("UG");
        hashSet.add("US");
        hashSet.add("UY");
        hashSet.add("UZ");
        hashSet.add("VA");
        hashSet.add("VC");
        hashSet.add("VE");
        hashSet.add("VG");
        hashSet.add("VI");
        hashSet.add("VN");
        hashSet.add("VU");
        hashSet.add("WF");
        hashSet.add("WS");
        hashSet.add("XK");
        hashSet.add("YE");
        hashSet.add("YT");
        hashSet.add("ZA");
        hashSet.add("ZM");
        hashSet.add("ZW");
    }
}
