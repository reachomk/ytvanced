package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: uee */
public abstract class uee {
    private static final Object a = new Object();
    private static Context b = null;
    private static final AtomicInteger f = new AtomicInteger();
    private final ueg c;
    private final String d;
    private final Object e;
    private volatile int g = -1;
    private volatile Object h;

    public static void a(Context context) {
        synchronized (a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (b != context) {
                uds.a();
                uej.a();
                ueb.a();
                uee.a();
                b = context;
            }
        }
    }

    public abstract Object a(Object obj);

    public static void b(Context context) {
        if (b == null) {
            uee.a(context);
        }
    }

    static void a() {
        f.incrementAndGet();
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.d;
        }
        str = String.valueOf(str);
        String valueOf = String.valueOf(this.d);
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    public final String b() {
        return a(this.c.d);
    }

    public final Object c() {
        int i = f.get();
        if (this.g < i) {
            synchronized (this) {
                if (this.g < i) {
                    if (b != null) {
                        Object e;
                        if (this.c.f) {
                            e = e();
                            if (e == null) {
                                e = d();
                                if (e == null) {
                                }
                            }
                            this.h = e;
                            this.g = i;
                        } else {
                            e = d();
                            if (e == null) {
                                e = e();
                                if (e != null) {
                                }
                            }
                            this.h = e;
                            this.g = i;
                        }
                        e = this.e;
                        this.h = e;
                        this.g = i;
                    } else {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                }
            }
        }
        return this.h;
    }

    /* JADX WARNING: Missing block: B:5:0x0022, code skipped:
            if (defpackage.rzt.b.matcher(r0).matches() != false) goto L_0x00ae;
     */
    private final java.lang.Object d() {
        /*
        r7 = this;
        r0 = r7.c;
        r0 = r0.g;
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        goto L_0x0026;
    L_0x0008:
        r0 = b;
        r0 = defpackage.ueb.a(r0);
        r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype";
        r0 = r0.a(r2);
        r0 = (java.lang.String) r0;
        if (r0 == 0) goto L_0x0026;
    L_0x0018:
        r2 = defpackage.rzt.b;
        r0 = r2.matcher(r0);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x0026;
    L_0x0024:
        goto L_0x00ae;
    L_0x0026:
        r0 = r7.c;
        r0 = r0.b;
        if (r0 == 0) goto L_0x0093;
    L_0x002c:
        r0 = b;
        r2 = r7.c;
        r2 = r2.b;
        r0 = defpackage.uec.a(r0, r2);
        if (r0 == 0) goto L_0x0091;
    L_0x0038:
        r0 = r7.c;
        r0 = r0.h;
        if (r0 == 0) goto L_0x0082;
    L_0x003e:
        r0 = b;
        r0 = r0.getContentResolver();
        r2 = r7.c;
        r2 = r2.b;
        r2 = r2.getLastPathSegment();
        r3 = b;
        r3 = r3.getPackageName();
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r4 = r4 + 1;
        r4 = r4 + r5;
        r6.<init>(r4);
        r6.append(r2);
        r2 = "#";
        r6.append(r2);
        r6.append(r3);
        r2 = r6.toString();
        r2 = defpackage.uef.a(r2);
        r0 = defpackage.uds.a(r0, r2);
        goto L_0x009d;
    L_0x0082:
        r0 = b;
        r0 = r0.getContentResolver();
        r2 = r7.c;
        r2 = r2.b;
        r0 = defpackage.uds.a(r0, r2);
        goto L_0x009d;
    L_0x0091:
        r0 = r1;
        goto L_0x009d;
    L_0x0093:
        r0 = b;
        r2 = r7.c;
        r2 = r2.a;
        r0 = defpackage.uej.a(r0, r2);
    L_0x009d:
        if (r0 == 0) goto L_0x00ae;
    L_0x009f:
        r2 = r7.b();
        r0 = r0.a(r2);
        if (r0 == 0) goto L_0x00ae;
    L_0x00a9:
        r0 = r7.a(r0);
        return r0;
    L_0x00ae:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uee.d():java.lang.Object");
    }

    private final Object e() {
        ueg ueg = this.c;
        if (!ueg.e) {
            amqd amqd = ueg.i;
            if (amqd == null || ((Boolean) amqd.a(b)).booleanValue()) {
                ueb a = ueb.a(b);
                ueg ueg2 = this.c;
                Object obj = (String) a.a(!ueg2.e ? a(ueg2.c) : null);
                if (obj != null) {
                    return a(obj);
                }
            }
        }
        return null;
    }

    public static uee a(ueg ueg, String str, boolean z) {
        return new ueh(ueg, str, Boolean.valueOf(z));
    }

    /* synthetic */ uee(ueg ueg, String str, Object obj) {
        String str2 = ueg.a;
        if (str2 == null && ueg.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || ueg.b == null) {
            this.c = ueg;
            this.d = str;
            this.e = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }
}
