package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bbp */
public final class bbp {
    public final ban a;
    public final List b = new ArrayList();
    public bax c;
    private final bav d;

    bbp(ban ban) {
        this.a = ban;
        this.d = ban.b;
    }

    public final String a() {
        return this.d.a();
    }

    public final ComponentName b() {
        return this.d.a;
    }

    /* Access modifiers changed, original: final */
    public final bbs a(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((bbs) this.b.get(i)).b.equals(str)) {
                return (bbs) this.b.get(i);
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouter.RouteProviderInfo{ packageName=");
        stringBuilder.append(a());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
