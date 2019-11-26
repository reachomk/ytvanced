package defpackage;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: xli */
public final class xli implements bqa {
    private wyl a;
    private final File b;
    private final int c;
    private final xlj d;

    public xli(File file, int i) {
        xlj xlj = xlh.a;
        String valueOf = String.valueOf(file.getAbsolutePath());
        String str = "/volleyCache";
        if (str.length() == 0) {
            str = new String(valueOf);
        } else {
            str = valueOf.concat(str);
        }
        this.b = new File(str);
        this.c = i;
        this.d = xlj;
    }

    public final synchronized void b() {
        wyl wyl = this.a;
        if (wyl != null) {
            try {
                wyl.d();
                this.a = null;
            } catch (IOException e) {
                try {
                    xtl.a("VolleyDiskCache.clear", e);
                } finally {
                    this.a = null;
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:14:0x001c, code skipped:
            return;
     */
    public final synchronized void a() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a;	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x001d;
    L_0x0005:
        r0 = r3.b;	 Catch:{ IOException -> 0x0011 }
        r1 = r3.c;	 Catch:{ IOException -> 0x0011 }
        r1 = (long) r1;	 Catch:{ IOException -> 0x0011 }
        r0 = defpackage.wyl.a(r0, r1);	 Catch:{ IOException -> 0x0011 }
        r3.a = r0;	 Catch:{ IOException -> 0x0011 }
        goto L_0x001b;
    L_0x0011:
        r0 = move-exception;
        r1 = r3.d;	 Catch:{ all -> 0x001f }
        if (r1 == 0) goto L_0x001b;
    L_0x0016:
        r1.a(r0);	 Catch:{ all -> 0x001f }
        monitor-exit(r3);
        return;
    L_0x001b:
        monitor-exit(r3);
        return;
    L_0x001d:
        monitor-exit(r3);
        return;
    L_0x001f:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xli.a():void");
    }

    public final synchronized void b(String str) {
        bpz a = a(str);
        if (a != null) {
            a.f = 0;
            a.e = 0;
            a(str, a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6 A:{Catch:{ IOException -> 0x00cb, all -> 0x00c8 }} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7 A:{Catch:{ IOException -> 0x00cb, all -> 0x00c8 }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x009e */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f9 A:{SYNTHETIC, Splitter:B:73:0x00f9} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e8 A:{SYNTHETIC, Splitter:B:61:0x00e8} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8 A:{Splitter:B:15:0x002b, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:42:0x00c8, code skipped:
            r8 = th;
     */
    /* JADX WARNING: Missing block: B:43:0x00c9, code skipped:
            r0 = r4;
     */
    /* JADX WARNING: Missing block: B:74:?, code skipped:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:75:0x00fd, code skipped:
            r9 = move-exception;
     */
    /* JADX WARNING: Missing block: B:77:?, code skipped:
            defpackage.xtl.a("VolleyDiskCache.put", r9);
     */
    public final synchronized void a(java.lang.String r8, defpackage.bpz r9) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.a;	 Catch:{ all -> 0x0106 }
        if (r0 == 0) goto L_0x0104;
    L_0x0005:
        r0 = 0;
        r1 = defpackage.xli.d(r8);	 Catch:{ IOException -> 0x00e0 }
        r2 = r7.a;	 Catch:{ IOException -> 0x00e0 }
        r1 = r2.b(r1);	 Catch:{ IOException -> 0x00e0 }
        if (r1 == 0) goto L_0x00d7;
    L_0x0012:
        r2 = r1.c;	 Catch:{ IOException -> 0x00e0 }
        monitor-enter(r2);	 Catch:{ IOException -> 0x00e0 }
        r3 = r1.a;	 Catch:{ all -> 0x00d4 }
        r4 = r3.d;	 Catch:{ all -> 0x00d4 }
        if (r4 != r1) goto L_0x00ce;
    L_0x001b:
        r4 = new wym;	 Catch:{ all -> 0x00d4 }
        r5 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00d4 }
        r6 = 0;
        r3 = r3.b(r6);	 Catch:{ all -> 0x00d4 }
        r5.<init>(r3);	 Catch:{ all -> 0x00d4 }
        r4.<init>(r1, r5);	 Catch:{ all -> 0x00d4 }
        monitor-exit(r2);	 Catch:{ all -> 0x00d4 }
        r0 = r9.g;	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r2 = "VolleyDiskCache";
        r3 = "VolleyDiskCache";
        r0.put(r2, r3);	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r0 = new xlk;	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r0.<init>(r8, r9);	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r8 = 538181937; // 0x20140131 float:1.2536482E-19 double:2.658972063E-315;
        defpackage.xli.a(r4, r8);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r8 = r0.a;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        defpackage.xli.a(r4, r8);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r8 = r0.b;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        defpackage.xli.a(r4, r8);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r8 = r0.c;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        if (r8 != 0) goto L_0x004f;
    L_0x004d:
        r8 = "";
    L_0x004f:
        defpackage.xli.a(r4, r8);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r2 = r0.d;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        defpackage.xli.a(r4, r2);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r2 = r0.e;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        defpackage.xli.a(r4, r2);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r2 = r0.f;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        defpackage.xli.a(r4, r2);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r2 = r0.g;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        defpackage.xli.a(r4, r2);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r8 = r0.h;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        if (r8 == 0) goto L_0x0098;
    L_0x006a:
        r0 = r8.size();	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        defpackage.xli.a(r4, r0);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r8 = r8.entrySet();	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r8 = r8.iterator();	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
    L_0x0079:
        r0 = r8.hasNext();	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        if (r0 == 0) goto L_0x009b;
    L_0x007f:
        r0 = r8.next();	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r2 = r0.getKey();	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r2 = (java.lang.String) r2;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        defpackage.xli.a(r4, r2);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r0 = r0.getValue();	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        defpackage.xli.a(r4, r0);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
        goto L_0x0079;
    L_0x0098:
        defpackage.xli.a(r4, r6);	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
    L_0x009b:
        r4.flush();	 Catch:{ IOException -> 0x009e, all -> 0x00c8 }
    L_0x009e:
        r8 = r9.a;	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r4.write(r8);	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r8 = r1.b;	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        if (r8 == 0) goto L_0x00b6;
    L_0x00a7:
        r8 = r1.c;	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r8.a(r1, r6);	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r8 = r1.c;	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r9 = r1.a;	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r9 = r9.a;	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r8.c(r9);	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        goto L_0x00bc;
    L_0x00b6:
        r8 = r1.c;	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
        r9 = 1;
        r8.a(r1, r9);	 Catch:{ IOException -> 0x00cb, all -> 0x00c8 }
    L_0x00bc:
        r4.close();	 Catch:{ IOException -> 0x00c0 }
        goto L_0x00f5;
    L_0x00c0:
        r8 = move-exception;
        r9 = "VolleyDiskCache.put";
        defpackage.xtl.a(r9, r8);	 Catch:{ all -> 0x0106 }
        monitor-exit(r7);
        return;
    L_0x00c8:
        r8 = move-exception;
        r0 = r4;
        goto L_0x00f7;
    L_0x00cb:
        r8 = move-exception;
        r0 = r4;
        goto L_0x00e1;
    L_0x00ce:
        r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00d4 }
        r8.<init>();	 Catch:{ all -> 0x00d4 }
        throw r8;	 Catch:{ all -> 0x00d4 }
    L_0x00d4:
        r8 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00d4 }
        throw r8;	 Catch:{ IOException -> 0x00e0 }
    L_0x00d7:
        r8 = "VolleyDiskCache.put failed -- could not edit cache file";
        defpackage.xtl.c(r8);	 Catch:{ IOException -> 0x00e0 }
        monitor-exit(r7);
        return;
    L_0x00de:
        r8 = move-exception;
        goto L_0x00f7;
    L_0x00e0:
        r8 = move-exception;
    L_0x00e1:
        r9 = "VolleyDiskCache.put";
        defpackage.xtl.a(r9, r8);	 Catch:{ all -> 0x00de }
        if (r0 == 0) goto L_0x00f5;
    L_0x00e8:
        r0.close();	 Catch:{ IOException -> 0x00ed }
        monitor-exit(r7);
        return;
    L_0x00ed:
        r8 = move-exception;
        r9 = "VolleyDiskCache.put";
        defpackage.xtl.a(r9, r8);	 Catch:{ all -> 0x0106 }
        monitor-exit(r7);
        return;
    L_0x00f5:
        monitor-exit(r7);
        return;
    L_0x00f7:
        if (r0 == 0) goto L_0x0103;
    L_0x00f9:
        r0.close();	 Catch:{ IOException -> 0x00fd }
        goto L_0x0103;
    L_0x00fd:
        r9 = move-exception;
        r0 = "VolleyDiskCache.put";
        defpackage.xtl.a(r0, r9);	 Catch:{ all -> 0x0106 }
    L_0x0103:
        throw r8;	 Catch:{ all -> 0x0106 }
    L_0x0104:
        monitor-exit(r7);
        return;
    L_0x0106:
        r8 = move-exception;
        monitor-exit(r7);
        goto L_0x010a;
    L_0x0109:
        throw r8;
    L_0x010a:
        goto L_0x0109;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xli.a(java.lang.String, bpz):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6 A:{SYNTHETIC, Splitter:B:53:0x00e6} */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f4 A:{SYNTHETIC, Splitter:B:61:0x00f4} */
    public final synchronized defpackage.bpz a(java.lang.String r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.a;	 Catch:{ all -> 0x0101 }
        r1 = 0;
        if (r0 == 0) goto L_0x00ff;
    L_0x0006:
        r0 = defpackage.xli.d(r9);	 Catch:{ IOException -> 0x00dd, all -> 0x00da }
        r2 = r8.a;	 Catch:{ IOException -> 0x00dd, all -> 0x00da }
        r0 = r2.a(r0);	 Catch:{ IOException -> 0x00dd, all -> 0x00da }
        if (r0 != 0) goto L_0x0014;
    L_0x0012:
        goto L_0x00f0;
    L_0x0014:
        r0 = r0.a;	 Catch:{ IOException -> 0x00dd, all -> 0x00da }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ IOException -> 0x00dd, all -> 0x00da }
        r3 = new xlk;	 Catch:{ IOException -> 0x00d8 }
        r3.<init>();	 Catch:{ IOException -> 0x00d8 }
        r4 = defpackage.xli.b(r0);	 Catch:{ IOException -> 0x00d8 }
        r5 = 538181937; // 0x20140131 float:1.2536482E-19 double:2.658972063E-315;
        if (r4 != r5) goto L_0x00d0;
    L_0x0027:
        r4 = defpackage.xli.b(r0);	 Catch:{ IOException -> 0x00d8 }
        r3.a = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = defpackage.xli.d(r0);	 Catch:{ IOException -> 0x00d8 }
        r3.b = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = defpackage.xli.d(r0);	 Catch:{ IOException -> 0x00d8 }
        r3.c = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = r3.c;	 Catch:{ IOException -> 0x00d8 }
        r5 = "";
        r4 = r4.equals(r5);	 Catch:{ IOException -> 0x00d8 }
        if (r4 == 0) goto L_0x0045;
    L_0x0043:
        r3.c = r1;	 Catch:{ IOException -> 0x00d8 }
    L_0x0045:
        r4 = defpackage.xli.c(r0);	 Catch:{ IOException -> 0x00d8 }
        r3.d = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = defpackage.xli.c(r0);	 Catch:{ IOException -> 0x00d8 }
        r3.e = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = defpackage.xli.c(r0);	 Catch:{ IOException -> 0x00d8 }
        r3.f = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = defpackage.xli.c(r0);	 Catch:{ IOException -> 0x00d8 }
        r3.g = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = defpackage.xli.b(r0);	 Catch:{ IOException -> 0x00d8 }
        if (r4 != 0) goto L_0x0068;
    L_0x0063:
        r5 = java.util.Collections.emptyMap();	 Catch:{ IOException -> 0x00d8 }
        goto L_0x006d;
    L_0x0068:
        r5 = new zj;	 Catch:{ IOException -> 0x00d8 }
        r5.<init>(r4);	 Catch:{ IOException -> 0x00d8 }
    L_0x006d:
        if (r2 >= r4) goto L_0x0085;
    L_0x006f:
        r6 = defpackage.xli.d(r0);	 Catch:{ IOException -> 0x00d8 }
        r6 = r6.intern();	 Catch:{ IOException -> 0x00d8 }
        r7 = defpackage.xli.d(r0);	 Catch:{ IOException -> 0x00d8 }
        r7 = r7.intern();	 Catch:{ IOException -> 0x00d8 }
        r5.put(r6, r7);	 Catch:{ IOException -> 0x00d8 }
        r2 = r2 + 1;
        goto L_0x006d;
    L_0x0085:
        r3.h = r5;	 Catch:{ IOException -> 0x00d8 }
        r2 = r3.b;	 Catch:{ IOException -> 0x00d8 }
        r9 = r2.equals(r9);	 Catch:{ IOException -> 0x00d8 }
        if (r9 == 0) goto L_0x00c2;
    L_0x008f:
        r9 = r3.a;	 Catch:{ IOException -> 0x00d8 }
        r9 = defpackage.xli.a(r0, r9);	 Catch:{ IOException -> 0x00d8 }
        r2 = new bpz;	 Catch:{ IOException -> 0x00d8 }
        r2.<init>();	 Catch:{ IOException -> 0x00d8 }
        r2.a = r9;	 Catch:{ IOException -> 0x00d8 }
        r9 = r3.c;	 Catch:{ IOException -> 0x00d8 }
        r2.b = r9;	 Catch:{ IOException -> 0x00d8 }
        r4 = r3.d;	 Catch:{ IOException -> 0x00d8 }
        r2.d = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = r3.e;	 Catch:{ IOException -> 0x00d8 }
        r2.c = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = r3.f;	 Catch:{ IOException -> 0x00d8 }
        r2.e = r4;	 Catch:{ IOException -> 0x00d8 }
        r4 = r3.g;	 Catch:{ IOException -> 0x00d8 }
        r2.f = r4;	 Catch:{ IOException -> 0x00d8 }
        r9 = r3.h;	 Catch:{ IOException -> 0x00d8 }
        r2.g = r9;	 Catch:{ IOException -> 0x00d8 }
        if (r0 == 0) goto L_0x00c0;
    L_0x00b6:
        r0.close();	 Catch:{ IOException -> 0x00ba }
        goto L_0x00c0;
    L_0x00ba:
        r9 = move-exception;
        r0 = "VolleyDiskCache.get";
        defpackage.xtl.a(r0, r9);	 Catch:{ all -> 0x0101 }
    L_0x00c0:
        monitor-exit(r8);
        return r2;
    L_0x00c2:
        if (r0 == 0) goto L_0x00ce;
    L_0x00c4:
        r0.close();	 Catch:{ IOException -> 0x00c8 }
        goto L_0x00ce;
    L_0x00c8:
        r9 = move-exception;
        r0 = "VolleyDiskCache.get";
        defpackage.xtl.a(r0, r9);	 Catch:{ all -> 0x0101 }
    L_0x00ce:
        monitor-exit(r8);
        return r1;
    L_0x00d0:
        r9 = new java.io.IOException;	 Catch:{ IOException -> 0x00d8 }
        r9.<init>();	 Catch:{ IOException -> 0x00d8 }
        throw r9;	 Catch:{ IOException -> 0x00d8 }
    L_0x00d6:
        r9 = move-exception;
        goto L_0x00f2;
    L_0x00d8:
        r9 = move-exception;
        goto L_0x00df;
    L_0x00da:
        r9 = move-exception;
        r0 = r1;
        goto L_0x00f2;
    L_0x00dd:
        r9 = move-exception;
        r0 = r1;
    L_0x00df:
        r2 = "VolleyDiskCache.get";
        defpackage.xtl.a(r2, r9);	 Catch:{ all -> 0x00d6 }
        if (r0 == 0) goto L_0x00f0;
    L_0x00e6:
        r0.close();	 Catch:{ IOException -> 0x00ea }
        goto L_0x00f0;
    L_0x00ea:
        r9 = move-exception;
        r0 = "VolleyDiskCache.get";
        defpackage.xtl.a(r0, r9);	 Catch:{ all -> 0x0101 }
    L_0x00f0:
        monitor-exit(r8);
        return r1;
    L_0x00f2:
        if (r0 == 0) goto L_0x00fe;
    L_0x00f4:
        r0.close();	 Catch:{ IOException -> 0x00f8 }
        goto L_0x00fe;
    L_0x00f8:
        r0 = move-exception;
        r1 = "VolleyDiskCache.get";
        defpackage.xtl.a(r1, r0);	 Catch:{ all -> 0x0101 }
    L_0x00fe:
        throw r9;	 Catch:{ all -> 0x0101 }
    L_0x00ff:
        monitor-exit(r8);
        return r1;
    L_0x0101:
        r9 = move-exception;
        monitor-exit(r8);
        goto L_0x0105;
    L_0x0104:
        throw r9;
    L_0x0105:
        goto L_0x0104;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xli.a(java.lang.String):bpz");
    }

    public final synchronized void c(String str) {
        if (this.a != null) {
            try {
                this.a.c(xli.d(str));
            } catch (IOException e) {
                xtl.a("VolleyDiskCache.remove", e);
            }
        }
    }

    private static String d(String str) {
        return String.valueOf(str.hashCode());
    }

    private static int a(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static void a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    private static int b(InputStream inputStream) {
        return (xli.a(inputStream) << 24) | ((xli.a(inputStream) | (xli.a(inputStream) << 8)) | (xli.a(inputStream) << 16));
    }

    private static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    private static long c(InputStream inputStream) {
        return (((((((((long) xli.a(inputStream)) & 255) | ((((long) xli.a(inputStream)) & 255) << 8)) | ((((long) xli.a(inputStream)) & 255) << 16)) | ((((long) xli.a(inputStream)) & 255) << 24)) | ((((long) xli.a(inputStream)) & 255) << 32)) | ((((long) xli.a(inputStream)) & 255) << 40)) | ((((long) xli.a(inputStream)) & 255) << 48)) | ((255 & ((long) xli.a(inputStream))) << 56);
    }

    private static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        xli.a(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    private static String d(InputStream inputStream) {
        return new String(xli.a(inputStream, (int) xli.c(inputStream)), "UTF-8");
    }

    private static byte[] a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("Expected ");
        stringBuilder.append(i);
        stringBuilder.append(" bytes, read ");
        stringBuilder.append(i2);
        stringBuilder.append(" bytes");
        throw new IOException(stringBuilder.toString());
    }
}
