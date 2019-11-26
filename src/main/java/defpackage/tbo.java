package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: tbo */
public final class tbo implements tbk {
    private final pin a;

    public tbo(Context context) {
        this.a = new pin(context);
    }

    public final void a(Account account, String... strArr) {
        try {
            pin pin = this.a;
            pzr.a((Object) account);
            pzr.b(true, "Must have at least one URL.");
            qng qng = (qng) riu.a(new qng(), Base64.decode(pih.a(pin.a, account, pin.a(strArr)), 9));
            if (qng != null) {
                qnf qnf = qng.a;
                if (qnf != null) {
                    int intValue = qnf.a.intValue();
                    if (intValue == 1) {
                        pin.a(qnf.b);
                        return;
                    } else if (intValue != 2) {
                        String str = "WebLoginHelper";
                        if (intValue == 5) {
                            pin.a(qnf.b);
                            for (qni qni : qnf.c) {
                                int intValue2 = qni.b.intValue();
                                if (intValue2 != 1) {
                                    if (intValue2 == 2) {
                                        throw new pim();
                                    } else if (intValue2 != 3) {
                                        String valueOf = String.valueOf(qni.b);
                                        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 36);
                                        stringBuilder.append("Unrecognized failed account status: ");
                                        stringBuilder.append(valueOf);
                                        Log.w(str, stringBuilder.toString());
                                    }
                                }
                            }
                            throw new pii("Authorization failed, but no recoverable accounts.");
                        }
                        String valueOf2 = String.valueOf(qnf);
                        StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 21);
                        stringBuilder2.append("Unexpected response: ");
                        stringBuilder2.append(valueOf2);
                        Log.w(str, stringBuilder2.toString());
                        String valueOf3 = String.valueOf(qnf.a);
                        stringBuilder2 = new StringBuilder(valueOf3.length() + 25);
                        stringBuilder2.append("Unknown response status: ");
                        stringBuilder2.append(valueOf3);
                        throw new pii(stringBuilder2.toString());
                    } else {
                        throw new IOException("Request failed, but server said RETRY.");
                    }
                }
            }
            throw new pii("Invalid response.");
        } catch (rir e) {
            throw new pii("Couldn't read data from server.", e);
        } catch (pim e2) {
            tbi tbi = new tbi(e2.getMessage(), e2.getCause());
            tbi.setStackTrace(e2.getStackTrace());
            throw tbi;
        } catch (pii e3) {
            tbd tbd = new tbd(e3.getMessage(), e3);
            tbd.setStackTrace(e3.getStackTrace());
            throw tbd;
        }
    }
}
