package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: anzk */
final class anzk implements anzz {
    private final anze a;
    private final aoar b;
    private final boolean c;
    private final anxc d;

    private anzk(aoar aoar, anxc anxc, anze anze) {
        this.b = aoar;
        this.c = anxc.a(anze);
        this.d = anxc;
        this.a = anze;
    }

    static anzk a(aoar aoar, anxc anxc, anze anze) {
        return new anzk(aoar, anxc, anze);
    }

    public final Object a() {
        return this.a.newBuilderForType().buildPartial();
    }

    public final boolean a(Object obj, Object obj2) {
        if (this.b.b(obj).equals(this.b.b(obj2))) {
            return this.c ? this.d.a(obj).equals(this.d.a(obj2)) : true;
        } else {
            return false;
        }
    }

    public final int a(Object obj) {
        int hashCode = this.b.b(obj).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(obj).hashCode() : hashCode;
    }

    public final void b(Object obj, Object obj2) {
        aoab.a(this.b, obj, obj2);
        if (this.c) {
            aoab.a(this.d, obj, obj2);
        }
    }

    public final void a(Object obj, aobl aobl) {
        Iterator d = this.d.a(obj).d();
        while (d.hasNext()) {
            Entry entry = (Entry) d.next();
            anxf anxf = (anxf) entry.getKey();
            if (anxf.f() == 9) {
                anxf.c();
                anxf.d();
                if (entry instanceof anyk) {
                    aobl.a(anxf.a(), ((anyh) ((anyk) entry).a.getValue()).b());
                } else {
                    aobl.a(anxf.a(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        aoar aoar = this.b;
        aoar.b(aoar.b(obj), aobl);
    }

    public final void a(Object obj, byte[] bArr, int i, int i2, anvo anvo) {
        anxl anxl = (anxl) obj;
        aoau aoau = anxl.unknownFields;
        if (aoau == aoau.a) {
            aoau = aoau.a();
            anxl.unknownFields = aoau;
        }
        anxg a = ((anxp) obj).a();
        anxr anxr = null;
        while (i < i2) {
            int a2 = anvl.a(bArr, i, anvo);
            i = anvo.a;
            if (i == aobj.a) {
                i = 0;
                Object obj2 = null;
                while (a2 < i2) {
                    a2 = anvl.a(bArr, a2, anvo);
                    int i3 = anvo.a;
                    int b = aobj.b(i3);
                    int a3 = aobj.a(i3);
                    if (b != 2) {
                        if (b == 3) {
                            if (anxr != null) {
                                a2 = anvl.a(anzs.a.a(anxr.c.getClass()), bArr, a2, i2, anvo);
                                a.a(anxr.d, anvo.c);
                            } else if (a3 == 2) {
                                a2 = anvl.e(bArr, a2, anvo);
                                obj2 = (anvu) anvo.c;
                            }
                        }
                    } else if (a3 == 0) {
                        a2 = anvl.a(bArr, a2, anvo);
                        i = anvo.a;
                        anxr = (anxr) this.d.a(anvo.d, this.a, i);
                    }
                    if (i3 == aobj.b) {
                        break;
                    }
                    a2 = anvl.a(i3, bArr, a2, i2, anvo);
                }
                if (obj2 != null) {
                    aoau.a(aobj.a(i, 2), obj2);
                }
                i = a2;
            } else if (aobj.a(i) == 2) {
                anxr anxr2 = (anxr) this.d.a(anvo.d, this.a, aobj.b(i));
                if (anxr2 == null) {
                    i = anvl.a(i, bArr, a2, i2, aoau, anvo);
                } else {
                    i = anvl.a(anzs.a.a(anxr2.c.getClass()), bArr, a2, i2, anvo);
                    a.a(anxr2.d, anvo.c);
                }
                anxr = anxr2;
            } else {
                i = anvl.a(i, bArr, a2, i2, anvo);
            }
        }
        if (i != i2) {
            throw anyg.i();
        }
    }

    public final void a(Object obj, anzt anzt, anxa anxa) {
        aoar aoar = this.b;
        anxc anxc = this.d;
        Object c = aoar.c(obj);
        anxg b = anxc.b(obj);
        while (anzt.a() != Integer.MAX_VALUE) {
            try {
                int b2 = anzt.b();
                if (b2 == aobj.a) {
                    b2 = 0;
                    Object obj2 = null;
                    anvu anvu = null;
                    while (anzt.a() != Integer.MAX_VALUE) {
                        int b3 = anzt.b();
                        if (b3 == aobj.c) {
                            b2 = anzt.o();
                            obj2 = anxc.a(anxa, this.a, b2);
                        } else if (b3 != aobj.d) {
                            if (!anzt.c()) {
                                break;
                            }
                        } else if (obj2 == null) {
                            anvu = anzt.n();
                        } else {
                            anxc.a(anzt, obj2, anxa, b);
                        }
                    }
                    if (anzt.b() != aobj.b) {
                        throw anyg.e();
                    } else if (anvu != null) {
                        if (obj2 != null) {
                            anxc.a(anvu, obj2, anxa, b);
                        } else {
                            aoar.a(c, b2, anvu);
                        }
                    }
                } else {
                    boolean a;
                    if (aobj.a(b2) == 2) {
                        Object a2 = anxc.a(anxa, this.a, aobj.b(b2));
                        if (a2 != null) {
                            anxc.a(anzt, a2, anxa, b);
                        } else {
                            a = aoar.a(c, anzt);
                        }
                    } else {
                        a = anzt.c();
                    }
                    if (!a) {
                        return;
                    }
                }
            } finally {
                aoar.b(obj, c);
            }
        }
        aoar.b(obj, c);
    }

    public final void c(Object obj) {
        this.b.d(obj);
        this.d.c(obj);
    }

    public final boolean d(Object obj) {
        return this.d.a(obj).e();
    }

    public final int b(Object obj) {
        aoar aoar = this.b;
        int e = aoar.e(aoar.b(obj));
        if (!this.c) {
            return e;
        }
        anxg a = this.d.a(obj);
        int i = 0;
        for (int i2 = 0; i2 < a.a.b(); i2++) {
            i += anxg.b(a.a.b(i2));
        }
        for (Entry b : a.a.c()) {
            i += anxg.b(b);
        }
        return e + i;
    }
}
