package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qkw */
public final class qkw extends qks {
    private final qmw a;

    public qkw(qmw qmw) {
        this.a = qmw;
    }

    public final void a(String str, qcs qcs, qkh qkh, rkz rkz) {
        RemoteException e;
        try {
            qkv qkv = new qkv(qkh);
            qmw qmw = this.a;
            qct.a(qcs);
            qkw.b(str);
            qmt qmt = new qmt();
            peg.a(rkz.c, rkz.b, rkz.a);
            qkv.a.a(qmw.getClass().getSimpleName().concat(" does not support banner ads."));
        } catch (RemoteException e2) {
            qml.a("", e2);
        } catch (Throwable th) {
            qml.a("Adapter failed to render banner ad.", th);
            e2 = new RemoteException();
        }
    }

    public final void a(String str, qcs qcs, qkj qkj) {
        RemoteException e;
        try {
            qky qky = new qky(qkj);
            qmw qmw = this.a;
            qct.a(qcs);
            qkw.b(str);
            qmt qmt = new qmt();
            qky.a.a(qmw.getClass().getSimpleName().concat(" does not support interstitial ads."));
        } catch (RemoteException e2) {
            qml.a("", e2);
        } catch (Throwable th) {
            qml.a("Adapter failed to render interstitial ad.", th);
            e2 = new RemoteException();
        }
    }

    public final void a(String str, qcs qcs, qkn qkn) {
        RemoteException e;
        try {
            qkx qkx = new qkx(qkn);
            qmw qmw = this.a;
            qct.a(qcs);
            qkw.b(str);
            qmt qmt = new qmt();
            qkx.a.a(qmw.getClass().getSimpleName().concat(" does not support rewarded ads."));
        } catch (RemoteException e2) {
            qml.a("", e2);
        } catch (Throwable th) {
            qml.a("Adapter failed to render rewarded ad.", th);
            e2 = new RemoteException();
        }
    }

    public final void a(String str, qcs qcs, qkl qkl) {
        RemoteException e;
        try {
            qla qla = new qla(qkl);
            qmw qmw = this.a;
            qct.a(qcs);
            qkw.b(str);
            qmt qmt = new qmt();
            qla.a.a(qmw.getClass().getSimpleName().concat(" does not support native ads."));
        } catch (RemoteException e2) {
            qml.a("", e2);
        } catch (Throwable th) {
            qml.a("Adapter failed to render rewarded ad.", th);
            e2 = new RemoteException();
        }
    }

    public final void d() {
        qmr qmr = null;
        try {
            qmr.a();
        } catch (Throwable th) {
            qml.a("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void e() {
        qmu qmu = null;
        try {
            qmu.a();
        } catch (Throwable th) {
            qml.a("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final rmt c() {
        qmw qmw = this.a;
        if (qmw instanceof pea) {
            try {
                return ((pea) qmw).getVideoController();
            } catch (Throwable th) {
                qml.a("", th);
            }
        }
        return null;
    }

    public final void a(qcs qcs, String str) {
        try {
            qkz qkz = new qkz();
            qmw qmw = this.a;
            qct.a(qcs);
            qkw.a(str);
            qmy qmy = new qmy();
            qmw.d();
        } catch (Throwable th) {
            qml.a("Error generating signals for RTB", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final qlc a() {
        return qlc.a(this.a.b());
    }

    public final qlc b() {
        return qlc.a(this.a.a());
    }

    public final void f() {
        this.a.c();
    }

    public final void a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < strArr.length) {
            try {
                qkw.a(strArr[i]);
                arrayList.add(new qmv());
                i++;
            } catch (IndexOutOfBoundsException unused) {
                throw new RemoteException();
            }
        }
    }

    private static int a(java.lang.String r4) {
        /*
        r0 = r4.hashCode();
        r1 = 3;
        r2 = 2;
        r3 = 1;
        switch(r0) {
            case -1396342996: goto L_0x0029;
            case -1052618729: goto L_0x001f;
            case -239580146: goto L_0x0015;
            case 604727084: goto L_0x000b;
            default: goto L_0x000a;
        };
    L_0x000a:
        goto L_0x0033;
    L_0x000b:
        r0 = "interstitial";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0033;
    L_0x0013:
        r4 = 1;
        goto L_0x0034;
    L_0x0015:
        r0 = "rewarded";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0033;
    L_0x001d:
        r4 = 2;
        goto L_0x0034;
    L_0x001f:
        r0 = "native";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0033;
    L_0x0027:
        r4 = 3;
        goto L_0x0034;
    L_0x0029:
        r0 = "banner";
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x0033;
    L_0x0031:
        r4 = 0;
        goto L_0x0034;
    L_0x0033:
        r4 = -1;
    L_0x0034:
        if (r4 == 0) goto L_0x0048;
    L_0x0036:
        if (r4 == r3) goto L_0x0047;
    L_0x0038:
        if (r4 == r2) goto L_0x0046;
    L_0x003a:
        if (r4 != r1) goto L_0x003e;
    L_0x003c:
        r4 = 4;
        return r4;
    L_0x003e:
        r4 = new java.lang.IllegalArgumentException;
        r0 = "Internal Error";
        r4.<init>(r0);
        throw r4;
    L_0x0046:
        return r1;
    L_0x0047:
        return r2;
    L_0x0048:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkw.a(java.lang.String):int");
    }

    private static Bundle b(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "Server parameters: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        qml.b(valueOf);
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                str2 = (String) keys.next();
                bundle2.putString(str2, jSONObject.getString(str2));
            }
            return bundle2;
        } catch (JSONException e) {
            qml.a("", e);
            throw new RemoteException();
        }
    }
}
