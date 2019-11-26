package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pkn */
public final class pkn extends qou {
    public static final Creator CREATOR = new pqt();
    private final int a;
    private final int b;
    private final int c;

    pkn(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.b(parcel, 4, this.c);
        qov.a(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pkn) {
            pkn pkn = (pkn) obj;
            if (this.b == pkn.b && this.a == pkn.a && this.c == pkn.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    static pkn a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int i;
                String string = jSONObject.getString("hdrType");
                int hashCode = string.hashCode();
                int i2 = -1;
                if (hashCode != 3218) {
                    if (hashCode != 103158) {
                        if (hashCode != 113729) {
                            if (hashCode == 99136405) {
                                if (string.equals("hdr10")) {
                                    i2 = 1;
                                }
                            }
                        } else if (string.equals("sdr")) {
                            i2 = 3;
                        }
                    } else if (string.equals("hdr")) {
                        i2 = 2;
                    }
                } else if (string.equals("dv")) {
                    i2 = 0;
                }
                if (i2 == 0) {
                    i = 3;
                } else if (i2 == 1) {
                    i = 2;
                } else if (i2 == 2) {
                    i = 4;
                } else if (i2 != 3) {
                    String.format(Locale.ROOT, "Unknown HDR type: %s", new Object[]{string});
                    i = 0;
                } else {
                    i = 1;
                }
                return new pkn(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
            } catch (JSONException e) {
                String.format(Locale.ROOT, "Error while creating a VideoInfo instance from JSON: %s", new Object[]{e.getMessage()});
            }
        }
        return null;
    }
}
