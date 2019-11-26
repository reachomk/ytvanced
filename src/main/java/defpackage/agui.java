package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: agui */
public final class agui extends aguj {
    public List a = new ArrayList();
    public int b = 1;

    public agui(aguk aguk, aguw aguw, xsc xsc, SharedPreferences sharedPreferences, zzl zzl, agej agej, xci xci) {
        super(aguk, aguw, xsc, sharedPreferences, zzl, agej, xci);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(atcy atcy, avqc avqc, agvz agvz, long j, agqw agqw) {
        avqb avqb = (avqb) ((anxo) avqc.toBuilder());
        int i = this.b;
        if (i != 1) {
            avqb.a(i);
        }
        if (this.a.size() != 0) {
            atda atda = (atda) ((anxo) atcy.toBuilder());
            atda.copyOnWrite();
            ((atcy) atda.instance).b = anxl.emptyIntList();
            List<avpb> list = this.a;
            atda.copyOnWrite();
            atcy atcy2 = (atcy) atda.instance;
            if (!atcy2.b.a()) {
                atcy2.b = anxl.mutableCopy(atcy2.b);
            }
            for (avpb avpb : list) {
                atcy2.b.d(avpb.c);
            }
            atcy = (atcy) ((anxl) atda.build());
        }
        super.a(atcy, (avqc) ((anxl) avqb.build()), agvz, j, agqw);
    }
}
