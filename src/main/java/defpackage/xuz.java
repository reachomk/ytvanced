package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xuz */
public final class xuz {
    public static Intent a() {
        return new Intent().setAction("android.intent.action.SEND").setType("text/plain").setFlags(524288);
    }

    public static List a(PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(xuz.a(), 65536)) {
            if (!(resolveInfo == null || resolveInfo.activityInfo == null || resolveInfo.activityInfo.name == null || resolveInfo.activityInfo.applicationInfo == null || resolveInfo.activityInfo.applicationInfo.packageName == null)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public static void a(Context context, String str, Uri uri) {
        Intent b = xuz.b(context, str, uri);
        if (b == null) {
            xtl.d("Share video error: null watch uri");
        } else {
            context.startActivity(b);
        }
    }

    public static Intent b(Context context, String str, Uri uri) {
        str = xvd.e(str);
        uri = xvt.d(uri);
        if (uri == null) {
            return null;
        }
        Intent createChooser = Intent.createChooser(xuz.e(context, str, uri), context.getText(R.string.send_video));
        createChooser.addFlags(268435456);
        createChooser.addFlags(262144);
        return createChooser;
    }

    public static void c(Context context, String str, Uri uri) {
        Intent d = xuz.d(context, str, uri);
        if (d == null) {
            xtl.d("Share playlist error: empty playlist url");
        } else {
            context.startActivity(d);
        }
    }

    public static Intent d(Context context, String str, Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent createChooser = Intent.createChooser(xuz.e(context, str, uri), context.getText(R.string.send_playlist));
        createChooser.addFlags(268435456);
        createChooser.addFlags(262144);
        return createChooser;
    }

    private static Intent e(Context context, String str, Uri uri) {
        if (str == null) {
            str = context.getString(R.string.share_untitled);
        }
        str = yx.a().a(str);
        Intent a = xuz.a();
        String string = context.getString(R.string.share_subject, new Object[]{str});
        String string2 = context.getString(R.string.share_text, new Object[]{str, uri});
        a.putExtra("android.intent.extra.SUBJECT", string);
        a.putExtra("android.intent.extra.TEXT", string2);
        return a;
    }
}
