package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abfx */
public final class abfx extends aaml {
    public String a;
    public final List b = new ArrayList();
    public awnx c = awnx.PRIVATE;
    public String d;
    public String e;

    public abfx(aamd aamd, afpt afpt) {
        super("playlist/create", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = true;
        amqw.b(TextUtils.isEmpty(this.a) ^ 1, (Object) "CreatePlaylistServiceRequest must have a title");
        if (!(this.b.isEmpty() || TextUtils.isEmpty(this.d))) {
            z = false;
        }
        amqw.b(z, (Object) "CreatePlaylistServiceRequest can only have videoIds or sourcePlaylistId");
    }

    public final /* synthetic */ anzd c() {
        atfa atfa = (atfa) atex.h.createBuilder();
        String str = this.a;
        atfa.copyOnWrite();
        atex atex = (atex) atfa.instance;
        if (str != null) {
            atex.a |= 2;
            atex.c = str;
            if (!this.b.isEmpty() && TextUtils.isEmpty(this.d)) {
                List list = this.b;
                atfa.copyOnWrite();
                atex = (atex) atfa.instance;
                if (!atex.d.a()) {
                    atex.d = anxl.mutableCopy(atex.d);
                }
                anvf.addAll(list, atex.d);
            } else if (this.b.isEmpty() && !TextUtils.isEmpty(this.d)) {
                str = this.d;
                atfa.copyOnWrite();
                atex = (atex) atfa.instance;
                if (str != null) {
                    atex.a |= 4;
                    atex.e = str;
                } else {
                    throw new NullPointerException();
                }
            }
            awnx awnx = this.c;
            atfa.copyOnWrite();
            atex = (atex) atfa.instance;
            if (awnx != null) {
                atex.a |= 8;
                atex.f = awnx.d;
                str = this.e;
                if (str != null) {
                    atfa.copyOnWrite();
                    atex = (atex) atfa.instance;
                    atex.a |= 32;
                    atex.g = str;
                }
                return atfa;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
