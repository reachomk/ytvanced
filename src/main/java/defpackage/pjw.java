package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pjw */
public final class pjw extends qou {
    public static final Creator CREATOR = new ppw();
    private static final String[] d = new String[]{null, "String", "int", "double", "ISO-8601 date String"};
    private static final pjv e;
    public final List a;
    public final Bundle b;
    public int c;

    pjw(List list, Bundle bundle, int i) {
        this.a = list;
        this.b = bundle;
        this.c = i;
    }

    public pjw() {
        this(0);
    }

    public pjw(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public final void a(String str, String str2) {
        pjw.b(str, 1);
        this.b.putString(str, str2);
    }

    public final String a(String str) {
        pjw.b(str, 1);
        return this.b.getString(str);
    }

    public final void a(String str, int i) {
        pjw.b(str, 2);
        this.b.putInt(str, i);
    }

    public final int b(String str) {
        pjw.b(str, 2);
        return this.b.getInt(str);
    }

    public static void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int b = e.b(str);
        if (b != i && b != 0) {
            Object obj = d[i];
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(obj).length());
            stringBuilder.append("Value for ");
            stringBuilder.append(str);
            stringBuilder.append(" must be a ");
            stringBuilder.append(obj);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final void a(JSONObject jSONObject, String... strArr) {
        try {
            for (String str : strArr) {
                if (this.b.containsKey(str)) {
                    int b = e.b(str);
                    if (b != 1) {
                        if (b == 2) {
                            jSONObject.put(e.a(str), this.b.getInt(str));
                        } else if (b == 3) {
                            jSONObject.put(e.a(str), this.b.getDouble(str));
                        } else if (b != 4) {
                        }
                    }
                    jSONObject.put(e.a(str), this.b.getString(str));
                }
            }
            for (String str2 : this.b.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj = this.b.get(str2);
                    if (obj instanceof String) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str2, obj);
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void b(JSONObject jSONObject, String... strArr) {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (!"metadataType".equals(str)) {
                    String str2 = (String) e.a.get(str);
                    if (str2 == null) {
                        Object obj = jSONObject.get(str);
                        if (obj instanceof String) {
                            this.b.putString(str, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.b.putInt(str, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.b.putDouble(str, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str2)) {
                        try {
                            Object obj2 = jSONObject.get(str);
                            if (obj2 != null) {
                                int b = e.b(str2);
                                if (b != 1) {
                                    if (b != 2) {
                                        if (b != 3) {
                                            if (b == 4) {
                                                if (obj2 instanceof String) {
                                                    str = (String) obj2;
                                                    if (qoj.a(str) != null) {
                                                        this.b.putString(str2, str);
                                                    }
                                                }
                                            }
                                        } else if (obj2 instanceof Double) {
                                            this.b.putDouble(str2, ((Double) obj2).doubleValue());
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.b.putInt(str2, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.b.putString(str2, (String) obj2);
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        } catch (JSONException unused2) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjw) {
            pjw pjw = (pjw) obj;
            return a(this.b, pjw.b) && this.a.equals(pjw.a);
        }
    }

    public final int hashCode() {
        int i = 17;
        for (String str : this.b.keySet()) {
            i = (i * 31) + this.b.get(str).hashCode();
        }
        return (i * 31) + this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.b(parcel, 4, this.c);
        qov.a(parcel, i);
    }

    public final boolean a() {
        List list = this.a;
        return (list == null || list.isEmpty()) ? false : true;
    }

    private final boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj != null) {
                if (!obj.equals(obj2)) {
                    return false;
                }
            } else if (obj2 != null || !bundle2.containsKey(str)) {
                return false;
            }
        }
        return true;
    }

    static {
        pjv pjv = new pjv();
        pjv.a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        pjv.a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        pjv.a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        pjv.a("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        pjv.a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        pjv.a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        pjv.a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        pjv.a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        pjv.a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        pjv.a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        pjv.a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        pjv.a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        pjv.a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        pjv.a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        pjv.a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        pjv.a("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        pjv.a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        pjv.a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        pjv.a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        pjv.a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        e = pjv;
    }
}
