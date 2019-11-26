package defpackage;

import android.content.SharedPreferences;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

/* renamed from: aebl */
public final class aebl {
    public static final String a = xtl.b("MDX.discoveryUtils");
    public final xhu b;
    public final bcaa c;
    public final boolean d;
    public final SharedPreferences e;

    public aebl(xhu xhu, bcaa bcaa, boolean z, SharedPreferences sharedPreferences) {
        this.b = xhu;
        this.c = bcaa;
        this.d = z;
        this.e = sharedPreferences;
    }

    public final String a() {
        if (this.d) {
            xhr c = c();
            if (c != null) {
                InetAddress a = aebl.a(c);
                if (a != null) {
                    return a.getHostAddress();
                }
            }
        }
        int ipAddress = this.b.a().getIpAddress();
        try {
            return InetAddress.getByAddress(new byte[]{(byte) ipAddress, (byte) (ipAddress >> 8), (byte) (ipAddress >> 16), (byte) (ipAddress >> 24)}).getHostAddress();
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public final xhr b() {
        if (this.d) {
            return c();
        }
        int ipAddress = this.b.a().getIpAddress();
        r1 = new byte[4];
        int i = 0;
        r1[0] = (byte) ipAddress;
        r1[1] = (byte) (ipAddress >> 8);
        r1[2] = (byte) (ipAddress >> 16);
        r1[3] = (byte) (ipAddress >> 24);
        try {
            InetAddress byAddress = InetAddress.getByAddress(r1);
            List d = d();
            while (i < d.size()) {
                xhr xhr = (xhr) d.get(i);
                Enumeration b = xhr.b();
                while (b.hasMoreElements()) {
                    if (byAddress.equals((InetAddress) b.nextElement())) {
                        return xhr;
                    }
                }
                i++;
            }
        } catch (UnknownHostException unused) {
        }
        return null;
    }

    private final xhr c() {
        List d = d();
        for (int i = 0; i < d.size(); i++) {
            if (d.get(i) != null) {
                return (xhr) d.get(i);
            }
        }
        return null;
    }

    private final List d() {
        List<xhr> f = this.b.f();
        if (f.isEmpty()) {
            return f;
        }
        ArrayList arrayList = new ArrayList();
        for (xhr xhr : f) {
            try {
                if (!(xhr.a.isLoopback() || xhr.a.isPointToPoint() || !xhr.b().hasMoreElements() || aebl.a(xhr) == null)) {
                    arrayList.add(xhr);
                }
            } catch (SocketException e) {
                xtl.a(a, String.format(Locale.US, "Could not read interface type for %s", new Object[]{xhr.c()}), e);
            }
        }
        return arrayList;
    }

    private static InetAddress a(xhr xhr) {
        Enumeration b = xhr.b();
        if (b != null) {
            while (b.hasMoreElements()) {
                InetAddress inetAddress = (InetAddress) b.nextElement();
                if (inetAddress instanceof Inet4Address) {
                    return inetAddress;
                }
            }
        }
        return null;
    }

    public static boolean a(String str) {
        boolean z = false;
        try {
            Inet4Address inet4Address = (Inet4Address) Inet4Address.getByName(str);
            if (inet4Address != null) {
                if (inet4Address.isSiteLocalAddress()) {
                    z = true;
                } else if (inet4Address.isLinkLocalAddress()) {
                    return true;
                } else {
                    return z;
                }
            }
            return z;
        } catch (UnknownHostException unused) {
            String str2 = a;
            str = String.valueOf(str);
            String str3 = "Failed to validate IPv4 address ";
            if (str.length() == 0) {
                str = new String(str3);
            } else {
                str = str3.concat(str);
            }
            xtl.a(str2, str);
            return false;
        } catch (ClassCastException e) {
            xtl.a(a, "Cannot use IPv6 addresses.", e);
            return false;
        }
    }

    public final boolean a(int i) {
        if (this.d) {
            return true;
        }
        xhv xhv = (xhv) this.c.get();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1 || i2 == 2) {
            if ((xhv.e() || xhv.f()) && xhv.c()) {
                return true;
            }
            return false;
        } else if (i2 == 3) {
            return xhv.c();
        } else {
            Object obj;
            if (i == 0) {
                obj = "null";
            } else {
                obj = aurr.c(i);
            }
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
            stringBuilder.append("illegal sessionType: ");
            stringBuilder.append(valueOf);
            amqw.b(false, stringBuilder.toString());
            return false;
        }
    }
}
