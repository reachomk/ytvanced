package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aaha */
public final class aaha implements afnt, Parcelable {
    public static final Creator CREATOR = new aahd();
    public static final aahf e = new aahf();
    public final int a;
    public final Uri b;
    public final String c;
    public final List d;

    public aaha(int i, Uri uri, String str, List list) {
        this.a = i;
        this.b = uri;
        this.c = str;
        if (list == null) {
            list = new ArrayList();
        }
        this.d = Collections.unmodifiableList(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            aaha aaha = (aaha) obj;
            if (amqq.a(Integer.valueOf(this.a), Integer.valueOf(aaha.a)) && amqq.a(this.b, aaha.b) && amqq.a(this.c, aaha.c) && amqq.a(this.d, aaha.d)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeTypedList(this.d);
    }

    public final /* synthetic */ afns c() {
        return new aahf(this);
    }
}
