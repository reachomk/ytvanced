package defpackage;

import android.text.TextUtils;

/* renamed from: sqj */
final class sqj implements sxm {
    sqj() {
    }

    public final aobz a() {
        return bdga.a;
    }

    public final /* synthetic */ void a(cmg cmg, Object obj, swn swn) {
        CharSequence stringBuilder;
        bdga bdga = (bdga) obj;
        clz a = swn.a();
        int isEmpty = TextUtils.isEmpty(bdga.c) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(bdga.b) ^ 1;
        if (isEmpty != 0 && isEmpty2 != 0) {
            String str = bdga.b;
            String str2 = bdga.c;
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
            stringBuilder2.append(str);
            stringBuilder2.append(" ");
            stringBuilder2.append(str2);
            stringBuilder = stringBuilder2.toString();
        } else if (isEmpty != 0) {
            stringBuilder = bdga.c;
        } else if (isEmpty2 != 0) {
            stringBuilder = bdga.b;
        } else {
            stringBuilder = null;
        }
        if (!TextUtils.isEmpty(bdga.d)) {
            a.b(bdga.d);
        }
        if (stringBuilder != null) {
            a.a(stringBuilder);
        }
        if (bdga.e) {
            a.a(true);
        }
    }
}
