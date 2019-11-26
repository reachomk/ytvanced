package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: zep */
public final class zep extends zev {
    public static final Creator CREATOR = new zes();
    private final List c;

    public zep(CharSequence charSequence, List list, int i) {
        super(charSequence, i);
        this.c = (List) amqw.a((Object) list);
    }

    public zep(CharSequence charSequence, List list) {
        this(charSequence, list, 0);
    }

    public final List a(Context context) {
        amqw.a((Object) context);
        return this.c;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof zep) || !super.equals(obj)) {
                z = false;
            } else if (this.c.equals(((zep) obj).c)) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.c);
    }

    /* synthetic */ zep(Parcel parcel) {
        super(parcel);
        this.c = new ArrayList();
        parcel.readTypedList(this.c, zet.CREATOR);
    }
}
