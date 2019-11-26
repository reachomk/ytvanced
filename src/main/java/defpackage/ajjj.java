package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: ajjj */
public final class ajjj implements afqj {
    private final SparseArray a = new SparseArray();

    public final ajjj a(int i, String str, int i2, int i3) {
        a(i).a(str, i2, i3);
        return this;
    }

    public final ajiz a(int i) {
        ajiz ajiz = (ajiz) this.a.get(i);
        if (ajiz != null) {
            return ajiz;
        }
        ajiz = new ajiz(i);
        this.a.put(i, ajiz);
        return ajiz;
    }

    public final /* synthetic */ Object b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            arrayList.add((ajiw) ((ajiz) this.a.valueAt(i)).b());
        }
        return new ajjg(arrayList);
    }
}
