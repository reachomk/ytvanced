package defpackage;

import android.content.SharedPreferences;

/* renamed from: aguj */
public class aguj extends agug {
    public aguj(aguk aguk, aguw aguw, xsc xsc, SharedPreferences sharedPreferences, zzl zzl, agej agej, xci xci) {
        super(aguk, aguw, xsc, sharedPreferences, zzl, agej, xci);
    }

    /* Access modifiers changed, original: protected|final */
    public final agva a(agva agva) {
        agva.c = true;
        return agva;
    }

    /* Access modifiers changed, original: protected */
    public void a(atcy atcy, avqc avqc, agvz agvz, long j, agqw agqw) {
        String str = agqw.a;
        int a = avqe.a(avqc.e);
        if (a == 0) {
            a = 1;
        }
        a--;
        if (a == 1) {
            agug.a(agvz, j, avqc, agqw);
            for (avpb ordinal : new anyc(atcy.b, atcy.c)) {
                int ordinal2 = ordinal.ordinal();
                if (!(ordinal2 == 1 || ordinal2 == 2)) {
                    if (ordinal2 == 3) {
                        agvz.m().b(str);
                    } else if (ordinal2 != 4) {
                        if (ordinal2 == 5) {
                            agvz.l().c(str);
                        }
                    }
                }
                agvz.l().b(str);
            }
        } else if (a == 2) {
            agvz.k().g(str);
        } else if (a != 3) {
            int a2 = avqe.a(avqc.e);
            if (a2 == 0) {
                a2 = 1;
            }
            String valueOf = String.valueOf(Integer.toString(a2 - 1));
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 34);
            stringBuilder.append("Unrecognized OfflineState action: ");
            stringBuilder.append(valueOf);
            xtl.c(stringBuilder.toString());
            agvz.k().g(str);
        } else {
            agug.a(agvz, j, avqc, agqw);
        }
    }
}
