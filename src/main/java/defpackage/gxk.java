package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: gxk */
final class gxk implements Parcelable {
    public static final Creator CREATOR = new gxn();
    public final CharSequence a;
    public final CharSequence b;
    public final awnx c;

    public gxk(CharSequence charSequence, CharSequence charSequence2, awnx awnx) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = (awnx) amqw.a((Object) awnx);
    }

    public final int describeContents() {
        return 0;
    }

    public gxk(Parcel parcel) {
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = awnx.a(parcel.readInt());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.a, parcel, 0);
        TextUtils.writeToParcel(this.b, parcel, 0);
        parcel.writeInt(this.c.d);
    }
}
