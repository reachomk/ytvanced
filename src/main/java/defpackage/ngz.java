package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: ngz */
public final class ngz implements ngn {
    public static final Creator CREATOR = new nhc();
    public static final ngz a = new ngz(null, null, null, null, 0, 4);
    public final long b;
    public final CharSequence c;
    public final nhh d;
    public final nhh e;
    public final nhh f;
    public final int g;

    public static ngz a(nhh nhh, nhh nhh2, nhh nhh3, CharSequence charSequence, long j, int i) {
        return new ngz(nhh, nhh2, nhh3, charSequence, j, i);
    }

    public final int describeContents() {
        return 0;
    }

    private ngz(nhh nhh, nhh nhh2, nhh nhh3, CharSequence charSequence, long j, int i) {
        this.e = nhh;
        this.f = nhh2;
        this.d = nhh3;
        this.c = charSequence;
        this.b = j;
        this.g = i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f, this.d, this.c, Long.valueOf(this.b), Integer.valueOf(this.g)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ngz) {
            ngz ngz = (ngz) obj;
            if (amqq.a(this.e, ngz.e) && amqq.a(this.f, ngz.f) && amqq.a(this.d, ngz.d) && TextUtils.equals(this.c, ngz.c) && ngz.b == this.b && ngz.g == this.g) {
                return true;
            }
        }
        return false;
    }

    public final ngq a() {
        return ngq.MUTED_AUTOPLAY_STATE;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.d, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeLong(this.b);
        parcel.writeInt(this.g);
    }

    /* synthetic */ ngz(Parcel parcel) {
        this((nhh) parcel.readParcelable(nhh.class.getClassLoader()), (nhh) parcel.readParcelable(nhh.class.getClassLoader()), (nhh) parcel.readParcelable(nhh.class.getClassLoader()), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt());
    }
}
