package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: akxp */
final /* synthetic */ class akxp implements Callable {
    private final int a;
    private final int b = 0;
    private final List c;
    private final Object[] d;

    akxp(int i, List list, Object[] objArr) {
        this.a = i;
        this.c = list;
        this.d = objArr;
    }

    public final Object call() {
        int i = this.a;
        List list = this.c;
        Object[] objArr = this.d;
        Iterable arrayList = new ArrayList(i);
        arrayList.getClass();
        akxr akxr = new akxr(arrayList);
        for (int i2 = 0; i2 < i; i2++) {
            ((akxt) list.get(i2)).a(objArr[i2], akxr);
        }
        return bbmi.a(arrayList);
    }
}
