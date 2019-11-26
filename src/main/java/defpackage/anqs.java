package defpackage;

import java.util.Locale;

/* renamed from: anqs */
public final class anqs extends Exception {
    public anqs(String str) {
        super(str);
        if (str != null) {
            str.toLowerCase(Locale.US);
        }
    }
}
