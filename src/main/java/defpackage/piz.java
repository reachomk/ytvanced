package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: piz */
public final class piz extends qou {
    public static final Creator CREATOR = new pqg();
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;

    public piz(long j, String str, long j2, boolean z, String[] strArr, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, 7, this.f);
        qov.a(parcel, i);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof piz) {
            piz piz = (piz) obj;
            return ppj.a(this.b, piz.b) && this.a == piz.a && this.c == piz.c && this.d == piz.d && Arrays.equals(this.e, piz.e) && this.f == piz.f;
        }
    }

    public static piz a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String str = "id";
            if (jSONObject.has(str)) {
                String str2 = "position";
                if (jSONObject.has(str2)) {
                    try {
                        String[] strArr;
                        String string = jSONObject.getString(str);
                        double d = (double) jSONObject.getLong(str2);
                        Double.isNaN(d);
                        long j = (long) (d * 1000.0d);
                        boolean optBoolean = jSONObject.optBoolean("isWatched");
                        double optLong = (double) jSONObject.optLong("duration");
                        Double.isNaN(optLong);
                        long j2 = (long) (optLong * 1000.0d);
                        JSONArray optJSONArray = jSONObject.optJSONArray("breakClipIds");
                        if (optJSONArray != null) {
                            String[] strArr2 = new String[optJSONArray.length()];
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                strArr2[i] = optJSONArray.getString(i);
                            }
                            strArr = strArr2;
                        } else {
                            strArr = null;
                        }
                        return new piz(j, string, j2, optBoolean, strArr, jSONObject.optBoolean("isEmbedded"));
                    } catch (JSONException e) {
                        String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", new Object[]{e.getMessage()});
                    }
                }
            }
        }
        return null;
    }
}
