package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: agmp */
public final class agmp implements oww {
    private final Context a;
    private final agnf b;
    private final Map c;
    private final Map d;
    private final Map e;
    private final List f;
    private long g = 0;

    public agmp(Context context, agnf agnf) {
        this.a = context;
        this.b = agnf;
        this.c = new zj();
        this.d = new zj();
        this.e = new zj();
        this.f = new ArrayList();
    }

    public final void a(String str, oxq oxq) {
    }

    public final synchronized void a(oxf oxf) {
    }

    public final void b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARNING: Missing block: B:14:0x003b, code skipped:
            if (defpackage.agmn.a(r1).isFile() == false) goto L_0x003d;
     */
    /* JADX WARNING: Missing block: B:34:0x009f, code skipped:
            if (r0 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Missing block: B:36:?, code skipped:
            r0.close();
     */
    public final synchronized void a(android.net.Uri r10) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = defpackage.xvt.a(r10);	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x0043;
    L_0x0007:
        r0 = r10.getPath();	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x003d;
    L_0x000d:
        r1 = new java.io.File;	 Catch:{ all -> 0x00cd }
        r1.<init>(r0);	 Catch:{ all -> 0x00cd }
        r0 = r1.isFile();	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x0033;
    L_0x0018:
        r0 = r1.getName();	 Catch:{ all -> 0x00cd }
        r2 = java.util.Locale.US;	 Catch:{ all -> 0x00cd }
        r0 = r0.toLowerCase(r2);	 Catch:{ all -> 0x00cd }
        r2 = defpackage.agmj.a;	 Catch:{ all -> 0x00cd }
        r3 = r2.length;	 Catch:{ all -> 0x00cd }
        r4 = 0;
    L_0x0026:
        if (r4 >= r3) goto L_0x0033;
    L_0x0028:
        r5 = r2[r4];	 Catch:{ all -> 0x00cd }
        r5 = r0.endsWith(r5);	 Catch:{ all -> 0x00cd }
        if (r5 != 0) goto L_0x0043;
    L_0x0030:
        r4 = r4 + 1;
        goto L_0x0026;
    L_0x0033:
        r0 = defpackage.agmn.a(r1);	 Catch:{ all -> 0x00cd }
        r0 = r0.isFile();	 Catch:{ all -> 0x00cd }
        if (r0 != 0) goto L_0x0043;
    L_0x003d:
        r10 = defpackage.amul.g();	 Catch:{ all -> 0x00cd }
        goto L_0x00b7;
    L_0x0043:
        r0 = r9.b;	 Catch:{ IOException -> 0x00aa }
        r1 = 1;
        r0 = r0.a(r10, r1);	 Catch:{ IOException -> 0x00aa }
        r0.a();	 Catch:{ all -> 0x009c }
        r1 = r0.b();	 Catch:{ all -> 0x009c }
        r0.close();	 Catch:{ IOException -> 0x00aa }
        r0 = r1.size();	 Catch:{ all -> 0x00cd }
        r0 = defpackage.amul.a(r0);	 Catch:{ all -> 0x00cd }
        r1 = r1.iterator();	 Catch:{ all -> 0x00cd }
    L_0x0060:
        r2 = r1.hasNext();	 Catch:{ all -> 0x00cd }
        if (r2 == 0) goto L_0x0097;
    L_0x0066:
        r2 = r1.next();	 Catch:{ all -> 0x00cd }
        r2 = (defpackage.agnn) r2;	 Catch:{ all -> 0x00cd }
        r3 = r2.b();	 Catch:{ all -> 0x00cd }
        r3 = r3.o;	 Catch:{ all -> 0x00cd }
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0060;
    L_0x0078:
        r3 = r2.a();	 Catch:{ all -> 0x00cd }
        r4 = r3.b;	 Catch:{ all -> 0x00cd }
        r5 = r3.c;	 Catch:{ all -> 0x00cd }
        r6 = r3.d;	 Catch:{ all -> 0x00cd }
        r7 = r3.e;	 Catch:{ all -> 0x00cd }
        r3 = defpackage.aeey.a(r4, r5, r6, r7);	 Catch:{ all -> 0x00cd }
        r4 = new agmr;	 Catch:{ all -> 0x00cd }
        r2 = r2.b();	 Catch:{ all -> 0x00cd }
        r5 = r2.o;	 Catch:{ all -> 0x00cd }
        r4.<init>(r3, r5, r10);	 Catch:{ all -> 0x00cd }
        r0.c(r4);	 Catch:{ all -> 0x00cd }
        goto L_0x0060;
    L_0x0097:
        r10 = r0.a();	 Catch:{ all -> 0x00cd }
        goto L_0x00b7;
    L_0x009c:
        r10 = move-exception;
        throw r10;	 Catch:{ all -> 0x009e }
    L_0x009e:
        r1 = move-exception;
        if (r0 == 0) goto L_0x00a9;
    L_0x00a1:
        r0.close();	 Catch:{ all -> 0x00a5 }
        goto L_0x00a9;
    L_0x00a5:
        r0 = move-exception;
        defpackage.ankx.a(r10, r0);	 Catch:{ IOException -> 0x00aa }
    L_0x00a9:
        throw r1;	 Catch:{ IOException -> 0x00aa }
    L_0x00aa:
        r10 = move-exception;
        r0 = 2;
        r1 = defpackage.afpf.lite;	 Catch:{ all -> 0x00cd }
        r2 = "Failed to get streams metadata from ytb file";
        defpackage.afpc.a(r0, r1, r2, r10);	 Catch:{ all -> 0x00cd }
        r10 = defpackage.amul.g();	 Catch:{ all -> 0x00cd }
    L_0x00b7:
        r10 = r10.iterator();	 Catch:{ all -> 0x00cd }
    L_0x00bb:
        r0 = r10.hasNext();	 Catch:{ all -> 0x00cd }
        if (r0 == 0) goto L_0x00cb;
    L_0x00c1:
        r0 = r10.next();	 Catch:{ all -> 0x00cd }
        r0 = (defpackage.agmr) r0;	 Catch:{ all -> 0x00cd }
        r9.a(r0);	 Catch:{ all -> 0x00cd }
        goto L_0x00bb;
    L_0x00cb:
        monitor-exit(r9);
        return;
    L_0x00cd:
        r10 = move-exception;
        monitor-exit(r9);
        goto L_0x00d1;
    L_0x00d0:
        throw r10;
    L_0x00d1:
        goto L_0x00d0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmp.a(android.net.Uri):void");
    }

    private final synchronized void a(agmr agmr) {
        amqw.b(agmr.b == 0, (Object) "YTB cache only supports spans at 0 position.");
        amqw.a(agmr.e, (Object) "YTB cache requires files in spans");
        agmr agmr2 = (agmr) this.c.put(agmr.a, agmr);
        if (agmr2 != null) {
            this.g -= agmr2.c;
        }
        this.g += agmr.c;
        if (!this.d.containsKey(agmr.g)) {
            this.d.put(agmr.g, new zl());
        }
        ((Set) this.d.get(agmr.g)).add(agmr.a);
        List list = (List) this.e.get(agmr.a);
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((owy) list.get(size)).a(this, agmr);
            }
        }
    }

    public final synchronized void a() {
        ArrayList arrayList = new ArrayList();
        zl zlVar = new zl();
        for (Entry entry : this.c.entrySet()) {
            agmr agmr = (agmr) entry.getValue();
            if (b(agmr)) {
                arrayList.add((String) entry.getKey());
                zlVar.add(agmr.g);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            agmr agmr2 = (agmr) this.c.remove((String) arrayList.get(i));
            if (agmr2 != null) {
                arrayList2.add(agmr2);
            }
        }
        this.d.keySet().removeAll(zlVar);
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            oxf oxf = (oxf) arrayList2.get(i2);
            c(oxf);
            this.g -= oxf.c;
        }
        if (!arrayList2.isEmpty()) {
            for (agms a : this.f) {
                a.a();
            }
        }
    }

    public final synchronized NavigableSet a(String str) {
        NavigableSet treeSet;
        if (this.c.containsKey(str)) {
            treeSet = new TreeSet(amul.a((agmr) this.c.get(str)));
        } else {
            treeSet = new TreeSet();
        }
        return treeSet;
    }

    public final synchronized Set c() {
        return amuw.a(this.c.keySet());
    }

    public final synchronized long d() {
        return this.g;
    }

    public final synchronized oxf b(String str, long j) {
        oxf a = a(str, j);
        if (a != null) {
            return a;
        }
        return new oxf(str, j, -1, -9223372036854775807L, null);
    }

    /* JADX WARNING: Missing block: B:13:0x0022, code skipped:
            if (r6 >= r5.c) goto L_0x0025;
     */
    /* JADX WARNING: Missing block: B:14:0x0024, code skipped:
            return r5;
     */
    /* JADX WARNING: Missing block: B:15:0x0025, code skipped:
            return null;
     */
    public final synchronized defpackage.oxf a(java.lang.String r5, long r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.c;	 Catch:{ all -> 0x0028 }
        r0 = r0.containsKey(r5);	 Catch:{ all -> 0x0028 }
        r1 = 0;
        if (r0 == 0) goto L_0x0026;
    L_0x000a:
        r0 = r4.c;	 Catch:{ all -> 0x0028 }
        r5 = r0.get(r5);	 Catch:{ all -> 0x0028 }
        r5 = (defpackage.agmr) r5;	 Catch:{ all -> 0x0028 }
        r0 = r4.b(r5);	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x001d;
    L_0x0018:
        r4.a();	 Catch:{ all -> 0x0028 }
        monitor-exit(r4);
        return r1;
    L_0x001d:
        r2 = r5.c;	 Catch:{ all -> 0x0028 }
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        monitor-exit(r4);
        if (r0 >= 0) goto L_0x0025;
    L_0x0024:
        return r5;
    L_0x0025:
        return r1;
    L_0x0026:
        monitor-exit(r4);
        return r1;
    L_0x0028:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agmp.a(java.lang.String, long):oxf");
    }

    public final synchronized File a(String str, long j, long j2) {
        throw new owv("YTB cache does not support write case.");
    }

    public final synchronized void a(File file, long j) {
        throw new owv("YTB cache does not support write case.");
    }

    public final synchronized boolean b(String str, long j, long j2) {
        return c(str, j, j2) >= j2;
    }

    private final synchronized long c(String str, long j, long j2) {
        if (!this.c.containsKey(str)) {
            return 0;
        }
        agmr agmr = (agmr) this.c.get(str);
        if (b(agmr)) {
            a();
            return 0;
        }
        long j3 = agmr.c;
        if (j3 < j) {
            return 0;
        }
        return Math.min(j3, j2 + j) - j;
    }

    public final synchronized void b(oxf oxf) {
        if (oxf.e == null) {
            xtl.d("Attempt to remove span failed. Span does not have a file.");
        } else if (this.c.containsKey(oxf.a)) {
            agmn.a(this.a, ((agmr) this.c.get(oxf.a)).g);
            a();
            c(oxf);
        } else {
            xtl.d("Attempt to remove span with unrecognized key");
        }
    }

    public final oxo b(String str) {
        return oxp.a;
    }

    private final void c(oxf oxf) {
        List list = (List) this.e.get(oxf.a);
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((owy) list.get(size)).a(oxf);
                } else {
                    return;
                }
            }
        }
    }

    private final boolean b(agmr agmr) {
        try {
            this.b.a(agmr.g, true);
            return false;
        } catch (IOException unused) {
            return true;
        }
    }
}
