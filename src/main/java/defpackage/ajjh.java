package defpackage;

import android.text.Html;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ajjh */
public final class ajjh implements afqj {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    private final List c = new ArrayList();

    public final ajjh a(String str, long j, long j2) {
        if (!this.c.isEmpty()) {
            List list = this.c;
            if (j < ((Long) list.get(list.size() - 1)).longValue()) {
                xtl.d("subtitles are not given in non-decreasing start time order");
            }
        }
        this.c.add(Long.valueOf(j));
        this.a.add(Long.valueOf(j2));
        this.b.add(str);
        return this;
    }

    /* renamed from: a */
    public final ajje b() {
        List list = this.c;
        List list2 = this.a;
        List<String> list3 = this.b;
        ArrayList arrayList = new ArrayList(list3.size());
        for (String fromHtml : list3) {
            arrayList.add(Html.fromHtml(fromHtml));
        }
        return new ajje(list, list2, arrayList);
    }
}
