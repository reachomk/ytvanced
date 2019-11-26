package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import java.util.List;

@qlp
/* renamed from: qkc */
public final class qkc extends qjj {
    private final dha a;
    private final dhg b;

    public qkc(dha dha, dhg dhg) {
        this.a = dha;
        this.b = dhg;
    }

    public final void a(qcs qcs) {
    }

    public final void a(qcs qcs, qmc qmc, List list) {
    }

    public final void a(qcs qcs, rky rky, String str, String str2, qjm qjm, roh roh, List list) {
    }

    public final void a(qcs qcs, rky rky, String str, qmc qmc, String str2) {
    }

    public final void a(rky rky, String str) {
    }

    public final void a(rky rky, String str, String str2) {
    }

    public final void a(boolean z) {
    }

    public final void f() {
    }

    public final boolean g() {
        return true;
    }

    public final qjn h() {
        return null;
    }

    public final qjp i() {
        return null;
    }

    public final boolean m() {
        return false;
    }

    public final rpb n() {
        return null;
    }

    public final rmt o() {
        return null;
    }

    public final qjr p() {
        return null;
    }

    public final qcs a() {
        dha dha = this.a;
        if (dha instanceof MediationBannerAdapter) {
            try {
                return qct.a(((MediationBannerAdapter) dha).getBannerView());
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(dha.getClass().getCanonicalName());
            String str = "Not a MediationBannerAdapter: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            qml.b(valueOf);
            throw new RemoteException();
        }
    }

    public final void a(qcs qcs, rkz rkz, rky rky, String str, qjm qjm) {
        a(qcs, rkz, rky, str, null, qjm);
    }

    public final void a(qcs qcs, rkz rkz, rky rky, String str, String str2, qjm qjm) {
        dha dha = this.a;
        if (dha instanceof MediationBannerAdapter) {
            try {
                dfl dfl;
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) dha;
                qkb qkb = new qkb(qjm);
                Activity activity = (Activity) qct.a(qcs);
                int i = rky.e;
                dhc a = a(str);
                r11 = new dfl[6];
                int i2 = 0;
                r11[0] = dfl.b;
                r11[1] = dfl.c;
                r11[2] = dfl.d;
                r11[3] = dfl.e;
                r11[4] = dfl.f;
                r11[5] = dfl.g;
                while (i2 < 6) {
                    dfl dfl2 = r11[i2];
                    pbi pbi = dfl2.a;
                    if (pbi.b == rkz.c) {
                        if (pbi.c == rkz.b) {
                            dfl = dfl2;
                            break;
                        }
                    }
                    i2++;
                }
                dfl = new dfl(peg.a(rkz.c, rkz.b, rkz.a));
                qkc.a(rky);
                mediationBannerAdapter.requestBannerAd(qkb, activity, a, dfl, qkg.a(rky), this.b);
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(dha.getClass().getCanonicalName());
            String str3 = "Not a MediationBannerAdapter: ";
            qml.b(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
            throw new RemoteException();
        }
    }

    public final Bundle j() {
        return new Bundle();
    }

    public final void a(qcs qcs, rky rky, String str, qjm qjm) {
        a(qcs, rky, str, null, qjm);
    }

    public final void a(qcs qcs, rky rky, String str, String str2, qjm qjm) {
        dha dha = this.a;
        if (dha instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) dha;
                qkb qkb = new qkb(qjm);
                Activity activity = (Activity) qct.a(qcs);
                int i = rky.e;
                dhc a = a(str);
                qkc.a(rky);
                mediationInterstitialAdapter.requestInterstitialAd(qkb, activity, a, qkg.a(rky), this.b);
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(dha.getClass().getCanonicalName());
            String str3 = "Not a MediationInterstitialAdapter: ";
            qml.b(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
            throw new RemoteException();
        }
    }

    public final Bundle k() {
        return new Bundle();
    }

    public final void b() {
        dha dha = this.a;
        if (dha instanceof MediationInterstitialAdapter) {
            try {
                ((MediationInterstitialAdapter) dha).showInterstitial();
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(dha.getClass().getCanonicalName());
            String str = "Not a MediationInterstitialAdapter: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            qml.b(valueOf);
            throw new RemoteException();
        }
    }

    public final Bundle l() {
        return new Bundle();
    }

    public final void c() {
        try {
            this.a.destroy();
        } catch (Throwable th) {
            qml.a("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void d() {
        throw new RemoteException();
    }

    public final void e() {
        throw new RemoteException();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0098 */
    private final defpackage.dhc a(java.lang.String r9) {
        /*
        r8 = this;
        r0 = "Server option \"";
        r1 = 0;
        if (r9 == 0) goto L_0x002b;
    L_0x0005:
        r2 = new org.json.JSONObject;	 Catch:{ all -> 0x0193 }
        r2.<init>(r9);	 Catch:{ all -> 0x0193 }
        r9 = new java.util.HashMap;	 Catch:{ all -> 0x0193 }
        r3 = r2.length();	 Catch:{ all -> 0x0193 }
        r9.<init>(r3);	 Catch:{ all -> 0x0193 }
        r3 = r2.keys();	 Catch:{ all -> 0x0193 }
    L_0x0017:
        r4 = r3.hasNext();	 Catch:{ all -> 0x0193 }
        if (r4 == 0) goto L_0x0030;
    L_0x001d:
        r4 = r3.next();	 Catch:{ all -> 0x0193 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0193 }
        r5 = r2.getString(r4);	 Catch:{ all -> 0x0193 }
        r9.put(r4, r5);	 Catch:{ all -> 0x0193 }
        goto L_0x0017;
    L_0x002b:
        r9 = new java.util.HashMap;	 Catch:{ all -> 0x0193 }
        r9.<init>(r1);	 Catch:{ all -> 0x0193 }
    L_0x0030:
        r2 = r8.a;	 Catch:{ all -> 0x0193 }
        r2 = r2.getServerParametersType();	 Catch:{ all -> 0x0193 }
        if (r2 == 0) goto L_0x0191;
    L_0x0038:
        r2 = r2.newInstance();	 Catch:{ all -> 0x0193 }
        r2 = (defpackage.dhc) r2;	 Catch:{ all -> 0x0193 }
        r3 = new java.util.HashMap;	 Catch:{ all -> 0x0193 }
        r3.<init>();	 Catch:{ all -> 0x0193 }
        r4 = r2.getClass();	 Catch:{ all -> 0x0193 }
        r4 = r4.getFields();	 Catch:{ all -> 0x0193 }
        r5 = r4.length;	 Catch:{ all -> 0x0193 }
    L_0x004c:
        if (r1 >= r5) goto L_0x0065;
    L_0x004e:
        r6 = r4[r1];	 Catch:{ all -> 0x0193 }
        r7 = defpackage.dhe.class;
        r7 = r6.getAnnotation(r7);	 Catch:{ all -> 0x0193 }
        r7 = (defpackage.dhe) r7;	 Catch:{ all -> 0x0193 }
        if (r7 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0062;
    L_0x005b:
        r7 = r7.a();	 Catch:{ all -> 0x0193 }
        r3.put(r7, r6);	 Catch:{ all -> 0x0193 }
    L_0x0062:
        r1 = r1 + 1;
        goto L_0x004c;
    L_0x0065:
        r1 = r3.isEmpty();	 Catch:{ all -> 0x0193 }
        if (r1 == 0) goto L_0x0070;
    L_0x006b:
        r1 = "No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.";
        defpackage.qml.b(r1);	 Catch:{ all -> 0x0193 }
    L_0x0070:
        r9 = r9.entrySet();	 Catch:{ all -> 0x0193 }
        r9 = r9.iterator();	 Catch:{ all -> 0x0193 }
    L_0x0078:
        r1 = r9.hasNext();	 Catch:{ all -> 0x0193 }
        if (r1 == 0) goto L_0x0104;
    L_0x007e:
        r1 = r9.next();	 Catch:{ all -> 0x0193 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x0193 }
        r4 = r1.getKey();	 Catch:{ all -> 0x0193 }
        r4 = r3.remove(r4);	 Catch:{ all -> 0x0193 }
        r4 = (java.lang.reflect.Field) r4;	 Catch:{ all -> 0x0193 }
        if (r4 == 0) goto L_0x00e8;
    L_0x0090:
        r5 = r1.getValue();	 Catch:{ IllegalAccessException -> 0x00c0, IllegalArgumentException -> 0x0098 }
        r4.set(r2, r5);	 Catch:{ IllegalAccessException -> 0x00c0, IllegalArgumentException -> 0x0098 }
        goto L_0x0078;
    L_0x0098:
        r1 = r1.getKey();	 Catch:{ all -> 0x0193 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0193 }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0193 }
        r4 = r4.length();	 Catch:{ all -> 0x0193 }
        r4 = r4 + 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0193 }
        r5.<init>(r4);	 Catch:{ all -> 0x0193 }
        r5.append(r0);	 Catch:{ all -> 0x0193 }
        r5.append(r1);	 Catch:{ all -> 0x0193 }
        r1 = "\" could not be set: Bad Type";
        r5.append(r1);	 Catch:{ all -> 0x0193 }
        r1 = r5.toString();	 Catch:{ all -> 0x0193 }
        defpackage.qml.b(r1);	 Catch:{ all -> 0x0193 }
        goto L_0x0078;
    L_0x00c0:
        r1 = r1.getKey();	 Catch:{ all -> 0x0193 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0193 }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0193 }
        r4 = r4.length();	 Catch:{ all -> 0x0193 }
        r4 = r4 + 49;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0193 }
        r5.<init>(r4);	 Catch:{ all -> 0x0193 }
        r5.append(r0);	 Catch:{ all -> 0x0193 }
        r5.append(r1);	 Catch:{ all -> 0x0193 }
        r1 = "\" could not be set: Illegal Access";
        r5.append(r1);	 Catch:{ all -> 0x0193 }
        r1 = r5.toString();	 Catch:{ all -> 0x0193 }
        defpackage.qml.b(r1);	 Catch:{ all -> 0x0193 }
        goto L_0x0078;
    L_0x00e8:
        r4 = r1.getKey();	 Catch:{ all -> 0x0193 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0193 }
        r1 = r1.getValue();	 Catch:{ all -> 0x0193 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0193 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0193 }
        r4.length();	 Catch:{ all -> 0x0193 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0193 }
        r1.length();	 Catch:{ all -> 0x0193 }
        goto L_0x0078;
    L_0x0104:
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0193 }
        r9.<init>();	 Catch:{ all -> 0x0193 }
        r0 = r3.values();	 Catch:{ all -> 0x0193 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0193 }
    L_0x0111:
        r1 = r0.hasNext();	 Catch:{ all -> 0x0193 }
        if (r1 == 0) goto L_0x016b;
    L_0x0117:
        r1 = r0.next();	 Catch:{ all -> 0x0193 }
        r1 = (java.lang.reflect.Field) r1;	 Catch:{ all -> 0x0193 }
        r3 = defpackage.dhe.class;
        r3 = r1.getAnnotation(r3);	 Catch:{ all -> 0x0193 }
        r3 = (defpackage.dhe) r3;	 Catch:{ all -> 0x0193 }
        r3 = r3.b();	 Catch:{ all -> 0x0193 }
        if (r3 == 0) goto L_0x0111;
    L_0x012b:
        r3 = "Required server option missing: ";
        r4 = defpackage.dhe.class;
        r4 = r1.getAnnotation(r4);	 Catch:{ all -> 0x0193 }
        r4 = (defpackage.dhe) r4;	 Catch:{ all -> 0x0193 }
        r4 = r4.a();	 Catch:{ all -> 0x0193 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x0193 }
        r5 = r4.length();	 Catch:{ all -> 0x0193 }
        if (r5 != 0) goto L_0x0149;
    L_0x0143:
        r4 = new java.lang.String;	 Catch:{ all -> 0x0193 }
        r4.<init>(r3);	 Catch:{ all -> 0x0193 }
        goto L_0x014d;
    L_0x0149:
        r4 = r3.concat(r4);	 Catch:{ all -> 0x0193 }
    L_0x014d:
        defpackage.qml.b(r4);	 Catch:{ all -> 0x0193 }
        r3 = r9.length();	 Catch:{ all -> 0x0193 }
        if (r3 <= 0) goto L_0x015b;
    L_0x0156:
        r3 = ", ";
        r9.append(r3);	 Catch:{ all -> 0x0193 }
    L_0x015b:
        r3 = defpackage.dhe.class;
        r1 = r1.getAnnotation(r3);	 Catch:{ all -> 0x0193 }
        r1 = (defpackage.dhe) r1;	 Catch:{ all -> 0x0193 }
        r1 = r1.a();	 Catch:{ all -> 0x0193 }
        r9.append(r1);	 Catch:{ all -> 0x0193 }
        goto L_0x0111;
    L_0x016b:
        r0 = r9.length();	 Catch:{ all -> 0x0193 }
        if (r0 <= 0) goto L_0x0192;
    L_0x0171:
        r0 = new dhf;	 Catch:{ all -> 0x0193 }
        r1 = "Required server option(s) missing: ";
        r9 = r9.toString();	 Catch:{ all -> 0x0193 }
        r9 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x0193 }
        r2 = r9.length();	 Catch:{ all -> 0x0193 }
        if (r2 != 0) goto L_0x0189;
    L_0x0183:
        r9 = new java.lang.String;	 Catch:{ all -> 0x0193 }
        r9.<init>(r1);	 Catch:{ all -> 0x0193 }
        goto L_0x018d;
    L_0x0189:
        r9 = r1.concat(r9);	 Catch:{ all -> 0x0193 }
    L_0x018d:
        r0.<init>(r9);	 Catch:{ all -> 0x0193 }
        throw r0;	 Catch:{ all -> 0x0193 }
    L_0x0191:
        r2 = 0;
    L_0x0192:
        return r2;
    L_0x0193:
        r9 = move-exception;
        r0 = "";
        defpackage.qml.a(r0, r9);
        r9 = new android.os.RemoteException;
        r9.<init>();
        goto L_0x01a0;
    L_0x019f:
        throw r9;
    L_0x01a0:
        goto L_0x019f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkc.a(java.lang.String):dhc");
    }

    private static boolean a(rky rky) {
        if (!rky.d) {
            rlj.a();
            if (!qmh.a()) {
                return false;
            }
        }
        return true;
    }
}
