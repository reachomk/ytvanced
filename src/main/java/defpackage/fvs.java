package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.FancyDismissibleDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiMessageConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.NotificationReminderDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import java.util.Map;

/* renamed from: fvs */
public final class fvs implements aaap {
    private final Context a;
    private final aaas b;
    private final yan c;
    private final nt d;

    public fvs(Context context, aaas aaas, yan yan, nt ntVar) {
        this.a = context;
        this.b = aaas;
        this.c = yan;
        this.d = ntVar;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        if ((((OpenDialogCommandOuterClass$OpenDialogCommand) obj).a & 1) != 0) {
            access$000 = anxl.checkIsLite(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            anxp anxp = ((OpenDialogCommandOuterClass$OpenDialogCommand) obj).b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(NotificationReminderDialogRendererOuterClass.notificationReminderDialogRenderer);
            anxp.a(access$0002);
            if (anxp.h.a(access$0002.d)) {
                this.c.a(apxu, map);
            } else {
                anxr access$0003 = anxl.checkIsLite(FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer);
                anxp.a(access$0003);
                if (anxp.h.a(access$0003.d)) {
                    Object obj2;
                    Context context = this.a;
                    anxr access$0004 = anxl.checkIsLite(FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer);
                    anxp.a(access$0004);
                    obj = anxp.h.b(access$0004.d);
                    if (obj == null) {
                        obj2 = access$0004.b;
                    } else {
                        obj2 = access$0004.a(obj);
                    }
                    akcr.a(context, (aril) obj2, this.b, null);
                    return;
                }
                access$0003 = anxl.checkIsLite(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                anxp.a(access$0003);
                if (anxp.h.a(access$0003.d)) {
                    String str = "MultiMessageConfirmDialogFragment";
                    nf nfVar = (acet) this.d.a(str);
                    if (nfVar == null) {
                        nfVar = new acet();
                    }
                    nt ntVar = this.d;
                    anxr access$0005 = anxl.checkIsLite(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                    anxp.a(access$0005);
                    obj = anxp.h.b(access$0005.d);
                    if (obj == null) {
                        obj = access$0005.b;
                    } else {
                        obj = access$0005.a(obj);
                    }
                    avdl avdl = (avdl) obj;
                    if (nfVar.F_()) {
                        nfVar.dismiss();
                    }
                    nfVar.ad = avdl;
                    nfVar.ae = map;
                    nfVar.a(ntVar, str);
                }
            }
        }
    }
}
