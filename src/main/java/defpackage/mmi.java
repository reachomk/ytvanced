package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: mmi */
public final class mmi implements baqa {
    private final bcaa a;

    public mmi(bcaa bcaa) {
        this.a = bcaa;
    }

    public final /* synthetic */ Object get() {
        aftu aftu = (aftu) this.a.get();
        Object arrayList = new ArrayList();
        arrayList.add(aftu);
        return (List) baqd.a(arrayList, "Cannot return null from a non-@Nullable @Provides method");
    }
}
