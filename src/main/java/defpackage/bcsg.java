package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bcsg */
final class bcsg implements bcsv, bcsz {
    public final bcsz[] a;
    public final bcsv[] b;
    private final int c;
    private final int d;

    bcsg(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        int i2 = 0;
        for (i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof bcsg) {
                bcsg.a(arrayList, ((bcsg) obj).a);
            } else {
                arrayList.add(obj);
            }
            obj = list.get(i + 1);
            if (obj instanceof bcsg) {
                bcsg.a(arrayList2, ((bcsg) obj).b);
            } else {
                arrayList2.add(obj);
            }
        }
        if (arrayList.contains(null) || arrayList.isEmpty()) {
            this.a = null;
            this.c = 0;
        } else {
            size = arrayList.size();
            this.a = new bcsz[size];
            int i3 = 0;
            for (i = 0; i < size; i++) {
                bcsz bcsz = (bcsz) arrayList.get(i);
                i3 += bcsz.a();
                this.a[i] = bcsz;
            }
            this.c = i3;
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.b = null;
            this.d = 0;
            return;
        }
        int size2 = arrayList2.size();
        this.b = new bcsv[size2];
        int i4 = 0;
        while (i2 < size2) {
            bcsv bcsv = (bcsv) arrayList2.get(i2);
            i4 += bcsv.b();
            this.b[i2] = bcsv;
            i2++;
        }
        this.d = i4;
    }

    public final int a() {
        return this.c;
    }

    public final void a(StringBuffer stringBuffer, long j, bcpl bcpl, int i, bcpt bcpt, Locale locale) {
        bcsz[] bcszArr = this.a;
        if (bcszArr != null) {
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (bcsz a : bcszArr) {
                a.a(stringBuffer, j, bcpl, i, bcpt, locale2);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int b() {
        return this.d;
    }

    public final int a(bcsu bcsu, String str, int i) {
        bcsv[] bcsvArr = this.b;
        if (bcsvArr != null) {
            int length = bcsvArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = bcsvArr[i2].a(bcsu, str, i);
            }
            return i;
        }
        throw new UnsupportedOperationException();
    }

    private static void a(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object add : objArr) {
                list.add(add);
            }
        }
    }
}
