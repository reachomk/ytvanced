package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentDiscoveryService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: annx */
public final class annx implements anoa {
    private annx() {
    }

    public final /* synthetic */ List a(Object obj) {
        String str = "ComponentDiscovery";
        Context context = (Context) obj;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w(str, "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w(str, "ComponentDiscoveryService has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (NameNotFoundException unused) {
            Log.w(str, "Application info not found.");
        }
        if (bundle != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
            return arrayList;
        }
        Log.w(str, "Could not retrieve metadata, returning empty list of registrars.");
        return Collections.emptyList();
    }

    public /* synthetic */ annx(byte b) {
    }
}
