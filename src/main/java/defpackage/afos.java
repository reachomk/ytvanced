package defpackage;

import android.text.TextUtils;

/* renamed from: afos */
public final class afos {
    public static String a(afot afot, afpu afpu) {
        String str = afot.a;
        return (!TextUtils.isEmpty(str) || afpu.g() || afot.b) ? str : afpu.h();
    }
}
