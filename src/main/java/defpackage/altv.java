package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: altv */
final /* synthetic */ class altv implements anij {
    private final amro a;

    altv(amro amro) {
        this.a = amro;
    }

    public final anjv a() {
        List<File> list = (List) this.a.get();
        if (!list.isEmpty()) {
            List arrayList = new ArrayList();
            arrayList.add("rm");
            arrayList.add("-r");
            Object obj = null;
            for (File file : list) {
                if (file.exists()) {
                    arrayList.add(file.getAbsolutePath());
                    obj = 1;
                }
            }
            if (obj != null) {
                altr.a(arrayList);
            }
        }
        return anjf.a(null);
    }
}
