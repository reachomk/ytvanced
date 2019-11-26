package defpackage;

/* renamed from: bxq */
public final class bxq {
    private final chr a = new chr(1000);
    private final zy b = chx.a(10, new bxp());

    public final String a(bsm bsm) {
        Object obj;
        synchronized (this.a) {
            obj = (String) this.a.b(bsm);
        }
        if (obj == null) {
            bxs bxs = (bxs) chw.a((bxs) this.b.a());
            try {
                bsm.a(bxs.a);
                byte[] digest = bxs.a.digest();
                synchronized (chv.b) {
                    char[] cArr = chv.b;
                    for (int i = 0; i < digest.length; i++) {
                        int i2 = digest[i] & 255;
                        int i3 = i + i;
                        cArr[i3] = chv.a[i2 >>> 4];
                        cArr[i3 + 1] = chv.a[i2 & 15];
                    }
                    obj = new String(cArr);
                }
                this.b.a(bxs);
            } catch (Throwable th) {
                this.b.a(bxs);
            }
        }
        synchronized (this.a) {
            this.a.b(bsm, obj);
        }
        return obj;
    }
}
