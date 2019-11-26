package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.model.AvatarReference;
import java.util.Arrays;

/* renamed from: rte */
public final class rte extends qou {
    public static final Creator CREATOR = new rtq();
    private AvatarReference a;

    public rte(AvatarReference avatarReference) {
        this.a = avatarReference;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 3, this.a, i);
        qov.a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rte)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.a.equals(((rte) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
