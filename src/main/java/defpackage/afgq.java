package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: afgq */
public final class afgq {
    public static final afgq a = new afgq(-1, -1);
    public final int b;
    public final int c;
    public final int d;

    public afgq(int i, int i2) {
        this(i, i2, 0);
    }

    public afgq(int i, int i2, int i3) {
        amqw.a(i >= i2);
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean a() {
        return this.d == 1;
    }

    public final boolean b() {
        return this.d == 2;
    }

    public final boolean c() {
        return this.d == 3;
    }

    public final int a(int i) {
        if (this.b < i || i < this.c) {
            return i >= this.c ? 1 : -1;
        } else {
            return 0;
        }
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (aahr aahr : list) {
            int a = a(aahr.u());
            if (a == -1) {
                arrayList2.add(aahr);
            } else if (a == 0) {
                arrayList.add(aahr);
            } else if (a == 1) {
                arrayList3.add(aahr);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        if (!arrayList3.isEmpty()) {
            int i = 0;
            aahr aahr2 = (aahr) arrayList3.get(0);
            int size = arrayList3.size();
            while (i < size) {
                aahr aahr3 = (aahr) arrayList3.get(i);
                if (aahr3.u() < aahr2.u()) {
                    aahr2 = aahr3;
                }
                i++;
            }
            arrayList.add(aahr2);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afgq) {
            afgq afgq = (afgq) obj;
            if (this.b == afgq.b && this.c == afgq.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b + 527) * 31) * this.c;
    }
}
