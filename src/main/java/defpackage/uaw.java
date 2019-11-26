package defpackage;

import android.content.Context;
import java.util.HashMap;

/* renamed from: uaw */
public final class uaw implements tzu {
    private final Context a;

    public uaw(Context context) {
        this.a = context;
    }

    public final /* synthetic */ Object a() {
        String str = "enable_primes_for_primes";
        String str2 = "enable_persist_crash_stats";
        String str3 = "enable_url_auto_sanitization";
        String str4 = "enable_startup_trace";
        String str5 = "enable_magic_eye_log";
        String str6 = "enable_leak_detection_v2";
        String str7 = "enable_leak_detection";
        String str8 = "PrimesFlagsFeature__";
        String str9 = "primes-ph";
        String str10 = "disable_memory_summary_metrics";
        tyv.c("PrimesTesting", "GserviceFlagsSupplier.get()", new Object[0]);
        Context context = this.a;
        tyi a = tyi.a().a();
        ueg a2 = new ueg(str9).b(str8).a(String.format("primes:%s:", new Object[]{context.getPackageName()})).a();
        ueg a3 = new ueg(str9).b(str8).a("primes:").a();
        uat[] uatArr = new uat[]{new uat(str7, a.a), new uat(str6, a.b), new uat(str5, a.d), new uat(str4, a.f), new uat(str3, a.g), new uat(str2, a.e), new uat(str, a.h)};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 7; i++) {
            uat uat = uatArr[i];
            String str11 = uat.a;
            hashMap.put(str11, uee.a(a2, str11, uat.b));
        }
        hashMap.put(str10, uee.a(a3, str10, false));
        uee.b(context);
        Boolean bool = (Boolean) ((uee) hashMap.get(str6)).c();
        Boolean bool2 = (Boolean) ((uee) hashMap.get(str10)).c();
        Boolean bool3 = (Boolean) ((uee) hashMap.get(str7)).c();
        Boolean bool4 = (Boolean) ((uee) hashMap.get(str5)).c();
        Boolean bool5 = (Boolean) ((uee) hashMap.get(str2)).c();
        Boolean bool6 = (Boolean) ((uee) hashMap.get(str4)).c();
        Boolean bool7 = (Boolean) ((uee) hashMap.get(str3)).c();
        Boolean bool8 = (Boolean) ((uee) hashMap.get(str)).c();
        tyh a4 = tyi.a();
        a4.a = bool3.booleanValue();
        a4.b = bool.booleanValue();
        a4.c = bool2.booleanValue();
        a4.d = bool4.booleanValue();
        a4.e = bool5.booleanValue();
        a4.f = bool6.booleanValue();
        a4.g = bool7.booleanValue();
        a4.h = bool8.booleanValue();
        return a4.a();
    }
}
