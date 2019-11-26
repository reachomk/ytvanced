package defpackage;

import java.util.ArrayList;

/* renamed from: ikk */
final /* synthetic */ class ikk implements bbnv {
    private final String a;

    ikk(String str) {
        this.a = str;
    }

    public final Object a(Object obj) {
        String str = this.a;
        ArrayList arrayList = new ArrayList(((aveh) obj).getSelectedVideoIds());
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        } else {
            arrayList.add(str);
        }
        return arrayList;
    }
}
