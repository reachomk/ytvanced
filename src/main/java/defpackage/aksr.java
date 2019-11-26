package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aksr */
final class aksr implements aksp {
    private final /* synthetic */ Object a;
    private final /* synthetic */ akso b;

    aksr(akso akso, Object obj) {
        this.b = akso;
        this.a = obj;
    }

    public final void a(aksi aksi, avug avug) {
        if (avug != null) {
            for (apxu a : avug.h) {
                akso.a(a, aksi);
            }
            aksi.a(avug.e ^ 1);
            return;
        }
        aksi.a();
    }

    public final void a(aksi aksi, apfo apfo, boolean z) {
        apxu apxu;
        if (z) {
            apxu = apfo.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = apfo.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        akso.a(apxu, aksi);
    }

    public final void a(aksi aksi, avug avug, boolean z) {
        akso akso = this.b;
        Object obj = this.a;
        if (avug != null) {
            aksi.a(false);
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.services.flags.legal_checkbox_checked", Boolean.valueOf(z));
            if (obj != null) {
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            }
            avuk avuk = avug.d;
            if (avuk == null) {
                avuk = avuk.c;
            }
            if ((avuk.a & 1) == 0 || z) {
                akso.a(avug, hashMap);
            } else {
                avuk avuk2 = avug.d;
                if (avuk2 == null) {
                    avuk2 = avuk.c;
                }
                aqhy aqhy = avuk2.b;
                if (aqhy == null) {
                    aqhy = aqhy.q;
                }
                aqhy aqhy2 = aqhy;
                akcq.a(akso.a, aqhy2, akso.b, akso.c, new aksq(akso, aqhy2, avug, hashMap), obj);
            }
        }
    }
}
