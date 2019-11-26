package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
import java.util.List;

/* renamed from: acoj */
final class acoj implements acfg {
    private final /* synthetic */ acnc a;

    acoj(acnc acnc) {
        this.a = acnc;
    }

    public final void a(String str, String str2, avbq avbq, List list) {
        if (aclo.a(this.a)) {
            String.valueOf(str).length();
            String.valueOf(str2).length();
            acnc acnc = this.a;
            acnc.aH = str;
            acnc.aI = str2;
            acnc.aJ = avbq;
            if (list != null) {
                for (apxu apxu : list) {
                    anxr access$000 = anxl.checkIsLite(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.recordStreamEventsCommand);
                    apxu.a(access$000);
                    if (apxu.h.a(access$000.d)) {
                        anxr access$0002 = anxl.checkIsLite(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.recordStreamEventsCommand);
                        apxu.a(access$0002);
                        Object b = apxu.h.b(access$0002.d);
                        if (b != null) {
                            access$0002.a(b);
                        }
                        this.a.aj.c();
                    }
                }
            }
            acnc acnc2 = this.a;
            acnc2.ag.a(acnc2.aP, str, str2, avbq);
            this.a.a(avbq);
            acnc acnc3 = this.a;
            if (TextUtils.isEmpty(acnc3.aH) || TextUtils.isEmpty(acnc3.aI)) {
                xtl.c("Ingestion stream information was returned invalid");
                this.a.aa.c();
            } else {
                this.a.aa.f(2);
            }
        }
    }

    public final void a(int i) {
        if (aclo.a(this.a)) {
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("Create ingestion error: ");
            stringBuilder.append(i);
            xtl.c(stringBuilder.toString());
            if (i == 3 || i == 4 || i == 21 || i == 22) {
                this.a.aa.b(i);
            } else {
                this.a.aa.c();
            }
        }
    }
}
