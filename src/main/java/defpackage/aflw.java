package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aflw */
public final class aflw implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public aflw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static List a(aftu aftu, afsa afsa, afsa afsa2) {
        Object arrayList = new ArrayList();
        arrayList.add(aftu);
        if (afsa != null) {
            arrayList.add(afsa);
        }
        if (afsa2 != null) {
            arrayList.add(afsa2);
        }
        return (List) baqd.a(arrayList, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aflw.a((aftu) this.a.get(), (afsa) this.b.get(), (afsa) this.c.get());
    }
}
