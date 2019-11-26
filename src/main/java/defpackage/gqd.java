package defpackage;

import java.util.ArrayList;

/* renamed from: gqd */
final class gqd implements afsw {
    public boolean a;
    public gqg b;
    public gqg c;
    public gqg d;
    public gqg e;
    private final String f;
    private final String g;
    private final /* synthetic */ gqc h;

    gqd(gqc gqc, String str, String str2) {
        this.h = gqc;
        this.f = str;
        this.g = str2;
    }

    public final void a(bqn bqn) {
        gqf gqf = this.h.b;
        String str = this.f;
        ArrayList a = gqf.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ((gqi) a.get(i)).c(str);
        }
    }
}
