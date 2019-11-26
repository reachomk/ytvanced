package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: agnr */
public final class agnr implements agnv {
    public final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public agnr(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.b = bcaa;
        this.c = bcaa2;
        this.d = bcaa3;
        this.a = bcaa4;
        this.e = bcaa5;
    }

    /* renamed from: a */
    public final agns b(Uri uri, int i) {
        Object path = uri.getPath();
        amqw.a(path, (Object) "Received URI with no path.");
        return new agns(new File(path), i, this.c, this.d);
    }
}
