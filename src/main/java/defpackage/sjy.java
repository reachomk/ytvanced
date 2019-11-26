package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.youtube.R;

/* renamed from: sjy */
public final class sjy {
    public static void a(Context context, String str) {
        Uri parse = Uri.parse(str);
        aud a = new auc().a();
        String a2 = bcip.a(context);
        if (!TextUtils.isEmpty(a2)) {
            try {
                a.a.setPackage(a2);
                a.a(context, parse);
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        if (context.getPackageManager().resolveActivity(intent, 0) != null) {
            try {
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused2) {
            }
        }
        Toast.makeText(context, R.string.gdi_unable_to_open_uri, 0).show();
    }
}
