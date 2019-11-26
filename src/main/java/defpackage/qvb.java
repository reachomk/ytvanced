package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: qvb */
public final class qvb {
    private static final Logger a = Logger.getLogger(qvb.class.getName());
    private static final ConcurrentMap b = new ConcurrentHashMap();
    private static final ConcurrentMap c = new ConcurrentHashMap();
    private static final ConcurrentMap d = new ConcurrentHashMap();

    public static synchronized void a(String str, qup qup) {
        synchronized (qvb.class) {
            if (d.containsKey(str.toLowerCase())) {
                if (!qup.getClass().equals(((qup) d.get(str.toLowerCase())).getClass())) {
                    String str2;
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String str3 = "Attempted overwrite of a catalogueName catalogue for name ";
                    if (str.length() == 0) {
                        str2 = new String(str3);
                    } else {
                        str2 = str3.concat(str);
                    }
                    logger.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", str2);
                    StringBuilder stringBuilder = new StringBuilder(str.length() + 47);
                    stringBuilder.append("catalogue for name ");
                    stringBuilder.append(str);
                    stringBuilder.append(" has been already registered");
                    throw new GeneralSecurityException(stringBuilder.toString());
                }
            }
            d.put(str.toLowerCase(), qup);
        }
    }

    public static qup a(String str) {
        if (str != null) {
            qup qup = (qup) d.get(str.toLowerCase());
            if (qup != null) {
                return qup;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.init().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.init().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.init().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.init().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.init().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.init().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.init().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static synchronized void a(String str, quw quw) {
        synchronized (qvb.class) {
            qvb.a(str, quw, true);
        }
    }

    /* JADX WARNING: Missing block: B:11:0x002f, code skipped:
            if (r8 != false) goto L_0x0031;
     */
    public static synchronized void a(java.lang.String r6, defpackage.quw r7, boolean r8) {
        /*
        r0 = defpackage.qvb.class;
        monitor-enter(r0);
        if (r7 == 0) goto L_0x008a;
    L_0x0005:
        r1 = b;	 Catch:{ all -> 0x0092 }
        r1 = r1.containsKey(r6);	 Catch:{ all -> 0x0092 }
        if (r1 == 0) goto L_0x007a;
    L_0x000d:
        r1 = defpackage.qvb.b(r6);	 Catch:{ all -> 0x0092 }
        r2 = c;	 Catch:{ all -> 0x0092 }
        r2 = r2.get(r6);	 Catch:{ all -> 0x0092 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x0092 }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x0092 }
        r3 = r7.getClass();	 Catch:{ all -> 0x0092 }
        r4 = r1.getClass();	 Catch:{ all -> 0x0092 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x0092 }
        if (r3 != 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0031;
    L_0x002c:
        if (r2 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x007a;
    L_0x002f:
        if (r8 == 0) goto L_0x007a;
    L_0x0031:
        r8 = a;	 Catch:{ all -> 0x0092 }
        r2 = java.util.logging.Level.WARNING;	 Catch:{ all -> 0x0092 }
        r3 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0092 }
        r4 = "Attempted overwrite of a registered key manager for key type ";
        r5 = r3.length();	 Catch:{ all -> 0x0092 }
        if (r5 != 0) goto L_0x0047;
    L_0x0041:
        r3 = new java.lang.String;	 Catch:{ all -> 0x0092 }
        r3.<init>(r4);	 Catch:{ all -> 0x0092 }
        goto L_0x004b;
    L_0x0047:
        r3 = r4.concat(r3);	 Catch:{ all -> 0x0092 }
    L_0x004b:
        r4 = "com.google.crypto.tink.Registry";
        r5 = "registerKeyManager";
        r8.logp(r2, r4, r5, r3);	 Catch:{ all -> 0x0092 }
        r8 = new java.security.GeneralSecurityException;	 Catch:{ all -> 0x0092 }
        r2 = 3;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0092 }
        r3 = 0;
        r2[r3] = r6;	 Catch:{ all -> 0x0092 }
        r6 = 1;
        r1 = r1.getClass();	 Catch:{ all -> 0x0092 }
        r1 = r1.getName();	 Catch:{ all -> 0x0092 }
        r2[r6] = r1;	 Catch:{ all -> 0x0092 }
        r6 = 2;
        r7 = r7.getClass();	 Catch:{ all -> 0x0092 }
        r7 = r7.getName();	 Catch:{ all -> 0x0092 }
        r2[r6] = r7;	 Catch:{ all -> 0x0092 }
        r6 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s";
        r6 = java.lang.String.format(r6, r2);	 Catch:{ all -> 0x0092 }
        r8.<init>(r6);	 Catch:{ all -> 0x0092 }
        throw r8;	 Catch:{ all -> 0x0092 }
    L_0x007a:
        r1 = b;	 Catch:{ all -> 0x0092 }
        r1.put(r6, r7);	 Catch:{ all -> 0x0092 }
        r7 = c;	 Catch:{ all -> 0x0092 }
        r8 = java.lang.Boolean.valueOf(r8);	 Catch:{ all -> 0x0092 }
        r7.put(r6, r8);	 Catch:{ all -> 0x0092 }
        monitor-exit(r0);
        return;
    L_0x008a:
        r6 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0092 }
        r7 = "key manager must be non-null.";
        r6.<init>(r7);	 Catch:{ all -> 0x0092 }
        throw r6;	 Catch:{ all -> 0x0092 }
    L_0x0092:
        r6 = move-exception;
        monitor-exit(r0);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvb.a(java.lang.String, quw, boolean):void");
    }

    private static quw b(String str) {
        quw quw = (quw) b.get(str);
        if (quw != null) {
            return quw;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 78);
        stringBuilder.append("No key manager found for key type: ");
        stringBuilder.append(str);
        stringBuilder.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(stringBuilder.toString());
    }

    public static synchronized qyu a(qyz qyz) {
        qyu c;
        synchronized (qvb.class) {
            quw b = qvb.b(qyz.zzryv);
            if (((Boolean) c.get(qyz.zzryv)).booleanValue()) {
                c = b.c(qyz.zzryw);
            } else {
                String valueOf = String.valueOf(qyz.zzryv);
                String str = "newKey-operation not permitted for key type ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new GeneralSecurityException(valueOf);
            }
        }
        return c;
    }

    public static synchronized rgh b(qyz qyz) {
        rgh b;
        synchronized (qvb.class) {
            quw b2 = qvb.b(qyz.zzryv);
            if (((Boolean) c.get(qyz.zzryv)).booleanValue()) {
                b = b2.b(qyz.zzryw);
            } else {
                String valueOf = String.valueOf(qyz.zzryv);
                String str = "newKey-operation not permitted for key type ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new GeneralSecurityException(valueOf);
            }
        }
        return b;
    }

    public static synchronized rgh a(String str, rgh rgh) {
        rgh b;
        synchronized (qvb.class) {
            quw b2 = qvb.b(str);
            if (((Boolean) c.get(str)).booleanValue()) {
                b = b2.b(rgh);
            } else {
                str = String.valueOf(str);
                String str2 = "newKey-operation not permitted for key type ";
                throw new GeneralSecurityException(str.length() == 0 ? new String(str2) : str2.concat(str));
            }
        }
        return b;
    }

    public static Object b(String str, rgh rgh) {
        return qvb.b(str).a(rgh);
    }

    private static Object a(String str, rdg rdg) {
        return qvb.b(str).a(rdg);
    }

    public static Object a(String str, byte[] bArr) {
        return qvb.a(str, rdg.a(bArr));
    }

    public static quz a(quv quv) {
        qve.b(quv.a);
        quz quz = new quz();
        for (qzh qzh : quv.a.zzrzu) {
            if (qzh.b() == qyx.ENABLED) {
                byte[] array;
                Object a = qvb.a(qzh.a().zzryv, qzh.a().zzryw);
                int i = quu.a[qzh.aW_().ordinal()];
                if (i == 1 || i == 2) {
                    array = ByteBuffer.allocate(5).put((byte) 0).putInt(qzh.zzrzy).array();
                } else if (i == 3) {
                    array = ByteBuffer.allocate(5).put((byte) 1).putInt(qzh.zzrzy).array();
                } else if (i == 4) {
                    array = qur.a;
                } else {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
                qzh.b();
                qzh.aW_();
                qvc qvc = new qvc(a, array);
                ArrayList arrayList = new ArrayList();
                arrayList.add(qvc);
                String str = new String(qvc.a(), quz.a);
                List list = (List) quz.b.put(str, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(qvc);
                    quz.b.put(str, Collections.unmodifiableList(arrayList2));
                }
                if (qzh.zzrzy == quv.a.zzrzt) {
                    quz.c = qvc;
                }
            }
        }
        return quz;
    }
}
