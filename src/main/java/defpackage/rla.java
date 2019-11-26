package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@qlp
/* renamed from: rla */
public final class rla {
    protected rla() {
    }

    public static rky a(Context context, rnb rnb) {
        String a;
        rnb rnb2 = rnb;
        Date date = rnb2.a;
        long time = date == null ? -1 : date.getTime();
        int i = rnb2.c;
        Set set = rnb2.d;
        List unmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        set = rnb2.l;
        rlj.a();
        boolean contains = set.contains(qmh.a(context));
        int i2 = rnb2.k;
        Location location = rnb2.e;
        Bundle bundle = rnb2.g.getBundle(AdMobAdapter.class.getName());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            rlj.a();
            a = qmh.a(Thread.currentThread().getStackTrace(), packageName);
        } else {
            a = null;
        }
        return new rky(7, time, bundle, i, unmodifiableList, contains, i2, false, null, null, location, null, rnb2.g, rnb2.m, Collections.unmodifiableList(new ArrayList(rnb2.n)), null, a, rnb2.o);
    }

    static {
        rla rla = new rla();
    }
}
