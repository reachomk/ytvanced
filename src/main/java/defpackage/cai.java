package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* renamed from: cai */
public final class cai implements bzq {
    private final bzq a;

    public cai(bzq bzq) {
        this.a = bzq;
    }

    private static Uri a(String str) {
        return Uri.fromFile(new File(str));
    }

    public final /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            obj = null;
        } else if (str.charAt(0) == '/') {
            obj = cai.a(str);
        } else {
            Uri parse = Uri.parse(str);
            obj = parse.getScheme() == null ? cai.a(str) : parse;
        }
        if (obj != null && this.a.a(obj)) {
            return this.a.a(obj, i, i2, bsq);
        }
        return null;
    }
}
