package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* renamed from: xht */
public final class xht implements xhu {
    private static final String b = xtl.b("NetworkProvider");
    private final xrq a;
    private final ConnectivityManager c;
    private final WifiManager d;
    private WifiInfo e;
    private boolean f;
    private NetworkInfo g;
    private boolean h;
    private NetworkInfo i;
    private boolean j;
    private boolean k;
    private boolean l;
    private List m;
    private boolean n;

    public xht(ConnectivityManager connectivityManager, WifiManager wifiManager, xrq xrq) {
        this.a = xrq;
        this.c = connectivityManager;
        this.d = wifiManager;
        h();
    }

    public final WifiInfo a() {
        if (!this.a.a || g()) {
            return this.d.getConnectionInfo();
        }
        if (this.f) {
            this.e = this.d.getConnectionInfo();
            this.f = false;
        }
        return this.e;
    }

    public final NetworkInfo b() {
        if (!this.a.a || g()) {
            return this.c.getActiveNetworkInfo();
        }
        if (this.h) {
            this.g = this.c.getActiveNetworkInfo();
            this.h = false;
        }
        return this.g;
    }

    public final NetworkInfo c() {
        if (!this.a.a || g()) {
            return this.c.getNetworkInfo(0);
        }
        if (this.j) {
            this.i = this.c.getNetworkInfo(0);
            this.j = false;
        }
        return this.i;
    }

    public final boolean d() {
        if (!this.a.a || g()) {
            return this.c.isActiveNetworkMetered();
        }
        if (this.l) {
            this.k = this.c.isActiveNetworkMetered();
            this.l = false;
        }
        return this.k;
    }

    public final void e() {
        h();
    }

    public final List f() {
        if (!this.a.a || g()) {
            return xht.i();
        }
        if (this.n) {
            this.m = xht.i();
            this.n = false;
        }
        return this.m;
    }

    private final boolean g() {
        if (this.h) {
            this.g = this.c.getActiveNetworkInfo();
            this.h = false;
        }
        NetworkInfo networkInfo = this.g;
        if (networkInfo == null || networkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    private final void h() {
        this.f = true;
        this.h = true;
        this.j = true;
        this.l = true;
        this.n = true;
    }

    private static List i() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                arrayList.add(new xhr((NetworkInterface) networkInterfaces.nextElement()));
            }
        } catch (SocketException e) {
            xtl.b(b, "error getting the network interfaces", e);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
