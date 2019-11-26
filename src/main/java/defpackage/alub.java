package defpackage;

import java.io.File;

/* renamed from: alub */
public final /* synthetic */ class alub implements amro {
    private final altr a;

    public alub(altr altr) {
        this.a = altr;
    }

    public final Object get() {
        File file = new File(this.a.a);
        if (file.exists() && file.canRead()) {
            return amul.a(file.listFiles(altu.a));
        }
        return amul.g();
    }
}
