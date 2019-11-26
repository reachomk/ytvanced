package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: wzh */
public final /* synthetic */ class wzh {
    public static anjz a(int i, int i2, String str, Collection collection) {
        str = String.valueOf(str);
        String str2 = "yt-";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        xaf xaf = new xaf(i2, str);
        if (collection == null || collection.isEmpty()) {
            return ankc.a(new ScheduledThreadPoolExecutor(i, xaf));
        }
        ScheduledExecutorService xal = new xal(i, xaf);
        ArrayList arrayList = new ArrayList(collection);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            xal.a((xai) arrayList.get(i3));
        }
        return ankc.a(xal);
    }
}
