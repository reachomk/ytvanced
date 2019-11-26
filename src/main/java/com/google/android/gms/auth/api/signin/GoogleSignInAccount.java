package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.pip;
import defpackage.pzr;
import defpackage.qou;
import defpackage.qov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new pip();
    private final int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Uri f;
    private String g;
    private long h;
    private String i;
    private List j;
    private String k;
    private String l;
    private Set m = new HashSet();

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Object hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), parse, null, Long.valueOf(parseLong).longValue(), pzr.a(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) pzr.a(hashSet)), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null));
        GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
        googleSignInAccount3.g = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount3;
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = list;
        this.k = str7;
        this.l = str8;
    }

    private final Set a() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.m);
        return hashSet;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.a(parcel, 6, this.f, i);
        qov.a(parcel, 7, this.g);
        qov.a(parcel, 8, this.h);
        qov.a(parcel, 9, this.i);
        qov.b(parcel, 10, this.j);
        qov.a(parcel, 11, this.k);
        qov.a(parcel, 12, this.l);
        qov.a(parcel, a);
    }

    public final int hashCode() {
        return ((this.i.hashCode() + 527) * 31) + a().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.i.equals(this.i) && googleSignInAccount.a().equals(a());
        }
    }
}
