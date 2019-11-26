package defpackage;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bcpt */
public abstract class bcpt implements Serializable {
    public static final bcpt a;
    public static bctl b = null;
    public static Set c = null;
    private static bctk e = null;
    private static volatile bcpt f = null;
    private static bcsf g = null;
    private static Map h = null;
    private static Map i = null;
    public static final long serialVersionUID = 5546345482340108586L;
    public final String d;

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a7 A:{SYNTHETIC, Splitter:B:43:0x00a7} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x001f A:{SYNTHETIC, Splitter:B:16:0x001f} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a7 A:{SYNTHETIC, Splitter:B:43:0x00a7} */
    public static defpackage.bcpt a() {
        /*
        r0 = f;
        if (r0 != 0) goto L_0x00b0;
    L_0x0004:
        r1 = defpackage.bcpt.class;
        monitor-enter(r1);
        r0 = f;	 Catch:{ all -> 0x00ad }
        if (r0 != 0) goto L_0x00ab;
    L_0x000b:
        r0 = 0;
        r2 = "user.timezone";
        r2 = java.lang.System.getProperty(r2);	 Catch:{ RuntimeException -> 0x001c, IllegalArgumentException -> 0x0019 }
        if (r2 == 0) goto L_0x001c;
    L_0x0014:
        r2 = defpackage.bcpt.a(r2);	 Catch:{ RuntimeException -> 0x001c, IllegalArgumentException -> 0x0019 }
        goto L_0x001d;
        goto L_0x00a5;
    L_0x001c:
        r2 = r0;
    L_0x001d:
        if (r2 != 0) goto L_0x00a4;
    L_0x001f:
        r3 = java.util.TimeZone.getDefault();	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r3 != 0) goto L_0x002b;
    L_0x0025:
        r0 = defpackage.bcpt.a();	 Catch:{ IllegalArgumentException -> 0x00a4 }
        goto L_0x00a5;
    L_0x002b:
        r4 = r3.getID();	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r5 = "UTC";
        r5 = r4.equals(r5);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r5 == 0) goto L_0x003a;
    L_0x0037:
        r0 = a;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        goto L_0x00a5;
    L_0x003a:
        r5 = defpackage.bcpt.b(r4);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r5 == 0) goto L_0x0046;
    L_0x0040:
        r0 = e;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = r0.a(r5);	 Catch:{ IllegalArgumentException -> 0x00a4 }
    L_0x0046:
        if (r0 != 0) goto L_0x004e;
    L_0x0048:
        r0 = e;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = r0.a(r4);	 Catch:{ IllegalArgumentException -> 0x00a4 }
    L_0x004e:
        if (r0 != 0) goto L_0x00a5;
    L_0x0050:
        if (r5 != 0) goto L_0x0082;
    L_0x0052:
        r0 = r3.getID();	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r3 = "GMT+";
        r3 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r3 != 0) goto L_0x0066;
    L_0x005e:
        r3 = "GMT-";
        r3 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r3 == 0) goto L_0x0082;
    L_0x0066:
        r3 = 3;
        r0 = r0.substring(r3);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = defpackage.bcpt.c(r0);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r3 = (long) r0;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 != 0) goto L_0x0079;
    L_0x0076:
        r0 = a;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        goto L_0x00a5;
    L_0x0079:
        r3 = defpackage.bcpt.a(r0);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = defpackage.bcpt.a(r3, r0);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        goto L_0x00a5;
    L_0x0082:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r3 = r4.length();	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r3 = r3 + 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r5.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r3 = "The datetime zone id '";
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r5.append(r4);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r3 = "' is not recognised";
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r3 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a4 }
    L_0x00a4:
        r0 = r2;
    L_0x00a5:
        if (r0 != 0) goto L_0x00a9;
    L_0x00a7:
        r0 = a;	 Catch:{ all -> 0x00ad }
    L_0x00a9:
        f = r0;	 Catch:{ all -> 0x00ad }
    L_0x00ab:
        monitor-exit(r1);	 Catch:{ all -> 0x00ad }
        goto L_0x00b0;
    L_0x00ad:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00ad }
        throw r0;
    L_0x00b0:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcpt.a():bcpt");
    }

    public abstract String a(long j);

    public abstract int b(long j);

    public abstract boolean b();

    public abstract int c(long j);

    public abstract boolean equals(Object obj);

    public abstract long g(long j);

    public abstract long h(long j);

    public static bcpt a(String str) {
        if (str == null) {
            return bcpt.a();
        }
        if (str.equals("UTC")) {
            return a;
        }
        bcpt a = e.a(str);
        if (a != null) {
            return a;
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            int c = bcpt.c(str);
            if (((long) c) == 0) {
                return a;
            }
            return bcpt.a(bcpt.a(c), c);
        }
        StringBuilder stringBuilder = new StringBuilder(str.length() + 41);
        stringBuilder.append("The datetime zone id '");
        stringBuilder.append(str);
        stringBuilder.append("' is not recognised");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static synchronized bcpt a(String str, int i) {
        synchronized (bcpt.class) {
            if (i != 0) {
                if (h == null) {
                    h = new HashMap();
                }
                Reference reference = (Reference) h.get(str);
                if (reference != null) {
                    bcpt bcpt = (bcpt) reference.get();
                    if (bcpt != null) {
                        return bcpt;
                    }
                }
                bcti bcti = new bcti(str, null, i, i);
                h.put(str, new SoftReference(bcti));
                return bcti;
            }
            bcpt bcpt2 = a;
            return bcpt2;
        }
    }

    private static synchronized String b(String str) {
        synchronized (bcpt.class) {
            Map map = i;
            if (map == null) {
                map = new HashMap();
                map.put("GMT", "UTC");
                map.put("WET", "WET");
                map.put("CET", "CET");
                map.put("MET", "CET");
                map.put("ECT", "CET");
                map.put("EET", "EET");
                map.put("MIT", "Pacific/Apia");
                map.put("HST", "Pacific/Honolulu");
                map.put("AST", "America/Anchorage");
                map.put("PST", "America/Los_Angeles");
                map.put("MST", "America/Denver");
                map.put("PNT", "America/Phoenix");
                map.put("CST", "America/Chicago");
                map.put("EST", "America/New_York");
                map.put("IET", "America/Indiana/Indianapolis");
                map.put("PRT", "America/Puerto_Rico");
                map.put("CNT", "America/St_Johns");
                map.put("AGT", "America/Argentina/Buenos_Aires");
                map.put("BET", "America/Sao_Paulo");
                map.put("ART", "Africa/Cairo");
                map.put("CAT", "Africa/Harare");
                map.put("EAT", "Africa/Addis_Ababa");
                map.put("NET", "Asia/Yerevan");
                map.put("PLT", "Asia/Karachi");
                map.put("IST", "Asia/Kolkata");
                map.put("BST", "Asia/Dhaka");
                map.put("VST", "Asia/Ho_Chi_Minh");
                map.put("CTT", "Asia/Shanghai");
                map.put("JST", "Asia/Tokyo");
                map.put("ACT", "Australia/Darwin");
                map.put("AET", "Australia/Sydney");
                map.put("SST", "Pacific/Guadalcanal");
                map.put("NST", "Pacific/Auckland");
                i = map;
            }
            str = (String) map.get(str);
        }
        return str;
    }

    private static int c(String str) {
        bcpl bcps = new bcps();
        bcsf c = bcpt.c();
        if (c.e != bcps) {
            c = new bcsf(c.a, c.b, c.c, c.d, bcps, c.f, c.g, c.h);
        }
        bcsv bcsv = c.b;
        if (bcsv != null) {
            bcsu bcsu = new bcsu(c.a(c.e), c.c, c.g, c.h);
            int a = bcsv.a(bcsu, str, 0);
            if (a < 0) {
                a ^= -1;
            } else if (a >= str.length()) {
                return -((int) bcsu.a(str));
            }
            throw new IllegalArgumentException(bcsy.b(str, a));
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    public static String a(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        bcsy.a(stringBuffer, i2, 2);
        i -= i2 * 3600000;
        i2 = i / 60000;
        stringBuffer.append(':');
        bcsy.a(stringBuffer, i2, 2);
        i -= i2 * 60000;
        if (i == 0) {
            return stringBuffer.toString();
        }
        int i3 = i / 1000;
        stringBuffer.append(':');
        bcsy.a(stringBuffer, i3, 2);
        i -= i3 * 1000;
        if (i == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        bcsy.a(stringBuffer, i, 3);
        return stringBuffer.toString();
    }

    private static synchronized bcsf c() {
        bcsf bcsf;
        synchronized (bcpt.class) {
            if (g == null) {
                g = new bcse().a(null, true, 4).a();
            }
            bcsf = g;
        }
        return bcsf;
    }

    protected bcpt(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }

    public final boolean d(long j) {
        return b(j) == c(j);
    }

    public int e(long j) {
        int b = b(j);
        long j2 = j - ((long) b);
        int b2 = b(j2);
        if (b != b2) {
            if (b - b2 >= 0 || g(j2) == g(j - ((long) b2))) {
                return b2;
            }
            return b;
        } else if (b >= 0) {
            j = h(j2);
            if (j < j2) {
                int b3 = b(j);
                if (j2 - j <= ((long) (b3 - b))) {
                    return b3;
                }
            }
        }
        return b2;
    }

    public final long f(long j) {
        long b = (long) b(j);
        long j2 = j + b;
        if ((j ^ j2) >= 0 || (j ^ b) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    /* JADX WARNING: Missing block: B:12:0x003a, code skipped:
            if (r2 != r4) goto L_0x003e;
     */
    public final long a(long r10, long r12) {
        /*
        r9 = this;
        r12 = r9.b(r12);
        r0 = (long) r12;
        r0 = r10 - r0;
        r13 = r9.b(r0);
        if (r13 == r12) goto L_0x0057;
    L_0x000d:
        r12 = r9.b(r10);
        r0 = (long) r12;
        r0 = r10 - r0;
        r13 = r9.b(r0);
        if (r12 != r13) goto L_0x001b;
    L_0x001a:
        goto L_0x003d;
    L_0x001b:
        if (r12 >= 0) goto L_0x003d;
    L_0x001d:
        r2 = r9.g(r0);
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r6 == 0) goto L_0x002b;
    L_0x002a:
        goto L_0x002c;
    L_0x002b:
        r2 = r4;
    L_0x002c:
        r0 = (long) r13;
        r0 = r10 - r0;
        r6 = r9.g(r0);
        r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r8 == 0) goto L_0x0038;
    L_0x0037:
        r4 = r6;
    L_0x0038:
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x003d;
    L_0x003c:
        goto L_0x003e;
    L_0x003d:
        r12 = r13;
    L_0x003e:
        r12 = (long) r12;
        r0 = r10 - r12;
        r2 = r10 ^ r0;
        r4 = 0;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x0057;
    L_0x0049:
        r10 = r10 ^ r12;
        r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r12 < 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0057;
    L_0x004f:
        r10 = new java.lang.ArithmeticException;
        r11 = "Subtracting time zone offset caused overflow";
        r10.<init>(r11);
        throw r10;
    L_0x0057:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcpt.a(long, long):long");
    }

    public int hashCode() {
        return this.d.hashCode() + 57;
    }

    public final String toString() {
        return this.d;
    }

    /* Access modifiers changed, original: protected */
    public Object writeReplace() {
        return new bcpv(this.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A:{SYNTHETIC, Splitter:B:12:0x002d} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    static {
        /*
        r0 = new bcti;
        r1 = 0;
        r2 = "UTC";
        r0.<init>(r2, r2, r1, r1);
        a = r0;
        r0 = 0;
        r1 = "org.joda.time.DateTimeZone.Provider";
        r1 = java.lang.System.getProperty(r1);	 Catch:{ SecurityException -> 0x002a }
        if (r1 == 0) goto L_0x002a;
    L_0x0013:
        r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x001e }
        r1 = r1.newInstance();	 Catch:{ Exception -> 0x001e }
        r1 = (defpackage.bctk) r1;	 Catch:{ Exception -> 0x001e }
        goto L_0x002b;
    L_0x001e:
        r1 = move-exception;
        r3 = java.lang.Thread.currentThread();	 Catch:{ SecurityException -> 0x002a }
        r4 = r3.getThreadGroup();	 Catch:{ SecurityException -> 0x002a }
        r4.uncaughtException(r3, r1);	 Catch:{ SecurityException -> 0x002a }
    L_0x002a:
        r1 = r0;
    L_0x002b:
        if (r1 != 0) goto L_0x0042;
    L_0x002d:
        r3 = new bctm;	 Catch:{ Exception -> 0x0036 }
        r4 = "org/joda/time/tz/data";
        r3.<init>(r4);	 Catch:{ Exception -> 0x0036 }
        r1 = r3;
        goto L_0x0042;
    L_0x0036:
        r3 = move-exception;
        r4 = java.lang.Thread.currentThread();
        r5 = r4.getThreadGroup();
        r5.uncaughtException(r4, r3);
    L_0x0042:
        if (r1 != 0) goto L_0x0049;
    L_0x0044:
        r1 = new bctn;
        r1.<init>();
    L_0x0049:
        r3 = r1.a();
        if (r3 == 0) goto L_0x00a7;
    L_0x004f:
        r4 = r3.size();
        if (r4 == 0) goto L_0x00a7;
    L_0x0055:
        r4 = r3.contains(r2);
        if (r4 == 0) goto L_0x009f;
    L_0x005b:
        r4 = a;
        r2 = r1.a(r2);
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x0097;
    L_0x0067:
        e = r1;
        c = r3;
        r1 = "org.joda.time.DateTimeZone.NameProvider";
        r1 = java.lang.System.getProperty(r1);	 Catch:{ SecurityException -> 0x008c }
        if (r1 == 0) goto L_0x008d;
    L_0x0073:
        r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x007f }
        r1 = r1.newInstance();	 Catch:{ Exception -> 0x007f }
        r1 = (defpackage.bctl) r1;	 Catch:{ Exception -> 0x007f }
        r0 = r1;
        goto L_0x008d;
    L_0x007f:
        r1 = move-exception;
        r2 = java.lang.Thread.currentThread();	 Catch:{ SecurityException -> 0x008c }
        r3 = r2.getThreadGroup();	 Catch:{ SecurityException -> 0x008c }
        r3.uncaughtException(r2, r1);	 Catch:{ SecurityException -> 0x008c }
        goto L_0x008d;
    L_0x008d:
        if (r0 != 0) goto L_0x0094;
    L_0x008f:
        r0 = new bctj;
        r0.<init>();
    L_0x0094:
        b = r0;
        return;
    L_0x0097:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Invalid UTC zone provided";
        r0.<init>(r1);
        throw r0;
    L_0x009f:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "The provider doesn't support UTC";
        r0.<init>(r1);
        throw r0;
    L_0x00a7:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "The provider doesn't have any available ids";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcpt.<clinit>():void");
    }
}
