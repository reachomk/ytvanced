package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.SparseArray;

/* renamed from: afna */
public final class afna implements afmh {
    private final SharedPreferences a;
    private final SparseArray b;
    private final afms c;

    public afna(Context context, afms afms, SharedPreferences sharedPreferences, SparseArray sparseArray) {
        amqw.a((Object) context);
        this.c = (afms) amqw.a((Object) afms);
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = (SparseArray) amqw.a((Object) sparseArray);
        String str = "ApiaryHostSelection";
        if (sharedPreferences.contains(str)) {
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public final String e() {
        return "deviceregistration/v1/devices";
    }

    public final String h() {
        return "youtubei/v1";
    }

    public final Uri d() {
        afmt afmt = afmt.PRODUCTION;
        if (afmt.RELEASE.equals(afmt) || afmt.CAMI.equals(afmt)) {
            return afmt.PRODUCTION.a(this.a);
        }
        return afmt.a(this.a);
    }

    public final Uri f() {
        return afmt.PRODUCTION.a(this.a);
    }

    public final Uri g() {
        return afmt.PRODUCTION.a(this.a);
    }

    public final boolean a() {
        return this.c.a();
    }

    public final boolean b() {
        return this.c.b();
    }

    public final boolean c() {
        return this.c.c();
    }

    public final byte[] i() {
        int ordinal = afmt.PRODUCTION.ordinal();
        if (ordinal != 3) {
            return ordinal != 6 ? (byte[]) this.b.get(0) : null;
        } else {
            return (byte[]) this.b.get(1);
        }
    }
}
