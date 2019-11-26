package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.piz;
import defpackage.pja;
import defpackage.pjw;
import defpackage.pkl;
import defpackage.ppj;
import defpackage.ppx;
import defpackage.qbg;
import defpackage.qoj;
import defpackage.qou;
import defpackage.qov;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaInfo extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new ppx();
    public final String a;
    public int b;
    public String c;
    public pjw d;
    public long e;
    public List f;
    public pkl g;
    public List h;
    public List i;
    public String j;
    public JSONObject k;
    private String l;

    public MediaInfo(String str, int i, String str2, pjw pjw, long j, List list, pkl pkl, String str3, List list2, List list3, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = pjw;
        this.e = j;
        this.f = list;
        this.g = pkl;
        this.l = str3;
        str = this.l;
        if (str != null) {
            try {
                this.k = new JSONObject(str);
            } catch (JSONException unused) {
                this.k = null;
                this.l = null;
            }
        } else {
            this.k = null;
        }
        this.h = list2;
        this.i = list3;
        this.j = str4;
    }

    public MediaInfo(String str) {
        this(str, -1, null, null, -1, null, null, null, null, null, null);
        if (str == null) {
            throw new IllegalArgumentException("contentID cannot be null");
        }
    }

    public MediaInfo(JSONObject jSONObject) {
        JSONObject jSONObject2;
        int i;
        JSONObject jSONObject3 = jSONObject;
        this(jSONObject3.getString("contentId"), -1, null, null, -1, null, null, null, null, null, null);
        String string = jSONObject3.getString("streamType");
        String str = "NONE";
        if (str.equals(string)) {
            this.b = 0;
        } else if ("BUFFERED".equals(string)) {
            this.b = 1;
        } else if ("LIVE".equals(string)) {
            this.b = 2;
        } else {
            this.b = -1;
        }
        this.c = jSONObject3.optString("contentType", null);
        String str2 = "metadata";
        if (jSONObject3.has(str2)) {
            jSONObject2 = jSONObject3.getJSONObject(str2);
            String str3 = "metadataType";
            this.d = new pjw(jSONObject2.getInt(str3));
            pjw pjw = this.d;
            pjw.b.clear();
            pjw.a.clear();
            pjw.c = 0;
            try {
                pjw.c = jSONObject2.getInt(str3);
            } catch (JSONException unused) {
            }
            qoj.a(pjw.a, jSONObject2);
            i = pjw.c;
            String str4 = "com.google.android.gms.cast.metadata.RELEASE_DATE";
            String str5 = "com.google.android.gms.cast.metadata.ARTIST";
            String str6 = "com.google.android.gms.cast.metadata.TITLE";
            if (i == 0) {
                pjw.b(jSONObject2, str6, str5, "com.google.android.gms.cast.metadata.SUBTITLE", str4);
            } else if (i == 1) {
                pjw.b(jSONObject2, str6, "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", str4);
            } else if (i == 2) {
                pjw.b(jSONObject2, str6, "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
            } else if (i == 3) {
                pjw.b(jSONObject2, str6, "com.google.android.gms.cast.metadata.ALBUM_TITLE", str5, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", str4);
            } else if (i != 4) {
                pjw.b(jSONObject2, new String[0]);
            } else {
                pjw.b(jSONObject2, str6, str5, "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
            }
        }
        this.e = -1;
        str2 = "duration";
        if (jSONObject3.has(str2) && !jSONObject3.isNull(str2)) {
            double optDouble = jSONObject3.optDouble(str2, 0.0d);
            if (!(Double.isNaN(optDouble) || Double.isInfinite(optDouble))) {
                this.e = (long) (optDouble * 1000.0d);
            }
        }
        if (jSONObject3.has("tracks")) {
            this.f = new ArrayList();
            JSONArray jSONArray = jSONObject3.getJSONArray("tracks");
            for (i = 0; i < jSONArray.length(); i++) {
                this.f.add(new MediaTrack(jSONArray.getJSONObject(i)));
            }
        } else {
            this.f = null;
        }
        if (jSONObject3.has("textTrackStyle")) {
            String string2;
            jSONObject2 = jSONObject3.getJSONObject("textTrackStyle");
            pkl pkl = new pkl();
            pkl.a = (float) jSONObject2.optDouble("fontScale", 1.0d);
            pkl.b = pkl.a(jSONObject2.optString("foregroundColor"));
            pkl.c = pkl.a(jSONObject2.optString("backgroundColor"));
            if (jSONObject2.has("edgeType")) {
                string2 = jSONObject2.getString("edgeType");
                if (str.equals(string2)) {
                    pkl.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    pkl.d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    pkl.d = 2;
                } else if ("RAISED".equals(string2)) {
                    pkl.d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    pkl.d = 4;
                }
            }
            pkl.e = pkl.a(jSONObject2.optString("edgeColor"));
            if (jSONObject2.has("windowType")) {
                string2 = jSONObject2.getString("windowType");
                if (str.equals(string2)) {
                    pkl.f = 0;
                } else if ("NORMAL".equals(string2)) {
                    pkl.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string2)) {
                    pkl.f = 2;
                }
            }
            pkl.g = pkl.a(jSONObject2.optString("windowColor"));
            if (pkl.f == 2) {
                pkl.h = jSONObject2.optInt("windowRoundedCornerRadius", 0);
            }
            pkl.i = jSONObject2.optString("fontFamily", null);
            if (jSONObject2.has("fontGenericFamily")) {
                string = jSONObject2.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string)) {
                    pkl.j = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string)) {
                    pkl.j = 1;
                } else if ("SERIF".equals(string)) {
                    pkl.j = 2;
                } else if ("MONOSPACED_SERIF".equals(string)) {
                    pkl.j = 3;
                } else if ("CASUAL".equals(string)) {
                    pkl.j = 4;
                } else if ("CURSIVE".equals(string)) {
                    pkl.j = 5;
                } else if ("SMALL_CAPITALS".equals(string)) {
                    pkl.j = 6;
                }
            }
            if (jSONObject2.has("fontStyle")) {
                string = jSONObject2.getString("fontStyle");
                if ("NORMAL".equals(string)) {
                    pkl.k = 0;
                } else if ("BOLD".equals(string)) {
                    pkl.k = 1;
                } else if ("ITALIC".equals(string)) {
                    pkl.k = 2;
                } else if ("BOLD_ITALIC".equals(string)) {
                    pkl.k = 3;
                }
            }
            pkl.l = jSONObject2.optJSONObject("customData");
            this.g = pkl;
        } else {
            this.g = null;
        }
        a(jSONObject);
        this.k = jSONObject3.optJSONObject("customData");
        if (jSONObject3.has("entity")) {
            this.j = jSONObject3.getString("entity");
        }
    }

    public final void a(JSONObject jSONObject) {
        String str = "breaks";
        int i = 0;
        if (jSONObject.has(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            this.h = new ArrayList(jSONArray.length());
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                piz a = piz.a(jSONArray.getJSONObject(i2));
                if (a == null) {
                    this.h.clear();
                    break;
                } else {
                    this.h.add(a);
                    i2++;
                }
            }
        }
        str = "breakClips";
        if (jSONObject.has(str)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(str);
            this.i = new ArrayList(jSONArray2.length());
            while (i < jSONArray2.length()) {
                pja a2 = pja.a(jSONArray2.getJSONObject(i));
                if (a2 != null) {
                    this.i.add(a2);
                    i++;
                } else {
                    this.i.clear();
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaInfo) {
            MediaInfo mediaInfo = (MediaInfo) obj;
            JSONObject jSONObject = this.k;
            Object obj2 = jSONObject != null ? null : 1;
            JSONObject jSONObject2 = mediaInfo.k;
            return obj2 == (jSONObject2 != null ? null : 1) && ((jSONObject == null || jSONObject2 == null || qbg.a(jSONObject, jSONObject2)) && ppj.a(this.a, mediaInfo.a) && this.b == mediaInfo.b && ppj.a(this.c, mediaInfo.c) && ppj.a(this.d, mediaInfo.d) && this.e == mediaInfo.e && ppj.a(this.f, mediaInfo.f) && ppj.a(this.g, mediaInfo.g) && ppj.a(this.h, mediaInfo.h) && ppj.a(this.i, mediaInfo.i) && ppj.a(this.j, mediaInfo.j));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.k), this.f, this.g, this.h, this.i, this.j});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.k;
        List list = null;
        this.l = jSONObject != null ? jSONObject.toString() : null;
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d, i);
        qov.a(parcel, 6, this.e);
        qov.b(parcel, 7, this.f);
        qov.a(parcel, 8, this.g, i);
        qov.a(parcel, 9, this.l);
        List list2 = this.h;
        qov.b(parcel, 10, list2 != null ? Collections.unmodifiableList(list2) : null);
        list2 = this.i;
        if (list2 != null) {
            list = Collections.unmodifiableList(list2);
        }
        qov.b(parcel, 11, list);
        qov.a(parcel, 12, this.j);
        qov.a(parcel, a);
    }
}
