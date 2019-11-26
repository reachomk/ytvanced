package defpackage;

import android.os.Parcelable;

/* renamed from: ust */
public abstract class ust implements afpt, Parcelable {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract String f();

    public static ust a(String str, String str2, String str3) {
        return ust.a(str, str2, null, false, true, str3);
    }

    public static ust b(String str, String str2, String str3) {
        return ust.a(str, str2, str3, false, false, null);
    }

    public static ust a(String str, String str2, String str3, String str4) {
        return ust.a(str, str2, str3, false, false, str4);
    }

    public static ust a(String str, String str2, String str3, boolean z, String str4) {
        return ust.a(str, str2, str3, z, false, str4);
    }

    private static ust a(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        String str5 = "";
        return new utd(str, str2, str3 == null ? str5 : str3, z, z2, str4 == null ? str5 : str4);
    }

    public static ust a(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "PRIMORDIAL-";
        return ust.a(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), str, "", false, false, "");
    }

    public final boolean g() {
        return c().equals("") ^ 1;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
