package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.Display.HdrCapabilities;
import android.view.WindowManager;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

/* renamed from: afjc */
public final class afjc extends Observable implements afhe, afhw {
    public final Resources a;
    public final SharedPreferences b;
    public final boolean c;
    public final zzl d;
    public boolean e;
    public boolean f;
    private final Context g;

    public afjc(Context context, SharedPreferences sharedPreferences, boolean z, zzl zzl) {
        this.g = (Context) amqw.a((Object) context);
        this.a = context.getResources();
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.c = z;
        this.d = (zzl) amqw.a((Object) zzl);
    }

    public final int a(xhv xhv) {
        xhv.getClass();
        return a(new afjf(xhv));
    }

    public final int a(int i) {
        return a(new afje(i));
    }

    private final int a(amro amro) {
        afib afib = new afib(this.a, this.b);
        SharedPreferences sharedPreferences = afib.b;
        String str = aefi.LIMIT_MOBILE_DATA_USAGE;
        String string = sharedPreferences.contains(str) ? afib.b.getBoolean(str, false) ? afib.a.getString(R.string.pref_max_mobile_video_quality_value_480p) : afib.a.getString(R.string.pref_max_mobile_video_quality_value_auto) : afib.a.getString(R.string.pref_max_mobile_video_quality_value_auto);
        int i = 360;
        if (string.equals(this.a.getString(R.string.pref_max_mobile_video_quality_value_datasaver))) {
            int intValue = ((Integer) amro.get()).intValue();
            if (intValue == 4) {
                return 144;
            }
            if (intValue == 5) {
                return 240;
            }
            if (intValue == 6) {
                return 360;
            }
        }
        if (string.equals(this.a.getString(R.string.pref_max_mobile_video_quality_value_144p))) {
            i = 144;
        } else if (string.equals(this.a.getString(R.string.pref_max_mobile_video_quality_value_240p))) {
            i = 240;
        } else if (!string.equals(this.a.getString(R.string.pref_max_mobile_video_quality_value_360p))) {
            if (string.equals(this.a.getString(R.string.pref_max_mobile_video_quality_value_480p))) {
                i = 480;
            } else if (string.equals(this.a.getString(R.string.pref_max_mobile_video_quality_value_720p))) {
                i = 720;
            } else if (string.equals(this.a.getString(R.string.pref_max_mobile_video_quality_value_1080p))) {
                return 1080;
            }
        }
        return i;
        i = Integer.MAX_VALUE;
        return i;
    }

    public final boolean a(Set set) {
        return a("h264_main_profile_supported", "video/avc", false, set, Collections.emptySet(), 0);
    }

    public final boolean a(Set set, Set set2) {
        return a("vp9_supported", "video/x-vnd.on2.vp9", false, set, set2, 0);
    }

    public final boolean b(Set set, Set set2) {
        return a("vp9_secure_supported", "video/x-vnd.on2.vp9", true, set, set2, 0);
    }

    public final boolean c(Set set, Set set2) {
        return a("vp9_profile_2_supported", "video/x-vnd.on2.vp9", false, set, set2, 4096);
    }

    public final boolean b(Set set) {
        return a("opus_supported", "audio/opus", false, set, Collections.emptySet(), 0);
    }

    public final arhk a() {
        arvt b = this.d.b();
        if (b == null) {
            return arhk.z;
        }
        auuo auuo = b.k;
        if (auuo == null) {
            auuo = auuo.k;
        }
        arhk arhk = auuo.g;
        if (arhk == null) {
            arhk = arhk.z;
        }
        return arhk;
    }

    public final int b() {
        if (xsl.a == 0) {
            xsl.a = xuy.a();
        }
        return Math.max(xsl.a + a().o, 1);
    }

    public final int c() {
        return a().q;
    }

    public final int d() {
        return a().r;
    }

    public final boolean e() {
        return a().p;
    }

    public final int f() {
        return a().h;
    }

    public final boolean g() {
        return a().m;
    }

    public final boolean h() {
        return a().n;
    }

