package com.google.android.libraries.youtube.common.gcore.gcoreclient.gcm.impl;

import defpackage.qfb;
import defpackage.qfk;
import defpackage.xds;
import defpackage.xdt;
import defpackage.xdv;
import defpackage.xew;
import defpackage.xse;

public class GcmTaskServiceDelegator extends qfb {
    private xdt e;

    public final void onCreate() {
        super.onCreate();
        xds pp = ((xdv) xse.a(getApplication())).pp();
        Class a = pp.a();
        try {
            this.e = (xdt) pp.a().newInstance();
            this.e.a(getApplicationContext());
        } catch (IllegalAccessException | InstantiationException unused) {
            String name = a.getName();
            String str = "Could not instantiate ";
            throw new IllegalStateException(name.length() == 0 ? new String(str) : str.concat(name));
        }
    }

    public final int a(qfk qfk) {
        int a = this.e.a(new xew(qfk));
        if (a == 0) {
            return 0;
        }
        int i = 1;
        if (a != 1) {
            i = 2;
            if (a != 2) {
                return a;
            }
        }
        return i;
    }
}
