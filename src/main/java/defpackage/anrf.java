package defpackage;

import java.nio.charset.Charset;

/* renamed from: anrf */
final class anrf extends ThreadLocal {
    anrf() {
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object initialValue() {
        return Charset.forName("UTF-8");
    }
}
