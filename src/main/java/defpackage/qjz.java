package defpackage;

import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@qlp
/* renamed from: qjz */
public final class qjz implements pdo {
    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final roh g;
    private final List h = new ArrayList();
    private final boolean i;
    private final Map j = new HashMap();

    public qjz(Date date, int i, Set set, Location location, boolean z, int i2, roh roh, List list, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = roh;
        this.i = z2;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str = (String) list.get(i3);
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.j.put(split[1], Boolean.valueOf(true));
                        } else {
                            if ("false".equals(split[2])) {
                                this.j.put(split[1], Boolean.valueOf(false));
                            }
                        }
                    }
                } else {
                    this.h.add(str);
                }
            }
        }
    }

    @Deprecated
    public final Date a() {
        return this.a;
    }

    @Deprecated
    public final int b() {
        return this.b;
    }

    public final Set c() {
        return this.c;
    }

    public final Location d() {
        return this.e;
    }

    public final boolean f() {
        return this.d;
    }

    public final int e() {
        return this.f;
    }

    public final pcf h() {
        if (this.g == null) {
            return null;
        }
        pci pci = new pci();
        roh roh = this.g;
        pci.a = roh.b;
        pci.b = roh.c;
        pci.c = roh.d;
        int i = roh.a;
        if (i >= 2) {
            pci.e = roh.e;
        }
        if (i >= 3) {
            rnp rnp = roh.f;
            if (rnp != null) {
                pci.d = new pbn(rnp);
            }
        }
        return new pcf(pci);
    }

    public final boolean i() {
        List list = this.h;
        return list != null && (list.contains("2") || this.h.contains("6"));
    }

    public final boolean j() {
        List list = this.h;
        return list != null && list.contains("6");
    }

    public final boolean k() {
        List list = this.h;
        return list != null && (list.contains("1") || this.h.contains("6"));
    }

    public final boolean l() {
        List list = this.h;
        return list != null && list.contains("3");
    }

    public final Map m() {
        return this.j;
    }

    @Deprecated
    public final boolean g() {
        return this.i;
    }
}
