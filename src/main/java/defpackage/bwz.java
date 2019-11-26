package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bwz */
final class bwz {
    public final Map a = new HashMap();
    public final bxb b = new bxb();

    bwz() {
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        bxc bxc;
        synchronized (this) {
            bxc = (bxc) chw.a((bxc) this.a.get(str));
            int i = bxc.b;
            if (i > 0) {
                i--;
                bxc.b = i;
                if (i == 0) {
                    bxc bxc2 = (bxc) this.a.remove(str);
                    if (bxc2.equals(bxc)) {
                        bxb bxb = this.b;
                        synchronized (bxb.a) {
                            if (bxb.a.size() < 10) {
                                bxb.a.offer(bxc2);
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(bxc);
                        String valueOf2 = String.valueOf(bxc2);
                        StringBuilder stringBuilder = new StringBuilder(((valueOf.length() + 79) + valueOf2.length()) + String.valueOf(str).length());
                        stringBuilder.append("Removed the wrong lock, expected to remove: ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(", but actually removed: ");
                        stringBuilder.append(valueOf2);
                        stringBuilder.append(", safeKey: ");
                        stringBuilder.append(str);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 81);
                stringBuilder2.append("Cannot release a lock that is not held, safeKey: ");
                stringBuilder2.append(str);
                stringBuilder2.append(", interestedThreads: ");
                stringBuilder2.append(i);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        bxc.a.unlock();
    }
}
