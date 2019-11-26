package defpackage;

import android.util.Log;

/* renamed from: agu */
final class agu implements ahr {
    private final /* synthetic */ agv a;

    agu(agv agv) {
        this.a = agv;
    }

    public final void a(int i, int i2) {
        if (a(i)) {
            agv agv = this.a;
            agv.i = i2;
            agv.d.a();
            agv = this.a;
            agv.j = agv.k;
            for (i2 = 0; i2 < this.a.e.b.size(); i2++) {
                agv agv2 = this.a;
                agv2.g.a((aht) agv2.e.b.valueAt(i2));
            }
            this.a.e.b.clear();
            agv agv3 = this.a;
            agv3.h = false;
            agv3.c();
        }
    }

    public final void a(int i, aht aht) {
        if (a(i)) {
            aht aht2;
            ahq ahq = this.a.e;
            int indexOfKey = ahq.b.indexOfKey(aht.b);
            if (indexOfKey < 0) {
                ahq.b.put(aht.b, aht);
                aht2 = null;
            } else {
                aht aht3 = (aht) ahq.b.valueAt(indexOfKey);
                ahq.b.setValueAt(indexOfKey, aht);
                if (ahq.c == aht3) {
                    ahq.c = aht;
                }
                aht2 = aht3;
            }
            if (aht2 != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("duplicate tile @");
                stringBuilder.append(aht2.b);
                Log.e("AsyncListUtil", stringBuilder.toString());
                this.a.g.a(aht2);
            }
            i = aht.b + aht.c;
            indexOfKey = 0;
            while (indexOfKey < this.a.l.size()) {
                int keyAt = this.a.l.keyAt(indexOfKey);
                if (aht.b <= keyAt && keyAt < i) {
                    this.a.l.removeAt(indexOfKey);
                    this.a.d.a(keyAt);
                } else {
                    indexOfKey++;
                }
            }
            return;
        }
        this.a.g.a(aht);
    }

    public final void b(int i, int i2) {
        if (a(i)) {
            ahq ahq = this.a.e;
            aht aht = (aht) ahq.b.get(i2);
            if (ahq.c == aht) {
                ahq.c = null;
            }
            ahq.b.delete(i2);
            if (aht == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("tile not found @");
                stringBuilder.append(i2);
                Log.e("AsyncListUtil", stringBuilder.toString());
                return;
            }
            this.a.g.a(aht);
        }
    }

    private final boolean a(int i) {
        return i == this.a.k;
    }
}
