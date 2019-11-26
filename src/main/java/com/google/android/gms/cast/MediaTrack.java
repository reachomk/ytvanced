package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ppj;
import defpackage.pqb;
import defpackage.qbg;
import defpackage.qou;
import defpackage.qov;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new pqb();
    public long a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public JSONObject h;
    private String i;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.i = str5;
        String str6 = this.i;
        if (str6 != null) {
            try {
                this.h = new JSONObject(str6);
                return;
            } catch (JSONException unused) {
                this.h = null;
                this.i = null;
                return;
            }
        }
        this.h = null;
    }

    MediaTrack(JSONObject jSONObject) {
        this(0, 0, null, null, null, null, -1, null);
        this.a = jSONObject.getLong("trackId");
        String string = jSONObject.getString("type");
        if ("TEXT".equals(string)) {
            this.b = 1;
        } else if ("AUDIO".equals(string)) {
            this.b = 2;
        } else if ("VIDEO".equals(string)) {
            this.b = 3;
        } else {
            string = String.valueOf(string);
            String str = "invalid type: ";
            throw new JSONException(string.length() == 0 ? new String(str) : str.concat(string));
        }
        this.c = jSONObject.optString("trackContentId", null);
        this.d = jSONObject.optString("trackContentType", null);
        this.e = jSONObject.optString("name", null);
        this.f = jSONObject.optString("language", null);
        string = "subtype";
        if (jSONObject.has(string)) {
            string = jSONObject.getString(string);
            if ("SUBTITLES".equals(string)) {
                this.g = 1;
            } else if ("CAPTIONS".equals(string)) {
                this.g = 2;
            } else if ("DESCRIPTIONS".equals(string)) {
                this.g = 3;
            } else if ("CHAPTERS".equals(string)) {
                this.g = 4;
            } else if ("METADATA".equals(string)) {
                this.g = 5;
            } else {
                this.g = -1;
            }
        } else {
            this.g = 0;
        }
        this.h = jSONObject.optJSONObject("customData");
    }

    public MediaTrack(long j, int i) {
        this(0, 0, null, null, null, null, -1, null);
        this.a = j;
        if (i <= 0 || i > 3) {
            StringBuilder stringBuilder = new StringBuilder(24);
            stringBuilder.append("invalid type ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaTrack) {
            MediaTrack mediaTrack = (MediaTrack) obj;
            JSONObject jSONObject = this.h;
            Object obj2 = jSONObject != null ? null : 1;
            JSONObject jSONObject2 = mediaTrack.h;
            return obj2 == (jSONObject2 != null ? null : 1) && ((jSONObject == null || jSONObject2 == null || qbg.a(jSONObject, jSONObject2)) && this.a == mediaTrack.a && this.b == mediaTrack.b && ppj.a(this.c, mediaTrack.c) && ppj.a(this.d, mediaTrack.d) && ppj.a(this.e, mediaTrack.e) && ppj.a(this.f, mediaTrack.f) && this.g == mediaTrack.g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g), String.valueOf(this.h)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.h;
        this.i = jSONObject != null ? jSONObject.toString() : null;
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, 7, this.f);
        qov.b(parcel, 8, this.g);
        qov.a(parcel, 9, this.i);
        qov.a(parcel, i);
    }
}
