package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: dee */
public abstract class dee extends dhx implements def {
    public dee() {
        super("com.firebase.jobdispatcher.IJobCallback");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((Bundle) dhw.a(parcel, Bundle.CREATOR), parcel.readInt());
        return true;
    }
}
