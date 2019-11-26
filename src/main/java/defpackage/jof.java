package defpackage;

import android.content.Context;
import android.view.View;
import com.google.protos.youtube.api.innertube.AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint;
import com.google.protos.youtube.api.innertube.RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;

/* renamed from: jof */
public final class jof extends akxn implements xcp {
    private auvn e;

    public jof(Context context, xci xci, aaas aaas, akvz akvz, akoe akoe) {
        this(context, xci, aaas, akvz, akoe, null, null, null);
    }

    public jof(Context context, xci xci, aaas aaas, akvz akvz, akoe akoe, aafa aafa, aafd aafd, akwo akwo) {
        super(context, aaas, akvz, akoe, aafa, aafd, akwo);
        xci xci2 = xci;
        xci.a((Object) this);
    }

    public final void a(auvn auvn, View view, Object obj, acvx acvx) {
        super.a(auvn, view, obj, acvx);
        this.e = auvn;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        int i2 = 0;
        if (i == -1) {
            return new Class[]{gzx.class};
        } else if (i == 0) {
            auvp auvp = ((gzx) obj).a.c;
            if (auvp == null) {
                return null;
            }
            anxp anxp = auvp.e;
            if (anxp == null) {
                anxp = apxu.d;
            }
            if ((auvp.a & 8) == 0 || this.e == null) {
                return null;
            }
            anxr access$000 = anxl.checkIsLite(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint);
            anxp.a(access$000);
            if (!anxp.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint);
                anxp.a(access$000);
                if (!anxp.h.a(access$000.d)) {
                    return null;
                }
            }
            auvn auvn = this.e;
            anxp anxp2 = auvp.e;
            if (anxp2 == null) {
                anxp2 = apxu.d;
            }
            auvq auvq = (auvq) ((anxo) auvn.toBuilder());
            while (i2 < auvn.b.size()) {
                if ((((auvj) auvn.b.get(i2)).a & 2) != 0) {
                    auvm auvm;
                    auvp auvp2 = ((auvj) auvn.b.get(i2)).c;
                    if (auvp2 == null) {
                        auvp2 = auvp.h;
                    }
                    anxp anxp3 = auvp2.e;
                    if (anxp3 == null) {
                        anxp3 = apxu.d;
                    }
                    anxr access$0002 = anxl.checkIsLite(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint);
                    anxp2.a(access$0002);
                    if (anxp2.h.a(access$0002.d)) {
                        access$0002 = anxl.checkIsLite(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint);
                        anxp3.a(access$0002);
                        if (anxp3.h.a(access$0002.d)) {
                            auvm = (auvm) auvj.j.createBuilder();
                            auvm.a(auvp);
                            auvq.a(i2, auvm);
                        }
                    }
                    access$0002 = anxl.checkIsLite(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint);
                    anxp2.a(access$0002);
                    if (anxp2.h.a(access$0002.d)) {
                        access$0002 = anxl.checkIsLite(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint);
                        anxp3.a(access$0002);
                        if (anxp3.h.a(access$0002.d)) {
                            auvm = (auvm) auvj.j.createBuilder();
                            auvm.a(auvp);
                            auvq.a(i2, auvm);
                        }
                    }
                }
                i2++;
            }
            this.e = (auvn) ((anxl) auvq.build());
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
