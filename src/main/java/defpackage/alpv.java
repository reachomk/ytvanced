package defpackage;

import android.content.pm.ResolveInfo;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;

/* renamed from: alpv */
public final class alpv {
    public static axif a(axif axif, ResolveInfo resolveInfo) {
        anxp anxp = axif.e;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint);
        anxp.a(access$000);
        if (!anxp.h.a(access$000.d)) {
            return axif;
        }
        anxl anxl;
        axii axii = (axii) ((anxo) axif.toBuilder());
        apxu a = axii.a();
        access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint);
        a.a(access$000);
        Object b = a.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        axfk axfk = (axfk) ((anxo) ((SendShareEndpoint$SendShareExternallyEndpoint) b).toBuilder());
        String str = resolveInfo.activityInfo.applicationInfo.packageName;
        String str2 = resolveInfo.activityInfo.name;
        aset aset = (aset) ((anxo) axfk.a().toBuilder());
        if (aset != null) {
            aseq aseq = (aseq) aset.instance;
            if ((aseq.a & 1) != 0) {
                anxl = aseq.b;
                if (anxl == null) {
                    anxl = axhs.e;
                }
                axhu axhu = (axhu) ((anxo) anxl.toBuilder());
                axhu.copyOnWrite();
                axhs axhs = (axhs) axhu.instance;
                if (str != null) {
                    axhs.a |= 2;
                    axhs.c = str;
                    axhu.copyOnWrite();
                    axhs = (axhs) axhu.instance;
                    if (str2 != null) {
                        axhs.a |= 4;
                        axhs.d = str2;
                        aset.copyOnWrite();
                        aseq aseq2 = (aseq) aset.instance;
                        aseq2.b = (axhs) ((anxl) axhu.build());
                        aseq2.a |= 1;
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
        }
        axfk.a(aset);
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint) axfk.instance;
        if ((sendShareEndpoint$SendShareExternallyEndpoint.a & 4) != 0) {
            aseo aseo = sendShareEndpoint$SendShareExternallyEndpoint.d;
            if (aseo == null) {
                aseo = aseo.i;
            }
            if ((aseo.a & 2) != 0) {
                anxp anxp2 = aseo.c;
                if (anxp2 == null) {
                    anxp2 = apxu.d;
                }
                anxr access$0002 = anxl.checkIsLite(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
                anxp2.a(access$0002);
                if (anxp2.h.a(access$0002.d)) {
                    anxl = aseo.c;
                    if (anxl == null) {
                        anxl = apxu.d;
                    }
                    apxx apxx = (apxx) ((anxo) anxl.toBuilder());
                    aoqq aoqq = (aoqq) ((anxo) ((aoqo) apxx.b(AndroidApplicationEndpointOuterClass.androidAppEndpoint)).toBuilder());
                    aoqq.a(str);
                    aoqq.b(str2);
                    aser aser = (aser) ((anxo) aseo.toBuilder());
                    apxx.a(AndroidApplicationEndpointOuterClass.androidAppEndpoint, (aoqo) ((anxl) aoqq.build()));
                    aser.copyOnWrite();
                    aseo aseo2 = (aseo) aser.instance;
                    aseo2.c = (apxu) ((anxl) apxx.build());
                    aseo2.a |= 2;
                    aseo2 = (aseo) ((anxl) aser.build());
                    axfk.copyOnWrite();
                    SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint) axfk.instance;
                    if (aseo2 != null) {
                        sendShareEndpoint$SendShareExternallyEndpoint2.d = aseo2;
                        sendShareEndpoint$SendShareExternallyEndpoint2.a |= 4;
                    } else {
                        throw new NullPointerException();
                    }
                }
            }
        }
        apxx apxx2 = (apxx) ((anxo) axii.a().toBuilder());
        apxx2.a(SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint, (SendShareEndpoint$SendShareExternallyEndpoint) ((anxl) axfk.build()));
        axii.copyOnWrite();
        axif axif2 = (axif) axii.instance;
        axif2.e = (apxu) ((anxl) apxx2.build());
        axif2.a |= 16;
        return (axif) ((anxl) axii.build());
    }
}
