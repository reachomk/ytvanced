package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: pub */
public abstract class pub extends rjn implements puc {
    public pub() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) rjz.a(parcel, Status.CREATOR));
        return true;
    }
}
