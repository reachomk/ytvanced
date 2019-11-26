package defpackage;

import android.net.ProxyInfo;
import android.net.Uri;

/* renamed from: bckj */
public final class bckj {
    public static final bckj e;
    public final String a;
    public final int b;
    public final String c;
    public final String[] d;

    public bckj(String str, int i, String str2, String[] strArr) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = strArr;
    }

    public static bckj a(ProxyInfo proxyInfo) {
        String str = null;
        if (proxyInfo == null) {
            return null;
        }
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        String host = proxyInfo.getHost();
        int port = proxyInfo.getPort();
        if (!Uri.EMPTY.equals(pacFileUrl)) {
            str = pacFileUrl.toString();
        }
        return new bckj(host, port, str, proxyInfo.getExclusionList());
    }

    static {
        String str = "";
        e = new bckj(str, 0, str, new String[0]);
    }
}
