package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bbli */
public final class bbli {
    public static final bblf c;
    public final bblf a;
    public final ArrayList b = null;

    /* synthetic */ bbli(bblf bblf) {
        bbit.a((Object) bblf, (Object) "parent");
        this.a = bblf;
    }

    static {
        List emptyList = Collections.emptyList();
        if (emptyList.size() <= 32) {
            c = new bbkk(Collections.unmodifiableList(emptyList));
            return;
        }
        throw new IllegalStateException("Invalid size");
    }
}
