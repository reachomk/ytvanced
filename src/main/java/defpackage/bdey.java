package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdey */
public final class bdey {
    public static final bdey a = new bdey();
    private static final bdee g = new bdfb();
    private final AtomicReference b = new AtomicReference();
    private final AtomicReference c = new AtomicReference();
    private final AtomicReference d = new AtomicReference();
    private final AtomicReference e = new AtomicReference();
    private final AtomicReference f = new AtomicReference();

    bdey() {
    }

    public final bdee a() {
        if (this.b.get() == null) {
            Object a = bdey.a(bdee.class, System.getProperties());
            if (a == null) {
                this.b.compareAndSet(null, g);
            } else {
                this.b.compareAndSet(null, (bdee) a);
            }
        }
        return (bdee) this.b.get();
    }

    public final bdew b() {
        if (this.c.get() == null) {
            Object a = bdey.a(bdew.class, System.getProperties());
            if (a == null) {
                this.c.compareAndSet(null, bdez.a);
            } else {
                this.c.compareAndSet(null, (bdew) a);
            }
        }
        return (bdew) this.c.get();
    }

    public final bdfc c() {
        if (this.d.get() == null) {
            Object a = bdey.a(bdfc.class, System.getProperties());
            if (a == null) {
                this.d.compareAndSet(null, bdff.a);
            } else {
                this.d.compareAndSet(null, (bdfc) a);
            }
        }
        return (bdfc) this.d.get();
    }

    public final bdef d() {
        if (this.e.get() == null) {
            Object a = bdey.a(bdef.class, System.getProperties());
            if (a == null) {
                this.e.compareAndSet(null, new bdfa());
            } else {
                this.e.compareAndSet(null, (bdef) a);
            }
        }
        return (bdef) this.e.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ac A:{SYNTHETIC, Splitter:B:17:0x00ac} */
    private static java.lang.Object a(java.lang.Class r7, java.util.Properties r8) {
        /*
        r8 = r8.clone();
        r8 = (java.util.Properties) r8;
        r0 = r7.getSimpleName();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "rxjava.plugin.";
        r1.append(r2);
        r1.append(r0);
        r3 = ".implementation";
        r1.append(r3);
        r1 = r1.toString();
        r1 = r8.getProperty(r1);
        if (r1 != 0) goto L_0x00a9;
    L_0x0026:
        r3 = r8.entrySet();
        r3 = r3.iterator();
    L_0x002e:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x00a9;
    L_0x0034:
        r4 = r3.next();
        r4 = (java.util.Map.Entry) r4;
        r5 = r4.getKey();
        r5 = r5.toString();
        r6 = r5.startsWith(r2);
        if (r6 == 0) goto L_0x002e;
    L_0x0048:
        r6 = ".class";
        r6 = r5.endsWith(r6);
        if (r6 == 0) goto L_0x002e;
    L_0x0050:
        r4 = r4.getValue();
        r4 = r4.toString();
        r4 = r0.equals(r4);
        if (r4 == 0) goto L_0x002e;
    L_0x005e:
        r1 = r5.length();
        r3 = 0;
        r1 = r1 + -6;
        r1 = r5.substring(r3, r1);
        r3 = 14;
        r1 = r1.substring(r3);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3.append(r1);
        r1 = ".impl";
        r3.append(r1);
        r1 = r3.toString();
        r8 = r8.getProperty(r1);
        if (r8 == 0) goto L_0x008a;
    L_0x0089:
        goto L_0x00aa;
    L_0x008a:
        r7 = new java.lang.IllegalStateException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r2 = "Implementing class declaration for ";
        r8.append(r2);
        r8.append(r0);
        r0 = " missing: ";
        r8.append(r0);
        r8.append(r1);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x00a9:
        r8 = r1;
    L_0x00aa:
        if (r8 == 0) goto L_0x012d;
    L_0x00ac:
        r1 = java.lang.Class.forName(r8);	 Catch:{ ClassCastException -> 0x010a, ClassNotFoundException -> 0x00ef, InstantiationException -> 0x00d4, IllegalAccessException -> 0x00b9 }
        r7 = r1.asSubclass(r7);	 Catch:{ ClassCastException -> 0x010a, ClassNotFoundException -> 0x00ef, InstantiationException -> 0x00d4, IllegalAccessException -> 0x00b9 }
        r7 = r7.newInstance();	 Catch:{ ClassCastException -> 0x010a, ClassNotFoundException -> 0x00ef, InstantiationException -> 0x00d4, IllegalAccessException -> 0x00b9 }
        return r7;
    L_0x00b9:
        r7 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r0);
        r0 = " implementation not able to be accessed: ";
        r2.append(r0);
        r2.append(r8);
        r8 = r2.toString();
        r1.<init>(r8, r7);
        throw r1;
    L_0x00d4:
        r7 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r0);
        r0 = " implementation not able to be instantiated: ";
        r2.append(r0);
        r2.append(r8);
        r8 = r2.toString();
        r1.<init>(r8, r7);
        throw r1;
    L_0x00ef:
        r7 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r0);
        r0 = " implementation class not found: ";
        r2.append(r0);
        r2.append(r8);
        r8 = r2.toString();
        r1.<init>(r8, r7);
        throw r1;
    L_0x010a:
        r7 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r0);
        r3 = " implementation is not an instance of ";
        r2.append(r3);
        r2.append(r0);
        r0 = ": ";
        r2.append(r0);
        r2.append(r8);
        r8 = r2.toString();
        r1.<init>(r8, r7);
        throw r1;
    L_0x012d:
        r7 = 0;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdey.a(java.lang.Class, java.util.Properties):java.lang.Object");
    }

    public final bdfd e() {
        if (this.f.get() == null) {
            Object a = bdey.a(bdfd.class, System.getProperties());
            if (a == null) {
                this.f.compareAndSet(null, bdfd.a);
            } else {
                this.f.compareAndSet(null, (bdfd) a);
            }
        }
        return (bdfd) this.f.get();
    }
}
