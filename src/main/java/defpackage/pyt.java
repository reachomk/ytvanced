package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;

/* renamed from: pyt */
public final class pyt extends qou {
    public static final Creator CREATOR = new qaf();
    public String a;
    public IBinder b;
    public Scope[] c;
    public Bundle d;
    public Account e;
    public psc[] f;
    public psc[] g;
    private final int h;
    private final int i;
    private final int j;
    private final boolean k;

    public pyt(int i) {
        this.h = 4;
        this.j = psh.c;
        this.i = i;
        this.k = true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003f */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:19:?, code skipped:
            android.util.Log.w("AccountAccessor", "Remote account accessor probably died");
     */
    /* JADX WARNING: Missing block: B:20:0x004a, code skipped:
            android.os.Binder.restoreCallingIdentity(r3);
     */
    pyt(int r1, int r2, int r3, java.lang.String r4, android.os.IBinder r5, com.google.android.gms.common.api.Scope[] r6, android.os.Bundle r7, android.accounts.Account r8, defpackage.psc[] r9, defpackage.psc[] r10, boolean r11) {
        /*
        r0 = this;
        r0.<init>();
        r0.h = r1;
        r0.i = r2;
        r0.j = r3;
        r2 = "com.google.android.gms";
        r3 = r2.equals(r4);
        if (r3 == 0) goto L_0x0014;
    L_0x0011:
        r0.a = r2;
        goto L_0x0016;
    L_0x0014:
        r0.a = r4;
    L_0x0016:
        r2 = 2;
        if (r1 >= r2) goto L_0x0051;
    L_0x0019:
        r1 = 0;
        if (r5 == 0) goto L_0x004e;
    L_0x001c:
        r2 = "com.google.android.gms.common.internal.IAccountAccessor";
        r2 = r5.queryLocalInterface(r2);
        r3 = r2 instanceof defpackage.pyy;
        if (r3 == 0) goto L_0x0029;
    L_0x0026:
        r2 = (defpackage.pyy) r2;
        goto L_0x002e;
    L_0x0029:
        r2 = new qaq;
        r2.<init>(r5);
    L_0x002e:
        if (r2 != 0) goto L_0x0031;
    L_0x0030:
        goto L_0x004e;
    L_0x0031:
        r3 = android.os.Binder.clearCallingIdentity();
        r1 = r2.a();	 Catch:{ RemoteException -> 0x003f }
        android.os.Binder.restoreCallingIdentity(r3);
        goto L_0x004e;
    L_0x003d:
        r1 = move-exception;
        goto L_0x004a;
    L_0x003f:
        r2 = "AccountAccessor";
        r5 = "Remote account accessor probably died";
        android.util.Log.w(r2, r5);	 Catch:{ all -> 0x003d }
        android.os.Binder.restoreCallingIdentity(r3);
        goto L_0x004e;
    L_0x004a:
        android.os.Binder.restoreCallingIdentity(r3);
        throw r1;
    L_0x004e:
        r0.e = r1;
        goto L_0x0055;
    L_0x0051:
        r0.b = r5;
        r0.e = r8;
    L_0x0055:
        r0.c = r6;
        r0.d = r7;
        r0.f = r9;
        r0.g = r10;
        r0.k = r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyt.<init>(int, int, int, java.lang.String, android.os.IBinder, com.google.android.gms.common.api.Scope[], android.os.Bundle, android.accounts.Account, psc[], psc[], boolean):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.h);
        qov.b(parcel, 2, this.i);
        qov.b(parcel, 3, this.j);
        qov.a(parcel, 4, this.a);
        qov.a(parcel, 5, this.b);
        qov.a(parcel, 6, this.c, i);
        qov.a(parcel, 7, this.d);
        qov.a(parcel, 8, this.e, i);
        qov.a(parcel, 10, this.f, i);
        qov.a(parcel, 11, this.g, i);
        qov.a(parcel, 12, this.k);
        qov.a(parcel, a);
    }
}
