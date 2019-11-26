package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nhm */
public final class nhm implements Parcelable {
    public static final Creator CREATOR = new nhl();
    public final int a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final int g;

    public nhm(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = new ArrayList();
        parcel.readStringList(this.d);
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }

    public static nhm a(String str, int i) {
        nho nho = new nho();
        nho.a = 1;
        nho.b = str;
        nho.e = i;
        return nho.a();
    }

    public static nhm a(String str, int i, int i2) {
        nho nho = new nho();
        nho.a = 1;
        nho.b = str;
        nho.e = i;
        nho.g = i2;
        return nho.a();
    }

    public static nhm b(String str, int i) {
        nho nho = new nho();
        nho.a = 2;
        nho.c = str;
        nho.e = i;
        return nho.a();
    }

    public static nhm a(String str, int i, int i2, int i3) {
        nho nho = new nho();
        nho.a = 2;
        nho.c = str;
        nho.e = i;
        nho.f = i2;
        nho.g = i3;
        return nho.a();
    }

    @Deprecated
    public static nhm a(String str, List list, String str2, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return null;
        }
        nho nho = new nho();
        if (!TextUtils.isEmpty(str2)) {
            nho.a = 2;
            nho.c = str2;
            nho.b = str;
        } else if (list != null && list.size() > 0) {
            nho.a = 3;
            nho.d = new ArrayList();
            nho.d.add(str);
            nho.d.addAll(list);
        } else {
            nho.a = 1;
            nho.b = str;
        }
        if (nho.a != 1) {
            nho.f = i2;
        }
        nho.g = i3;
        nho.e = i;
        return nho.a();
    }

    public static nhm a(List list, int i) {
        nho nho = new nho();
        nho.a = 3;
        nho.d = new ArrayList(list);
        nho.e = i;
        return nho.a();
    }

    public static nhm a(List list, int i, int i2, int i3) {
        nho nho = new nho();
        nho.a = 3;
        nho.d = new ArrayList(list);
        nho.e = i;
        nho.f = i2;
        nho.g = i3;
        return nho.a();
    }

    public static void a(nhm nhm, Bundle bundle) {
        bundle.putInt("spd_descriptor_type", nhm.a);
        bundle.putString("spd_video_id", nhm.b);
        bundle.putString("spd_playlist_id", nhm.c);
        bundle.putStringArrayList("spd_video_ids_list", nhm.d);
        bundle.putInt("spd_start_index", nhm.f);
        bundle.putInt("spd_start_millis", nhm.g);
    }

    public static nhm a(Bundle bundle) {
        nho nho = new nho();
        nho.a = bundle.getInt("spd_descriptor_type");
        nho.b = bundle.getString("spd_video_id");
        nho.c = bundle.getString("spd_playlist_id");
        nho.d = bundle.getStringArrayList("spd_video_ids_list");
        nho.e = 0;
        nho.f = bundle.getInt("spd_start_index");
        nho.g = bundle.getInt("spd_start_millis");
        return nho.a();
    }

    public final nhm a(int i) {
        nho nho = new nho();
        nho.a = this.a;
        nho.b = this.b;
        nho.c = this.c;
        nho.d = new ArrayList();
        nho.d.addAll(this.d);
        nho.e = this.e;
        nho.f = this.f;
        nho.g = this.g;
        nho.e = i;
        return nho.a();
    }

    /* synthetic */ nhm(int i, String str, String str2, ArrayList arrayList, int i2, int i3, int i4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }
}
