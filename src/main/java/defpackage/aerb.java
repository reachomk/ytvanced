package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayDeque;

/* renamed from: aerb */
final class aerb extends xto {
    private final /* synthetic */ aeqz a;

    aerb(aeqz aeqz, String str) {
        this.a = aeqz;
        super(str);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a() {
        aeqz aeqz = this.a;
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (aeqz.b()) {
                afil afil;
                String string = aeqz.b.getString("media_persisted_bandwidth_samples", "");
                if (TextUtils.isEmpty(string)) {
                    afil = null;
                } else {
                    afil = (afil) anxl.parseFrom(afil.b, Base64.decode(string, 10));
                }
                if (afil != null) {
                    arrayDeque.addAll(afil.a);
                }
            }
        } catch (anyg | ClassCastException | IllegalArgumentException e) {
            afpc.a(1, afpf.media, "Invalid persisted bandwidth samples. Ignored.", e);
        }
        return arrayDeque;
    }
}
