package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

/* renamed from: piw */
final class piw implements pik {
    private final /* synthetic */ Account a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Bundle c;

    piw(Account account, String str, Bundle bundle) {
        this.a = account;
        this.b = str;
        this.c = bundle;
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        Bundle bundle = (Bundle) pih.a(rkb.a(iBinder).a(this.a, this.b, this.c));
        TokenData a = TokenData.a(bundle, "tokenDetails");
        if (a != null) {
            return a;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        Object obj = null;
        for (pis pis : pis.values()) {
            if (pis.s.equals(string)) {
                obj = pis;
            }
        }
        if (pis.BAD_AUTHENTICATION.equals(obj) || pis.CAPTCHA.equals(obj) || pis.NEED_PERMISSION.equals(obj) || pis.NEED_REMOTE_CONSENT.equals(obj) || pis.NEEDS_BROWSER.equals(obj) || pis.USER_CANCEL.equals(obj) || pis.DEVICE_MANAGEMENT_REQUIRED.equals(obj) || pis.DM_INTERNAL_ERROR.equals(obj) || pis.DM_SYNC_DISABLED.equals(obj) || pis.DM_ADMIN_BLOCKED.equals(obj) || pis.DM_ADMIN_PENDING_APPROVAL.equals(obj) || pis.DM_STALE_SYNC_REQUIRED.equals(obj) || pis.DM_DEACTIVATED.equals(obj) || pis.DM_REQUIRED.equals(obj) || pis.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(obj) || pis.DM_SCREENLOCK_REQUIRED.equals(obj)) {
            qox qox = pih.c;
            Object[] objArr = new Object[1];
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
            stringBuilder.append("isUserRecoverableError status: ");
            stringBuilder.append(valueOf);
            objArr[0] = stringBuilder.toString();
            qox.a("GoogleAuthUtil", objArr);
            throw new pil(string, intent);
        } else if (pis.NETWORK_ERROR.equals(obj) || pis.SERVICE_UNAVAILABLE.equals(obj)) {
            throw new IOException(string);
        } else {
            throw new pii(string);
        }
    }
}
