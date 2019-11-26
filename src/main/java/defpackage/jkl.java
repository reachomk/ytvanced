package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jkl */
final /* synthetic */ class jkl implements xar {
    private final jkj a;

    jkl(jkj jkj) {
        this.a = jkj;
    }

    public final void accept(Object obj) {
        jkj jkj = this.a;
        List list = (List) obj;
        if (jkj.l) {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, jkk.a);
            jkj.b();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jkj.a((amea) arrayList.get(i));
            }
        }
    }
}
