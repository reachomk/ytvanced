package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: jup */
public final class jup implements fgt {
    private final aizy a;
    private final fgc b;
    private final zzl c;
    private fob d;
    private Runnable e;

    public jup(zzl zzl, aizy aizy, fgc fgc) {
        this.c = zzl;
        this.a = aizy;
        this.b = fgc;
    }

    public final void a(ffu ffu, int i, int i2) {
        if (i2 == 3) {
            this.d = ffu.b;
            return;
        }
        if (i2 == 0 || i2 == 4) {
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
                this.e = null;
            }
        }
        this.d = null;
    }

    public final boolean a(fob fob, aaas aaas, acvx acvx, Map map, akon akon) {
        boolean z;
        if (a(fob)) {
            apxu d;
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            akon.a(hashMap);
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", acvx);
            if (foh.c(this.c)) {
                d = fob.d();
            } else {
                d = fob.c();
            }
            this.e = new juo(acvx, d, aaas, hashMap);
            z = true;
        } else {
            z = false;
        }
        if (a(fob) && foh.c(this.c)) {
            fgc fgc = this.b;
            int i = 4;
            if (foh.H(fgc.b)) {
                bblt a;
                bbnc bbnc = fgc.e;
                if (!(bbnc == null || bbnc.c())) {
                    fgc.e.bK_();
                }
                fhb fhb = fgc.c;
                xak.a();
                String valueOf = String.valueOf(fob);
                String valueOf2 = String.valueOf(fhb.d);
                valueOf.length();
                valueOf2.length();
                if (fhb.d == null) {
                    a = bblt.a();
                } else if (fhb.b(fob) || fhb.c(fob)) {
                    fhh fhh = fhb.d;
                    bblt bblt = fhh.e;
                    if (fhh.f != 3) {
                        i = 0;
                    }
                    fhb.a(null, i);
                    a = bblt;
                } else {
                    a = bblt.a();
                }
                fgc.e = a.a(fgr.a, fgq.a);
            } else {
                xak.a();
                if (fgc.d != null && (fgc.b(fob) || fgc.c(fob))) {
                    if (fgc.d.d != 3) {
                        i = 0;
                    }
                    fgc.a(null, i);
                }
            }
        } else {
            this.b.g();
        }
        return z;
    }

    public final void a(fob fob, Map map) {
        if (a(fob) && fob.g()) {
            zzl zzl = this.c;
            aizy aizy = this.a;
            if (!foh.c(zzl)) {
                map.put("ALLOW_RELOAD", Boolean.valueOf(true));
            }
            map.put("PLAYBACK_START_DESCRIPTOR_MUTATOR", new jvb(aizy, zzl));
        }
    }

    private final boolean a(fob fob) {
        fob fob2 = this.d;
        return fob2 != null && fob2.a(fob);
    }
}
