package defpackage;

import java.util.UUID;

/* renamed from: wcq */
public final class wcq {
    public final nn a;
    public final aaas b;
    public final wlh c;
    public final wcu d;
    public final albi e;
    public wjv f;
    public boolean g;

    public wcq(nn nnVar, aaas aaas, albi albi, wlh wlh) {
        this.a = nnVar;
        this.b = aaas;
        this.c = wlh;
        this.d = new wcu(this, aaas, albi, wlh);
        this.e = albi;
    }

    public final void a(ajrq ajrq, wef wef) {
        if (!this.g) {
            aphj aphj = ajrq.b;
            if (aphj != null) {
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                if ((aphg.a & 2048) != 0) {
                    or a = this.a.f().a();
                    a(a);
                    this.f = wjv.a(ajrq);
                    wcu wcu = this.d;
                    wcu.b = wef;
                    wjv wjv = this.f;
                    wcu.c = wjv;
                    wjv.am = new wcs(this, ajrq);
                    wjv = this.f;
                    wjv.az = new wcp(this, wjv, ajrq);
                    wlh wlh = this.c;
                    String valueOf = String.valueOf(UUID.randomUUID());
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
                    stringBuilder.append("backstage_post_creation_flow:");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(":0");
                    wlh.c = stringBuilder.toString();
                    wlh.b = System.currentTimeMillis() * 1000;
                    wlh.d = null;
                    this.f.a(a, "backstage_post_dialog_fragment");
                    return;
                }
            }
            xtl.c("Command for post button is missing in BackstagePostDialogRenderer");
        }
    }

    public final void a(or orVar) {
        nf a = this.a.f().a("backstage_post_dialog_fragment");
        if (a != null) {
            orVar.a(a);
        }
        orVar.f();
        this.f = null;
    }
}
