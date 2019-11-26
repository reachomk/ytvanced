package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: uqk */
public final class uqk {
    public final SharedPreferences a;
    public final SharedPreferences b;
    public final utv c;
    public final utc d;
    public final uzn e;
    public final uys f;
    public final xci g;

    public uqk(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, utv utv, utc utc, uzn uzn, uys uys, xci xci) {
        this.a = sharedPreferences;
        this.b = sharedPreferences2;
        this.c = utv;
        this.d = utc;
        this.e = uzn;
        this.f = uys;
        this.g = xci;
    }

    public final int a(int i, int i2, String str) {
        tbe tbe;
        List a = this.e.c.a(i, str);
        ArrayList arrayList = new ArrayList(a.size());
        ListIterator listIterator = a.listIterator(a.size());
        while (listIterator.hasPrevious()) {
            tbe = (tbe) listIterator.previous();
            if (i2 != -1 && tbe.c() >= i2) {
                break;
            }
            arrayList.add(tbe);
        }
        i2 = arrayList.size();
        int i3 = 0;
        int i4 = i;
        while (i3 < i2) {
            tbe = (tbe) arrayList.get(i3);
            int c = tbe.c();
            if (tbe.b() == 3) {
                String a2 = tbe.a();
                a(i, c, a2);
                this.c.a(a2, str);
            }
            i3++;
            i4 = c;
        }
        return i4;
    }
}
