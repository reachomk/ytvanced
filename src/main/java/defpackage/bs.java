package defpackage;

import java.io.InvalidObjectException;
import java.text.Format.Field;

/* renamed from: bs */
public final class bs extends Field {
    public static final bs a = new bs("message argument field");
    public static final long serialVersionUID = 7510380454602616157L;

    private bs(String str) {
        super(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object readResolve() {
        if (getClass() != bs.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        } else if (getName().equals(a.getName())) {
            return a;
        } else {
            throw new InvalidObjectException("Unknown attribute name.");
        }
    }
}
