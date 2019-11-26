package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import java.io.IOException;
import org.chromium.base.ThreadUtils;
import org.chromium.net.HttpNegotiateAuthenticator;

/* renamed from: bcjm */
public final class bcjm implements AccountManagerCallback {
    private final bcjp a;
    private final /* synthetic */ HttpNegotiateAuthenticator b;

    public bcjm(HttpNegotiateAuthenticator httpNegotiateAuthenticator, bcjp bcjp) {
        this.b = httpNegotiateAuthenticator;
        this.a = bcjp;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        String str = "net_auth";
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            int length = accountArr.length;
            if (length == 0) {
                bchu.b(str, "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                this.b.nativeSetResult(this.a.a, -341, null);
            } else if (length > 1) {
                bchu.b(str, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(length));
                this.b.nativeSetResult(this.a.a, -341, null);
            } else if (HttpNegotiateAuthenticator.a(bchn.a, "android.permission.USE_CREDENTIALS")) {
                bchu.c(str, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                this.b.nativeSetResult(this.a.a, -343, null);
            } else {
                bcjp bcjp = this.a;
                bcjp.e = accountArr[0];
                bcjp.b.getAuthToken(bcjp.e, bcjp.d, bcjp.c, true, new bcjo(this.b, bcjp), new Handler(ThreadUtils.c()));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            bchu.b(str, "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            this.b.nativeSetResult(this.a.a, -9, null);
        }
    }
}
