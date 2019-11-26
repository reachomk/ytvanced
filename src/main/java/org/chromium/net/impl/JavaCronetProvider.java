package org.chromium.net.impl;

import android.content.Context;
import defpackage.bcjc;
import defpackage.bcjg;
import defpackage.bcjk;
import defpackage.bcmu;
import java.util.Arrays;

public class JavaCronetProvider extends bcjg {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    public final String b() {
        return "Fallback-Cronet-Provider";
    }

    public final String c() {
        return "76.0.3786.0";
    }

    public final boolean d() {
        return true;
    }

    public final bcjc a() {
        return new bcjk(new bcmu(this.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.a});
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof JavaCronetProvider)) {
                z = false;
            } else if (this.a.equals(((JavaCronetProvider) obj).a)) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }
}
