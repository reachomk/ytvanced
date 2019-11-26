package defpackage;

import java.util.List;

/* renamed from: jiz */
public final class jiz extends akwu implements xcp {
    public final xoi a;
    public final aaas b;
    public final xci c;
    public boolean d = false;
    private final akun g;
    private final imj h;
    private final eki m;
    private final hoc n;
    private auwl o;
    private String p;

    public jiz(akvz akvz, xci xci, xoi xoi, aaas aaas, imj imj, eki eki, hoc hoc, aana aana, akun akun, acvx acvx) {
        super(aana, akvz, xci, xoi, acvx);
        this.g = akun;
        this.a = xoi;
        this.b = aaas;
        this.c = xci;
        this.h = imj;
        this.m = eki;
        this.n = hoc;
        this.e.a(new jjc(this));
    }

    public final void a(ajyf ajyf) {
        boolean z = false;
        if (ajyf != null && ajyf.e) {
            z = true;
        }
        this.d = z;
        super.a(ajyf);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ajyf ajyf) {
        this.p = ajyf.c;
        if (this.o == null) {
            if (amqu.a(ajyf.c) || !this.m.a(ajyf.c)) {
                for (ajyi ajyi : ajyf.b) {
                    awlq awlq = ajyi.b;
                    if (awlq != null) {
                        awlm awlm = awlq.x;
                        if (awlm == null) {
                            awlm = awlm.c;
                        }
                        if (((awlm.a == 135739233 ? (ayym) awlm.b : ayym.c).a & 1) != 0) {
                            ayym ayym;
                            eki eki = this.m;
                            awlm awlm2 = awlq.x;
                            if (awlm2 == null) {
                                awlm2 = awlm.c;
                            }
                            if (awlm2.a == 135739233) {
                                ayym = (ayym) awlm2.b;
                            } else {
                                ayym = ayym.c;
                            }
                            String str = ayym.b;
                            if (eki.b()) {
                                agqy a = ((agwc) eki.a.get()).b().k().a(str);
                                if (!(a == null || a.i())) {
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return;
            }
            d();
        }
    }

    public final void c() {
        this.f.remove(this.o);
        this.o = null;
        this.p = null;
        super.c();
    }

    private final void a(jhl jhl) {
        if (this.d && amqq.a(jhl.a, this.e)) {
            int i = jhl.b;
            int i2 = jhl.c;
            if (i != i2) {
                Object obj = jhl.a.get(i2);
                if (obj instanceof awlq) {
                    awlq awlq = (awlq) obj;
                    int i3 = jhl.c - 1;
                    String str = null;
                    Object obj2 = i3 >= 0 ? jhl.a.get(i3) : null;
                    if (obj2 == null || (obj2 instanceof awlq)) {
                        String str2;
                        Object obj3;
                        awlq awlq2 = (awlq) obj2;
                        if (awlq2 == null || (awlq2.a & 4096) == 0) {
                            str2 = null;
                        } else {
                            str2 = awlq2.n;
                        }
                        anxr access$000 = anxl.checkIsLite(awlk.b);
                        awlq.a(access$000);
                        Object b = awlq.h.b(access$000.d);
                        if (b == null) {
                            obj3 = access$000.b;
                        } else {
                            obj3 = access$000.a(b);
                        }
                        String str3 = (String) obj3;
                        imj imj = this.h;
                        if ((awlq.a & 4096) != 0) {
                            str = awlq.n;
                        }
                        imj.a(str3, str, str2, new jjb(this, obj));
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(List list, ajyi ajyi) {
        ajzl ajzl = ajyi.d;
        if (ajzl != null) {
            list.add(ajzl);
        }
    }

    private final void d() {
        if (this.o == null) {
            this.o = this.n.a(this.m);
            this.f.add(this.o);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != jiz.class) {
            return super.a(cls, obj, i);
        }
        Class[] clsArr = null;
        switch (i) {
            case -1:
                clsArr = new Class[]{gzx.class, jhl.class, zyg.class, abgi.class, abgo.class, agky.class};
                break;
            case 0:
                c(((gzx) obj).d);
                break;
            case 1:
                a((jhl) obj);
                break;
            case 2:
                c(((zyg) obj).d);
                break;
            case 3:
                ajxw ajxw = ((abgi) obj).a;
                if (ajxw != null) {
                    ajxy ajxy = ajxw.e;
                    if (ajxy != null) {
                        ajyf ajyf = ajxy.a;
                        if (ajyf != null) {
                            a(ajyf);
                            akun akun = this.g;
                            if (akun != null) {
                                akun.n();
                                return null;
                            }
                        }
                    }
                }
                break;
            case 4:
                a((abgo) obj);
                break;
            case 5:
                if (((agky) obj).a.equals(this.p)) {
                    d();
                    return null;
                }
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
