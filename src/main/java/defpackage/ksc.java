package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ksc */
public final class ksc implements akot {
    private final ksh a;

    protected ksc(Context context, akkq akkq, aaas aaas, akvp akvp, akvo akvo, vmn vmn, tpu tpu, vod vod, dwk dwk, xci xci, ViewGroup viewGroup) {
        this.a = new ksh(context, akkq, aaas, akvp, akvo, vmn, tpu, vod, dwk, xci, viewGroup);
    }

    public final View K_() {
        return this.a.l;
    }

    public final void a(akpb akpb) {
        this.a.a(akpb);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aviq aviq;
        Object obj2 = (kse) obj;
        ksh ksh = this.a;
        amqw.a((Object) akor);
        amqw.a(obj2);
        ksh.l.removeAllViews();
        ksh.b();
        ksj ksj = ksh.m;
        awrg awrg = obj2.a;
        String str = (awrg.a & 64) != 0 ? awrg.h : null;
        if (obj2.d == null) {
            anze anze = awrg.b;
            if (anze == null) {
                anze = awra.k;
            }
            obj2.d = (ajyp) ajzv.a(anze, ajyp.class);
        }
        ajyp ajyp = obj2.d;
        if (obj2.e == null) {
            anyd anyd = obj2.a.c;
            obj2.e = new awqo[anyd.size()];
            for (int i = 0; i < anyd.size(); i++) {
                obj2.e[i] = (awqo) anyd.get(i);
            }
        }
        awqo[] awqoArr = obj2.e;
        awrg = obj2.a;
        if ((awrg.a & 2) == 0) {
            aviq = null;
        } else {
            if (obj2.c == null) {
                axak axak = awrg.d;
                if (axak == null) {
                    axak = axak.a;
                }
                obj2.c = (aviq) ajzv.a(ajzv.a(axak), aviq.class);
            }
            aviq = obj2.c;
        }
        if (obj2.b == null) {
            aojc aojc = obj2.a.e;
            if (aojc == null) {
                aojc = aojc.f;
            }
            obj2.b = aojc;
        }
        aojc aojc2 = obj2.b;
        if (obj2.f == null) {
            obj2.f = obj2.a.f.d();
        }
        ksj.a(akor, obj2, str, ajyp, awqoArr, aviq, aojc2, obj2.f);
        ksh.l.addView(ksh.m.d);
    }
}
