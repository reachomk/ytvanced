package defpackage;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fmw */
final class fmw implements albc {
    private final /* synthetic */ albc a;
    private final /* synthetic */ aruh b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ acvx d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ fmx f;

    fmw(fmx fmx, albc albc, aruh aruh, Object obj, acvx acvx, boolean z) {
        this.f = fmx;
        this.a = albc;
        this.b = aruh;
        this.c = obj;
        this.d = acvx;
        this.e = z;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
        albu albu = (albu) obj;
        albc albc = this.a;
        if (albc != null) {
            albc.a(albu, i);
        }
    }

    public final /* synthetic */ void a(Object obj) {
        byte[] d;
        albu albu = (albu) obj;
        albc albc = this.a;
        if (albc != null) {
            albc.a(albu);
        }
        fmx fmx = this.f;
        aruh aruh = this.b;
        Object obj2 = this.c;
        acvx acvx = this.d;
        if (!this.e) {
            fmx.d.add(new Pair(aruh, obj2));
            String a = fmx.a(aruh);
            Editor putLong = fmx.b.edit().putLong(a, fmx.b.getLong(a, 0) + 1).putLong(fmx.b(aruh), fmx.c.a());
            if (aruh.i.size() != 0) {
                for (apxu apxu : aruh.i) {
                    Map hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aruh);
                    fmx.a.a(apxu, hashMap);
                }
            }
            if ((aruh.a & 64) != 0) {
                artx artx = aruh.h;
                if (artx == null) {
                    artx = artx.c;
                }
                int a2 = artz.a(artx.b);
                if (a2 != 0 && a2 == 4) {
                    putLong.remove("add_to_long_press_hint_trigger_video_id");
                }
            }
            putLong.apply();
        }
        if (!(aruh == null || (aruh.a & 2) == 0)) {
            arub arub = aruh.c;
            if (arub == null) {
                arub = arub.c;
            }
            if (arub.a == 106514900) {
                artp artp;
                arub arub2 = aruh.c;
                if (arub2 == null) {
                    arub2 = arub.c;
                }
                if (arub2.a == 106514900) {
                    artp = (artp) arub2.b;
                } else {
                    artp = artp.i;
                }
                d = artp.e.d();
                if (acvx != null && d != null) {
                    acvx.a(d, null);
                    return;
                }
            }
        }
        d = null;
        if (acvx != null) {
        }
    }
}
