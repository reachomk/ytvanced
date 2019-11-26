package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: zmw */
final /* synthetic */ class zmw implements zob {
    private final zmt a;

    zmw(zmt zmt) {
        this.a = zmt;
    }

    public final void a(byte[] bArr, Set set, List list, List list2, String str, SharedPreferences sharedPreferences) {
        zmt zmt = this.a;
        synchronized (zmt.c) {
            zmt.a = new zmj(set);
            znd.b(zmt.c, zmt.a);
            zmt.c.clear();
        }
        synchronized (zmt.d) {
            zmt.b = new znm(bArr, str);
            znd.b(zmt.d, zmt.b);
            zmt.d.clear();
        }
        synchronized (zmt.i) {
            zmt.j = new zjp(list, sharedPreferences);
            for (Entry entry : zmt.i.entrySet()) {
                zmt.a((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            zmt.i.clear();
            zmt.k = list;
            zmt.b();
        }
        zmt.c();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            zjv zjv = (zjv) list2.get(i);
            ayza ayza = zjv.a;
            znf b = zmt.b(ayza);
            b.e = amul.a(zjv.b);
            b.c();
            b.b();
            if (ayza == ayza.EFFECT_SUBPACKAGE_ID_EXPRESSIVE) {
                b.a(new znb(zmt));
            } else if (ayza == ayza.EFFECT_SUBPACKAGE_ID_PRESET) {
                b.a(new zne(zmt));
            } else {
                String valueOf = String.valueOf(ayza);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 50);
                stringBuilder.append("Ignoring selected effect from unknown subpackage: ");
                stringBuilder.append(valueOf);
                xtl.d(stringBuilder.toString());
            }
        }
    }
}
