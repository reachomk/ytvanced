package defpackage;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: nxp */
public final class nxp implements oww {
    private static final HashSet d = new HashSet();
    private static boolean e;
    public final File a;
    public final oxd b;
    public final nxo c;
    private final HashMap f;
    private final Random g;
    private long h;
    private boolean i;

    @Deprecated
    public static synchronized void a() {
        synchronized (nxp.class) {
            e = true;
            d.clear();
        }
    }

    public nxp(File file, oxd oxd, byte[] bArr, boolean z) {
        nxo nxo = new nxo(file, bArr, z);
        if (nxp.a(file)) {
            this.a = file;
            this.b = oxd;
            this.c = nxo;
            this.f = new HashMap();
            this.g = new Random();
            ConditionVariable conditionVariable = new ConditionVariable();
            new nxs(this, "SimpleCache.initialize()", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 46);
        stringBuilder.append("Another SimpleCache instance uses the folder: ");
        stringBuilder.append(valueOf);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final synchronized void b() {
        if (!this.i) {
            this.f.clear();
            e();
            try {
                this.c.a();
                nxp.b(this.a);
                this.i = true;
            } catch (IOException e) {
                try {
                    oyp.b("SimpleCache", "Storing index file failed", e);
                } finally {
                    nxp.b(this.a);
                    this.i = true;
                }
            }
        }
    }

    public final synchronized NavigableSet a(String str) {
        NavigableSet treeSet;
        oxz.b(this.i ^ 1);
        nxl b = this.c.b(str);
        if (b != null) {
            if (!b.a()) {
                treeSet = new TreeSet(b.c);
            }
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    public final synchronized Set c() {
        oxz.b(this.i ^ 1);
        return new HashSet(this.c.a.keySet());
    }

    public final synchronized long d() {
        oxz.b(this.i ^ 1);
        return this.h;
    }

    private final synchronized nxr c(String str, long j) {
        nxr d;
        while (true) {
            d = d(str, j);
            if (d == null) {
                wait();
            }
        }
        return d;
    }

    private final synchronized nxr d(String str, long j) {
        nxr a;
        oxz.b(this.i ^ 1);
        nxl b = this.c.b(str);
        if (b != null) {
            while (true) {
                a = b.a(j);
                if (!a.d || a.e.exists()) {
                    break;
                }
                e();
            }
        } else {
            a = nxr.a(str, j);
        }
        nxl b2;
        if (a.d) {
            File file;
            ((File) oxz.a(a.e)).getName();
            long currentTimeMillis = System.currentTimeMillis();
            b2 = this.c.b(str);
            oxz.b(b2.c.remove(a));
            File file2 = a.e;
            File a2 = nxr.a(file2.getParentFile(), b2.a, a.b, currentTimeMillis);
            if (file2.renameTo(a2)) {
                file = a2;
            } else {
                String valueOf = String.valueOf(file2);
                String valueOf2 = String.valueOf(a2);
                StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 22) + valueOf2.length());
                stringBuilder.append("Failed to rename ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" to ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(".");
                oyp.a("CachedContent", stringBuilder.toString());
                file = file2;
            }
            oxz.b(a.d);
            nxr nxr = new nxr(a.a, a.b, a.c, currentTimeMillis, file);
            b2.c.add(nxr);
            ArrayList arrayList = (ArrayList) this.f.get(a.a);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((owy) arrayList.get(size)).a(this, a, nxr);
                }
            }
            this.b.a(this, a, nxr);
            return nxr;
        }
        b2 = this.c.a(str);
        if (b2.e) {
            return null;
        }
        b2.e = true;
        return a;
    }

    public final synchronized File a(String str, long j, long j2) {
        Object b;
        File file;
        oxz.b(this.i ^ 1);
        b = this.c.b(str);
        oxz.a(b);
        oxz.b(b.e);
        if (!this.a.exists()) {
            this.a.mkdirs();
            e();
        }
        this.b.a(this, j2);
        file = new File(this.a, Integer.toString(this.g.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return nxr.a(file, b.a, j, System.currentTimeMillis());
    }

    public final synchronized void a(File file, long j) {
        oxz.b(this.i ^ 1);
        if (!file.exists()) {
            return;
        }
        if (j != 0) {
            nxr a = nxr.a(file, j, -9223372036854775807L, this.c);
            boolean z = false;
            oxz.b(a != null);
            Object b = this.c.b(a.a);
            oxz.a(b);
            oxz.b(b.e);
            long a2 = oxn.a(b.d);
            if (a2 != -1) {
                if (a.b + a.c <= a2) {
                    z = true;
                }
                oxz.b(z);
            }
            a(a);
            this.c.a();
            notifyAll();
            return;
        }
        file.delete();
    }

    public final synchronized void a(oxf oxf) {
        oxz.b(this.i ^ 1);
        Object b = this.c.b(oxf.a);
        oxz.a(b);
        oxz.b(b.e);
        b.e = false;
        this.c.c(b.b);
        notifyAll();
    }

    public final synchronized void b(oxf oxf) {
        oxz.b(this.i ^ 1);
        c(oxf);
    }

    /* JADX WARNING: Missing block: B:32:0x007a, code skipped:
            return false;
     */
    public final synchronized boolean b(java.lang.String r17, long r18, long r20) {
        /*
        r16 = this;
        r1 = r16;
        r2 = r18;
        r4 = r20;
        monitor-enter(r16);
        r0 = r1.i;	 Catch:{ all -> 0x007b }
        r6 = 1;
        r0 = r0 ^ r6;
        defpackage.oxz.b(r0);	 Catch:{ all -> 0x007b }
        r0 = r1.c;	 Catch:{ all -> 0x007b }
        r7 = r17;
        r0 = r0.b(r7);	 Catch:{ all -> 0x007b }
        r7 = 0;
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0078;
    L_0x001a:
        r8 = r0.a(r2);	 Catch:{ all -> 0x007b }
        r9 = r8.b();	 Catch:{ all -> 0x007b }
        if (r9 != 0) goto L_0x005f;
    L_0x0024:
        r9 = r2 + r4;
        r11 = r8.b;	 Catch:{ all -> 0x007b }
        r13 = r8.c;	 Catch:{ all -> 0x007b }
        r11 = r11 + r13;
        r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r13 >= 0) goto L_0x0059;
    L_0x002f:
        r0 = r0.c;	 Catch:{ all -> 0x007b }
        r0 = r0.tailSet(r8, r7);	 Catch:{ all -> 0x007b }
        r0 = r0.iterator();	 Catch:{ all -> 0x007b }
    L_0x0039:
        r8 = r0.hasNext();	 Catch:{ all -> 0x007b }
        if (r8 == 0) goto L_0x0059;
    L_0x003f:
        r8 = r0.next();	 Catch:{ all -> 0x007b }
        r8 = (defpackage.nxr) r8;	 Catch:{ all -> 0x007b }
        r13 = r8.b;	 Catch:{ all -> 0x007b }
        r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1));
        if (r15 > 0) goto L_0x0059;
    L_0x004b:
        r7 = r8.c;	 Catch:{ all -> 0x007b }
        r13 = r13 + r7;
        r11 = java.lang.Math.max(r11, r13);	 Catch:{ all -> 0x007b }
        r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r7 < 0) goto L_0x0057;
    L_0x0056:
        goto L_0x0059;
    L_0x0057:
        r7 = 0;
        goto L_0x0039;
    L_0x0059:
        r11 = r11 - r2;
        r2 = java.lang.Math.min(r11, r4);	 Catch:{ all -> 0x007b }
        goto L_0x0072;
    L_0x005f:
        r0 = r8.a();	 Catch:{ all -> 0x007b }
        if (r0 != 0) goto L_0x0068;
    L_0x0065:
        r2 = r8.c;	 Catch:{ all -> 0x007b }
        goto L_0x006d;
    L_0x0068:
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x006d:
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ all -> 0x007b }
        r2 = -r2;
    L_0x0072:
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x0078;
    L_0x0076:
        monitor-exit(r16);
        return r6;
    L_0x0078:
        monitor-exit(r16);
        r0 = 0;
        return r0;
    L_0x007b:
        r0 = move-exception;
        monitor-exit(r16);
        goto L_0x007f;
    L_0x007e:
        throw r0;
    L_0x007f:
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxp.b(java.lang.String, long, long):boolean");
    }

    public final synchronized void a(String str, oxq oxq) {
        oxz.b(this.i ^ 1);
        nxo nxo = this.c;
        nxl a = nxo.a(str);
        oxp oxp = a.d;
        a.d = oxp.a(oxq);
        if ((a.d.equals(oxp) ^ 1) != 0) {
            nxo.c.b();
        }
        this.c.a();
    }

    public final synchronized oxo b(String str) {
        oxo oxo;
        oxz.b(this.i ^ 1);
        nxl b = this.c.b(str);
        if (b == null) {
            oxo = oxp.a;
        } else {
            oxo = b.d;
        }
        return oxo;
    }

    public final void a(File file, boolean z, File[] fileArr) {
        if (fileArr != null) {
            if (r0 != 0) {
                for (File file2 : fileArr) {
                    String name = file2.getName();
                    if (z) {
                        if (name.indexOf(46) == -1) {
                            a(file2, false, file2.listFiles());
                        } else if (!name.startsWith("cached_content_index.exi")) {
                            if (name.endsWith(".uid")) {
                            }
                        }
                    }
                    nxr a = nxr.a(file2, -1, -9223372036854775807L, this.c);
                    if (a != null) {
                        a(a);
                    } else {
                        file2.delete();
                    }
                }
                return;
            }
        }
        if (!z) {
            file.delete();
        }
    }

    private final void a(nxr nxr) {
        this.c.a(nxr.a).c.add(nxr);
        this.h += nxr.c;
        ArrayList arrayList = (ArrayList) this.f.get(nxr.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((owy) arrayList.get(size)).a(this, nxr);
            }
        }
        this.b.a(this, nxr);
    }

    private final void c(oxf oxf) {
        nxl b = this.c.b(oxf.a);
        if (b != null && b.c.remove(oxf)) {
            oxf.e.delete();
            this.h -= oxf.c;
            this.c.c(b.b);
            ArrayList arrayList = (ArrayList) this.f.get(oxf.a);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((owy) arrayList.get(size)).a(oxf);
                }
            }
            this.b.a(oxf);
        }
    }

    private final void e() {
        ArrayList arrayList = new ArrayList();
        for (nxl nxl : this.c.a.values()) {
            Iterator it = nxl.c.iterator();
            while (it.hasNext()) {
                oxf oxf = (oxf) it.next();
                if (!oxf.e.exists()) {
                    arrayList.add(oxf);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            c((oxf) arrayList.get(i));
        }
    }

    private static synchronized boolean a(File file) {
        synchronized (nxp.class) {
            if (e) {
                return true;
            }
            boolean add = d.add(file.getAbsoluteFile());
            return add;
        }
    }

    private static synchronized void b(File file) {
        synchronized (nxp.class) {
            if (!e) {
                d.remove(file.getAbsoluteFile());
            }
        }
    }

    public final /* synthetic */ oxf b(String str, long j) {
        return c(str, j);
    }
}
