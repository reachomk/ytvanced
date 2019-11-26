package defpackage;

import java.util.regex.Matcher;

/* renamed from: uez */
public final class uez implements uew {
    private final uey a = new uey();

    public final boolean a(CharSequence charSequence, ueu ueu) {
        String str = ueu.a;
        if (str.length() != 0) {
            Matcher matcher = this.a.a(str).matcher(charSequence);
            if (matcher.lookingAt()) {
                return matcher.matches();
            }
        }
        return false;
    }
}
