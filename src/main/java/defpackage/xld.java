package defpackage;

import java.io.IOException;

/* renamed from: xld */
public final class xld extends IOException {
    public xld(String str) {
        super(str);
    }

    public xld(nlg nlg) {
        String valueOf = String.valueOf(nlg.a);
        String str = "Blocked by rule: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        super(valueOf);
    }
}
