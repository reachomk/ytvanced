package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.Map;

/* renamed from: afsj */
public final class afsj implements afsa {
    private final Context a;
    private final afqa b;

    public afsj(Context context, afmo afmo, afqa afqa) {
        this.a = (Context) amqw.a((Object) context);
        amqw.a((Object) afmo);
        this.b = (afqa) amqw.a((Object) afqa);
    }

    public final boolean b() {
        return false;
    }

    public final void a(Map map, afsl afsl) {
        amqw.b(xvt.c(afsl.D_()));
        if (afsl.bm_() != afpt.g) {
            afpt bm_ = afsl.bm_();
            afpz b = this.b.a(bm_).b(bm_);
            if (b.a()) {
                Pair d = b.d();
                map.put((String) d.first, (String) d.second);
            } else if (b.b()) {
                throw new bpx(b.e());
            } else {
                Exception f = b.f();
                if (f instanceof IOException) {
                    throw new bpx(this.a.getString(R.string.common_error_connection), f);
                }
                throw new bpx(f.getMessage());
            }
        }
    }

    public final aulc a() {
        return aulc.USER_AUTH;
    }
}
