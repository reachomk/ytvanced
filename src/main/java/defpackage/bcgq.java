package defpackage;

import android.util.Log;

/* renamed from: bcgq */
final class bcgq implements bcgp {
    public static final bcgq a = new bcgq();

    private bcgq() {
    }

    public final void a(int i, String str, String str2) {
        Log.println(i, str, str2);
    }

    public final boolean a(String str, int i) {
        return Log.isLoggable(str, i);
    }
}
