package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
import java.util.Map;

/* renamed from: fyd */
public final class fyd implements aaap {
    private final nn a;

    public fyd(nn nnVar) {
        this.a = nnVar;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.showSponsorshipsDialogCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.showSponsorshipsDialogCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand = (ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand) b;
            anxp anxp = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.b;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$0002 = anxl.checkIsLite(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
            anxp.a(access$0002);
            if (anxp.h.a(access$0002.d)) {
                anvf anvf = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.b;
                if (anvf == null) {
                    anvf = apxu.d;
                }
                wuk wuk = new wuk();
                Bundle bundle = new Bundle();
                bundle.putByteArray("get_offers_command", anvf.toByteArray());
                wuk.f(bundle);
                wuk.a(this.a.f(), "sponsorships_offer_dialog");
            }
        }
    }
}
