package defpackage;

import android.content.Context;

/* renamed from: hpq */
public final class hpq extends agpi {
    public hpq(Context context, String str, akkq akkq, ajgv ajgv, xmc xmc, xta xta, zzf zzf, zyw zyw, agvs agvs, bcaa bcaa) {
        super(context, str, akkq, ajgv, xmc, xta, zzf, zyw, agvs, bcaa);
    }

    public final aygk a(avoq avoq) {
        amqw.a((Object) avoq);
        avmo avmo = null;
        if (!(avoq == null || avoq.i.size() == 0)) {
            for (avoo avoo : avoq.i) {
                if ((avoo.a & 2) != 0) {
                    avmo = avoo.b;
                    if (avmo == null) {
                        avmo = avmo.d;
                    }
                }
            }
        }
        if (avmo == null || (avmo.a & 2) == 0) {
            return super.a(avoq);
        }
        aygk aygk = avmo.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        return aygk;
    }
}
