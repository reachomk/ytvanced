package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: ajjc */
public final class ajjc implements Parcelable, Serializable {
    public static final Creator CREATOR = new ajjf();
    public final int a;
    public final ajiy b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    private final long f;

    public ajjc(int i, long j, CharSequence charSequence, CharSequence charSequence2, ajiy ajiy) {
        this.a = i;
        this.f = j;
        this.c = charSequence;
        this.b = ajiy;
        this.d = charSequence2;
        this.e = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.f);
        TextUtils.writeToParcel(this.c, parcel, 0);
        TextUtils.writeToParcel(this.d, parcel, 0);
        parcel.writeParcelable(this.b, 0);
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "id: %d time: %d text: %s fullText: %s settings: %s", new Object[]{Integer.valueOf(this.a), Long.valueOf(this.f), this.c, this.d, this.b.toString()});
    }

    /* synthetic */ ajjc(Parcel parcel) {
        this(parcel.readInt(), parcel.readLong(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (ajiy) parcel.readParcelable(ajiy.class.getClassLoader()));
    }
}
