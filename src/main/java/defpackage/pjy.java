package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pjy */
public final class pjy extends qou {
    public static final Creator CREATOR = new ppz();
    public MediaInfo a;
    public int b;
    public double c;
    public double d;
    public double e;
    private boolean f;
    private long[] g;
    private String h;
    private JSONObject i;

    pjy(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.a = mediaInfo;
        this.b = i;
        this.f = z;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.g = jArr;
        this.h = str;
        String str2 = this.h;
        if (str2 != null) {
            try {
                this.i = new JSONObject(str2);
                return;
            } catch (JSONException unused) {
                this.i = null;
                this.h = null;
                return;
            }
        }
        this.i = null;
    }

    pjy(JSONObject jSONObject) {
        this(null, 0, true, 0.0d, Double.POSITIVE_INFINITY, 0.0d, null, null);
        a(jSONObject);
    }

    public final boolean a(JSONObject jSONObject) {
        boolean z;
        int i;
        double d;
        long[] jArr;
        String str = "media";
        Object obj = null;
        if (jSONObject.has(str)) {
            this.a = new MediaInfo(jSONObject.getJSONObject(str));
            z = true;
        } else {
            z = false;
        }
        String str2 = "itemId";
        if (jSONObject.has(str2)) {
            i = jSONObject.getInt(str2);
            if (this.b != i) {
                this.b = i;
                z = true;
            }
        }
        str2 = "autoplay";
        if (jSONObject.has(str2)) {
            boolean z2 = jSONObject.getBoolean(str2);
            if (this.f != z2) {
                this.f = z2;
                z = true;
            }
        }
        str2 = "startTime";
        if (jSONObject.has(str2)) {
            d = jSONObject.getDouble(str2);
            if (Math.abs(d - this.c) > 1.0E-7d) {
                this.c = d;
                z = true;
            }
        }
        str2 = "playbackDuration";
        if (jSONObject.has(str2)) {
            d = jSONObject.getDouble(str2);
            if (Math.abs(d - this.d) > 1.0E-7d) {
                this.d = d;
                z = true;
            }
        }
        str2 = "preloadTime";
        if (jSONObject.has(str2)) {
            d = jSONObject.getDouble(str2);
            if (Math.abs(d - this.e) > 1.0E-7d) {
                this.e = d;
                z = true;
            }
        }
        str2 = "activeTrackIds";
        if (jSONObject.has(str2)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str2);
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.g;
            if (jArr2 != null && jArr2.length == length) {
                i = 0;
                while (i < length) {
                    if (this.g[i] == jArr[i]) {
                        i++;
                    }
                }
            }
            obj = 1;
            break;
        }
        jArr = null;
        if (obj != null) {
            this.g = jArr;
            z = true;
        }
        str2 = "customData";
        if (!jSONObject.has(str2)) {
            return z;
        }
        this.i = jSONObject.getJSONObject(str2);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjy) {
            pjy pjy = (pjy) obj;
            JSONObject jSONObject = this.i;
            Object obj2 = jSONObject != null ? null : 1;
            JSONObject jSONObject2 = pjy.i;
            return obj2 == (jSONObject2 != null ? null : 1) && ((jSONObject == null || jSONObject2 == null || qbg.a(jSONObject, jSONObject2)) && ppj.a(this.a, pjy.a) && this.b == pjy.b && this.f == pjy.f && this.c == pjy.c && this.d == pjy.d && this.e == pjy.e && Arrays.equals(this.g, pjy.g));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.f), Double.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.g)), String.valueOf(this.i)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject != null ? jSONObject.toString() : null;
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a, i);
        qov.b(parcel, 3, this.b);
        qov.a(parcel, 4, this.f);
        qov.a(parcel, 5, this.c);
        qov.a(parcel, 6, this.d);
        qov.a(parcel, 7, this.e);
        qov.a(parcel, 8, this.g);
        qov.a(parcel, 9, this.h);
        qov.a(parcel, a);
    }
}
