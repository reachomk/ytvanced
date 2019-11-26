package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: qve */
final class qve {
    public static qzm a(qzf qzf) {
        qzl qzl = (qzl) ((ret) qzm.zzsab.a(5));
        int i = qzf.zzrzt;
        qzl.b();
        ((qzm) qzl.a).zzrzt = i;
        for (qzh qzh : qzf.zzrzu) {
            qzn qzn = (qzn) ((ret) qzo.zzsac.a(5));
            String str = qzh.a().zzryv;
            qzn.b();
            qzo qzo = (qzo) qzn.a;
            if (str != null) {
                qzo.zzryv = str;
                qyx b = qzh.b();
                qzn.b();
                qzo = (qzo) qzn.a;
                if (b != null) {
                    qzo.zzrzx = b.a();
                    rab aW_ = qzh.aW_();
                    qzn.b();
                    qzo = (qzo) qzn.a;
                    if (aW_ != null) {
                        qzo.zzrzm = aW_.a();
                        i = qzh.zzrzy;
                        qzn.b();
                        ((qzo) qzn.a).zzrzy = i;
                        qzo qzo2 = (qzo) qzn.f();
                        qzl.b();
                        qzm qzm = (qzm) qzl.a;
                        if (qzo2 != null) {
                            if (!qzm.zzsaa.a()) {
                                rfi rfi = qzm.zzsaa;
                                int size = rfi.size();
                                qzm.zzsaa = rfi.a(size != 0 ? size + size : 10);
                            }
                            qzm.zzsaa.add(qzo2);
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        return (qzm) qzl.f();
    }

    public static void b(qzf qzf) {
        if (qzf.a() != 0) {
            int i = qzf.zzrzt;
            Object obj = null;
            Object obj2 = 1;
            for (qzh qzh : qzf.zzrzu) {
                if (qzh.zzrzw == null) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(qzh.zzrzy)}));
                } else if (qzh.aW_() == rab.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(qzh.zzrzy)}));
                } else if (qzh.b() != qyx.UNKNOWN_STATUS) {
                    if (qzh.b() == qyx.ENABLED && qzh.zzrzy == i) {
                        if (obj == null) {
                            obj = 1;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (qzh.a().a() != qyw.ASYMMETRIC_PUBLIC) {
                        obj2 = null;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(qzh.zzrzy)}));
                }
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    static {
        Charset.forName("UTF-8");
    }
}
