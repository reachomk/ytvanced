package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: akwu */
public class akwu extends akuz implements xcp {
    private final akoh a = new akoh();
    public final akpk e = new akpk();
    public final akpk f = new akpk();

    public akwu(aana aana, akvz akvz, xci xci, xoi xoi, acvx acvx) {
        akvz.get();
        super(aana, xci, xoi, acvx);
        akvz.a(ajyf.class);
        xci.a((Object) this);
        this.a.a(this.e);
        this.a.a(this.i);
        this.a.a(this.f);
    }

    /* Access modifiers changed, original: protected */
    public void a(List list, ajyi ajyi) {
    }

    /* Access modifiers changed, original: protected */
    public void b(ajyf ajyf) {
    }

    public final aknh a() {
        return this.a;
    }

    public void a(ajyf ajyf) {
        if (ajyf != null) {
            b(akwu.d(ajyf));
            List c = c(ajyf);
            int size = this.e.size();
            int i = 0;
            for (Object next : c) {
                if (i < size) {
                    this.e.a(i, next);
                } else {
                    this.e.add(i, next);
                }
                i++;
            }
            if (i < size) {
                this.e.a(i, size - i);
            }
            b(ajyf);
            return;
        }
        super.b();
        this.e.clear();
        this.f.clear();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Object obj, int i) {
        this.e.add(i, obj);
    }

    public final void c(Object obj) {
        if (obj != null) {
            this.e.remove(obj);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(abgo abgo) {
        this.e.a(new akwx(abgo));
    }

    private final List c(ajyf ajyf) {
        ajyi[] ajyiArr = ajyf.b;
        if (ajyiArr == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(ajyiArr.length);
        for (ajyi ajyi : ajyf.b) {
            awlq awlq = ajyi.b;
            if (awlq != null) {
                awlt awlt = (awlt) ((anxo) awlq.toBuilder());
                awlt.a(awlk.b, ajyf.c);
                ajyi.b = (awlq) ((anxl) awlt.build());
                arrayList.add(ajyi.b);
            } else {
                aqqg aqqg = ajyi.c;
                if (aqqg != null) {
                    arrayList.add(aqqg);
                } else {
                    a(arrayList, ajyi);
                }
            }
        }
        return arrayList;
    }

    private static List d(ajyf ajyf) {
        awlg[] awlgArr = ajyf.d;
        if (awlgArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(awlgArr.length);
        for (awlg awlg : ajyf.d) {
            int i = awlg.a;
            Object obj;
            if ((i & 1) != 0) {
                obj = awlg.b;
                if (obj == null) {
                    obj = avkc.f;
                }
                arrayList.add(ajtj.a(obj));
            } else if ((i & 2) != 0) {
                obj = awlg.c;
                if (obj == null) {
                    obj = awnh.d;
                }
                arrayList.add(ajtj.a(obj));
            }
        }
        return arrayList;
    }

    public Class[] a(Class cls, Object obj, int i) {
        if (cls != akwu.class) {
            return akuj.a((akuz) this, obj, i);
        }
        Class[] clsArr;
        if (i == -1) {
            clsArr = new Class[]{abgo.class};
        } else if (i == 0) {
            a((abgo) obj);
            clsArr = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
