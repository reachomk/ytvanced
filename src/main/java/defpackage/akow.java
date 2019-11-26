package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: akow */
public class akow {
    private final List a = new ArrayList();
    private final List b = new ArrayList();

    public final void a(Class cls, bcaa bcaa) {
        this.a.add(cls);
        this.b.add(bcaa);
    }

    public final void a(Class cls, akox akox) {
        this.a.add(cls);
        this.b.add(akox);
    }

    public final void a(akpb akpb) {
        for (int i = 0; i < this.a.size(); i++) {
            Class cls = (Class) this.a.get(i);
            if (akpb.a((Object) cls) == -1) {
                Object obj = this.b.get(i);
                if (obj instanceof bcaa) {
                    akpb.a(cls, new akpa((bcaa) obj));
                } else {
                    akpb.a(cls, (akox) obj);
                }
            }
        }
    }
}
