package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: algf */
public final class algf extends aktw implements alfd, algm {
    private final Context a;
    private final akpk b = new akpk();
    private final Set c = new HashSet();
    private final aylm d;

    algf(Context context, aylm aylm) {
        this.a = (Context) amqw.a((Object) context);
        this.d = aylm;
        this.b.add(aylm);
    }

    public final void a(aqhy aqhy, bcaa bcaa) {
    }

    public final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            algf algf = list.get(i);
            if (algf != this && (algf instanceof almu)) {
                this.c.add((almu) algf);
            }
        }
    }

    public final void a(akpb akpb) {
        akpb.a(aylm.class, new alnq(this.a));
    }

    public final aknh a() {
        return this.b;
    }

    public final void a(apxu apxu, CharSequence charSequence, arwf arwf, int i, Long l) {
        if (i <= 0) {
            if (this.b.isEmpty()) {
                this.b.add(this.d);
            }
            return;
        }
        this.b.clear();
    }
}
