package org.chromium.net;

import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import defpackage.bchn;
import defpackage.bchu;
import defpackage.bcjm;
import defpackage.bcjp;
import org.chromium.base.ThreadUtils;

public class HttpNegotiateAuthenticator {
    public Bundle a;
    private final String b;

    private HttpNegotiateAuthenticator(String str) {
        this.b = str;
    }

    public native void nativeSetResult(long j, int i, String str);

    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    /* Access modifiers changed, original: 0000 */
    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = bchn.a;
        bcjp bcjp = new bcjp();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SPNEGO:HOSTBASED:");
        stringBuilder.append(str);
        bcjp.d = stringBuilder.toString();
        bcjp.b = AccountManager.get(context);
        bcjp.a = j;
        String[] strArr = new String[]{"SPNEGO"};
        bcjp.c = new Bundle();
        if (str2 != null) {
            bcjp.c.putString("incomingAuthToken", str2);
        }
        Bundle bundle = this.a;
        if (bundle != null) {
            bcjp.c.putBundle("spnegoContext", bundle);
        }
        bcjp.c.putBoolean("canDelegate", z);
        if (a(context, "android.permission.GET_ACCOUNTS")) {
            bchu.c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
            nativeSetResult(bcjp.a, -343, null);
            return;
        }
        bcjp.b.getAccountsByTypeAndFeatures(this.b, strArr, new bcjm(this, bcjp), new Handler(ThreadUtils.c()));
    }

    public static boolean a(Context context, String str) {
        if (VERSION.SDK_INT >= 23 || context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return false;
        }
        return true;
    }
}
