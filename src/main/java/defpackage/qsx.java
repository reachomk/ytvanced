package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: qsx */
public abstract class qsx extends rjn implements qsy {
    public qsx() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 3) {
            rjz.a(parcel, psa.CREATOR);
            rjz.a(parcel, qst.CREATOR);
            a();
        } else if (i == 4) {
            rjz.a(parcel, Status.CREATOR);
            b();
        } else if (i == 6) {
            rjz.a(parcel, Status.CREATOR);
            c();
        } else if (i == 7) {
            rjz.a(parcel, Status.CREATOR);
            rjz.a(parcel, GoogleSignInAccount.CREATOR);
            d();
        } else if (i != 8) {
            return false;
        } else {
            a((qtd) rjz.a(parcel, qtd.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
