package defpackage;

import android.text.TextUtils;

/* renamed from: enj */
public final /* synthetic */ class enj {
    public static boolean a(enm enm, apxu apxu) {
        amqw.a((Object) enm);
        amqw.a((Object) apxu);
        if (!(enm instanceof enk)) {
            return false;
        }
        String f = enm.f();
        String a = elq.a(apxu);
        if (TextUtils.isEmpty(f) || TextUtils.equals(f, a)) {
            return true;
        }
        return false;
    }
}
