package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: acup */
final class acup implements Runnable {
    private final /* synthetic */ bqn a;
    private final /* synthetic */ acuq b;

    acup(acuq acuq, bqn bqn) {
        this.b = acuq;
        this.a = bqn;
    }

    public final void run() {
        asnc asnc = (asnc) this.b.a.c();
        ArrayList arrayList = new ArrayList();
        for (njz c : this.b.b) {
            asmz asmz = (asmz) asmw.f.createBuilder();
            try {
                asmz.mergeFrom(c.c(), anxa.c());
                acul acul = this.b.f.b;
                if (!acul.d.contains(asmy.a(((asmw) asmz.instance).b))) {
                    arrayList.add((asmw) ((anxl) asmz.build()));
                }
            } catch (anyg unused) {
                xtl.a("GEL_DELAYED_EVENT_DEBUG", String.valueOf(getClass().getCanonicalName()).concat(" could not deserialize ClientEvent when retryOnError."));
            }
        }
        if (!arrayList.isEmpty()) {
            asnc.copyOnWrite();
            ((asnd) asnc.instance).e = anxl.emptyProtobufList();
            asnc.a(arrayList);
            acun acun = this.b.f;
            asnd asnd = (asnd) ((anxl) asnc.build());
            acuq acuq = this.b;
            String str = acuq.c;
            afot afot = acuq.d;
            String str2 = afot.a;
            boolean z = afot.b;
            njz njz = null;
            if (!(TextUtils.isEmpty(str) || asnd == null)) {
                njz = (njz) nka.l.createBuilder();
                njz.a(asnd.toByteString());
                njz.a("event_logging_fixed_batch_retry");
                njz.b(str);
                if (!TextUtils.isEmpty(str2)) {
                    njz.c(str2);
                }
                njz.a(z);
            }
            if (njz != null) {
                acun acun2 = this.b.f;
                acun2.c.a(acun2.b(), new ArrayList(Arrays.asList(new njz[]{njz})), this.a);
            }
        }
    }
}
