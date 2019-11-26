package defpackage;

import android.media.session.PlaybackState.CustomAction;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: xx */
public final class xx implements Parcelable {
    public static final Creator CREATOR = new xw();
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle d;
    public CustomAction e;

    public xx(String str, CharSequence charSequence, int i, Bundle bundle) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    xx(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = parcel.readInt();
        this.d = parcel.readBundle(wq.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
    }

    public static xx a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        CustomAction customAction = (CustomAction) obj;
        xx xxVar = new xx(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
        xxVar.e = customAction;
        return xxVar;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Action:mName='");
        stringBuilder.append(this.b);
        stringBuilder.append(", mIcon=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mExtras=");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }
}
