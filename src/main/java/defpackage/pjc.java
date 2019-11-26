package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pjc */
public final class pjc extends qou {
    public static final Creator CREATOR = new pqs();
    private final long a;
    private final long b;
    private final String c;
    private final String d;
    private final long e;

    pjc(long j, long j2, String str, String str2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjc) {
            pjc pjc = (pjc) obj;
            return this.a == pjc.a && this.b == pjc.b && ppj.a(this.c, pjc.c) && ppj.a(this.d, pjc.d) && this.e == pjc.e;
        }
    }

    static pjc a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        pjc pjc = null;
        if (jSONObject2 != null) {
            String str = "currentBreakTime";
            if (jSONObject2.has(str)) {
                String str2 = "currentBreakClipTime";
                if (jSONObject2.has(str2)) {
                    try {
                        long j;
                        double d = (double) jSONObject2.getLong(str);
                        Double.isNaN(d);
                        long j2 = (long) (d * 1000.0d);
                        double d2 = (double) jSONObject2.getLong(str2);
                        Double.isNaN(d2);
                        long j3 = (long) (d2 * 1000.0d);
                        String optString = jSONObject2.optString("breakId", null);
                        String optString2 = jSONObject2.optString("breakClipId", null);
                        long optLong = jSONObject2.optLong("whenSkippable", -1);
                        if (optLong != -1) {
                            double d3 = (double) optLong;
                            Double.isNaN(d3);
                            j = (long) (d3 * 1000.0d);
                        } else {
                            j = optLong;
                        }
                        return new pjc(j2, j3, optString, optString2, j);
                    } catch (JSONException e) {
                        String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[]{e.getMessage()});
                        pjc = null;
                    }
                }
            }
        }
        return pjc;
    }
}
