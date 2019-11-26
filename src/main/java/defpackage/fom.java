package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.youtube.R;

/* renamed from: fom */
public final class fom {
    public static void a(Context context, Uri uri) {
        if (!wxk.a(context, uri)) {
            xpr.a(context, (int) R.string.error_no_activity_for_uri, 0);
        }
    }
}
