package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: tbl */
public final class tbl extends tbm {
    public tbl(Context context) {
        super(context);
    }

    public final Account[] b(String str) {
        String str2;
        ContentProviderClient acquireContentProviderClient;
        try {
            Object obj = this.a;
            pzr.a(str);
            psh.c(obj, 8400000);
            if (VERSION.SDK_INT < 23) {
                return AccountManager.get(obj).getAccountsByType(str);
            }
            acquireContentProviderClient = ((Context) pzr.a(obj)).getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
            if (acquireContentProviderClient != null) {
                Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", str, new Bundle()).getParcelableArray("accounts");
                Account[] accountArr = new Account[parcelableArray.length];
                for (int i = 0; i < parcelableArray.length; i++) {
                    accountArr[i] = (Account) parcelableArray[i];
                }
                acquireContentProviderClient.release();
                return accountArr;
            }
            throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
        } catch (Exception e) {
            str2 = "Accounts ContentProvider failed: ";
            str = String.valueOf(e.getMessage());
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            throw new RemoteException(str);
        } catch (psj e2) {
            int i2 = e2.a;
            str2 = e2.getMessage();
            e2.a();
            throw new tei(i2, str2, e2);
        } catch (psg e3) {
            throw new tej(e3.a, e3);
        } catch (Throwable th) {
            acquireContentProviderClient.release();
        }
    }
}
