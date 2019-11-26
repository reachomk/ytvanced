package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: acjm */
public final class acjm {
    public static boolean a(Intent intent) {
        return (intent == null || acjm.b(intent) == null) ? false : true;
    }

    public static Uri b(Intent intent) {
        String str = "android.intent.extra.REFERRER";
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        String stringExtra = intent.getStringExtra(str);
        Uri parse = (parcelableExtra == null || !(parcelableExtra instanceof Uri)) ? stringExtra != null ? Uri.parse(stringExtra) : null : (Uri) parcelableExtra;
        if (parse != null) {
            if (!"android-app".equals(parse.getScheme()) || TextUtils.isEmpty(parse.getPath())) {
                return null;
            }
            return parse;
        }
        return null;
    }
}
