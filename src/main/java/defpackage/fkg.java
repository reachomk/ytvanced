package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;

/* renamed from: fkg */
public final class fkg {
    private final Context a;
    private final zyw b;
    private final zzl c;
    private final SharedPreferences d;

    public fkg(Context context, zyw zyw, zzl zzl, SharedPreferences sharedPreferences) {
        this.a = context;
        this.b = zyw;
        this.c = zzl;
        this.d = sharedPreferences;
    }

    /* JADX WARNING: Missing block: B:12:0x002b, code skipped:
            if (r0.p == false) goto L_0x0044;
     */
    public final int a() {
        /*
        r2 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 26;
        if (r0 < r1) goto L_0x0044;
    L_0x0006:
        r0 = r2.a;
        r0 = r0.getPackageManager();
        r1 = "android.software.picture_in_picture";
        r0 = r0.hasSystemFeature(r1);
        if (r0 == 0) goto L_0x0044;
    L_0x0014:
        r0 = r2.b;
        r0 = r0.a();
        if (r0 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x002e;
    L_0x001d:
        r1 = r0.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x002e;
    L_0x0023:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0029;
    L_0x0027:
        r0 = defpackage.aulu.bw;
    L_0x0029:
        r0 = r0.p;
        if (r0 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0044;
    L_0x002e:
        r0 = r2.c;
        r0 = r0.b();
        if (r0 == 0) goto L_0x0042;
    L_0x0036:
        r0 = r0.e;
        if (r0 != 0) goto L_0x003c;
    L_0x003a:
        r0 = defpackage.aume.af;
    L_0x003c:
        r0 = r0.t;
        if (r0 == 0) goto L_0x0042;
    L_0x0040:
        r0 = 3;
        return r0;
    L_0x0042:
        r0 = 2;
        return r0;
    L_0x0044:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkg.a():int");
    }

    public final int b() {
        if (((AppOpsManager) this.a.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.a.getPackageName()) == 2) {
            return 1;
        }
        if (this.d.getBoolean(ebn.PIP_POLICY, true)) {
            return 3;
        }
        return 2;
    }
}
