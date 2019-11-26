package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ahio */
public final class ahio implements acxz {
    public final /* synthetic */ Map a(Object obj) {
        int i = ((aiob) obj).a;
        int i2 = i - 1;
        if (i != 0) {
            obj = "jp";
            switch (i2) {
                case 0:
                    obj = "st";
                    break;
                case 1:
                    obj = "n";
                    break;
                case 2:
                    obj = "p";
                    break;
                case 3:
                    obj = "ap";
                    break;
                case 4:
                    obj = "an";
                    break;
                case 5:
                    obj = "rt";
                    break;
                case 6:
                case 7:
                    break;
                default:
                    obj = null;
                    break;
            }
            if (obj == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("yt_wt", obj);
            return hashMap;
        }
        throw null;
    }
}
