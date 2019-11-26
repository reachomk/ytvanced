package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aafj */
public final class aafj {
    public final ajwt a;
    private List b;
    private List c;

    public aafj(ajwt ajwt) {
        this.a = (ajwt) amqw.a((Object) ajwt);
    }

    public final List a() {
        if (this.b == null) {
            this.b = new ArrayList(this.a.b.length);
            for (ajww ajww : this.a.b) {
                akao akao = ajww.l;
                if (akao != null) {
                    akan akan = akao.d;
                    if (akan != null) {
                        if (akan.a != null) {
                            this.b.add(new aafg(akao));
                        } else if (akan.c != null) {
                            this.b.add(new aafs(akao));
                        }
                    }
                } else {
                    Object a = aafi.a(ajww);
                    if (a != null) {
                        this.b.add(a);
                    }
                }
            }
        }
        return this.b;
    }

    public final List b() {
        if (this.c == null) {
            this.c = new ArrayList(this.a.c.length);
            for (atvz atvz : this.a.c) {
                int i = atvz.a;
                List list;
                Object obj;
                if ((i & 1) != 0) {
                    list = this.c;
                    obj = atvz.b;
                    if (obj == null) {
                        obj = avkc.f;
                    }
                    list.add(ajtj.a(obj));
                } else if ((i & 4) != 0) {
                    list = this.c;
                    obj = atvz.d;
                    if (obj == null) {
                        obj = awzv.d;
                    }
                    list.add(ajtj.a(obj));
                } else if ((i & 2) != 0) {
                    list = this.c;
                    obj = atvz.c;
                    if (obj == null) {
                        obj = awnh.d;
                    }
                    list.add(ajtj.a(obj));
                } else if ((i & 8) != 0) {
                    list = this.c;
                    obj = atvz.e;
                    if (obj == null) {
                        obj = ayhc.e;
                    }
                    list.add(ajtj.a(obj));
                }
            }
        }
        return this.c;
    }
}
