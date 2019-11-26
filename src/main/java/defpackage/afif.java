package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: afif */
public class afif {
    private static final Pattern d = Pattern.compile("[a-z0-9.]+");
    public final String a;
    public final long b;
    public final Object c;
    private final int e;

    public afif(String str, long j) {
        this(str, j, null);
    }

    public afif(String str, long j, Object obj) {
        this(8, str, j, obj);
    }

    public final String a() {
        Object obj = "";
        int i;
        String a;
        if (this.a.equals(obj)) {
            i = this.e;
            a = afie.a(i);
            if (i != 0) {
                return a.toLowerCase(Locale.ENGLISH);
            }
            throw null;
        }
        i = this.e;
        if (i != 0) {
            if (i != 8) {
                a = afie.a(i);
                if (i != 0) {
                    obj = String.valueOf(a.toLowerCase(Locale.ENGLISH)).concat(".");
                } else {
                    throw null;
                }
            }
            String valueOf = String.valueOf(obj);
            a = String.valueOf(this.a);
            return a.length() == 0 ? new String(valueOf) : valueOf.concat(a);
        }
        throw null;
    }

    public final boolean b() {
        int i = this.e;
        boolean z = i == 4;
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final String c() {
        if (!e()) {
            int i = this.e;
            if (i == 0) {
                throw null;
            } else if (i != 1) {
                return afht.a(this.c, false, 0, 200);
            }
        }
        return afht.a(this.c, true, 1, 200);
    }

    public final boolean d() {
        /*
        r3 = this;
        r0 = r3.a;
        r1 = r0.hashCode();
        r2 = 1;
        switch(r1) {
            case -1799818200: goto L_0x0103;
            case -1764266988: goto L_0x00f8;
            case -1336417371: goto L_0x00ed;
            case -1261329207: goto L_0x00e3;
            case -1171266961: goto L_0x00d8;
            case -753093467: goto L_0x00cd;
            case -665462704: goto L_0x00c3;
            case -586033327: goto L_0x00b9;
            case -547120939: goto L_0x00af;
            case -285378030: goto L_0x00a4;
            case -283551911: goto L_0x0098;
            case -95045900: goto L_0x008d;
            case 0: goto L_0x0082;
            case 3301: goto L_0x0076;
            case 3005864: goto L_0x006b;
            case 3540994: goto L_0x005f;
            case 83706931: goto L_0x0053;
            case 506615561: goto L_0x0048;
            case 514665859: goto L_0x003c;
            case 697384568: goto L_0x0030;
            case 1486707235: goto L_0x0024;
            case 1592401765: goto L_0x0018;
            case 2112079600: goto L_0x000c;
            default: goto L_0x000a;
        };
    L_0x000a:
        goto L_0x010e;
    L_0x000c:
        r1 = "fmt.noneavailable";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x0014:
        r1 = 9;
        goto L_0x010f;
    L_0x0018:
        r1 = "policy.app";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x0020:
        r1 = 22;
        goto L_0x010f;
    L_0x0024:
        r1 = "qoe.livewindow";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x002c:
        r1 = 20;
        goto L_0x010f;
    L_0x0030:
        r1 = "player.fatalexception";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x0038:
        r1 = 18;
        goto L_0x010f;
    L_0x003c:
        r1 = "surfaceunavailable";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x0044:
        r1 = 19;
        goto L_0x010f;
    L_0x0048:
        r1 = "keyerror";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x0050:
        r1 = 3;
        goto L_0x010f;
    L_0x0053:
        r1 = "fmt.unparseable";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x005b:
        r1 = 10;
        goto L_0x010f;
    L_0x005f:
        r1 = "stop";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x0067:
        r1 = 13;
        goto L_0x010f;
    L_0x006b:
        r1 = "auth";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x0073:
        r1 = 2;
        goto L_0x010f;
    L_0x0076:
        r1 = "gl";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x007e:
        r1 = 12;
        goto L_0x010f;
    L_0x0082:
        r1 = "";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x008a:
        r1 = 1;
        goto L_0x010f;
    L_0x008d:
        r1 = "missingapi";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x0095:
        r1 = 4;
        goto L_0x010f;
    L_0x0098:
        r1 = "player.outofmemory";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x00a0:
        r1 = 17;
        goto L_0x010f;
    L_0x00a4:
        r1 = "net.retryexhausted";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x00ac:
        r1 = 16;
        goto L_0x010f;
    L_0x00af:
        r1 = "provision";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x00b7:
        r1 = 5;
        goto L_0x010f;
    L_0x00b9:
        r1 = "android.hfrdroppedframes";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x00c1:
        r1 = 0;
        goto L_0x010f;
    L_0x00c3:
        r1 = "unavailable";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x00cb:
        r1 = 6;
        goto L_0x010f;
    L_0x00cd:
        r1 = "servererror";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x00d5:
        r1 = 14;
        goto L_0x010f;
    L_0x00d8:
        r1 = "fmt.decode";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x00e0:
        r1 = 8;
        goto L_0x010f;
    L_0x00e3:
        r1 = "unimplemented";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x00eb:
        r1 = 7;
        goto L_0x010f;
    L_0x00ed:
        r1 = "offline.fmt.noneavailable";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x00f5:
        r1 = 21;
        goto L_0x010f;
    L_0x00f8:
        r1 = "unparseable";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x0100:
        r1 = 15;
        goto L_0x010f;
    L_0x0103:
        r1 = "fmt.unplayable";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x010e;
    L_0x010b:
        r1 = 11;
        goto L_0x010f;
    L_0x010e:
        r1 = -1;
    L_0x010f:
        switch(r1) {
            case 0: goto L_0x0119;
            case 1: goto L_0x0119;
            case 2: goto L_0x0119;
            case 3: goto L_0x0119;
            case 4: goto L_0x0119;
            case 5: goto L_0x0119;
            case 6: goto L_0x0119;
            case 7: goto L_0x0119;
            case 8: goto L_0x0119;
            case 9: goto L_0x0119;
            case 10: goto L_0x0119;
            case 11: goto L_0x0119;
            case 12: goto L_0x0119;
            case 13: goto L_0x0119;
            case 14: goto L_0x0119;
            case 15: goto L_0x0119;
            case 16: goto L_0x0119;
            case 17: goto L_0x0119;
            case 18: goto L_0x0119;
            case 19: goto L_0x0119;
            case 20: goto L_0x0119;
            case 21: goto L_0x0119;
            case 22: goto L_0x0119;
            default: goto L_0x0112;
        };
    L_0x0112:
        r1 = ".fatal";
        r0 = r0.endsWith(r1);
        return r0;
    L_0x0119:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afif.d():boolean");
    }

    public final boolean e() {
        return this.a.startsWith("net.");
    }

    public final afif f() {
        if (d()) {
            return this;
        }
        String valueOf;
        if (this.a.startsWith("net.")) {
            int i = this.e;
            long j = this.b;
            valueOf = String.valueOf(this.a);
            String str = "e.";
            return new afif(i, "net.retryexhausted", j, valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        } else if (this.a.equals("player.exception")) {
            return new afif(this.e, "player.fatalexception", this.b, this.c);
        } else {
            int i2 = this.e;
            valueOf = String.valueOf(this.a);
            String str2 = ".fatal";
            return new afif(i2, str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2), this.b, this.c);
        }
    }

    public afif(int i, String str, long j) {
        this(i, str, j, null);
    }

    /* JADX WARNING: Missing block: B:50:0x00bc, code skipped:
            if (r11.equals("unimplemented") != false) goto L_0x00cb;
     */
    public afif(int r10, java.lang.String r11, long r12, java.lang.Object r14) {
        /*
        r9 = this;
        r9.<init>();
        r0 = 0;
        if (r10 == 0) goto L_0x0111;
    L_0x0006:
        r1 = 4;
        r2 = 0;
        r3 = 1;
        if (r10 == r1) goto L_0x000d;
    L_0x000b:
        r4 = 0;
        goto L_0x000e;
    L_0x000d:
        r4 = 1;
    L_0x000e:
        if (r10 != r1) goto L_0x0016;
    L_0x0010:
        r5 = r11.isEmpty();
        if (r5 != 0) goto L_0x0108;
    L_0x0016:
        defpackage.xvd.a(r11);
        r5 = d;
        r5 = r5.matcher(r11);
        r5 = r5.matches();
        if (r5 != 0) goto L_0x0041;
    L_0x0025:
        r10 = new java.lang.IllegalArgumentException;
        r11 = java.lang.String.valueOf(r11);
        r12 = "Invalid code: ";
        r13 = r11.length();
        if (r13 != 0) goto L_0x0039;
    L_0x0033:
        r11 = new java.lang.String;
        r11.<init>(r12);
        goto L_0x003d;
    L_0x0039:
        r11 = r12.concat(r11);
    L_0x003d:
        r10.<init>(r11);
        throw r10;
    L_0x0041:
        r5 = r11.hashCode();
        r6 = 2;
        r7 = 5;
        r8 = 6;
        switch(r5) {
            case -1764266988: goto L_0x00bf;
            case -1261329207: goto L_0x00b6;
            case -1091234348: goto L_0x00ac;
            case -966515002: goto L_0x00a1;
            case -753093467: goto L_0x0096;
            case -665462704: goto L_0x008c;
            case -547120939: goto L_0x0082;
            case -95045900: goto L_0x0078;
            case 0: goto L_0x006e;
            case 3005864: goto L_0x0064;
            case 3540994: goto L_0x0058;
            case 506615561: goto L_0x004d;
            default: goto L_0x004b;
        };
    L_0x004b:
        goto L_0x00ca;
    L_0x004d:
        r1 = "keyerror";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x0055:
        r1 = 1;
        goto L_0x00cb;
    L_0x0058:
        r1 = "stop";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x0060:
        r1 = 9;
        goto L_0x00cb;
    L_0x0064:
        r1 = "auth";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x006c:
        r1 = 0;
        goto L_0x00cb;
    L_0x006e:
        r1 = "";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x0076:
        r1 = 7;
        goto L_0x00cb;
    L_0x0078:
        r1 = "missingapi";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x0080:
        r1 = 3;
        goto L_0x00cb;
    L_0x0082:
        r1 = "provision";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x008a:
        r1 = 2;
        goto L_0x00cb;
    L_0x008c:
        r1 = "unavailable";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x0094:
        r1 = 5;
        goto L_0x00cb;
    L_0x0096:
        r1 = "servererror";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x009e:
        r1 = 10;
        goto L_0x00cb;
    L_0x00a1:
        r1 = "response.parse";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x00a9:
        r1 = 11;
        goto L_0x00cb;
    L_0x00ac:
        r1 = "hdunavailable";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x00b4:
        r1 = 6;
        goto L_0x00cb;
    L_0x00b6:
        r5 = "unimplemented";
        r5 = r11.equals(r5);
        if (r5 == 0) goto L_0x00ca;
    L_0x00be:
        goto L_0x00cb;
    L_0x00bf:
        r1 = "unparseable";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x00ca;
    L_0x00c7:
        r1 = 8;
        goto L_0x00cb;
    L_0x00ca:
        r1 = -1;
    L_0x00cb:
        switch(r1) {
            case 0: goto L_0x00ea;
            case 1: goto L_0x00ea;
            case 2: goto L_0x00ea;
            case 3: goto L_0x00ea;
            case 4: goto L_0x00ea;
            case 5: goto L_0x00ea;
            case 6: goto L_0x00ea;
            case 7: goto L_0x00ea;
            case 8: goto L_0x00e1;
            case 9: goto L_0x00d8;
            case 10: goto L_0x00d8;
            case 11: goto L_0x00cf;
            default: goto L_0x00ce;
        };
    L_0x00ce:
        goto L_0x0108;
    L_0x00cf:
        if (r10 == r3) goto L_0x00d3;
    L_0x00d1:
        r4 = 0;
        goto L_0x00d4;
    L_0x00d3:
        r4 = 1;
    L_0x00d4:
        if (r10 == 0) goto L_0x00d7;
    L_0x00d6:
        goto L_0x00ec;
    L_0x00d7:
        throw r0;
    L_0x00d8:
        if (r10 == r8) goto L_0x00dc;
    L_0x00da:
        r4 = 0;
        goto L_0x00dd;
    L_0x00dc:
        r4 = 1;
    L_0x00dd:
        if (r10 == 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00ec;
    L_0x00e0:
        throw r0;
    L_0x00e1:
        if (r10 == r7) goto L_0x00e5;
    L_0x00e3:
        r4 = 0;
        goto L_0x00e6;
    L_0x00e5:
        r4 = 1;
    L_0x00e6:
        if (r10 == 0) goto L_0x00e9;
    L_0x00e8:
        goto L_0x00ec;
    L_0x00e9:
        throw r0;
    L_0x00ea:
        if (r10 == 0) goto L_0x0107;
    L_0x00ec:
        if (r4 != 0) goto L_0x0108;
    L_0x00ee:
        r12 = new java.lang.IllegalArgumentException;
        r13 = new java.lang.Object[r6];
        r14 = defpackage.afie.a(r10);
        if (r10 == 0) goto L_0x0106;
    L_0x00f8:
        r13[r2] = r14;
        r13[r3] = r11;
        r10 = "Invalid context for code: %s %s";
        r10 = java.lang.String.format(r10, r13);
        r12.<init>(r10);
        throw r12;
    L_0x0106:
        throw r0;
    L_0x0107:
        throw r0;
    L_0x0108:
        r9.a = r11;
        r9.e = r10;
        r9.b = r12;
        r9.c = r14;
        return;
    L_0x0111:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afif.<init>(int, java.lang.String, long, java.lang.Object):void");
    }
}
