package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pyb */
public final class pyb extends qou {
    public static final Creator CREATOR = new pya();
    public final Uri a;
    public final int b;
    public final int c;
    private final int d;

    pyb(int i, Uri uri, int i2, int i3) {
        this.d = i;
        this.a = uri;
        this.b = i2;
        this.c = i3;
    }

    private pyb(Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public pyb(Uri uri) {
        this(uri, 0, 0);
    }

    public pyb(JSONObject jSONObject) {
        String str = "url";
        Uri uri = null;
        if (jSONObject.has(str)) {
            try {
                uri = Uri.parse(jSONObject.getString(str));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a.toString()});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof pyb)) {
            pyb pyb = (pyb) obj;
            return pzj.a(this.a, pyb.a) && this.b == pyb.b && this.c == pyb.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.d);
        qov.a(parcel, 2, this.a, i);
        qov.b(parcel, 3, this.b);
        qov.b(parcel, 4, this.c);
        qov.a(parcel, a);
    }
}
