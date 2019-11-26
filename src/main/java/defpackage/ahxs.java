package defpackage;

import android.content.SharedPreferences;
import com.google.vr.sdk.base.HeadsetSelector.HeadsetInfo;

/* renamed from: ahxs */
public final class ahxs {
    private static final String e = ahxs.class.getSimpleName();
    public SharedPreferences a;
    public final ahxu b = new ahxu();
    public ahxc c;
    public nn d;
    private final ahxo f = new ahxo();
    private boolean g;

    public final boolean a() {
        xak.a();
        nn nnVar = this.d;
        if (nnVar != null) {
            SharedPreferences sharedPreferences = this.a;
            if (sharedPreferences != null) {
                if (this.g) {
                    this.g = false;
                    return false;
                } else if (ahxp.a(nnVar, sharedPreferences).size() < 2) {
                    xtl.c(e, "Less than 2 viewers available. Skipping showing the speed bump.");
                    return b();
                } else {
                    ahxo ahxo = this.f;
                    nn nnVar2 = this.d;
                    if (!(ahxo.F_() || ahxo.v())) {
                        ahxo.aa = this;
                        ahxo.a(nnVar2.f(), ahxo.Z);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        nn nnVar = this.d;
        if (nnVar != null) {
            SharedPreferences sharedPreferences = this.a;
            if (sharedPreferences != null) {
                HeadsetInfo b = ahxp.b(nnVar, sharedPreferences);
                String str = e;
                String valueOf = String.valueOf(b.getDisplayName());
                String str2 = "Current viewer: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                xtl.c(str, valueOf);
                int a = ahxp.a(b);
                if (a != 0) {
                    int i = a - 1;
                    if (i == 1 || i == 2) {
                        this.g = true;
                        ahxc ahxc = this.c;
                        if (ahxc != null) {
                            ahxc.a(a);
                        }
                    } else {
                        this.g = true;
                        ahxc ahxc2 = this.c;
                        if (ahxc2 != null) {
                            ahxc2.c();
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
