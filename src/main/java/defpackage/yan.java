package defpackage;

import com.google.protos.youtube.api.innertube.NotificationReminderDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import java.util.Map;

/* renamed from: yan */
public final class yan implements aaap {
    private final yaq a;

    public yan(yaq yaq) {
        this.a = yaq;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            OpenDialogCommandOuterClass$OpenDialogCommand openDialogCommandOuterClass$OpenDialogCommand = (OpenDialogCommandOuterClass$OpenDialogCommand) b;
            anxp anxp = openDialogCommandOuterClass$OpenDialogCommand.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(NotificationReminderDialogRendererOuterClass.notificationReminderDialogRenderer);
            anxp.a(access$0002);
            if (anxp.h.a(access$0002.d)) {
                yaq yaq = this.a;
                anxp anxp2 = openDialogCommandOuterClass$OpenDialogCommand.b;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                access$0002 = anxl.checkIsLite(NotificationReminderDialogRendererOuterClass.notificationReminderDialogRenderer);
                anxp2.a(access$0002);
                b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                yaq.a((avll) b);
            }
        }
    }
}
