package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: aifd */
public final class aifd implements aifc {
    private final List a;

    public aifd(aifc... aifcArr) {
        this.a = Arrays.asList(aifcArr);
    }

    public final void a(aiff aiff) {
        for (aifc a : this.a) {
            a.a(aiff);
        }
    }

    public final void b_(boolean z) {
        for (aifc b_ : this.a) {
            b_.b_(z);
        }
    }

    public final void b(boolean z) {
        for (aifc b : this.a) {
            b.b(z);
        }
    }
}
