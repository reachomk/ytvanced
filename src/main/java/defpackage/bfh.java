package defpackage;

import java.nio.charset.Charset;

/* renamed from: bfh */
final class bfh extends ThreadLocal {
    bfh() {
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object initialValue() {
        return Charset.forName("UTF-8").newDecoder();
    }
}
