package defpackage;

import android.os.Debug;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/* renamed from: uci */
public final class uci extends Thread {
    public final ReferenceQueue a;
    public File b;
    public final uce c;
    public final uch d;
    public final uce e;
    private final ucg f;
    private final Deque g = new ArrayDeque(20);
    private final Deque h = new ArrayDeque(3);
    private final boolean i;

    /* JADX WARNING: Missing block: B:38:0x0076, code skipped:
            r0 = (defpackage.uce) r8.h.poll();
     */
    /* JADX WARNING: Missing block: B:39:0x0080, code skipped:
            if (r0.c == null) goto L_0x0083;
     */
    /* JADX WARNING: Missing block: B:41:0x0083, code skipped:
            r4 = false;
     */
    /* JADX WARNING: Missing block: B:42:0x0084, code skipped:
            r3 = r8.e;
     */
    /* JADX WARNING: Missing block: B:43:0x0086, code skipped:
            r3 = r3.c;
     */
    /* JADX WARNING: Missing block: B:44:0x0088, code skipped:
            if (r3 == null) goto L_0x008d;
     */
    /* JADX WARNING: Missing block: B:45:0x008a, code skipped:
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:46:0x008d, code skipped:
            r3 = r0.c;
     */
    /* JADX WARNING: Missing block: B:47:0x008f, code skipped:
            if (r3 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Missing block: B:48:0x0091, code skipped:
            r3.a();
            r8.f.b(r3.a);
     */
    /* JADX WARNING: Missing block: B:49:0x009d, code skipped:
            if (r2 >= 500) goto L_0x008d;
     */
    /* JADX WARNING: Missing block: B:50:0x009f, code skipped:
            r3.a(r8.e);
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:51:0x00a7, code skipped:
            r8.h.offer(r0);
            r2 = r8.c;
     */
    /* JADX WARNING: Missing block: B:52:0x00ae, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:54:?, code skipped:
            r3 = r8.c;
            r5 = r3.c;
     */
    /* JADX WARNING: Missing block: B:55:0x00b3, code skipped:
            if (r5 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Missing block: B:56:0x00b5, code skipped:
            r0.c = r5;
            r0.c.b = r0;
            r3.c = null;
     */
    /* JADX WARNING: Missing block: B:57:0x00bd, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:59:?, code skipped:
            r8.f.a(r4);
     */
    public final void run() {
        /*
        r8 = this;
    L_0x0000:
        r0 = r8.isInterrupted();
        r1 = 0;
        if (r0 != 0) goto L_0x00d8;
    L_0x0007:
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x00c8 }
        r0 = r8.g;	 Catch:{ InterruptedException -> 0x00c8 }
        r0 = r0.poll();	 Catch:{ InterruptedException -> 0x00c8 }
        r2 = r8.g;	 Catch:{ InterruptedException -> 0x00c8 }
        r3 = new java.lang.Object;	 Catch:{ InterruptedException -> 0x00c8 }
        r3.<init>();	 Catch:{ InterruptedException -> 0x00c8 }
        r2.offer(r3);	 Catch:{ InterruptedException -> 0x00c8 }
        r2 = r8.d;	 Catch:{ InterruptedException -> 0x00c8 }
        r3 = "";
        r4 = r8.a;	 Catch:{ InterruptedException -> 0x00c8 }
        r0 = r2.a(r0, r3, r4);	 Catch:{ InterruptedException -> 0x00c8 }
        r2 = 0;
        r3 = 0;
    L_0x0028:
        r4 = 1;
        if (r3 != 0) goto L_0x0076;
    L_0x002b:
        r5 = r1;
    L_0x002c:
        if (r5 == 0) goto L_0x0065;
    L_0x002e:
        if (r5 == 0) goto L_0x005d;
    L_0x0030:
        if (r5 == r0) goto L_0x004e;
    L_0x0032:
        r5 = (defpackage.uce) r5;	 Catch:{ InterruptedException -> 0x00c8 }
        r6 = r5.b;	 Catch:{ InterruptedException -> 0x00c8 }
        r7 = r8.c;	 Catch:{ InterruptedException -> 0x00c8 }
        if (r6 != r7) goto L_0x0043;
    L_0x003a:
        monitor-enter(r7);	 Catch:{ InterruptedException -> 0x00c8 }
        r5.a();	 Catch:{ all -> 0x0040 }
        monitor-exit(r7);	 Catch:{ all -> 0x0040 }
        goto L_0x0046;
    L_0x0040:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0040 }
        throw r0;	 Catch:{ InterruptedException -> 0x00c8 }
    L_0x0043:
        r5.a();	 Catch:{ InterruptedException -> 0x00c8 }
    L_0x0046:
        r5 = r5.a;	 Catch:{ InterruptedException -> 0x00c8 }
        r6 = r8.f;	 Catch:{ InterruptedException -> 0x00c8 }
        r6.a(r5);	 Catch:{ InterruptedException -> 0x00c8 }
        goto L_0x0056;
    L_0x004e:
        r3 = r3 ^ 1;
        r5 = "Only one dummy released at a time.";
        defpackage.uhy.b(r3, r5);	 Catch:{ InterruptedException -> 0x00c8 }
        r3 = 1;
    L_0x0056:
        r5 = r8.a;	 Catch:{ InterruptedException -> 0x00c8 }
        r5 = r5.poll();	 Catch:{ InterruptedException -> 0x00c8 }
        goto L_0x002e;
    L_0x005d:
        if (r3 != 0) goto L_0x0028;
    L_0x005f:
        r4 = r8.f;	 Catch:{ InterruptedException -> 0x00c8 }
        r4.a(r2);	 Catch:{ InterruptedException -> 0x00c8 }
        goto L_0x0028;
    L_0x0065:
        r6 = r8.a;	 Catch:{ InterruptedException -> 0x006c }
        r5 = r6.remove();	 Catch:{ InterruptedException -> 0x006c }
        goto L_0x002c;
    L_0x006c:
        r6 = move-exception;
        r7 = r8.b;	 Catch:{ InterruptedException -> 0x00c8 }
        if (r7 == 0) goto L_0x0075;
    L_0x0071:
        r8.a();	 Catch:{ InterruptedException -> 0x00c8 }
        goto L_0x002c;
    L_0x0075:
        throw r6;	 Catch:{ InterruptedException -> 0x00c8 }
    L_0x0076:
        r0 = r8.h;	 Catch:{ InterruptedException -> 0x00c8 }
        r0 = r0.poll();	 Catch:{ InterruptedException -> 0x00c8 }
        r0 = (defpackage.uce) r0;	 Catch:{ InterruptedException -> 0x00c8 }
        r3 = r0.c;	 Catch:{ InterruptedException -> 0x00c8 }
        if (r3 == 0) goto L_0x0083;
    L_0x0082:
        goto L_0x0084;
    L_0x0083:
        r4 = 0;
    L_0x0084:
        r3 = r8.e;	 Catch:{ InterruptedException -> 0x00c8 }
    L_0x0086:
        r3 = r3.c;	 Catch:{ InterruptedException -> 0x00c8 }
        if (r3 == 0) goto L_0x008d;
    L_0x008a:
        r2 = r2 + 1;
        goto L_0x0086;
    L_0x008d:
        r3 = r0.c;	 Catch:{ InterruptedException -> 0x00c8 }
        if (r3 == 0) goto L_0x00a7;
    L_0x0091:
        r3.a();	 Catch:{ InterruptedException -> 0x00c8 }
        r5 = r8.f;	 Catch:{ InterruptedException -> 0x00c8 }
        r6 = r3.a;	 Catch:{ InterruptedException -> 0x00c8 }
        r5.b(r6);	 Catch:{ InterruptedException -> 0x00c8 }
        r5 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r2 >= r5) goto L_0x008d;
    L_0x009f:
        r5 = r8.e;	 Catch:{ InterruptedException -> 0x00c8 }
        r3.a(r5);	 Catch:{ InterruptedException -> 0x00c8 }
        r2 = r2 + 1;
        goto L_0x008d;
    L_0x00a7:
        r2 = r8.h;	 Catch:{ InterruptedException -> 0x00c8 }
        r2.offer(r0);	 Catch:{ InterruptedException -> 0x00c8 }
        r2 = r8.c;	 Catch:{ InterruptedException -> 0x00c8 }
        monitor-enter(r2);	 Catch:{ InterruptedException -> 0x00c8 }
        r3 = r8.c;	 Catch:{ all -> 0x00c5 }
        r5 = r3.c;	 Catch:{ all -> 0x00c5 }
        if (r5 == 0) goto L_0x00bd;
    L_0x00b5:
        r0.c = r5;	 Catch:{ all -> 0x00c5 }
        r5 = r0.c;	 Catch:{ all -> 0x00c5 }
        r5.b = r0;	 Catch:{ all -> 0x00c5 }
        r3.c = r1;	 Catch:{ all -> 0x00c5 }
    L_0x00bd:
        monitor-exit(r2);	 Catch:{ all -> 0x00c5 }
        r0 = r8.f;	 Catch:{ InterruptedException -> 0x00c8 }
        r0.a(r4);	 Catch:{ InterruptedException -> 0x00c8 }
        goto L_0x0000;
    L_0x00c5:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00c5 }
        throw r0;	 Catch:{ InterruptedException -> 0x00c8 }
        r8.interrupt();
        r0 = r8.b;
        if (r0 == 0) goto L_0x0000;
    L_0x00d0:
        defpackage.uci.interrupted();
        r8.a();
        goto L_0x0000;
    L_0x00d8:
        r0 = r8.c;
        monitor-enter(r0);
        r2 = r8.c;	 Catch:{ all -> 0x00eb }
        r2.c = r1;	 Catch:{ all -> 0x00eb }
        monitor-exit(r0);	 Catch:{ all -> 0x00eb }
        r0 = r8.g;
        r0.clear();
        r0 = r8.h;
        r0.clear();
        return;
    L_0x00eb:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00eb }
        goto L_0x00ef;
    L_0x00ee:
        throw r1;
    L_0x00ef:
        goto L_0x00ee;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uci.run():void");
    }

    private final void a() {
        uhy.b(this.b != null);
        if (this.b.exists()) {
            tyv.b("LeakWatcherThread", "Abort dumping heap because heapdump file %s exists", this.b.getName());
            this.b = null;
            return;
        }
        uce uce = new uce("Sentinel", "Sentinel", this.a);
        synchronized (this.c) {
            uce.a(this.c);
            this.c.c = null;
            uce.b = null;
        }
        File file;
        try {
            List emptyList;
            System.nanoTime();
            Debug.dumpHprofData(this.b.getAbsolutePath());
            System.nanoTime();
            uav uav = new uav(this.b, this.i);
            String name = uce.class.getName();
            ubl a = ubl.a(uav.c);
            ubn a2 = ube.a(a, uav.b, !uav.d ? uav.a : Collections.emptyList(), Collections.singleton(name));
            List<ubb> list = (List) a2.d.get(name);
            if (list == null) {
                emptyList = Collections.emptyList();
            } else {
                ArrayList<ubb> arrayList = new ArrayList();
                for (ubb ubb : list) {
                    int a3;
                    Object obj = "referent";
                    uhy.a(obj);
                    int a4 = ubb.a(a);
                    for (int i = 0; i < a4; i++) {
                        if (obj.equals(ubb.b(a, i))) {
                            a3 = ubb.a(a, i);
                            break;
                        }
                    }
                    a3 = 0;
                    ubb ubb2 = (ubb) a2.b.b(a3);
                    if (ubb2 != null) {
                        obj = "";
                        if (ubb2 instanceof uba) {
                            obj = ((uba) ubb2).a.c(a);
                        } else if (ubb2 instanceof uay) {
                            obj = ((uay) ubb2).a.c(a);
                        }
                        if (!uav.a.contains(obj)) {
                            arrayList.add(ubb2);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    emptyList = Collections.emptyList();
                } else {
                    if (uav.d) {
                        new bpj(uaz.a(a, a2)).a(new ubp(a2.c));
                    }
                    ubi.a(a, a2);
                    ArrayList arrayList2 = new ArrayList();
                    for (ubb ubb3 : arrayList) {
                        if (ubb3.l != null && (ubb3 instanceof uba)) {
                            int i2;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(ubb3.c(a, -1));
                            for (ubb ubb4 = ubb3; ubb4.l != null; ubb4 = ubb4.l) {
                                stringBuilder.append(10);
                                ubb ubb5 = ubb4.l;
                                int e = ubb4.e(a);
                                int a5 = ubb5.a(a);
                                int i3 = 0;
                                while (i3 < a5) {
                                    if (e == ubb5.a(a, i3)) {
                                        break;
                                    }
                                    i3++;
                                }
                                i3 = -1;
                                stringBuilder.append(ubb4.l.c(a, i3));
                            }
                            String stringBuilder2 = stringBuilder.toString();
                            if (uav.d) {
                                ubb.a(ubb3, a);
                                i2 = ubb3.r;
                            } else {
                                i2 = 0;
                            }
                            arrayList2.add(new ucd(stringBuilder2, i2));
                        }
                    }
                    emptyList = arrayList2;
                }
            }
            if (!emptyList.isEmpty()) {
                this.f.a(emptyList);
            }
            for (uce a6 : this.h) {
                a6.a();
            }
            this.e.a();
            file = this.b;
            this.b = null;
            file.delete();
        } catch (Throwable th) {
            File file2 = this.b;
            this.b = null;
            file2.delete();
        }
    }

    /* synthetic */ uci(ReferenceQueue referenceQueue, uch uch, ucg ucg, boolean z) {
        setName("Primes-Watcher");
        this.a = referenceQueue;
        this.f = ucg;
        this.d = uch;
        this.i = z;
        String str = "Sentinel";
        this.c = new uce(str, str, referenceQueue);
        this.e = new uce(str, str, referenceQueue);
        for (int i = 0; i < 20; i++) {
            this.g.add(new Object());
        }
        for (int i2 = 0; i2 < 3; i2++) {
            this.h.add(new uce(str, str, referenceQueue));
        }
    }
}
