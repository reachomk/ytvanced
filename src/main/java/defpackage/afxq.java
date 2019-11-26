package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: afxq */
public final class afxq extends afxs {
    private final SharedPreferences g;
    private final zyw h;
    private final zzl i;

    public afxq(bcaa bcaa, String str, SharedPreferences sharedPreferences, abev abev, ScheduledExecutorService scheduledExecutorService, xsv xsv, afve afve, Context context, zyw zyw, zzl zzl) {
        super(bcaa, str, sharedPreferences, abev, scheduledExecutorService, xsv, afve, context, zzl);
        this.g = sharedPreferences;
        this.h = zyw;
        this.i = zzl;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        if (f()) {
            return e();
        }
        return c();
    }

    private final boolean e() {
        xsw a = this.d.a();
        do {
            try {
                FirebaseInstanceId a2 = FirebaseInstanceId.a();
                anpm d = a2.d();
                if (d == null || d.b(a2.d.b())) {
                    a2.b();
                }
                String str = d != null ? d.a : null;
                if (str != null) {
                    a(str);
                    return true;
                }
            } catch (IllegalAccessError e) {
                xtl.b("Could not register with FCM (unexpected Error): ", e);
                return false;
            } catch (UnsupportedOperationException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 65);
                stringBuilder.append("NotificationRegistrar.registerWithFCMBlocking: Exception thrown: ");
                stringBuilder.append(valueOf);
                xtl.d(stringBuilder.toString());
                return false;
            }
        } while (a.a());
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(xsc xsc) {
        boolean f = f();
        String str = "notif_registrar_use_fcm";
        if (f == this.g.getBoolean(str, false)) {
            return super.a(xsc);
        }
        this.g.edit().putBoolean(str, f).apply();
        return true;
    }

    private final boolean f() {
        if (!(this.h.a() == null || this.i.b() == null)) {
            avlu avlu = this.h.a().t;
            if (avlu == null) {
                avlu = avlu.d;
            }
            if (avlu.b) {
                avmc avmc = this.i.b().q;
                if (avmc == null) {
                    avmc = avmc.m;
                }
                avly avly = avmc.h;
                if (avly == null) {
                    avly = avly.c;
                }
                return avly.b;
            }
        }
        return false;
    }
}
