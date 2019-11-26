package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: giy */
public final /* synthetic */ class giy implements Runnable {
    private final giw a;
    private final List b;

    public giy(giw giw, List list) {
        this.a = giw;
        this.b = list;
    }

    public final void run() {
        giw giw = this.a;
        for (String parse : this.b) {
            giw.a.a(Uri.parse(parse), giw.e);
        }
    }
}
