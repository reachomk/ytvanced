package com.google.android.youtube.api.service;

import android.os.Bundle;
import android.os.Handler;
import defpackage.amkr;
import defpackage.deq;
import defpackage.der;
import defpackage.mlp;

public class EmbedFirebaseJobDispatcherService extends deq {
    public final boolean a() {
        return true;
    }

    public final boolean a(der der) {
        Bundle h = der.h();
        if (h != null) {
            String string = h.getString("package_name", null);
            String string2 = h.getString("version_name", null);
            String string3 = h.getString("developer_key", null);
            String string4 = h.getString("client_library_version_name", null);
            String str = "is_internal_application_with_sign_in";
            boolean containsKey = h.containsKey(str);
            if (!(string == null || string2 == null || string3 == null || string4 == null || !containsKey)) {
                mlp.a(true, new amkr(this, der), new Handler(getMainLooper()), this, string3, string, string2, string4, h.getBoolean(str));
                return true;
            }
        }
        return false;
    }
}
