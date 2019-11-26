package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: apu */
public class apu {
    public int a = 0;
    private final SparseArray b = new SparseArray();

    public final void a() {
        for (int i = 0; i < this.b.size(); i++) {
            ((apx) this.b.valueAt(i)).a.clear();
        }
    }

    public aqj a(int i) {
        apx apx = (apx) this.b.get(i);
        if (apx != null && !apx.a.isEmpty()) {
            ArrayList arrayList = apx.a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (!((aqj) arrayList.get(size)).o()) {
                    return (aqj) arrayList.remove(size);
                }
            }
        }
        return null;
    }

    public void a(aqj aqj) {
        int i = aqj.f;
        ArrayList arrayList = b(i).a;
        if (((apx) this.b.get(i)).b > arrayList.size()) {
            aqj.r();
            arrayList.add(aqj);
        }
    }

    static long a(long j, long j2) {
        return j != 0 ? ((j / 4) * 3) + (j2 / 4) : j2;
    }

    public final void b() {
        this.a++;
    }

    public final void c() {
        this.a--;
    }

    public final apx b(int i) {
        apx apx = (apx) this.b.get(i);
        if (apx != null) {
            return apx;
        }
        apx = new apx();
        this.b.put(i, apx);
        return apx;
    }
}
