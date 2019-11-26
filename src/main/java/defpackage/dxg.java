package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint;
import java.util.Map;

/* renamed from: dxg */
public final class dxg implements aaap {
    private final Context a;

    public dxg(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        Intent b;
        anxr access$000 = anxl.checkIsLite(AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.androidOsApplicationSettingsEndpoint);
        apxu.a(access$000);
        Object b2 = apxu.h.b(access$000.d);
        if (b2 == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b2);
        }
        int a = aoub.a(((AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint) obj).b);
        if (a == 0) {
            a = 1;
        }
        if (a == 2) {
            b = b();
        } else if (a != 3) {
            b = a();
        } else {
            access$000 = anxl.checkIsLite(AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.androidOsApplicationSettingsEndpoint);
            apxu.a(access$000);
            Object b3 = apxu.h.b(access$000.d);
            if (b3 == null) {
                b3 = access$000.b;
            } else {
                b3 = access$000.a(b3);
            }
            String str = ((AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint) b3).c;
            if (VERSION.SDK_INT < 26 || TextUtils.isEmpty(str)) {
                b = b();
            } else {
                Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", this.a.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", str);
                b = intent;
            }
        }
        b.addFlags(268435456);
        this.a.startActivity(b);
    }

    private final Intent a() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        String valueOf = String.valueOf(this.a.getPackageName());
        String str = "package:";
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String(str) : str.concat(valueOf)));
        return intent;
    }

    private final Intent b() {
        Intent intent = new Intent();
        if (VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", this.a.getPackageName());
            return intent;
        } else if (VERSION.SDK_INT < 21) {
            return a();
        } else {
            intent.setClassName("com.android.settings", "com.android.settings.Settings$AppNotificationSettingsActivity");
            intent.putExtra("app_package", this.a.getPackageName());
            intent.putExtra("app_uid", this.a.getApplicationInfo().uid);
            return intent;
        }
    }
}
