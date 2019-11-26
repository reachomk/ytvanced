package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jcm */
public final class jcm {
    public final jcl a;
    public final List b = new ArrayList();
    public final jcp c;
    public String d;
    public boolean e;

    public jcm(jcl jcl, Context context) {
        amqw.a((Object) jcl);
        this.a = jcl;
        this.c = new jcp(context, this.b);
        this.d = "";
        this.e = false;
    }

    public final void a() {
        this.e = true;
        this.c.a = this.d;
    }

    public final void a(String str) {
        if (!this.e) {
            this.d = str;
        }
    }

    public final void a(boolean z) {
        this.b.add(new jcq(this, z));
        this.c.notifyDataSetChanged();
    }
}
