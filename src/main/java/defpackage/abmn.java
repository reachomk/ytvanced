package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abmn */
public final class abmn {
    public static List a(ajya ajya) {
        ArrayList arrayList = new ArrayList();
        for (awjn awjn : ajya.k) {
            int i = awjn.a;
            Object obj;
            if ((i & 1) != 0) {
                obj = awjn.b;
                if (obj == null) {
                    obj = avkc.f;
                }
                arrayList.add(ajtj.a(obj));
            } else if ((i & 4) != 0) {
                obj = awjn.d;
                if (obj == null) {
                    obj = awnh.d;
                }
                arrayList.add(ajtj.a(obj));
            } else if ((i & 2) != 0) {
                obj = awjn.c;
                if (obj == null) {
                    obj = avkg.e;
                }
                arrayList.add(ajtj.a(obj));
            } else if ((i & 8) != 0) {
                obj = awjn.e;
                if (obj == null) {
                    obj = awzv.d;
                }
                arrayList.add(ajtj.a(obj));
            }
        }
        return arrayList;
    }

    public static Uri b(ajya ajya) {
        return !TextUtils.isEmpty(ajya.i) ? Uri.parse(ajya.i) : null;
    }
}
