package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: agxj */
public final class agxj {
    public static final long a = TimeUnit.HOURS.toMillis(1);

    public static void a(agpw agpw, int i) {
        agpw.a("transfer_type", i);
    }

    public static int a(agpw agpw) {
        return agpw.b("transfer_type", 0);
    }

    public static void a(agpw agpw, String str) {
        agpw.a("video_id", str);
    }

    public static String b(agpw agpw) {
        return agpw.b("video_id");
    }

    public static void b(agpw agpw, String str) {
        agpw.a("playlist_id", str);
    }

    public static String c(agpw agpw) {
        return agpw.b("playlist_id");
    }

    public static void c(agpw agpw, String str) {
        agpw.a("video_list_id", str);
    }

    public static String d(agpw agpw) {
        return agpw.b("video_list_id");
    }

    public static void b(agpw agpw, int i) {
        agpw.a("stream_quality", i);
    }

    public static int e(agpw agpw) {
        return agpw.b("stream_quality", 0);
    }

    public static void a(agpw agpw, byte[] bArr) {
        String str = "click_tracking_params";
        synchronized (agpw.a) {
            agpw.a.put(str, bArr);
        }
    }

    public static byte[] f(agpw agpw) {
        String str = "click_tracking_params";
        return agpw.a.containsKey(str) ? (byte[]) agpw.a.get(str) : null;
    }

    public static void a(agpw agpw, boolean z) {
        agpw.a("user_triggered", z);
    }

    public static boolean g(agpw agpw) {
        return agpw.b("user_triggered", true);
    }

    public static boolean h(agpw agpw) {
        return agpw.b("require_charging", false);
    }

    public static void b(agpw agpw, boolean z) {
        agpw.a("requireTimeWindow", z);
    }

    public static boolean i(agpw agpw) {
        return agpw.b("requireTimeWindow", false);
    }

    public static void c(agpw agpw, int i) {
        agpw.a("offlineSourceVeType", i);
    }

    public static int j(agpw agpw) {
        return agpw.b("offlineSourceVeType", -1);
    }

    public static void d(agpw agpw, int i) {
        boolean z = false;
        if (i >= 0 && i <= 100) {
            z = true;
        }
        amqw.a(z);
        agpw.a("requiredBatteryLevel", i);
    }

    public static int k(agpw agpw) {
        return agpw.b("requiredBatteryLevel", 0);
    }

    public static void d(agpw agpw, String str) {
        agpw.a("transfer_nonce", str);
    }

    public static String l(agpw agpw) {
        return agpw.b("transfer_nonce");
    }

    public static void e(agpw agpw, String str) {
        agpw.a("disco_session_nonce", str);
    }

    public static String m(agpw agpw) {
        return agpw.b("disco_session_nonce");
    }

    public static String n(agpw agpw) {
        return agpw.b("partial_playback_nonce");
    }

    public static void c(agpw agpw, boolean z) {
        agpw.a("triggered_by_refresh", z);
    }

    public static boolean o(agpw agpw) {
        return agpw.b("triggered_by_refresh", false);
    }

    public static void d(agpw agpw, boolean z) {
        agpw.a("is_sync", z);
    }

    public static boolean p(agpw agpw) {
        return agpw.b("is_sync", false);
    }

    public static boolean a(agqz agqz) {
        int a = agxj.a(agqz.f);
        return a == 1 || a == 4 || a == 7 || a == 6;
    }

    public static boolean a(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(xuq.a("offline_active_transfers_%s", str), true);
    }

    public static void a(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(xuq.a("offline_active_transfers_%s", str), z).apply();
    }

    public static void e(agpw agpw, int i) {
        agpw.a("retry_strategy", i);
    }

    public static int q(agpw agpw) {
        return agpw.b("retry_strategy", 1);
    }

    public static void a(agpw agpw, long j) {
        agpw.a("base_retry_milli_secs", j);
    }

    public static long r(agpw agpw) {
        return agpw.b("base_retry_milli_secs", 2000);
    }

    public static void b(agpw agpw, long j) {
        agpw.a("max_retry_milli_secs", j);
    }

    public static void f(agpw agpw, int i) {
        agpw.a("max_retries", i);
    }

    public static int s(agpw agpw) {
        return agpw.b("max_retries", 35);
    }

    public static void c(agpw agpw, long j) {
        agpw.a("transfer_added_time_millis", j);
    }

    public static long t(agpw agpw) {
        return agpw.a("transfer_added_time_millis");
    }

    public static void d(agpw agpw, long j) {
        agpw.a("cache_bytes_read", j);
    }

    public static long u(agpw agpw) {
        return agpw.a("cache_bytes_read");
    }

    public static void e(agpw agpw, long j) {
        agpw.a("storage_bytes_read", j);
    }

    public static long v(agpw agpw) {
        return agpw.a("storage_bytes_read");
    }

    public static void a(agpw agpw, agqf agqf) {
        agpw.a("running_media_status", agqf.p);
    }

    public static agqf w(agpw agpw) {
        return agqf.a(agpw.b("running_media_status", agqf.ACTIVE.p));
    }

    public static agqf x(agpw agpw) {
        return agqf.a(agpw.b("complete_media_status", agqf.COMPLETE.p));
    }

    public static void g(agpw agpw, int i) {
        agpw.a("offline_digest_store_level", i);
    }

    public static int y(agpw agpw) {
        return agpw.b("offline_digest_store_level", -1);
    }

    public static void e(agpw agpw, boolean z) {
        agpw.a("is_truncated_hash", z);
    }

    public static boolean z(agpw agpw) {
        return agpw.b("is_truncated_hash", false);
    }

    public static void a(agpw agpw, double d) {
        String str = "bytes_per_sec";
        synchronized (agpw.a) {
            agpw.a.put(str, Double.valueOf(d));
        }
    }

    public static int A(agpw agpw) {
        return agpw.b("stream_verification_attempts", 0);
    }

    public static boolean a(List list, agqn agqn) {
        Object obj;
        agql agql = agqn.a;
        if (agql == null) {
            agql agql2 = agqn.b;
            obj = agql2 != null ? agql2.a().e : "";
        } else {
            obj = agql.a().e;
        }
        for (aahr aahr : list) {
            if (aahr.e.equals(obj) && aahr.x()) {
                return true;
            }
        }
        return false;
    }

    public static void B(agpw agpw) {
        agpw.a("spacecast_transferred_from_cache", 1);
    }

    public static void C(agpw agpw) {
        agpw.a("spacecast_transferred_from_cache", 2);
    }

    public static void f(agpw agpw, String str) {
        agpw.a("spacecast_appliance_id", str);
    }

    public static String D(agpw agpw) {
        return agpw.b("spacecast_appliance_id");
    }

    public static void f(agpw agpw, boolean z) {
        agpw.a("use_cached_disco", z);
    }

    public static boolean E(agpw agpw) {
        return agpw.b("use_cached_disco", false);
    }

    public static void h(agpw agpw, int i) {
        int i2 = i - 1;
        if (i != 0) {
            agpw.a("offline_audio_quality", i2);
            return;
        }
        throw null;
    }

    public static int F(agpw agpw) {
        return avmm.a(agpw.b("offline_audio_quality", 0));
    }

    public static int G(agpw agpw) {
        int b = agpw.b("spacecast_transferred_from_cache", -1);
        if (b == -1) {
            return 1;
        }
        b = axru.a(b);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
