package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: xyf */
public final class xyf extends akuz implements afwz, afxf, akmz, xcp, yfx {
    public static final Uri a = ycq.a();
    private static final Uri d = akmx.a(3, "shared_tab_delivery_timestamp");
    public final akmx b;
    public final xxl c;
    private final xci e;
    private final akxv f;
    private final yct g = new yct(new xyk(this));
    private final afxe h;
    private final afwx m;
    private final Executor n;
    private ajtf o;
    private boolean p;
    private boolean q;

    public xyf(akvz akvz, xci xci, xoi xoi, xxl xxl, Executor executor, aana aana, akxv akxv, acvx acvx, afxb afxb, afwx afwx, akmx akmx) {
        akvz.get();
        super(aana, xci, xoi, acvx, null, new akpk());
        this.e = (xci) amqw.a((Object) xci);
        akvz akvz2 = akvz;
        akvz.a(aqpd.class);
        xci xci2 = xci;
        xci.a((Object) this);
        this.f = (akxv) amqw.a((Object) akxv);
        this.h = new afxe(this, afxb, this);
        this.m = (afwx) amqw.a((Object) afwx);
        this.b = (akmx) amqw.a((Object) akmx);
        this.c = (xxl) amqw.a((Object) xxl);
        this.n = (Executor) amqw.a((Object) executor);
        this.i.a(new xyi(this));
    }

    public final void a(String str) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bqn bqn, ajtf ajtf) {
        super.a(bqn, ajtf);
        if (ajti.INVALIDATION.a(ajtf)) {
            this.p = false;
            if (this.q) {
                this.q = false;
                a(this.o);
            }
        }
    }

    public final void c() {
        this.b.a((akmz) this);
        this.e.b(this);
        g();
    }

    public final void a(Uri uri, Uri uri2) {
        ycw e = e();
        if (e != null) {
            ycw ycw;
            int i;
            String a;
            b(e.f);
            ajtf a2 = e.a();
            g();
            this.o = a2;
            if (a2 != null) {
                this.h.b(a2);
                this.m.a(this, h().a);
            }
            yct yct = this.g;
            akpk akpk = this.i;
            List list = e.b;
            List list2 = e.a;
            int i2 = e.c;
            CharSequence charSequence = e.d;
            boolean z = e.e;
            aqir aqir = e.h;
            int i3 = e.i;
            List arrayList = new ArrayList();
            akpk.b((Collection) arrayList);
            HashMap hashMap = new HashMap();
            HashSet<String> hashSet = new HashSet();
            int i4 = 0;
            while (i4 < arrayList.size()) {
                Object obj = arrayList.get(i4);
                List list3 = arrayList;
                String a3 = yct.a(obj);
                ycw = e;
                if (a3 != null) {
                    hashMap.put(a3, Integer.valueOf(i4));
                }
                if ((obj instanceof aqox) || (obj instanceof aqoz) || (obj instanceof aqir)) {
                    hashSet.add(a3);
                }
                i4++;
                arrayList = list3;
                e = ycw;
            }
            ycw = e;
            ArrayList arrayList2 = new ArrayList();
            if (list2.isEmpty()) {
                i = 0;
            } else if (z || i2 == 0 || list2.size() <= i2) {
                i = 0;
                arrayList2.addAll(list2);
            } else {
                yct.a.a = charSequence;
                i = 0;
                arrayList2.addAll(list2.subList(0, i2));
                arrayList2.add(yct.a);
            }
            int max = Math.max(i, Math.min(i3, list.size()));
            arrayList2.addAll(list.subList(i, max));
            if (aqir != null) {
                arrayList2.add(aqir);
            }
            arrayList2.addAll(list.subList(max, list.size()));
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                Object obj2 = arrayList2.get(i5);
                a = yct.a(obj2);
                hashSet.remove(a);
                Integer num = (Integer) hashMap.remove(a);
                if (num != null) {
                    Object obj3;
                    if (num.intValue() != i5) {
                        akpk.b(num.intValue(), i5);
                        obj3 = 1;
                    } else {
                        obj3 = null;
                    }
                    akpk.a(i5, obj2);
                    if (obj3 == null) {
                    }
                } else {
                    akpk.add(i5, obj2);
                }
                for (String str : hashMap.keySet()) {
                    Integer num2 = (Integer) hashMap.get(str);
                    if (num2.intValue() >= i5 && (num == null || num2.intValue() < num.intValue())) {
                        hashMap.put(str, Integer.valueOf(num2.intValue() + 1));
                    }
                }
            }
            for (String remove : hashSet) {
                Integer num3 = (Integer) hashMap.remove(remove);
                if (num3 != null) {
                    akpk.remove(num3.intValue());
                    for (String a4 : hashMap.keySet()) {
                        Integer num4 = (Integer) hashMap.get(a4);
                        if (num4.intValue() >= num3.intValue()) {
                            hashMap.put(a4, Integer.valueOf(num4.intValue() - 1));
                        }
                    }
                }
            }
            if (z) {
                akpk.remove(yct.a);
            }
            this.n.execute(new xyh(this, ycw));
        }
    }

    public final void a(ajtf ajtf) {
        if (ajtf != null) {
            if (ajtf.c() == ajti.INVALIDATION) {
                if (this.p) {
                    this.q = true;
                    return;
                }
                this.p = true;
            }
            super.a(ajtf);
        }
    }

    public final void a(ajtf ajtf, atur atur) {
        a(this.o);
    }

    public final void a(String str, boolean z, int i, long j, boolean z2) {
        if (TextUtils.equals("FEshared", str) && h().a < j) {
            this.b.a(d, new ycx(j));
            this.m.c(str);
            a(this.o);
        }
    }

    public final void d() {
        if (b(ajti.RELOAD)) {
            s();
            return;
        }
        akxv akxv = this.f;
        if (akxv != null && akxv.ap_()) {
            this.f.H_();
        }
    }

    private final void g() {
        this.h.a();
        this.m.a((afwz) this);
        this.o = null;
    }

    public final ycw e() {
        return (ycw) this.b.a(a);
    }

    private final ycx h() {
        ycx ycx = (ycx) this.b.a(d);
        return ycx == null ? new ycx(0) : ycx;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != xyf.class) {
            return akuj.a((akuz) this, obj, i);
        }
        int i2 = 0;
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ybh.class, zyg.class, aaxd.class};
        } else if (i == 0) {
            ybh ybh = (ybh) obj;
            akpk akpk = this.i;
            while (i2 < akpk.d()) {
                Object c = akpk.c(i2);
                if (c instanceof aqoz) {
                    aqoz aqoz = (aqoz) c;
                    if (aqoz.b.equals(ybh.a)) {
                        c(aqoz);
                        break;
                    }
                }
                i2++;
            }
            if (akpk.isEmpty()) {
                d();
                return null;
            }
        } else if (i == 1) {
            c(((zyg) obj).d);
        } else if (i == 2) {
            c(((aaxd) obj).b);
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
