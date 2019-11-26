package defpackage;

import android.os.Bundle;

/* renamed from: acii */
public final class acii {
    public static acii a;

    public static void a(Bundle bundle) {
        amqw.a((Object) bundle);
        bundle.putBoolean("extras-key-enable-cbr", true);
    }

    public static void a(Bundle bundle, int i) {
        amqw.a((Object) bundle);
        amqw.a(i > 0);
        bundle.putInt("extras-key-min-bitrate", i);
    }
}
