package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: pkk */
public final class pkk extends qou {
    public static final Creator CREATOR = new pqq();
    public final String a;
    public final String b;

    pkk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pkk) {
            pkk pkk = (pkk) obj;
            return ppj.a(this.a, pkk.a) && ppj.a(this.b, pkk.b);
        }
    }

    public static pkk a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new pkk(jSONObject.optString("adTagUrl", null), jSONObject.optString("adsResponse", null));
        }
        return null;
    }
}
