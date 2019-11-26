package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbbe */
final class bbbe extends bava {
    public static final Logger a;
    public static boolean b = Boolean.parseBoolean(s);
    public static boolean c = Boolean.parseBoolean(t);
    public static boolean d = Boolean.parseBoolean(u);
    public static boolean e = Boolean.parseBoolean(v);
    public static final bbbm f;
    private static final Set r = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));
    private static final String s = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
    private static final String t;
    private static final String u;
    private static final String v;
    private static String w;
    private Executor A;
    private bavd B;
    public final bavs g;
    public final Random h = new Random();
    public volatile bbbd i = bbbg.a;
    public final AtomicReference j = new AtomicReference();
    public final String k;
    public final int l;
    public final long m;
    public final bawg n;
    public final amrj o;
    public bbbf p;
    public boolean q;
    private final String x;
    private final bbhj y;
    private boolean z;

    bbbe(String str, bauz bauz, bbhj bbhj, amrj amrj, boolean z) {
        Object obj = str;
        Object obj2 = bauz;
        amqw.a(obj2, (Object) "args");
        this.y = bbhj;
        String valueOf = String.valueOf((String) amqw.a(obj, (Object) "name"));
        String str2 = "//";
        Object create = URI.create(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
        int i = 1;
        amqw.a(create.getHost() != null, "Invalid DNS name: %s", obj);
        this.x = (String) amqw.a(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.k = create.getHost();
        if (create.getPort() != -1) {
            this.l = create.getPort();
        } else {
            this.l = obj2.a;
        }
        this.g = (bavs) amqw.a(obj2.b, (Object) "proxyDetector");
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    i = Long.parseLong(property);
                    j2 = i;
                } catch (NumberFormatException unused) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{r1, property, Long.valueOf(30)});
                }
            }
            j = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.m = j;
        this.o = (amrj) amqw.a((Object) amrj, (Object) "stopwatch");
        this.n = (bawg) amqw.a(obj2.c, (Object) "syncContext");
    }

    public final String a() {
        return this.x;
    }

    public final void a(bavd bavd) {
        amqw.b(this.B == null, (Object) "already started");
        this.A = (Executor) bbhf.a(this.y);
        this.B = (bavd) amqw.a((Object) bavd, (Object) "listener");
        e();
    }

    public final void c() {
        amqw.b(this.B != null, (Object) "not started");
        e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1 A:{Catch:{ RuntimeException -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090 A:{Catch:{ RuntimeException -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A:{Catch:{ RuntimeException -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0096 A:{Catch:{ RuntimeException -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093 A:{Catch:{ RuntimeException -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1 A:{Catch:{ RuntimeException -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8 A:{Catch:{ RuntimeException -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00f1 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00eb A:{Catch:{ RuntimeException -> 0x0104 }} */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00f0 A:{SYNTHETIC} */
    static defpackage.bavb a(java.util.List r21, java.util.Random r22, java.lang.String r23) {
        /*
        r0 = "serviceConfig";
        r1 = "clientHostname";
        r2 = "percentage";
        r3 = "clientLanguage";
        r4 = new java.util.ArrayList;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r4.<init>();	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r5 = r21.iterator();	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
    L_0x0011:
        r6 = r5.hasNext();	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r7 = 1;
        r8 = 0;
        if (r6 != 0) goto L_0x011e;
    L_0x0019:
        r5 = r4.size();
        r6 = 0;
        r10 = r6;
        r9 = 0;
    L_0x0020:
        if (r9 >= r5) goto L_0x0116;
    L_0x0022:
        r10 = r4.get(r9);
        r10 = (java.util.Map) r10;
        r11 = r10.entrySet();	 Catch:{ RuntimeException -> 0x0104 }
        r11 = r11.iterator();	 Catch:{ RuntimeException -> 0x0104 }
    L_0x0030:
        r12 = r11.hasNext();	 Catch:{ RuntimeException -> 0x0104 }
        if (r12 == 0) goto L_0x004c;
    L_0x0036:
        r12 = r11.next();	 Catch:{ RuntimeException -> 0x0104 }
        r12 = (java.util.Map.Entry) r12;	 Catch:{ RuntimeException -> 0x0104 }
        r13 = r;	 Catch:{ RuntimeException -> 0x0104 }
        r14 = r12.getKey();	 Catch:{ RuntimeException -> 0x0104 }
        r13 = r13.contains(r14);	 Catch:{ RuntimeException -> 0x0104 }
        r14 = "Bad key: %s";
        defpackage.amrw.a(r13, r14, r12);	 Catch:{ RuntimeException -> 0x0104 }
        goto L_0x0030;
    L_0x004c:
        r11 = r10.containsKey(r3);	 Catch:{ RuntimeException -> 0x0104 }
        if (r11 == 0) goto L_0x005b;
    L_0x0052:
        r11 = defpackage.bbhd.a(r10, r3);	 Catch:{ RuntimeException -> 0x0104 }
        r11 = defpackage.bbhd.c(r11);	 Catch:{ RuntimeException -> 0x0104 }
        goto L_0x005c;
    L_0x005b:
        r11 = r6;
    L_0x005c:
        if (r11 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x0085;
    L_0x005f:
        r12 = r11.isEmpty();	 Catch:{ RuntimeException -> 0x0104 }
        if (r12 != 0) goto L_0x0085;
    L_0x0065:
        r11 = r11.iterator();	 Catch:{ RuntimeException -> 0x0104 }
    L_0x0069:
        r12 = r11.hasNext();	 Catch:{ RuntimeException -> 0x0104 }
        if (r12 == 0) goto L_0x007e;
    L_0x006f:
        r12 = r11.next();	 Catch:{ RuntimeException -> 0x0104 }
        r12 = (java.lang.String) r12;	 Catch:{ RuntimeException -> 0x0104 }
        r13 = "java";
        r12 = r13.equalsIgnoreCase(r12);	 Catch:{ RuntimeException -> 0x0104 }
        if (r12 == 0) goto L_0x0069;
    L_0x007d:
        goto L_0x0085;
    L_0x007e:
        r11 = r22;
    L_0x0080:
        r14 = r23;
        r10 = r6;
        goto L_0x00ec;
    L_0x0085:
        r11 = r10.containsKey(r2);	 Catch:{ RuntimeException -> 0x0104 }
        if (r11 == 0) goto L_0x0090;
    L_0x008b:
        r11 = defpackage.bbhd.c(r10, r2);	 Catch:{ RuntimeException -> 0x0104 }
        goto L_0x0091;
    L_0x0090:
        r11 = r6;
    L_0x0091:
        if (r11 != 0) goto L_0x0096;
    L_0x0093:
        r11 = r22;
        goto L_0x00b2;
    L_0x0096:
        r12 = r11.intValue();	 Catch:{ RuntimeException -> 0x0104 }
        r13 = 100;
        if (r12 >= 0) goto L_0x00a0;
    L_0x009e:
        r14 = 0;
        goto L_0x00a4;
    L_0x00a0:
        if (r12 <= r13) goto L_0x00a3;
    L_0x00a2:
        goto L_0x009e;
    L_0x00a3:
        r14 = 1;
    L_0x00a4:
        r15 = "Bad percentage: %s";
        defpackage.amrw.a(r14, r15, r11);	 Catch:{ RuntimeException -> 0x0104 }
        r11 = r22;
        r13 = r11.nextInt(r13);	 Catch:{ RuntimeException -> 0x0104 }
        if (r13 < r12) goto L_0x00b2;
    L_0x00b1:
        goto L_0x0080;
    L_0x00b2:
        r12 = r10.containsKey(r1);	 Catch:{ RuntimeException -> 0x0104 }
        if (r12 == 0) goto L_0x00c1;
    L_0x00b8:
        r12 = defpackage.bbhd.a(r10, r1);	 Catch:{ RuntimeException -> 0x0104 }
        r12 = defpackage.bbhd.c(r12);	 Catch:{ RuntimeException -> 0x0104 }
        goto L_0x00c2;
    L_0x00c1:
        r12 = r6;
    L_0x00c2:
        if (r12 == 0) goto L_0x00e3;
    L_0x00c4:
        r13 = r12.isEmpty();	 Catch:{ RuntimeException -> 0x0104 }
        if (r13 != 0) goto L_0x00e3;
    L_0x00ca:
        r12 = r12.iterator();	 Catch:{ RuntimeException -> 0x0104 }
    L_0x00ce:
        r13 = r12.hasNext();	 Catch:{ RuntimeException -> 0x0104 }
        if (r13 == 0) goto L_0x0080;
    L_0x00d4:
        r13 = r12.next();	 Catch:{ RuntimeException -> 0x0104 }
        r13 = (java.lang.String) r13;	 Catch:{ RuntimeException -> 0x0104 }
        r14 = r23;
        r13 = r13.equals(r14);	 Catch:{ RuntimeException -> 0x0104 }
        if (r13 == 0) goto L_0x00ce;
    L_0x00e2:
        goto L_0x00e5;
    L_0x00e3:
        r14 = r23;
    L_0x00e5:
        r12 = defpackage.bbhd.b(r10, r0);	 Catch:{ RuntimeException -> 0x0104 }
        if (r12 == 0) goto L_0x00f1;
    L_0x00eb:
        r10 = r12;
    L_0x00ec:
        r9 = r9 + 1;
        if (r10 == 0) goto L_0x0020;
    L_0x00f0:
        goto L_0x0116;
    L_0x00f1:
        r1 = new amrv;	 Catch:{ RuntimeException -> 0x0104 }
        r2 = "key '%s' missing in '%s'";
        r3 = 2;
        r3 = new java.lang.Object[r3];	 Catch:{ RuntimeException -> 0x0104 }
        r3[r8] = r10;	 Catch:{ RuntimeException -> 0x0104 }
        r3[r7] = r0;	 Catch:{ RuntimeException -> 0x0104 }
        r0 = java.lang.String.format(r2, r3);	 Catch:{ RuntimeException -> 0x0104 }
        r1.<init>(r0);	 Catch:{ RuntimeException -> 0x0104 }
        throw r1;	 Catch:{ RuntimeException -> 0x0104 }
    L_0x0104:
        r0 = move-exception;
        r1 = defpackage.bavx.d;
        r2 = "failed to pick service config choice";
        r1 = r1.a(r2);
        r0 = r1.b(r0);
        r0 = defpackage.bavb.a(r0);
        return r0;
    L_0x0116:
        if (r10 == 0) goto L_0x011d;
    L_0x0118:
        r0 = defpackage.bavb.a(r10);
        return r0;
    L_0x011d:
        return r6;
    L_0x011e:
        r11 = r22;
        r14 = r23;
        r6 = r5.next();	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r6 = (java.lang.String) r6;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r9 = "grpc_config=";
        r9 = r6.startsWith(r9);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        if (r9 != 0) goto L_0x0145;
    L_0x0130:
        r15 = a;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r16 = java.util.logging.Level.FINE;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r17 = "io.grpc.internal.DnsNameResolver";
        r18 = "parseTxtResults";
        r19 = "Ignoring non service config {0}";
        r7 = new java.lang.Object[r7];	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r7[r8] = r6;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r20 = r7;
        r15.logp(r16, r17, r18, r19, r20);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        goto L_0x0011;
    L_0x0145:
        r7 = 12;
        r6 = r6.substring(r7);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r6 = defpackage.bbda.a(r6);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r7 = r6 instanceof java.util.List;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        if (r7 == 0) goto L_0x015e;
    L_0x0153:
        r6 = (java.util.List) r6;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r6 = defpackage.bbhd.b(r6);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r4.addAll(r6);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        goto L_0x0011;
    L_0x015e:
        r0 = new java.lang.ClassCastException;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r1 = java.lang.String.valueOf(r6);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r2 = r1.length();	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r2 = r2 + 11;
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r3.<init>(r2);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r2 = "wrong type ";
        r3.append(r2);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r3.append(r1);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r1 = r3.toString();	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
        throw r0;	 Catch:{ IOException -> 0x0181, IOException | RuntimeException -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        goto L_0x0182;
    L_0x0181:
        r0 = move-exception;
    L_0x0182:
        r1 = defpackage.bavx.d;
        r2 = "failed to parse TXT records";
        r1 = r1.a(r2);
        r0 = r1.b(r0);
        r0 = defpackage.bavb.a(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbbe.a(java.util.List, java.util.Random, java.lang.String):bavb");
    }

    private final void e() {
        if (!this.q && !this.z) {
            if (this.p != null) {
                long j = this.m;
                if (j != 0 && (j <= 0 || this.o.a(TimeUnit.NANOSECONDS) <= this.m)) {
                    return;
                }
            }
            this.q = true;
            this.A.execute(new bbbi(this, this.B));
        }
    }

    public final void b() {
        if (!this.z) {
            this.z = true;
            Executor executor = this.A;
            if (executor != null) {
                this.A = (Executor) bbhf.a(this.y, executor);
            }
        }
    }

    static bbbf a(bbbd bbbd, bbbj bbbj, boolean z, boolean z2, String str) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        Throwable th4 = null;
        try {
            emptyList = bbbd.a(str);
            th = null;
        } catch (Exception e) {
            th = e;
        }
        if (bbbj == null) {
            th2 = null;
            th3 = th2;
        } else {
            String str2;
            Throwable th5;
            if (z) {
                try {
                    str2 = "_grpclb._tcp.";
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        str2.concat(valueOf);
                    }
                    emptyList2 = bbbj.b();
                } catch (Exception e2) {
                    th5 = e2;
                }
            }
            th5 = null;
            if (z2) {
                Object obj = 1;
                if (z && th5 == null) {
                    obj = null;
                }
                if (th == null || obj == null) {
                    try {
                        str2 = "_grpc_config.";
                        String valueOf2 = String.valueOf(str);
                        if (valueOf2.length() == 0) {
                            valueOf2 = new String(str2);
                        } else {
                            str2.concat(valueOf2);
                        }
                        emptyList3 = bbbj.a();
                    } catch (Exception e22) {
                        th4 = e22;
                    }
                }
            }
            th3 = th4;
            th2 = th5;
        }
        if (th != null) {
            if (th2 == null) {
                try {
                    if (!emptyList2.isEmpty()) {
                    }
                } catch (Throwable th6) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAll", "Address resolution failure", th);
                    if (th2 != null) {
                        a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAll", "Balancer resolution failure", th2);
                    }
                    if (th3 != null) {
                        a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAll", "ServiceConfig resolution failure", th3);
                    }
                }
            }
            amrs.a(th);
            throw new RuntimeException(th);
        }
        if (th != null) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAll", "Address resolution failure", th);
        }
        if (th2 != null) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAll", "Balancer resolution failure", th2);
        }
        if (th3 != null) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAll", "ServiceConfig resolution failure", th3);
        }
        return new bbbf(emptyList, emptyList3, emptyList2);
    }

    public static String d() {
        if (w == null) {
            try {
                w = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return w;
    }

    static boolean a(boolean z, boolean z2, String str) {
        if (!z) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z2;
        }
        if (str.contains(":")) {
            return false;
        }
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '.') {
                int i3 = (charAt < '0' || charAt > '9') ? 0 : 1;
                i &= i3;
            }
        }
        return 1 ^ i;
    }

    static {
        Class cls = bbbe.class;
        a = Logger.getLogger(cls.getName());
        String str = "false";
        t = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", str);
        u = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_grpclb", str);
        v = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", str);
        bbbm bbbm = null;
        try {
            try {
                try {
                    bbbm bbbm2 = (bbbm) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, cls.getClassLoader()).asSubclass(bbbm.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (bbbm2.b() != null) {
                        a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", bbbm2.b());
                    } else {
                        bbbm = bbbm2;
                    }
                } catch (Exception e) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", e);
                }
            } catch (Exception e2) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", e2);
            }
        } catch (ClassNotFoundException e22) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", e22);
        }
        f = bbbm;
    }
}
