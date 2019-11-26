package defpackage;

import com.google.mediapipe.framework.PacketCreator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: znz */
final class znz implements znq {
    private final /* synthetic */ znv a;

    znz(znv znv) {
        this.a = znv;
    }

    public final byte[] a() {
        return this.a.c;
    }

    public final Map a(PacketCreator packetCreator) {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_base", packetCreator.a(this.a.a.b()));
        return hashMap;
    }

    public final boolean a(ayzc ayzc) {
        return this.a.a(ayzc);
    }
}
