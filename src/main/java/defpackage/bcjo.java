package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import java.io.IOException;
import org.chromium.net.HttpNegotiateAuthenticator;

/* renamed from: bcjo */
public final class bcjo implements AccountManagerCallback {
    public final bcjp a;
    public final /* synthetic */ HttpNegotiateAuthenticator b;

    public bcjo(HttpNegotiateAuthenticator httpNegotiateAuthenticator, bcjp bcjp) {
        this.b = httpNegotiateAuthenticator;
        this.a = bcjp;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        int i = 0;
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle.containsKey("intent")) {
                Context context = bchn.a;
                context.registerReceiver(new bcjn(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                return;
            }
            HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
            bcjp bcjp = this.a;
            httpNegotiateAuthenticator.a = bundle.getBundle("spnegoContext");
            switch (bundle.getInt("spnegoResult", 1)) {
                case 0:
                    break;
                case 2:
                    i = -3;
                    break;
                case 3:
                    i = -342;
                    break;
                case 4:
                    i = -320;
                    break;
                case 5:
                    i = -338;
                    break;
                case 6:
                    i = -339;
                    break;
                case 7:
                    i = -341;
                    break;
                case 8:
                    i = -344;
                    break;
                case 9:
                    i = -329;
                    break;
                default:
                    i = -9;
                    break;
            }
            httpNegotiateAuthenticator.nativeSetResult(bcjp.a, i, bundle.getString("authtoken"));
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            bchu.b("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            this.b.nativeSetResult(this.a.a, -9, null);
        }
    }
}
