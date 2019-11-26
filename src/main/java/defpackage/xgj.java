package defpackage;

import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xgj */
public final class xgj implements xhv {
    private static final Map a;
    private final xhu b;
    private final boolean c;
    private final List d;

    public xgj(xhu xhu, boolean z, List list) {
        this.b = (xhu) amqw.a((Object) xhu);
        this.c = z;
        this.d = list;
    }

    private static long a(double d) {
        return (long) (d * 1000000.0d);
    }

    private static long b(double d) {
        return (long) (d * 1000.0d);
    }

    private static boolean b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return false;
            case 13:
                return true;
            default:
                return false;
        }
    }

    private static int c(int i) {
        switch (i) {
            case 1:
            case 2:
                return 4;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return 5;
            case 13:
                return 6;
            default:
                return 7;
        }
    }

    public final void a() {
        this.b.e();
    }

    public final NetworkInfo b() {
        return this.b.b();
    }

    public final boolean c() {
        NetworkInfo b = this.b.b();
        return b != null && (this.c ? b.isConnectedOrConnecting() : b.isConnected());
    }

    public final boolean d() {
        return c() && this.b.d();
    }

    public final boolean e() {
        return a(1);
    }

    public final boolean f() {
        return a(9);
    }

    public final boolean g() {
        return a(0);
    }

    private final boolean a(int i) {
        NetworkInfo b = this.b.b();
        if (b != null) {
            if (c(b)) {
                if (i == 0) {
                    return true;
                }
            } else if (b.getType() == i) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private final int n() {
        NetworkInfo b = this.b.b();
        if (b == null) {
            return 0;
        }
        WifiInfo a = this.b.a();
        if (a == null || !a.containsKey(a.getSSID())) {
            return b.getSubtype();
        }
        return ((Integer) a.get(a.getSSID())).intValue();
    }

    private final boolean c(NetworkInfo networkInfo) {
        if (networkInfo.getType() == 1) {
            WifiInfo a = this.b.a();
            if (a != null) {
                return a.containsKey(a.getSSID());
            }
        }
        return false;
    }

    public final String[] h() {
        r0 = new String[3];
        String str = "";
        r0[0] = str;
        r0[1] = str;
        r0[2] = str;
        NetworkInfo b = this.b.b();
        if (b != null && b.isConnected()) {
            r0[0] = b.getTypeName();
            r0[1] = b.getSubtypeName();
            if (b.getType() == 1) {
                WifiInfo a = this.b.a();
                if (a != null) {
                    r0[2] = a.getSSID();
                }
            }
        }
        return r0;
    }

    public final boolean i() {
        return this.b.c() != null;
    }

    public final boolean j() {
        NetworkInfo b = this.b.b();
        if (b == null) {
            return false;
        }
        int type = b.getType();
        if (type == 0) {
            return xgj.b(b.getSubtype());
        }
        if (type != 1) {
            if (type == 6 || type == 9) {
                return true;
            }
            return false;
        } else if (c(b)) {
            return xgj.b(n());
        }
        return true;
    }

    public final int k() {
        NetworkInfo b = this.b.b();
        int i = 6;
        if (b == null || !c()) {
            i = 2;
        } else {
            int type = b.getType();
            if (type == 0) {
                i = xgj.c(b.getSubtype());
            } else if (type == 1) {
                i = c(b) ? xgj.c(n()) : 3;
            } else if (type != 6) {
                i = 1;
            }
        }
        for (xhy a : this.d) {
            i = a.a();
        }
        return i;
    }

    public final long l() {
        return a(this.b.b());
    }

    public final long a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            return xgj.d(networkInfo.getSubtype());
        }
        long j;
        if (type != 1) {
            if (type == 6) {
                return xgj.a(3.0d);
            }
            if (type == 9) {
                return xgj.a(480.0d);
            }
            j = -1;
        } else if (c(networkInfo)) {
            j = xgj.d(n());
        } else {
            j = xgj.a((double) this.b.a().getLinkSpeed());
        }
        return j;
    }

    private static long d(int i) {
        switch (i) {
            case 1:
                return xgj.b(114.0d);
            case 2:
                return xgj.b(135.0d);
            case 3:
                return xgj.b(384.0d);
            case 4:
                return xgj.b(115.0d);
            case 5:
                return xgj.b(700.0d);
            case 6:
            case 14:
                return xgj.b(900.0d);
            case 7:
                return xgj.b(70.0d);
            case 8:
                return xgj.a(1.8d);
            case 9:
            case 10:
                return xgj.a(1.0d);
            case 11:
                return xgj.b(13.0d);
            case 12:
                return xgj.a(5.0d);
            case 13:
                return xgj.a(5.0d);
            case 15:
                return xgj.a(5.0d);
            default:
                return -1;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        Integer valueOf = Integer.valueOf(10);
        hashMap.put("\"GIN-3g\"", valueOf);
        a.put("GIN-3g", valueOf);
        Map map = a;
        valueOf = Integer.valueOf(2);
        map.put("\"GIN-2g\"", valueOf);
        a.put("GIN-2g", valueOf);
        a.put("\"GIN-2g-poor\"", valueOf);
        a.put("GIN-2g-poor", valueOf);
    }

    public final int m() {
        return b(this.b.b());
    }

    public final int b(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 123;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            switch (networkInfo.getSubtype()) {
                case 1:
                    return 103;
                case 2:
                    return 102;
                case 3:
                    return 112;
                case 4:
                    return 105;
                case 5:
                    return 106;
                case 6:
                    return 107;
                case 7:
                    return 104;
                case 8:
                    return 108;
                case 9:
                    return 110;
                case 10:
                    return 109;
                case 11:
                    return 111;
                case 12:
                    return 113;
                case 13:
                    return 116;
                case 14:
                    return 114;
                case 15:
                    return 115;
                default:
                    return 121;
            }
        } else if (type == 1) {
            WifiInfo a = this.b.a();
            if (a != null) {
                if (a.containsKey(a.getSSID())) {
                    return 125;
                }
            }
            return 117;
        } else if (type == 9) {
            return 119;
        } else {
            if (type != 6) {
                return type != 7 ? afy.av : 118;
            } else {
                return 120;
            }
        }
    }
}
