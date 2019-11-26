package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: aevz */
public abstract class aevz extends nsr {
    public aevz() {
        super((byte) 0);
    }

    public abstract void a(afhr afhr);

    public abstract void b(afhr afhr);

    /* Access modifiers changed, original: protected|final */
    public final void a(nwz nwz) {
        int i;
        nwz.c(12);
        String r = nwz.r();
        nwz.r();
        nwz.h();
        nwz.h();
        nwz.h();
        nwz.h();
        HashMap hashMap = new HashMap();
        CharSequence q = nwz.q();
        while (true) {
            i = 0;
            if (TextUtils.isEmpty(q)) {
                break;
            }
            String[] split = q.split(": ");
            if (split.length >= 2) {
                hashMap.put(split[0], split[1]);
            }
            q = nwz.q();
        }
        afhr afhr = new afhr(hashMap);
        if (!(r.hashCode() == -415751771 && r.equals("http://youtube.com/streaming/metadata/segment/102015"))) {
            i = -1;
        }
        if (i != 0) {
            a(afhr);
        } else {
            b(afhr);
        }
    }
}
