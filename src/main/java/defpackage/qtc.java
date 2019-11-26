package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: qtc */
public final class qtc extends qae implements rxy {
    private final boolean a;
    private final pyp b;
    private final Bundle c;
    private final Integer d;

    public qtc(Context context, Looper looper, pyp pyp, pte pte, pth pth) {
        rxv rxv = pyp.g;
        Integer num = pyp.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", pyp.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (rxv != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", rxv.b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", rxv.c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", rxv.d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", rxv.e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", rxv.f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", rxv.g);
            Long l = rxv.h;
            Long l2 = rxv.i;
        }
        super(context, looper, 44, pyp, pte, pth);
        this.a = true;
        this.b = pyp;
        this.c = bundle;
        this.d = pyp.h;
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final int c() {
        return 12451000;
    }

    public final boolean k() {
        return this.a;
    }

    public final void a(pyy pyy, boolean z) {
        try {
            ((qta) v()).a(pyy, this.d.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void d() {
        try {
            ((qta) v()).a(this.d.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|(2:5|6)|7|(1:9)(2:10|(2:12|(2:14|15)))|16|17|18) */
    public final void a(defpackage.qsy r8) {
        /*
        r7 = this;
        r0 = "Expecting a valid ISignInCallbacks";
        defpackage.pzr.a(r8, r0);
        r0 = r7.b;	 Catch:{ RemoteException -> 0x0079 }
        r0 = r0.a;	 Catch:{ RemoteException -> 0x0079 }
        r1 = "<<default account>>";
        if (r0 != 0) goto L_0x0014;
    L_0x000d:
        r0 = new android.accounts.Account;	 Catch:{ RemoteException -> 0x0079 }
        r2 = "com.google";
        r0.<init>(r1, r2);	 Catch:{ RemoteException -> 0x0079 }
    L_0x0014:
        r2 = r0.name;	 Catch:{ RemoteException -> 0x0079 }
        r1 = r1.equals(r2);	 Catch:{ RemoteException -> 0x0079 }
        r2 = 0;
        if (r1 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x005f;
    L_0x001e:
        r1 = r7.x;	 Catch:{ RemoteException -> 0x0079 }
        r1 = defpackage.piq.a(r1);	 Catch:{ RemoteException -> 0x0079 }
        r3 = "defaultGoogleSignInAccount";
        r3 = r1.a(r3);	 Catch:{ RemoteException -> 0x0079 }
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ RemoteException -> 0x0079 }
        if (r4 != 0) goto L_0x005f;
    L_0x0030:
        r4 = "googleSignInAccount";
        r5 = r4.length();	 Catch:{ RemoteException -> 0x0079 }
        r5 = r5 + 1;
        r6 = java.lang.String.valueOf(r3);	 Catch:{ RemoteException -> 0x0079 }
        r6 = r6.length();	 Catch:{ RemoteException -> 0x0079 }
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x0079 }
        r6.<init>(r5);	 Catch:{ RemoteException -> 0x0079 }
        r6.append(r4);	 Catch:{ RemoteException -> 0x0079 }
        r4 = ":";
        r6.append(r4);	 Catch:{ RemoteException -> 0x0079 }
        r6.append(r3);	 Catch:{ RemoteException -> 0x0079 }
        r3 = r6.toString();	 Catch:{ RemoteException -> 0x0079 }
        r1 = r1.a(r3);	 Catch:{ RemoteException -> 0x0079 }
        if (r1 == 0) goto L_0x005f;
    L_0x005b:
        r2 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.a(r1);	 Catch:{ JSONException -> 0x005f }
    L_0x005f:
        r1 = new pzq;	 Catch:{ RemoteException -> 0x0079 }
        r3 = r7.d;	 Catch:{ RemoteException -> 0x0079 }
        r3 = r3.intValue();	 Catch:{ RemoteException -> 0x0079 }
        r1.<init>(r0, r3, r2);	 Catch:{ RemoteException -> 0x0079 }
        r0 = r7.v();	 Catch:{ RemoteException -> 0x0079 }
        r0 = (defpackage.qta) r0;	 Catch:{ RemoteException -> 0x0079 }
        r2 = new qtb;	 Catch:{ RemoteException -> 0x0079 }
        r2.<init>(r1);	 Catch:{ RemoteException -> 0x0079 }
        r0.a(r2, r8);	 Catch:{ RemoteException -> 0x0079 }
        return;
    L_0x0079:
        r0 = move-exception;
        r1 = "SignInClientImpl";
        r2 = "Remote service probably died when signIn is called";
        android.util.Log.w(r1, r2);
        r2 = new qtd;	 Catch:{ RemoteException -> 0x008a }
        r2.<init>();	 Catch:{ RemoteException -> 0x008a }
        r8.a(r2);	 Catch:{ RemoteException -> 0x008a }
        return;
    L_0x008a:
        r8 = "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.";
        android.util.Log.wtf(r1, r8, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtc.a(qsy):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final Bundle g() {
        if (!this.x.getPackageName().equals(this.b.e)) {
            this.c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.b.e);
        }
        return this.c;
    }

    public final void h() {
        a(new pyn(this));
    }
}
