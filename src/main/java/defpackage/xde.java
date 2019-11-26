package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.os.Bundle;

/* renamed from: xde */
public class xde extends rc {
    private final int a;

    public xde(int i) {
        this.a = i;
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        PackageManager packageManager = context.getPackageManager();
        String str = "android.support.FILE_PROVIDER_PATHS";
        XmlResourceParser loadXmlMetaData = packageManager.resolveContentProvider(providerInfo.authority, 128).loadXmlMetaData(packageManager, str);
        boolean z = false;
        boolean z2 = loadXmlMetaData == null || VERSION.SDK_INT <= 23;
        String str2 = "FileProviderCompat";
        if (z2) {
            if (loadXmlMetaData == null) {
                z = true;
            }
            StringBuilder stringBuilder = new StringBuilder(55);
            stringBuilder.append("isPatchingNecessary returned true and in == null: ");
            stringBuilder.append(z);
            xtl.b(str2, stringBuilder.toString());
        }
        if (z2) {
            Bundle bundle = new Bundle(1);
            bundle.putInt(str, this.a);
            context = new xdd(context, new xdg(context.getPackageManager(), new xdf(providerInfo.authority, bundle)));
        }
        try {
            super.attachInfo(context, providerInfo);
        } catch (IllegalArgumentException e) {
            StringBuilder stringBuilder2 = new StringBuilder(49);
            stringBuilder2.append("patch needed: ");
            stringBuilder2.append(z2);
            stringBuilder2.append(" but we still got an exception");
            xtl.a(str2, stringBuilder2.toString(), e);
            throw e;
        }
    }
}
