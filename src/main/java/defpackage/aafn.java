package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aafn */
public final class aafn {
    public final akab a;
    public List b;
    private List c;

    public aafn(akab akab) {
        this.a = (akab) amqw.a((Object) akab);
    }

    public final List a() {
        if (this.c == null) {
            this.c = new ArrayList(this.a.b.length);
            for (akad akad : this.a.b) {
                ajwt ajwt = akad.c;
                if (ajwt != null) {
                    this.c.add(new aafj(ajwt));
                } else {
                    akao akao = akad.f;
                    if (akao != null) {
                        akan akan = akao.d;
                        if (akan != null && akan.c != null) {
                            this.c.add(new aafs(akao));
                        } else if (akan != null && akan.a != null) {
                            this.c.add(new aafg(akao));
                        } else if (akan != null) {
                            ajvy ajvy = akan.b;
                            if (ajvy == null) {
                                ajvy = akan.a;
                                if (ajvy == null) {
                                    ajvy = akan.c;
                                    if (ajvy == null) {
                                        ajvy = null;
                                    }
                                }
                            }
                            if (ajvy != null) {
                                this.c.add(akao);
                            }
                        }
                    } else {
                        Object a = aafm.a(akad);
                        if (a != null) {
                            this.c.add(a);
                        }
                    }
                }
            }
        }
        return this.c;
    }
}
