package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: fah */
public final class fah {
    public final CharSequence a;
    public final Collection b;

    public fah() {
        this("");
    }

    public fah(CharSequence charSequence) {
        this(charSequence, new ArrayList());
    }

    public fah(CharSequence charSequence, Collection collection) {
        this.a = charSequence;
        this.b = new ArrayList();
        this.b.addAll(collection);
    }
}
