package defpackage;

import android.os.RemoteException;
import java.util.Map;

@qlp
/* renamed from: qjf */
public final class qjf extends qjh {
    public Map a;

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x007a */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|(2:14|(2:16|(4:18|(1:20)|26|27)(2:21|31))(2:22|32))(2:23|28)) */
    /* JADX WARNING: Missing block: B:13:0x0080, code skipped:
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(r5) == false) goto L_0x0082;
     */
    /* JADX WARNING: Missing block: B:15:0x0088, code skipped:
            if ("com.google.ads.mediation.AdUrlAdapter".equals(r5) == false) goto L_0x008a;
     */
    /* JADX WARNING: Missing block: B:17:0x0090, code skipped:
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(r5) == false) goto L_0x0092;
     */
    /* JADX WARNING: Missing block: B:19:0x0098, code skipped:
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(r5) != false) goto L_0x009a;
     */
    /* JADX WARNING: Missing block: B:20:0x009a, code skipped:
            r1 = new com.google.ads.mediation.customevent.CustomEventAdapter();
            r3 = new defpackage.qkc(r1, (defpackage.pdy) r4.a.get(r1.getAdditionalParametersType()));
     */
    /* JADX WARNING: Missing block: B:24:0x00d2, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x00d3, code skipped:
            r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 43);
            r3.append(r0);
            r3.append(r5);
            r3.append(". ");
            defpackage.qml.b(r3.toString(), r1);
     */
    /* JADX WARNING: Missing block: B:27:0x00fa, code skipped:
            throw new android.os.RemoteException();
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            return new defpackage.qjv(new com.google.ads.mediation.admob.AdMobAdapter());
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            return new defpackage.qjv(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            return new defpackage.qjv(new com.google.ads.mediation.AdUrlAdapter());
     */
    public final defpackage.qjk a(java.lang.String r5) {
        /*
        r4 = this;
        r0 = "Could not instantiate mediation adapter: ";
        r1 = defpackage.qjf.class;
        r1 = r1.getClassLoader();	 Catch:{ all -> 0x007a }
        r2 = 0;
        r1 = java.lang.Class.forName(r5, r2, r1);	 Catch:{ all -> 0x007a }
        r3 = defpackage.dha.class;
        r3 = r3.isAssignableFrom(r1);	 Catch:{ all -> 0x007a }
        if (r3 != 0) goto L_0x0059;
    L_0x0015:
        r3 = defpackage.pdi.class;
        r3 = r3.isAssignableFrom(r1);	 Catch:{ all -> 0x007a }
        if (r3 == 0) goto L_0x0032;
    L_0x001d:
        r3 = new java.lang.Class[r2];	 Catch:{ all -> 0x007a }
        r1 = r1.getDeclaredConstructor(r3);	 Catch:{ all -> 0x007a }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x007a }
        r1 = r1.newInstance(r2);	 Catch:{ all -> 0x007a }
        r1 = (defpackage.pdi) r1;	 Catch:{ all -> 0x007a }
        r2 = new qjv;	 Catch:{ all -> 0x007a }
        r2.<init>(r1);	 Catch:{ all -> 0x007a }
        goto L_0x00d1;
    L_0x0032:
        r1 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x007a }
        r1 = r1.length();	 Catch:{ all -> 0x007a }
        r1 = r1 + 64;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x007a }
        r2.<init>(r1);	 Catch:{ all -> 0x007a }
        r2.append(r0);	 Catch:{ all -> 0x007a }
        r2.append(r5);	 Catch:{ all -> 0x007a }
        r1 = " (not a valid adapter).";
        r2.append(r1);	 Catch:{ all -> 0x007a }
        r1 = r2.toString();	 Catch:{ all -> 0x007a }
        defpackage.qml.b(r1);	 Catch:{ all -> 0x007a }
        r1 = new android.os.RemoteException;	 Catch:{ all -> 0x007a }
        r1.<init>();	 Catch:{ all -> 0x007a }
        throw r1;	 Catch:{ all -> 0x007a }
    L_0x0059:
        r3 = new java.lang.Class[r2];	 Catch:{ all -> 0x007a }
        r1 = r1.getDeclaredConstructor(r3);	 Catch:{ all -> 0x007a }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x007a }
        r1 = r1.newInstance(r2);	 Catch:{ all -> 0x007a }
        r1 = (defpackage.dha) r1;	 Catch:{ all -> 0x007a }
        r2 = r4.a;	 Catch:{ all -> 0x007a }
        r3 = r1.getAdditionalParametersType();	 Catch:{ all -> 0x007a }
        r2 = r2.get(r3);	 Catch:{ all -> 0x007a }
        r2 = (defpackage.dhg) r2;	 Catch:{ all -> 0x007a }
        r3 = new qkc;	 Catch:{ all -> 0x007a }
        r3.<init>(r1, r2);	 Catch:{ all -> 0x007a }
    L_0x0078:
        r2 = r3;
        goto L_0x00d1;
    L_0x007a:
        r1 = "com.google.ads.mediation.admob.AdMobAdapter";
        r1 = r1.equals(r5);	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x00c7;
    L_0x0082:
        r1 = "com.google.ads.mediation.AdUrlAdapter";
        r1 = r1.equals(r5);	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x00bc;
    L_0x008a:
        r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r5);	 Catch:{ all -> 0x00d2 }
        if (r1 != 0) goto L_0x00b1;
    L_0x0092:
        r1 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r5);	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x00f4;
    L_0x009a:
        r1 = new com.google.ads.mediation.customevent.CustomEventAdapter;	 Catch:{ all -> 0x00d2 }
        r1.<init>();	 Catch:{ all -> 0x00d2 }
        r2 = r4.a;	 Catch:{ all -> 0x00d2 }
        r3 = r1.getAdditionalParametersType();	 Catch:{ all -> 0x00d2 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x00d2 }
        r2 = (defpackage.pdy) r2;	 Catch:{ all -> 0x00d2 }
        r3 = new qkc;	 Catch:{ all -> 0x00d2 }
        r3.<init>(r1, r2);	 Catch:{ all -> 0x00d2 }
        goto L_0x0078;
    L_0x00b1:
        r2 = new qjv;	 Catch:{ all -> 0x00d2 }
        r1 = new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;	 Catch:{ all -> 0x00d2 }
        r1.<init>();	 Catch:{ all -> 0x00d2 }
        r2.<init>(r1);	 Catch:{ all -> 0x00d2 }
        goto L_0x00d1;
    L_0x00bc:
        r2 = new qjv;	 Catch:{ all -> 0x00d2 }
        r1 = new com.google.ads.mediation.AdUrlAdapter;	 Catch:{ all -> 0x00d2 }
        r1.<init>();	 Catch:{ all -> 0x00d2 }
        r2.<init>(r1);	 Catch:{ all -> 0x00d2 }
        goto L_0x00d1;
    L_0x00c7:
        r2 = new qjv;	 Catch:{ all -> 0x00d2 }
        r1 = new com.google.ads.mediation.admob.AdMobAdapter;	 Catch:{ all -> 0x00d2 }
        r1.<init>();	 Catch:{ all -> 0x00d2 }
        r2.<init>(r1);	 Catch:{ all -> 0x00d2 }
    L_0x00d1:
        return r2;
    L_0x00d2:
        r1 = move-exception;
        r2 = java.lang.String.valueOf(r5);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 43;
        r3.<init>(r2);
        r3.append(r0);
        r3.append(r5);
        r5 = ". ";
        r3.append(r5);
        r5 = r3.toString();
        defpackage.qml.b(r5, r1);
    L_0x00f4:
        r5 = new android.os.RemoteException;
        r5.<init>();
        goto L_0x00fb;
    L_0x00fa:
        throw r5;
    L_0x00fb:
        goto L_0x00fa;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjf.a(java.lang.String):qjk");
    }

    public final boolean b(String str) {
        Object str2;
        try {
            str2 = pds.class.isAssignableFrom(Class.forName(str2, false, qjf.class.getClassLoader()));
            return str2;
        } catch (Throwable unused) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 80);
            stringBuilder.append("Could not load custom event implementation class: ");
            stringBuilder.append(str2);
            stringBuilder.append(", assuming old implementation.");
            qml.b(stringBuilder.toString());
            return false;
        }
    }

    public final qkp c(String str) {
        try {
            return new qkw((qmw) Class.forName(str, false, qkt.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            RemoteException remoteException = new RemoteException();
        }
    }

    static {
        qkt qkt = new qkt();
    }
}
