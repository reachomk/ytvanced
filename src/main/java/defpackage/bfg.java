package defpackage;

import java.nio.charset.Charset;

/* renamed from: bfg */
final class bfg extends ThreadLocal {
    bfg() {
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object initialValue() {
        return Charset.forName("UTF-8");
    }
}
