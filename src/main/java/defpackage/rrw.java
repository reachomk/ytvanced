package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: rrw */
public abstract class rrw extends rjn implements rrx {
    public rrw() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((LocationResult) rjz.a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((LocationAvailability) rjz.a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
