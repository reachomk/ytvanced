package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import java.io.IOException;

/* renamed from: uzp */
public final class uzp implements AccountManagerCallback {
    private final uzm a;

    public final void run(AccountManagerFuture accountManagerFuture) {
        if (accountManagerFuture.isDone()) {
            try {
                Bundle bundle = (Bundle) accountManagerFuture.getResult();
                if (bundle != null) {
                    String string = bundle.getString("authAccount");
                    if (string == null) {
                        this.a.a(3);
                        return;
                    }
                    amqw.a((Object) string);
                    this.a.a(string);
                    return;
                }
                this.a.a(2);
                return;
            } catch (AuthenticatorException unused) {
                this.a.a(4);
                return;
            } catch (OperationCanceledException unused2) {
                this.a.a(5);
                return;
            } catch (IOException unused3) {
                this.a.a(6);
                return;
            }
        }
        this.a.a(1);
    }

    public /* synthetic */ uzp(uzm uzm) {
        this.a = (uzm) amqw.a((Object) uzm);
    }
}
