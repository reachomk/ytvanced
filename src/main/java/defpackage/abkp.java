package defpackage;

import android.text.TextUtils;

/* renamed from: abkp */
public final class abkp extends aamz {
    private String a;

    public abkp(aamd aamd, afpt afpt, String str, String str2, atgy atgy) {
        asad asad = (asad) asaa.i.createBuilder();
        asad.copyOnWrite();
        asaa asaa = (asaa) asad.instance;
        if (str != null) {
            asaa.a |= 16;
            asaa.d = str;
            if (atgy != null) {
                azkr azkr = (azkr) azks.c.createBuilder();
                azkt azkt = (azkt) azku.c.createBuilder();
                azkt.a(atgy);
                azkr.a(azkt);
                asad.a(azkr);
            }
            if (!TextUtils.isEmpty(str2)) {
                axcg axcg = (axcg) axch.c.createBuilder();
                axcc axcc = (axcc) axcd.e.createBuilder();
                axcc.copyOnWrite();
                axcd axcd = (axcd) axcc.instance;
                if (str2 != null) {
                    axcd.a |= 2;
                    axcd.c = str2;
                    axce axce = (axce) axcf.c.createBuilder();
                    axce.copyOnWrite();
                    axcf axcf = (axcf) axce.instance;
                    axcf.a |= 4;
                    axcf.b = true;
                    axcc.copyOnWrite();
                    axcd = (axcd) axcc.instance;
                    axcd.d = (axcf) ((anxl) axce.build());
                    axcd.a |= 32;
                    axcc.copyOnWrite();
                    axcd axcd2 = (axcd) axcc.instance;
                    axcd2.a |= 1;
                    axcd2.b = 1;
                    axcg.copyOnWrite();
                    axch axch = (axch) axcg.instance;
                    axch.b = (axcd) ((anxl) axcc.build());
                    axch.a |= 2;
                    asad.copyOnWrite();
                    asaa asaa2 = (asaa) asad.instance;
                    asaa2.c = (axch) ((anxl) axcg.build());
                    asaa2.a |= 2;
                } else {
                    throw new NullPointerException();
                }
            }
            super(aamd, afpt, "assistant", asad);
            this.a = "";
            this.a = str;
            g();
            return;
        }
        throw new NullPointerException();
    }

    public final String a() {
        afkr k = k();
        k.a("query", this.a);
        return k.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(TextUtils.isEmpty(this.a) ^ 1);
    }
}
