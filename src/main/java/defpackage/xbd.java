package defpackage;

import java.io.File;
import java.nio.charset.Charset;

/* renamed from: xbd */
final /* synthetic */ class xbd implements xbc {
    public static final xbc a = new xbd();

    private xbd() {
    }

    public final String a(File file) {
        return new String(anbk.a(file).b(), Charset.defaultCharset());
    }
}
