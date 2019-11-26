package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abfz */
public final class abfz extends aaml {
    private final List a = new ArrayList();

    protected abfz(aamd aamd, afpt afpt) {
        super("playlist/get_add_to_playlist", aamd, afpt);
    }

    public final abfz c(String str) {
        this.a.add(str);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b(this.a.isEmpty() ^ TextUtils.isEmpty(null), (Object) "GetAddToPlaylistServiceRequest must have videoIds XOR playlistId");
    }

    public final /* synthetic */ anzd c() {
        atfi atfi = (atfi) atff.e.createBuilder();
        if (!this.a.isEmpty() && TextUtils.isEmpty(null)) {
            List list = this.a;
            atfi.copyOnWrite();
            atff atff = (atff) atfi.instance;
            if (!atff.c.a()) {
                atff.c = anxl.mutableCopy(atff.c);
            }
            anvf.addAll(list, atff.c);
        } else if (!TextUtils.isEmpty(null) && this.a.isEmpty()) {
            atfi.copyOnWrite();
            throw new NullPointerException();
        }
        atfi.copyOnWrite();
        atff atff2 = (atff) atfi.instance;
        atff2.a |= 4;
        atff2.d = false;
        return atfi;
    }
}
