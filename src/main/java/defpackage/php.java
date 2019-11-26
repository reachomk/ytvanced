package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* renamed from: php */
public abstract class php extends rjn implements phq {
    public php() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) rjz.a(parcel, Status.CREATOR));
        } else if (i == 2) {
            rjz.a(parcel, Status.CREATOR);
            rjz.a(parcel, ParcelFileDescriptor.CREATOR);
            a();
        } else if (i == 3) {
            rjz.a(parcel, Status.CREATOR);
            rjz.a(parcel);
            b();
        } else if (i != 4) {
            return false;
        } else {
            rjz.a(parcel, phf.CREATOR);
            c();
        }
        return true;
    }
}
