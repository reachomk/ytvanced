package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: twl */
final class twl {
    private static final Set a = new HashSet(Arrays.asList(new String[]{"googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com"}));
    private static final Pattern b = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    private static final Pattern c = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern d = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    private static final Pattern e = Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final Pattern f = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    private final boolean g;
    private final tzv h;
    private final amqp i;

    twl(boolean z, tzv tzv, amqp amqp) {
        this.g = z;
        this.h = tzv;
        this.i = amqp;
    }

    private static String a(String str) {
        Matcher matcher = d.matcher(str);
        return matcher.matches() ? matcher.group(1) : null;
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceFirst("<ip>");
        }
        return str;
    }

    /* Access modifiers changed, original: final|varargs */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x031c A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0310 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021f  */
    public final defpackage.bcfe a(defpackage.twm... r14) {
        /*
        r13 = this;
        r0 = defpackage.bcca.b;
        r0 = r0.createBuilder();
        r0 = (defpackage.bcbz) r0;
        r1 = 0;
        r2 = 0;
    L_0x000a:
        r3 = r14.length;
        r4 = "NetworkCollector";
        if (r2 < r3) goto L_0x004f;
    L_0x000f:
        r14 = defpackage.bcfe.x;
        r14 = r14.createBuilder();
        r14 = (defpackage.bcfd) r14;
        r14.a(r0);
        r0 = r13.i;	 Catch:{ Exception -> 0x003e }
        r0 = r0.a();	 Catch:{ Exception -> 0x003e }
        if (r0 == 0) goto L_0x0046;
    L_0x0022:
        r0 = r13.i;	 Catch:{ Exception -> 0x003e }
        r0 = r0.b();	 Catch:{ Exception -> 0x003e }
        r0 = (defpackage.two) r0;	 Catch:{ Exception -> 0x003e }
        r0 = r0.a();	 Catch:{ Exception -> 0x003e }
        r2 = r0.a();	 Catch:{ Exception -> 0x003e }
        if (r2 == 0) goto L_0x0046;
    L_0x0034:
        r0 = r0.b();	 Catch:{ Exception -> 0x003e }
        r0 = (defpackage.bcbb) r0;	 Catch:{ Exception -> 0x003e }
        r14.a(r0);	 Catch:{ Exception -> 0x003e }
        goto L_0x0046;
    L_0x003e:
        r0 = move-exception;
        r1 = new java.lang.Object[r1];
        r2 = "Exception while getting network metric extension!";
        defpackage.tyv.b(r4, r2, r0, r1);
    L_0x0046:
        r14 = r14.build();
        r14 = (defpackage.anxl) r14;
        r14 = (defpackage.bcfe) r14;
        return r14;
    L_0x004f:
        r3 = defpackage.bcbw.v;
        r3 = r3.createBuilder();
        r3 = (defpackage.bcbv) r3;
        r5 = r14[r2];
        r5 = r5.e;
        if (r5 > 0) goto L_0x005e;
    L_0x005d:
        goto L_0x006d;
    L_0x005e:
        r3.copyOnWrite();
        r6 = r3.instance;
        r6 = (defpackage.bcbw) r6;
        r7 = r6.a;
        r7 = r7 | 128;
        r6.a = r7;
        r6.h = r5;
    L_0x006d:
        r5 = r14[r2];
        r5 = r5.d;
        if (r5 > 0) goto L_0x0074;
    L_0x0073:
        goto L_0x0083;
    L_0x0074:
        r3.copyOnWrite();
        r6 = r3.instance;
        r6 = (defpackage.bcbw) r6;
        r7 = r6.a;
        r7 = r7 | 64;
        r6.a = r7;
        r6.g = r5;
    L_0x0083:
        r5 = r14[r2];
        r5 = r5.c;
        r7 = 0;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 > 0) goto L_0x008e;
    L_0x008d:
        goto L_0x009e;
    L_0x008e:
        r3.copyOnWrite();
        r9 = r3.instance;
        r9 = (defpackage.bcbw) r9;
        r10 = r9.a;
        r10 = r10 | 8;
        r9.a = r10;
        r6 = (int) r5;
        r9.d = r6;
    L_0x009e:
        r5 = r14[r2];
        r5 = r5.b;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 > 0) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00b7;
    L_0x00a7:
        r3.copyOnWrite();
        r9 = r3.instance;
        r9 = (defpackage.bcbw) r9;
        r10 = r9.a;
        r10 = r10 | 16;
        r9.a = r10;
        r6 = (int) r5;
        r9.e = r6;
    L_0x00b7:
        r5 = r14[r2];
        r5 = r5.h;
        if (r5 >= 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x00cd;
    L_0x00be:
        r3.copyOnWrite();
        r6 = r3.instance;
        r6 = (defpackage.bcbw) r6;
        r9 = r6.a;
        r9 = r9 | 32;
        r6.a = r9;
        r6.f = r5;
    L_0x00cd:
        r5 = r14[r2];
        r5 = r5.i;
        r6 = 0;
        r9 = 1;
        if (r5 != 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x0107;
    L_0x00d6:
        r10 = r5.isEmpty();
        if (r10 != 0) goto L_0x00f6;
    L_0x00dc:
        r10 = b;
        r10 = r10.matcher(r5);
        r11 = r10.find();
        if (r11 == 0) goto L_0x00ed;
    L_0x00e8:
        r4 = r10.group(r1);
        goto L_0x00f7;
    L_0x00ed:
        r10 = new java.lang.String[r9];
        r10[r1] = r5;
        r5 = "contentType extraction failed for %s, skipping logging path";
        defpackage.tyv.d(r4, r5, r10);
    L_0x00f6:
        r4 = r6;
    L_0x00f7:
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        if (r4 == 0) goto L_0x031c;
    L_0x0100:
        r10 = r5.a;
        r10 = r10 | r9;
        r5.a = r10;
        r5.b = r4;
    L_0x0107:
        r4 = r14[r2];
        r4 = r4.g;
        r5 = 2;
        if (r4 == 0) goto L_0x0151;
    L_0x010e:
        r10 = r4.isEmpty();
        if (r10 != 0) goto L_0x0151;
    L_0x0114:
        r10 = "http/1.1";
        r10 = r4.equals(r10);
        if (r10 != 0) goto L_0x014f;
    L_0x011c:
        r10 = "spdy/2";
        r10 = r4.equals(r10);
        if (r10 != 0) goto L_0x014d;
    L_0x0124:
        r10 = "spdy/3";
        r10 = r4.equals(r10);
        if (r10 != 0) goto L_0x014b;
    L_0x012c:
        r10 = "spdy/3.1";
        r10 = r4.equals(r10);
        if (r10 != 0) goto L_0x0149;
    L_0x0134:
        r10 = "h2";
        r10 = r4.startsWith(r10);
        if (r10 != 0) goto L_0x0147;
    L_0x013c:
        r10 = "quic/1+spdy/3";
        r4 = r4.equals(r10);
        if (r4 != 0) goto L_0x0145;
    L_0x0144:
        goto L_0x0151;
    L_0x0145:
        r4 = 7;
        goto L_0x0152;
    L_0x0147:
        r4 = 6;
        goto L_0x0152;
    L_0x0149:
        r4 = 5;
        goto L_0x0152;
    L_0x014b:
        r4 = 4;
        goto L_0x0152;
    L_0x014d:
        r4 = 3;
        goto L_0x0152;
    L_0x014f:
        r4 = 2;
        goto L_0x0152;
    L_0x0151:
        r4 = 1;
    L_0x0152:
        r3.copyOnWrite();
        r10 = r3.instance;
        r10 = (defpackage.bcbw) r10;
        r11 = r10.a;
        r11 = r11 | 256;
        r10.a = r11;
        r4 = r4 + -1;
        r10.i = r4;
        r4 = r14[r2];
        r4 = r4.f;
        if (r4 == 0) goto L_0x01d7;
    L_0x0169:
        r10 = defpackage.twl.a(r4);
        r11 = r13.g;
        if (r11 != 0) goto L_0x0172;
    L_0x0171:
        goto L_0x01b9;
    L_0x0172:
        r11 = a;
        r11 = r11.iterator();
    L_0x0178:
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x01b9;
    L_0x017e:
        r12 = r11.next();
        r12 = (java.lang.String) r12;
        r12 = r4.contains(r12);
        if (r12 == 0) goto L_0x0178;
    L_0x018a:
        r11 = r13.h;
        r4 = defpackage.twl.a(r4, r11, r9);
        r11 = d;
        r4 = r11.matcher(r4);
        r11 = r4.matches();
        if (r11 == 0) goto L_0x01a0;
    L_0x019c:
        r6 = r4.group(r5);
    L_0x01a0:
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.bcbw) r4;
        if (r6 == 0) goto L_0x01b3;
    L_0x01a9:
        r5 = r4.a;
        r11 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r5 = r5 | r11;
        r4.a = r5;
        r4.s = r6;
        goto L_0x01cf;
    L_0x01b3:
        r14 = new java.lang.NullPointerException;
        r14.<init>();
        throw r14;
    L_0x01b9:
        r6 = r13.h;
        r4 = defpackage.twl.a(r4, r6, r1);
        r3.copyOnWrite();
        r6 = r3.instance;
        r6 = (defpackage.bcbw) r6;
        if (r4 == 0) goto L_0x01d1;
    L_0x01c8:
        r11 = r6.a;
        r5 = r5 | r11;
        r6.a = r5;
        r6.c = r4;
    L_0x01cf:
        r6 = r10;
        goto L_0x01d7;
    L_0x01d1:
        r14 = new java.lang.NullPointerException;
        r14.<init>();
        throw r14;
    L_0x01d7:
        if (r6 != 0) goto L_0x01da;
    L_0x01d9:
        goto L_0x01f0;
    L_0x01da:
        r4 = defpackage.twl.b(r6);
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        if (r4 == 0) goto L_0x0316;
    L_0x01e7:
        r6 = r5.a;
        r10 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = r6 | r10;
        r5.a = r6;
        r5.u = r4;
    L_0x01f0:
        r4 = r14[r2];
        r4 = r4.j;
        if (r4 != 0) goto L_0x01f7;
    L_0x01f6:
        goto L_0x0206;
    L_0x01f7:
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        r5.j = r4;
        r4 = r5.a;
        r4 = r4 | 512;
        r5.a = r4;
    L_0x0206:
        r4 = defpackage.bcby.a(r1);
        r4 = defpackage.amqp.c(r4);
        r5 = defpackage.bcby.UNKNOWN;
        r4 = r4.a(r5);
        r4 = (defpackage.bcby) r4;
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        if (r4 == 0) goto L_0x0310;
    L_0x021f:
        r6 = r5.a;
        r6 = r6 | 1024;
        r5.a = r6;
        r4 = r4.b;
        r5.k = r4;
        r4 = defpackage.bcbs.c;
        r4 = r4.createBuilder();
        r4 = (defpackage.bcbr) r4;
        r5 = r14[r2];
        r5 = r5.o;
        if (r5 != 0) goto L_0x0238;
    L_0x0237:
        goto L_0x0248;
    L_0x0238:
        r4.copyOnWrite();
        r6 = r4.instance;
        r6 = (defpackage.bcbs) r6;
        r10 = r6.a;
        r9 = r9 | r10;
        r6.a = r9;
        r5 = r5 + -2;
        r6.b = r5;
    L_0x0248:
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        r4 = r4.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.bcbs) r4;
        r5.l = r4;
        r4 = r5.a;
        r4 = r4 | 2048;
        r5.a = r4;
        r4 = r14[r2];
        r4 = r4.k;
        if (r4 != 0) goto L_0x0266;
    L_0x0265:
        goto L_0x0275;
    L_0x0266:
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        r5.m = r4;
        r4 = r5.a;
        r4 = r4 | 4096;
        r5.a = r4;
    L_0x0275:
        r4 = r14[r2];
        r4 = r4.a;
        r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r6 > 0) goto L_0x027e;
    L_0x027d:
        goto L_0x028d;
    L_0x027e:
        r3.copyOnWrite();
        r6 = r3.instance;
        r6 = (defpackage.bcbw) r6;
        r7 = r6.a;
        r7 = r7 | 8192;
        r6.a = r7;
        r6.n = r4;
    L_0x028d:
        r4 = r14[r2];
        r4 = r4.p;
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        if (r4 == 0) goto L_0x030a;
    L_0x029a:
        r6 = r5.a;
        r6 = r6 | 16384;
        r5.a = r6;
        r4 = r4 + -1;
        r5.o = r4;
        r4 = r14[r2];
        r4 = r4.l;
        r4 = defpackage.bccc.a(r4);
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        if (r4 == 0) goto L_0x0304;
    L_0x02b5:
        r6 = r5.a;
        r7 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r6 = r6 | r7;
        r5.a = r6;
        r4 = r4 + -1;
        r5.p = r4;
        r4 = r14[r2];
        r4 = r4.m;
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        r6 = r5.a;
        r7 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r6 = r6 | r7;
        r5.a = r6;
        r5.q = r4;
        r4 = r14[r2];
        r4 = r4.n;
        r3.copyOnWrite();
        r5 = r3.instance;
        r5 = (defpackage.bcbw) r5;
        r6 = r5.a;
        r7 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r6 = r6 | r7;
        r5.a = r6;
        r5.r = r4;
        r0.copyOnWrite();
        r4 = r0.instance;
        r4 = (defpackage.bcca) r4;
        r4.a();
        r4 = r4.a;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.bcbw) r3;
        r4.add(r3);
        r2 = r2 + 1;
        goto L_0x000a;
    L_0x0304:
        r14 = new java.lang.NullPointerException;
        r14.<init>();
        throw r14;
    L_0x030a:
        r14 = new java.lang.NullPointerException;
        r14.<init>();
        throw r14;
    L_0x0310:
        r14 = new java.lang.NullPointerException;
        r14.<init>();
        throw r14;
    L_0x0316:
        r14 = new java.lang.NullPointerException;
        r14.<init>();
        throw r14;
    L_0x031c:
        r14 = new java.lang.NullPointerException;
        r14.<init>();
        goto L_0x0323;
    L_0x0322:
        throw r14;
    L_0x0323:
        goto L_0x0322;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twl.a(twm[]):bcfe");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    private static java.lang.String a(java.lang.String r3, defpackage.tzv r4, boolean r5) {
        /*
        r0 = r3.isEmpty();
        r1 = 0;
        if (r0 != 0) goto L_0x0066;
    L_0x0007:
        if (r4 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0010;
    L_0x000a:
        if (r5 != 0) goto L_0x0010;
    L_0x000c:
        r3 = r4.a(r3);
    L_0x0010:
        r4 = 1;
        if (r5 != 0) goto L_0x001c;
    L_0x0013:
        r5 = defpackage.twl.a(r3);
        if (r5 != 0) goto L_0x001b;
    L_0x0019:
        r5 = 0;
        goto L_0x001d;
    L_0x001b:
        r3 = r5;
    L_0x001c:
        r5 = 1;
    L_0x001d:
        r0 = c;
        r0 = r0.matcher(r3);
        r2 = r0.find();
        if (r2 == 0) goto L_0x002e;
    L_0x0029:
        r3 = r0.group(r4);
        r5 = 1;
    L_0x002e:
        r0 = defpackage.twl.b(r3);
        if (r0 == 0) goto L_0x003c;
    L_0x0034:
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003c;
    L_0x003b:
        r5 = 1;
    L_0x003c:
        r3 = f;
        r3 = r3.matcher(r0);
        r2 = r3.find();
        if (r2 == 0) goto L_0x0050;
    L_0x0048:
        r5 = "<ip>";
        r3 = r3.replaceFirst(r5);
        r5 = 1;
        goto L_0x0051;
    L_0x0050:
        r3 = r0;
    L_0x0051:
        if (r5 != 0) goto L_0x0065;
    L_0x0053:
        r5 = e;
        r3 = r5.matcher(r3);
        r5 = r3.find();
        if (r5 != 0) goto L_0x0061;
    L_0x005f:
        r3 = r1;
        goto L_0x0065;
    L_0x0061:
        r3 = r3.group(r4);
    L_0x0065:
        return r3;
    L_0x0066:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twl.a(java.lang.String, tzv, boolean):java.lang.String");
    }
}