    public final boolean i() {
        arvt b = this.d.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            aorz aorz = auuo.i;
            if (aorz == null) {
                aorz = aorz.j;
            }
            int a = argp.a(aorz.c);
            if (a != 0 && a == 4) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        arvt b = this.d.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            aorz aorz = auuo.i;
            if (aorz == null) {
                aorz = aorz.j;
            }
            if (aorz.e) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.c && this.b.getBoolean("medialib_diagnostics_enabled", false)) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (k() && this.b.getBoolean("medialib_diagnostic_cycling_format_evaluator_enabled", false)) {
            return true;
        }
        return false;
    }

    public final aajm m() {
        return (aajm) a("video_diagnostic_mode", aajm.class, aajm.DEFAULT, this.c ^ 1);
    }

    public final boolean n() {
        if (k() && this.b.getBoolean("medialib_diagnostic_no_maximum_video_quality", false)) {
            return true;
        }
        return false;
    }

    public final afjh b(int i) {
        String stringBuilder;
        if (i != 0) {
            StringBuilder stringBuilder2 = new StringBuilder(12);
            stringBuilder2.append(i);
            stringBuilder2.append("_");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        return new afjh(this.b, stringBuilder);
    }

    public final void a(int i, int i2, int i3, int i4, long j, String str) {
        Editor edit = this.b.edit();
        String str2 = "last_manual_quality_selection_cpn";
        if (TextUtils.equals(str, null)) {
            edit.remove(str2);
        } else {
            edit.putString(str2, str);
        }
        str = "last_manual_video_quality_selection_max";
        str2 = "last_manual_video_quality_selection_min";
        String str3 = "last_manual_video_quality_selection_timestamp";
        edit.putInt(str, i2).putInt(str2, i3).putInt("last_manual_video_quality_selection_direction", i4).putLong(str3, j);
        if (i != 0) {
            String str4;
            StringBuilder stringBuilder = new StringBuilder(12);
            stringBuilder.append(i);
            stringBuilder.append("_");
            String stringBuilder2 = stringBuilder.toString();
            String valueOf = String.valueOf(stringBuilder2);
            if (str.length() == 0) {
                str = new String(valueOf);
            } else {
                str = valueOf.concat(str);
            }
            Editor putInt = edit.putInt(str, i2);
            valueOf = String.valueOf(stringBuilder2);
            if (str2.length() == 0) {
                str = new String(valueOf);
            } else {
                str = valueOf.concat(str2);
            }
            putInt = putInt.putInt(str, i3);
            stringBuilder2 = String.valueOf(stringBuilder2);
            if (str3.length() == 0) {
                str4 = new String(stringBuilder2);
            } else {
                str4 = stringBuilder2.concat(str3);
            }
            putInt.putLong(str4, j);
        }
        edit.apply();
    }

    public final boolean o() {
        return this.f ^ 1;
    }

    public final Enum a(String str, Class cls, Enum enumR, boolean z) {
        if (!z) {
            try {
                return Enum.valueOf(cls, this.b.getString(str, enumR.name()));
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
        }
        return enumR;
    }

    public final void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            setChanged();
            notifyObservers(Integer.valueOf(2));
        }
    }

    public final synchronized long a(long j) {
        long j2;
        j2 = this.b.getLong("exo_cache_size_bytes_used", -1);
        this.b.edit().putLong("exo_cache_size_bytes_used", j).apply();
        return j2;
    }

    private final boolean a(String str, String str2, boolean z, Set set, Set set2, int i) {
        String str3 = str;
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(VERSION.RELEASE);
        r3 = new Set[2];
        boolean z2 = false;
        r3[0] = set;
        r3[1] = set2;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            for (String hashCode : r3[i3]) {
                int hashCode2 = hashCode.hashCode();
                Integer valueOf = Integer.valueOf(hashCode2);
                if (!hashSet.contains(valueOf)) {
                    i2 ^= hashCode2;
                    hashSet.add(valueOf);
                }
            }
        }
        if (i2 != 0) {
            stringBuilder.append("_");
            stringBuilder.append(i2);
        }
        String stringBuilder2 = stringBuilder.toString();
        if (this.b.contains(stringBuilder2)) {
            return this.b.getBoolean(stringBuilder2, false);
        }
        try {
            if (afjk.a(str2, z, set, set2, i) != null) {
                z2 = true;
            }
            this.b.edit().putBoolean(stringBuilder2, z2).apply();
        } catch (nmq unused) {
        }
        return z2;
    }

    public final boolean c(int i) {
        WindowManager windowManager = (WindowManager) this.g.getSystemService("window");
        if (windowManager == null || VERSION.SDK_INT < 24) {
            return false;
        }
        HdrCapabilities hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities();
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 16) {
                i = 2;
            } else if (i2 != 18) {
                return false;
            } else {
                i = 3;
            }
            if (hdrCapabilities != null) {
                for (int i3 : hdrCapabilities.getSupportedHdrTypes()) {
                    if (i3 == i) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw null;
    }
}
