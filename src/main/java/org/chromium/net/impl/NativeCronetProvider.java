package org.chromium.net.impl;

import android.content.Context;
import defpackage.bcjc;
import defpackage.bcjg;
import defpackage.bcjk;
import defpackage.bcoh;
import java.util.Arrays;

public class NativeCronetProvider extends bcjg {
    public NativeCronetProvider(Context context) {
        super(context);
    }

    public final String b() {
        return "App-Packaged-Cronet-Provider";
    }

    public final String c() {
        return "76.0.3786.0";
    }

    public final boolean d() {
        return true;
    }

    public final bcjc a() {
        return new bcjk(new bcoh(this.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.a});
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof NativeCronetProvider)) {
                z = false;
            } else if (this.a.equals(((NativeCronetProvider) obj).a)) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }
}
