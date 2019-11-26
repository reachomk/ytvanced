package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: ajis */
public final class ajis implements Parcelable {
    public static final Creator CREATOR = new ajiv();
    public final String a;
    @Deprecated
    public final String b;
    @Deprecated
    public final String c;
    public final String d;
    @Deprecated
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final CharSequence j;
    public final boolean k;

    public ajis(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9) {
        this.a = (String) amqw.a((Object) str, (Object) "languageCode cannot be null");
        this.b = str2;
        this.c = (String) amqw.a((Object) str3, (Object) "trackName cannot be null");
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = str6;
        this.h = (String) amqw.a((Object) str7);
        this.i = (String) amqw.a((Object) str8);
        this.j = (CharSequence) amqw.a((Object) str9);
        this.k = false;
    }

    public final int describeContents() {
        return 0;
    }

    public ajis(String str, String str2, String str3, String str4, CharSequence charSequence, boolean z) {
        this.a = str;
        this.d = str2;
        this.h = str3;
        this.i = str4;
        this.j = charSequence;
        this.k = z;
        this.g = null;
        str = "";
        this.b = str;
        this.c = str;
        this.e = 0;
        this.f = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j.toString());
    }

    public static ajis a(aahr aahr) {
        aahr aahr2 = aahr;
        if (aahr.n().isEmpty()) {
            String displayName = new Locale("en").getDisplayName(Locale.getDefault());
            return new ajis("en", displayName, "", aahr2.b, aahr.b(), aahr2.e, null, ".en", "", displayName);
        }
        String n = aahr.n();
        String displayName2 = new Locale(aahr.n()).getDisplayName(Locale.getDefault());
        String m = aahr.m();
        String str = aahr2.b;
        int b = aahr.b();
        String str2 = aahr2.e;
        apiv apiv = aahr2.a.D;
        if (apiv == null) {
            apiv = apiv.e;
        }
        String str3 = "";
        return new ajis(n, displayName2, m, str, b, str2, null, apiv.c, str3, aahr.m());
    }

    public static ajis a(String str, String str2, String str3) {
        return new ajis(str2, str3, "-", "DASH", str, false);
    }

    public static ajis a(String str) {
        return new ajis("DISABLE_CAPTIONS_OPTION", "", "-", "", str, false);
    }

    public static ajis a(String str, String str2, String str3, String str4, String str5) {
        amqw.a((Object) str2);
        amqw.a((Object) str3);
        return new ajis(str, "", "", str2, 0, "", str3, str4, "", str5);
    }

    public final boolean a() {
        return "DISABLE_CAPTIONS_OPTION".equals(this.a);
    }

    public final String toString() {
        return this.j.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajis) {
            ajis ajis = (ajis) obj;
            if (this.h.equals(ajis.h) && TextUtils.equals(this.d, ajis.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() + 527) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31;
        String str = this.d;
        return str != null ? hashCode + str.hashCode() : hashCode;
    }

    /* synthetic */ ajis(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
