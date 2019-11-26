package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pja */
public final class pja extends qou {
    public static final Creator CREATOR = new ppq();
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final pkk k;
    public JSONObject l;
    private String m;

    pja(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, pkk pkk) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.m = str6;
        this.g = str7;
        this.h = str8;
        this.i = j2;
        this.j = str9;
        this.k = pkk;
        if (TextUtils.isEmpty(this.m)) {
            this.l = new JSONObject();
            return;
        }
        try {
            this.l = new JSONObject(str6);
        } catch (JSONException e) {
            Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", new Object[]{e.getMessage()}));
            this.m = null;
            this.l = new JSONObject();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, 7, this.f);
        qov.a(parcel, 8, this.m);
        qov.a(parcel, 9, this.g);
        qov.a(parcel, 10, this.h);
        qov.a(parcel, 11, this.i);
        qov.a(parcel, 12, this.j);
        qov.a(parcel, 13, this.k, i);
        qov.a(parcel, a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.m, this.g, this.h, Long.valueOf(this.i), this.j, this.k});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pja) {
            pja pja = (pja) obj;
            return ppj.a(this.a, pja.a) && ppj.a(this.b, pja.b) && this.c == pja.c && ppj.a(this.d, pja.d) && ppj.a(this.e, pja.e) && ppj.a(this.f, pja.f) && ppj.a(this.m, pja.m) && ppj.a(this.g, pja.g) && ppj.a(this.h, pja.h) && this.i == pja.i && ppj.a(this.j, pja.j) && ppj.a(this.k, pja.k);
        }
    }

    public static pja a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "whenSkippable";
        if (jSONObject2 == null) {
            return null;
        }
        String str2 = "id";
        if (!jSONObject2.has(str2)) {
            return null;
        }
        try {
            long j;
            long j2;
            String string = jSONObject2.getString(str2);
            double optLong = (double) jSONObject2.optLong("duration");
            Double.isNaN(optLong);
            long j3 = (long) (optLong * 1000.0d);
            String optString = jSONObject2.optString("clickThroughUrl", null);
            String optString2 = jSONObject2.optString("contentUrl", null);
            String optString3 = jSONObject2.optString("mimeType", null);
            if (optString3 == null) {
                optString3 = jSONObject2.optString("contentType", null);
            }
            String str3 = optString3;
            String optString4 = jSONObject2.optString("title", null);
            JSONObject optJSONObject = jSONObject2.optJSONObject("customData");
            String optString5 = jSONObject2.optString("contentId", null);
            String optString6 = jSONObject2.optString("posterUrl", null);
            if (jSONObject2.has(str)) {
                j = j3;
                double intValue = (double) ((Integer) jSONObject2.get(str)).intValue();
                Double.isNaN(intValue);
                j2 = (long) (intValue * 1000.0d);
            } else {
                j = j3;
                j2 = -1;
            }
            String optString7 = jSONObject2.optString("hlsSegmentFormat", null);
            pkk a = pkk.a(jSONObject2.optJSONObject("vastAdsRequest"));
            String jSONObject3 = (optJSONObject == null || optJSONObject.length() == 0) ? null : optJSONObject.toString();
            return new pja(string, optString4, j, optString2, str3, optString, jSONObject3, optString5, optString6, j2, optString7, a);
        } catch (JSONException e) {
            String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", new Object[]{e.getMessage()});
            return null;
        }
    }
}
