package defpackage;

import android.net.LinkProperties;

/* renamed from: bcih */
public final class bcih {
    public static boolean a(LinkProperties linkProperties) {
        return linkProperties.isPrivateDnsActive();
    }

    public static String b(LinkProperties linkProperties) {
        return linkProperties.getPrivateDnsServerName();
    }
}
