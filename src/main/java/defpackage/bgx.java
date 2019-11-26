package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: bgx */
public abstract class bgx implements Cloneable {
    private static final int[] a = new int[]{2, 1, 3, 4};
    private static final bgt t = new bgw();
    private static ThreadLocal w = new ThreadLocal();
    private ArrayList A = new ArrayList();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = null;
    public final ArrayList h = null;
    public bhm i = new bhm();
    public bhm j = new bhm();
    public bhj k = null;
    public final int[] l = a;
    public ArrayList m;
    public ArrayList n;
    public final ArrayList o = new ArrayList();
    public ArrayList p = null;
    public bhg q;
    public bha r;
    public bgt s = t;
    private final String u = getClass().getName();
    private ArrayList v = null;
    private int x = 0;
    private boolean y = false;
    private boolean z = false;

    public Animator a(ViewGroup viewGroup, bhn bhn, bhn bhn2) {
        return null;
    }

    public abstract void a(bhn bhn);

    public String[] a() {
        return null;
    }

    public abstract void b(bhn bhn);

    public bgx a(long j) {
        this.c = j;
        return this;
    }

    public bgx b(long j) {
        this.b = j;
        return this;
    }

    public bgx a(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
        return this;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00df  */
    public void a(android.view.ViewGroup r21, defpackage.bhm r22, defpackage.bhm r23, java.util.ArrayList r24, java.util.ArrayList r25) {
        /*
        r20 = this;
        r6 = r20;
        r7 = defpackage.bgx.b();
        r8 = new android.util.SparseIntArray;
        r8.<init>();
        r9 = r24.size();
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r11 = 0;
    L_0x0015:
        if (r11 >= r9) goto L_0x0115;
    L_0x0017:
        r12 = r24;
        r2 = r12.get(r11);
        r2 = (defpackage.bhn) r2;
        r13 = r25;
        r3 = r13.get(r11);
        r3 = (defpackage.bhn) r3;
        if (r2 == 0) goto L_0x0033;
    L_0x0029:
        r5 = r2.c;
        r5 = r5.contains(r6);
        if (r5 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0033;
    L_0x0032:
        r2 = 0;
    L_0x0033:
        if (r3 == 0) goto L_0x003f;
    L_0x0035:
        r5 = r3.c;
        r5 = r5.contains(r6);
        if (r5 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x003f;
    L_0x003e:
        r3 = 0;
    L_0x003f:
        if (r2 != 0) goto L_0x0049;
    L_0x0041:
        if (r3 != 0) goto L_0x0049;
    L_0x0043:
        r14 = r21;
    L_0x0045:
        r18 = r9;
        goto L_0x010f;
    L_0x0049:
        if (r2 != 0) goto L_0x004e;
    L_0x004b:
        r14 = r21;
        goto L_0x0057;
    L_0x004e:
        if (r3 == 0) goto L_0x004b;
    L_0x0050:
        r5 = r6.a(r2, r3);
        if (r5 != 0) goto L_0x004b;
    L_0x0056:
        goto L_0x0043;
    L_0x0057:
        r5 = r6.a(r14, r2, r3);
        if (r5 == 0) goto L_0x0045;
    L_0x005d:
        if (r3 == 0) goto L_0x00d4;
    L_0x005f:
        r2 = r3.b;
        r3 = r20.a();
        if (r3 == 0) goto L_0x00cf;
    L_0x0067:
        r15 = r3.length;
        if (r15 <= 0) goto L_0x00cf;
    L_0x006a:
        r15 = new bhn;
        r15.<init>(r2);
        r10 = r23;
        r4 = r10.a;
        r4 = r4.get(r2);
        r4 = (defpackage.bhn) r4;
        r17 = r5;
        r18 = r9;
        if (r4 == 0) goto L_0x0099;
    L_0x007f:
        r5 = 0;
    L_0x0080:
        r9 = r3.length;
        if (r5 >= r9) goto L_0x0099;
    L_0x0083:
        r9 = r15.a;
        r10 = r3[r5];
        r19 = r3;
        r3 = r4.a;
        r3 = r3.get(r10);
        r9.put(r10, r3);
        r5 = r5 + 1;
        r10 = r23;
        r3 = r19;
        goto L_0x0080;
    L_0x0099:
        r3 = r7.b;
        r4 = 0;
    L_0x009c:
        if (r4 >= r3) goto L_0x00cb;
    L_0x009e:
        r5 = r7.b(r4);
        r5 = (android.animation.Animator) r5;
        r5 = r7.get(r5);
        r5 = (defpackage.bhb) r5;
        r9 = r5.c;
        if (r9 != 0) goto L_0x00af;
    L_0x00ae:
        goto L_0x00c8;
    L_0x00af:
        r9 = r5.a;
        if (r9 != r2) goto L_0x00c8;
    L_0x00b3:
        r9 = r5.b;
        r10 = r6.u;
        r9 = r9.equals(r10);
        if (r9 == 0) goto L_0x00c8;
    L_0x00bd:
        r5 = r5.c;
        r5 = r5.equals(r15);
        if (r5 == 0) goto L_0x00c8;
    L_0x00c5:
        r5 = r15;
        r9 = 0;
        goto L_0x00dd;
    L_0x00c8:
        r4 = r4 + 1;
        goto L_0x009c;
    L_0x00cb:
        r5 = r15;
        r9 = r17;
        goto L_0x00dd;
    L_0x00cf:
        r17 = r5;
        r18 = r9;
        goto L_0x00da;
    L_0x00d4:
        r17 = r5;
        r18 = r9;
        r2 = r2.b;
    L_0x00da:
        r9 = r17;
        r5 = 0;
    L_0x00dd:
        if (r9 == 0) goto L_0x010f;
    L_0x00df:
        r3 = r6.q;
        if (r3 == 0) goto L_0x00f5;
    L_0x00e3:
        r3 = r3.a();
        r10 = r6.A;
        r10 = r10.size();
        r15 = (int) r3;
        r8.put(r10, r15);
        r0 = java.lang.Math.min(r3, r0);
    L_0x00f5:
        r15 = r0;
        r10 = new bhb;
        r3 = r6.u;
        r4 = defpackage.bht.a(r21);
        r0 = r10;
        r1 = r2;
        r2 = r3;
        r3 = r20;
        r0.<init>(r1, r2, r3, r4, r5);
        r7.put(r9, r10);
        r0 = r6.A;
        r0.add(r9);
        r0 = r15;
    L_0x010f:
        r11 = r11 + 1;
        r9 = r18;
        goto L_0x0015;
    L_0x0115:
        r2 = r8.size();
        if (r2 == 0) goto L_0x013f;
    L_0x011b:
        r2 = 0;
    L_0x011c:
        r3 = r8.size();
        if (r2 >= r3) goto L_0x013f;
    L_0x0122:
        r3 = r8.keyAt(r2);
        r4 = r6.A;
        r3 = r4.get(r3);
        r3 = (android.animation.Animator) r3;
        r4 = r8.valueAt(r2);
        r4 = (long) r4;
        r4 = r4 - r0;
        r9 = r3.getStartDelay();
        r4 = r4 + r9;
        r3.setStartDelay(r4);
        r2 = r2 + 1;
        goto L_0x011c;
    L_0x013f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgx.a(android.view.ViewGroup, bhm, bhm, java.util.ArrayList, java.util.ArrayList):void");
    }

    /* Access modifiers changed, original: final */
    public final boolean b(View view) {
        int id = view.getId();
        ArrayList arrayList = this.v;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        if ((this.e.size() == 0 && this.f.size() == 0) || this.e.contains(Integer.valueOf(id)) || this.f.contains(view)) {
            return true;
        }
        return false;
    }

    public static zj b() {
        zj zjVar = (zj) w.get();
        if (zjVar != null) {
            return zjVar;
        }
        zjVar = new zj();
        w.set(zjVar);
        return zjVar;
    }

    /* Access modifiers changed, original: protected */
    public void c() {
        e();
        zj b = bgx.b();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (b.containsKey(animator)) {
                e();
                if (animator != null) {
                    animator.addListener(new bgz(this, b));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    j = this.b;
                    if (j >= 0) {
                        animator.setStartDelay(j + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new bgy(this));
                    animator.start();
                }
            }
        }
        this.A.clear();
        f();
    }

    public bgx c(View view) {
        this.f.add(view);
        return this;
    }

    public bgx a(int i) {
        this.e.add(Integer.valueOf(i));
        return this;
    }

    public bgx d(View view) {
        this.f.remove(view);
        return this;
    }

    public final bgx d() {
        ArrayList arrayList = this.v;
        Integer valueOf = Integer.valueOf(R.id.button_container);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(valueOf)) {
            arrayList.add(valueOf);
        }
        this.v = arrayList;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final void a(ViewGroup viewGroup, boolean z) {
        a(z);
        if (this.e.size() > 0 || this.f.size() > 0) {
            for (int i = 0; i < this.e.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.e.get(i)).intValue());
                if (findViewById != null) {
                    bhn bhn = new bhn(findViewById);
                    if (z) {
                        a(bhn);
                    } else {
                        b(bhn);
                    }
                    bhn.c.add(this);
                    c(bhn);
                    if (z) {
                        bgx.a(this.i, findViewById, bhn);
                    } else {
                        bgx.a(this.j, findViewById, bhn);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                View view = (View) this.f.get(i2);
                bhn bhn2 = new bhn(view);
                if (z) {
                    a(bhn2);
                } else {
                    b(bhn2);
                }
                bhn2.c.add(this);
                c(bhn2);
                if (z) {
                    bgx.a(this.i, view, bhn2);
                } else {
                    bgx.a(this.j, view, bhn2);
                }
            }
            return;
        }
        c(viewGroup, z);
    }

    private static void a(bhm bhm, View view, bhn bhn) {
        bhm.a.put(view, bhn);
        int id = view.getId();
        if (id >= 0) {
            if (bhm.b.indexOfKey(id) >= 0) {
                bhm.b.put(id, null);
            } else {
                bhm.b.put(id, view);
            }
        }
        String s = abe.s(view);
        if (s != null) {
            if (bhm.d.containsKey(s)) {
                bhm.d.put(s, null);
            } else {
                bhm.d.put(s, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (bhm.c.c(itemIdAtPosition) >= 0) {
                    view = (View) bhm.c.a(itemIdAtPosition);
                    if (view != null) {
                        abe.a(view, false);
                        bhm.c.b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                abe.a(view, true);
                bhm.c.b(itemIdAtPosition, view);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (z) {
            this.i.a.clear();
            this.i.b.clear();
            this.i.c.c();
            return;
        }
        this.j.a.clear();
        this.j.b.clear();
        this.j.c.c();
    }

    private final void c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList arrayList = this.v;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                if (view.getParent() instanceof ViewGroup) {
                    bhn bhn = new bhn(view);
                    if (z) {
                        a(bhn);
                    } else {
                        b(bhn);
                    }
                    bhn.c.add(this);
                    c(bhn);
                    if (z) {
                        bgx.a(this.i, view, bhn);
                    } else {
                        bgx.a(this.j, view, bhn);
                    }
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (id = 0; id < viewGroup.getChildCount(); id++) {
                        c(viewGroup.getChildAt(id), z);
                    }
                }
            }
        }
    }

    public final bhn a(View view, boolean z) {
        bhj bhj = this.k;
        if (bhj != null) {
            return bhj.a(view, z);
        }
        bhm bhm;
        if (z) {
            bhm = this.i;
        } else {
            bhm = this.j;
        }
        return (bhn) bhm.a.get(view);
    }

    /* Access modifiers changed, original: final */
    public final bhn b(View view, boolean z) {
        bhj bhj = this.k;
        if (bhj != null) {
            return bhj.b(view, z);
        }
        ArrayList arrayList;
        if (z) {
            arrayList = this.m;
        } else {
            arrayList = this.n;
        }
        bhn bhn = null;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                bhn bhn2 = (bhn) arrayList.get(i);
                if (bhn2 != null) {
                    if (bhn2.b == view) {
                        break;
                    }
                    i++;
                } else {
                    return null;
                }
            }
            i = -1;
            if (i >= 0) {
                ArrayList arrayList2;
                if (z) {
                    arrayList2 = this.n;
                } else {
                    arrayList2 = this.m;
                }
                bhn = (bhn) arrayList2.get(i);
            }
        }
        return bhn;
    }

    public void e(View view) {
        if (!this.z) {
            zj b = bgx.b();
            int i = b.b;
            bif a = bht.a(view);
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                bhb bhb = (bhb) b.c(i);
                if (bhb.a != null) {
                    if (a.equals(bhb.d)) {
                        ((Animator) b.b(i)).pause();
                    }
                }
            }
            ArrayList arrayList = this.p;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.p.clone();
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ((bhd) arrayList.get(i)).b();
                }
            }
            this.y = true;
        }
    }

    public void f(View view) {
        if (this.y) {
            if (!this.z) {
                zj b = bgx.b();
                int i = b.b;
                bif a = bht.a(view);
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    bhb bhb = (bhb) b.c(i);
                    if (bhb.a != null) {
                        if (a.equals(bhb.d)) {
                            ((Animator) b.b(i)).resume();
                        }
                    }
                }
                ArrayList arrayList = this.p;
                if (arrayList != null && arrayList.size() > 0) {
                    arrayList = (ArrayList) this.p.clone();
                    int size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        ((bhd) arrayList.get(i)).c();
                    }
                }
            }
            this.y = false;
        }
    }

    public boolean a(bhn bhn, bhn bhn2) {
        if (bhn == null || bhn2 == null) {
            return false;
        }
        String[] a = a();
        if (a != null) {
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!bgx.a(bhn, bhn2, a[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a2 : bhn.a.keySet()) {
            if (bgx.a(bhn, bhn2, a2)) {
            }
        }
        return false;
        return true;
    }

    private static boolean a(bhn bhn, bhn bhn2, String str) {
        Object obj = bhn.a.get(str);
        Object obj2 = bhn2.a.get(str);
        boolean z = true;
        if (obj == null && obj2 == null) {
            z = false;
        } else if (!(obj == null || obj2 == null)) {
            return obj.equals(obj2) ^ 1;
        }
        return z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        if (this.x == 0) {
            ArrayList arrayList = this.p;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.p.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((bhd) arrayList.get(i)).d();
                }
            }
            this.z = false;
        }
        this.x++;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            View view;
            ArrayList arrayList = this.p;
            if (arrayList != null && arrayList.size() > 0) {
                arrayList = (ArrayList) this.p.clone();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((bhd) arrayList.get(i2)).a(this);
                }
            }
            for (i = 0; i < this.i.c.b(); i++) {
                view = (View) this.i.c.c(i);
                if (view != null) {
                    abe.a(view, false);
                }
            }
            for (i = 0; i < this.j.c.b(); i++) {
                view = (View) this.j.c.c(i);
                if (view != null) {
                    abe.a(view, false);
                }
            }
            this.z = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(ViewGroup viewGroup) {
        aac b = bgx.b();
        int i = b.b;
        if (viewGroup != null && i != 0) {
            bif a = bht.a(viewGroup);
            zj zjVar = new zj(b);
            b.clear();
            while (true) {
                i--;
                if (i >= 0) {
                    bhb bhb = (bhb) zjVar.c(i);
                    if (bhb.a != null) {
                        if (a.equals(bhb.d)) {
                            ((Animator) zjVar.b(i)).end();
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public bgx a(bhd bhd) {
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(bhd);
        return this;
    }

    public bgx b(bhd bhd) {
        ArrayList arrayList = this.p;
        if (arrayList != null) {
            arrayList.remove(bhd);
            if (this.p.size() == 0) {
                this.p = null;
            }
        }
        return this;
    }

    public void a(bgt bgt) {
        if (bgt == null) {
            this.s = t;
        } else {
            this.s = bgt;
        }
    }

    public void a(bha bha) {
        this.r = bha;
    }

    public void a(bhg bhg) {
        this.q = bhg;
    }

    /* Access modifiers changed, original: 0000 */
    public void c(bhn bhn) {
        if (this.q != null && !bhn.a.isEmpty()) {
            String[] c = this.q.c();
            if (c != null) {
                int i = 0;
                while (i < c.length) {
                    if (bhn.a.containsKey(c[i])) {
                        i++;
                    } else {
                        this.q.b();
                        return;
                    }
                }
            }
        }
    }

    public final String toString() {
        return a("");
    }

    /* renamed from: g */
    public bgx clone() {
        try {
            bgx bgx = (bgx) super.clone();
            bgx.A = new ArrayList();
            bgx.i = new bhm();
            bgx.j = new bhm();
            bgx.m = null;
            bgx.n = null;
            return bgx;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public String a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(": ");
        str = stringBuilder.toString();
        String str2 = ") ";
        if (this.c != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dur(");
            stringBuilder.append(this.c);
            stringBuilder.append(str2);
            str = stringBuilder.toString();
        }
        if (this.b != -1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("dly(");
            stringBuilder.append(this.b);
            stringBuilder.append(str2);
            str = stringBuilder.toString();
        }
        if (this.d != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("interp(");
            stringBuilder.append(this.d);
            stringBuilder.append(str2);
            str = stringBuilder.toString();
        }
        if (this.e.size() <= 0 && this.f.size() <= 0) {
            return str;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("tgts(");
        str = stringBuilder.toString();
        String str3 = ", ";
        if (this.e.size() > 0) {
            String str4 = str;
            for (int i = 0; i < this.e.size(); i++) {
                StringBuilder stringBuilder2;
                if (i > 0) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str4);
                    stringBuilder2.append(str3);
                    str4 = stringBuilder2.toString();
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str4);
                stringBuilder2.append(this.e.get(i));
                str4 = stringBuilder2.toString();
            }
            str = str4;
        }
        if (this.f.size() > 0) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                if (i2 > 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(str3);
                    str = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.f.get(i2));
                str = stringBuilder.toString();
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
