package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: hpb */
public final class hpb extends agvq {
    private final zyw b;

    public hpb(SharedPreferences sharedPreferences, zzl zzl, int i, zyw zyw) {
        super(sharedPreferences, zzl, i);
        this.b = zyw;
    }

    public final boolean a() {
        return true;
    }

    public final boolean a(agqz agqz) {
        if (foh.j(this.b) && hpr.a.equals(agxj.d(agqz.f))) {
            return true;
        }
        return super.a(agqz);
    }

    public final Comparator b() {
        return agqa.d;
    }

    public final amul c() {
        Collection arrayList = new ArrayList(this.a);
        Collections.sort(arrayList, agqa.b);
        return amul.a(arrayList);
    }

    public final amqv d() {
        return hpa.a;
    }
}
