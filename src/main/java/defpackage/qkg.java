package defpackage;

import android.location.Location;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@qlp
/* renamed from: qkg */
public final class qkg {
    public static int a(dfi dfi) {
        int i = qkf.a[dfi.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        } else {
            return 2;
        }
    }

    public static dgz a(rky rky) {
        List list = rky.c;
        if (list != null) {
            HashSet hashSet = new HashSet(list);
        }
        Date date = new Date(rky.a);
        int i = rky.b;
        Location location = rky.f;
        return new dgz();
    }
}
