package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: amqf */
final class amqf extends ampx implements Serializable {
    public static final long serialVersionUID = 0;
    private final Pattern a;

    amqf(Pattern pattern) {
        this.a = (Pattern) amqw.a((Object) pattern);
    }

    public final ampy a(CharSequence charSequence) {
        return new amqi(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
