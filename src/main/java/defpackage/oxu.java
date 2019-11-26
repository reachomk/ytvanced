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

/* renamed from: oxu */
public final class oxu implements oww {
    public static boolean a;
    private static final HashSet f = new HashSet();
    public final File b;
    public final oxd c;
    public final oxj d;
    public owv e;
    private final HashMap g;
    private final Random h;
    private final boolean i;
    private long j;
    private boolean k;

    @Deprecated
    public oxu(File file, oxd oxd, byte[] bArr, boolean z) {
        oxj oxj = new oxj(file, bArr, z);
        if (oxu.a(file)) {
            this.b = file;
            this.c = oxd;
            this.d = oxj;
            this.g = new HashMap();
            this.h = new Random();
            this.i = oxd.a();
            ConditionVariable conditionVariable = new ConditionVariable();
            new oxt(this, "SimpleCache.initialize()", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 46);
        stringBuilder.append("Another SimpleCache instance uses the folder: ");
        stringBuilder.append(valueOf);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final synchronized void a() {
        if (!a) {
            owv owv = this.e;
            if (owv != null) {
                throw owv;
            }
        }
    }

    public final synchronized void b() {
        if (!this.k) {
            this.g.clear();
            e();
            try {
                this.d.a();
                oxu.b(this.b);
                this.k = true;
            } catch (IOException e) {
                try {
                    oyp.b("SimpleCache", "Storing index file failed", e);
                } finally {
                    oxu.b(this.b);
                    this.k = true;
                }
            }
        }
    }

    public final synchronized NavigableSet a(String str) {
        NavigableSet treeSet;
        oxz.b(this.k ^ 1);
        oxk b = this.d.b(str);
        if (b != null) {
            if (!b.a()) {
                treeSet = new TreeSet(b.c);
            }
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    public final synchronized Set c() {
        oxz.b(this.k ^ 1);
        return new HashSet(this.d.a.keySet());
    }

    public final synchronized long d() {
        oxz.b(this.k ^ 1);
        return this.j;
    }

    private final synchronized oxw c(String str, long j) {
        oxw d;
        oxz.b(this.k ^ 1);
        a();
        while (true) {
            d = d(str, j);
            if (d == null) {
                wait();
            }
        }
        return d;
    }

    private final synchronized oxw d(String str, long j) {
        oxw a;
        oxz.b(this.k ^ 1);
        a();
        oxk b = this.d.b(str);
        if (b != null) {
            while (true) {
                a = b.a(j);
                if (!a.d || a.e.exists()) {
                    break;
                }
                e();
            }
        } else {
            a = oxw.a(str, j);
        }
        oxk a2;
        if (!a.d) {
            a2 = this.d.a(str);
            if (a2.e) {
                return null;
            }
            a2.e = true;
            return a;
        } else if (!this.i) {
            return a;
        } else {
            File file;
            ((File) oxz.a(a.e)).getName();
            long currentTimeMillis = System.currentTimeMillis();
            a2 = this.d.b(str);
            oxz.b(a2.c.remove(a));
            File file2 = a.e;
            File a3 = oxw.a(file2.getParentFile(), a2.a, a.b, currentTimeMillis);
            if (file2.renameTo(a3)) {
                file = a3;
            } else {
                String valueOf = String.valueOf(file2);
                String valueOf2 = String.valueOf(a3);
                StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 21) + valueOf2.length());
                stringBuilder.append("Failed to rename ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" to ");
                stringBuilder.append(valueOf2);
                oyp.a("CachedContent", stringBuilder.toString());
                file = file2;
            }
            oxz.b(a.d);
            oxw oxw = new oxw(a.a, a.b, a.c, currentTimeMillis, file);
            a2.c.add(oxw);
            ArrayList arrayList = (ArrayList) this.g.get(a.a);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((owy) arrayList.get(size)).a(this, a, oxw);
                }
            }
            this.c.a(this, a, oxw);
            return oxw;
        }
    }

    public final synchronized File a(String str, long j, long j2) {
        Object b;
        File file;
        oxz.b(this.k ^ 1);
        a();
        b = this.d.b(str);
        oxz.a(b);
        oxz.b(b.e);
        if (!this.b.exists()) {
            this.b.mkdirs();
            e();
        }
        this.c.a(this, j2);
        file = new File(this.b, Integer.toString(this.h.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return oxw.a(file, b.a, j, System.currentTimeMillis());
    }

    public final synchronized void a(File file, long j) {
        boolean z = true;
        oxz.b(this.k ^ 1);
        if (!file.exists()) {
            return;
        }
        if (j != 0) {
            oxw oxw = (oxw) oxz.a(oxw.a(file, j, -9223372036854775807L, this.d));
            oxk oxk = (oxk) oxz.a(this.d.b(oxw.a));
            oxz.b(oxk.e);
            j = oxn.a(oxk.d);
            if (j != -1) {
                if (oxw.b + oxw.c > j) {
                    z = false;
                }
                oxz.b(z);
            }
            a(oxw);
            try {
                this.d.a();
                notifyAll();
                return;
            } catch (IOException e) {
                throw new owv(e);
            }
        }
        file.delete();
    }

    public final synchronized void a(oxf oxf) {
        oxz.b(this.k ^ 1);
        Object b = this.d.b(oxf.a);
        oxz.a(b);
        oxz.b(b.e);
        b.e = false;
        this.d.c(b.b);
        notifyAll();
    }

    public final synchronized void b(oxf oxf) {
        oxz.b(this.k ^ 1);
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
        r0 = r1.k;	 Catch:{ all -> 0x007b }
        r6 = 1;
        r0 = r0 ^ r6;
        defpackage.oxz.b(r0);	 Catch:{ all -> 0x007b }
        r0 = r1.d;	 Catch:{ all -> 0x007b }
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
        r8 = (defpackage.oxw) r8;	 Catch:{ all -> 0x007b }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxu.b(java.lang.String, long, long):boolean");
    }

    public final synchronized void a(String str, oxq oxq) {
        oxz.b(this.k ^ 1);
        a();
        oxj oxj = this.d;
        oxk a = oxj.a(str);
        oxp oxp = a.d;
        a.d = oxp.a(oxq);
        if ((a.d.equals(oxp) ^ 1) != 0) {
            oxj.c.b();
        }
        try {
            this.d.a();
        } catch (IOException e) {
            throw new owv(e);
        }
    }

    public final synchronized oxo b(String str) {
        oxo oxo;
        oxz.b(this.k ^ 1);
        oxk b = this.d.b(str);
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
                    oxw a = oxw.a(file2, -1, -9223372036854775807L, this.d);
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

    private final void a(oxw oxw) {
        this.d.a(oxw.a).c.add(oxw);
        this.j += oxw.c;
        ArrayList arrayList = (ArrayList) this.g.get(oxw.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((owy) arrayList.get(size)).a(this, oxw);
            }
        }
        this.c.a(this, oxw);
    }

    private final void c(oxf oxf) {
        oxk b = this.d.b(oxf.a);
        if (b != null && b.c.remove(oxf)) {
            oxf.e.delete();
            this.j -= oxf.c;
            this.d.c(b.b);
            ArrayList arrayList = (ArrayList) this.g.get(oxf.a);
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
            this.c.a(oxf);
        }
    }

    private final void e() {
        ArrayList arrayList = new ArrayList();
        for (oxk oxk : this.d.a.values()) {
            Iterator it = oxk.c.iterator();
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
        boolean add;
        synchronized (oxu.class) {
            add = f.add(file.getAbsoluteFile());
        }
        return add;
    }

    private static synchronized void b(File file) {
        synchronized (oxu.class) {
            f.remove(file.getAbsoluteFile());
        }
    }

    public final /* synthetic */ oxf b(String str, long j) {
        return c(str, j);
    }
}
