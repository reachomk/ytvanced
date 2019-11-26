package defpackage;

/* renamed from: anym */
public class anym {
    public anvu a;
    public volatile anze b;
    public volatile anvu c;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anym)) {
            return false;
        }
        anym anym = (anym) obj;
        anze anze = this.b;
        anze anze2 = anym.b;
        if (anze == null && anze2 == null) {
            return b().equals(anym.b());
        }
        if (anze != null && anze2 != null) {
            return anze.equals(anze2);
        }
        if (anze != null) {
            return anze.equals(anym.a(anze.getDefaultInstanceForType()));
        }
        return a(anze2.getDefaultInstanceForType()).equals(anze2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    private final defpackage.anze a(defpackage.anze r2) {
        /*
        r1 = this;
        r0 = r1.b;
        if (r0 != 0) goto L_0x001d;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.b;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x001d;
    L_0x000b:
        r1.b = r2;	 Catch:{ anyg -> 0x0012 }
        r0 = defpackage.anvu.a;	 Catch:{ anyg -> 0x0012 }
        r1.c = r0;	 Catch:{ anyg -> 0x0012 }
        goto L_0x0018;
    L_0x0012:
        r1.b = r2;	 Catch:{ all -> 0x001a }
        r2 = defpackage.anvu.a;	 Catch:{ all -> 0x001a }
        r1.c = r2;	 Catch:{ all -> 0x001a }
    L_0x0018:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x001d;
    L_0x001a:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r2;
    L_0x001d:
        r2 = r1.b;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anym.a(anze):anze");
    }

    public final anvu b() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            anvu anvu;
            if (this.c != null) {
                anvu = this.c;
                return anvu;
            }
            if (this.b == null) {
                this.c = anvu.a;
            } else {
                this.c = this.b.toByteString();
            }
            anvu = this.c;
            return anvu;
        }
    }

    static {
        anxa.b();
    }
}
