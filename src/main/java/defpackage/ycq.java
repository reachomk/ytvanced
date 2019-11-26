package defpackage;

import android.net.Uri;

/* renamed from: ycq */
public final class ycq {
    public static Uri a(String str) {
        return akmx.a(3, "conversations", str);
    }

    public static Uri a(String str, String str2) {
        return akmx.a(3, "conversations", str, "items", str2);
    }

    public static Uri a() {
        return akmx.a(3, "conversation_switcher_section");
    }
}
